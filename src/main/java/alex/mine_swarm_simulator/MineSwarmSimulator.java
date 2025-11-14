package alex.mine_swarm_simulator;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.entity.ModEntities;
import alex.mine_swarm_simulator.screens.handlers.ModScreenHandlers;
import alex.mine_swarm_simulator.commands.DebugCommand;
import alex.mine_swarm_simulator.commands.FieldCommand;
import alex.mine_swarm_simulator.event.*;
import alex.mine_swarm_simulator.armor.ModArmorMaterials;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.item.tools.CollectToolItem;
import alex.mine_swarm_simulator.networking.SyncPlayerDataPayload;
import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.item.ModItemGroups;
import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.sound.ModSounds;

public class MineSwarmSimulator implements ModInitializer {
	public static final String MOD_ID = "mine_swarm_simulator";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier SYNC_PLAYER_DATA = Identifier.of(MOD_ID, "sync_player_data");

	@Override
	public void onInitialize() {
		ModArmorMaterials.registerModArmorMaterials();
		ModComponents.registerModComponents();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerModBlockEntities();
		ModItemGroups.registerModItemGroups();
		ModSounds.registerModSounds();
		ModStatusEffects.registerModStatusEffects();
		ModScreenHandlers.registerScreenHandlers();
		ModEntities.registerModEntities();
		CommandRegistrationCallback.EVENT.register(FieldCommand::register);
		CommandRegistrationCallback.EVENT.register(DebugCommand::register);

		MiningBlockCallback.EVENT.register((player, world, hand, pos) -> {
			ItemStack itemStack = player.getWeaponStack();
			if(itemStack.getItem() instanceof CollectToolItem item && !world.isClient) {
				item.collect(world, pos, player);
			}
            return ActionResult.PASS;
        });

		ServerEntityEvents.ENTITY_LOAD.register(new ServerEntityLoadHandler());
		ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());
		ServerLivingEntityEvents.AFTER_DAMAGE.register(new LivingEntityAfterDamageHandler());
		ServerTickEvents.START_SERVER_TICK.register(new ServerStartTickHandler());

		// Payloads
		PayloadTypeRegistry.playS2C().register(SyncPlayerDataPayload.ID, SyncPlayerDataPayload.CODEC);
	}
}