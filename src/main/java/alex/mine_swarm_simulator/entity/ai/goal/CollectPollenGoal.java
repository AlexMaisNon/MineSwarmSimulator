package alex.mine_swarm_simulator.entity.ai.goal;

import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.util.PlayerUtils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectPollenGoal extends WanderAroundOwnerGoal {
	private final BeeEntity bee;
	private long cooldown = 0L;

	private final Random random = new Random();

	public CollectPollenGoal(BeeEntity bee, double speed) {
		super(bee, speed);
		this.bee = bee;
	}

	@Override
	protected boolean canGetTarget() {
		return this.owner instanceof PlayerEntity player && this.bee.getWorld().getBlockState(this.owner.getBlockPos()).isOf(ModBlocks.FLOWER_BLOCK) && PlayerData.getPlayerPollen(player) < PlayerUtils.getPlayerCapacity(player);
	}

	@Nullable
	@Override
	protected Vec3d createTarget() {
		if(this.owner != null) {
			List<BlockPos> flowerPos = new ArrayList<>();
			// Replace ts with a DFS algorithm
			BlockPos.iterate(this.owner.getBlockPos().add(-8, 0, -8), this.owner.getBlockPos().add(8, 0, 8)).forEach(blockPos -> {
				if(this.bee.getWorld().getBlockEntity(blockPos) instanceof FlowerBlockEntity) {
					flowerPos.add(new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ()));
				}
			});
			return flowerPos.get(new Random().nextInt(0, flowerPos.size())).up().toCenterPos();
		}
		return null;
	}

	@Override
	public boolean canStart() {
		return super.canStart() && this.bee.getEnergy() > 0;
	}

	@Override
	public boolean shouldContinue() {
		if(this.bee.getEnergy() <= 0 || this.owner == null || (!this.bee.getNavigation().isIdle() && !this.bee.getWorld().getBlockState(this.owner.getBlockPos()).isOf(ModBlocks.FLOWER_BLOCK))) {
			return false;
		} else if(this.bee.getNavigation().isIdle() && this.cooldown == 0) {
			this.cooldown = this.bee.getWorld().getTime() + this.bee.getGatherSpeed();
		}
		return this.cooldown - this.bee.getWorld().getTime() > 0 || this.cooldown == 0;
	}

	@Override
	public void stop() {
		super.stop();
		BlockPos flowerPos = this.bee.getBlockPos().down();
		if(this.cooldown != 0 && this.bee.getWorld().getBlockEntity(flowerPos) instanceof FlowerBlockEntity flowerBlockEntity) {
			flowerBlockEntity.collectPollen(this.bee.getGatherAmount() * (this.bee.getWorld().getBlockState(flowerPos).get(FlowerBlock.COLOR) == this.bee.getBeeType().getColorId() ? 2f : 1f), this.bee);

			if(this.random.nextFloat() < 0.125) {
				double x = this.bee.getLevel() - 1d;
				long calculatedBond = Math.round(0.0011d * Math.pow(x, 4d) - 0.0428d * Math.pow(x, 3d) + 0.8d * Math.pow(x, 2d) + 1.25d * x + 1d);
				this.bee.addBond(calculatedBond);
			}
			this.bee.setEnergy(this.bee.getEnergy() - 1);
		}
		this.cooldown = 0L;
	}

	@Override
	public void tick() {
		if(this.cooldown > 0) {
			this.bee.getLookControl().lookAt(this.bee.getX(), this.bee.getY() - 1, this.bee.getZ(), this.bee.getMaxLookYawChange(), 50f);
		}
	}
}
