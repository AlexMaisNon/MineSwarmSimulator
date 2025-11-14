// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class CoconutCanisterModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart cyl;
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
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public CoconutCanisterModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
		// this.body = root.getChild("body");
		// this.cyl = root.getChild("cyl");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(68, 24).cuboid(-8.0F, -3.5F, 3.5F, 16.0F, 7.0F, 7.0F, new Dilation(0.0F))
		.uv(226, 251).cuboid(-7.0F, -2.0F, 10.5F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.25F, 12.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(90, 73).cuboid(-2.0F, 4.75F, 11.75F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r2 = cyl.addChild("body_r2", ModelPartBuilder.create().uv(24, 98).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -0.3927F, 0.0F));

		ModelPartData body_r3 = cyl.addChild("body_r3", ModelPartBuilder.create().uv(12, 98).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -0.7854F, 0.0F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(0, 98).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -1.1781F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(96, 97).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(84, 97).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -1.9635F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(72, 93).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -2.3562F, 0.0F));

		ModelPartData body_r8 = cyl.addChild("body_r8", ModelPartBuilder.create().uv(60, 93).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -2.7489F, 0.0F));

		ModelPartData body_r9 = cyl.addChild("body_r9", ModelPartBuilder.create().uv(48, 93).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, -3.1416F, 0.0F));

		ModelPartData body_r10 = cyl.addChild("body_r10", ModelPartBuilder.create().uv(36, 92).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r11 = cyl.addChild("body_r11", ModelPartBuilder.create().uv(24, 92).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r12 = cyl.addChild("body_r12", ModelPartBuilder.create().uv(12, 92).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r13 = cyl.addChild("body_r13", ModelPartBuilder.create().uv(0, 92).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r14 = cyl.addChild("body_r14", ModelPartBuilder.create().uv(90, 91).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r15 = cyl.addChild("body_r15", ModelPartBuilder.create().uv(90, 85).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r16 = cyl.addChild("body_r16", ModelPartBuilder.create().uv(90, 79).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r17 = cyl2.addChild("body_r17", ModelPartBuilder.create().uv(104, 44).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -0.3927F, 0.0F));

		ModelPartData body_r18 = cyl2.addChild("body_r18", ModelPartBuilder.create().uv(104, 38).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -0.7854F, 0.0F));

		ModelPartData body_r19 = cyl2.addChild("body_r19", ModelPartBuilder.create().uv(36, 104).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -1.1781F, 0.0F));

		ModelPartData body_r20 = cyl2.addChild("body_r20", ModelPartBuilder.create().uv(24, 104).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -1.5708F, 0.0F));

		ModelPartData body_r21 = cyl2.addChild("body_r21", ModelPartBuilder.create().uv(12, 104).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -1.9635F, 0.0F));

		ModelPartData body_r22 = cyl2.addChild("body_r22", ModelPartBuilder.create().uv(0, 104).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -2.3562F, 0.0F));

		ModelPartData body_r23 = cyl2.addChild("body_r23", ModelPartBuilder.create().uv(96, 103).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -2.7489F, 0.0F));

		ModelPartData body_r24 = cyl2.addChild("body_r24", ModelPartBuilder.create().uv(84, 103).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, -3.1416F, 0.0F));

		ModelPartData body_r25 = cyl2.addChild("body_r25", ModelPartBuilder.create().uv(102, 91).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 2.7489F, 0.0F));

		ModelPartData body_r26 = cyl2.addChild("body_r26", ModelPartBuilder.create().uv(102, 85).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 2.3562F, 0.0F));

		ModelPartData body_r27 = cyl2.addChild("body_r27", ModelPartBuilder.create().uv(102, 79).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 1.9635F, 0.0F));

		ModelPartData body_r28 = cyl2.addChild("body_r28", ModelPartBuilder.create().uv(102, 73).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 1.5708F, 0.0F));

		ModelPartData body_r29 = cyl2.addChild("body_r29", ModelPartBuilder.create().uv(72, 99).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 1.1781F, 0.0F));

		ModelPartData body_r30 = cyl2.addChild("body_r30", ModelPartBuilder.create().uv(60, 99).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 0.7854F, 0.0F));

		ModelPartData body_r31 = cyl2.addChild("body_r31", ModelPartBuilder.create().uv(48, 99).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 0.3927F, 0.0F));

		ModelPartData body_r32 = cyl2.addChild("body_r32", ModelPartBuilder.create().uv(36, 98).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cyl3 = body.addChild("cyl3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r33 = cyl3.addChild("body_r33", ModelPartBuilder.create().uv(30, 116).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r34 = cyl3.addChild("body_r34", ModelPartBuilder.create().uv(20, 116).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r35 = cyl3.addChild("body_r35", ModelPartBuilder.create().uv(10, 116).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r36 = cyl3.addChild("body_r36", ModelPartBuilder.create().uv(0, 116).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r37 = cyl3.addChild("body_r37", ModelPartBuilder.create().uv(110, 115).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r38 = cyl3.addChild("body_r38", ModelPartBuilder.create().uv(100, 115).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r39 = cyl3.addChild("body_r39", ModelPartBuilder.create().uv(90, 115).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r40 = cyl3.addChild("body_r40", ModelPartBuilder.create().uv(80, 115).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r41 = cyl3.addChild("body_r41", ModelPartBuilder.create().uv(114, 86).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r42 = cyl3.addChild("body_r42", ModelPartBuilder.create().uv(114, 80).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r43 = cyl3.addChild("body_r43", ModelPartBuilder.create().uv(114, 74).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r44 = cyl3.addChild("body_r44", ModelPartBuilder.create().uv(114, 68).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r45 = cyl3.addChild("body_r45", ModelPartBuilder.create().uv(114, 30).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r46 = cyl3.addChild("body_r46", ModelPartBuilder.create().uv(114, 24).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r47 = cyl3.addChild("body_r47", ModelPartBuilder.create().uv(70, 111).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r48 = cyl3.addChild("body_r48", ModelPartBuilder.create().uv(60, 111).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cyl4 = body.addChild("cyl4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r49 = cyl4.addChild("body_r49", ModelPartBuilder.create().uv(124, 24).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -0.3927F, 0.0F));

		ModelPartData body_r50 = cyl4.addChild("body_r50", ModelPartBuilder.create().uv(72, 123).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -0.7854F, 0.0F));

		ModelPartData body_r51 = cyl4.addChild("body_r51", ModelPartBuilder.create().uv(64, 123).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -1.1781F, 0.0F));

		ModelPartData body_r52 = cyl4.addChild("body_r52", ModelPartBuilder.create().uv(56, 123).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -1.5708F, 0.0F));

		ModelPartData body_r53 = cyl4.addChild("body_r53", ModelPartBuilder.create().uv(48, 123).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -1.9635F, 0.0F));

		ModelPartData body_r54 = cyl4.addChild("body_r54", ModelPartBuilder.create().uv(40, 123).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -2.3562F, 0.0F));

		ModelPartData body_r55 = cyl4.addChild("body_r55", ModelPartBuilder.create().uv(122, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -2.7489F, 0.0F));

		ModelPartData body_r56 = cyl4.addChild("body_r56", ModelPartBuilder.create().uv(114, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, -3.1416F, 0.0F));

		ModelPartData body_r57 = cyl4.addChild("body_r57", ModelPartBuilder.create().uv(32, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 2.7489F, 0.0F));

		ModelPartData body_r58 = cyl4.addChild("body_r58", ModelPartBuilder.create().uv(24, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 2.3562F, 0.0F));

		ModelPartData body_r59 = cyl4.addChild("body_r59", ModelPartBuilder.create().uv(16, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 1.9635F, 0.0F));

		ModelPartData body_r60 = cyl4.addChild("body_r60", ModelPartBuilder.create().uv(8, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 1.5708F, 0.0F));

		ModelPartData body_r61 = cyl4.addChild("body_r61", ModelPartBuilder.create().uv(0, 122).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 1.1781F, 0.0F));

		ModelPartData body_r62 = cyl4.addChild("body_r62", ModelPartBuilder.create().uv(106, 121).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 0.7854F, 0.0F));

		ModelPartData body_r63 = cyl4.addChild("body_r63", ModelPartBuilder.create().uv(98, 121).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 0.3927F, 0.0F));

		ModelPartData body_r64 = cyl4.addChild("body_r64", ModelPartBuilder.create().uv(90, 121).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.1781F, 0.0F, 0.0F));

		ModelPartData cyl5 = body.addChild("cyl5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r65 = cyl5.addChild("body_r65", ModelPartBuilder.create().uv(126, 42).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -0.3927F, 0.0F));

		ModelPartData body_r66 = cyl5.addChild("body_r66", ModelPartBuilder.create().uv(124, 78).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -0.7854F, 0.0F));

		ModelPartData body_r67 = cyl5.addChild("body_r67", ModelPartBuilder.create().uv(124, 72).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -1.1781F, 0.0F));

		ModelPartData body_r68 = cyl5.addChild("body_r68", ModelPartBuilder.create().uv(124, 66).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -1.5708F, 0.0F));

		ModelPartData body_r69 = cyl5.addChild("body_r69", ModelPartBuilder.create().uv(124, 30).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -1.9635F, 0.0F));

		ModelPartData body_r70 = cyl5.addChild("body_r70", ModelPartBuilder.create().uv(124, 84).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -2.3562F, 0.0F));

		ModelPartData body_r71 = cyl5.addChild("body_r71", ModelPartBuilder.create().uv(126, 36).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, -2.7489F, 0.0F));

		ModelPartData body_r72 = cyl5.addChild("body_r72", ModelPartBuilder.create().uv(126, 48).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cyl6 = body.addChild("cyl6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r73 = cyl6.addChild("body_r73", ModelPartBuilder.create().uv(48, 111).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -0.3927F, 0.0F));

		ModelPartData body_r74 = cyl6.addChild("body_r74", ModelPartBuilder.create().uv(36, 110).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -0.7854F, 0.0F));

		ModelPartData body_r75 = cyl6.addChild("body_r75", ModelPartBuilder.create().uv(24, 110).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -1.1781F, 0.0F));

		ModelPartData body_r76 = cyl6.addChild("body_r76", ModelPartBuilder.create().uv(12, 110).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -1.5708F, 0.0F));

		ModelPartData body_r77 = cyl6.addChild("body_r77", ModelPartBuilder.create().uv(0, 110).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -1.9635F, 0.0F));

		ModelPartData body_r78 = cyl6.addChild("body_r78", ModelPartBuilder.create().uv(108, 109).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -2.3562F, 0.0F));

		ModelPartData body_r79 = cyl6.addChild("body_r79", ModelPartBuilder.create().uv(96, 109).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, -2.7489F, 0.0F));

		ModelPartData body_r80 = cyl6.addChild("body_r80", ModelPartBuilder.create().uv(84, 109).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 3.1416F, 0.0F));

		ModelPartData body_r81 = cyl6.addChild("body_r81", ModelPartBuilder.create().uv(108, 103).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 2.7489F, 0.0F));

		ModelPartData body_r82 = cyl6.addChild("body_r82", ModelPartBuilder.create().uv(108, 97).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 2.3562F, 0.0F));

		ModelPartData body_r83 = cyl6.addChild("body_r83", ModelPartBuilder.create().uv(72, 105).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 1.9635F, 0.0F));

		ModelPartData body_r84 = cyl6.addChild("body_r84", ModelPartBuilder.create().uv(60, 105).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 1.5708F, 0.0F));

		ModelPartData body_r85 = cyl6.addChild("body_r85", ModelPartBuilder.create().uv(48, 105).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 1.1781F, 0.0F));

		ModelPartData body_r86 = cyl6.addChild("body_r86", ModelPartBuilder.create().uv(104, 62).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 0.7854F, 0.0F));

		ModelPartData body_r87 = cyl6.addChild("body_r87", ModelPartBuilder.create().uv(104, 56).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 0.3927F, 0.0F));

		ModelPartData body_r88 = cyl6.addChild("body_r88", ModelPartBuilder.create().uv(104, 50).cuboid(-2.0F, -2.0F, 8.25F, 4.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cyl7 = body.addChild("cyl7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r89 = cyl7.addChild("body_r89", ModelPartBuilder.create().uv(80, 121).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r90 = cyl7.addChild("body_r90", ModelPartBuilder.create().uv(120, 116).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r91 = cyl7.addChild("body_r91", ModelPartBuilder.create().uv(120, 110).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r92 = cyl7.addChild("body_r92", ModelPartBuilder.create().uv(120, 104).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r93 = cyl7.addChild("body_r93", ModelPartBuilder.create().uv(120, 98).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r94 = cyl7.addChild("body_r94", ModelPartBuilder.create().uv(120, 92).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r95 = cyl7.addChild("body_r95", ModelPartBuilder.create().uv(70, 117).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r96 = cyl7.addChild("body_r96", ModelPartBuilder.create().uv(60, 117).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 3.1416F, 0.0F));

		ModelPartData body_r97 = cyl7.addChild("body_r97", ModelPartBuilder.create().uv(50, 117).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r98 = cyl7.addChild("body_r98", ModelPartBuilder.create().uv(40, 117).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r99 = cyl7.addChild("body_r99", ModelPartBuilder.create().uv(116, 60).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r100 = cyl7.addChild("body_r100", ModelPartBuilder.create().uv(116, 54).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r101 = cyl7.addChild("body_r101", ModelPartBuilder.create().uv(116, 48).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r102 = cyl7.addChild("body_r102", ModelPartBuilder.create().uv(116, 42).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r103 = cyl7.addChild("body_r103", ModelPartBuilder.create().uv(116, 36).cuboid(-1.5F, -2.0F, 8.25F, 3.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r104 = cyl7.addChild("body_r104", ModelPartBuilder.create().uv(48, 129).cuboid(-1.5F, -1.75F, 8.25F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 68).cuboid(-1.5F, 0.0F, 8.25F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl8 = body.addChild("cyl8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r105 = cyl8.addChild("body_r105", ModelPartBuilder.create().uv(130, 102).cuboid(-1.0F, -2.0F, 8.25F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -0.3927F, 0.0F));

		ModelPartData body_r106 = cyl8.addChild("body_r106", ModelPartBuilder.create().uv(96, 127).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -0.7854F, 0.0F));

		ModelPartData body_r107 = cyl8.addChild("body_r107", ModelPartBuilder.create().uv(130, 90).cuboid(0.0F, -2.0F, 8.25F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(130, 117).cuboid(-1.0F, 1.0F, 8.25F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -1.1781F, 0.0F));

		ModelPartData body_r108 = cyl8.addChild("body_r108", ModelPartBuilder.create().uv(130, 114).cuboid(-1.0F, 1.0F, 8.25F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -1.5708F, 0.0F));

		ModelPartData body_r109 = cyl8.addChild("body_r109", ModelPartBuilder.create().uv(114, 92).cuboid(0.0F, 1.0F, 8.25F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(70, 129).cuboid(-1.0F, -2.0F, 8.25F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -1.9635F, 0.0F));

		ModelPartData body_r110 = cyl8.addChild("body_r110", ModelPartBuilder.create().uv(88, 127).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -2.3562F, 0.0F));

		ModelPartData body_r111 = cyl8.addChild("body_r111", ModelPartBuilder.create().uv(80, 127).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, -2.7489F, 0.0F));

		ModelPartData body_r112 = cyl8.addChild("body_r112", ModelPartBuilder.create().uv(126, 60).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 3.1416F, 0.0F));

		ModelPartData body_r113 = cyl8.addChild("body_r113", ModelPartBuilder.create().uv(126, 54).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 2.7489F, 0.0F));

		ModelPartData body_r114 = cyl8.addChild("body_r114", ModelPartBuilder.create().uv(128, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 2.3562F, 0.0F));

		ModelPartData body_r115 = cyl8.addChild("body_r115", ModelPartBuilder.create().uv(98, 38).cuboid(-1.0F, 1.0F, 8.25F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 129).cuboid(0.0F, -2.0F, 8.25F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 1.9635F, 0.0F));

		ModelPartData body_r116 = cyl8.addChild("body_r116", ModelPartBuilder.create().uv(130, 111).cuboid(-1.0F, 1.0F, 8.25F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 1.5708F, 0.0F));

		ModelPartData body_r117 = cyl8.addChild("body_r117", ModelPartBuilder.create().uv(84, 93).cuboid(0.0F, 1.0F, 8.25F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 129).cuboid(-1.0F, -2.0F, 8.25F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 1.1781F, 0.0F));

		ModelPartData body_r118 = cyl8.addChild("body_r118", ModelPartBuilder.create().uv(40, 129).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 0.7854F, 0.0F));

		ModelPartData body_r119 = cyl8.addChild("body_r119", ModelPartBuilder.create().uv(130, 96).cuboid(0.0F, -2.0F, 8.25F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 0.3927F, 0.0F));

		ModelPartData body_r120 = cyl8.addChild("body_r120", ModelPartBuilder.create().uv(130, 108).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.1781F, 0.0F, 0.0F));

		ModelPartData cyl9 = body.addChild("cyl9", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r121 = cyl9.addChild("body_r121", ModelPartBuilder.create().uv(120, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 2.7489F, 0.0F));

		ModelPartData body_r122 = cyl9.addChild("body_r122", ModelPartBuilder.create().uv(112, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 2.3562F, 0.0F));

		ModelPartData body_r123 = cyl9.addChild("body_r123", ModelPartBuilder.create().uv(32, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 1.9635F, 0.0F));

		ModelPartData body_r124 = cyl9.addChild("body_r124", ModelPartBuilder.create().uv(24, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 1.5708F, 0.0F));

		ModelPartData body_r125 = cyl9.addChild("body_r125", ModelPartBuilder.create().uv(16, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 1.1781F, 0.0F));

		ModelPartData body_r126 = cyl9.addChild("body_r126", ModelPartBuilder.create().uv(8, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 0.7854F, 0.0F));

		ModelPartData body_r127 = cyl9.addChild("body_r127", ModelPartBuilder.create().uv(0, 128).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 0.3927F, 0.0F));

		ModelPartData body_r128 = cyl9.addChild("body_r128", ModelPartBuilder.create().uv(104, 127).cuboid(-1.0F, -2.0F, 8.25F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.75F, 3.5F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cyl10 = body.addChild("cyl10", ModelPartBuilder.create().uv(0, 0).cuboid(-17.5F, -1.0F, -4.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(5.5F, 6.25F, 11.0F));

		ModelPartData body_r129 = cyl10.addChild("body_r129", ModelPartBuilder.create().uv(68, 12).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -2.7489F, 0.0F, 0.0F));

		ModelPartData body_r130 = cyl10.addChild("body_r130", ModelPartBuilder.create().uv(68, 0).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -2.3562F, 0.0F, 0.0F));

		ModelPartData body_r131 = cyl10.addChild("body_r131", ModelPartBuilder.create().uv(0, 60).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.9635F, 0.0F, 0.0F));

		ModelPartData body_r132 = cyl10.addChild("body_r132", ModelPartBuilder.create().uv(0, 48).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData body_r133 = cyl10.addChild("body_r133", ModelPartBuilder.create().uv(0, 36).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.1781F, 0.0F, 0.0F));

		ModelPartData body_r134 = cyl10.addChild("body_r134", ModelPartBuilder.create().uv(0, 24).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData body_r135 = cyl10.addChild("body_r135", ModelPartBuilder.create().uv(0, 12).cuboid(-23.5F, -1.0F, -5.0F, 24.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cyl11 = body.addChild("cyl11", ModelPartBuilder.create().uv(68, 43).cuboid(5.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(-18.5F, 6.25F, 11.0F));

		ModelPartData body_r136 = cyl11.addChild("body_r136", ModelPartBuilder.create().uv(72, 73).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -2.7489F, 0.0F, 0.0F));

		ModelPartData body_r137 = cyl11.addChild("body_r137", ModelPartBuilder.create().uv(54, 73).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -2.3562F, 0.0F, 0.0F));

		ModelPartData body_r138 = cyl11.addChild("body_r138", ModelPartBuilder.create().uv(36, 72).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.9635F, 0.0F, 0.0F));

		ModelPartData body_r139 = cyl11.addChild("body_r139", ModelPartBuilder.create().uv(18, 72).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData body_r140 = cyl11.addChild("body_r140", ModelPartBuilder.create().uv(0, 72).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.1781F, 0.0F, 0.0F));

		ModelPartData body_r141 = cyl11.addChild("body_r141", ModelPartBuilder.create().uv(68, 63).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData body_r142 = cyl11.addChild("body_r142", ModelPartBuilder.create().uv(68, 53).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cyl12 = body.addChild("cyl12", ModelPartBuilder.create().uv(0, 82).cuboid(5.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(6.5F, 6.25F, 11.0F));

		ModelPartData body_r143 = cyl12.addChild("body_r143", ModelPartBuilder.create().uv(86, 63).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -2.7489F, 0.0F, 0.0F));

		ModelPartData body_r144 = cyl12.addChild("body_r144", ModelPartBuilder.create().uv(86, 53).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -2.3562F, 0.0F, 0.0F));

		ModelPartData body_r145 = cyl12.addChild("body_r145", ModelPartBuilder.create().uv(86, 43).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.9635F, 0.0F, 0.0F));

		ModelPartData body_r146 = cyl12.addChild("body_r146", ModelPartBuilder.create().uv(72, 83).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData body_r147 = cyl12.addChild("body_r147", ModelPartBuilder.create().uv(54, 83).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -1.1781F, 0.0F, 0.0F));

		ModelPartData body_r148 = cyl12.addChild("body_r148", ModelPartBuilder.create().uv(36, 82).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData body_r149 = cyl12.addChild("body_r149", ModelPartBuilder.create().uv(18, 82).cuboid(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 0.0F, 1.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}