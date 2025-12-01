package alex.mine_swarm_simulator.entity.ai.goal;

import alex.mine_swarm_simulator.block.entity.HivePlateBlockEntity;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.util.PlayerUtils;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class ConvertPollenGoal extends Goal {
	private final BeeEntity bee;
	private final double speed;

	@Nullable private PlayerEntity owner;
	@Nullable private BlockPos hivePos;

	private long amountConverted = 0L;
	private long cooldown = 0L;

	public ConvertPollenGoal(BeeEntity bee, double speed) {
		this.bee = bee;
		this.speed = speed;
		this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
	}

	@Override
	public boolean canStart() {
		if(this.bee.getOwner() instanceof PlayerEntity player) {
			this.owner = player;
			this.hivePos = this.bee.getHivePos();

			return PlayerUtils.getPlayerPollen(player) > 0 &&
				this.bee.getWorld().getBlockEntity(this.owner.getBlockPos()) instanceof HivePlateBlockEntity hivePlateBlockEntity &&
				hivePlateBlockEntity.getOwnerUUID().equals(this.owner.getUuid()) &&
				this.owner.isSneaking();
		}
		return false;
	}

	@Override
	public void start() {
		if(this.owner != null) {
			this.amountConverted = 0L;
			this.cooldown = 0L;
			this.bee.getNavigation().startMovingTo(this.owner.getX(), this.owner.getY(), this.owner.getZ(), this.speed);
		}
	}

	@Override
	public boolean shouldContinue() {
		return this.owner instanceof PlayerEntity player &&
			this.bee.getWorld().getBlockEntity(this.owner.getBlockPos()) instanceof HivePlateBlockEntity hivePlateBlockEntity &&
			hivePlateBlockEntity.getOwnerUUID().equals(this.owner.getUuid()) &&
			this.owner.isSneaking() &&
			(PlayerUtils.getPlayerPollen(player) > 0 || this.amountConverted > 0);
	}

	@Override
	public void stop() {
		this.bee.getNavigation().stop();
		if(this.owner instanceof PlayerEntity player) {
			PlayerData playerData = StateSaverAndLoader.getPlayerState(player);
			if(this.amountConverted > 0) {
				playerData.pollen += this.amountConverted;
			}
			this.amountConverted = 0L;
			this.cooldown = 0L;
		}
	}

	@Override
	public void tick() {
		if(this.owner instanceof PlayerEntity player && this.hivePos != null) {
			this.owner.sendMessage(Text.literal("Converting...").formatted(Formatting.GOLD), true);

			if(this.bee.getNavigation().isIdle()) {
				PlayerData playerData = StateSaverAndLoader.getPlayerState(player);
				int convertAmount = Math.round(this.bee.getConvertAmount());

				if(this.cooldown > 0) {
					if(this.cooldown - this.bee.getWorld().getTime() > 0) {
						this.bee.setBodyYaw(this.bee.getBodyYaw() + 50f);
					} else {
						playerData.honey += this.amountConverted;
						this.amountConverted = 0L;
						this.cooldown = 0L;
						this.bee.getNavigation().startMovingTo(this.owner.getX(), this.owner.getY(), this.owner.getZ(), this.speed);
					}
				} else {
					if(this.amountConverted > 0) {
						this.cooldown = this.bee.getWorld().getTime() + this.bee.getConvertSpeed();
					} else {
						this.amountConverted = playerData.pollen - convertAmount > 0 ? convertAmount : playerData.pollen;
						playerData.pollen -= this.amountConverted;
						this.bee.getNavigation().startMovingTo(this.hivePos.getX(), this.hivePos.getY(), this.hivePos.getZ(), this.speed);
					}
				}
			}
		}
	}
}
