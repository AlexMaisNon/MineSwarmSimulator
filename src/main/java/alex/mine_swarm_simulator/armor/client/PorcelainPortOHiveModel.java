// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class PorcelainPortOHiveModel {
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
	// private final ModelPart cyl15;
	// private final ModelPart cyl16;
	// private final ModelPart cyl17;
	// private final ModelPart cyl18;
	// private final ModelPart cyl19;
	// private final ModelPart cyl20;
	// private final ModelPart cyl21;
	// private final ModelPart cyl22;
	// private final ModelPart cyl23;
	// private final ModelPart cyl24;
	// private final ModelPart cyl25;
	// private final ModelPart cyl26;
	// private final ModelPart cyl27;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public PorcelainPortOHiveModel(ModelPart root) {
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
		// this.cyl15 = root.getChild("cyl15");
		// this.cyl16 = root.getChild("cyl16");
		// this.cyl17 = root.getChild("cyl17");
		// this.cyl18 = root.getChild("cyl18");
		// this.cyl19 = root.getChild("cyl19");
		// this.cyl20 = root.getChild("cyl20");
		// this.cyl21 = root.getChild("cyl21");
		// this.cyl22 = root.getChild("cyl22");
		// this.cyl23 = root.getChild("cyl23");
		// this.cyl24 = root.getChild("cyl24");
		// this.cyl25 = root.getChild("cyl25");
		// this.cyl26 = root.getChild("cyl26");
		// this.cyl27 = root.getChild("cyl27");
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(226, 251).cuboid(-7.0F, 4.25F, 17.75F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, 2.75F, 13.0F, 16.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(48, 184).cuboid(-7.5F, 1.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 187).cuboid(-10.0F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(42, 187).cuboid(-10.0F, -2.5F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 5).cuboid(-5.0F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, 6.5F, 13.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(32, 184).cuboid(-5.0F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.5355F, 7.5F, 9.4645F, -0.1719F, -0.7703F, 0.2444F));

		ModelPartData body_r3 = body.addChild("body_r3", ModelPartBuilder.create().uv(180, 184).cuboid(-5.0F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.5355F, 5.5F, 9.4645F, -0.1719F, -0.7703F, 0.2444F));

		ModelPartData body_r4 = body.addChild("body_r4", ModelPartBuilder.create().uv(60, 156).cuboid(4.5F, 1.5F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(14, 187).cuboid(5.0F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 187).cuboid(5.0F, -2.5F, -1.0F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(42, 5).cuboid(0.0F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 6.5F, 13.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r5 = body.addChild("body_r5", ModelPartBuilder.create().uv(16, 184).cuboid(-1.0F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.5355F, 7.5F, 9.4645F, -0.1719F, 0.7703F, -0.2444F));

		ModelPartData body_r6 = body.addChild("body_r6", ModelPartBuilder.create().uv(0, 184).cuboid(-1.0F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.5355F, 5.5F, 9.4645F, -0.1719F, 0.7703F, -0.2444F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(0, 12).cuboid(-1.5F, 6.0F, -7.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 8.5F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(36, 60).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r8 = cyl.addChild("body_r8", ModelPartBuilder.create().uv(0, 60).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r9 = cyl.addChild("body_r9", ModelPartBuilder.create().uv(36, 44).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r10 = cyl.addChild("body_r10", ModelPartBuilder.create().uv(0, 44).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r11 = cyl.addChild("body_r11", ModelPartBuilder.create().uv(36, 28).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r12 = cyl.addChild("body_r12", ModelPartBuilder.create().uv(36, 12).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r13 = cyl.addChild("body_r13", ModelPartBuilder.create().uv(0, 28).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl1 = body.addChild("cyl1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.75F, 8.0F));

		ModelPartData body_r14 = cyl1.addChild("body_r14", ModelPartBuilder.create().uv(24, 201).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r15 = cyl1.addChild("body_r15", ModelPartBuilder.create().uv(16, 201).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r16 = cyl1.addChild("body_r16", ModelPartBuilder.create().uv(8, 201).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r17 = cyl1.addChild("body_r17", ModelPartBuilder.create().uv(0, 201).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r18 = cyl1.addChild("body_r18", ModelPartBuilder.create().uv(200, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r19 = cyl1.addChild("body_r19", ModelPartBuilder.create().uv(200, 198).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r20 = cyl1.addChild("body_r20", ModelPartBuilder.create().uv(200, 196).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r21 = cyl1.addChild("body_r21", ModelPartBuilder.create().uv(200, 194).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r22 = cyl1.addChild("body_r22", ModelPartBuilder.create().uv(200, 192).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r23 = cyl1.addChild("body_r23", ModelPartBuilder.create().uv(200, 190).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r24 = cyl1.addChild("body_r24", ModelPartBuilder.create().uv(168, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r25 = cyl1.addChild("body_r25", ModelPartBuilder.create().uv(160, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r26 = cyl1.addChild("body_r26", ModelPartBuilder.create().uv(152, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r27 = cyl1.addChild("body_r27", ModelPartBuilder.create().uv(144, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r28 = cyl1.addChild("body_r28", ModelPartBuilder.create().uv(136, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r29 = cyl1.addChild("body_r29", ModelPartBuilder.create().uv(128, 200).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 7.0F, 8.0F));

		ModelPartData body_r30 = cyl2.addChild("body_r30", ModelPartBuilder.create().uv(96, 191).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.3927F, 0.0F));

		ModelPartData body_r31 = cyl2.addChild("body_r31", ModelPartBuilder.create().uv(88, 191).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.7854F, 0.0F));

		ModelPartData body_r32 = cyl2.addChild("body_r32", ModelPartBuilder.create().uv(80, 191).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.1781F, 0.0F));

		ModelPartData body_r33 = cyl2.addChild("body_r33", ModelPartBuilder.create().uv(72, 191).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.5708F, 0.0F));

		ModelPartData body_r34 = cyl2.addChild("body_r34", ModelPartBuilder.create().uv(64, 191).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.9635F, 0.0F));

		ModelPartData body_r35 = cyl2.addChild("body_r35", ModelPartBuilder.create().uv(56, 191).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.3562F, 0.0F));

		ModelPartData body_r36 = cyl2.addChild("body_r36", ModelPartBuilder.create().uv(184, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.7489F, 0.0F));

		ModelPartData body_r37 = cyl2.addChild("body_r37", ModelPartBuilder.create().uv(176, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -3.1416F, 0.0F));

		ModelPartData body_r38 = cyl2.addChild("body_r38", ModelPartBuilder.create().uv(48, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.7489F, 0.0F));

		ModelPartData body_r39 = cyl2.addChild("body_r39", ModelPartBuilder.create().uv(40, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.3562F, 0.0F));

		ModelPartData body_r40 = cyl2.addChild("body_r40", ModelPartBuilder.create().uv(32, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.9635F, 0.0F));

		ModelPartData body_r41 = cyl2.addChild("body_r41", ModelPartBuilder.create().uv(24, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.5708F, 0.0F));

		ModelPartData body_r42 = cyl2.addChild("body_r42", ModelPartBuilder.create().uv(16, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.1781F, 0.0F));

		ModelPartData body_r43 = cyl2.addChild("body_r43", ModelPartBuilder.create().uv(8, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.7854F, 0.0F));

		ModelPartData body_r44 = cyl2.addChild("body_r44", ModelPartBuilder.create().uv(0, 190).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.3927F, 0.0F));

		ModelPartData body_r45 = cyl2.addChild("body_r45", ModelPartBuilder.create().uv(188, 187).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.0F, 0.0F));

		ModelPartData cyl3 = body.addChild("cyl3", ModelPartBuilder.create().uv(108, 48).cuboid(-1.5F, 6.0F, -7.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 8.5F));

		ModelPartData body_r46 = cyl3.addChild("body_r46", ModelPartBuilder.create().uv(36, 124).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r47 = cyl3.addChild("body_r47", ModelPartBuilder.create().uv(0, 124).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r48 = cyl3.addChild("body_r48", ModelPartBuilder.create().uv(108, 112).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r49 = cyl3.addChild("body_r49", ModelPartBuilder.create().uv(72, 112).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r50 = cyl3.addChild("body_r50", ModelPartBuilder.create().uv(108, 96).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r51 = cyl3.addChild("body_r51", ModelPartBuilder.create().uv(108, 80).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r52 = cyl3.addChild("body_r52", ModelPartBuilder.create().uv(108, 64).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl4 = body.addChild("cyl4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.75F, 8.0F));

		ModelPartData body_r53 = cyl4.addChild("body_r53", ModelPartBuilder.create().uv(128, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r54 = cyl4.addChild("body_r54", ModelPartBuilder.create().uv(120, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r55 = cyl4.addChild("body_r55", ModelPartBuilder.create().uv(112, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r56 = cyl4.addChild("body_r56", ModelPartBuilder.create().uv(104, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r57 = cyl4.addChild("body_r57", ModelPartBuilder.create().uv(96, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r58 = cyl4.addChild("body_r58", ModelPartBuilder.create().uv(88, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r59 = cyl4.addChild("body_r59", ModelPartBuilder.create().uv(80, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r60 = cyl4.addChild("body_r60", ModelPartBuilder.create().uv(72, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r61 = cyl4.addChild("body_r61", ModelPartBuilder.create().uv(64, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r62 = cyl4.addChild("body_r62", ModelPartBuilder.create().uv(56, 202).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r63 = cyl4.addChild("body_r63", ModelPartBuilder.create().uv(192, 201).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r64 = cyl4.addChild("body_r64", ModelPartBuilder.create().uv(184, 201).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r65 = cyl4.addChild("body_r65", ModelPartBuilder.create().uv(176, 201).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r66 = cyl4.addChild("body_r66", ModelPartBuilder.create().uv(48, 201).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r67 = cyl4.addChild("body_r67", ModelPartBuilder.create().uv(40, 201).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r68 = cyl4.addChild("body_r68", ModelPartBuilder.create().uv(32, 201).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cyl5 = body.addChild("cyl5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 8.0F));

		ModelPartData body_r69 = cyl5.addChild("body_r69", ModelPartBuilder.create().uv(40, 193).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.3927F, 0.0F));

		ModelPartData body_r70 = cyl5.addChild("body_r70", ModelPartBuilder.create().uv(32, 193).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.7854F, 0.0F));

		ModelPartData body_r71 = cyl5.addChild("body_r71", ModelPartBuilder.create().uv(24, 193).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.1781F, 0.0F));

		ModelPartData body_r72 = cyl5.addChild("body_r72", ModelPartBuilder.create().uv(16, 193).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.5708F, 0.0F));

		ModelPartData body_r73 = cyl5.addChild("body_r73", ModelPartBuilder.create().uv(8, 193).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.9635F, 0.0F));

		ModelPartData body_r74 = cyl5.addChild("body_r74", ModelPartBuilder.create().uv(0, 193).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.3562F, 0.0F));

		ModelPartData body_r75 = cyl5.addChild("body_r75", ModelPartBuilder.create().uv(192, 190).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.7489F, 0.0F));

		ModelPartData body_r76 = cyl5.addChild("body_r76", ModelPartBuilder.create().uv(168, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -3.1416F, 0.0F));

		ModelPartData body_r77 = cyl5.addChild("body_r77", ModelPartBuilder.create().uv(160, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.7489F, 0.0F));

		ModelPartData body_r78 = cyl5.addChild("body_r78", ModelPartBuilder.create().uv(152, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.3562F, 0.0F));

		ModelPartData body_r79 = cyl5.addChild("body_r79", ModelPartBuilder.create().uv(144, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.9635F, 0.0F));

		ModelPartData body_r80 = cyl5.addChild("body_r80", ModelPartBuilder.create().uv(136, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.5708F, 0.0F));

		ModelPartData body_r81 = cyl5.addChild("body_r81", ModelPartBuilder.create().uv(128, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.1781F, 0.0F));

		ModelPartData body_r82 = cyl5.addChild("body_r82", ModelPartBuilder.create().uv(120, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.7854F, 0.0F));

		ModelPartData body_r83 = cyl5.addChild("body_r83", ModelPartBuilder.create().uv(112, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.3927F, 0.0F));

		ModelPartData body_r84 = cyl5.addChild("body_r84", ModelPartBuilder.create().uv(104, 191).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.0F, 0.0F));

		ModelPartData cyl6 = body.addChild("cyl6", ModelPartBuilder.create().uv(72, 0).cuboid(-1.5F, 6.0F, -7.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.25F, 8.5F));

		ModelPartData body_r85 = cyl6.addChild("body_r85", ModelPartBuilder.create().uv(72, 80).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r86 = cyl6.addChild("body_r86", ModelPartBuilder.create().uv(36, 76).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r87 = cyl6.addChild("body_r87", ModelPartBuilder.create().uv(0, 76).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r88 = cyl6.addChild("body_r88", ModelPartBuilder.create().uv(72, 64).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r89 = cyl6.addChild("body_r89", ModelPartBuilder.create().uv(72, 48).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r90 = cyl6.addChild("body_r90", ModelPartBuilder.create().uv(72, 32).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r91 = cyl6.addChild("body_r91", ModelPartBuilder.create().uv(72, 16).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl7 = body.addChild("cyl7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 2.0F, 8.0F));

		ModelPartData body_r92 = cyl7.addChild("body_r92", ModelPartBuilder.create().uv(192, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r93 = cyl7.addChild("body_r93", ModelPartBuilder.create().uv(184, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r94 = cyl7.addChild("body_r94", ModelPartBuilder.create().uv(176, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r95 = cyl7.addChild("body_r95", ModelPartBuilder.create().uv(48, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r96 = cyl7.addChild("body_r96", ModelPartBuilder.create().uv(40, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r97 = cyl7.addChild("body_r97", ModelPartBuilder.create().uv(32, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r98 = cyl7.addChild("body_r98", ModelPartBuilder.create().uv(24, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r99 = cyl7.addChild("body_r99", ModelPartBuilder.create().uv(16, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r100 = cyl7.addChild("body_r100", ModelPartBuilder.create().uv(8, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r101 = cyl7.addChild("body_r101", ModelPartBuilder.create().uv(0, 203).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r102 = cyl7.addChild("body_r102", ModelPartBuilder.create().uv(200, 202).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r103 = cyl7.addChild("body_r103", ModelPartBuilder.create().uv(168, 202).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r104 = cyl7.addChild("body_r104", ModelPartBuilder.create().uv(160, 202).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r105 = cyl7.addChild("body_r105", ModelPartBuilder.create().uv(152, 202).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r106 = cyl7.addChild("body_r106", ModelPartBuilder.create().uv(144, 202).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r107 = cyl7.addChild("body_r107", ModelPartBuilder.create().uv(136, 202).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl8 = body.addChild("cyl8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.25F, 8.0F));

		ModelPartData body_r108 = cyl8.addChild("body_r108", ModelPartBuilder.create().uv(144, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.3927F, 0.0F));

		ModelPartData body_r109 = cyl8.addChild("body_r109", ModelPartBuilder.create().uv(136, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.7854F, 0.0F));

		ModelPartData body_r110 = cyl8.addChild("body_r110", ModelPartBuilder.create().uv(128, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.1781F, 0.0F));

		ModelPartData body_r111 = cyl8.addChild("body_r111", ModelPartBuilder.create().uv(120, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.5708F, 0.0F));

		ModelPartData body_r112 = cyl8.addChild("body_r112", ModelPartBuilder.create().uv(112, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.9635F, 0.0F));

		ModelPartData body_r113 = cyl8.addChild("body_r113", ModelPartBuilder.create().uv(104, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.3562F, 0.0F));

		ModelPartData body_r114 = cyl8.addChild("body_r114", ModelPartBuilder.create().uv(96, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.7489F, 0.0F));

		ModelPartData body_r115 = cyl8.addChild("body_r115", ModelPartBuilder.create().uv(88, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -3.1416F, 0.0F));

		ModelPartData body_r116 = cyl8.addChild("body_r116", ModelPartBuilder.create().uv(80, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.7489F, 0.0F));

		ModelPartData body_r117 = cyl8.addChild("body_r117", ModelPartBuilder.create().uv(72, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.3562F, 0.0F));

		ModelPartData body_r118 = cyl8.addChild("body_r118", ModelPartBuilder.create().uv(64, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.9635F, 0.0F));

		ModelPartData body_r119 = cyl8.addChild("body_r119", ModelPartBuilder.create().uv(56, 194).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.5708F, 0.0F));

		ModelPartData body_r120 = cyl8.addChild("body_r120", ModelPartBuilder.create().uv(192, 193).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.1781F, 0.0F));

		ModelPartData body_r121 = cyl8.addChild("body_r121", ModelPartBuilder.create().uv(184, 193).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.7854F, 0.0F));

		ModelPartData body_r122 = cyl8.addChild("body_r122", ModelPartBuilder.create().uv(176, 193).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.3927F, 0.0F));

		ModelPartData body_r123 = cyl8.addChild("body_r123", ModelPartBuilder.create().uv(48, 193).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.0F, 0.0F));

		ModelPartData cyl9 = body.addChild("cyl9", ModelPartBuilder.create().uv(0, 92).cuboid(-1.5F, 6.0F, -7.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.75F, 8.5F));

		ModelPartData body_r124 = cyl9.addChild("body_r124", ModelPartBuilder.create().uv(36, 108).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r125 = cyl9.addChild("body_r125", ModelPartBuilder.create().uv(108, 32).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r126 = cyl9.addChild("body_r126", ModelPartBuilder.create().uv(108, 16).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r127 = cyl9.addChild("body_r127", ModelPartBuilder.create().uv(108, 0).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r128 = cyl9.addChild("body_r128", ModelPartBuilder.create().uv(0, 108).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r129 = cyl9.addChild("body_r129", ModelPartBuilder.create().uv(72, 96).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r130 = cyl9.addChild("body_r130", ModelPartBuilder.create().uv(36, 92).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl10 = body.addChild("cyl10", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.0F, 8.0F));

		ModelPartData body_r131 = cyl10.addChild("body_r131", ModelPartBuilder.create().uv(204, 184).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r132 = cyl10.addChild("body_r132", ModelPartBuilder.create().uv(168, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r133 = cyl10.addChild("body_r133", ModelPartBuilder.create().uv(160, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r134 = cyl10.addChild("body_r134", ModelPartBuilder.create().uv(152, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r135 = cyl10.addChild("body_r135", ModelPartBuilder.create().uv(144, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r136 = cyl10.addChild("body_r136", ModelPartBuilder.create().uv(136, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r137 = cyl10.addChild("body_r137", ModelPartBuilder.create().uv(128, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r138 = cyl10.addChild("body_r138", ModelPartBuilder.create().uv(120, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r139 = cyl10.addChild("body_r139", ModelPartBuilder.create().uv(112, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r140 = cyl10.addChild("body_r140", ModelPartBuilder.create().uv(104, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r141 = cyl10.addChild("body_r141", ModelPartBuilder.create().uv(96, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r142 = cyl10.addChild("body_r142", ModelPartBuilder.create().uv(88, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r143 = cyl10.addChild("body_r143", ModelPartBuilder.create().uv(80, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r144 = cyl10.addChild("body_r144", ModelPartBuilder.create().uv(72, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r145 = cyl10.addChild("body_r145", ModelPartBuilder.create().uv(64, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r146 = cyl10.addChild("body_r146", ModelPartBuilder.create().uv(56, 204).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cyl11 = body.addChild("cyl11", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.75F, 8.0F));

		ModelPartData body_r147 = cyl11.addChild("body_r147", ModelPartBuilder.create().uv(56, 197).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.3927F, 0.0F));

		ModelPartData body_r148 = cyl11.addChild("body_r148", ModelPartBuilder.create().uv(192, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.7854F, 0.0F));

		ModelPartData body_r149 = cyl11.addChild("body_r149", ModelPartBuilder.create().uv(196, 187).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.1781F, 0.0F));

		ModelPartData body_r150 = cyl11.addChild("body_r150", ModelPartBuilder.create().uv(196, 184).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.5708F, 0.0F));

		ModelPartData body_r151 = cyl11.addChild("body_r151", ModelPartBuilder.create().uv(184, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.9635F, 0.0F));

		ModelPartData body_r152 = cyl11.addChild("body_r152", ModelPartBuilder.create().uv(176, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.3562F, 0.0F));

		ModelPartData body_r153 = cyl11.addChild("body_r153", ModelPartBuilder.create().uv(48, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.7489F, 0.0F));

		ModelPartData body_r154 = cyl11.addChild("body_r154", ModelPartBuilder.create().uv(40, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -3.1416F, 0.0F));

		ModelPartData body_r155 = cyl11.addChild("body_r155", ModelPartBuilder.create().uv(32, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.7489F, 0.0F));

		ModelPartData body_r156 = cyl11.addChild("body_r156", ModelPartBuilder.create().uv(24, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.3562F, 0.0F));

		ModelPartData body_r157 = cyl11.addChild("body_r157", ModelPartBuilder.create().uv(16, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.9635F, 0.0F));

		ModelPartData body_r158 = cyl11.addChild("body_r158", ModelPartBuilder.create().uv(8, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.5708F, 0.0F));

		ModelPartData body_r159 = cyl11.addChild("body_r159", ModelPartBuilder.create().uv(0, 196).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.1781F, 0.0F));

		ModelPartData body_r160 = cyl11.addChild("body_r160", ModelPartBuilder.create().uv(168, 194).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.7854F, 0.0F));

		ModelPartData body_r161 = cyl11.addChild("body_r161", ModelPartBuilder.create().uv(160, 194).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.3927F, 0.0F));

		ModelPartData body_r162 = cyl11.addChild("body_r162", ModelPartBuilder.create().uv(152, 194).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.0F, 0.0F));

		ModelPartData cyl12 = body.addChild("cyl12", ModelPartBuilder.create().uv(0, 156).cuboid(-1.5F, 5.0F, -5.5F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 8.5F));

		ModelPartData body_r163 = cyl12.addChild("body_r163", ModelPartBuilder.create().uv(30, 170).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r164 = cyl12.addChild("body_r164", ModelPartBuilder.create().uv(0, 170).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r165 = cyl12.addChild("body_r165", ModelPartBuilder.create().uv(150, 160).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r166 = cyl12.addChild("body_r166", ModelPartBuilder.create().uv(120, 160).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r167 = cyl12.addChild("body_r167", ModelPartBuilder.create().uv(90, 160).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r168 = cyl12.addChild("body_r168", ModelPartBuilder.create().uv(60, 160).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r169 = cyl12.addChild("body_r169", ModelPartBuilder.create().uv(30, 156).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl13 = body.addChild("cyl13", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.25F, 8.0F));

		ModelPartData body_r170 = cyl13.addChild("body_r170", ModelPartBuilder.create().uv(16, 199).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r171 = cyl13.addChild("body_r171", ModelPartBuilder.create().uv(8, 199).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r172 = cyl13.addChild("body_r172", ModelPartBuilder.create().uv(0, 199).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r173 = cyl13.addChild("body_r173", ModelPartBuilder.create().uv(198, 182).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r174 = cyl13.addChild("body_r174", ModelPartBuilder.create().uv(198, 180).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r175 = cyl13.addChild("body_r175", ModelPartBuilder.create().uv(198, 178).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r176 = cyl13.addChild("body_r176", ModelPartBuilder.create().uv(198, 176).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r177 = cyl13.addChild("body_r177", ModelPartBuilder.create().uv(198, 174).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r178 = cyl13.addChild("body_r178", ModelPartBuilder.create().uv(198, 172).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r179 = cyl13.addChild("body_r179", ModelPartBuilder.create().uv(198, 170).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r180 = cyl13.addChild("body_r180", ModelPartBuilder.create().uv(198, 168).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r181 = cyl13.addChild("body_r181", ModelPartBuilder.create().uv(198, 166).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r182 = cyl13.addChild("body_r182", ModelPartBuilder.create().uv(198, 164).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r183 = cyl13.addChild("body_r183", ModelPartBuilder.create().uv(198, 162).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r184 = cyl13.addChild("body_r184", ModelPartBuilder.create().uv(198, 160).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r185 = cyl13.addChild("body_r185", ModelPartBuilder.create().uv(198, 158).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl14 = body.addChild("cyl14", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 8.0F));

		ModelPartData body_r186 = cyl14.addChild("body_r186", ModelPartBuilder.create().uv(168, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.3927F, 0.0F));

		ModelPartData body_r187 = cyl14.addChild("body_r187", ModelPartBuilder.create().uv(160, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.7854F, 0.0F));

		ModelPartData body_r188 = cyl14.addChild("body_r188", ModelPartBuilder.create().uv(152, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.1781F, 0.0F));

		ModelPartData body_r189 = cyl14.addChild("body_r189", ModelPartBuilder.create().uv(144, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.5708F, 0.0F));

		ModelPartData body_r190 = cyl14.addChild("body_r190", ModelPartBuilder.create().uv(136, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.9635F, 0.0F));

		ModelPartData body_r191 = cyl14.addChild("body_r191", ModelPartBuilder.create().uv(128, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.3562F, 0.0F));

		ModelPartData body_r192 = cyl14.addChild("body_r192", ModelPartBuilder.create().uv(120, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.7489F, 0.0F));

		ModelPartData body_r193 = cyl14.addChild("body_r193", ModelPartBuilder.create().uv(112, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -3.1416F, 0.0F));

		ModelPartData body_r194 = cyl14.addChild("body_r194", ModelPartBuilder.create().uv(104, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.7489F, 0.0F));

		ModelPartData body_r195 = cyl14.addChild("body_r195", ModelPartBuilder.create().uv(96, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.3562F, 0.0F));

		ModelPartData body_r196 = cyl14.addChild("body_r196", ModelPartBuilder.create().uv(88, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.9635F, 0.0F));

		ModelPartData body_r197 = cyl14.addChild("body_r197", ModelPartBuilder.create().uv(80, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.5708F, 0.0F));

		ModelPartData body_r198 = cyl14.addChild("body_r198", ModelPartBuilder.create().uv(72, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.1781F, 0.0F));

		ModelPartData body_r199 = cyl14.addChild("body_r199", ModelPartBuilder.create().uv(64, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.7854F, 0.0F));

		ModelPartData body_r200 = cyl14.addChild("body_r200", ModelPartBuilder.create().uv(56, 188).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.3927F, 0.0F));

		ModelPartData body_r201 = cyl14.addChild("body_r201", ModelPartBuilder.create().uv(180, 187).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.0F, 0.0F));

		ModelPartData cyl15 = body.addChild("cyl15", ModelPartBuilder.create().uv(180, 56).cuboid(-1.0F, -6.5F, -2.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.25F, 8.0F));

		ModelPartData body_r202 = cyl15.addChild("body_r202", ModelPartBuilder.create().uv(180, 112).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r203 = cyl15.addChild("body_r203", ModelPartBuilder.create().uv(180, 104).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r204 = cyl15.addChild("body_r204", ModelPartBuilder.create().uv(180, 96).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r205 = cyl15.addChild("body_r205", ModelPartBuilder.create().uv(180, 88).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r206 = cyl15.addChild("body_r206", ModelPartBuilder.create().uv(180, 80).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r207 = cyl15.addChild("body_r207", ModelPartBuilder.create().uv(180, 72).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r208 = cyl15.addChild("body_r208", ModelPartBuilder.create().uv(180, 64).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl16 = body.addChild("cyl16", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.75F, 8.0F));

		ModelPartData body_r209 = cyl16.addChild("body_r209", ModelPartBuilder.create().uv(120, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r210 = cyl16.addChild("body_r210", ModelPartBuilder.create().uv(112, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r211 = cyl16.addChild("body_r211", ModelPartBuilder.create().uv(104, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r212 = cyl16.addChild("body_r212", ModelPartBuilder.create().uv(96, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r213 = cyl16.addChild("body_r213", ModelPartBuilder.create().uv(88, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r214 = cyl16.addChild("body_r214", ModelPartBuilder.create().uv(80, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r215 = cyl16.addChild("body_r215", ModelPartBuilder.create().uv(72, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r216 = cyl16.addChild("body_r216", ModelPartBuilder.create().uv(64, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r217 = cyl16.addChild("body_r217", ModelPartBuilder.create().uv(56, 200).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r218 = cyl16.addChild("body_r218", ModelPartBuilder.create().uv(192, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r219 = cyl16.addChild("body_r219", ModelPartBuilder.create().uv(184, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r220 = cyl16.addChild("body_r220", ModelPartBuilder.create().uv(176, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r221 = cyl16.addChild("body_r221", ModelPartBuilder.create().uv(48, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r222 = cyl16.addChild("body_r222", ModelPartBuilder.create().uv(40, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r223 = cyl16.addChild("body_r223", ModelPartBuilder.create().uv(32, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r224 = cyl16.addChild("body_r224", ModelPartBuilder.create().uv(24, 199).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cyl17 = body.addChild("cyl17", ModelPartBuilder.create().uv(72, 128).cuboid(-1.5F, 6.0F, -7.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.25F, 8.5F));

		ModelPartData body_r225 = cyl17.addChild("body_r225", ModelPartBuilder.create().uv(144, 48).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r226 = cyl17.addChild("body_r226", ModelPartBuilder.create().uv(144, 32).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r227 = cyl17.addChild("body_r227", ModelPartBuilder.create().uv(144, 16).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r228 = cyl17.addChild("body_r228", ModelPartBuilder.create().uv(144, 0).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r229 = cyl17.addChild("body_r229", ModelPartBuilder.create().uv(36, 140).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r230 = cyl17.addChild("body_r230", ModelPartBuilder.create().uv(0, 140).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r231 = cyl17.addChild("body_r231", ModelPartBuilder.create().uv(108, 128).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl18 = body.addChild("cyl18", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.5F, 8.0F));

		ModelPartData body_r232 = cyl18.addChild("body_r232", ModelPartBuilder.create().uv(206, 58).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r233 = cyl18.addChild("body_r233", ModelPartBuilder.create().uv(206, 56).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r234 = cyl18.addChild("body_r234", ModelPartBuilder.create().uv(56, 206).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r235 = cyl18.addChild("body_r235", ModelPartBuilder.create().uv(192, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r236 = cyl18.addChild("body_r236", ModelPartBuilder.create().uv(184, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r237 = cyl18.addChild("body_r237", ModelPartBuilder.create().uv(176, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r238 = cyl18.addChild("body_r238", ModelPartBuilder.create().uv(48, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r239 = cyl18.addChild("body_r239", ModelPartBuilder.create().uv(40, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r240 = cyl18.addChild("body_r240", ModelPartBuilder.create().uv(32, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r241 = cyl18.addChild("body_r241", ModelPartBuilder.create().uv(24, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r242 = cyl18.addChild("body_r242", ModelPartBuilder.create().uv(16, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r243 = cyl18.addChild("body_r243", ModelPartBuilder.create().uv(8, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r244 = cyl18.addChild("body_r244", ModelPartBuilder.create().uv(0, 205).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r245 = cyl18.addChild("body_r245", ModelPartBuilder.create().uv(200, 204).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r246 = cyl18.addChild("body_r246", ModelPartBuilder.create().uv(204, 188).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r247 = cyl18.addChild("body_r247", ModelPartBuilder.create().uv(204, 186).cuboid(-1.5F, 4.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl19 = body.addChild("cyl19", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 10.75F, 8.0F));

		ModelPartData body_r248 = cyl19.addChild("body_r248", ModelPartBuilder.create().uv(198, 59).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.3927F, 0.0F));

		ModelPartData body_r249 = cyl19.addChild("body_r249", ModelPartBuilder.create().uv(198, 56).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -0.7854F, 0.0F));

		ModelPartData body_r250 = cyl19.addChild("body_r250", ModelPartBuilder.create().uv(168, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.1781F, 0.0F));

		ModelPartData body_r251 = cyl19.addChild("body_r251", ModelPartBuilder.create().uv(160, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.5708F, 0.0F));

		ModelPartData body_r252 = cyl19.addChild("body_r252", ModelPartBuilder.create().uv(152, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -1.9635F, 0.0F));

		ModelPartData body_r253 = cyl19.addChild("body_r253", ModelPartBuilder.create().uv(144, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.3562F, 0.0F));

		ModelPartData body_r254 = cyl19.addChild("body_r254", ModelPartBuilder.create().uv(136, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -2.7489F, 0.0F));

		ModelPartData body_r255 = cyl19.addChild("body_r255", ModelPartBuilder.create().uv(128, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, -3.1416F, 0.0F));

		ModelPartData body_r256 = cyl19.addChild("body_r256", ModelPartBuilder.create().uv(120, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.7489F, 0.0F));

		ModelPartData body_r257 = cyl19.addChild("body_r257", ModelPartBuilder.create().uv(112, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 2.3562F, 0.0F));

		ModelPartData body_r258 = cyl19.addChild("body_r258", ModelPartBuilder.create().uv(104, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.9635F, 0.0F));

		ModelPartData body_r259 = cyl19.addChild("body_r259", ModelPartBuilder.create().uv(96, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.5708F, 0.0F));

		ModelPartData body_r260 = cyl19.addChild("body_r260", ModelPartBuilder.create().uv(88, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 1.1781F, 0.0F));

		ModelPartData body_r261 = cyl19.addChild("body_r261", ModelPartBuilder.create().uv(80, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.7854F, 0.0F));

		ModelPartData body_r262 = cyl19.addChild("body_r262", ModelPartBuilder.create().uv(72, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.3927F, 0.0F));

		ModelPartData body_r263 = cyl19.addChild("body_r263", ModelPartBuilder.create().uv(64, 197).cuboid(-1.5F, 3.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 1.0F, 1.309F, 0.0F, 0.0F));

		ModelPartData cyl20 = body.addChild("cyl20", ModelPartBuilder.create().uv(144, 64).cuboid(-1.5F, 6.0F, -7.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.75F, 8.5F));

		ModelPartData body_r264 = cyl20.addChild("body_r264", ModelPartBuilder.create().uv(144, 144).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r265 = cyl20.addChild("body_r265", ModelPartBuilder.create().uv(144, 128).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r266 = cyl20.addChild("body_r266", ModelPartBuilder.create().uv(144, 112).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r267 = cyl20.addChild("body_r267", ModelPartBuilder.create().uv(108, 144).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r268 = cyl20.addChild("body_r268", ModelPartBuilder.create().uv(144, 96).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r269 = cyl20.addChild("body_r269", ModelPartBuilder.create().uv(144, 80).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r270 = cyl20.addChild("body_r270", ModelPartBuilder.create().uv(72, 144).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl21 = body.addChild("cyl21", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 10.5F, 8.0F));

		ModelPartData body_r271 = cyl21.addChild("body_r271", ModelPartBuilder.create().uv(206, 84).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r272 = cyl21.addChild("body_r272", ModelPartBuilder.create().uv(206, 82).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r273 = cyl21.addChild("body_r273", ModelPartBuilder.create().uv(206, 80).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r274 = cyl21.addChild("body_r274", ModelPartBuilder.create().uv(80, 206).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r275 = cyl21.addChild("body_r275", ModelPartBuilder.create().uv(206, 78).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r276 = cyl21.addChild("body_r276", ModelPartBuilder.create().uv(206, 76).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r277 = cyl21.addChild("body_r277", ModelPartBuilder.create().uv(206, 74).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r278 = cyl21.addChild("body_r278", ModelPartBuilder.create().uv(206, 72).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r279 = cyl21.addChild("body_r279", ModelPartBuilder.create().uv(72, 206).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r280 = cyl21.addChild("body_r280", ModelPartBuilder.create().uv(206, 70).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r281 = cyl21.addChild("body_r281", ModelPartBuilder.create().uv(206, 68).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r282 = cyl21.addChild("body_r282", ModelPartBuilder.create().uv(206, 66).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r283 = cyl21.addChild("body_r283", ModelPartBuilder.create().uv(206, 64).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r284 = cyl21.addChild("body_r284", ModelPartBuilder.create().uv(64, 206).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r285 = cyl21.addChild("body_r285", ModelPartBuilder.create().uv(206, 62).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r286 = cyl21.addChild("body_r286", ModelPartBuilder.create().uv(206, 60).cuboid(-1.5F, -5.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cyl22 = body.addChild("cyl22", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.25F, 8.0F));

		ModelPartData body_r287 = cyl22.addChild("body_r287", ModelPartBuilder.create().uv(198, 107).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.3927F, 0.0F));

		ModelPartData body_r288 = cyl22.addChild("body_r288", ModelPartBuilder.create().uv(198, 104).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.7854F, 0.0F));

		ModelPartData body_r289 = cyl22.addChild("body_r289", ModelPartBuilder.create().uv(198, 101).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.1781F, 0.0F));

		ModelPartData body_r290 = cyl22.addChild("body_r290", ModelPartBuilder.create().uv(198, 98).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.5708F, 0.0F));

		ModelPartData body_r291 = cyl22.addChild("body_r291", ModelPartBuilder.create().uv(198, 95).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.9635F, 0.0F));

		ModelPartData body_r292 = cyl22.addChild("body_r292", ModelPartBuilder.create().uv(198, 92).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.3562F, 0.0F));

		ModelPartData body_r293 = cyl22.addChild("body_r293", ModelPartBuilder.create().uv(198, 89).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.7489F, 0.0F));

		ModelPartData body_r294 = cyl22.addChild("body_r294", ModelPartBuilder.create().uv(198, 86).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -3.1416F, 0.0F));

		ModelPartData body_r295 = cyl22.addChild("body_r295", ModelPartBuilder.create().uv(198, 83).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.7489F, 0.0F));

		ModelPartData body_r296 = cyl22.addChild("body_r296", ModelPartBuilder.create().uv(198, 80).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.3562F, 0.0F));

		ModelPartData body_r297 = cyl22.addChild("body_r297", ModelPartBuilder.create().uv(198, 77).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.9635F, 0.0F));

		ModelPartData body_r298 = cyl22.addChild("body_r298", ModelPartBuilder.create().uv(198, 74).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.5708F, 0.0F));

		ModelPartData body_r299 = cyl22.addChild("body_r299", ModelPartBuilder.create().uv(198, 71).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.1781F, 0.0F));

		ModelPartData body_r300 = cyl22.addChild("body_r300", ModelPartBuilder.create().uv(198, 68).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.7854F, 0.0F));

		ModelPartData body_r301 = cyl22.addChild("body_r301", ModelPartBuilder.create().uv(198, 65).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.3927F, 0.0F));

		ModelPartData body_r302 = cyl22.addChild("body_r302", ModelPartBuilder.create().uv(198, 62).cuboid(-1.5F, -5.5F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.0F, 0.0F));

		ModelPartData cyl23 = body.addChild("cyl23", ModelPartBuilder.create().uv(60, 174).cuboid(-1.5F, 5.0F, -5.5F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 7.5F, 8.5F));

		ModelPartData body_r303 = cyl23.addChild("body_r303", ModelPartBuilder.create().uv(180, 42).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r304 = cyl23.addChild("body_r304", ModelPartBuilder.create().uv(180, 28).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r305 = cyl23.addChild("body_r305", ModelPartBuilder.create().uv(180, 14).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r306 = cyl23.addChild("body_r306", ModelPartBuilder.create().uv(180, 0).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r307 = cyl23.addChild("body_r307", ModelPartBuilder.create().uv(150, 174).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r308 = cyl23.addChild("body_r308", ModelPartBuilder.create().uv(120, 174).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r309 = cyl23.addChild("body_r309", ModelPartBuilder.create().uv(90, 174).cuboid(-1.5F, 4.5F, -6.0F, 3.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl24 = body.addChild("cyl24", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 14.25F, 8.0F));

		ModelPartData body_r310 = cyl24.addChild("body_r310", ModelPartBuilder.create().uv(206, 110).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r311 = cyl24.addChild("body_r311", ModelPartBuilder.create().uv(206, 108).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r312 = cyl24.addChild("body_r312", ModelPartBuilder.create().uv(206, 106).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r313 = cyl24.addChild("body_r313", ModelPartBuilder.create().uv(206, 104).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r314 = cyl24.addChild("body_r314", ModelPartBuilder.create().uv(104, 206).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r315 = cyl24.addChild("body_r315", ModelPartBuilder.create().uv(206, 102).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r316 = cyl24.addChild("body_r316", ModelPartBuilder.create().uv(206, 100).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r317 = cyl24.addChild("body_r317", ModelPartBuilder.create().uv(206, 98).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r318 = cyl24.addChild("body_r318", ModelPartBuilder.create().uv(206, 96).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r319 = cyl24.addChild("body_r319", ModelPartBuilder.create().uv(96, 206).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r320 = cyl24.addChild("body_r320", ModelPartBuilder.create().uv(206, 94).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r321 = cyl24.addChild("body_r321", ModelPartBuilder.create().uv(206, 92).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r322 = cyl24.addChild("body_r322", ModelPartBuilder.create().uv(206, 90).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r323 = cyl24.addChild("body_r323", ModelPartBuilder.create().uv(206, 88).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r324 = cyl24.addChild("body_r324", ModelPartBuilder.create().uv(88, 206).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r325 = cyl24.addChild("body_r325", ModelPartBuilder.create().uv(206, 86).cuboid(-1.5F, 2.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl25 = body.addChild("cyl25", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.75F, 8.0F));

		ModelPartData body_r326 = cyl25.addChild("body_r326", ModelPartBuilder.create().uv(136, 206).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r327 = cyl25.addChild("body_r327", ModelPartBuilder.create().uv(206, 134).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r328 = cyl25.addChild("body_r328", ModelPartBuilder.create().uv(206, 132).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r329 = cyl25.addChild("body_r329", ModelPartBuilder.create().uv(206, 130).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r330 = cyl25.addChild("body_r330", ModelPartBuilder.create().uv(206, 128).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r331 = cyl25.addChild("body_r331", ModelPartBuilder.create().uv(128, 206).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r332 = cyl25.addChild("body_r332", ModelPartBuilder.create().uv(206, 126).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r333 = cyl25.addChild("body_r333", ModelPartBuilder.create().uv(206, 124).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r334 = cyl25.addChild("body_r334", ModelPartBuilder.create().uv(206, 122).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r335 = cyl25.addChild("body_r335", ModelPartBuilder.create().uv(206, 120).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r336 = cyl25.addChild("body_r336", ModelPartBuilder.create().uv(120, 206).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r337 = cyl25.addChild("body_r337", ModelPartBuilder.create().uv(206, 118).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r338 = cyl25.addChild("body_r338", ModelPartBuilder.create().uv(206, 116).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r339 = cyl25.addChild("body_r339", ModelPartBuilder.create().uv(206, 114).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r340 = cyl25.addChild("body_r340", ModelPartBuilder.create().uv(206, 112).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r341 = cyl25.addChild("body_r341", ModelPartBuilder.create().uv(112, 206).cuboid(-1.5F, -3.0F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cyl26 = body.addChild("cyl26", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.5F, 8.0F));

		ModelPartData body_r342 = cyl26.addChild("body_r342", ModelPartBuilder.create().uv(198, 155).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.3927F, 0.0F));

		ModelPartData body_r343 = cyl26.addChild("body_r343", ModelPartBuilder.create().uv(198, 152).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -0.7854F, 0.0F));

		ModelPartData body_r344 = cyl26.addChild("body_r344", ModelPartBuilder.create().uv(198, 149).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.1781F, 0.0F));

		ModelPartData body_r345 = cyl26.addChild("body_r345", ModelPartBuilder.create().uv(198, 146).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.5708F, 0.0F));

		ModelPartData body_r346 = cyl26.addChild("body_r346", ModelPartBuilder.create().uv(198, 143).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -1.9635F, 0.0F));

		ModelPartData body_r347 = cyl26.addChild("body_r347", ModelPartBuilder.create().uv(198, 140).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.3562F, 0.0F));

		ModelPartData body_r348 = cyl26.addChild("body_r348", ModelPartBuilder.create().uv(198, 137).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -2.7489F, 0.0F));

		ModelPartData body_r349 = cyl26.addChild("body_r349", ModelPartBuilder.create().uv(198, 134).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, -3.1416F, 0.0F));

		ModelPartData body_r350 = cyl26.addChild("body_r350", ModelPartBuilder.create().uv(198, 131).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.7489F, 0.0F));

		ModelPartData body_r351 = cyl26.addChild("body_r351", ModelPartBuilder.create().uv(198, 128).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 2.3562F, 0.0F));

		ModelPartData body_r352 = cyl26.addChild("body_r352", ModelPartBuilder.create().uv(198, 125).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.9635F, 0.0F));

		ModelPartData body_r353 = cyl26.addChild("body_r353", ModelPartBuilder.create().uv(198, 122).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.5708F, 0.0F));

		ModelPartData body_r354 = cyl26.addChild("body_r354", ModelPartBuilder.create().uv(198, 119).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 1.1781F, 0.0F));

		ModelPartData body_r355 = cyl26.addChild("body_r355", ModelPartBuilder.create().uv(198, 116).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.7854F, 0.0F));

		ModelPartData body_r356 = cyl26.addChild("body_r356", ModelPartBuilder.create().uv(198, 113).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.3927F, 0.0F));

		ModelPartData body_r357 = cyl26.addChild("body_r357", ModelPartBuilder.create().uv(198, 110).cuboid(-1.5F, -4.0F, 4.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 1.0F, -1.309F, 0.0F, 0.0F));

		ModelPartData cyl27 = body.addChild("cyl27", ModelPartBuilder.create().uv(180, 120).cuboid(-1.0F, -6.5F, -2.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.25F, 8.0F));

		ModelPartData body_r358 = cyl27.addChild("body_r358", ModelPartBuilder.create().uv(180, 176).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r359 = cyl27.addChild("body_r359", ModelPartBuilder.create().uv(180, 168).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r360 = cyl27.addChild("body_r360", ModelPartBuilder.create().uv(180, 160).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r361 = cyl27.addChild("body_r361", ModelPartBuilder.create().uv(180, 152).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r362 = cyl27.addChild("body_r362", ModelPartBuilder.create().uv(180, 144).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r363 = cyl27.addChild("body_r363", ModelPartBuilder.create().uv(180, 136).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r364 = cyl27.addChild("body_r364", ModelPartBuilder.create().uv(180, 128).cuboid(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}