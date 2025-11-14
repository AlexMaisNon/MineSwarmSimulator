// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class GummyBootsModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart right_arm;
	// private final ModelPart left_arm;
	// private final ModelPart right_leg;
	// private final ModelPart cube_r1;
	// private final ModelPart cube_r2;
	// private final ModelPart cube_r3;
	// private final ModelPart cube_r4;
	// private final ModelPart left_leg;
	// private final ModelPart cube_r5;
	// private final ModelPart cube_r6;
	// private final ModelPart cube_r7;
	// private final ModelPart cube_r8;
	public GummyBootsModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
		// this.body = root.getChild("body");
		// this.right_arm = root.getChild("right_arm");
		// this.left_arm = root.getChild("left_arm");
		// this.right_leg = root.getChild("right_leg");
		// this.left_leg = root.getChild("left_leg");
	}
	public static ModelData getModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(4, 0).cuboid(-1.75F, 7.5F, -2.25F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-2.25F, 7.5F, -2.25F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.25F, 7.5F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 0).cuboid(-1.75F, 7.5F, 1.25F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(-2.25F, 8.4F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 2).cuboid(-1.75F, 8.4F, 1.25F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 5).cuboid(-1.75F, 8.4F, -2.25F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 7).cuboid(-1.75F, 10.15F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 0).cuboid(-1.75F, 9.65F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(25, 6).cuboid(-2.25F, 9.65F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(35, 2).cuboid(-2.25F, 10.15F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(20, 5).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 60).cuboid(-1.55F, 8.2F, -2.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 60).cuboid(-1.45F, 8.2F, -2.6F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(-2.6F, 11.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 16).cuboid(-2.4F, 11.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 14).cuboid(-2.6F, 11.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(17, 13).cuboid(-2.4F, 11.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-2.4F, 11.1F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(33, 9).cuboid(-2.6F, 11.1F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(49, 14).cuboid(-2.4F, 11.1F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-2.6F, 11.1F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 21).cuboid(-1.4F, 8.9516F, 0.25F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(26, 25).cuboid(-1.65F, 8.9516F, 0.25F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

		ModelPartData cube_r1 = right_leg.addChild("cube_r1", ModelPartBuilder.create().uv(0, 22).cuboid(0.6F, -1.5F, -0.2984F, 1.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(35, 26).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(0.85F, -1.5F, -0.2984F, 3.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(35, 22).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r2 = right_leg.addChild("cube_r2", ModelPartBuilder.create().uv(56, 22).cuboid(0.6F, -1.5F, -0.2984F, 1.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(17, 24).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(56, 18).cuboid(0.85F, -1.5F, -0.2984F, 3.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(17, 20).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r3 = right_leg.addChild("cube_r3", ModelPartBuilder.create().uv(44, 25).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(44, 21).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r4 = right_leg.addChild("cube_r4", ModelPartBuilder.create().uv(8, 22).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(8, 18).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, 0.7854F, 0.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(4, 30).cuboid(-1.75F, 7.5F, -2.25F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 30).cuboid(-2.25F, 7.5F, -2.25F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(30, 30).cuboid(-1.75F, 7.5F, 1.25F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 30).cuboid(-2.25F, 7.5F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 35).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(4, 35).cuboid(-1.75F, 8.4F, -2.25F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 37).cuboid(-1.75F, 10.15F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 30).cuboid(-1.75F, 9.65F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(25, 36).cuboid(-2.25F, 9.65F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(35, 32).cuboid(-2.25F, 10.15F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(30, 32).cuboid(-1.75F, 8.4F, 1.25F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-2.25F, 8.4F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 46).cuboid(-2.4F, 11.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(17, 43).cuboid(-2.4F, 11.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(41, 44).cuboid(-2.6F, 11.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-2.6F, 11.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 60).cuboid(-1.45F, 8.2F, -2.6F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 60).cuboid(-1.55F, 8.2F, -2.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 43).cuboid(-2.6F, 11.1F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 44).cuboid(-2.4F, 11.1F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 39).cuboid(-2.6F, 11.1F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(-2.4F, 11.1F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(26, 51).cuboid(-1.4F, 8.9516F, 0.25F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(26, 55).cuboid(-1.65F, 8.9516F, 0.25F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData cube_r5 = left_leg.addChild("cube_r5", ModelPartBuilder.create().uv(0, 52).cuboid(0.6F, -1.5F, -0.2984F, 1.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(35, 56).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(0.85F, -1.5F, -0.2984F, 3.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(35, 52).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r6 = left_leg.addChild("cube_r6", ModelPartBuilder.create().uv(56, 52).cuboid(0.6F, -1.5F, -0.2984F, 1.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(17, 54).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(56, 48).cuboid(0.85F, -1.5F, -0.2984F, 3.0F, 3.0F, 0.5967F, new Dilation(0.0F))
		.uv(17, 50).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r7 = left_leg.addChild("cube_r7", ModelPartBuilder.create().uv(44, 55).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(44, 51).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r8 = left_leg.addChild("cube_r8", ModelPartBuilder.create().uv(8, 52).cuboid(0.6F, -0.2984F, -1.5F, 1.0F, 0.5967F, 3.0F, new Dilation(0.0F))
		.uv(8, 48).cuboid(0.85F, -0.2984F, -1.5F, 3.0F, 0.5967F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.25F, 9.25F, 1.75F, 0.7854F, 0.0F, 0.0F));
		return modelData;
	}
}