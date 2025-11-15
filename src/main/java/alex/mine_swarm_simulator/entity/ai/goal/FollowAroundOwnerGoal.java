package alex.mine_swarm_simulator.entity.ai.goal;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class FollowAroundOwnerGoal extends FollowOwnerGoal {
	private final TameableEntity tameable;
	private LivingEntity owner;
	private final double speed;
	private final float minDistance;

	private final EntityNavigation navigation;
	private int updateCountdownTicks;

	private final Random random;
	private int xOffset = 0;
	private int zOffset = 0;

	public FollowAroundOwnerGoal(TameableEntity tameable, double speed, float minDistance, float maxDistance) {
		super(tameable, speed, minDistance, maxDistance);
		this.tameable = tameable;
		this.navigation = tameable.getNavigation();
		this.speed = speed;
		this.minDistance = minDistance;

		this.random = new Random();
		this.xOffset = random.nextInt(-3, 4);
		this.zOffset = random.nextInt(-3, 4);
	}

	@Override
	public boolean canStart() {
		boolean res = super.canStart();
		if(res) {
			this.owner = tameable.getOwner();
		} else {
			this.xOffset = random.nextInt(-3, 4);
			this.zOffset = random.nextInt(-3, 4);
		}
		return res;
	}

	@Override
	public void start() {
		super.start();
		this.updateCountdownTicks = 0;
	}

	@Override
	public void tick() {
		BlockPos ownerPos = this.owner.getBlockPos().add(this.xOffset, 0, this.zOffset);

		if (--this.updateCountdownTicks <= 0) {
			this.updateCountdownTicks = this.getTickCount(10);
			this.navigation.startMovingTo(ownerPos.getX(), ownerPos.getY(), ownerPos.getZ(), this.speed);
		}
	}
}
