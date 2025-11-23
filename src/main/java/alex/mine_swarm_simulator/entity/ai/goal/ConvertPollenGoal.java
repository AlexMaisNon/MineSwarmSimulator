package alex.mine_swarm_simulator.entity.ai.goal;

import alex.mine_swarm_simulator.entity.BeeEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class ConvertPollenGoal extends Goal {
	private final BeeEntity bee;
	private final double speed;

	@Nullable private LivingEntity owner;
	@Nullable private BlockPos hivePos;
	private long cooldown = 0L;

	public ConvertPollenGoal(BeeEntity bee, double speed) {
		this.bee = bee;
		this.speed = speed;
	}

	@Override
	public boolean canStart() {
		return false;
	}
}
