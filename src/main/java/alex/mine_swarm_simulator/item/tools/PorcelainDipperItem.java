package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PorcelainDipperItem extends CollectToolItem {
	public PorcelainDipperItem() {
		super(10, 0.7f, 3, new BlockPos[]{
			new BlockPos(0, 0, -4),
			new BlockPos(-2, 0, -3), new BlockPos(-1, 0, -3), new BlockPos(0, 0, -3), new BlockPos(1, 0, -3), new BlockPos(2, 0, -3),
			new BlockPos(-3, 0, -2), new BlockPos(-2, 0, -2), new BlockPos(-1, 0, -2), new BlockPos(0, 0, -2), new BlockPos(1, 0, -2), new BlockPos(2, 0, -2), new BlockPos(3, 0, -2),
			new BlockPos(-3, 0, -1), new BlockPos(-2, 0, -1), new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1), new BlockPos(2, 0, -1), new BlockPos(3, 0, -1),
			new BlockPos(-4, 0, 0), new BlockPos(-3, 0, 0), new BlockPos(-2, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0), new BlockPos(2, 0, 0), new BlockPos(3, 0, 0), new BlockPos(4, 0, 0),
			new BlockPos(-3, 0, 1), new BlockPos(-2, 0, 1), new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1), new BlockPos(2, 0, 1), new BlockPos(3, 0, 1),
			new BlockPos(-3, 0, 2), new BlockPos(-2, 0, 2), new BlockPos(-1, 0, 2), new BlockPos(0, 0, 2), new BlockPos(1, 0, 2), new BlockPos(2, 0, 2), new BlockPos(3, 0, 2),
			new BlockPos(-2, 0, 3), new BlockPos(-1, 0, 3), new BlockPos(0, 0, 3), new BlockPos(1, 0, 3), new BlockPos(2, 0, 3),
			new BlockPos(0, 0, 4)
		}, false, "item.mine_swarm_simulator.porcelain_dipper.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			for(BlockPos blockPos : this.getPattern()) {
				// Apply modifications to each flower block
				if(world.getBlockEntity(blockPos.add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity flowerBlockEntity) {
					if(world.getBlockState(flowerBlockEntity.getPos()).get(FlowerBlock.COLOR) == 0) {
						// count x2 white pollen here
					}
					flowerBlockEntity.removePollen(this.getBaseCollection());
				}
			}
			miner.getItemCooldownManager().set(this, (int)(20 * this.getCollectSpeed()));

			ItemStack currentItem = miner.getMainHandStack();
			if(currentItem.getDamage() <= 1) {
				currentItem.setDamage(currentItem.getMaxDamage());
			} else {
				currentItem.setDamage(currentItem.getDamage() - 1);
			}
		}
		return 0;
	}
}
