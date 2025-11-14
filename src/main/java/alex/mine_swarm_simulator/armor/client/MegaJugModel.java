// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class MegaJugModel {
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
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public MegaJugModel(ModelPart root) {
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(106, 123).cuboid(-5.0F, 3.5F, 12.0F, 10.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-6.0F, 1.0F, 6.75F, 12.0F, 9.0F, 6.0F, new Dilation(0.0F))
		.uv(42, 12).cuboid(-0.5F, -7.074F, 9.6358F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 101).cuboid(-0.5F, -6.074F, 12.6358F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(72, 96).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.926F, 12.3858F, 0.3927F, 0.0F, 0.0F));

		ModelPartData body_r2 = body.addChild("body_r2", ModelPartBuilder.create().uv(36, 97).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.074F, 12.3858F, -0.3927F, 0.0F, 0.0F));

		ModelPartData body_r3 = body.addChild("body_r3", ModelPartBuilder.create().uv(36, 12).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.074F, 8.8858F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(0, 15).cuboid(-1.0F, -7.0F, -4.5F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 7.0F, 6.5F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(0, 63).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(48, 48).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(48, 24).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r8 = cyl.addChild("body_r8", ModelPartBuilder.create().uv(24, 39).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r9 = cyl.addChild("body_r9", ModelPartBuilder.create().uv(0, 39).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r10 = cyl.addChild("body_r10", ModelPartBuilder.create().uv(24, 15).cuboid(-1.0F, -7.5F, -5.0F, 2.0F, 14.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl1 = body.addChild("cyl1", ModelPartBuilder.create().uv(24, 63).cuboid(-1.0F, -7.5F, -3.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(90, 70).cuboid(-1.0F, -8.0F, -3.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.5F, 6.0F));

		ModelPartData body_r11 = cyl1.addChild("body_r11", ModelPartBuilder.create().uv(72, 60).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(72, 50).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r12 = cyl1.addChild("body_r12", ModelPartBuilder.create().uv(68, 72).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(46, 72).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r13 = cyl1.addChild("body_r13", ModelPartBuilder.create().uv(24, 73).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(72, 40).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r14 = cyl1.addChild("body_r14", ModelPartBuilder.create().uv(46, 82).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(72, 30).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r15 = cyl1.addChild("body_r15", ModelPartBuilder.create().uv(68, 82).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(72, 20).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r16 = cyl1.addChild("body_r16", ModelPartBuilder.create().uv(24, 83).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(72, 10).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r17 = cyl1.addChild("body_r17", ModelPartBuilder.create().uv(0, 87).cuboid(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(72, 0).cuboid(-1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 6.0F));

		ModelPartData body_r18 = cyl2.addChild("body_r18", ModelPartBuilder.create().uv(10, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 102).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -0.7854F, 0.0F));

		ModelPartData body_r19 = cyl2.addChild("body_r19", ModelPartBuilder.create().uv(16, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 100).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -1.1781F, 0.0F));

		ModelPartData body_r20 = cyl2.addChild("body_r20", ModelPartBuilder.create().uv(22, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 95).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -1.5708F, 0.0F));

		ModelPartData body_r21 = cyl2.addChild("body_r21", ModelPartBuilder.create().uv(28, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 93).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -1.9635F, 0.0F));

		ModelPartData body_r22 = cyl2.addChild("body_r22", ModelPartBuilder.create().uv(34, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 101).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -2.3562F, 0.0F));

		ModelPartData body_r23 = cyl2.addChild("body_r23", ModelPartBuilder.create().uv(40, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 101).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -2.7489F, 0.0F));

		ModelPartData body_r24 = cyl2.addChild("body_r24", ModelPartBuilder.create().uv(46, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 101).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -3.1416F, 0.0F));

		ModelPartData body_r25 = cyl2.addChild("body_r25", ModelPartBuilder.create().uv(52, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 101).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 2.7489F, 0.0F));

		ModelPartData body_r26 = cyl2.addChild("body_r26", ModelPartBuilder.create().uv(58, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 101).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 2.3562F, 0.0F));

		ModelPartData body_r27 = cyl2.addChild("body_r27", ModelPartBuilder.create().uv(64, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 91).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 1.9635F, 0.0F));

		ModelPartData body_r28 = cyl2.addChild("body_r28", ModelPartBuilder.create().uv(70, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 68).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 1.5708F, 0.0F));

		ModelPartData body_r29 = cyl2.addChild("body_r29", ModelPartBuilder.create().uv(76, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 68).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 1.1781F, 0.0F));

		ModelPartData body_r30 = cyl2.addChild("body_r30", ModelPartBuilder.create().uv(82, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 70).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 0.7854F, 0.0F));

		ModelPartData body_r31 = cyl2.addChild("body_r31", ModelPartBuilder.create().uv(88, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 70).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 0.3927F, 0.0F));

		ModelPartData body_r32 = cyl2.addChild("body_r32", ModelPartBuilder.create().uv(94, 103).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 70).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, 0.0F, 0.0F));

		ModelPartData body_r33 = cyl2.addChild("body_r33", ModelPartBuilder.create().uv(104, 0).cuboid(-1.0F, -3.5F, 2.5F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 103).cuboid(-1.0F, -3.5F, 3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, 1.0F, -1.309F, -0.3927F, 0.0F));

		ModelPartData cyl3 = body.addChild("cyl3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.5F, 6.0F));

		ModelPartData body_r34 = cyl3.addChild("body_r34", ModelPartBuilder.create().uv(94, 12).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -0.3927F, 0.0F));

		ModelPartData body_r35 = cyl3.addChild("body_r35", ModelPartBuilder.create().uv(94, 8).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -0.7854F, 0.0F));

		ModelPartData body_r36 = cyl3.addChild("body_r36", ModelPartBuilder.create().uv(94, 4).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -1.1781F, 0.0F));

		ModelPartData body_r37 = cyl3.addChild("body_r37", ModelPartBuilder.create().uv(94, 0).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -1.5708F, 0.0F));

		ModelPartData body_r38 = cyl3.addChild("body_r38", ModelPartBuilder.create().uv(86, 93).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -1.9635F, 0.0F));

		ModelPartData body_r39 = cyl3.addChild("body_r39", ModelPartBuilder.create().uv(32, 93).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -2.3562F, 0.0F));

		ModelPartData body_r40 = cyl3.addChild("body_r40", ModelPartBuilder.create().uv(22, 93).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -2.7489F, 0.0F));

		ModelPartData body_r41 = cyl3.addChild("body_r41", ModelPartBuilder.create().uv(76, 92).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, -3.1416F, 0.0F));

		ModelPartData body_r42 = cyl3.addChild("body_r42", ModelPartBuilder.create().uv(66, 92).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 2.7489F, 0.0F));

		ModelPartData body_r43 = cyl3.addChild("body_r43", ModelPartBuilder.create().uv(56, 92).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 2.3562F, 0.0F));

		ModelPartData body_r44 = cyl3.addChild("body_r44", ModelPartBuilder.create().uv(46, 92).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 1.9635F, 0.0F));

		ModelPartData body_r45 = cyl3.addChild("body_r45", ModelPartBuilder.create().uv(90, 89).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 1.5708F, 0.0F));

		ModelPartData body_r46 = cyl3.addChild("body_r46", ModelPartBuilder.create().uv(90, 85).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 1.1781F, 0.0F));

		ModelPartData body_r47 = cyl3.addChild("body_r47", ModelPartBuilder.create().uv(36, 8).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 0.7854F, 0.0F));

		ModelPartData body_r48 = cyl3.addChild("body_r48", ModelPartBuilder.create().uv(36, 4).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 0.3927F, 0.0F));

		ModelPartData body_r49 = cyl3.addChild("body_r49", ModelPartBuilder.create().uv(36, 0).cuboid(-1.0F, 1.25F, 0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, 1.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData cyl4 = body.addChild("cyl4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.5F, 6.0F));

		ModelPartData body_r50 = cyl4.addChild("body_r50", ModelPartBuilder.create().uv(62, 96).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -0.3927F, 0.0F));

		ModelPartData body_r51 = cyl4.addChild("body_r51", ModelPartBuilder.create().uv(52, 96).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -0.7854F, 0.0F));

		ModelPartData body_r52 = cyl4.addChild("body_r52", ModelPartBuilder.create().uv(42, 96).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -1.1781F, 0.0F));

		ModelPartData body_r53 = cyl4.addChild("body_r53", ModelPartBuilder.create().uv(94, 64).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -1.5708F, 0.0F));

		ModelPartData body_r54 = cyl4.addChild("body_r54", ModelPartBuilder.create().uv(94, 60).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -1.9635F, 0.0F));

		ModelPartData body_r55 = cyl4.addChild("body_r55", ModelPartBuilder.create().uv(94, 56).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -2.3562F, 0.0F));

		ModelPartData body_r56 = cyl4.addChild("body_r56", ModelPartBuilder.create().uv(94, 52).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -2.7489F, 0.0F));

		ModelPartData body_r57 = cyl4.addChild("body_r57", ModelPartBuilder.create().uv(94, 48).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, -3.1416F, 0.0F));

		ModelPartData body_r58 = cyl4.addChild("body_r58", ModelPartBuilder.create().uv(94, 44).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 2.7489F, 0.0F));

		ModelPartData body_r59 = cyl4.addChild("body_r59", ModelPartBuilder.create().uv(94, 40).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 2.3562F, 0.0F));

		ModelPartData body_r60 = cyl4.addChild("body_r60", ModelPartBuilder.create().uv(94, 36).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 1.9635F, 0.0F));

		ModelPartData body_r61 = cyl4.addChild("body_r61", ModelPartBuilder.create().uv(94, 32).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 1.5708F, 0.0F));

		ModelPartData body_r62 = cyl4.addChild("body_r62", ModelPartBuilder.create().uv(94, 28).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 1.1781F, 0.0F));

		ModelPartData body_r63 = cyl4.addChild("body_r63", ModelPartBuilder.create().uv(94, 24).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 0.7854F, 0.0F));

		ModelPartData body_r64 = cyl4.addChild("body_r64", ModelPartBuilder.create().uv(94, 20).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 0.3927F, 0.0F));

		ModelPartData body_r65 = cyl4.addChild("body_r65", ModelPartBuilder.create().uv(94, 16).cuboid(-1.0F, 1.25F, -0.25F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 1.0F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cyl5 = body.addChild("cyl5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 2.5F, 6.0F));

		ModelPartData body_r66 = cyl5.addChild("body_r66", ModelPartBuilder.create().uv(86, 97).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 0.0F, 0.0F));

		ModelPartData body_r67 = cyl5.addChild("body_r67", ModelPartBuilder.create().uv(92, 97).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 0.3927F, 0.0F));

		ModelPartData body_r68 = cyl5.addChild("body_r68", ModelPartBuilder.create().uv(98, 97).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 0.7854F, 0.0F));

		ModelPartData body_r69 = cyl5.addChild("body_r69", ModelPartBuilder.create().uv(36, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 1.1781F, 0.0F));

		ModelPartData body_r70 = cyl5.addChild("body_r70", ModelPartBuilder.create().uv(42, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 1.5708F, 0.0F));

		ModelPartData body_r71 = cyl5.addChild("body_r71", ModelPartBuilder.create().uv(48, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 1.9635F, 0.0F));

		ModelPartData body_r72 = cyl5.addChild("body_r72", ModelPartBuilder.create().uv(54, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 2.3562F, 0.0F));

		ModelPartData body_r73 = cyl5.addChild("body_r73", ModelPartBuilder.create().uv(60, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, 2.7489F, 0.0F));

		ModelPartData body_r74 = cyl5.addChild("body_r74", ModelPartBuilder.create().uv(66, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -3.1416F, 0.0F));

		ModelPartData body_r75 = cyl5.addChild("body_r75", ModelPartBuilder.create().uv(72, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -2.7489F, 0.0F));

		ModelPartData body_r76 = cyl5.addChild("body_r76", ModelPartBuilder.create().uv(78, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -2.3562F, 0.0F));

		ModelPartData body_r77 = cyl5.addChild("body_r77", ModelPartBuilder.create().uv(84, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -1.9635F, 0.0F));

		ModelPartData body_r78 = cyl5.addChild("body_r78", ModelPartBuilder.create().uv(100, 85).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -1.5708F, 0.0F));

		ModelPartData body_r79 = cyl5.addChild("body_r79", ModelPartBuilder.create().uv(100, 88).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -1.1781F, 0.0F));

		ModelPartData body_r80 = cyl5.addChild("body_r80", ModelPartBuilder.create().uv(90, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -0.7854F, 0.0F));

		ModelPartData body_r81 = cyl5.addChild("body_r81", ModelPartBuilder.create().uv(96, 100).cuboid(-1.0F, 0.25F, 1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 1.0F, 1.2217F, -0.3927F, 0.0F));

		ModelPartData cyl6 = body.addChild("cyl6", ModelPartBuilder.create().uv(80, 96).cuboid(-0.5F, -10.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.5F, 6.0F));

		ModelPartData body_r82 = cyl6.addChild("body_r82", ModelPartBuilder.create().uv(30, 97).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r83 = cyl6.addChild("body_r83", ModelPartBuilder.create().uv(24, 97).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r84 = cyl6.addChild("body_r84", ModelPartBuilder.create().uv(18, 97).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r85 = cyl6.addChild("body_r85", ModelPartBuilder.create().uv(12, 97).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r86 = cyl6.addChild("body_r86", ModelPartBuilder.create().uv(6, 97).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r87 = cyl6.addChild("body_r87", ModelPartBuilder.create().uv(0, 97).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r88 = cyl6.addChild("body_r88", ModelPartBuilder.create().uv(96, 93).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl7 = body.addChild("cyl7", ModelPartBuilder.create().uv(104, 16).cuboid(-0.5F, -9.25F, 0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 6.0F));

		ModelPartData body_r89 = cyl7.addChild("body_r89", ModelPartBuilder.create().uv(104, 14).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r90 = cyl7.addChild("body_r90", ModelPartBuilder.create().uv(104, 12).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r91 = cyl7.addChild("body_r91", ModelPartBuilder.create().uv(104, 10).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r92 = cyl7.addChild("body_r92", ModelPartBuilder.create().uv(104, 8).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r93 = cyl7.addChild("body_r93", ModelPartBuilder.create().uv(104, 6).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r94 = cyl7.addChild("body_r94", ModelPartBuilder.create().uv(104, 4).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r95 = cyl7.addChild("body_r95", ModelPartBuilder.create().uv(104, 2).cuboid(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.75F, 1.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}