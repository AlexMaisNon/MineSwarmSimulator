package alex.mine_swarm_simulator.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface MiningBlockCallback {
	// Literally the same as AttackBlockCallback
	Event<MiningBlockCallback> EVENT = EventFactory.createArrayBacked(MiningBlockCallback.class, (listeners) -> (player, world, hand, pos) -> {
		for (MiningBlockCallback event : listeners) {
			ActionResult result = event.interact(player, world, hand, pos);
			if (result != ActionResult.PASS) {
				return result;
			}
		}
		return ActionResult.PASS;
	});
	ActionResult interact(PlayerEntity var1, World var2, Hand var3, BlockPos var4);
}
