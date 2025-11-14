// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class CoconutClogsModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart right_arm;
	// private final ModelPart left_arm;
	// private final ModelPart right_leg;
	// private final ModelPart left_leg;

	public CoconutClogsModel(ModelPart root) {
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

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(0, 21).cuboid(-1.75F, 7.5F, -2.25F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 13).cuboid(-2.25F, 7.5F, -2.25F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(42, 32).cuboid(-2.25F, 7.5F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(-1.75F, 7.5F, 1.25F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.25F, 8.4F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 21).cuboid(-1.75F, 8.4F, 1.25F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 0).cuboid(-1.75F, 8.4F, -2.25F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 6).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(42, 29).cuboid(-1.55F, 7.7F, -2.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(-1.5F, 8.7F, -6.1F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(0.5F, 8.7F, -6.1F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(-0.5F, 10.2F, -6.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 27).cuboid(-1.45F, 7.7F, -2.6F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 25).cuboid(-0.1105F, 11.44F, -4.91F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 41).cuboid(-0.6705F, 11.44F, -4.91F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 3).cuboid(-0.1105F, 11.44F, -4.41F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 8).cuboid(-0.6705F, 11.44F, -4.41F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 42).cuboid(-2.6F, 11.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(-2.4F, 11.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 20).cuboid(-2.6F, 11.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(-2.4F, 11.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.4F, 9.85F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 7).cuboid(-2.4F, 10.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(16, 6).cuboid(-2.6F, 9.85F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(16, 13).cuboid(-2.6F, 10.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(24, 20).cuboid(-2.4F, 10.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 22).cuboid(-2.4F, 9.85F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 29).cuboid(-2.6F, 10.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 27).cuboid(-2.6F, 9.85F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

		ModelPartData cube_r1 = right_leg.addChild("cube_r1", ModelPartBuilder.create().uv(19, 35).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 31).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -1.9199F));

		ModelPartData cube_r2 = right_leg.addChild("cube_r2", ModelPartBuilder.create().uv(15, 35).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 33).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -1.309F));

		ModelPartData cube_r3 = right_leg.addChild("cube_r3", ModelPartBuilder.create().uv(11, 35).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -0.6545F));

		ModelPartData cube_r4 = right_leg.addChild("cube_r4", ModelPartBuilder.create().uv(7, 35).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 33).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 0.0F));

		ModelPartData cube_r5 = right_leg.addChild("cube_r5", ModelPartBuilder.create().uv(35, 2).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 15).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 0.6545F));

		ModelPartData cube_r6 = right_leg.addChild("cube_r6", ModelPartBuilder.create().uv(30, 34).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 13).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 1.2654F));

		ModelPartData cube_r7 = right_leg.addChild("cube_r7", ModelPartBuilder.create().uv(26, 34).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 17).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 1.8762F));

		ModelPartData cube_r8 = right_leg.addChild("cube_r8", ModelPartBuilder.create().uv(34, 9).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 33).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 2.5307F));

		ModelPartData cube_r9 = right_leg.addChild("cube_r9", ModelPartBuilder.create().uv(4, 34).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 33).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -3.1416F));

		ModelPartData cube_r10 = right_leg.addChild("cube_r10", ModelPartBuilder.create().uv(34, 0).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 29).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -2.5307F));

		ModelPartData cube_r11 = right_leg.addChild("cube_r11", ModelPartBuilder.create().uv(33, 11).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 31).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -1.9199F));

		ModelPartData cube_r12 = right_leg.addChild("cube_r12", ModelPartBuilder.create().uv(11, 33).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 31).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -1.309F));

		ModelPartData cube_r13 = right_leg.addChild("cube_r13", ModelPartBuilder.create().uv(33, 7).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -0.6545F));

		ModelPartData cube_r14 = right_leg.addChild("cube_r14", ModelPartBuilder.create().uv(7, 33).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 18).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 0.0F));

		ModelPartData cube_r15 = right_leg.addChild("cube_r15", ModelPartBuilder.create().uv(33, 5).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 30).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 0.6545F));

		ModelPartData cube_r16 = right_leg.addChild("cube_r16", ModelPartBuilder.create().uv(30, 32).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 30).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 1.2654F));

		ModelPartData cube_r17 = right_leg.addChild("cube_r17", ModelPartBuilder.create().uv(32, 27).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(31, 1).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 1.8762F));

		ModelPartData cube_r18 = right_leg.addChild("cube_r18", ModelPartBuilder.create().uv(26, 32).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 31).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 2.5307F));

		ModelPartData cube_r19 = right_leg.addChild("cube_r19", ModelPartBuilder.create().uv(4, 32).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 31).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -3.1416F));

		ModelPartData cube_r20 = right_leg.addChild("cube_r20", ModelPartBuilder.create().uv(32, 3).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 31).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -2.5307F));

		ModelPartData cube_r21 = right_leg.addChild("cube_r21", ModelPartBuilder.create().uv(30, 14).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(25, 27).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -1.9199F));

		ModelPartData cube_r22 = right_leg.addChild("cube_r22", ModelPartBuilder.create().uv(30, 12).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -1.309F));

		ModelPartData cube_r23 = right_leg.addChild("cube_r23", ModelPartBuilder.create().uv(30, 8).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -0.6545F));

		ModelPartData cube_r24 = right_leg.addChild("cube_r24", ModelPartBuilder.create().uv(30, 6).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 29).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 0.0F));

		ModelPartData cube_r25 = right_leg.addChild("cube_r25", ModelPartBuilder.create().uv(4, 30).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 29).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 0.6545F));

		ModelPartData cube_r26 = right_leg.addChild("cube_r26", ModelPartBuilder.create().uv(0, 30).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 29).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 1.2654F));

		ModelPartData cube_r27 = right_leg.addChild("cube_r27", ModelPartBuilder.create().uv(29, 26).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 29).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 1.8762F));

		ModelPartData cube_r28 = right_leg.addChild("cube_r28", ModelPartBuilder.create().uv(23, 29).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 28).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 2.5307F));

		ModelPartData cube_r29 = right_leg.addChild("cube_r29", ModelPartBuilder.create().uv(4, 28).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(17, 27).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -3.1416F));

		ModelPartData cube_r30 = right_leg.addChild("cube_r30", ModelPartBuilder.create().uv(28, 2).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(21, 27).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -2.5307F));

		ModelPartData cube_r31 = right_leg.addChild("cube_r31", ModelPartBuilder.create().uv(36, 36).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 36).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -1.9199F));

		ModelPartData cube_r32 = right_leg.addChild("cube_r32", ModelPartBuilder.create().uv(36, 34).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 4).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -1.309F));

		ModelPartData cube_r33 = right_leg.addChild("cube_r33", ModelPartBuilder.create().uv(36, 32).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 6).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r34 = right_leg.addChild("cube_r34", ModelPartBuilder.create().uv(36, 30).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(35, 19).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r35 = right_leg.addChild("cube_r35", ModelPartBuilder.create().uv(30, 36).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(35, 21).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r36 = right_leg.addChild("cube_r36", ModelPartBuilder.create().uv(36, 27).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 35).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 1.2654F));

		ModelPartData cube_r37 = right_leg.addChild("cube_r37", ModelPartBuilder.create().uv(26, 36).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(35, 23).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 1.8762F));

		ModelPartData cube_r38 = right_leg.addChild("cube_r38", ModelPartBuilder.create().uv(36, 16).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(35, 25).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r39 = right_leg.addChild("cube_r39", ModelPartBuilder.create().uv(36, 14).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 35).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -3.1416F));

		ModelPartData cube_r40 = right_leg.addChild("cube_r40", ModelPartBuilder.create().uv(36, 12).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r41 = right_leg.addChild("cube_r41", ModelPartBuilder.create().uv(39, 5).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 37).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -1.9199F));

		ModelPartData cube_r42 = right_leg.addChild("cube_r42", ModelPartBuilder.create().uv(39, 2).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -1.309F));

		ModelPartData cube_r43 = right_leg.addChild("cube_r43", ModelPartBuilder.create().uv(36, 38).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 0).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r44 = right_leg.addChild("cube_r44", ModelPartBuilder.create().uv(30, 38).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 37).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r45 = right_leg.addChild("cube_r45", ModelPartBuilder.create().uv(26, 38).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(37, 8).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r46 = right_leg.addChild("cube_r46", ModelPartBuilder.create().uv(38, 24).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(37, 10).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 1.2654F));

		ModelPartData cube_r47 = right_leg.addChild("cube_r47", ModelPartBuilder.create().uv(38, 22).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 37).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 1.8762F));

		ModelPartData cube_r48 = right_leg.addChild("cube_r48", ModelPartBuilder.create().uv(38, 20).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 37).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r49 = right_leg.addChild("cube_r49", ModelPartBuilder.create().uv(38, 18).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 37).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -3.1416F));

		ModelPartData cube_r50 = right_leg.addChild("cube_r50", ModelPartBuilder.create().uv(4, 38).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 37).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r51 = right_leg.addChild("cube_r51", ModelPartBuilder.create().uv(40, 11).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 26).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -1.9199F));

		ModelPartData cube_r52 = right_leg.addChild("cube_r52", ModelPartBuilder.create().uv(40, 9).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 28).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -1.309F));

		ModelPartData cube_r53 = right_leg.addChild("cube_r53", ModelPartBuilder.create().uv(40, 7).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 31).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -0.6545F));

		ModelPartData cube_r54 = right_leg.addChild("cube_r54", ModelPartBuilder.create().uv(4, 40).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 39).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r55 = right_leg.addChild("cube_r55", ModelPartBuilder.create().uv(0, 40).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 39).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 0.6545F));

		ModelPartData cube_r56 = right_leg.addChild("cube_r56", ModelPartBuilder.create().uv(39, 39).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 13).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 1.2654F));

		ModelPartData cube_r57 = right_leg.addChild("cube_r57", ModelPartBuilder.create().uv(39, 37).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 39).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 1.8762F));

		ModelPartData cube_r58 = right_leg.addChild("cube_r58", ModelPartBuilder.create().uv(39, 35).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 15).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r59 = right_leg.addChild("cube_r59", ModelPartBuilder.create().uv(39, 33).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 39).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -3.1416F));

		ModelPartData cube_r60 = right_leg.addChild("cube_r60", ModelPartBuilder.create().uv(33, 39).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 39).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r61 = right_leg.addChild("cube_r61", ModelPartBuilder.create().uv(16, 24).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 2).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 40).cuboid(-0.7185F, 1.2359F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 41).cuboid(-0.1585F, 1.2359F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -1.9199F));

		ModelPartData cube_r62 = right_leg.addChild("cube_r62", ModelPartBuilder.create().uv(24, 15).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 7).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 40).cuboid(-0.7211F, 1.2358F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 23).cuboid(-0.1611F, 1.2358F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r63 = right_leg.addChild("cube_r63", ModelPartBuilder.create().uv(24, 13).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 9).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 40).cuboid(-0.7235F, 1.2373F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 41).cuboid(-0.1635F, 1.2373F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r64 = right_leg.addChild("cube_r64", ModelPartBuilder.create().uv(24, 6).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 7).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 41).cuboid(-0.7235F, 1.2427F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 14).cuboid(-0.1635F, 1.2427F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r65 = right_leg.addChild("cube_r65", ModelPartBuilder.create().uv(0, 23).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 9).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 41).cuboid(-0.7213F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 42).cuboid(-0.1613F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 1.2654F));

		ModelPartData cube_r66 = right_leg.addChild("cube_r66", ModelPartBuilder.create().uv(0, 21).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 17).cuboid(-0.7187F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 3).cuboid(-0.1587F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 1.8762F));

		ModelPartData cube_r67 = right_leg.addChild("cube_r67", ModelPartBuilder.create().uv(0, 18).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 41).cuboid(-0.7164F, 1.2425F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 0).cuboid(-0.1564F, 1.2425F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r68 = right_leg.addChild("cube_r68", ModelPartBuilder.create().uv(16, 16).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 19).cuboid(-0.7156F, 1.24F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 42).cuboid(-0.1556F, 1.24F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -3.1416F));

		ModelPartData cube_r69 = right_leg.addChild("cube_r69", ModelPartBuilder.create().uv(16, 14).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 0).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 21).cuboid(-0.7164F, 1.2375F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 41).cuboid(-0.1564F, 1.2375F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -2.5307F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(0, 21).cuboid(-1.75F, 7.5F, -2.25F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(24, 13).cuboid(-2.25F, 7.5F, -2.25F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(-1.75F, 7.5F, 1.25F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 32).cuboid(-2.25F, 7.5F, 1.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 6).cuboid(-2.25F, 8.4F, -2.25F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 0).cuboid(-1.75F, 8.4F, -2.25F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(12, 21).cuboid(-1.75F, 8.4F, 1.25F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.25F, 8.4F, 1.25F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 44).cuboid(-2.4F, 11.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 44).cuboid(-2.4F, 11.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 51).cuboid(-2.6F, 11.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(28, 44).cuboid(-2.6F, 11.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 27).cuboid(-1.45F, 7.7F, -2.6F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 29).cuboid(-1.55F, 7.7F, -2.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 27).cuboid(-2.6F, 9.85F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 29).cuboid(-2.6F, 10.35F, 1.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 22).cuboid(-2.4F, 9.85F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 20).cuboid(-2.4F, 10.35F, 1.6F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 13).cuboid(-2.6F, 10.35F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(16, 6).cuboid(-2.6F, 9.85F, -4.0F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 7).cuboid(-2.4F, 10.35F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.4F, 9.85F, -4.0F, 5.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(42, 25).cuboid(-0.1105F, 11.44F, -4.91F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 41).cuboid(-0.6705F, 11.44F, -4.91F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 8).cuboid(-0.6705F, 11.44F, -4.41F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 3).cuboid(-0.1105F, 11.44F, -4.41F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(-0.5F, 10.2F, -6.6F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(-1.5F, 8.7F, -6.1F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 42).cuboid(0.5F, 8.7F, -6.1F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData cube_r70 = left_leg.addChild("cube_r70", ModelPartBuilder.create().uv(0, 7).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 6).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 41).cuboid(-0.7235F, 1.2427F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 14).cuboid(-0.1635F, 1.2427F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r71 = left_leg.addChild("cube_r71", ModelPartBuilder.create().uv(0, 9).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 41).cuboid(-0.7213F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 42).cuboid(-0.1613F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 1.2654F));

		ModelPartData cube_r72 = left_leg.addChild("cube_r72", ModelPartBuilder.create().uv(0, 11).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 17).cuboid(-0.7187F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 3).cuboid(-0.1587F, 1.2442F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 1.8762F));

		ModelPartData cube_r73 = left_leg.addChild("cube_r73", ModelPartBuilder.create().uv(0, 14).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 41).cuboid(-0.7164F, 1.2425F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 0).cuboid(-0.1564F, 1.2425F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r74 = left_leg.addChild("cube_r74", ModelPartBuilder.create().uv(0, 16).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 16).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 19).cuboid(-0.7156F, 1.24F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 42).cuboid(-0.1556F, 1.24F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -3.1416F));

		ModelPartData cube_r75 = left_leg.addChild("cube_r75", ModelPartBuilder.create().uv(16, 0).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 14).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 21).cuboid(-0.7164F, 1.2375F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 41).cuboid(-0.1564F, 1.2375F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -2.5307F));

		ModelPartData cube_r76 = left_leg.addChild("cube_r76", ModelPartBuilder.create().uv(16, 2).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 24).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 40).cuboid(-0.7185F, 1.2359F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 41).cuboid(-0.1585F, 1.2359F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -1.9199F));

		ModelPartData cube_r77 = left_leg.addChild("cube_r77", ModelPartBuilder.create().uv(16, 7).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 15).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 40).cuboid(-0.7211F, 1.2358F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 23).cuboid(-0.1611F, 1.2358F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r78 = left_leg.addChild("cube_r78", ModelPartBuilder.create().uv(16, 9).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 13).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 40).cuboid(-0.7235F, 1.2373F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 41).cuboid(-0.1635F, 1.2373F, -1.06F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -3.85F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r79 = left_leg.addChild("cube_r79", ModelPartBuilder.create().uv(17, 27).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 28).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -3.1416F));

		ModelPartData cube_r80 = left_leg.addChild("cube_r80", ModelPartBuilder.create().uv(21, 27).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 2).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -2.5307F));

		ModelPartData cube_r81 = left_leg.addChild("cube_r81", ModelPartBuilder.create().uv(25, 27).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 14).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -1.9199F));

		ModelPartData cube_r82 = left_leg.addChild("cube_r82", ModelPartBuilder.create().uv(0, 28).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 12).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -1.309F));

		ModelPartData cube_r83 = left_leg.addChild("cube_r83", ModelPartBuilder.create().uv(28, 0).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 8).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, -0.6545F));

		ModelPartData cube_r84 = left_leg.addChild("cube_r84", ModelPartBuilder.create().uv(28, 28).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 29).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 2.5307F));

		ModelPartData cube_r85 = left_leg.addChild("cube_r85", ModelPartBuilder.create().uv(7, 29).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(29, 26).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 1.8762F));

		ModelPartData cube_r86 = left_leg.addChild("cube_r86", ModelPartBuilder.create().uv(11, 29).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 30).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 1.2654F));

		ModelPartData cube_r87 = left_leg.addChild("cube_r87", ModelPartBuilder.create().uv(15, 29).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 6).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 0.0F));

		ModelPartData cube_r88 = left_leg.addChild("cube_r88", ModelPartBuilder.create().uv(19, 29).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 30).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 3.1416F, 0.6545F));

		ModelPartData cube_r89 = left_leg.addChild("cube_r89", ModelPartBuilder.create().uv(30, 18).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 33).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 0.0F));

		ModelPartData cube_r90 = left_leg.addChild("cube_r90", ModelPartBuilder.create().uv(26, 30).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 5).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 0.6545F));

		ModelPartData cube_r91 = left_leg.addChild("cube_r91", ModelPartBuilder.create().uv(30, 30).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 32).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 1.2654F));

		ModelPartData cube_r92 = left_leg.addChild("cube_r92", ModelPartBuilder.create().uv(31, 1).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 27).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 1.8762F));

		ModelPartData cube_r93 = left_leg.addChild("cube_r93", ModelPartBuilder.create().uv(7, 31).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 32).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, 2.5307F));

		ModelPartData cube_r94 = left_leg.addChild("cube_r94", ModelPartBuilder.create().uv(11, 31).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 3).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -2.5307F));

		ModelPartData cube_r95 = left_leg.addChild("cube_r95", ModelPartBuilder.create().uv(15, 31).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 32).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -3.1416F));

		ModelPartData cube_r96 = left_leg.addChild("cube_r96", ModelPartBuilder.create().uv(19, 31).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 11).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -1.9199F));

		ModelPartData cube_r97 = left_leg.addChild("cube_r97", ModelPartBuilder.create().uv(23, 31).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 33).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -1.309F));

		ModelPartData cube_r98 = left_leg.addChild("cube_r98", ModelPartBuilder.create().uv(0, 32).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 7).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 3.1416F, -0.6545F));

		ModelPartData cube_r99 = left_leg.addChild("cube_r99", ModelPartBuilder.create().uv(33, 13).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 34).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 1.2654F));

		ModelPartData cube_r100 = left_leg.addChild("cube_r100", ModelPartBuilder.create().uv(15, 33).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 35).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 0.0F));

		ModelPartData cube_r101 = left_leg.addChild("cube_r101", ModelPartBuilder.create().uv(33, 15).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(35, 2).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 0.6545F));

		ModelPartData cube_r102 = left_leg.addChild("cube_r102", ModelPartBuilder.create().uv(33, 17).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 34).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 1.8762F));

		ModelPartData cube_r103 = left_leg.addChild("cube_r103", ModelPartBuilder.create().uv(19, 33).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 9).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, 2.5307F));

		ModelPartData cube_r104 = left_leg.addChild("cube_r104", ModelPartBuilder.create().uv(23, 33).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 34).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -3.1416F));

		ModelPartData cube_r105 = left_leg.addChild("cube_r105", ModelPartBuilder.create().uv(33, 29).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 0).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -2.5307F));

		ModelPartData cube_r106 = left_leg.addChild("cube_r106", ModelPartBuilder.create().uv(33, 31).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 35).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -1.9199F));

		ModelPartData cube_r107 = left_leg.addChild("cube_r107", ModelPartBuilder.create().uv(33, 33).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 35).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -1.309F));

		ModelPartData cube_r108 = left_leg.addChild("cube_r108", ModelPartBuilder.create().uv(0, 34).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 35).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 3.1416F, -0.6545F));

		ModelPartData cube_r109 = left_leg.addChild("cube_r109", ModelPartBuilder.create().uv(35, 19).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 30).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r110 = left_leg.addChild("cube_r110", ModelPartBuilder.create().uv(35, 21).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 36).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r111 = left_leg.addChild("cube_r111", ModelPartBuilder.create().uv(23, 35).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 27).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 1.2654F));

		ModelPartData cube_r112 = left_leg.addChild("cube_r112", ModelPartBuilder.create().uv(35, 23).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 36).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 1.8762F));

		ModelPartData cube_r113 = left_leg.addChild("cube_r113", ModelPartBuilder.create().uv(35, 25).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 16).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r114 = left_leg.addChild("cube_r114", ModelPartBuilder.create().uv(33, 35).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 14).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -3.1416F));

		ModelPartData cube_r115 = left_leg.addChild("cube_r115", ModelPartBuilder.create().uv(0, 36).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 12).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r116 = left_leg.addChild("cube_r116", ModelPartBuilder.create().uv(4, 36).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 36).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -1.9199F));

		ModelPartData cube_r117 = left_leg.addChild("cube_r117", ModelPartBuilder.create().uv(36, 4).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 34).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -1.309F));

		ModelPartData cube_r118 = left_leg.addChild("cube_r118", ModelPartBuilder.create().uv(36, 6).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 32).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r119 = left_leg.addChild("cube_r119", ModelPartBuilder.create().uv(7, 37).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 38).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r120 = left_leg.addChild("cube_r120", ModelPartBuilder.create().uv(37, 8).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 38).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r121 = left_leg.addChild("cube_r121", ModelPartBuilder.create().uv(37, 10).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 24).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 1.2654F));

		ModelPartData cube_r122 = left_leg.addChild("cube_r122", ModelPartBuilder.create().uv(11, 37).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 22).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 1.8762F));

		ModelPartData cube_r123 = left_leg.addChild("cube_r123", ModelPartBuilder.create().uv(15, 37).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 20).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r124 = left_leg.addChild("cube_r124", ModelPartBuilder.create().uv(19, 37).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 18).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -3.1416F));

		ModelPartData cube_r125 = left_leg.addChild("cube_r125", ModelPartBuilder.create().uv(23, 37).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 38).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r126 = left_leg.addChild("cube_r126", ModelPartBuilder.create().uv(33, 37).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 5).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -1.9199F));

		ModelPartData cube_r127 = left_leg.addChild("cube_r127", ModelPartBuilder.create().uv(0, 38).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 2).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -1.309F));

		ModelPartData cube_r128 = left_leg.addChild("cube_r128", ModelPartBuilder.create().uv(38, 0).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 38).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r129 = left_leg.addChild("cube_r129", ModelPartBuilder.create().uv(7, 39).cuboid(-0.1644F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 40).cuboid(-0.7244F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r130 = left_leg.addChild("cube_r130", ModelPartBuilder.create().uv(11, 39).cuboid(-0.1635F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 40).cuboid(-0.7235F, 1.2427F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 0.6545F));

		ModelPartData cube_r131 = left_leg.addChild("cube_r131", ModelPartBuilder.create().uv(39, 13).cuboid(-0.1613F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 39).cuboid(-0.7213F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 1.2654F));

		ModelPartData cube_r132 = left_leg.addChild("cube_r132", ModelPartBuilder.create().uv(15, 39).cuboid(-0.1587F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 37).cuboid(-0.7187F, 1.2442F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 1.8762F));

		ModelPartData cube_r133 = left_leg.addChild("cube_r133", ModelPartBuilder.create().uv(39, 15).cuboid(-0.1564F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 35).cuboid(-0.7164F, 1.2425F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r134 = left_leg.addChild("cube_r134", ModelPartBuilder.create().uv(19, 39).cuboid(-0.1556F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 33).cuboid(-0.7156F, 1.24F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -3.1416F));

		ModelPartData cube_r135 = left_leg.addChild("cube_r135", ModelPartBuilder.create().uv(23, 39).cuboid(-0.1564F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 39).cuboid(-0.7164F, 1.2375F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r136 = left_leg.addChild("cube_r136", ModelPartBuilder.create().uv(39, 26).cuboid(-0.1585F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 11).cuboid(-0.7185F, 1.2359F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -1.9199F));

		ModelPartData cube_r137 = left_leg.addChild("cube_r137", ModelPartBuilder.create().uv(39, 28).cuboid(-0.1611F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 9).cuboid(-0.7211F, 1.2358F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -1.309F));

		ModelPartData cube_r138 = left_leg.addChild("cube_r138", ModelPartBuilder.create().uv(39, 31).cuboid(-0.1635F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 7).cuboid(-0.7235F, 1.2373F, -0.56F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0539F, 10.2F, -4.1F, -0.48F, 0.0F, -0.6545F));
		return modelData;
	}
}