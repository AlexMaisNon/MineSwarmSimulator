// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class BuckoGuardModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart cube_r1;
	// private final ModelPart cube_r2;
	// private final ModelPart cube_r3;
	// private final ModelPart cube_r4;
	// private final ModelPart cube_r5;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public BuckoGuardModel(ModelPart root) {
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create().uv(48, 0).cuboid(-0.5F, -3.0F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(-4.0F, -3.0F, -2.5F, 4.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(34, 0).cuboid(-4.0F, -2.75F, -2.5F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(19, 1).cuboid(-4.5F, 0.25F, -3.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(16, 9).cuboid(0.25F, -3.5F, -3.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-8.0F, -3.25F, -1.5F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData cube_r1 = right_arm.addChild("cube_r1", ModelPartBuilder.create().uv(41, 0).cuboid(-6.0F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(31, 8).cuboid(-8.5F, 0.0F, -1.5F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData cube_r2 = right_arm.addChild("cube_r2", ModelPartBuilder.create().uv(24, 16).cuboid(-5.75F, -0.25F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-7.75F, 0.75F, -1.5F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData cube_r3 = right_arm.addChild("cube_r3", ModelPartBuilder.create().uv(0, 7).cuboid(-8.5F, -3.25F, -1.5F, 8.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData cube_r4 = right_arm.addChild("cube_r4", ModelPartBuilder.create().uv(27, 0).cuboid(-6.0F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData cube_r5 = right_arm.addChild("cube_r5", ModelPartBuilder.create().uv(13, 16).cuboid(-3.0F, -3.75F, -3.0F, 3.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(24, 8).cuboid(-2.5F, -4.75F, -3.0F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.25F, -2.75F, -3.5F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.6545F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}