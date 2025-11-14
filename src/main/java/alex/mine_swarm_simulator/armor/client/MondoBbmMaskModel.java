// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class MondoBbmMaskModel {
	// private final ModelPart head;
	// private final ModelPart cube_r1;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public MondoBbmMaskModel(ModelPart root) {
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
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-7.5F, -15.5F, -7.5F, 15.0F, 2.0F, 15.0F, new Dilation(0.0F))
		.uv(34, 41).cuboid(-7.5F, -13.5F, -7.5F, 15.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 25).cuboid(-5.0F, -9.75F, -9.375F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 33).cuboid(-5.375F, -10.375F, -9.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 59).cuboid(2.375F, -10.375F, -9.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 25).cuboid(3.0F, -9.75F, -9.375F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 17).cuboid(5.5F, -13.5F, -6.5F, 2.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 17).cuboid(-7.5F, -13.5F, -6.5F, 2.0F, 12.0F, 12.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(-7.5F, -13.5F, 5.5F, 15.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(44, 17).cuboid(-9.0F, -2.0F, -9.0F, 18.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 55).cuboid(6.0F, -2.0F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F))
		.uv(45, 0).cuboid(-9.0F, -2.0F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F))
		.uv(30, 64).cuboid(-9.0F, -2.0F, 6.0F, 18.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.0F, -17.625F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 6).cuboid(-7.125F, -20.625F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(38, 55).cuboid(-8.25F, -22.875F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(45, 6).cuboid(-10.125F, -24.375F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 17).cuboid(-12.375F, -25.875F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(16, 17).cuboid(-16.25F, -27.75F, -2.25F, 5.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 23).mirrored().cuboid(3.0F, -17.625F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(50, 55).mirrored().cuboid(4.125F, -20.625F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 55).mirrored().cuboid(5.25F, -22.875F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(45, 0).mirrored().cuboid(7.125F, -24.375F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(56, 27).mirrored().cuboid(9.375F, -25.875F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)).mirrored(false)
		.uv(18, 55).mirrored().cuboid(10.75F, -27.75F, -2.25F, 5.0F, 3.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(0, 61).cuboid(1.5F, -4.5F, -9.0F, 3.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}