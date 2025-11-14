// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;
   
public class EliteBarrelModel {
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
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public EliteBarrelModel(ModelPart root) {
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

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(226, 251).cuboid(-7.0F, 4.25F, 18.0F, 14.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 0).cuboid(-8.0F, 2.75F, 13.0F, 16.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cyl = body.addChild("cyl", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, 0.0F, 11.0F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, -9.0F));

		ModelPartData body_r1 = cyl.addChild("body_r1", ModelPartBuilder.create().uv(36, 66).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r2 = cyl.addChild("body_r2", ModelPartBuilder.create().uv(0, 66).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r3 = cyl.addChild("body_r3", ModelPartBuilder.create().uv(36, 44).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r4 = cyl.addChild("body_r4", ModelPartBuilder.create().uv(0, 44).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r5 = cyl.addChild("body_r5", ModelPartBuilder.create().uv(36, 22).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r6 = cyl.addChild("body_r6", ModelPartBuilder.create().uv(36, 0).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r7 = cyl.addChild("body_r7", ModelPartBuilder.create().uv(0, 22).cuboid(-1.5F, -0.5F, -7.5F, 3.0F, 7.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl1 = body.addChild("cyl1", ModelPartBuilder.create().uv(72, 12).cuboid(-1.5F, 6.0F, 11.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, -9.0F));

		ModelPartData body_r8 = cyl1.addChild("body_r8", ModelPartBuilder.create().uv(72, 92).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r9 = cyl1.addChild("body_r9", ModelPartBuilder.create().uv(36, 88).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r10 = cyl1.addChild("body_r10", ModelPartBuilder.create().uv(0, 88).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r11 = cyl1.addChild("body_r11", ModelPartBuilder.create().uv(72, 76).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r12 = cyl1.addChild("body_r12", ModelPartBuilder.create().uv(72, 60).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r13 = cyl1.addChild("body_r13", ModelPartBuilder.create().uv(72, 44).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r14 = cyl1.addChild("body_r14", ModelPartBuilder.create().uv(72, 28).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl2 = body.addChild("cyl2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, -8.5F));

		ModelPartData body_r15 = cyl2.addChild("body_r15", ModelPartBuilder.create().uv(144, 10).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -0.3927F, 0.0F));

		ModelPartData body_r16 = cyl2.addChild("body_r16", ModelPartBuilder.create().uv(8, 144).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -0.7854F, 0.0F));

		ModelPartData body_r17 = cyl2.addChild("body_r17", ModelPartBuilder.create().uv(0, 144).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -1.1781F, 0.0F));

		ModelPartData body_r18 = cyl2.addChild("body_r18", ModelPartBuilder.create().uv(142, 140).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -1.5708F, 0.0F));

		ModelPartData body_r19 = cyl2.addChild("body_r19", ModelPartBuilder.create().uv(94, 141).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -1.9635F, 0.0F));

		ModelPartData body_r20 = cyl2.addChild("body_r20", ModelPartBuilder.create().uv(86, 141).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -2.3562F, 0.0F));

		ModelPartData body_r21 = cyl2.addChild("body_r21", ModelPartBuilder.create().uv(78, 141).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -2.7489F, 0.0F));

		ModelPartData body_r22 = cyl2.addChild("body_r22", ModelPartBuilder.create().uv(134, 140).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -3.1416F, 0.0F));

		ModelPartData body_r23 = cyl2.addChild("body_r23", ModelPartBuilder.create().uv(126, 140).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 2.7489F, 0.0F));

		ModelPartData body_r24 = cyl2.addChild("body_r24", ModelPartBuilder.create().uv(118, 140).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 2.3562F, 0.0F));

		ModelPartData body_r25 = cyl2.addChild("body_r25", ModelPartBuilder.create().uv(110, 140).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 1.9635F, 0.0F));

		ModelPartData body_r26 = cyl2.addChild("body_r26", ModelPartBuilder.create().uv(102, 140).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 1.5708F, 0.0F));

		ModelPartData body_r27 = cyl2.addChild("body_r27", ModelPartBuilder.create().uv(140, 5).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 1.1781F, 0.0F));

		ModelPartData body_r28 = cyl2.addChild("body_r28", ModelPartBuilder.create().uv(94, 136).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 0.7854F, 0.0F));

		ModelPartData body_r29 = cyl2.addChild("body_r29", ModelPartBuilder.create().uv(86, 136).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 0.3927F, 0.0F));

		ModelPartData body_r30 = cyl2.addChild("body_r30", ModelPartBuilder.create().uv(78, 136).cuboid(-1.5F, 2.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 0.0F, 0.0F));

		ModelPartData cyl3 = body.addChild("cyl3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.5F, -8.5F));

		ModelPartData body_r31 = cyl3.addChild("body_r31", ModelPartBuilder.create().uv(126, 145).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -0.3927F, 0.0F));

		ModelPartData body_r32 = cyl3.addChild("body_r32", ModelPartBuilder.create().uv(118, 145).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -0.7854F, 0.0F));

		ModelPartData body_r33 = cyl3.addChild("body_r33", ModelPartBuilder.create().uv(110, 145).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -1.1781F, 0.0F));

		ModelPartData body_r34 = cyl3.addChild("body_r34", ModelPartBuilder.create().uv(102, 145).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -1.5708F, 0.0F));

		ModelPartData body_r35 = cyl3.addChild("body_r35", ModelPartBuilder.create().uv(144, 89).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -1.9635F, 0.0F));

		ModelPartData body_r36 = cyl3.addChild("body_r36", ModelPartBuilder.create().uv(144, 87).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -2.3562F, 0.0F));

		ModelPartData body_r37 = cyl3.addChild("body_r37", ModelPartBuilder.create().uv(144, 85).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -2.7489F, 0.0F));

		ModelPartData body_r38 = cyl3.addChild("body_r38", ModelPartBuilder.create().uv(144, 83).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, -3.1416F, 0.0F));

		ModelPartData body_r39 = cyl3.addChild("body_r39", ModelPartBuilder.create().uv(144, 81).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 2.7489F, 0.0F));

		ModelPartData body_r40 = cyl3.addChild("body_r40", ModelPartBuilder.create().uv(144, 79).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 2.3562F, 0.0F));

		ModelPartData body_r41 = cyl3.addChild("body_r41", ModelPartBuilder.create().uv(144, 77).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 1.9635F, 0.0F));

		ModelPartData body_r42 = cyl3.addChild("body_r42", ModelPartBuilder.create().uv(144, 75).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 1.5708F, 0.0F));

		ModelPartData body_r43 = cyl3.addChild("body_r43", ModelPartBuilder.create().uv(60, 122).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 1.1781F, 0.0F));

		ModelPartData body_r44 = cyl3.addChild("body_r44", ModelPartBuilder.create().uv(52, 122).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 0.7854F, 0.0F));

		ModelPartData body_r45 = cyl3.addChild("body_r45", ModelPartBuilder.create().uv(60, 120).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 0.3927F, 0.0F));

		ModelPartData body_r46 = cyl3.addChild("body_r46", ModelPartBuilder.create().uv(52, 120).cuboid(-1.5F, 1.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 18.0F, 0.3491F, 0.0F, 0.0F));

		ModelPartData cyl4 = body.addChild("cyl4", ModelPartBuilder.create().uv(108, 92).cuboid(-1.0F, -6.5F, 12.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 4.75F, -8.5F));

		ModelPartData body_r47 = cyl4.addChild("body_r47", ModelPartBuilder.create().uv(78, 124).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r48 = cyl4.addChild("body_r48", ModelPartBuilder.create().uv(52, 124).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r49 = cyl4.addChild("body_r49", ModelPartBuilder.create().uv(26, 120).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r50 = cyl4.addChild("body_r50", ModelPartBuilder.create().uv(0, 120).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r51 = cyl4.addChild("body_r51", ModelPartBuilder.create().uv(108, 116).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r52 = cyl4.addChild("body_r52", ModelPartBuilder.create().uv(114, 0).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r53 = cyl4.addChild("body_r53", ModelPartBuilder.create().uv(108, 104).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, 18.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl5 = body.addChild("cyl5", ModelPartBuilder.create().uv(0, 104).cuboid(-1.5F, 6.0F, 11.0F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 4.0F, -9.0F));

		ModelPartData body_r54 = cyl5.addChild("body_r54", ModelPartBuilder.create().uv(108, 76).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r55 = cyl5.addChild("body_r55", ModelPartBuilder.create().uv(72, 108).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r56 = cyl5.addChild("body_r56", ModelPartBuilder.create().uv(108, 60).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r57 = cyl5.addChild("body_r57", ModelPartBuilder.create().uv(108, 44).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r58 = cyl5.addChild("body_r58", ModelPartBuilder.create().uv(108, 28).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r59 = cyl5.addChild("body_r59", ModelPartBuilder.create().uv(108, 12).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r60 = cyl5.addChild("body_r60", ModelPartBuilder.create().uv(36, 104).cuboid(-1.5F, 5.5F, -7.5F, 3.0F, 1.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 18.5F, 0.0F, 0.3927F, 0.0F));

		ModelPartData cyl6 = body.addChild("cyl6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 13.5F, -8.5F));

		ModelPartData body_r61 = cyl6.addChild("body_r61", ModelPartBuilder.create().uv(144, 70).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -0.3927F, 0.0F));

		ModelPartData body_r62 = cyl6.addChild("body_r62", ModelPartBuilder.create().uv(144, 65).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -0.7854F, 0.0F));

		ModelPartData body_r63 = cyl6.addChild("body_r63", ModelPartBuilder.create().uv(144, 60).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -1.1781F, 0.0F));

		ModelPartData body_r64 = cyl6.addChild("body_r64", ModelPartBuilder.create().uv(144, 55).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -1.5708F, 0.0F));

		ModelPartData body_r65 = cyl6.addChild("body_r65", ModelPartBuilder.create().uv(144, 50).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -1.9635F, 0.0F));

		ModelPartData body_r66 = cyl6.addChild("body_r66", ModelPartBuilder.create().uv(144, 45).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -2.3562F, 0.0F));

		ModelPartData body_r67 = cyl6.addChild("body_r67", ModelPartBuilder.create().uv(144, 40).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -2.7489F, 0.0F));

		ModelPartData body_r68 = cyl6.addChild("body_r68", ModelPartBuilder.create().uv(40, 144).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -3.1416F, 0.0F));

		ModelPartData body_r69 = cyl6.addChild("body_r69", ModelPartBuilder.create().uv(144, 35).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 2.7489F, 0.0F));

		ModelPartData body_r70 = cyl6.addChild("body_r70", ModelPartBuilder.create().uv(32, 144).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 2.3562F, 0.0F));

		ModelPartData body_r71 = cyl6.addChild("body_r71", ModelPartBuilder.create().uv(144, 30).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 1.9635F, 0.0F));

		ModelPartData body_r72 = cyl6.addChild("body_r72", ModelPartBuilder.create().uv(144, 25).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 1.5708F, 0.0F));

		ModelPartData body_r73 = cyl6.addChild("body_r73", ModelPartBuilder.create().uv(24, 144).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 1.1781F, 0.0F));

		ModelPartData body_r74 = cyl6.addChild("body_r74", ModelPartBuilder.create().uv(144, 20).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 0.7854F, 0.0F));

		ModelPartData body_r75 = cyl6.addChild("body_r75", ModelPartBuilder.create().uv(16, 144).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 0.3927F, 0.0F));

		ModelPartData body_r76 = cyl6.addChild("body_r76", ModelPartBuilder.create().uv(144, 15).cuboid(-1.5F, -6.75F, 4.5F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData cyl7 = body.addChild("cyl7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 13.5F, -8.5F));

		ModelPartData body_r77 = cyl7.addChild("body_r77", ModelPartBuilder.create().uv(64, 148).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -0.3927F, 0.0F));

		ModelPartData body_r78 = cyl7.addChild("body_r78", ModelPartBuilder.create().uv(56, 148).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -0.7854F, 0.0F));

		ModelPartData body_r79 = cyl7.addChild("body_r79", ModelPartBuilder.create().uv(48, 148).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -1.1781F, 0.0F));

		ModelPartData body_r80 = cyl7.addChild("body_r80", ModelPartBuilder.create().uv(148, 7).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -1.5708F, 0.0F));

		ModelPartData body_r81 = cyl7.addChild("body_r81", ModelPartBuilder.create().uv(148, 5).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -1.9635F, 0.0F));

		ModelPartData body_r82 = cyl7.addChild("body_r82", ModelPartBuilder.create().uv(142, 147).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -2.3562F, 0.0F));

		ModelPartData body_r83 = cyl7.addChild("body_r83", ModelPartBuilder.create().uv(134, 147).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -2.7489F, 0.0F));

		ModelPartData body_r84 = cyl7.addChild("body_r84", ModelPartBuilder.create().uv(126, 147).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, -3.1416F, 0.0F));

		ModelPartData body_r85 = cyl7.addChild("body_r85", ModelPartBuilder.create().uv(118, 147).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 2.7489F, 0.0F));

		ModelPartData body_r86 = cyl7.addChild("body_r86", ModelPartBuilder.create().uv(110, 147).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 2.3562F, 0.0F));

		ModelPartData body_r87 = cyl7.addChild("body_r87", ModelPartBuilder.create().uv(102, 147).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 1.9635F, 0.0F));

		ModelPartData body_r88 = cyl7.addChild("body_r88", ModelPartBuilder.create().uv(94, 146).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 1.5708F, 0.0F));

		ModelPartData body_r89 = cyl7.addChild("body_r89", ModelPartBuilder.create().uv(86, 146).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 1.1781F, 0.0F));

		ModelPartData body_r90 = cyl7.addChild("body_r90", ModelPartBuilder.create().uv(78, 146).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 0.7854F, 0.0F));

		ModelPartData body_r91 = cyl7.addChild("body_r91", ModelPartBuilder.create().uv(142, 145).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 0.3927F, 0.0F));

		ModelPartData body_r92 = cyl7.addChild("body_r92", ModelPartBuilder.create().uv(134, 145).cuboid(-1.5F, -2.75F, 4.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 18.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData cyl8 = body.addChild("cyl8", ModelPartBuilder.create().uv(104, 128).cuboid(-1.0F, 5.5F, 12.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 8.25F, -8.5F));

		ModelPartData body_r93 = cyl8.addChild("body_r93", ModelPartBuilder.create().uv(52, 136).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 2.7489F, 0.0F));

		ModelPartData body_r94 = cyl8.addChild("body_r94", ModelPartBuilder.create().uv(134, 116).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData body_r95 = cyl8.addChild("body_r95", ModelPartBuilder.create().uv(134, 104).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 1.9635F, 0.0F));

		ModelPartData body_r96 = cyl8.addChild("body_r96", ModelPartBuilder.create().uv(134, 92).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData body_r97 = cyl8.addChild("body_r97", ModelPartBuilder.create().uv(26, 132).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 1.1781F, 0.0F));

		ModelPartData body_r98 = cyl8.addChild("body_r98", ModelPartBuilder.create().uv(0, 132).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData body_r99 = cyl8.addChild("body_r99", ModelPartBuilder.create().uv(130, 128).cuboid(-1.0F, -0.5F, -5.5F, 2.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 18.0F, 0.0F, 0.3927F, 0.0F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}