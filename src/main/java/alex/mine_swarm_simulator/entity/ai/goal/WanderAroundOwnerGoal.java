package alex.mine_swarm_simulator.entity.ai.goal;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class WanderAroundOwnerGoal extends WanderAroundGoal {
	private final TameableEntity tameable;
	private LivingEntity owner;
	private long cooldown = 0L;

	public WanderAroundOwnerGoal(TameableEntity tameable, double speed) {
		super(tameable, speed);
		this.tameable = tameable;
	}

	@Nullable
	@Override
	protected Vec3d getWanderTarget() {
		if(this.tameable.getOwner() != null) {
			this.owner = this.tameable.getOwner();

			// 6 "squared" blocks = 36
			if(this.tameable.squaredDistanceTo(this.owner) < 36f) {
				Random random = new Random();
				int xOffset = random.nextInt(-3, 4);
				int zOffset = random.nextInt(-3, 4);

				return this.owner.getBlockPos().add(xOffset, 0, zOffset).toCenterPos();
			}
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
		boolean should = super.shouldContinue();
		if(!should) {
			this.cooldown = this.tameable.getWorld().getTime() + new Random().nextInt(60, 70);
		}
		return should;
	}
}
