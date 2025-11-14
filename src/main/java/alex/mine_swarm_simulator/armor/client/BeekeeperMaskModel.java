// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class BeekeeperMaskModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public BeekeeperMaskModel(ModelPart root) {
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
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(10, 0).cuboid(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 21).cuboid(-4.0F, -1.0F, 4.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 0).cuboid(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 8).cuboid(-5.0F, -2.0F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(30, 3).cuboid(-5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 2).cuboid(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(18, 9).cuboid(4.0F, -2.0F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 5).cuboid(4.0F, -1.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 14).cuboid(-4.0F, -7.0F, 4.0F, 8.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 24).cuboid(-4.0F, -7.0F, -5.0F, 8.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -7.0F, -4.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 27).cuboid(-5.0F, -7.0F, -2.5F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 2).cuboid(-5.0F, -7.0F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 27).cuboid(-5.0F, -7.0F, 0.5F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-5.0F, -7.0F, 2.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 14).cuboid(4.0F, -7.0F, -4.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 27).cuboid(4.0F, -7.0F, -2.5F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(14, 2).cuboid(4.0F, -7.0F, -0.5F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 27).cuboid(4.0F, -7.0F, 0.5F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(4.0F, -7.0F, 2.0F, 1.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 9).cuboid(-4.0F, -8.0F, -6.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(4, 0).cuboid(-5.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(-6.0F, -8.0F, -4.0F, 2.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(4, 19).cuboid(-5.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 24).cuboid(-4.0F, -8.0F, 4.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 14).cuboid(4.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 15).cuboid(4.0F, -8.0F, -4.0F, 2.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(4, 11).cuboid(4.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 12).cuboid(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-4.0F, -9.0F, 4.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 35).cuboid(-3.0F, -13.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 42).cuboid(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}