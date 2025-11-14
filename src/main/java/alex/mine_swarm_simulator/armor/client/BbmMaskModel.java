// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class BbmMaskModel {
	// private final ModelPart head;
	// private final ModelPart cube_r1;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public BbmMaskModel(ModelPart root) {
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
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -10.0F, -5.0F, 10.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(22, 27).cuboid(-5.0F, -9.0F, -5.0F, 10.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 0).cuboid(-3.5F, -6.0F, -6.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 16).cuboid(-3.75F, -6.75F, -6.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 16).cuboid(1.75F, -6.75F, -6.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 0).cuboid(2.5F, -6.0F, -6.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 11).cuboid(4.0F, -9.0F, -4.0F, 1.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-5.0F, -9.0F, -4.0F, 1.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 27).cuboid(-5.0F, -9.0F, 4.0F, 10.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 11).cuboid(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 0).cuboid(4.0F, -1.0F, -4.0F, 2.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-6.0F, -1.0F, -4.0F, 2.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(28, 14).cuboid(-6.0F, -1.0F, 4.0F, 12.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -11.75F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 4).cuboid(-4.75F, -13.75F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 0).cuboid(-5.5F, -15.25F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 4).cuboid(-6.75F, -16.25F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-8.25F, -17.25F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 11).cuboid(-10.5F, -18.5F, -1.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).mirrored().cuboid(2.0F, -11.75F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 4).mirrored().cuboid(2.75F, -13.75F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(30, 0).mirrored().cuboid(3.5F, -15.25F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(30, 4).mirrored().cuboid(4.75F, -16.25F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 11).mirrored().cuboid(6.25F, -17.25F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
		.uv(10, 11).mirrored().cuboid(7.5F, -18.5F, -1.5F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(19, 11).cuboid(1.0F, -3.0F, -6.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}