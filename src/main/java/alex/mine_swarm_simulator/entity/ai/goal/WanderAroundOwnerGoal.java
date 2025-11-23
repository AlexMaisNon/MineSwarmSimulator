package alex.mine_swarm_simulator.entity.ai.goal;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class WanderAroundOwnerGoal extends WanderAroundGoal {
	private final TameableEntity tameable;
	@Nullable protected LivingEntity owner;
	private long cooldown = 0L;

	public WanderAroundOwnerGoal(TameableEntity tameable, double speed) {
		super(tameable, speed);
		this.tameable = tameable;
	}

	protected boolean canGetTarget() {
		return this.owner != null && this.tameable.squaredDistanceTo(this.owner) < 36 && !this.tameable.getWorld().getBlockState(this.owner.getBlockPos()).isOf(ModBlocks.FLOWER_BLOCK);
	}

	@Nullable
	protected Vec3d createTarget() {
		if(this.owner != null) {
			Random random = new Random();
			int xOffset = random.nextInt(-3, 4);
			double yOffset = random.nextInt(-2, 2) / 10d;
			int zOffset = random.nextInt(-3, 4);

			return this.owner.getBlockPos().toCenterPos().add(xOffset, yOffset, zOffset);
		}
		return null;
	}

	@Nullable
	@Override
	protected Vec3d getWanderTarget() {
		this.owner = this.tameable.getOwner();
		if(this.owner != null && this.canGetTarget()) {
			return this.createTarget();
		}
		return null;
	}

	@Override
	public boolean canStart() {
		if (this.mob.hasControllingPassenger()) {
			return false;
		} else {
			Vec3d vec3d = this.getWanderTarget();
			if (vec3d == null || this.cooldown - this.tameable.getWorld().getTime() > 0f) {
				return false;
			} else {
				this.targetX = vec3d.x;
				this.targetY = vec3d.y;
				this.targetZ = vec3d.z;

				return true;
			}
		}
	}

	@Override
	public boolean shouldContinue() {
		return super.shouldContinue() && !this.tameable.getWorld().getBlockState(this.owner.getBlockPos()).isOf(ModBlocks.FLOWER_BLOCK);
	}

	@Override
	public void stop() {
		super.stop();
		if(!this.tameable.getWorld().getBlockState(this.owner.getBlockPos()).isOf(ModBlocks.FLOWER_BLOCK)) {
			this.cooldown = this.tameable.getWorld().getTime() + new Random().nextInt(49, 55);
		}
	}
}
