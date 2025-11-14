// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class DiamondMaskModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public DiamondMaskModel(ModelPart root) {
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
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(30, 11).cuboid(-4.0F, -7.0F, 4.0F, 8.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 11).cuboid(-4.0F, -7.0F, -5.0F, 8.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-5.0F, -7.0F, -4.0F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(22, 19).cuboid(-5.0F, -7.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-5.0F, -7.0F, 2.0F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 22).cuboid(4.0F, -7.0F, -4.0F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 19).cuboid(4.0F, -7.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 22).cuboid(4.0F, -7.0F, 2.0F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 3).cuboid(-4.0F, -8.0F, -6.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(-6.0F, -8.0F, -4.0F, 2.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(3, 3).cuboid(-5.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 0).cuboid(-4.0F, -8.0F, 4.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(4.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(4.0F, -8.0F, -4.0F, 2.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(3, 1).cuboid(4.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 0).cuboid(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(20, 9).cuboid(-4.0F, -9.0F, 4.0F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 33).cuboid(-3.0F, -13.0F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 40).cuboid(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 43).cuboid(2.0F, -10.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 43).cuboid(-1.0F, -10.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 43).cuboid(-3.0F, -10.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 43).cuboid(3.0F, -11.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 43).cuboid(1.0F, -11.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 45).cuboid(-2.0F, -11.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-4.0F, -11.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 45).cuboid(1.0F, -12.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 43).cuboid(-3.0F, -12.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 45).cuboid(3.0F, -14.0F, -5.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 45).cuboid(-1.0F, -14.0F, -5.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 45).cuboid(-4.0F, -14.0F, -5.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(1.0F, -15.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(6, 48).cuboid(-3.0F, -15.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 48).cuboid(-1.0F, -16.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 48).cuboid(-0.5F, -17.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}