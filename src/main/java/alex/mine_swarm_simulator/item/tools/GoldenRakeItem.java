package alex.mine_swarm_simulator.item.tools;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GoldenRakeItem extends CollectToolItem {
	public GoldenRakeItem() {
		super(5, 0.75f, 7, new BlockPos[]{
			new BlockPos(-3, 0, -4), new BlockPos(-1, 0, -4), new BlockPos(1, 0, -4), new BlockPos(3, 0, -4),
			new BlockPos(-3, 0, -3), new BlockPos(-1, 0, -3), new BlockPos(1, 0, -3), new BlockPos(3, 0, -3),
			new BlockPos(-3, 0, -2), new BlockPos(-1, 0, -2), new BlockPos(1, 0, -2), new BlockPos(3, 0, -2),
			new BlockPos(-3, 0, -1), new BlockPos(-1, 0, -1), new BlockPos(1, 0, -1), new BlockPos(3, 0, -1)
		}, true, "item.mine_swarm_simulator.golden_rake.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			// put 5th thing logic here

			ItemStack currentItem = miner.getMainHandStack();
			if(currentItem.getDamage() <= 1) {
				currentItem.setDamage(currentItem.getMaxDamage());
			} else {
				currentItem.setDamage(currentItem.getDamage() - 1);
			}
		}
		return super.collect(world, pos, miner);
	}
}
