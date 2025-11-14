// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class HoneycombBeltModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cube_r1;
	// private final ModelPart cube_r2;
	// private final ModelPart cube_r3;
	// private final ModelPart cube_r4;
	// private final ModelPart cube_r5;
	// private final ModelPart cube_r6;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public HoneycombBeltModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(12, 4).cuboid(-2.0F, 8.0F, -4.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 12).cuboid(-2.0F, 12.5F, -4.0F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.0F, 9.5F, -3.0F, 6.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 4).cuboid(-3.0F, 9.0F, -3.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 28).cuboid(-3.75F, 9.75F, -3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 28).cuboid(2.75F, 9.75F, -3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 20).cuboid(-6.5F, 6.4375F, -3.375F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(6, 19).cuboid(-6.5F, 9.8125F, -3.375F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(7, 15).cuboid(-7.0F, 7.0625F, -2.375F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 28).cuboid(-7.4375F, 7.5F, -2.375F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 12).cuboid(-3.5625F, 7.5F, -2.375F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 10).cuboid(3.5F, 6.4375F, -3.375F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(15, 17).cuboid(3.5F, 9.8125F, -3.375F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(14, 0).cuboid(3.0F, 7.0625F, -2.375F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 26).cuboid(6.4375F, 7.5F, -2.375F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 26).cuboid(2.5625F, 7.5F, -2.375F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(4.0F, 9.0F, -1.5F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-5.0F, 9.0F, -1.5F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(15, 7).cuboid(-0.3125F, 1.4375F, -1.125F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(22, 21).cuboid(-2.3125F, -2.3125F, -1.125F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(25, 5).cuboid(1.6875F, -0.5625F, -1.125F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 8.75F, -2.25F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(24, 0).cuboid(-2.6875F, -0.5625F, -1.125F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 8.75F, -2.25F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(18, 13).cuboid(-2.625F, 1.4375F, -1.125F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(14, 23).cuboid(1.3125F, -2.3125F, -1.125F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(-2.6875F, -0.5625F, -1.125F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 8.75F, -2.25F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(25, 16).cuboid(1.6875F, -0.5625F, -1.125F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 8.75F, -2.25F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(0, 6).cuboid(-0.5F, 2.5F, -1.5F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(2.5F, -0.5F, -1.5F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 10.75F, -2.5F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r6 = body.addChild("cube_r6", ModelPartBuilder.create().uv(8, 22).cuboid(-3.5F, -0.5F, -1.5F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(5, 9).cuboid(-3.5F, 2.5F, -1.5F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 10.75F, -2.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}