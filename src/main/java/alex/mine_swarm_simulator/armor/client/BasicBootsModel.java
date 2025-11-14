// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class BasicBootsModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart right_arm;
	// private final ModelPart left_arm;
	// private final ModelPart right_leg;
	// private final ModelPart left_leg;
	public BasicBootsModel(ModelPart root) {
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
		.uv(44, 7).cuboid(-1.75F, 10.15F, -3.75F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 0).cuboid(-1.75F, 9.8F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(25, 6).cuboid(-2.25F, 9.8F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(35, 2).cuboid(-2.25F, 10.15F, -3.75F, 1.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(20, 5).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(4, 15).cuboid(-1.75F, 7.5F, -2.25F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 15).cuboid(-2.25F, 7.5F, -2.25F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(30, 15).cuboid(-1.75F, 7.5F, 1.25F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(-2.25F, 7.5F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 20).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(4, 20).cuboid(-1.75F, 8.4F, -2.25F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 22).cuboid(-1.75F, 10.15F, -3.75F, 4.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 15).cuboid(-1.75F, 9.8F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(25, 21).cuboid(-2.25F, 9.8F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(35, 17).cuboid(-2.25F, 10.15F, -3.75F, 1.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(30, 17).cuboid(-1.75F, 8.4F, 1.25F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 17).cuboid(-2.25F, 8.4F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 12.0F, 0.0F));
		return modelData;
	}
}