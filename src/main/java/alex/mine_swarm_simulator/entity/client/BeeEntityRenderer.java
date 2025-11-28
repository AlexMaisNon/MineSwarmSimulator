package alex.mine_swarm_simulator.entity.client;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.entity.HiveBlockEntity;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.util.BeeType;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

public class BeeEntityRenderer extends MobEntityRenderer<BeeEntity, BeeEntityModel<BeeEntity>> {
	private static final String[] beeTextures = new String[]{
		"basic_bee.png",
		"bomber_bee.png",
		"brave_bee.png",
		"bumble_bee.png",
		"cool_bee.png",
		"hasty_bee.png",
		"looker_bee.png",
		"rad_bee.png",
		"rascal_bee.png",
		"stubborn_bee.png",
		"bubble_bee.png",
		"bucko_bee.png",
		"commander_bee.png",
		"demo_bee.png",
		"exhausted_bee.png",
		"fire_bee.png",
		"frosty_bee.png",
		"honey_bee.png",
		"rage_bee.png",
		"riley_bee.png",
		"shocked_bee.png",
		"baby_bee.png",
		"carpenter_bee.png",
		"demon_bee.png",
		"diamond_bee.png",
		"lion_bee.png",
		"music_bee.png",
		"ninja_bee.png",
		"shy_bee.png",
		"buoyant_bee.png",
		"fuzzy_bee.png",
		"precise_bee.png",
		"spicy_bee.png",
		"tadpole_bee.png",
		"vector_bee.png",
		"bear_bee.png",
		"cobalt_bee.png",
		"crimson_bee.png",
		"digital_bee.png",
		"festive_bee.png",
		"gummy_bee.png",
		"photon_bee.png",
		"puppy_bee.png",
		"tabby_bee.png",
		"vicious_bee.png",
		"windy_bee.png"
	};

	public BeeEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new BeeEntityModel<>(context.getPart(BeeEntityModel.BEE_MODEL_LAYER)), 0.5f);
	}

	@Override
	public Identifier getTexture(BeeEntity entity) {
		String path = entity.getGifted() ? "textures/entity/gifted_" + beeTextures[entity.getBeeType().getId()] : "textures/entity/" + beeTextures[entity.getBeeType().getId()];
		return Identifier.of(MineSwarmSimulator.MOD_ID, path);
	}

	@Override
	public void render(BeeEntity beeEntity, float yaw, float tickDelta, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light) {
		if(beeEntity.getBeeType() == BeeType.BABY || beeEntity.getBeeType() == BeeType.TADPOLE) {
			matrixStack.scale(0.7f, 0.7f, 0.7f);
		} else {
			matrixStack.scale(1f, 1f, 1f);
		}
		super.render(beeEntity, yaw, tickDelta, matrixStack, vertexConsumerProvider, light);

		// Level text rendering
		if(beeEntity.getLevel() > 1 && !beeEntity.isDead()) {
			TextRenderer textRenderer = this.getTextRenderer();

			// Left wing
			matrixStack.push();
			matrixStack.translate(0f, 0.5f, -0.01f);

			matrixStack.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(beeEntity.headYaw));
			matrixStack.multiply(RotationAxis.POSITIVE_X.rotation(this.model.getPart().pitch));
			matrixStack.multiply(RotationAxis.NEGATIVE_Z.rotation(this.model.getPart().getChild("left_wing").roll));
			matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90f));
			matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90f));

			matrixStack.translate(0f, 0.4f, -0.075f);
			matrixStack.scale(0.5f / 18f, 0.5f / 18f, 0.5f / 18f);

			String text = String.valueOf(beeEntity.getLevel());
			float width = textRenderer.getWidth(text);

			textRenderer.draw(text, -width / 2f, 0f, 0xffffff, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, TextRenderer.TextLayerType.NORMAL, 0, light);
			matrixStack.pop();

			// Right wing
			matrixStack.push();
			matrixStack.translate(0f, 0.5f, 0.01f);

			matrixStack.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(beeEntity.headYaw));
			matrixStack.multiply(RotationAxis.POSITIVE_X.rotation(this.model.getPart().pitch));
			matrixStack.multiply(RotationAxis.NEGATIVE_Z.rotation(this.model.getPart().getChild("right_wing").roll));
			matrixStack.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(90f));
			matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90f));

			matrixStack.translate(0f, 0.4f, -0.075f);
			matrixStack.scale(0.5f / 18f, 0.5f / 18f, 0.5f / 18f);

			textRenderer.draw(text, -width / 2f, 0f, 0xffffff, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, TextRenderer.TextLayerType.NORMAL, 0, light);
			matrixStack.pop();
		}
	}
}
