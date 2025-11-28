package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BubbleWandItem extends CollectToolItem {
	public BubbleWandItem() {
		super(10, 0.8f, 6, new BlockPos[]{
			new BlockPos(-1, 0, -3), new BlockPos(0, 0, -3), new BlockPos(1, 0, -3),
			new BlockPos(-2, 0, -2), new BlockPos(2, 0, -2),
			new BlockPos(-3, 0, -1), new BlockPos(3, 0, -1),
			new BlockPos(-3, 0, 0), new BlockPos(3, 0, 0),
			new BlockPos(-3, 0, 1), new BlockPos(3, 0, 1),
			new BlockPos(-2, 0, 2), new BlockPos(2, 0, 2),
			new BlockPos(-1, 0, 3), new BlockPos(0, 0, 3), new BlockPos(1, 0, 3)
		}, false, "item.mine_swarm_simulator.bubble_wand.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner, boolean isFull) {
		int amount = 0;
		if(!isFull) {
			for(BlockPos blockPos : this.getPattern()) {
				// Apply modifications to each flower block
				if(world.getBlockEntity(blockPos.add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity flowerBlockEntity) {
					if(world.getBlockState(flowerBlockEntity.getPos()).get(FlowerBlock.COLOR) != 2) {
						amount += flowerBlockEntity.collectPollen(this.getBaseCollection(), miner);
					} else {
						// x2 blue pollen
						amount += flowerBlockEntity.collectPollen(this.getBaseCollection() * 2, miner);
					}
				}
			}

			ItemStack currentItem = miner.getMainHandStack();
			if(currentItem.getDamage() <= 1) {
				currentItem.setDamage(currentItem.getMaxDamage());
			} else {
				currentItem.setDamage(currentItem.getDamage() - 1);
			}
		}
		miner.getItemCooldownManager().set(this, this.getCooldownTime());
		return amount;
	}
}
