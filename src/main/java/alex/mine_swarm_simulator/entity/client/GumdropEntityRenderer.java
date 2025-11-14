package alex.mine_swarm_simulator.entity.client;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.MineSwarmSimulatorClient;
import alex.mine_swarm_simulator.entity.GumdropEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GumdropEntityRenderer extends EntityRenderer<GumdropEntity> {
	private final GumdropEntityModel model;

	public GumdropEntityRenderer(EntityRendererFactory.Context ctx) {
		super(ctx);
		this.model = new GumdropEntityModel(ctx.getPart(GumdropEntityModel.GUMDROP_MODEL_LAYER));
	}

	@Override
	public void render(GumdropEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
		VertexConsumer vertexConsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, this.model.getLayer(this.getTexture(entity)), false, false);
		this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
		super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
	}

	@Override
	public Identifier getTexture(GumdropEntity entity) {
		return Identifier.of(MineSwarmSimulator.MOD_ID, entity.getUuid().getMostSignificantBits() % 2 == 0 ? "textures/entity/gumdrop0.png" : "textures/entity/gumdrop1.png");
	}
}
