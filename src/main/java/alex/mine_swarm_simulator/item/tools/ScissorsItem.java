package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ScissorsItem extends CollectToolItem {
	public ScissorsItem() {
		super(-1, 0.5f, 0, new BlockPos[]{}, false, "item.mine_swarm_simulator.scissors.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			// Apply modifications to the flower block
			if(world.getBlockEntity(pos) instanceof FlowerBlockEntity flowerBlockEntity) {
				// and collects flowerBlockEntity.getPollen()
				flowerBlockEntity.setPollen(0);
			}
			miner.getItemCooldownManager().set(this, (int)(20 * this.getCollectSpeed()));
		}
		return 0;
	}
}
