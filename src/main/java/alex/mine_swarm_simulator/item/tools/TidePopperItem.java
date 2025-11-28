package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TidePopperItem extends CollectToolItem {
	public TidePopperItem() {
		super(500, 1f, 5, new BlockPos[]{
			new BlockPos(0, 0, -9),
			new BlockPos(0, 0, -8),
			new BlockPos(0, 0, -7),
			new BlockPos(0, 0, -6),
			new BlockPos(0, 0, -5),
			new BlockPos(-1, 0, -4), new BlockPos(0, 0, -4), new BlockPos(1, 0, -4),
			new BlockPos(-1, 0, -3), new BlockPos(0, 0, -3), new BlockPos(1, 0, -3),
			new BlockPos(-1, 0, -2), new BlockPos(0, 0, -2), new BlockPos(1, 0, -2),
			new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1),
			new BlockPos(-2, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0), new BlockPos(2, 0, 0)
		}, true, "item.mine_swarm_simulator.tide_popper.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner, boolean isFull) {
		int amount = 0;
		if(!isFull) {
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
					amount += switch(world.getBlockState(flowerBlockEntity.getPos()).get(FlowerBlock.COLOR)) {
						case 0 -> flowerBlockEntity.collectPollen(Math.round(this.getBaseCollection() * 1.2f), miner); 	// x1.2 white pollen
						case 1 -> flowerBlockEntity.collectPollen(this.getBaseCollection(), miner); 					// x1 red pollen
						default -> flowerBlockEntity.collectPollen(this.getBaseCollection() * 2, miner); 		// x2 blue pollen
					};
				}
			}
		}
		miner.getItemCooldownManager().set(this, this.getCooldownTime());
		return amount;
	}
}
