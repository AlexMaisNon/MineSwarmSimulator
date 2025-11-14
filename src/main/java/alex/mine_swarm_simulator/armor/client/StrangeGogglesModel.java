// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class StrangeGogglesModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public StrangeGogglesModel(ModelPart root) {
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
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(14, 14).cuboid(4.0F, -5.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 8).cuboid(4.0F, -5.0F, -3.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-5.0F, -5.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-5.0F, -5.0F, -3.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(12, 17).cuboid(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 14).cuboid(-1.0F, -9.0F, -4.0F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 3).cuboid(-4.0F, -6.0F, -6.0F, 8.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(-6.0F, -6.0F, -5.0F, 12.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(-6.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-5.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 19).cuboid(4.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 21).cuboid(4.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-5.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 14).cuboid(5.0F, -6.0F, -6.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 14).cuboid(4.0F, -5.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 17).cuboid(-5.0F, -5.0F, -6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 23).cuboid(-5.0F, -7.0F, -6.0F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -2.0F, -6.0F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}