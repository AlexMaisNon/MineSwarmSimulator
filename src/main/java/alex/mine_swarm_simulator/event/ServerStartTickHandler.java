package alex.mine_swarm_simulator.event;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.component.Passives;
import alex.mine_swarm_simulator.component.PassivesComponent;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import alex.mine_swarm_simulator.networking.SyncPlayerDataPayload;
import alex.mine_swarm_simulator.util.PlayerUtils;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ServerStartTickHandler implements ServerTickEvents.StartTick {
	private final HashMap<UUID, BlockPos> lastPos = new HashMap<>();

	@Override
	public void onStartTick(MinecraftServer minecraftServer) {
		for(ServerPlayerEntity serverPlayer : minecraftServer.getPlayerManager().getPlayerList()) {
			if(PlayerUtils.getPlayerField(serverPlayer) != null && lastPos.containsKey(serverPlayer.getUuid()) && serverPlayer.getBlockPos() != lastPos.get(serverPlayer.getUuid())) {
				ServerWorld serverWorld = serverPlayer.getServerWorld();
				if(serverWorld.getBlockEntity(serverPlayer.getBlockPos()) instanceof FlowerBlockEntity flowerBlockEntity) {
					double movementCollection = serverPlayer.getAttributeValue(ModAttributes.PLAYER_MOVEMENT_COLLECTION);
					if(movementCollection > 0) {
						flowerBlockEntity.collectPollen((int)Math.round(movementCollection), serverPlayer);
					}

					for(ItemStack itemStack : serverPlayer.getArmorItems()) {
						if(itemStack.contains(ModComponents.PASSIVES_COMPONENT)) {
							Map<String, PassivesComponent.Passive> passives = itemStack.get(ModComponents.PASSIVES_COMPONENT).passives().stream().collect(Collectors.toMap(PassivesComponent.Passive::id, Function.identity()));
							if(passives.containsKey("goo_trail")) {
								Passives.GooTrail(serverWorld, serverPlayer, serverPlayer.getBlockPos());
							}
						}
					}
				}
			}

			// Saving last BlockPos to check velocity
			lastPos.put(serverPlayer.getUuid(), serverPlayer.getBlockPos());

			// TEMP: to sync with client
			PlayerData playerData = StateSaverAndLoader.getPlayerState(serverPlayer);
			for(ServerPlayerEntity otherServerPlayer : minecraftServer.getPlayerManager().getPlayerList()) {
				ServerPlayNetworking.send(otherServerPlayer, new SyncPlayerDataPayload(serverPlayer.getUuid().toString(), playerData.honey, playerData.pollen, (long) Math.floor(serverPlayer.getAttributeValue(ModAttributes.PLAYER_CAPACITY) * serverPlayer.getAttributeValue(ModAttributes.PLAYER_CAPACITY_MULTIPLIER))));
			}
		}
	}
}
