// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.entity.client;
import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.entity.GumdropEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GumdropEntityModel extends EntityModel<GumdropEntity> {
	public static final EntityModelLayer GUMDROP_MODEL_LAYER = new EntityModelLayer(Identifier.of(MineSwarmSimulator.MOD_ID, "gumdrop"), "main");

	private final ModelPart lower;
	private final ModelPart middle;
	private final ModelPart right;

	public GumdropEntityModel(ModelPart root) {
		this.lower = root.getChild("lower");
		this.middle = root.getChild("middle");
		this.right = root.getChild("right");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData lower = modelPartData.addChild("lower", ModelPartBuilder.create().uv(32, 65).cuboid(-6.0F, -2.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 85).cuboid(-6.0F, -2.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = lower.addChild("cube_r1", ModelPartBuilder.create().uv(0, 78).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 77).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -2.7489F, 0.0F));

		ModelPartData cube_r2 = lower.addChild("cube_r2", ModelPartBuilder.create().uv(28, 81).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 77).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData cube_r3 = lower.addChild("cube_r3", ModelPartBuilder.create().uv(56, 81).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 73).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.9635F, 0.0F));

		ModelPartData cube_r4 = lower.addChild("cube_r4", ModelPartBuilder.create().uv(0, 82).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 73).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r5 = lower.addChild("cube_r5", ModelPartBuilder.create().uv(84, 81).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 69).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.1781F, 0.0F));

		ModelPartData cube_r6 = lower.addChild("cube_r6", ModelPartBuilder.create().uv(28, 85).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 69).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r7 = lower.addChild("cube_r7", ModelPartBuilder.create().uv(56, 85).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 65).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData middle = modelPartData.addChild("middle", ModelPartBuilder.create().uv(32, 39).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 65).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

		ModelPartData cube_r8 = middle.addChild("cube_r8", ModelPartBuilder.create().uv(0, 52).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.7489F, 0.0F));

		ModelPartData cube_r9 = middle.addChild("cube_r9", ModelPartBuilder.create().uv(32, 52).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData cube_r10 = middle.addChild("cube_r10", ModelPartBuilder.create().uv(64, 0).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.9635F, 0.0F));

		ModelPartData cube_r11 = middle.addChild("cube_r11", ModelPartBuilder.create().uv(64, 13).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r12 = middle.addChild("cube_r12", ModelPartBuilder.create().uv(64, 26).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 13).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.1781F, 0.0F));

		ModelPartData cube_r13 = middle.addChild("cube_r13", ModelPartBuilder.create().uv(64, 39).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 26).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r14 = middle.addChild("cube_r14", ModelPartBuilder.create().uv(64, 52).cuboid(-7.0F, -10.0F, -0.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 39).cuboid(-7.0F, -10.0F, -1.5F, 14.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData right = modelPartData.addChild("right", ModelPartBuilder.create().uv(0, 86).cuboid(-6.0F, -2.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 90).cuboid(-6.0F, -2.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 11.0F, 0.0F));

		ModelPartData cube_r15 = right.addChild("cube_r15", ModelPartBuilder.create().uv(96, 8).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 89).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -2.7489F, 0.0F));

		ModelPartData cube_r16 = right.addChild("cube_r16", ModelPartBuilder.create().uv(96, 4).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 89).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData cube_r17 = right.addChild("cube_r17", ModelPartBuilder.create().uv(96, 0).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 89).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.9635F, 0.0F));

		ModelPartData cube_r18 = right.addChild("cube_r18", ModelPartBuilder.create().uv(0, 94).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(88, 77).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r19 = right.addChild("cube_r19", ModelPartBuilder.create().uv(84, 93).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(88, 73).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.1781F, 0.0F));

		ModelPartData cube_r20 = right.addChild("cube_r20", ModelPartBuilder.create().uv(56, 93).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(88, 69).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r21 = right.addChild("cube_r21", ModelPartBuilder.create().uv(28, 93).cuboid(-6.0F, -1.0F, -0.75F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(88, 65).cuboid(-6.0F, -1.0F, -1.25F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
		lower.render(matrices, vertices, light, overlay, color);
		middle.render(matrices, vertices, light, overlay, color);
		right.render(matrices, vertices, light, overlay, color);
	}

	@Override
	public void setAngles(GumdropEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	}
}