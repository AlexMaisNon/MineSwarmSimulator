package alex.mine_swarm_simulator.entity.ai.goal;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class WanderAroundOwnerGoal extends WanderAroundGoal {
	private final TameableEntity tameable;
	@Nullable private LivingEntity owner;
	private long cooldown = 0L;

	public WanderAroundOwnerGoal(TameableEntity tameable, double speed) {
		super(tameable, speed);
		this.tameable = tameable;
	}

	@Nullable
	@Override
	protected Vec3d getWanderTarget() {
		this.owner = this.tameable.getOwner();
		if(this.owner != null) {
			if(this.tameable.squaredDistanceTo(this.owner) < 36) {
				return this.owner.getBlockPos().toCenterPos();
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
				Random random = new Random();
				int xOffset = random.nextInt(-3, 4);
				int zOffset = random.nextInt(-3, 4);

				this.targetX = vec3d.x + xOffset;
				this.targetY = vec3d.y;
				this.targetZ = vec3d.z + zOffset;

				return true;
			}
		}
	}

	@Override
	public boolean shouldContinue() {
		boolean should = super.shouldContinue();
		if(!should) {
			this.cooldown = this.tameable.getWorld().getTime() + new Random().nextInt(49, 55);
		}
		return should;
	}
}
