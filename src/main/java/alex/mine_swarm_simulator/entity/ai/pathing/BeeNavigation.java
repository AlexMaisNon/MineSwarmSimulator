package alex.mine_swarm_simulator.entity.ai.pathing;

import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.server.network.DebugInfoSender;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BeeNavigation extends BirdNavigation {
	public BeeNavigation(MobEntity mobEntity, World world) {
		super(mobEntity, world);
	}

	@Override
	public void tick() {
		this.tickCount++;
		if (this.inRecalculationCooldown) {
			this.recalculatePath();
		}

		if (!this.isIdle() && this.currentPath != null) {
			DebugInfoSender.sendPathfindingData(this.world, this.entity, this.currentPath, this.nodeReachProximity);
			BlockPos blockPos = this.currentPath.getTarget();

			this.entity.getLookControl().lookAt(blockPos.getX() + 0.5f, blockPos.getY() + 0.9f, blockPos.getZ() + 0.5f, 10.0F, this.entity.getMaxLookPitchChange());
			this.entity.getMoveControl().moveTo(blockPos.getX() + 0.5f, blockPos.getY(), blockPos.getZ() + 0.5f, this.speed);

			if(this.entity.getBlockPos().equals(this.currentPath.getTarget())) {
				this.stop();
			}
		}
	}

	@Override
	protected boolean canPathDirectlyThrough(Vec3d origin, Vec3d target) {
		return true;
	}

	@Override
	public boolean canSwim() {
		return false;
	}

	@Override
	public boolean canEnterOpenDoors() {
		return true;
	}
}
