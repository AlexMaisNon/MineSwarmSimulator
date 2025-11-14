// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class JarModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cyl;
	// private final ModelPart cyl1;
	// private final ModelPart cyl2;
	// private final ModelPart cyl3;
	// private final ModelPart cyl4;
	// private final ModelPart cyl5;
	// private final ModelPart cyl6;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public JarModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
		// this.body = root.getChild("body");
		// this.cyl = root.getChild("cyl");
		// this.cyl1 = root.getChild("cyl1");
		// this.cyl2 = root.getChild("cyl2");
		// this.cyl3 = root.getChild("cyl3");
		// this.cyl4 = root.getChild("cyl4");
		// this.cyl5 = root.getChild("cyl5");
		// this.cyl6 = root.getChild("cyl6");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(106, 123).cuboid(-5.0F, 4.0F, 11.25F, 10.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-6.0F, 2.5F, 4.0F, 12.0F, 7.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(104, 15).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 6.5F));

		ModelPartData body_r1 = cyl.addChild("body_r1", ModelPartBuilder.create().uv(110, 101).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r2 = cyl.addChild("body_r2", ModelPartBuilder.create().uv(110, 98).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r3 = cyl.addChild("body_r3", ModelPartBuilder.create().uv(110, 95).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(110, 92).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(110, 66).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(110, 63).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(110, 60).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r8 = cyl.addChild("body_r8", ModelPartBuilder.create().uv(60, 110).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r9 = cyl.addChild("body_r9", ModelPartBuilder.create().uv(110, 57).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r10 = cyl.addChild("body_r10", ModelPartBuilder.create().uv(110, 54).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r11 = cyl.addChild("body_r11", ModelPartBuilder.create().uv(110, 45).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r12 = cyl.addChild("body_r12", ModelPartBuilder.create().uv(88, 109).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r13 = cyl.addChild("body_r13", ModelPartBuilder.create().uv(54, 109).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r14 = cyl.addChild("body_r14", ModelPartBuilder.create().uv(48, 109).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r15 = cyl.addChild("body_r15", ModelPartBuilder.create().uv(42, 109).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r16 = cyl.addChild("body_r16", ModelPartBuilder.create().uv(36, 109).cuboid(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData body_r17 = cyl.addChild("body_r17", ModelPartBuilder.create().uv(60, 105).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r18 = cyl.addChild("body_r18", ModelPartBuilder.create().uv(104, 40).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r19 = cyl.addChild("body_r19", ModelPartBuilder.create().uv(104, 35).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r20 = cyl.addChild("body_r20", ModelPartBuilder.create().uv(104, 30).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r21 = cyl.addChild("body_r21", ModelPartBuilder.create().uv(104, 25).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r22 = cyl.addChild("body_r22", ModelPartBuilder.create().uv(104, 20).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData body_r23 = cyl.addChild("body_r23", ModelPartBuilder.create().uv(104, 10).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData cyl1 = body.addChild("cyl1", ModelPartBuilder.create().uv(22, 56).cuboid(-1.0F, -9.5F, 9.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 11.0F, -6.5F));

		ModelPartData body_r24 = cyl1.addChild("body_r24", ModelPartBuilder.create().uv(22, 74).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r25 = cyl1.addChild("body_r25", ModelPartBuilder.create().uv(66, 36).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r26 = cyl1.addChild("body_r26", ModelPartBuilder.create().uv(66, 18).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r27 = cyl1.addChild("body_r27", ModelPartBuilder.create().uv(66, 0).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r28 = cyl1.addChild("body_r28", ModelPartBuilder.create().uv(62, 60).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r29 = cyl1.addChild("body_r29", ModelPartBuilder.create().uv(42, 60).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData body_r30 = cyl1.addChild("body_r30", ModelPartBuilder.create().uv(0, 76).cuboid(-1.0F, -9.5F, -4.0F, 2.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create().uv(60, 100).cuboid(-0.5F, -0.5F, 11.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, -6.5F));

		ModelPartData body_r31 = cyl2.addChild("body_r31", ModelPartBuilder.create().uv(30, 109).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r32 = cyl2.addChild("body_r32", ModelPartBuilder.create().uv(24, 109).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r33 = cyl2.addChild("body_r33", ModelPartBuilder.create().uv(18, 109).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r34 = cyl2.addChild("body_r34", ModelPartBuilder.create().uv(12, 109).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r35 = cyl2.addChild("body_r35", ModelPartBuilder.create().uv(6, 109).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r36 = cyl2.addChild("body_r36", ModelPartBuilder.create().uv(0, 109).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r37 = cyl2.addChild("body_r37", ModelPartBuilder.create().uv(106, 108).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r38 = cyl2.addChild("body_r38", ModelPartBuilder.create().uv(108, 105).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r39 = cyl2.addChild("body_r39", ModelPartBuilder.create().uv(100, 108).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r40 = cyl2.addChild("body_r40", ModelPartBuilder.create().uv(94, 108).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r41 = cyl2.addChild("body_r41", ModelPartBuilder.create().uv(108, 89).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r42 = cyl2.addChild("body_r42", ModelPartBuilder.create().uv(108, 86).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r43 = cyl2.addChild("body_r43", ModelPartBuilder.create().uv(108, 83).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r44 = cyl2.addChild("body_r44", ModelPartBuilder.create().uv(82, 108).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r45 = cyl2.addChild("body_r45", ModelPartBuilder.create().uv(108, 80).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r46 = cyl2.addChild("body_r46", ModelPartBuilder.create().uv(108, 77).cuboid(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData body_r47 = cyl2.addChild("body_r47", ModelPartBuilder.create().uv(104, 5).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r48 = cyl2.addChild("body_r48", ModelPartBuilder.create().uv(104, 0).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r49 = cyl2.addChild("body_r49", ModelPartBuilder.create().uv(80, 100).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r50 = cyl2.addChild("body_r50", ModelPartBuilder.create().uv(70, 100).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r51 = cyl2.addChild("body_r51", ModelPartBuilder.create().uv(100, 66).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r52 = cyl2.addChild("body_r52", ModelPartBuilder.create().uv(100, 61).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData body_r53 = cyl2.addChild("body_r53", ModelPartBuilder.create().uv(100, 56).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData cyl3 = body.addChild("cyl3", ModelPartBuilder.create().uv(0, 94).cuboid(-0.5F, -0.5F, 10.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.5F, -6.5F));

		ModelPartData body_r54 = cyl3.addChild("body_r54", ModelPartBuilder.create().uv(82, 75).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r55 = cyl3.addChild("body_r55", ModelPartBuilder.create().uv(88, 56).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r56 = cyl3.addChild("body_r56", ModelPartBuilder.create().uv(88, 75).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r57 = cyl3.addChild("body_r57", ModelPartBuilder.create().uv(12, 94).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r58 = cyl3.addChild("body_r58", ModelPartBuilder.create().uv(94, 56).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r59 = cyl3.addChild("body_r59", ModelPartBuilder.create().uv(12, 97).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r60 = cyl3.addChild("body_r60", ModelPartBuilder.create().uv(100, 71).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r61 = cyl3.addChild("body_r61", ModelPartBuilder.create().uv(90, 100).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r62 = cyl3.addChild("body_r62", ModelPartBuilder.create().uv(90, 103).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r63 = cyl3.addChild("body_r63", ModelPartBuilder.create().uv(104, 45).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r64 = cyl3.addChild("body_r64", ModelPartBuilder.create().uv(70, 105).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r65 = cyl3.addChild("body_r65", ModelPartBuilder.create().uv(76, 105).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r66 = cyl3.addChild("body_r66", ModelPartBuilder.create().uv(82, 105).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r67 = cyl3.addChild("body_r67", ModelPartBuilder.create().uv(96, 105).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r68 = cyl3.addChild("body_r68", ModelPartBuilder.create().uv(102, 105).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r69 = cyl3.addChild("body_r69", ModelPartBuilder.create().uv(0, 106).cuboid(-1.0F, 2.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData body_r70 = cyl3.addChild("body_r70", ModelPartBuilder.create().uv(96, 81).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r71 = cyl3.addChild("body_r71", ModelPartBuilder.create().uv(96, 75).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r72 = cyl3.addChild("body_r72", ModelPartBuilder.create().uv(86, 94).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r73 = cyl3.addChild("body_r73", ModelPartBuilder.create().uv(74, 94).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r74 = cyl3.addChild("body_r74", ModelPartBuilder.create().uv(62, 94).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r75 = cyl3.addChild("body_r75", ModelPartBuilder.create().uv(50, 94).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r76 = cyl3.addChild("body_r76", ModelPartBuilder.create().uv(38, 94).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl4 = body.addChild("cyl4", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, -5.5F, 8.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.5F, -6.5F));

		ModelPartData body_r77 = cyl4.addChild("body_r77", ModelPartBuilder.create().uv(0, 56).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r78 = cyl4.addChild("body_r78", ModelPartBuilder.create().uv(44, 40).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r79 = cyl4.addChild("body_r79", ModelPartBuilder.create().uv(44, 20).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r80 = cyl4.addChild("body_r80", ModelPartBuilder.create().uv(44, 0).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r81 = cyl4.addChild("body_r81", ModelPartBuilder.create().uv(22, 36).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r82 = cyl4.addChild("body_r82", ModelPartBuilder.create().uv(0, 36).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r83 = cyl4.addChild("body_r83", ModelPartBuilder.create().uv(22, 16).cuboid(-1.0F, -5.5F, -4.5F, 2.0F, 11.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl5 = body.addChild("cyl5", ModelPartBuilder.create().uv(96, 87).cuboid(-0.5F, -0.5F, 10.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.5F, -6.5F));

		ModelPartData body_r84 = cyl5.addChild("body_r84", ModelPartBuilder.create().uv(76, 108).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r85 = cyl5.addChild("body_r85", ModelPartBuilder.create().uv(108, 74).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r86 = cyl5.addChild("body_r86", ModelPartBuilder.create().uv(70, 108).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r87 = cyl5.addChild("body_r87", ModelPartBuilder.create().uv(88, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r88 = cyl5.addChild("body_r88", ModelPartBuilder.create().uv(106, 71).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r89 = cyl5.addChild("body_r89", ModelPartBuilder.create().uv(54, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r90 = cyl5.addChild("body_r90", ModelPartBuilder.create().uv(106, 51).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r91 = cyl5.addChild("body_r91", ModelPartBuilder.create().uv(106, 48).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r92 = cyl5.addChild("body_r92", ModelPartBuilder.create().uv(48, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r93 = cyl5.addChild("body_r93", ModelPartBuilder.create().uv(42, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r94 = cyl5.addChild("body_r94", ModelPartBuilder.create().uv(36, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r95 = cyl5.addChild("body_r95", ModelPartBuilder.create().uv(30, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r96 = cyl5.addChild("body_r96", ModelPartBuilder.create().uv(24, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r97 = cyl5.addChild("body_r97", ModelPartBuilder.create().uv(18, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r98 = cyl5.addChild("body_r98", ModelPartBuilder.create().uv(12, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r99 = cyl5.addChild("body_r99", ModelPartBuilder.create().uv(6, 106).cuboid(-1.0F, -4.0F, 0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData body_r100 = cyl5.addChild("body_r100", ModelPartBuilder.create().uv(48, 100).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r101 = cyl5.addChild("body_r101", ModelPartBuilder.create().uv(36, 100).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r102 = cyl5.addChild("body_r102", ModelPartBuilder.create().uv(24, 100).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r103 = cyl5.addChild("body_r103", ModelPartBuilder.create().uv(12, 100).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r104 = cyl5.addChild("body_r104", ModelPartBuilder.create().uv(0, 100).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r105 = cyl5.addChild("body_r105", ModelPartBuilder.create().uv(98, 99).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r106 = cyl5.addChild("body_r106", ModelPartBuilder.create().uv(98, 93).cuboid(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 13.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl6 = body.addChild("cyl6", ModelPartBuilder.create().uv(60, 78).cuboid(-1.0F, -2.0F, 9.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(88, 48).cuboid(-1.0F, -2.25F, 9.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, -6.5F));

		ModelPartData body_r107 = cyl6.addChild("body_r107", ModelPartBuilder.create().uv(86, 24).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(86, 16).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r108 = cyl6.addChild("body_r108", ModelPartBuilder.create().uv(86, 32).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(86, 8).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r109 = cyl6.addChild("body_r109", ModelPartBuilder.create().uv(86, 40).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(86, 0).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r110 = cyl6.addChild("body_r110", ModelPartBuilder.create().uv(42, 86).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(82, 67).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r111 = cyl6.addChild("body_r111", ModelPartBuilder.create().uv(60, 86).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(82, 59).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r112 = cyl6.addChild("body_r112", ModelPartBuilder.create().uv(78, 86).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(78, 78).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData body_r113 = cyl6.addChild("body_r113", ModelPartBuilder.create().uv(20, 92).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(42, 78).cuboid(-1.0F, -0.25F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.75F, 13.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}