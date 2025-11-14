// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class MoonAmuletModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public MoonAmuletModel(ModelPart root) {
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

		ModelPartData hat = modelPartData.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(10, 12).cuboid(-8.25F, -16.5F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(-8.25F, -20.5F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 6).cuboid(-6.75F, -19.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-7.25F, -19.5F, -1.5F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Cube_r1 = body.addChild("Cube_r1", ModelPartBuilder.create().uv(8, 4).cuboid(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -20.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		ModelPartData Cube_r2 = body.addChild("Cube_r2", ModelPartBuilder.create().uv(10, 16).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, -19.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

		ModelPartData Cube_r3 = body.addChild("Cube_r3", ModelPartBuilder.create().uv(18, 0).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, -16.25F, 0.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData Cube_r4 = body.addChild("Cube_r4", ModelPartBuilder.create().uv(8, 8).cuboid(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -19.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData Cube_r5 = body.addChild("Cube_r5", ModelPartBuilder.create().uv(0, 16).cuboid(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -16.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		ModelPartData Cube_r6 = body.addChild("Cube_r6", ModelPartBuilder.create().uv(0, 12).cuboid(-1.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}