package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ScytheItem extends CollectToolItem {
	public ScytheItem() {
		super(20, 0.47f, 7, new BlockPos[]{
			new BlockPos(0, 0, -6),
			new BlockPos(0, 0, -5),
			new BlockPos(0, 0, -4),
			new BlockPos(0, 0, -3),
			new BlockPos(0, 0, -2),
			new BlockPos(0, 0, -1),
			new BlockPos(0, 0, 0)
		}, true, "item.mine_swarm_simulator.scythe.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			for(BlockPos blockPos : this.getPattern()) {
				// Calculate the rotation of the pattern
				BlockPos calculatedPos;
				if(miner.getYaw() <= 135 && miner.getYaw() >= 45) {
					calculatedPos = new BlockPos(blockPos.getZ(), blockPos.getY(), -blockPos.getX());
				} else if (miner.getYaw() <= 45 && miner.getYaw() >= -45) {
					calculatedPos = new BlockPos(-blockPos.getX(), blockPos.getY(), -blockPos.getZ());
				} else if (miner.getYaw() <= -45 && miner.getYaw() >= -135) {
					calculatedPos = new BlockPos(-blockPos.getZ(), blockPos.getY(), blockPos.getX());
				} else {
					calculatedPos = new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ());
				}

				// Apply modifications to each flower block
				if(world.getBlockEntity(calculatedPos.add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity flowerBlockEntity) {
					if(world.getBlockState(flowerBlockEntity.getPos()).get(FlowerBlock.COLOR) != 1) {
						flowerBlockEntity.removePollen(this.getBaseCollection());
					} else {
						// count x2 red pollen
						flowerBlockEntity.removePollen(this.getBaseCollection() * 2);
					}
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
