package alex.mine_swarm_simulator;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.client.HiveBlockEntityRenderer;
import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.entity.ModEntities;
import alex.mine_swarm_simulator.entity.client.BeeEntityModel;
import alex.mine_swarm_simulator.entity.client.BeeEntityRenderer;
import alex.mine_swarm_simulator.entity.client.GumdropEntityModel;
import alex.mine_swarm_simulator.entity.client.GumdropEntityRenderer;
import alex.mine_swarm_simulator.screens.ingame.MineSwarmHud;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.event.ItemTooltipHandler;
import alex.mine_swarm_simulator.networking.SyncPlayerDataPayload;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import alex.mine_swarm_simulator.armor.ArmorModelHandler;
import alex.mine_swarm_simulator.armor.TrinketModelRenderer;
import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.item.ModelArmorItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.util.RawTextureDataLoader;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.io.IOException;

public class MineSwarmSimulatorClient implements ClientModInitializer {
	private static int[] GOO_COLORMAP;
	private static PlayerData clientPlayerData = new PlayerData();

	public static PlayerData getClientPlayerData() {
		return clientPlayerData;
	}

	@Override
	public void onInitializeClient() {
		ArmorModelHandler.init((loc, def) -> EntityModelLayerRegistry.registerModelLayer(loc, () -> def));
		registerArmorRenderer();

		HudRenderCallback.EVENT.register(new MineSwarmHud());

		for(Item item : ModItems.trinketList) {
			TrinketRendererRegistry.registerRenderer(item, TrinketModelRenderer::new);
		}

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), ModBlocks.BASIC_EGG_SHOP, ModBlocks.GUMDROP_SHOP, ModBlocks.MAGIC_BEAN_SHOP,
				ModBlocks.ROYAL_JELLY_SHOP, ModBlocks.STINGER_SHOP, ModBlocks.TICKET_SHOP, ModBlocks.TREAT_SHOP, ModBlocks.HIVE_SLOT, ModBlocks.FLOWER_BLOCK);

		ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
			ResourceManager manager = MinecraftClient.getInstance().getResourceManager();
			try {
				GOO_COLORMAP = RawTextureDataLoader.loadRawTextureData(manager, Identifier.of(MineSwarmSimulator.MOD_ID, "textures/colormap/goo.png"));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});

		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> FlowerBlock.getColors(pos, GOO_COLORMAP), ModBlocks.FLOWER_BLOCK);

		ClientPlayNetworking.registerGlobalReceiver(SyncPlayerDataPayload.ID, ((syncPlayerDataPayload, context) -> {
			context.client().execute(() -> {
				clientPlayerData.honey = syncPlayerDataPayload.honey();
				clientPlayerData.pollen = syncPlayerDataPayload.pollen();
				clientPlayerData.capacity = syncPlayerDataPayload.capacity();
			});
		}));

		ItemTooltipCallback.EVENT.register(new ItemTooltipHandler());

		EntityRendererRegistry.register(ModEntities.GUMDROP, GumdropEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(GumdropEntityModel.GUMDROP_MODEL_LAYER, GumdropEntityModel::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.BEE, BeeEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(BeeEntityModel.BEE_MODEL_LAYER, BeeEntityModel::getTexturedModelData);

		BlockEntityRendererFactories.register(ModBlockEntities.HIVE_BLOCK_ENTITY, HiveBlockEntityRenderer::new);
	}

	private void registerArmorRenderer() {
		Item[] armors = Registries.ITEM.stream()
				.filter(i -> i instanceof ModelArmorItem
						&& Registries.ITEM.getKey(i).get().getValue().getNamespace().equals(MineSwarmSimulator.MOD_ID))
				.toArray(Item[]::new);

		ArmorRenderer renderer = (matrices, vertexConsumer, stack, entity, slot, light, original) -> {

			ModelArmorItem armor = (ModelArmorItem) stack.getItem();
			var model = armor.getArmorModel();
			var texture = armor.getArmorTexture(stack, slot);
			original.copyBipedStateTo(model);
			ArmorRenderer.renderPart(matrices, vertexConsumer, light, stack, model, texture);
		};
		ArmorRenderer.register(renderer, armors);
	}
}