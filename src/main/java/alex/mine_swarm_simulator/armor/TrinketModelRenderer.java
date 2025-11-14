package alex.mine_swarm_simulator.armor;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.client.TrinketRenderer;
import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.item.ModelTrinketItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TrinketModelRenderer implements TrinketRenderer {

	public TrinketModelRenderer(ItemStack itemStack, SlotReference slotReference, EntityModel<? extends LivingEntity> entityModel, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, LivingEntity livingEntity, float v, float v1, float v2, float v3, float v4, float v5) {
		render(itemStack, slotReference, entityModel, matrixStack, vertexConsumerProvider, i, livingEntity, v, v1, v2, v3, v4, v5);
	}

	@Override
	public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
		var models = MinecraftClient.getInstance().getEntityModelLoader();
		if(stack.getItem() instanceof ModelTrinketItem trinketItem) {
			var root = models.getModelPart(trinketItem.model);

			switch(trinketItem.slot) {
				case "left_guard":
					TrinketRenderer.translateToLeftArm(matrices, (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, (AbstractClientPlayerEntity) entity);
					matrices.translate(-0.375f, -0.75f, 0f);
					break;
				case "right_guard":
					TrinketRenderer.translateToRightArm(matrices, (PlayerEntityModel<AbstractClientPlayerEntity>) contextModel, (AbstractClientPlayerEntity) entity);
					matrices.translate(0.375f, -0.75f, 0f);
					break;
			}
			VertexConsumer buffer = vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(Identifier.of(MineSwarmSimulator.MOD_ID, trinketItem.armorTexturePath)));
			root.render(matrices, buffer, light, OverlayTexture.DEFAULT_UV);
		}
	}
}
