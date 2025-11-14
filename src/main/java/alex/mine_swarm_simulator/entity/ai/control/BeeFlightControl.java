package alex.mine_swarm_simulator.entity.ai.control;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.MathHelper;

public class BeeFlightControl extends MoveControl {
	public BeeFlightControl(MobEntity entity) {
		super(entity);
	}

	@Override
	public void tick() {
		this.entity.setNoGravity(true);
		if (this.state == MoveControl.State.MOVE_TO) {
			this.state = MoveControl.State.WAIT;

			double dX = this.targetX - this.entity.getX();
			double dY = this.targetY - this.entity.getY();
			double dZ = this.targetZ - this.entity.getZ();

			double dist = Math.sqrt(dX * dX + dY * dY + dZ * dZ);

			float speed = (float)(this.speed * this.entity.getAttributeValue(EntityAttributes.GENERIC_FLYING_SPEED));

			float h = (float)(MathHelper.atan2(dZ, dX) * 180.0F / (float)Math.PI) - 90.0F;
			this.entity.setYaw(this.wrapDegrees(this.entity.getYaw(), h, 360.0F));

			this.entity.setPosition(
				Math.abs(dX) > speed ? this.entity.getX() + speed * dX / dist : this.entity.getX() + dX,
				Math.abs(dY) > speed ? this.entity.getY() + speed * dY / dist : this.entity.getY() + dY,
				Math.abs(dZ) > speed ? this.entity.getZ() + speed * dZ / dist : this.entity.getZ() + dZ
			);
		}
	}
}
