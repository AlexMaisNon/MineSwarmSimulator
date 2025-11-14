// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class BackpackModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cyl;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public BackpackModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
		// this.body = root.getChild("body");
		// this.cyl = root.getChild("cyl");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(44, 59).cuboid(-4.5F, 2.5F, 6.0F, 9.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -1.0F, 2.0F, 10.0F, 16.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-5.0F, 1.5F, 4.0F, 10.0F, 13.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 16).cuboid(-5.0F, 1.0F, 4.0F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 5).cuboid(-4.5F, 7.0F, 5.75F, 9.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(24, 0).cuboid(-5.0F, -0.5F, -1.0F, 10.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 4.25F, -0.7854F, 0.0F, 0.0F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(24, 13).cuboid(-5.0F, -0.5F, -1.0F, 10.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 14.2349F, 4.8461F, 0.2182F, 0.0F, 0.0F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(24, 19).cuboid(-4.0F, -1.0F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.5F, 6.25F));

		ModelPartData body_r3 = cyl.addChild("body_r3", ModelPartBuilder.create().uv(20, 33).cuboid(-4.5F, -0.5F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -0.5F, 0.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(0, 36).cuboid(-4.5F, -0.5F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -0.5F, 0.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(20, 36).cuboid(-4.5F, -0.5F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -0.5F, 0.0F, 1.1781F, 0.0F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(0, 33).cuboid(-4.5F, -0.5F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(24, 25).cuboid(-4.5F, -0.5F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -0.5F, 0.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData body_r8 = cyl.addChild("body_r8", ModelPartBuilder.create().uv(24, 22).cuboid(-4.5F, -0.5F, 0.5F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -0.5F, 0.0F, -1.1781F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}