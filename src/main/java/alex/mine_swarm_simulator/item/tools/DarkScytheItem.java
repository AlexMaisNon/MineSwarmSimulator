package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DarkScytheItem extends CollectToolItem {
	public DarkScytheItem() {
		super(-1, 0.5f, 4, new BlockPos[]{
			new BlockPos(-1, 0, -7), new BlockPos(0, 0, -7), new BlockPos(1, 0, -7), new BlockPos(2, 0, -7), new BlockPos(3, 0, -7),
			new BlockPos(-3, 0, -6), new BlockPos(-2, 0, -6), new BlockPos(-1, 0, -6), new BlockPos(0, 0, -6), new BlockPos(1, 0, -6), new BlockPos(2, 0, -6), new BlockPos(3, 0, -6), new BlockPos(4, 0, -6), new BlockPos(5, 0, -6),
			new BlockPos(-4, 0, -5), new BlockPos(-3, 0, -5), new BlockPos(-2, 0, -5), new BlockPos(-1, 0, -5), new BlockPos(0, 0, -5), new BlockPos(1, 0, -5), new BlockPos(2, 0, -5), new BlockPos(3, 0, -5), new BlockPos(4, 0, -5),
			new BlockPos(-4, 0, -4), new BlockPos(-3, 0, -4), new BlockPos(-2, 0, -4), new BlockPos(-1, 0, -4), new BlockPos(0, 0, -4), new BlockPos(1, 0, -4), new BlockPos(2, 0, -4), new BlockPos(3, 0, -4),
			new BlockPos(-5, 0, -3), new BlockPos(1, 0, -3), new BlockPos(2, 0, -3)
		}, true, "item.mine_swarm_simulator.dark_scythe.desc");
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
					switch (world.getBlockState(flowerBlockEntity.getPos()).get(FlowerBlock.COLOR)) {
						case 0:
							// count x1.5 white pollen (6)
							flowerBlockEntity.removePollen(Math.round(this.getBaseCollection() * 1.5f));
							break;
						case 1:
							// count x2 red pollen (10)
							flowerBlockEntity.removePollen(this.getBaseCollection() * 2);
							break;
						case 2:
							// (4)
							flowerBlockEntity.removePollen(this.getBaseCollection());
							break;
					}
				}
			}
			miner.getItemCooldownManager().set(this, (int)(20 * this.getCollectSpeed()));
		}
		return 0;
	}
}
