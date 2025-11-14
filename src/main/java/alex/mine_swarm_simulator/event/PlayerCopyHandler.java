package alex.mine_swarm_simulator.event;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;

public class PlayerCopyHandler implements ServerPlayerEvents.CopyFrom {
	@Override
	public void copyFromPlayer(ServerPlayerEntity oldPlayerEntity, ServerPlayerEntity newPlayerEntity, boolean alive) {
		// Adds the effects back when the player dies
		oldPlayerEntity.getActiveStatusEffects().forEach((statusEffect, statusEffectInstance) -> {
			newPlayerEntity.addStatusEffect(statusEffectInstance);
		});
	}
}
