// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class BeekeeperBootsModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart right_arm;
	// private final ModelPart left_arm;
	// private final ModelPart right_leg;
	// private final ModelPart left_leg;
	public BeekeeperBootsModel(ModelPart root) {
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
		.uv(8, 42).cuboid(-1.55F, 8.2F, -2.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 42).cuboid(-1.45F, 8.2F, -2.6F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(-2.6F, 11.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 16).cuboid(-2.4F, 11.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 14).cuboid(-2.6F, 11.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(17, 13).cuboid(-2.4F, 11.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-2.4F, 11.1F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(33, 9).cuboid(-2.6F, 11.1F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(49, 14).cuboid(-2.4F, 11.1F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-2.6F, 11.1F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(4, 21).cuboid(-1.75F, 7.5F, -2.25F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 21).cuboid(-2.25F, 7.5F, -2.25F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(30, 21).cuboid(-1.75F, 7.5F, 1.25F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-2.25F, 7.5F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 26).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(4, 26).cuboid(-1.75F, 8.4F, -2.25F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 28).cuboid(-1.75F, 10.15F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(44, 21).cuboid(-1.75F, 9.65F, -3.75F, 4.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(25, 27).cuboid(-2.25F, 9.65F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(35, 23).cuboid(-2.25F, 10.15F, -3.75F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(30, 23).cuboid(-1.75F, 8.4F, 1.25F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-2.25F, 8.4F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 37).cuboid(-2.4F, 11.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(17, 34).cuboid(-2.4F, 11.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(41, 35).cuboid(-2.6F, 11.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-2.6F, 11.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 42).cuboid(-1.45F, 8.2F, -2.6F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 42).cuboid(-1.55F, 8.2F, -2.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-2.6F, 11.1F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 35).cuboid(-2.4F, 11.1F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 30).cuboid(-2.6F, 11.1F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-2.4F, 11.1F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 12.0F, 0.0F));
		return modelData;
	}
}