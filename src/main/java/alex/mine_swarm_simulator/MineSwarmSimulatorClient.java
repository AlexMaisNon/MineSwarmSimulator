package alex.mine_swarm_simulator;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.client.HiveSlotBlockEntityRenderer;
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
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.util.RawTextureDataLoader;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.resource.ResourceManager;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class MineSwarmSimulatorClient implements ClientModInitializer {
	private static int[] GOO_COLORMAP;
	private static final Map<UUID, PlayerData> clientPlayerDatas = new HashMap<>();

	@Nullable
	public static PlayerData getClientPlayerData(PlayerEntity playerEntity) {
		return clientPlayerDatas.get(playerEntity.getUuid());
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

		ClientPlayNetworking.registerGlobalReceiver(SyncPlayerDataPayload.ID, ((syncPlayerDataPayload, context) -> context.client().execute(() -> {
			UUID playerUUID = UUID.fromString(syncPlayerDataPayload.uuid());

			if(!clientPlayerDatas.containsKey(playerUUID)) {
				clientPlayerDatas.put(playerUUID, new PlayerData());
			}

			clientPlayerDatas.get(playerUUID).honey = syncPlayerDataPayload.honey();
			clientPlayerDatas.get(playerUUID).pollen = syncPlayerDataPayload.pollen();
			clientPlayerDatas.get(playerUUID).capacity = syncPlayerDataPayload.capacity();
		})));

		ItemTooltipCallback.EVENT.register(new ItemTooltipHandler());

		EntityRendererRegistry.register(ModEntities.GUMDROP, GumdropEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(GumdropEntityModel.GUMDROP_MODEL_LAYER, GumdropEntityModel::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.BEE, BeeEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(BeeEntityModel.BEE_MODEL_LAYER, BeeEntityModel::getTexturedModelData);

		BlockEntityRendererFactories.register(ModBlockEntities.HIVE_BLOCK_ENTITY, HiveSlotBlockEntityRenderer::new);
	}

	private void registerArmorRenderer() {
		Item[] armors = Registries.ITEM.stream()
				.filter(i -> i instanceof ModelArmorItem
						&& Registries.ITEM.getKey(i).get().getValue().getNamespace().equals(MineSwarmSimulator.MOD_ID))
				.toArray(Item[]::new);

		ArmorRenderer renderer = (matrices, vertexConsumer, stack, entity, slot, light, original) -> {

			ModelArmorItem armor = (ModelArmorItem) stack.getItem();
			var model = armor.getArmorModel();
			var texture = armor.getArmorTexture();
			original.copyBipedStateTo(model);
			ArmorRenderer.renderPart(matrices, vertexConsumer, light, stack, model, texture);

			if(slot.equals(EquipmentSlot.CHEST) && entity instanceof PlayerEntity player) {
				matrices.push();
				TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;

				String[] languageInfo = MinecraftClient.getInstance().getLanguageManager().getLanguage().split("_");
				Locale locale = Locale.of(languageInfo[0], languageInfo[1]);

				PlayerData playerData = clientPlayerDatas.get(player.getUuid());
				Text bagText = playerData != null ? Text.literal(String.format(locale, "%,d", playerData.pollen) + "/" + String.format(locale, "%,d", playerData.capacity)) : Text.literal("");
				int width = textRenderer.getWidth(bagText);

				placeTextOnBag(matrices, stack, width, original.body.pitch, original.body.pivotY);

				textRenderer.draw(bagText, -width / 2f, 0f, 0xffffff, false, matrices.peek().getPositionMatrix(), vertexConsumer, TextRenderer.TextLayerType.NORMAL, 0, light);
				matrices.pop();
			}
		};
		ArmorRenderer.register(renderer, armors);
	}

	private void placeTextOnBag(MatrixStack matrixStack, ItemStack itemStack, int textWidth, float bodyPitch, float bodyPivotY) {
		matrixStack.translate(-0.01f, bodyPivotY / 16f, 0f);
		matrixStack.multiply(RotationAxis.POSITIVE_X.rotation(bodyPitch));

		float maxWidth = 0f;
		if(itemStack.isOf(ModItems.POUCH)) {
			matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(30f));
			matrixStack.translate(0f, (24f - 16.75f) / 16f, 6.75f / 16f);
			maxWidth = 0.09f;
		} else if(itemStack.isOf(ModItems.JAR)) {
			matrixStack.translate(0f, (24f - 19.25f) / 16f, 12.5f / 16f);
			maxWidth = 0.11f;
		} else if(itemStack.isOf(ModItems.BACKPACK)) {
			matrixStack.translate(0f, (24f - 20.5f) / 16f, 7.25f / 16f);
			maxWidth = 0.1f;
		} else if(itemStack.isOf(ModItems.CANISTER)) {
			matrixStack.translate(0f, (24f - 17.5f) / 16f, 13f / 16f);
			maxWidth = 0.11f;
		} else if(itemStack.isOf(ModItems.MEGA_JUG)) {
			matrixStack.translate(0f, (24f - 19.5f) / 16f, 13.25f / 16f);
			maxWidth = 0.11f;
		} else if(itemStack.isOf(ModItems.COMPRESSOR)) {
			matrixStack.translate(0f, (24f - 18.75f) / 16f, 13.25f / 16f);
			maxWidth = 0.14f;
		} else if(itemStack.isOf(ModItems.ELITE_BARREL)) {
			matrixStack.translate(0f, (24f - 18.75f) / 16f, 19.25f / 16f);
			maxWidth = 0.15f;
		} else if(itemStack.isOf(ModItems.PORT_O_HIVE) || itemStack.isOf(ModItems.RED_PORT_O_HIVE) || itemStack.isOf(ModItems.BLUE_PORT_O_HIVE) || itemStack.isOf(ModItems.PORCELAIN_PORT_O_HIVE)) {
			matrixStack.translate(0f, (24f - 18.75f) / 16f, 19f / 16f);
			maxWidth = 0.15f;
		} else if(itemStack.isOf(ModItems.COCONUT_CANISTER)) {
			matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(15f));
			matrixStack.translate(0f, (24f - 15.75f) / 16f, 21.75f / 16f);
			maxWidth = 0.15f;
		}
		matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));

		matrixStack.scale(maxWidth / 18f / (textWidth * 0.01f), maxWidth / 18f / (textWidth * 0.01f), 0.5f / 18f);
	}
}