package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.*;

public class SparkStaffItem extends CollectToolItem {
	public SparkStaffItem() {
		super(-1, 0.8f, 6, new BlockPos[]{
			new BlockPos(0, 0, -5),
			new BlockPos(-3, 0, -4), new BlockPos(-2, 0, -4), new BlockPos(-1, 0, -4), new BlockPos(0, 0, -4), new BlockPos(1, 0, -4), new BlockPos(2, 0, -4), new BlockPos(3, 0, -4),
			new BlockPos(-4, 0, -3), new BlockPos(-3, 0, -3), new BlockPos(-2, 0, -3), new BlockPos(-1, 0, -3), new BlockPos(0, 0, -3), new BlockPos(1, 0, -3), new BlockPos(2, 0, -3), new BlockPos(3, 0, -3), new BlockPos(4, 0, -3),
			new BlockPos(-4, 0, -2), new BlockPos(-3, 0, -2), new BlockPos(-2, 0, -2), new BlockPos(-1, 0, -2), new BlockPos(0, 0, -2), new BlockPos(1, 0, -2), new BlockPos(2, 0, -2), new BlockPos(3, 0, -2), new BlockPos(4, 0, -2),
			new BlockPos(-4, 0, -1), new BlockPos(-3, 0, -1), new BlockPos(-2, 0, -1), new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1), new BlockPos(2, 0, -1), new BlockPos(3, 0, -1), new BlockPos(4, 0, -1),
			new BlockPos(-5, 0, 0), new BlockPos(-4, 0, 0), new BlockPos(-3, 0, 0), new BlockPos(-2, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0), new BlockPos(2, 0, 0), new BlockPos(3, 0, 0), new BlockPos(4, 0, 0), new BlockPos(5, 0, 0),
			new BlockPos(-4, 0, 1), new BlockPos(-3, 0, 1), new BlockPos(-2, 0, 1), new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1), new BlockPos(2, 0, 1), new BlockPos(3, 0, 1), new BlockPos(4, 0, 1),
			new BlockPos(-4, 0, 2), new BlockPos(-3, 0, 2), new BlockPos(-2, 0, 2), new BlockPos(-1, 0, 2), new BlockPos(0, 0, 2), new BlockPos(1, 0, 2), new BlockPos(2, 0, 2), new BlockPos(3, 0, 2), new BlockPos(4, 0, 2),
			new BlockPos(-4, 0, 3), new BlockPos(-3, 0, 3), new BlockPos(-2, 0, 3), new BlockPos(-1, 0, 3), new BlockPos(0, 0, 3), new BlockPos(1, 0, 3), new BlockPos(2, 0, 3), new BlockPos(3, 0, 3), new BlockPos(4, 0, 3),
			new BlockPos(-3, 0, 4), new BlockPos(-2, 0, 4), new BlockPos(-1, 0, 4), new BlockPos(0, 0, 4), new BlockPos(1, 0, 4), new BlockPos(2, 0, 4), new BlockPos(3, 0, 4),
			new BlockPos(0, 0, 5)
		}, false, "item.mine_swarm_simulator.spark_staff.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			List<BlockPos> finalPos = new ArrayList<>();
			List<BlockPos> shuffledPattern = new java.util.ArrayList<>(Arrays.stream(this.getPattern()).toList());
			HashMap<BlockPos, Byte> blockMap = new HashMap<>();

			for(BlockPos blockPos : shuffledPattern) {
				// Apply modifications to each flower block
				if(world.getBlockEntity(blockPos.add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity flowerBlockEntity) {
					blockMap.put(blockPos, flowerBlockEntity.getPollen());
				}
			}

			blockMap.entrySet().stream().sorted((n1, n2) -> -n1.getValue().compareTo(n2.getValue())).forEach(n -> finalPos.add(n.getKey()));

			for(int i = 0; i < 3 && i < finalPos.size(); i++) {
				if(world.getBlockEntity(finalPos.get(i).add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity finalFlowerBlockEntity) {
					// Apply modifications to each flower block
					// and collects finalFlowerBlockEntity.getPollen() * 1.2
					finalFlowerBlockEntity.setPollen(0);
				}
			}
			miner.getItemCooldownManager().set(this, (int)(20 * this.getCollectSpeed()));
		}
		return 0;
	}
}
