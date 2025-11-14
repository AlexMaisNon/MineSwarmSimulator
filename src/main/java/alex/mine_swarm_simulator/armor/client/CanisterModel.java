// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class CanisterModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cyl;
	// private final ModelPart cyl1;
	// private final ModelPart cyl2;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public CanisterModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
		// this.body = root.getChild("body");
		// this.cyl = root.getChild("cyl");
		// this.cyl1 = root.getChild("cyl1");
		// this.cyl2 = root.getChild("cyl2");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(106, 123).cuboid(-5.0F, 5.5F, 11.75F, 10.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.0F, 2.5F, 6.75F, 12.0F, 10.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(0, 15).cuboid(-1.0F, -5.0F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 7.0F, 6.5F));

		ModelPartData body_r1 = cyl.addChild("body_r1", ModelPartBuilder.create().uv(0, 53).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r2 = cyl.addChild("body_r2", ModelPartBuilder.create().uv(44, 38).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r3 = cyl.addChild("body_r3", ModelPartBuilder.create().uv(44, 19).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(44, 0).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(22, 34).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(0, 34).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(22, 15).cuboid(-1.0F, -3.5F, -4.5F, 2.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl1 = body.addChild("cyl1", ModelPartBuilder.create().uv(66, 60).cuboid(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 6.5F));

		ModelPartData body_r8 = cyl1.addChild("body_r8", ModelPartBuilder.create().uv(80, 80).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r9 = cyl1.addChild("body_r9", ModelPartBuilder.create().uv(60, 80).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r10 = cyl1.addChild("body_r10", ModelPartBuilder.create().uv(40, 79).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r11 = cyl1.addChild("body_r11", ModelPartBuilder.create().uv(20, 77).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r12 = cyl1.addChild("body_r12", ModelPartBuilder.create().uv(0, 72).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r13 = cyl1.addChild("body_r13", ModelPartBuilder.create().uv(64, 70).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r14 = cyl1.addChild("body_r14", ModelPartBuilder.create().uv(44, 69).cuboid(-1.0F, -1.5F, -4.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create().uv(22, 53).cuboid(-1.0F, -9.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 7.0F, 6.5F));

		ModelPartData body_r15 = cyl2.addChild("body_r15", ModelPartBuilder.create().uv(66, 48).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r16 = cyl2.addChild("body_r16", ModelPartBuilder.create().uv(66, 36).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r17 = cyl2.addChild("body_r17", ModelPartBuilder.create().uv(66, 24).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r18 = cyl2.addChild("body_r18", ModelPartBuilder.create().uv(66, 12).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r19 = cyl2.addChild("body_r19", ModelPartBuilder.create().uv(66, 0).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r20 = cyl2.addChild("body_r20", ModelPartBuilder.create().uv(22, 65).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r21 = cyl2.addChild("body_r21", ModelPartBuilder.create().uv(44, 57).cuboid(-1.0F, 3.5F, -4.5F, 2.0F, 3.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -13.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}