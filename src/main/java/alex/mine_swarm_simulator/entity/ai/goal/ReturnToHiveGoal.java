package alex.mine_swarm_simulator.entity.ai.goal;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.entity.BeeEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class ReturnToHiveGoal extends Goal {
	private final BeeEntity bee;
	@Nullable private LivingEntity owner;
	@Nullable private BlockPos hivePos;

	private boolean ownerDied = false;
	private boolean resetEnergy = false;
	private long cooldown = 0L;

	public ReturnToHiveGoal(BeeEntity beeEntity) {
		this.bee = beeEntity;
		this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
	}

	@Override
	public boolean canStart() {
		this.owner = this.bee.getOwner();
		this.hivePos = this.bee.getHivePos();

		boolean start = this.owner != null && this.hivePos != null;

		if(start) {
			this.ownerDied = this.owner.isDead();
			this.resetEnergy = this.bee.getEnergy() <= 0;

			start = this.ownerDied || this.resetEnergy;
		}

		return start;
	}

	@Override
	public boolean shouldContinue() {
		if(this.bee.getNavigation().isIdle() && this.cooldown == 0) {
			this.cooldown = this.bee.getWorld().getTime() + 300;
		}
		return (this.ownerDied || this.resetEnergy) && (this.cooldown - this.bee.getWorld().getTime() > 0 || this.cooldown == 0);
	}

	@Override
	public void start() {
		this.bee.getNavigation().startMovingTo(this.hivePos.getX(), this.hivePos.getY(), this.hivePos.getZ(), 1);
	}

	@Override
	public void stop() {
		this.bee.getNavigation().stop();
		this.cooldown = 0L;
		this.ownerDied = false;

		if(this.resetEnergy) {
			this.bee.setEnergy(this.bee.getBeeType().getEnergy() * (1f + 0.05f * (this.bee.getLevel() - 1f)) * (float)this.owner.getAttributeValue(ModAttributes.PLAYER_MAX_BEE_ENERGY));
		}

		this.resetEnergy = false;
	}

	@Override
	public void tick() {
		if(this.cooldown > 0) {
			this.bee.getLookControl().lookAt(this.bee.getX(), this.bee.getY() + 1, this.bee.getZ());
		}
	}
}
