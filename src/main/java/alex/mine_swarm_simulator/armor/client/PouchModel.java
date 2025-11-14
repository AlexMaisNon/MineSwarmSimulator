// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class PouchModel {
	// private final ModelPart head;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public PouchModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.body = root.getChild("body");
		// this.left_arm = root.getChild("left_arm");
		// this.right_arm = root.getChild("right_arm");
		// this.left_leg = root.getChild("left_leg");
		// this.right_leg = root.getChild("right_leg");
	}
	public static ModelData getModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(18, 23).cuboid(-2.75F, 4.0F, 2.0F, 6.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 28).cuboid(-1.0F, 1.5F, 3.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, 8.0F, 2.0F, 8.0F, 4.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        body.addChild("cube_r1", ModelPartBuilder.create().uv(34, 0).cuboid(1.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 5.9402F, 10.0974F, 0.588F, 0.4478F, 0.281F));

        ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(0, 36).cuboid(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 4.0922F, 7.3474F, 0.588F, 0.4478F, 0.281F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(4, 36).cuboid(-1.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 3.1974F, 6.4199F, 1.1071F, 0.2527F, 0.4636F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(12, 36).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.1566F, 7.1895F, 8.75F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(36, 13).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.8481F, 3.75F, 6.75F, 0.5569F, -0.73F, -0.8869F));

		ModelPartData cube_r6 = body.addChild("cube_r6", ModelPartBuilder.create().uv(14, 13).cuboid(2.5F, -2.0F, -5.5F, 1.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, 7.75F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r7 = body.addChild("cube_r7", ModelPartBuilder.create().uv(20, 34).cuboid(-1.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 2.8014F, 3.2446F, -0.3521F, -0.1776F, -0.4483F));

		ModelPartData cube_r8 = body.addChild("cube_r8", ModelPartBuilder.create().uv(22, 28).cuboid(2.5F, -2.0F, -3.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 5.25F, 6.75F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r9 = body.addChild("cube_r9", ModelPartBuilder.create().uv(12, 32).cuboid(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 2.5F, 4.5F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r10 = body.addChild("cube_r10", ModelPartBuilder.create().uv(34, 10).cuboid(0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 3.1974F, 6.4199F, 1.1071F, -0.2527F, -0.4636F));

		ModelPartData cube_r11 = body.addChild("cube_r11", ModelPartBuilder.create().uv(30, 32).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.4474F, 6.6699F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cube_r12 = body.addChild("cube_r12", ModelPartBuilder.create().uv(24, 34).cuboid(0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 4.0922F, 7.3474F, 0.588F, -0.4478F, -0.281F));

		ModelPartData cube_r13 = body.addChild("cube_r13", ModelPartBuilder.create().uv(0, 33).cuboid(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5922F, 7.8474F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r14 = body.addChild("cube_r14", ModelPartBuilder.create().uv(8, 33).cuboid(-2.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 5.9402F, 10.0974F, 0.588F, -0.4478F, -0.281F));

		ModelPartData cube_r15 = body.addChild("cube_r15", ModelPartBuilder.create().uv(0, 27).cuboid(-2.5F, -2.5F, -0.5F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.1902F, 9.3474F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r16 = body.addChild("cube_r16", ModelPartBuilder.create().uv(30, 28).cuboid(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 2.5F, 4.5F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r17 = body.addChild("cube_r17", ModelPartBuilder.create().uv(32, 23).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.25F, 0.75F, 4.5F, 0.2524F, 0.2198F, 0.008F));

		ModelPartData cube_r18 = body.addChild("cube_r18", ModelPartBuilder.create().uv(34, 6).cuboid(0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 2.8014F, 3.2446F, -0.3521F, 0.1776F, 0.4483F));

		ModelPartData cube_r19 = body.addChild("cube_r19", ModelPartBuilder.create().uv(28, 19).cuboid(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0514F, 2.9946F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r20 = body.addChild("cube_r20", ModelPartBuilder.create().uv(28, 35).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.8481F, 3.75F, 6.75F, 0.5569F, 0.73F, 0.8869F));

		ModelPartData cube_r21 = body.addChild("cube_r21", ModelPartBuilder.create().uv(28, 13).cuboid(-3.5F, -2.0F, -3.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 5.25F, 6.75F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r22 = body.addChild("cube_r22", ModelPartBuilder.create().uv(32, 35).cuboid(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.1566F, 7.1895F, 8.75F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r23 = body.addChild("cube_r23", ModelPartBuilder.create().uv(0, 13).cuboid(-3.5F, -2.0F, -5.5F, 1.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, 7.75F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r24 = body.addChild("cube_r24", ModelPartBuilder.create().uv(46, 60).cuboid(-5.0F, -14.0F, 17.5F, 8.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 24.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}