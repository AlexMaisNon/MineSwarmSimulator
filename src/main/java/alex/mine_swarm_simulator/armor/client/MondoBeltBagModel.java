// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class MondoBeltBagModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cube_r1;
	// private final ModelPart cube_r2;
	// private final ModelPart cube_r3;
	// private final ModelPart cube_r4;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public MondoBeltBagModel(ModelPart root) {
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(20, 19).cuboid(-2.5F, 9.625F, -4.625F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.5F, 8.125F, -4.375F, 7.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 6).cuboid(-4.0F, 9.125F, -3.875F, 8.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 22).cuboid(-4.0F, 8.625F, -3.875F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(10, 19).cuboid(-7.75F, 9.125F, -3.375F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(3.75F, 9.125F, -3.375F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = body.addChild("cube_r1", ModelPartBuilder.create().uv(18, 0).cuboid(11.75F, -7.0F, -2.5F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 13).cuboid(11.75F, -6.5F, -2.5F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 23.625F, -0.875F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r2 = body.addChild("cube_r2", ModelPartBuilder.create().uv(20, 10).cuboid(8.25F, -10.5F, -2.5F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(9.0F, -12.5F, -2.5F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 23.625F, -0.875F, 0.0F, 0.0F, -0.3927F));

		ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(19, 22).cuboid(-15.75F, -7.0F, -2.5F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 16).cuboid(-16.75F, -6.5F, -2.5F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 23.625F, -0.875F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(19, 6).cuboid(-12.25F, -10.5F, -2.5F, 4.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(-14.0F, -12.5F, -2.5F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 23.625F, -0.875F, 0.0F, 0.0F, 0.3927F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}