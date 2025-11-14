// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class PetalBeltModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cube_r1;
	// private final ModelPart cube_r2;
	// private final ModelPart cube_r3;
	// private final ModelPart cube_r4;
	// private final ModelPart cube_r5;
	// private final ModelPart cube_r6;
	// private final ModelPart cube_r7;
	// private final ModelPart Cube_r8;
	// private final ModelPart Cube_r9;
	// private final ModelPart Cube_r10;
	// private final ModelPart Cube_r11;
	// private final ModelPart Cube_r12;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public PetalBeltModel(ModelPart root) {
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(7, 5).cuboid(4.25F, -12.3125F, 0.9375F, 1.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(14, 0).cuboid(3.6875F, -10.0625F, -2.8125F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, 0.0F, -0.1745F, -0.3927F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-5.25F, -12.3125F, 0.9375F, 1.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(0, 15).cuboid(-10.9375F, -10.0625F, -2.8125F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, 0.0F, 0.1745F, 0.3927F));

		ModelPartData cube_r5 = body.addChild("cube_r5", ModelPartBuilder.create().uv(16, 15).cuboid(-2.5F, -10.375F, -1.125F, 5.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r6 = body.addChild("cube_r6", ModelPartBuilder.create().uv(19, 6).cuboid(4.625F, -14.4375F, -4.125F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, -0.1745F, 0.0F, -0.7854F));

		ModelPartData cube_r7 = body.addChild("cube_r7", ModelPartBuilder.create().uv(0, 21).cuboid(-9.625F, -14.6875F, -4.3125F, 5.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 21.75F, -1.0F, -0.1745F, 0.0F, 0.7854F));

		ModelPartData Cube_r8 = body.addChild("Cube_r8", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0927F, -2.119F, -0.0007F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 21).cuboid(-2.0927F, -0.4315F, -2.2493F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 14).cuboid(-2.0927F, -0.869F, -1.4993F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 6).cuboid(-2.0927F, -1.494F, -0.7493F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 27).cuboid(0.8351F, -2.125F, -0.7493F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 11.625F, -4.0F, 0.0F, -0.3927F, 0.7854F));

		ModelPartData Cube_r9 = body.addChild("Cube_r9", ModelPartBuilder.create().uv(19, 13).cuboid(-2.125F, 0.8358F, -0.783F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 20).cuboid(-0.4451F, -2.0798F, -2.217F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 27).cuboid(-0.8826F, -2.0798F, -1.467F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 25).cuboid(-1.5076F, -2.0798F, -0.717F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 23).cuboid(-2.1326F, -2.0798F, 0.033F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 11.625F, -4.0F, 0.3927F, 0.0F, 0.7854F));

		ModelPartData Cube_r10 = body.addChild("Cube_r10", ModelPartBuilder.create().uv(7, 0).cuboid(0.8351F, -2.125F, -0.0007F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-2.0927F, -2.119F, -0.7493F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 17).cuboid(0.8351F, -0.875F, -1.4993F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(0.8351F, -1.5F, -0.7493F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 29).cuboid(0.8351F, -0.4375F, -2.2493F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 11.625F, -4.0F, 0.0F, 0.3927F, 0.7854F));

		ModelPartData Cube_r11 = body.addChild("Cube_r11", ModelPartBuilder.create().uv(12, 23).cuboid(-2.1326F, -2.0798F, -0.783F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 25).cuboid(-2.125F, 0.8358F, 0.033F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 27).cuboid(-1.5F, 0.8358F, -0.717F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 28).cuboid(-0.875F, 0.8358F, -1.467F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 28).cuboid(-0.4375F, 0.8358F, -2.217F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 11.625F, -4.0F, -0.3927F, 0.0F, 0.7854F));

		ModelPartData Cube_r12 = body.addChild("Cube_r12", ModelPartBuilder.create().uv(13, 29).cuboid(-0.625F, -2.6292F, -2.2993F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 11.625F, -4.0F, 0.7854F, 0.0F, 0.7854F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}