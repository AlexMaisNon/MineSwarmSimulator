// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class CompressorModel {
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
	// private final ModelPart cyl7;
	// private final ModelPart cyl8;
	// private final ModelPart cyl9;
	// private final ModelPart cyl10;
	// private final ModelPart cyl11;
	// private final ModelPart cyl12;
	// private final ModelPart cyl13;
	// private final ModelPart cyl14;
	// private final ModelPart cyl_top;
	// private final ModelPart cyl_bottom;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public CompressorModel(ModelPart root) {
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
		// this.cyl7 = root.getChild("cyl7");
		// this.cyl8 = root.getChild("cyl8");
		// this.cyl9 = root.getChild("cyl9");
		// this.cyl10 = root.getChild("cyl10");
		// this.cyl11 = root.getChild("cyl11");
		// this.cyl12 = root.getChild("cyl12");
		// this.cyl13 = root.getChild("cyl13");
		// this.cyl14 = root.getChild("cyl14");
		// this.cyl_top = root.getChild("cyl_top");
		// this.cyl_bottom = root.getChild("cyl_bottom");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(228, 251).cuboid(-6.5F, 4.25F, 12.0F, 13.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, 2.75F, 7.0F, 16.0F, 7.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-5.0F, 1.0F, 2.0F, 10.0F, 10.0F, 3.0F, new Dilation(0.0F))
		.uv(16, 69).cuboid(-7.5F, 10.0F, 5.5F, 3.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(116, 72).cuboid(4.5F, 10.0F, 5.5F, 3.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 83).cuboid(-10.0F, 7.5F, 2.25F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 54).cuboid(-10.0F, 7.5F, -5.75F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(10, 119).cuboid(-10.5F, 2.5F, -7.75F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 137).cuboid(-10.0F, 1.5F, -7.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 85).cuboid(5.0F, 7.5F, 2.25F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 63).cuboid(9.0F, 7.5F, -5.75F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(94, 122).cuboid(8.5F, 2.5F, -7.75F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(108, 137).cuboid(9.0F, 1.5F, -7.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(80, 16).cuboid(-1.5F, -13.0F, -2.5F, 3.0F, 13.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 10.25F, 8.0F, 0.0F, 0.0F, -0.2182F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(80, 0).cuboid(-1.5F, -13.0F, -2.5F, 3.0F, 13.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, 10.25F, 8.0F, 0.0F, 0.0F, 0.2182F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(0, 25).cuboid(-1.0F, -9.0F, -2.5F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.25F, 6.0F, 6.5F));

		ModelPartData body_r3 = cyl.addChild("body_r3", ModelPartBuilder.create().uv(48, 22).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(16, 47).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(0, 47).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(32, 34).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r8 = cyl.addChild("body_r8", ModelPartBuilder.create().uv(32, 12).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r9 = cyl.addChild("body_r9", ModelPartBuilder.create().uv(16, 25).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl1 = body.addChild("cyl1", ModelPartBuilder.create().uv(80, 32).cuboid(-1.0F, 5.0F, -3.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.25F, -6.5F, 6.5F));

		ModelPartData body_r10 = cyl1.addChild("body_r10", ModelPartBuilder.create().uv(80, 86).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r11 = cyl1.addChild("body_r11", ModelPartBuilder.create().uv(16, 83).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r12 = cyl1.addChild("body_r12", ModelPartBuilder.create().uv(80, 77).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r13 = cyl1.addChild("body_r13", ModelPartBuilder.create().uv(80, 68).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r14 = cyl1.addChild("body_r14", ModelPartBuilder.create().uv(80, 59).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r15 = cyl1.addChild("body_r15", ModelPartBuilder.create().uv(80, 50).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r16 = cyl1.addChild("body_r16", ModelPartBuilder.create().uv(80, 41).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create().uv(72, 113).cuboid(-1.0F, 5.0F, -3.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.25F, -1.0F, 6.5F));

		ModelPartData body_r17 = cyl2.addChild("body_r17", ModelPartBuilder.create().uv(116, 45).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r18 = cyl2.addChild("body_r18", ModelPartBuilder.create().uv(116, 36).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r19 = cyl2.addChild("body_r19", ModelPartBuilder.create().uv(116, 27).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r20 = cyl2.addChild("body_r20", ModelPartBuilder.create().uv(36, 115).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r21 = cyl2.addChild("body_r21", ModelPartBuilder.create().uv(18, 115).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r22 = cyl2.addChild("body_r22", ModelPartBuilder.create().uv(90, 113).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl3 = body.addChild("cyl3", ModelPartBuilder.create().uv(98, 81).cuboid(-1.0F, 5.0F, -3.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.25F, 4.25F, 6.5F));

		ModelPartData body_r23 = cyl3.addChild("body_r23", ModelPartBuilder.create().uv(106, 90).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r24 = cyl3.addChild("body_r24", ModelPartBuilder.create().uv(36, 106).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r25 = cyl3.addChild("body_r25", ModelPartBuilder.create().uv(18, 106).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r26 = cyl3.addChild("body_r26", ModelPartBuilder.create().uv(90, 104).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r27 = cyl3.addChild("body_r27", ModelPartBuilder.create().uv(72, 104).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r28 = cyl3.addChild("body_r28", ModelPartBuilder.create().uv(54, 104).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r29 = cyl3.addChild("body_r29", ModelPartBuilder.create().uv(0, 101).cuboid(-1.0F, 4.5F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl4 = body.addChild("cyl4", ModelPartBuilder.create(), ModelTransform.pivot(-2.25F, 4.0F, 6.0F));

		ModelPartData body_r30 = cyl4.addChild("body_r30", ModelPartBuilder.create().uv(126, 128).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(128, 0).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -0.7854F, 0.0F));

		ModelPartData body_r31 = cyl4.addChild("body_r31", ModelPartBuilder.create().uv(128, 120).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 127).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.1781F, 0.0F));

		ModelPartData body_r32 = cyl4.addChild("body_r32", ModelPartBuilder.create().uv(128, 117).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 127).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.5708F, 0.0F));

		ModelPartData body_r33 = cyl4.addChild("body_r33", ModelPartBuilder.create().uv(128, 75).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 125).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.9635F, 0.0F));

		ModelPartData body_r34 = cyl4.addChild("body_r34", ModelPartBuilder.create().uv(128, 72).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 114).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -2.3562F, 0.0F));

		ModelPartData body_r35 = cyl4.addChild("body_r35", ModelPartBuilder.create().uv(40, 128).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 111).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -2.7489F, 0.0F));

		ModelPartData body_r36 = cyl4.addChild("body_r36", ModelPartBuilder.create().uv(32, 128).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 108).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -3.1416F, 0.0F));

		ModelPartData body_r37 = cyl4.addChild("body_r37", ModelPartBuilder.create().uv(128, 24).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 105).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 2.7489F, 0.0F));

		ModelPartData body_r38 = cyl4.addChild("body_r38", ModelPartBuilder.create().uv(24, 128).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 102).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 2.3562F, 0.0F));

		ModelPartData body_r39 = cyl4.addChild("body_r39", ModelPartBuilder.create().uv(128, 21).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 99).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.9635F, 0.0F));

		ModelPartData body_r40 = cyl4.addChild("body_r40", ModelPartBuilder.create().uv(128, 18).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 84).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.5708F, 0.0F));

		ModelPartData body_r41 = cyl4.addChild("body_r41", ModelPartBuilder.create().uv(16, 128).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(124, 96).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.1781F, 0.0F));

		ModelPartData body_r42 = cyl4.addChild("body_r42", ModelPartBuilder.create().uv(128, 15).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 101).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.7854F, 0.0F));

		ModelPartData body_r43 = cyl4.addChild("body_r43", ModelPartBuilder.create().uv(128, 12).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(54, 101).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.3927F, 0.0F));

		ModelPartData body_r44 = cyl4.addChild("body_r44", ModelPartBuilder.create().uv(128, 9).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(70, 92).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData body_r45 = cyl4.addChild("body_r45", ModelPartBuilder.create().uv(128, 6).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(128, 3).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -0.3927F, 0.0F));

		ModelPartData cyl5 = body.addChild("cyl5", ModelPartBuilder.create(), ModelTransform.pivot(-2.25F, 2.0F, 6.0F));

		ModelPartData body_r46 = cyl5.addChild("body_r46", ModelPartBuilder.create().uv(134, 66).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r47 = cyl5.addChild("body_r47", ModelPartBuilder.create().uv(134, 64).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r48 = cyl5.addChild("body_r48", ModelPartBuilder.create().uv(134, 62).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r49 = cyl5.addChild("body_r49", ModelPartBuilder.create().uv(134, 60).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r50 = cyl5.addChild("body_r50", ModelPartBuilder.create().uv(134, 58).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r51 = cyl5.addChild("body_r51", ModelPartBuilder.create().uv(134, 56).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r52 = cyl5.addChild("body_r52", ModelPartBuilder.create().uv(134, 54).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r53 = cyl5.addChild("body_r53", ModelPartBuilder.create().uv(132, 123).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r54 = cyl5.addChild("body_r54", ModelPartBuilder.create().uv(132, 78).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r55 = cyl5.addChild("body_r55", ModelPartBuilder.create().uv(96, 130).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r56 = cyl5.addChild("body_r56", ModelPartBuilder.create().uv(128, 123).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r57 = cyl5.addChild("body_r57", ModelPartBuilder.create().uv(128, 78).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r58 = cyl5.addChild("body_r58", ModelPartBuilder.create().uv(120, 88).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r59 = cyl5.addChild("body_r59", ModelPartBuilder.create().uv(116, 88).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r60 = cyl5.addChild("body_r60", ModelPartBuilder.create().uv(92, 30).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r61 = cyl5.addChild("body_r61", ModelPartBuilder.create().uv(44, 81).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cyl6 = body.addChild("cyl6", ModelPartBuilder.create().uv(70, 88).cuboid(-0.5F, -6.5F, -0.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.25F, 2.25F, 6.0F));

		ModelPartData body_r62 = cyl6.addChild("body_r62", ModelPartBuilder.create().uv(26, 124).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r63 = cyl6.addChild("body_r63", ModelPartBuilder.create().uv(18, 124).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r64 = cyl6.addChild("body_r64", ModelPartBuilder.create().uv(98, 90).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r65 = cyl6.addChild("body_r65", ModelPartBuilder.create().uv(62, 97).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r66 = cyl6.addChild("body_r66", ModelPartBuilder.create().uv(54, 97).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r67 = cyl6.addChild("body_r67", ModelPartBuilder.create().uv(26, 92).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r68 = cyl6.addChild("body_r68", ModelPartBuilder.create().uv(18, 92).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl7 = body.addChild("cyl7", ModelPartBuilder.create().uv(48, 44).cuboid(-1.0F, -9.0F, -2.5F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(2.25F, 6.0F, 6.5F));

		ModelPartData body_r69 = cyl7.addChild("body_r69", ModelPartBuilder.create().uv(0, 69).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r70 = cyl7.addChild("body_r70", ModelPartBuilder.create().uv(64, 66).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r71 = cyl7.addChild("body_r71", ModelPartBuilder.create().uv(48, 66).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r72 = cyl7.addChild("body_r72", ModelPartBuilder.create().uv(64, 44).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r73 = cyl7.addChild("body_r73", ModelPartBuilder.create().uv(64, 22).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r74 = cyl7.addChild("body_r74", ModelPartBuilder.create().uv(64, 0).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r75 = cyl7.addChild("body_r75", ModelPartBuilder.create().uv(32, 56).cuboid(-1.0F, -9.5F, -3.0F, 2.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl8 = body.addChild("cyl8", ModelPartBuilder.create().uv(34, 88).cuboid(-1.0F, 5.5F, -3.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(2.25F, -7.0F, 6.5F));

		ModelPartData body_r76 = cyl8.addChild("body_r76", ModelPartBuilder.create().uv(88, 95).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r77 = cyl8.addChild("body_r77", ModelPartBuilder.create().uv(70, 95).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r78 = cyl8.addChild("body_r78", ModelPartBuilder.create().uv(92, 18).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r79 = cyl8.addChild("body_r79", ModelPartBuilder.create().uv(92, 9).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r80 = cyl8.addChild("body_r80", ModelPartBuilder.create().uv(92, 0).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r81 = cyl8.addChild("body_r81", ModelPartBuilder.create().uv(0, 92).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r82 = cyl8.addChild("body_r82", ModelPartBuilder.create().uv(52, 88).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl9 = body.addChild("cyl9", ModelPartBuilder.create().uv(108, 99).cuboid(-1.0F, 5.5F, -3.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(2.25F, -1.5F, 6.5F));

		ModelPartData body_r83 = cyl9.addChild("body_r83", ModelPartBuilder.create().uv(54, 113).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r84 = cyl9.addChild("body_r84", ModelPartBuilder.create().uv(110, 18).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r85 = cyl9.addChild("body_r85", ModelPartBuilder.create().uv(110, 9).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r86 = cyl9.addChild("body_r86", ModelPartBuilder.create().uv(110, 0).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r87 = cyl9.addChild("body_r87", ModelPartBuilder.create().uv(0, 110).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r88 = cyl9.addChild("body_r88", ModelPartBuilder.create().uv(108, 108).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl10 = body.addChild("cyl10", ModelPartBuilder.create().uv(18, 97).cuboid(-1.0F, 5.5F, -3.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(2.25F, 3.75F, 6.5F));

		ModelPartData body_r89 = cyl10.addChild("body_r89", ModelPartBuilder.create().uv(98, 72).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r90 = cyl10.addChild("body_r90", ModelPartBuilder.create().uv(98, 63).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r91 = cyl10.addChild("body_r91", ModelPartBuilder.create().uv(98, 54).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r92 = cyl10.addChild("body_r92", ModelPartBuilder.create().uv(98, 45).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r93 = cyl10.addChild("body_r93", ModelPartBuilder.create().uv(98, 36).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r94 = cyl10.addChild("body_r94", ModelPartBuilder.create().uv(98, 27).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r95 = cyl10.addChild("body_r95", ModelPartBuilder.create().uv(36, 97).cuboid(-1.0F, 5.0F, -3.5F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl11 = body.addChild("cyl11", ModelPartBuilder.create(), ModelTransform.pivot(2.25F, 4.0F, 6.0F));

		ModelPartData body_r96 = cyl11.addChild("body_r96", ModelPartBuilder.create().uv(16, 134).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 131).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -0.7854F, 0.0F));

		ModelPartData body_r97 = cyl11.addChild("body_r97", ModelPartBuilder.create().uv(88, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 131).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.1781F, 0.0F));

		ModelPartData body_r98 = cyl11.addChild("body_r98", ModelPartBuilder.create().uv(80, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 131).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.5708F, 0.0F));

		ModelPartData body_r99 = cyl11.addChild("body_r99", ModelPartBuilder.create().uv(72, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 131).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.9635F, 0.0F));

		ModelPartData body_r100 = cyl11.addChild("body_r100", ModelPartBuilder.create().uv(64, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(88, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -2.3562F, 0.0F));

		ModelPartData body_r101 = cyl11.addChild("body_r101", ModelPartBuilder.create().uv(56, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(80, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -2.7489F, 0.0F));

		ModelPartData body_r102 = cyl11.addChild("body_r102", ModelPartBuilder.create().uv(48, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(72, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -3.1416F, 0.0F));

		ModelPartData body_r103 = cyl11.addChild("body_r103", ModelPartBuilder.create().uv(8, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 2.7489F, 0.0F));

		ModelPartData body_r104 = cyl11.addChild("body_r104", ModelPartBuilder.create().uv(0, 133).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 2.3562F, 0.0F));

		ModelPartData body_r105 = cyl11.addChild("body_r105", ModelPartBuilder.create().uv(112, 132).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.9635F, 0.0F));

		ModelPartData body_r106 = cyl11.addChild("body_r106", ModelPartBuilder.create().uv(104, 132).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.5708F, 0.0F));

		ModelPartData body_r107 = cyl11.addChild("body_r107", ModelPartBuilder.create().uv(132, 96).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 130).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.1781F, 0.0F));

		ModelPartData body_r108 = cyl11.addChild("body_r108", ModelPartBuilder.create().uv(96, 132).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(118, 129).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.7854F, 0.0F));

		ModelPartData body_r109 = cyl11.addChild("body_r109", ModelPartBuilder.create().uv(132, 93).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(110, 129).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.3927F, 0.0F));

		ModelPartData body_r110 = cyl11.addChild("body_r110", ModelPartBuilder.create().uv(132, 90).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 129).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData body_r111 = cyl11.addChild("body_r111", ModelPartBuilder.create().uv(132, 87).cuboid(-1.0F, -4.0F, 2.5F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(126, 131).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -0.3927F, 0.0F));

		ModelPartData cyl12 = body.addChild("cyl12", ModelPartBuilder.create(), ModelTransform.pivot(2.25F, 2.0F, 6.0F));

		ModelPartData body_r112 = cyl12.addChild("body_r112", ModelPartBuilder.create().uv(134, 125).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r113 = cyl12.addChild("body_r113", ModelPartBuilder.create().uv(124, 134).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r114 = cyl12.addChild("body_r114", ModelPartBuilder.create().uv(134, 115).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r115 = cyl12.addChild("body_r115", ModelPartBuilder.create().uv(134, 113).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r116 = cyl12.addChild("body_r116", ModelPartBuilder.create().uv(134, 111).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r117 = cyl12.addChild("body_r117", ModelPartBuilder.create().uv(134, 109).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r118 = cyl12.addChild("body_r118", ModelPartBuilder.create().uv(134, 107).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r119 = cyl12.addChild("body_r119", ModelPartBuilder.create().uv(134, 105).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r120 = cyl12.addChild("body_r120", ModelPartBuilder.create().uv(134, 103).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r121 = cyl12.addChild("body_r121", ModelPartBuilder.create().uv(134, 101).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r122 = cyl12.addChild("body_r122", ModelPartBuilder.create().uv(134, 99).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r123 = cyl12.addChild("body_r123", ModelPartBuilder.create().uv(134, 84).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r124 = cyl12.addChild("body_r124", ModelPartBuilder.create().uv(134, 82).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r125 = cyl12.addChild("body_r125", ModelPartBuilder.create().uv(134, 80).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r126 = cyl12.addChild("body_r126", ModelPartBuilder.create().uv(134, 70).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r127 = cyl12.addChild("body_r127", ModelPartBuilder.create().uv(134, 68).cuboid(-0.5F, 1.75F, -0.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData cyl13 = body.addChild("cyl13", ModelPartBuilder.create().uv(34, 124).cuboid(-0.5F, -6.5F, -0.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(2.25F, 2.25F, 6.0F));

		ModelPartData body_r128 = cyl13.addChild("body_r128", ModelPartBuilder.create().uv(126, 80).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r129 = cyl13.addChild("body_r129", ModelPartBuilder.create().uv(118, 125).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r130 = cyl13.addChild("body_r130", ModelPartBuilder.create().uv(110, 125).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r131 = cyl13.addChild("body_r131", ModelPartBuilder.create().uv(102, 125).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r132 = cyl13.addChild("body_r132", ModelPartBuilder.create().uv(124, 92).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r133 = cyl13.addChild("body_r133", ModelPartBuilder.create().uv(124, 88).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r134 = cyl13.addChild("body_r134", ModelPartBuilder.create().uv(42, 124).cuboid(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl14 = body.addChild("cyl14", ModelPartBuilder.create().uv(116, 80).cuboid(-0.5F, 3.0F, -1.5F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 8.75F));

		ModelPartData body_r135 = cyl14.addChild("body_r135", ModelPartBuilder.create().uv(84, 122).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r136 = cyl14.addChild("body_r136", ModelPartBuilder.create().uv(74, 122).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r137 = cyl14.addChild("body_r137", ModelPartBuilder.create().uv(64, 122).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r138 = cyl14.addChild("body_r138", ModelPartBuilder.create().uv(54, 122).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r139 = cyl14.addChild("body_r139", ModelPartBuilder.create().uv(0, 119).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r140 = cyl14.addChild("body_r140", ModelPartBuilder.create().uv(118, 117).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r141 = cyl14.addChild("body_r141", ModelPartBuilder.create().uv(108, 117).cuboid(-0.5F, 2.5F, -2.0F, 1.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl_top = body.addChild("cyl_top", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.25F, 8.5F));

		ModelPartData body_r142 = cyl_top.addChild("body_r142", ModelPartBuilder.create().uv(136, 121).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r143 = cyl_top.addChild("body_r143", ModelPartBuilder.create().uv(136, 119).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r144 = cyl_top.addChild("body_r144", ModelPartBuilder.create().uv(136, 117).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r145 = cyl_top.addChild("body_r145", ModelPartBuilder.create().uv(92, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r146 = cyl_top.addChild("body_r146", ModelPartBuilder.create().uv(88, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r147 = cyl_top.addChild("body_r147", ModelPartBuilder.create().uv(84, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r148 = cyl_top.addChild("body_r148", ModelPartBuilder.create().uv(80, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r149 = cyl_top.addChild("body_r149", ModelPartBuilder.create().uv(136, 78).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r150 = cyl_top.addChild("body_r150", ModelPartBuilder.create().uv(136, 76).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r151 = cyl_top.addChild("body_r151", ModelPartBuilder.create().uv(76, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r152 = cyl_top.addChild("body_r152", ModelPartBuilder.create().uv(136, 74).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r153 = cyl_top.addChild("body_r153", ModelPartBuilder.create().uv(136, 72).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r154 = cyl_top.addChild("body_r154", ModelPartBuilder.create().uv(72, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r155 = cyl_top.addChild("body_r155", ModelPartBuilder.create().uv(68, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r156 = cyl_top.addChild("body_r156", ModelPartBuilder.create().uv(64, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r157 = cyl_top.addChild("body_r157", ModelPartBuilder.create().uv(60, 136).cuboid(-0.5F, -1.75F, 2.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.75F, 1.0F, 1.0472F, 0.0F, 0.0F));

		ModelPartData body_r158 = cyl_top.addChild("body_r158", ModelPartBuilder.create().uv(56, 136).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(136, 2).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -0.7854F, 0.0F));

		ModelPartData body_r159 = cyl_top.addChild("body_r159", ModelPartBuilder.create().uv(52, 136).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(136, 0).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.1781F, 0.0F));

		ModelPartData body_r160 = cyl_top.addChild("body_r160", ModelPartBuilder.create().uv(48, 136).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 136).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.5708F, 0.0F));

		ModelPartData body_r161 = cyl_top.addChild("body_r161", ModelPartBuilder.create().uv(136, 24).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(120, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -1.9635F, 0.0F));

		ModelPartData body_r162 = cyl_top.addChild("body_r162", ModelPartBuilder.create().uv(136, 22).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(116, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -2.3562F, 0.0F));

		ModelPartData body_r163 = cyl_top.addChild("body_r163", ModelPartBuilder.create().uv(136, 20).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(112, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -2.7489F, 0.0F));

		ModelPartData body_r164 = cyl_top.addChild("body_r164", ModelPartBuilder.create().uv(136, 18).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(108, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -3.1416F, 0.0F));

		ModelPartData body_r165 = cyl_top.addChild("body_r165", ModelPartBuilder.create().uv(136, 16).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 2.7489F, 0.0F));

		ModelPartData body_r166 = cyl_top.addChild("body_r166", ModelPartBuilder.create().uv(136, 14).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 2.3562F, 0.0F));

		ModelPartData body_r167 = cyl_top.addChild("body_r167", ModelPartBuilder.create().uv(136, 12).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 135).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.9635F, 0.0F));

		ModelPartData body_r168 = cyl_top.addChild("body_r168", ModelPartBuilder.create().uv(12, 136).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(132, 134).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.5708F, 0.0F));

		ModelPartData body_r169 = cyl_top.addChild("body_r169", ModelPartBuilder.create().uv(136, 10).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 131).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 1.1781F, 0.0F));

		ModelPartData body_r170 = cyl_top.addChild("body_r170", ModelPartBuilder.create().uv(136, 8).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 129).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.7854F, 0.0F));

		ModelPartData body_r171 = cyl_top.addChild("body_r171", ModelPartBuilder.create().uv(8, 136).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(128, 134).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.3927F, 0.0F));

		ModelPartData body_r172 = cyl_top.addChild("body_r172", ModelPartBuilder.create().uv(136, 6).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(134, 127).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData body_r173 = cyl_top.addChild("body_r173", ModelPartBuilder.create().uv(136, 4).cuboid(-0.5F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 136).cuboid(-0.5F, -3.0F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 1.0F, 0.48F, -0.3927F, 0.0F));

		ModelPartData cyl_bottom = body.addChild("cyl_bottom", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.25F, 8.5F));

		ModelPartData body_r174 = cyl_bottom.addChild("body_r174", ModelPartBuilder.create().uv(100, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -0.3927F, 0.0F));

		ModelPartData body_r175 = cyl_bottom.addChild("body_r175", ModelPartBuilder.create().uv(96, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -0.7854F, 0.0F));

		ModelPartData body_r176 = cyl_bottom.addChild("body_r176", ModelPartBuilder.create().uv(44, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -1.1781F, 0.0F));

		ModelPartData body_r177 = cyl_bottom.addChild("body_r177", ModelPartBuilder.create().uv(40, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -1.5708F, 0.0F));

		ModelPartData body_r178 = cyl_bottom.addChild("body_r178", ModelPartBuilder.create().uv(36, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -1.9635F, 0.0F));

		ModelPartData body_r179 = cyl_bottom.addChild("body_r179", ModelPartBuilder.create().uv(32, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -2.3562F, 0.0F));

		ModelPartData body_r180 = cyl_bottom.addChild("body_r180", ModelPartBuilder.create().uv(28, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -2.7489F, 0.0F));

		ModelPartData body_r181 = cyl_bottom.addChild("body_r181", ModelPartBuilder.create().uv(24, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, -3.1416F, 0.0F));

		ModelPartData body_r182 = cyl_bottom.addChild("body_r182", ModelPartBuilder.create().uv(20, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 2.7489F, 0.0F));

		ModelPartData body_r183 = cyl_bottom.addChild("body_r183", ModelPartBuilder.create().uv(16, 137).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 2.3562F, 0.0F));

		ModelPartData body_r184 = cyl_bottom.addChild("body_r184", ModelPartBuilder.create().uv(136, 135).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 1.9635F, 0.0F));

		ModelPartData body_r185 = cyl_bottom.addChild("body_r185", ModelPartBuilder.create().uv(136, 133).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 1.5708F, 0.0F));

		ModelPartData body_r186 = cyl_bottom.addChild("body_r186", ModelPartBuilder.create().uv(132, 136).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 1.1781F, 0.0F));

		ModelPartData body_r187 = cyl_bottom.addChild("body_r187", ModelPartBuilder.create().uv(128, 136).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 0.7854F, 0.0F));

		ModelPartData body_r188 = cyl_bottom.addChild("body_r188", ModelPartBuilder.create().uv(124, 136).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 0.3927F, 0.0F));

		ModelPartData body_r189 = cyl_bottom.addChild("body_r189", ModelPartBuilder.create().uv(136, 123).cuboid(-0.5F, 1.5F, 1.75F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.75F, 1.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData body_r190 = cyl_bottom.addChild("body_r190", ModelPartBuilder.create().uv(134, 51).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 124).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -0.7854F, 0.0F));

		ModelPartData body_r191 = cyl_bottom.addChild("body_r191", ModelPartBuilder.create().uv(134, 48).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 122).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -1.1781F, 0.0F));

		ModelPartData body_r192 = cyl_bottom.addChild("body_r192", ModelPartBuilder.create().uv(134, 45).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 27).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -1.5708F, 0.0F));

		ModelPartData body_r193 = cyl_bottom.addChild("body_r193", ModelPartBuilder.create().uv(44, 134).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 78).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -1.9635F, 0.0F));

		ModelPartData body_r194 = cyl_bottom.addChild("body_r194", ModelPartBuilder.create().uv(134, 42).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 75).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -2.3562F, 0.0F));

		ModelPartData body_r195 = cyl_bottom.addChild("body_r195", ModelPartBuilder.create().uv(40, 134).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 72).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -2.7489F, 0.0F));

		ModelPartData body_r196 = cyl_bottom.addChild("body_r196", ModelPartBuilder.create().uv(134, 39).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 69).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -3.1416F, 0.0F));

		ModelPartData body_r197 = cyl_bottom.addChild("body_r197", ModelPartBuilder.create().uv(134, 36).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 9).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 2.7489F, 0.0F));

		ModelPartData body_r198 = cyl_bottom.addChild("body_r198", ModelPartBuilder.create().uv(36, 134).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 6).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 2.3562F, 0.0F));

		ModelPartData body_r199 = cyl_bottom.addChild("body_r199", ModelPartBuilder.create().uv(134, 33).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 3).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 1.9635F, 0.0F));

		ModelPartData body_r200 = cyl_bottom.addChild("body_r200", ModelPartBuilder.create().uv(32, 134).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 0).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 1.5708F, 0.0F));

		ModelPartData body_r201 = cyl_bottom.addChild("body_r201", ModelPartBuilder.create().uv(134, 30).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 21).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 1.1781F, 0.0F));

		ModelPartData body_r202 = cyl_bottom.addChild("body_r202", ModelPartBuilder.create().uv(28, 134).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 18).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 0.7854F, 0.0F));

		ModelPartData body_r203 = cyl_bottom.addChild("body_r203", ModelPartBuilder.create().uv(134, 27).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 15).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 0.3927F, 0.0F));

		ModelPartData body_r204 = cyl_bottom.addChild("body_r204", ModelPartBuilder.create().uv(24, 134).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 12).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData body_r205 = cyl_bottom.addChild("body_r205", ModelPartBuilder.create().uv(120, 132).cuboid(-0.5F, 0.5F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 127).cuboid(-0.5F, 0.5F, 1.75F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.25F, 1.0F, -0.3927F, -0.3927F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}