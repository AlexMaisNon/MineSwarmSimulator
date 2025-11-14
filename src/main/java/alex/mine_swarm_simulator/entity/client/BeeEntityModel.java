// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
package alex.mine_swarm_simulator.entity.client;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.entity.BeeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class BeeEntityModel<T extends BeeEntity> extends SinglePartEntityModel<T> {
	public static final EntityModelLayer BEE_MODEL_LAYER = new EntityModelLayer(Identifier.of(MineSwarmSimulator.MOD_ID, "bee"), "main");

	private final ModelPart bee;
	private final ModelPart head;
	private final ModelPart headwear;
	private final ModelPart left_wing;
	private final ModelPart right_wing;

	public BeeEntityModel(ModelPart root) {
		this.bee = root.getChild("bee");
		this.head = this.bee.getChild("head");
		this.headwear = this.bee.getChild("headwear");
		this.left_wing = this.bee.getChild("left_wing");
		this.right_wing = this.bee.getChild("right_wing");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bee = modelPartData.addChild("bee", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData head = bee.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.5F, 8.0F, 8.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData headwear = bee.addChild("headwear", ModelPartBuilder.create().uv(30, 15).cuboid(-4.0F, -4.0F, -4.5F, 8.0F, 8.0F, 9.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_wing = bee.addChild("left_wing", ModelPartBuilder.create().uv(34, 0).mirrored().cuboid(4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 7.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.5F));

		ModelPartData right_wing = bee.addChild("right_wing", ModelPartBuilder.create().uv(34, 0).cuboid(-12.0F, -1.0F, -4.0F, 8.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.5F));
		return TexturedModelData.of(modelData, 64, 32);
	}


	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setBeeAngles(headYaw, headPitch);

		this.animateMovement(BeeEntityAnimations.IDLE, limbAngle, limbDistance, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, BeeEntityAnimations.IDLE, animationProgress, 1f);
	}

	private void setBeeAngles(float yaw, float pitch) {
		this.bee.yaw = MathHelper.clamp(yaw, -50f, 50f) * 0.017453292f;
		this.bee.pitch = MathHelper.clamp(pitch, -90f, 90f) * 0.017453292f;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		bee.render(matrices, vertexConsumer, light, overlay, color);
	}

	@Override
	public ModelPart getPart() {
		return this.bee;
	}
}