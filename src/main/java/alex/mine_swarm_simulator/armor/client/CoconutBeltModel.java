// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package alex.mine_swarm_simulator.armor.client;

import net.minecraft.client.model.*;

public class CoconutBeltModel {
	// private final ModelPart head;
	// private final ModelPart hat;
	// private final ModelPart body;
	// private final ModelPart small_coconut;
	// private final ModelPart small_coconut2;
	// private final ModelPart middle_coconut;
	// private final ModelPart middle_coconut2;
	// private final ModelPart center_coconut;
	// private final ModelPart blue_triangle1;
	// private final ModelPart blue_triangle2;
	// private final ModelPart red_triangle1;
	// private final ModelPart red_triangle2;
	// private final ModelPart left_arm;
	// private final ModelPart right_arm;
	// private final ModelPart left_leg;
	// private final ModelPart right_leg;
	public CoconutBeltModel(ModelPart root) {
		// this.head = root.getChild("head");
		// this.hat = root.getChild("hat");
		// this.body = root.getChild("body");
		// this.small_coconut = root.getChild("small_coconut");
		// this.small_coconut2 = root.getChild("small_coconut2");
		// this.middle_coconut = root.getChild("middle_coconut");
		// this.middle_coconut2 = root.getChild("middle_coconut2");
		// this.center_coconut = root.getChild("center_coconut");
		// this.blue_triangle1 = root.getChild("blue_triangle1");
		// this.blue_triangle2 = root.getChild("blue_triangle2");
		// this.red_triangle1 = root.getChild("red_triangle1");
		// this.red_triangle2 = root.getChild("red_triangle2");
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

		ModelPartData small_coconut = body.addChild("small_coconut", ModelPartBuilder.create().uv(32, 72).cuboid(5.1829F, -12.3621F, -9.5753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 86).cuboid(4.6229F, -12.3621F, -9.5753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 84).cuboid(4.6229F, -12.3621F, -9.0753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 80).cuboid(5.1829F, -12.3621F, -9.0753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 84).cuboid(4.7934F, -13.6021F, -11.2653F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 86).cuboid(3.7934F, -15.1021F, -10.7653F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 88).cuboid(5.7934F, -15.1021F, -10.7653F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, -0.0873F, -0.9163F, 0.0F));

		ModelPartData cube_r1 = small_coconut.addChild("cube_r1", ModelPartBuilder.create().uv(56, 88).cuboid(0.282F, 0.52F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 80).cuboid(-0.278F, 0.52F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 84).cuboid(-0.278F, 0.52F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 72).cuboid(0.282F, 0.52F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r2 = small_coconut.addChild("cube_r2", ModelPartBuilder.create().uv(56, 86).cuboid(-0.2109F, 0.3967F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 86).cuboid(-0.7709F, 0.3967F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 72).cuboid(-0.7709F, 0.3967F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 72).cuboid(-0.2109F, 0.3967F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 1.2654F));

		ModelPartData cube_r3 = small_coconut.addChild("cube_r3", ModelPartBuilder.create().uv(24, 80).cuboid(-0.6854F, 0.5784F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 88).cuboid(-1.2454F, 0.5784F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 82).cuboid(-1.2454F, 0.5784F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 84).cuboid(-0.6854F, 0.5784F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 1.8762F));

		ModelPartData cube_r4 = small_coconut.addChild("cube_r4", ModelPartBuilder.create().uv(56, 84).cuboid(-0.9796F, 1.0349F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 80).cuboid(-1.5396F, 1.0349F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 88).cuboid(-1.5396F, 1.0349F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 86).cuboid(-0.9796F, 1.0349F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r5 = small_coconut.addChild("cube_r5", ModelPartBuilder.create().uv(56, 82).cuboid(-0.949F, 1.5421F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 82).cuboid(-1.509F, 1.5421F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 72).cuboid(-1.509F, 1.5421F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 72).cuboid(-0.949F, 1.5421F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -3.1416F));

		ModelPartData cube_r6 = small_coconut.addChild("cube_r6", ModelPartBuilder.create().uv(20, 80).cuboid(-0.633F, 1.94F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 84).cuboid(-1.193F, 1.94F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 86).cuboid(-1.193F, 1.94F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 88).cuboid(-0.633F, 1.94F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -2.5307F));

		ModelPartData cube_r7 = small_coconut.addChild("cube_r7", ModelPartBuilder.create().uv(44, 88).cuboid(-0.146F, 2.0847F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 88).cuboid(-0.706F, 2.0847F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 82).cuboid(-0.706F, 2.0847F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 82).cuboid(-0.146F, 2.0847F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -1.9199F));

		ModelPartData cube_r8 = small_coconut.addChild("cube_r8", ModelPartBuilder.create().uv(44, 86).cuboid(0.336F, 1.9239F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 80).cuboid(-0.224F, 1.9239F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 88).cuboid(-0.224F, 1.9239F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 72).cuboid(0.336F, 1.9239F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r9 = small_coconut.addChild("cube_r9", ModelPartBuilder.create().uv(16, 80).cuboid(0.6498F, 1.4806F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 82).cuboid(0.0898F, 1.4806F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 72).cuboid(0.0898F, 1.4806F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 84).cuboid(0.6498F, 1.4806F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r10 = small_coconut.addChild("cube_r10", ModelPartBuilder.create().uv(20, 86).cuboid(0.0777F, 1.7779F, -0.9391F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 78).cuboid(0.6377F, 1.7779F, -0.9391F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, -3.1416F));

		ModelPartData cube_r11 = small_coconut.addChild("cube_r11", ModelPartBuilder.create().uv(0, 80).cuboid(0.3202F, 2.1306F, -0.7542F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 88).cuboid(-0.2398F, 2.1306F, -0.7542F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, -2.5307F));

		ModelPartData cube_r12 = small_coconut.addChild("cube_r12", ModelPartBuilder.create().uv(20, 84).cuboid(-0.171F, 2.2588F, -0.6866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 86).cuboid(-0.731F, 2.2588F, -0.6866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, -1.9199F));

		ModelPartData cube_r13 = small_coconut.addChild("cube_r13", ModelPartBuilder.create().uv(20, 82).cuboid(-0.6583F, 2.1161F, -0.7609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 88).cuboid(-1.2183F, 2.1161F, -0.7609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, -1.309F));

		ModelPartData cube_r14 = small_coconut.addChild("cube_r14", ModelPartBuilder.create().uv(68, 82).cuboid(-0.9768F, 1.7231F, -0.9663F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 78).cuboid(-1.5368F, 1.7231F, -0.9663F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, -0.6545F));

		ModelPartData cube_r15 = small_coconut.addChild("cube_r15", ModelPartBuilder.create().uv(8, 86).cuboid(0.6668F, 1.3284F, -1.1744F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 78).cuboid(0.1068F, 1.3284F, -1.1744F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, 2.5307F));

		ModelPartData cube_r16 = small_coconut.addChild("cube_r16", ModelPartBuilder.create().uv(8, 84).cuboid(0.368F, 0.9236F, -1.386F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 78).cuboid(-0.192F, 0.9236F, -1.386F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, 1.8762F));

		ModelPartData cube_r17 = small_coconut.addChild("cube_r17", ModelPartBuilder.create().uv(28, 78).cuboid(-0.1118F, 0.7624F, -1.4699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 78).cuboid(-0.6718F, 0.7624F, -1.4699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, 1.2654F));

		ModelPartData cube_r18 = small_coconut.addChild("cube_r18", ModelPartBuilder.create().uv(8, 82).cuboid(-0.9577F, 1.242F, -1.2181F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 88).cuboid(-1.5177F, 1.242F, -1.2181F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, 0.0F));

		ModelPartData cube_r19 = small_coconut.addChild("cube_r19", ModelPartBuilder.create().uv(68, 70).cuboid(-0.609F, 0.8716F, -1.4123F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 82).cuboid(-1.169F, 0.8716F, -1.4123F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 3.1416F, 0.6545F));

		ModelPartData cube_r20 = small_coconut.addChild("cube_r20", ModelPartBuilder.create().uv(8, 78).cuboid(-0.9577F, 1.5456F, -1.1428F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 76).cuboid(-1.5177F, 1.5456F, -1.1428F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, 0.0F));

		ModelPartData cube_r21 = small_coconut.addChild("cube_r21", ModelPartBuilder.create().uv(0, 84).cuboid(-0.609F, 1.3071F, -1.4873F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 78).cuboid(-1.169F, 1.3071F, -1.4873F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, 0.6545F));

		ModelPartData cube_r22 = small_coconut.addChild("cube_r22", ModelPartBuilder.create().uv(0, 82).cuboid(-0.1118F, 1.237F, -1.5896F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 78).cuboid(-0.6718F, 1.237F, -1.5896F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, 1.2654F));

		ModelPartData cube_r23 = small_coconut.addChild("cube_r23", ModelPartBuilder.create().uv(4, 78).cuboid(0.368F, 1.3412F, -1.4407F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 78).cuboid(-0.192F, 1.3412F, -1.4407F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, 1.8762F));

		ModelPartData cube_r24 = small_coconut.addChild("cube_r24", ModelPartBuilder.create().uv(0, 78).cuboid(0.6668F, 1.6024F, -1.0654F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 78).cuboid(0.1068F, 1.6024F, -1.0654F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, 2.5307F));

		ModelPartData cube_r25 = small_coconut.addChild("cube_r25", ModelPartBuilder.create().uv(56, 80).cuboid(0.3202F, 2.1194F, -0.3199F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 78).cuboid(-0.2398F, 2.1194F, -0.3199F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, -2.5307F));

		ModelPartData cube_r26 = small_coconut.addChild("cube_r26", ModelPartBuilder.create().uv(36, 78).cuboid(0.6377F, 1.8922F, -0.6479F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 78).cuboid(0.0777F, 1.8922F, -0.6479F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, -3.1416F));

		ModelPartData cube_r27 = small_coconut.addChild("cube_r27", ModelPartBuilder.create().uv(60, 80).cuboid(-0.171F, 2.2017F, -0.2F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 76).cuboid(-0.731F, 2.2017F, -0.2F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, -1.9199F));

		ModelPartData cube_r28 = small_coconut.addChild("cube_r28", ModelPartBuilder.create().uv(68, 78).cuboid(-0.6583F, 2.1094F, -0.3317F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 76).cuboid(-1.2183F, 2.1094F, -0.3317F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, -1.309F));

		ModelPartData cube_r29 = small_coconut.addChild("cube_r29", ModelPartBuilder.create().uv(64, 78).cuboid(-0.9768F, 1.8558F, -0.6961F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 76).cuboid(-1.5368F, 1.8558F, -0.6961F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 3.1416F, -0.6545F));

		ModelPartData cube_r30 = small_coconut.addChild("cube_r30", ModelPartBuilder.create().uv(16, 76).cuboid(-0.1118F, 1.5896F, -1.5299F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 76).cuboid(-0.6718F, 1.5896F, -1.5299F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, 1.2654F));

		ModelPartData cube_r31 = small_coconut.addChild("cube_r31", ModelPartBuilder.create().uv(12, 76).cuboid(-0.9577F, 1.7265F, -1.0031F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 84).cuboid(-1.5177F, 1.7265F, -1.0031F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, 0.0F));

		ModelPartData cube_r32 = small_coconut.addChild("cube_r32", ModelPartBuilder.create().uv(8, 76).cuboid(-0.609F, 1.6204F, -1.4093F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 86).cuboid(-1.169F, 1.6204F, -1.4093F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, 0.6545F));

		ModelPartData cube_r33 = small_coconut.addChild("cube_r33", ModelPartBuilder.create().uv(4, 76).cuboid(0.368F, 1.6366F, -1.3544F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 88).cuboid(-0.192F, 1.6366F, -1.3544F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, 1.8762F));

		ModelPartData cube_r34 = small_coconut.addChild("cube_r34", ModelPartBuilder.create().uv(52, 80).cuboid(0.6668F, 1.7535F, -0.9118F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 82).cuboid(0.1068F, 1.7535F, -0.9118F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, 2.5307F));

		ModelPartData cube_r35 = small_coconut.addChild("cube_r35", ModelPartBuilder.create().uv(48, 80).cuboid(0.6377F, 1.8829F, -0.4195F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 84).cuboid(0.0777F, 1.8829F, -0.4195F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, -3.1416F));

		ModelPartData cube_r36 = small_coconut.addChild("cube_r36", ModelPartBuilder.create().uv(0, 76).cuboid(0.3202F, 1.984F, -0.0327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 86).cuboid(-0.2398F, 1.984F, -0.0327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, -2.5307F));

		ModelPartData cube_r37 = small_coconut.addChild("cube_r37", ModelPartBuilder.create().uv(64, 80).cuboid(-0.171F, 2.0203F, 0.1086F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 88).cuboid(-0.731F, 2.0203F, 0.1086F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, -1.9199F));

		ModelPartData cube_r38 = small_coconut.addChild("cube_r38", ModelPartBuilder.create().uv(36, 76).cuboid(-0.6583F, 1.9786F, -0.0466F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 82).cuboid(-1.2183F, 1.9786F, -0.0466F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, -1.309F));

		ModelPartData cube_r39 = small_coconut.addChild("cube_r39", ModelPartBuilder.create().uv(68, 80).cuboid(-0.9768F, 1.865F, -0.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 76).cuboid(-1.5368F, 1.865F, -0.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 3.1416F, -0.6545F));

		ModelPartData cube_r40 = small_coconut.addChild("cube_r40", ModelPartBuilder.create().uv(60, 76).cuboid(0.629F, 0.5971F, -0.7005F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 82).cuboid(0.069F, 0.5971F, -0.7005F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r41 = small_coconut.addChild("cube_r41", ModelPartBuilder.create().uv(40, 86).cuboid(0.282F, 0.4909F, -1.1067F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 76).cuboid(-0.278F, 0.4909F, -1.1067F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r42 = small_coconut.addChild("cube_r42", ModelPartBuilder.create().uv(40, 84).cuboid(-0.2109F, 0.4601F, -1.2273F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 84).cuboid(-0.7709F, 0.4601F, -1.2273F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 1.2654F));

		ModelPartData cube_r43 = small_coconut.addChild("cube_r43", ModelPartBuilder.create().uv(56, 76).cuboid(-0.6854F, 0.5071F, -1.0518F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 86).cuboid(-1.2454F, 0.5071F, -1.0518F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 1.8762F));

		ModelPartData cube_r44 = small_coconut.addChild("cube_r44", ModelPartBuilder.create().uv(40, 82).cuboid(-0.9796F, 0.6241F, -0.6092F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 76).cuboid(-1.5396F, 0.6241F, -0.6092F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r45 = small_coconut.addChild("cube_r45", ModelPartBuilder.create().uv(28, 88).cuboid(-0.949F, 0.7535F, -0.1169F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 88).cuboid(-1.509F, 0.7535F, -0.1169F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -3.1416F));

		ModelPartData cube_r46 = small_coconut.addChild("cube_r46", ModelPartBuilder.create().uv(52, 76).cuboid(-0.633F, 0.8546F, 0.2699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 82).cuboid(-1.193F, 0.8546F, 0.2699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r47 = small_coconut.addChild("cube_r47", ModelPartBuilder.create().uv(28, 86).cuboid(-0.146F, 0.8908F, 0.4112F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 86).cuboid(-0.706F, 0.8908F, 0.4112F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -1.9199F));

		ModelPartData cube_r48 = small_coconut.addChild("cube_r48", ModelPartBuilder.create().uv(28, 84).cuboid(0.336F, 0.8491F, 0.256F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 88).cuboid(-0.224F, 0.8491F, 0.256F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -1.309F));

		ModelPartData cube_r49 = small_coconut.addChild("cube_r49", ModelPartBuilder.create().uv(48, 76).cuboid(0.6498F, 0.7356F, -0.1737F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 88).cuboid(0.0898F, 0.7356F, -0.1737F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r50 = small_coconut.addChild("cube_r50", ModelPartBuilder.create().uv(32, 74).cuboid(0.629F, 0.5878F, -0.4721F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 74).cuboid(0.069F, 0.5878F, -0.4721F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r51 = small_coconut.addChild("cube_r51", ModelPartBuilder.create().uv(4, 84).cuboid(0.282F, 0.3493F, -0.8166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 86).cuboid(-0.278F, 0.3493F, -0.8166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r52 = small_coconut.addChild("cube_r52", ModelPartBuilder.create().uv(4, 82).cuboid(-0.2109F, 0.2792F, -0.9189F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 74).cuboid(-0.7709F, 0.2792F, -0.9189F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 1.2654F));

		ModelPartData cube_r53 = small_coconut.addChild("cube_r53", ModelPartBuilder.create().uv(28, 74).cuboid(-0.6854F, 0.3834F, -0.77F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 74).cuboid(-1.2454F, 0.3834F, -0.77F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 1.8762F));

		ModelPartData cube_r54 = small_coconut.addChild("cube_r54", ModelPartBuilder.create().uv(24, 74).cuboid(-0.9796F, 0.6445F, -0.3947F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 80).cuboid(-1.5396F, 0.6445F, -0.3947F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r55 = small_coconut.addChild("cube_r55", ModelPartBuilder.create().uv(20, 74).cuboid(-0.949F, 0.9344F, 0.0228F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(36, 80).cuboid(-1.509F, 0.9344F, 0.0228F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -3.1416F));

		ModelPartData cube_r56 = small_coconut.addChild("cube_r56", ModelPartBuilder.create().uv(16, 74).cuboid(-0.633F, 1.1615F, 0.3508F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 74).cuboid(-1.193F, 1.1615F, 0.3508F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r57 = small_coconut.addChild("cube_r57", ModelPartBuilder.create().uv(12, 74).cuboid(-0.146F, 1.2438F, 0.4707F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 74).cuboid(-0.706F, 1.2438F, 0.4707F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -1.9199F));

		ModelPartData cube_r58 = small_coconut.addChild("cube_r58", ModelPartBuilder.create().uv(44, 80).cuboid(0.336F, 1.1515F, 0.339F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 74).cuboid(-0.224F, 1.1515F, 0.339F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -1.309F));

		ModelPartData cube_r59 = small_coconut.addChild("cube_r59", ModelPartBuilder.create().uv(40, 80).cuboid(0.6498F, 0.8979F, -0.0254F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 74).cuboid(0.0898F, 0.8979F, -0.0254F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r60 = small_coconut.addChild("cube_r60", ModelPartBuilder.create().uv(56, 74).cuboid(0.629F, 0.7021F, -0.1809F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 72).cuboid(0.069F, 0.7021F, -0.1809F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r61 = small_coconut.addChild("cube_r61", ModelPartBuilder.create().uv(52, 74).cuboid(0.282F, 0.3317F, -0.3751F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 88).cuboid(-0.278F, 0.3317F, -0.3751F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 0.6545F));

		ModelPartData cube_r62 = small_coconut.addChild("cube_r62", ModelPartBuilder.create().uv(48, 74).cuboid(-0.2109F, 0.2225F, -0.4327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 82).cuboid(-0.7709F, 0.2225F, -0.4327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 1.2654F));

		ModelPartData cube_r63 = small_coconut.addChild("cube_r63", ModelPartBuilder.create().uv(44, 74).cuboid(-0.6854F, 0.3837F, -0.3488F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 84).cuboid(-1.2454F, 0.3837F, -0.3488F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 1.8762F));

		ModelPartData cube_r64 = small_coconut.addChild("cube_r64", ModelPartBuilder.create().uv(40, 74).cuboid(-0.9796F, 0.7884F, -0.1373F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 72).cuboid(-1.5396F, 0.7884F, -0.1373F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r65 = small_coconut.addChild("cube_r65", ModelPartBuilder.create().uv(28, 72).cuboid(-0.949F, 1.238F, 0.0981F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 72).cuboid(-1.509F, 1.238F, 0.0981F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -3.1416F));

		ModelPartData cube_r66 = small_coconut.addChild("cube_r66", ModelPartBuilder.create().uv(24, 72).cuboid(-0.633F, 1.5907F, 0.283F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 72).cuboid(-1.193F, 1.5907F, 0.283F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r67 = small_coconut.addChild("cube_r67", ModelPartBuilder.create().uv(20, 72).cuboid(-0.146F, 1.7188F, 0.3505F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 72).cuboid(-0.706F, 1.7188F, 0.3505F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -1.9199F));

		ModelPartData cube_r68 = small_coconut.addChild("cube_r68", ModelPartBuilder.create().uv(16, 72).cuboid(0.336F, 1.5762F, 0.2763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 84).cuboid(-0.224F, 1.5762F, 0.2763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -1.309F));

		ModelPartData cube_r69 = small_coconut.addChild("cube_r69", ModelPartBuilder.create().uv(12, 72).cuboid(0.6498F, 1.1832F, 0.0709F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 86).cuboid(0.0898F, 1.1832F, 0.0709F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -0.6545F));

		ModelPartData small_coconut2 = body.addChild("small_coconut2", ModelPartBuilder.create().uv(32, 72).mirrored().cuboid(-6.1829F, -12.3621F, -9.5753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 86).mirrored().cuboid(-5.6229F, -12.3621F, -9.5753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 84).mirrored().cuboid(-5.6229F, -12.3621F, -9.0753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(28, 80).mirrored().cuboid(-6.1829F, -12.3621F, -9.0753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(68, 84).mirrored().cuboid(-5.7934F, -13.6021F, -11.2653F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(68, 86).mirrored().cuboid(-4.7934F, -15.1021F, -10.7653F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(68, 88).mirrored().cuboid(-6.7934F, -15.1021F, -10.7653F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 24.0F, 0.0F, -0.0873F, 0.9163F, 0.0F));

		ModelPartData cube_r70 = small_coconut2.addChild("cube_r70", ModelPartBuilder.create().uv(56, 88).mirrored().cuboid(-1.282F, 0.52F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(8, 80).mirrored().cuboid(-0.722F, 0.52F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 84).mirrored().cuboid(-0.722F, 0.52F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 72).mirrored().cuboid(-1.282F, 0.52F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r71 = small_coconut2.addChild("cube_r71", ModelPartBuilder.create().uv(56, 86).mirrored().cuboid(-0.7891F, 0.3967F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 86).mirrored().cuboid(-0.2291F, 0.3967F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(56, 72).mirrored().cuboid(-0.2291F, 0.3967F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(40, 72).mirrored().cuboid(-0.7891F, 0.3967F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -1.2654F));

		ModelPartData cube_r72 = small_coconut2.addChild("cube_r72", ModelPartBuilder.create().uv(24, 80).mirrored().cuboid(-0.3146F, 0.5784F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 88).mirrored().cuboid(0.2454F, 0.5784F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 82).mirrored().cuboid(0.2454F, 0.5784F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 84).mirrored().cuboid(-0.3146F, 0.5784F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -1.8762F));

		ModelPartData cube_r73 = small_coconut2.addChild("cube_r73", ModelPartBuilder.create().uv(56, 84).mirrored().cuboid(-0.0204F, 1.0349F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 80).mirrored().cuboid(0.5396F, 1.0349F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 88).mirrored().cuboid(0.5396F, 1.0349F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 86).mirrored().cuboid(-0.0204F, 1.0349F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, -2.5307F));

		ModelPartData cube_r74 = small_coconut2.addChild("cube_r74", ModelPartBuilder.create().uv(56, 82).mirrored().cuboid(-0.051F, 1.5421F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(44, 82).mirrored().cuboid(0.509F, 1.5421F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(52, 72).mirrored().cuboid(0.509F, 1.5421F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(44, 72).mirrored().cuboid(-0.051F, 1.5421F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 3.1416F));

		ModelPartData cube_r75 = small_coconut2.addChild("cube_r75", ModelPartBuilder.create().uv(20, 80).mirrored().cuboid(-0.367F, 1.94F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(44, 84).mirrored().cuboid(0.193F, 1.94F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 86).mirrored().cuboid(0.193F, 1.94F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 88).mirrored().cuboid(-0.367F, 1.94F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r76 = small_coconut2.addChild("cube_r76", ModelPartBuilder.create().uv(44, 88).mirrored().cuboid(-0.854F, 2.0847F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(20, 88).mirrored().cuboid(-0.294F, 2.0847F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(48, 82).mirrored().cuboid(-0.294F, 2.0847F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 82).mirrored().cuboid(-0.854F, 2.0847F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 1.9199F));

		ModelPartData cube_r77 = small_coconut2.addChild("cube_r77", ModelPartBuilder.create().uv(44, 86).mirrored().cuboid(-1.336F, 1.9239F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(4, 80).mirrored().cuboid(-0.776F, 1.9239F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 88).mirrored().cuboid(-0.776F, 1.9239F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(48, 72).mirrored().cuboid(-1.336F, 1.9239F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 1.309F));

		ModelPartData cube_r78 = small_coconut2.addChild("cube_r78", ModelPartBuilder.create().uv(16, 80).mirrored().cuboid(-1.6498F, 1.4806F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 82).mirrored().cuboid(-1.0898F, 1.4806F, 0.0247F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 72).mirrored().cuboid(-1.0898F, 1.4806F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 84).mirrored().cuboid(-1.6498F, 1.4806F, -0.4753F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.1F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r79 = small_coconut2.addChild("cube_r79", ModelPartBuilder.create().uv(20, 86).mirrored().cuboid(-1.0777F, 1.7779F, -0.9391F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 78).mirrored().cuboid(-1.6377F, 1.7779F, -0.9391F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, 3.1416F));

		ModelPartData cube_r80 = small_coconut2.addChild("cube_r80", ModelPartBuilder.create().uv(0, 80).mirrored().cuboid(-1.3202F, 2.1306F, -0.7542F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(8, 88).mirrored().cuboid(-0.7602F, 2.1306F, -0.7542F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, 2.5307F));

		ModelPartData cube_r81 = small_coconut2.addChild("cube_r81", ModelPartBuilder.create().uv(20, 84).mirrored().cuboid(-0.829F, 2.2588F, -0.6866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 86).mirrored().cuboid(-0.269F, 2.2588F, -0.6866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, 1.9199F));

		ModelPartData cube_r82 = small_coconut2.addChild("cube_r82", ModelPartBuilder.create().uv(20, 82).mirrored().cuboid(-0.3417F, 2.1161F, -0.7609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 88).mirrored().cuboid(0.2183F, 2.1161F, -0.7609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, 1.309F));

		ModelPartData cube_r83 = small_coconut2.addChild("cube_r83", ModelPartBuilder.create().uv(68, 82).mirrored().cuboid(-0.0232F, 1.7231F, -0.9663F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 78).mirrored().cuboid(0.5368F, 1.7231F, -0.9663F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, 0.6545F));

		ModelPartData cube_r84 = small_coconut2.addChild("cube_r84", ModelPartBuilder.create().uv(8, 86).mirrored().cuboid(-1.6668F, 1.3284F, -1.1744F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 78).mirrored().cuboid(-1.1068F, 1.3284F, -1.1744F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, -2.5307F));

		ModelPartData cube_r85 = small_coconut2.addChild("cube_r85", ModelPartBuilder.create().uv(8, 84).mirrored().cuboid(-1.368F, 0.9236F, -1.386F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(20, 78).mirrored().cuboid(-0.808F, 0.9236F, -1.386F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, -1.8762F));

		ModelPartData cube_r86 = small_coconut2.addChild("cube_r86", ModelPartBuilder.create().uv(28, 78).mirrored().cuboid(-0.8882F, 0.7624F, -1.4699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(16, 78).mirrored().cuboid(-0.3282F, 0.7624F, -1.4699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, -1.2654F));

		ModelPartData cube_r87 = small_coconut2.addChild("cube_r87", ModelPartBuilder.create().uv(8, 82).mirrored().cuboid(-0.0423F, 1.242F, -1.2181F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 88).mirrored().cuboid(0.5177F, 1.242F, -1.2181F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, 0.0F));

		ModelPartData cube_r88 = small_coconut2.addChild("cube_r88", ModelPartBuilder.create().uv(68, 70).mirrored().cuboid(-0.391F, 0.8716F, -1.4123F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(12, 82).mirrored().cuboid(0.169F, 0.8716F, -1.4123F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, -3.1416F, -0.6545F));

		ModelPartData cube_r89 = small_coconut2.addChild("cube_r89", ModelPartBuilder.create().uv(8, 78).mirrored().cuboid(-0.0423F, 1.5456F, -1.1428F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 76).mirrored().cuboid(0.5177F, 1.5456F, -1.1428F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, 0.0F));

		ModelPartData cube_r90 = small_coconut2.addChild("cube_r90", ModelPartBuilder.create().uv(0, 84).mirrored().cuboid(-0.391F, 1.3071F, -1.4873F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(40, 78).mirrored().cuboid(0.169F, 1.3071F, -1.4873F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, -0.6545F));

		ModelPartData cube_r91 = small_coconut2.addChild("cube_r91", ModelPartBuilder.create().uv(0, 82).mirrored().cuboid(-0.8882F, 1.237F, -1.5896F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(44, 78).mirrored().cuboid(-0.3282F, 1.237F, -1.5896F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, -1.2654F));

		ModelPartData cube_r92 = small_coconut2.addChild("cube_r92", ModelPartBuilder.create().uv(4, 78).mirrored().cuboid(-1.368F, 1.3412F, -1.4407F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(48, 78).mirrored().cuboid(-0.808F, 1.3412F, -1.4407F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, -1.8762F));

		ModelPartData cube_r93 = small_coconut2.addChild("cube_r93", ModelPartBuilder.create().uv(0, 78).mirrored().cuboid(-1.6668F, 1.6024F, -1.0654F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(52, 78).mirrored().cuboid(-1.1068F, 1.6024F, -1.0654F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, -2.5307F));

		ModelPartData cube_r94 = small_coconut2.addChild("cube_r94", ModelPartBuilder.create().uv(56, 80).mirrored().cuboid(-1.3202F, 2.1194F, -0.3199F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 78).mirrored().cuboid(-0.7602F, 2.1194F, -0.3199F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, 2.5307F));

		ModelPartData cube_r95 = small_coconut2.addChild("cube_r95", ModelPartBuilder.create().uv(36, 78).mirrored().cuboid(-1.6377F, 1.8922F, -0.6479F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(56, 78).mirrored().cuboid(-1.0777F, 1.8922F, -0.6479F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, 3.1416F));

		ModelPartData cube_r96 = small_coconut2.addChild("cube_r96", ModelPartBuilder.create().uv(60, 80).mirrored().cuboid(-0.829F, 2.2017F, -0.2F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(20, 76).mirrored().cuboid(-0.269F, 2.2017F, -0.2F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, 1.9199F));

		ModelPartData cube_r97 = small_coconut2.addChild("cube_r97", ModelPartBuilder.create().uv(68, 78).mirrored().cuboid(-0.3417F, 2.1094F, -0.3317F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(24, 76).mirrored().cuboid(0.2183F, 2.1094F, -0.3317F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, 1.309F));

		ModelPartData cube_r98 = small_coconut2.addChild("cube_r98", ModelPartBuilder.create().uv(64, 78).mirrored().cuboid(-0.0232F, 1.8558F, -0.6961F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(28, 76).mirrored().cuboid(0.5368F, 1.8558F, -0.6961F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, -3.1416F, 0.6545F));

		ModelPartData cube_r99 = small_coconut2.addChild("cube_r99", ModelPartBuilder.create().uv(16, 76).mirrored().cuboid(-0.8882F, 1.5896F, -1.5299F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(68, 76).mirrored().cuboid(-0.3282F, 1.5896F, -1.5299F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, -1.2654F));

		ModelPartData cube_r100 = small_coconut2.addChild("cube_r100", ModelPartBuilder.create().uv(12, 76).mirrored().cuboid(-0.0423F, 1.7265F, -1.0031F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(52, 84).mirrored().cuboid(0.5177F, 1.7265F, -1.0031F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, 0.0F));

		ModelPartData cube_r101 = small_coconut2.addChild("cube_r101", ModelPartBuilder.create().uv(8, 76).mirrored().cuboid(-0.391F, 1.6204F, -1.4093F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(52, 86).mirrored().cuboid(0.169F, 1.6204F, -1.4093F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, -0.6545F));

		ModelPartData cube_r102 = small_coconut2.addChild("cube_r102", ModelPartBuilder.create().uv(4, 76).mirrored().cuboid(-1.368F, 1.6366F, -1.3544F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(52, 88).mirrored().cuboid(-0.808F, 1.6366F, -1.3544F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, -1.8762F));

		ModelPartData cube_r103 = small_coconut2.addChild("cube_r103", ModelPartBuilder.create().uv(52, 80).mirrored().cuboid(-1.6668F, 1.7535F, -0.9118F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 82).mirrored().cuboid(-1.1068F, 1.7535F, -0.9118F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, -2.5307F));

		ModelPartData cube_r104 = small_coconut2.addChild("cube_r104", ModelPartBuilder.create().uv(48, 80).mirrored().cuboid(-1.6377F, 1.8829F, -0.4195F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 84).mirrored().cuboid(-1.0777F, 1.8829F, -0.4195F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, 3.1416F));

		ModelPartData cube_r105 = small_coconut2.addChild("cube_r105", ModelPartBuilder.create().uv(0, 76).mirrored().cuboid(-1.3202F, 1.984F, -0.0327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 86).mirrored().cuboid(-0.7602F, 1.984F, -0.0327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, 2.5307F));

		ModelPartData cube_r106 = small_coconut2.addChild("cube_r106", ModelPartBuilder.create().uv(64, 80).mirrored().cuboid(-0.829F, 2.0203F, 0.1086F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(40, 88).mirrored().cuboid(-0.269F, 2.0203F, 0.1086F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, 1.9199F));

		ModelPartData cube_r107 = small_coconut2.addChild("cube_r107", ModelPartBuilder.create().uv(36, 76).mirrored().cuboid(-0.3417F, 1.9786F, -0.0466F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(52, 82).mirrored().cuboid(0.2183F, 1.9786F, -0.0466F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, 1.309F));

		ModelPartData cube_r108 = small_coconut2.addChild("cube_r108", ModelPartBuilder.create().uv(68, 80).mirrored().cuboid(-0.0232F, 1.865F, -0.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 76).mirrored().cuboid(0.5368F, 1.865F, -0.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, -3.1416F, 0.6545F));

		ModelPartData cube_r109 = small_coconut2.addChild("cube_r109", ModelPartBuilder.create().uv(60, 76).mirrored().cuboid(-1.629F, 0.5971F, -0.7005F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(16, 82).mirrored().cuboid(-1.069F, 0.5971F, -0.7005F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r110 = small_coconut2.addChild("cube_r110", ModelPartBuilder.create().uv(40, 86).mirrored().cuboid(-1.282F, 0.4909F, -1.1067F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(40, 76).mirrored().cuboid(-0.722F, 0.4909F, -1.1067F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r111 = small_coconut2.addChild("cube_r111", ModelPartBuilder.create().uv(40, 84).mirrored().cuboid(-0.7891F, 0.4601F, -1.2273F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(16, 84).mirrored().cuboid(-0.2291F, 0.4601F, -1.2273F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -1.2654F));

		ModelPartData cube_r112 = small_coconut2.addChild("cube_r112", ModelPartBuilder.create().uv(56, 76).mirrored().cuboid(-0.3146F, 0.5071F, -1.0518F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(16, 86).mirrored().cuboid(0.2454F, 0.5071F, -1.0518F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -1.8762F));

		ModelPartData cube_r113 = small_coconut2.addChild("cube_r113", ModelPartBuilder.create().uv(40, 82).mirrored().cuboid(-0.0204F, 0.6241F, -0.6092F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(44, 76).mirrored().cuboid(0.5396F, 0.6241F, -0.6092F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r114 = small_coconut2.addChild("cube_r114", ModelPartBuilder.create().uv(28, 88).mirrored().cuboid(-0.051F, 0.7535F, -0.1169F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(16, 88).mirrored().cuboid(0.509F, 0.7535F, -0.1169F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 3.1416F));

		ModelPartData cube_r115 = small_coconut2.addChild("cube_r115", ModelPartBuilder.create().uv(52, 76).mirrored().cuboid(-0.367F, 0.8546F, 0.2699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(28, 82).mirrored().cuboid(0.193F, 0.8546F, 0.2699F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r116 = small_coconut2.addChild("cube_r116", ModelPartBuilder.create().uv(28, 86).mirrored().cuboid(-0.854F, 0.8908F, 0.4112F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(4, 86).mirrored().cuboid(-0.294F, 0.8908F, 0.4112F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 1.9199F));

		ModelPartData cube_r117 = small_coconut2.addChild("cube_r117", ModelPartBuilder.create().uv(28, 84).mirrored().cuboid(-1.336F, 0.8491F, 0.256F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(4, 88).mirrored().cuboid(-0.776F, 0.8491F, 0.256F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 1.309F));

		ModelPartData cube_r118 = small_coconut2.addChild("cube_r118", ModelPartBuilder.create().uv(48, 76).mirrored().cuboid(-1.6498F, 0.7356F, -0.1737F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 88).mirrored().cuboid(-1.0898F, 0.7356F, -0.1737F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r119 = small_coconut2.addChild("cube_r119", ModelPartBuilder.create().uv(32, 74).mirrored().cuboid(-1.629F, 0.5878F, -0.4721F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 74).mirrored().cuboid(-1.069F, 0.5878F, -0.4721F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r120 = small_coconut2.addChild("cube_r120", ModelPartBuilder.create().uv(4, 84).mirrored().cuboid(-1.282F, 0.3493F, -0.8166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 86).mirrored().cuboid(-0.722F, 0.3493F, -0.8166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r121 = small_coconut2.addChild("cube_r121", ModelPartBuilder.create().uv(4, 82).mirrored().cuboid(-0.7891F, 0.2792F, -0.9189F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 74).mirrored().cuboid(-0.2291F, 0.2792F, -0.9189F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -1.2654F));

		ModelPartData cube_r122 = small_coconut2.addChild("cube_r122", ModelPartBuilder.create().uv(28, 74).mirrored().cuboid(-0.3146F, 0.3834F, -0.77F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(4, 74).mirrored().cuboid(0.2454F, 0.3834F, -0.77F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -1.8762F));

		ModelPartData cube_r123 = small_coconut2.addChild("cube_r123", ModelPartBuilder.create().uv(24, 74).mirrored().cuboid(-0.0204F, 0.6445F, -0.3947F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 80).mirrored().cuboid(0.5396F, 0.6445F, -0.3947F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r124 = small_coconut2.addChild("cube_r124", ModelPartBuilder.create().uv(20, 74).mirrored().cuboid(-0.051F, 0.9344F, 0.0228F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(36, 80).mirrored().cuboid(0.509F, 0.9344F, 0.0228F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 3.1416F));

		ModelPartData cube_r125 = small_coconut2.addChild("cube_r125", ModelPartBuilder.create().uv(16, 74).mirrored().cuboid(-0.367F, 1.1615F, 0.3508F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(8, 74).mirrored().cuboid(0.193F, 1.1615F, 0.3508F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r126 = small_coconut2.addChild("cube_r126", ModelPartBuilder.create().uv(12, 74).mirrored().cuboid(-0.854F, 1.2438F, 0.4707F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 74).mirrored().cuboid(-0.294F, 1.2438F, 0.4707F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 1.9199F));

		ModelPartData cube_r127 = small_coconut2.addChild("cube_r127", ModelPartBuilder.create().uv(44, 80).mirrored().cuboid(-1.336F, 1.1515F, 0.339F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 74).mirrored().cuboid(-0.776F, 1.1515F, 0.339F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 1.309F));

		ModelPartData cube_r128 = small_coconut2.addChild("cube_r128", ModelPartBuilder.create().uv(40, 80).mirrored().cuboid(-1.6498F, 0.8979F, -0.0254F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(68, 74).mirrored().cuboid(-1.0898F, 0.8979F, -0.0254F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r129 = small_coconut2.addChild("cube_r129", ModelPartBuilder.create().uv(56, 74).mirrored().cuboid(-1.629F, 0.7021F, -0.1809F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(68, 72).mirrored().cuboid(-1.069F, 0.7021F, -0.1809F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r130 = small_coconut2.addChild("cube_r130", ModelPartBuilder.create().uv(52, 74).mirrored().cuboid(-1.282F, 0.3317F, -0.3751F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(48, 88).mirrored().cuboid(-0.722F, 0.3317F, -0.3751F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -0.6545F));

		ModelPartData cube_r131 = small_coconut2.addChild("cube_r131", ModelPartBuilder.create().uv(48, 74).mirrored().cuboid(-0.7891F, 0.2225F, -0.4327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 82).mirrored().cuboid(-0.2291F, 0.2225F, -0.4327F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -1.2654F));

		ModelPartData cube_r132 = small_coconut2.addChild("cube_r132", ModelPartBuilder.create().uv(44, 74).mirrored().cuboid(-0.3146F, 0.3837F, -0.3488F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(60, 84).mirrored().cuboid(0.2454F, 0.3837F, -0.3488F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -1.8762F));

		ModelPartData cube_r133 = small_coconut2.addChild("cube_r133", ModelPartBuilder.create().uv(40, 74).mirrored().cuboid(-0.0204F, 0.7884F, -0.1373F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 72).mirrored().cuboid(0.5396F, 0.7884F, -0.1373F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r134 = small_coconut2.addChild("cube_r134", ModelPartBuilder.create().uv(28, 72).mirrored().cuboid(-0.051F, 1.238F, 0.0981F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(4, 72).mirrored().cuboid(0.509F, 1.238F, 0.0981F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 3.1416F));

		ModelPartData cube_r135 = small_coconut2.addChild("cube_r135", ModelPartBuilder.create().uv(24, 72).mirrored().cuboid(-0.367F, 1.5907F, 0.283F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(8, 72).mirrored().cuboid(0.193F, 1.5907F, 0.283F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r136 = small_coconut2.addChild("cube_r136", ModelPartBuilder.create().uv(20, 72).mirrored().cuboid(-0.854F, 1.7188F, 0.3505F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(64, 72).mirrored().cuboid(-0.294F, 1.7188F, 0.3505F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 1.9199F));

		ModelPartData cube_r137 = small_coconut2.addChild("cube_r137", ModelPartBuilder.create().uv(16, 72).mirrored().cuboid(-1.336F, 1.5762F, 0.2763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(48, 84).mirrored().cuboid(-0.776F, 1.5762F, 0.2763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 1.309F));

		ModelPartData cube_r138 = small_coconut2.addChild("cube_r138", ModelPartBuilder.create().uv(12, 72).mirrored().cuboid(-1.6498F, 1.1832F, 0.0709F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(48, 86).mirrored().cuboid(-1.0898F, 1.1832F, 0.0709F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.5539F, -13.3F, -9.35F, -0.48F, 0.0F, 0.6545F));

		ModelPartData middle_coconut = body.addChild("middle_coconut", ModelPartBuilder.create().uv(92, 10).cuboid(4.4268F, -11.7521F, -6.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 32).cuboid(3.8108F, -11.7521F, -6.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 8).cuboid(3.8108F, -11.7521F, -5.9263F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 46).cuboid(4.4268F, -11.7521F, -5.9263F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 50).cuboid(3.9983F, -13.1161F, -8.3353F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 54).cuboid(2.8983F, -14.7661F, -7.7853F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 52).cuboid(5.0983F, -14.7661F, -7.7853F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0148F, -0.3943F, -0.0306F));

		ModelPartData cube_r139 = middle_coconut.addChild("cube_r139", ModelPartBuilder.create().uv(88, 16).cuboid(-0.0597F, 0.8388F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 42).cuboid(-0.6757F, 0.8388F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 20).cuboid(-0.6757F, 0.8388F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 40).cuboid(-0.0597F, 0.8388F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r140 = middle_coconut.addChild("cube_r140", ModelPartBuilder.create().uv(92, 44).cuboid(-0.4213F, 0.9425F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 44).cuboid(-1.0373F, 0.9425F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 18).cuboid(-1.0373F, 0.9425F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 12).cuboid(-0.4213F, 0.9425F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 1.2654F));

		ModelPartData cube_r141 = middle_coconut.addChild("cube_r141", ModelPartBuilder.create().uv(92, 42).cuboid(-0.6579F, 1.2349F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 8).cuboid(-1.2739F, 1.2349F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 32).cuboid(-1.2739F, 1.2349F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 14).cuboid(-0.6579F, 1.2349F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 1.8762F));

		ModelPartData cube_r142 = middle_coconut.addChild("cube_r142", ModelPartBuilder.create().uv(84, 16).cuboid(-0.6772F, 1.6365F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 46).cuboid(-1.2932F, 1.6365F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 18).cuboid(-1.2932F, 1.6365F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 16).cuboid(-0.6772F, 1.6365F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r143 = middle_coconut.addChild("cube_r143", ModelPartBuilder.create().uv(92, 40).cuboid(-0.4695F, 1.9501F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 48).cuboid(-1.0855F, 1.9501F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 18).cuboid(-1.0855F, 1.9501F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 2).cuboid(-0.4695F, 1.9501F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -3.1416F));

		ModelPartData cube_r144 = middle_coconut.addChild("cube_r144", ModelPartBuilder.create().uv(76, 54).cuboid(-0.1195F, 2.0879F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 8).cuboid(-0.7355F, 2.0879F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 18).cuboid(-0.7355F, 2.0879F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 40).cuboid(-0.1195F, 2.0879F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -2.5307F));

		ModelPartData cube_r145 = middle_coconut.addChild("cube_r145", ModelPartBuilder.create().uv(80, 16).cuboid(0.2462F, 2.0F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 36).cuboid(-0.3698F, 2.0F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 48).cuboid(-0.3698F, 2.0F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 46).cuboid(0.2462F, 2.0F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -1.9199F));

		ModelPartData cube_r146 = middle_coconut.addChild("cube_r146", ModelPartBuilder.create().uv(76, 52).cuboid(0.4954F, 1.7183F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 38).cuboid(-0.1206F, 1.7183F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 24).cuboid(-0.1206F, 1.7183F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 2).cuboid(0.4954F, 1.7183F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r147 = middle_coconut.addChild("cube_r147", ModelPartBuilder.create().uv(76, 50).cuboid(0.5321F, 1.3179F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 40).cuboid(-0.0839F, 1.3179F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 22).cuboid(-0.0839F, 1.3179F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 4).cuboid(0.5321F, 1.3179F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r148 = middle_coconut.addChild("cube_r148", ModelPartBuilder.create().uv(76, 34).cuboid(-0.2888F, 2.3222F, -1.2117F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 26).cuboid(0.3272F, 2.3222F, -1.2117F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, -3.1416F));

		ModelPartData cube_r149 = middle_coconut.addChild("cube_r149", ModelPartBuilder.create().uv(92, 30).cuboid(-0.0246F, 2.4441F, -1.1468F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 28).cuboid(-0.6406F, 2.4441F, -1.1468F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, -2.5307F));

		ModelPartData cube_r150 = middle_coconut.addChild("cube_r150", ModelPartBuilder.create().uv(76, 32).cuboid(-0.3949F, 2.3659F, -1.1866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 52).cuboid(-1.0109F, 2.3659F, -1.1866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, -1.9199F));

		ModelPartData cube_r151 = middle_coconut.addChild("cube_r151", ModelPartBuilder.create().uv(76, 30).cuboid(-0.6499F, 2.116F, -1.3166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 24).cuboid(-1.2659F, 2.116F, -1.3166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, -1.309F));

		ModelPartData cube_r152 = middle_coconut.addChild("cube_r152", ModelPartBuilder.create().uv(72, 0).cuboid(-0.6918F, 1.761F, -1.5023F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 6).cuboid(-1.3078F, 1.761F, -1.5023F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, -0.6545F));

		ModelPartData cube_r153 = middle_coconut.addChild("cube_r153", ModelPartBuilder.create().uv(84, 54).cuboid(0.5331F, 2.0443F, -1.3578F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 24).cuboid(-0.0829F, 2.0443F, -1.3578F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, 2.5307F));

		ModelPartData cube_r154 = middle_coconut.addChild("cube_r154", ModelPartBuilder.create().uv(88, 38).cuboid(0.5088F, 1.6883F, -1.5441F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 12).cuboid(-0.1072F, 1.6883F, -1.5441F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, 1.8762F));

		ModelPartData cube_r155 = middle_coconut.addChild("cube_r155", ModelPartBuilder.create().uv(84, 38).cuboid(0.2664F, 1.429F, -1.6791F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 10).cuboid(-0.3496F, 1.429F, -1.6791F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, 1.2654F));

		ModelPartData cube_r156 = middle_coconut.addChild("cube_r156", ModelPartBuilder.create().uv(76, 16).cuboid(-0.4792F, 1.4598F, -1.6607F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 8).cuboid(-1.0952F, 1.4598F, -1.6607F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, 0.0F));

		ModelPartData cube_r157 = middle_coconut.addChild("cube_r157", ModelPartBuilder.create().uv(76, 14).cuboid(-0.0999F, 1.3367F, -1.7262F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 24).cuboid(-0.7159F, 1.3367F, -1.7262F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 3.1416F, 0.6545F));

		ModelPartData cube_r158 = middle_coconut.addChild("cube_r158", ModelPartBuilder.create().uv(84, 46).cuboid(-0.4792F, 1.9426F, -1.5446F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 24).cuboid(-1.0952F, 1.9426F, -1.5446F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, 0.0F));

		ModelPartData cube_r159 = middle_coconut.addChild("cube_r159", ModelPartBuilder.create().uv(92, 8).cuboid(-0.0999F, 1.8641F, -1.6609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 52).cuboid(-0.7159F, 1.8641F, -1.6609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, 0.6545F));

		ModelPartData cube_r160 = middle_coconut.addChild("cube_r160", ModelPartBuilder.create().uv(80, 44).cuboid(0.2664F, 1.9243F, -1.5773F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 52).cuboid(-0.3496F, 1.9243F, -1.5773F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, 1.2654F));

		ModelPartData cube_r161 = middle_coconut.addChild("cube_r161", ModelPartBuilder.create().uv(92, 22).cuboid(0.5088F, 2.092F, -1.3378F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 28).cuboid(-0.1072F, 2.092F, -1.3378F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, 1.8762F));

		ModelPartData cube_r162 = middle_coconut.addChild("cube_r162", ModelPartBuilder.create().uv(88, 46).cuboid(0.5331F, 2.3216F, -1.0073F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 6).cuboid(-0.0829F, 2.3216F, -1.0073F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, 2.5307F));

		ModelPartData cube_r163 = middle_coconut.addChild("cube_r163", ModelPartBuilder.create().uv(88, 30).cuboid(-0.0246F, 2.5781F, -0.633F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 6).cuboid(-0.6406F, 2.5781F, -0.633F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, -2.5307F));

		ModelPartData cube_r164 = middle_coconut.addChild("cube_r164", ModelPartBuilder.create().uv(84, 30).cuboid(0.3272F, 2.5003F, -0.7482F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 6).cuboid(-0.2888F, 2.5003F, -0.7482F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, -3.1416F));

		ModelPartData cube_r165 = middle_coconut.addChild("cube_r165", ModelPartBuilder.create().uv(88, 14).cuboid(-0.3949F, 2.527F, -0.7036F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 20).cuboid(-1.0109F, 2.527F, -0.7036F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, -1.9199F));

		ModelPartData cube_r166 = middle_coconut.addChild("cube_r166", ModelPartBuilder.create().uv(84, 14).cuboid(-0.6499F, 2.3653F, -0.9343F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 36).cuboid(-1.2659F, 2.3653F, -0.9343F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, -1.309F));

		ModelPartData cube_r167 = middle_coconut.addChild("cube_r167", ModelPartBuilder.create().uv(80, 14).cuboid(-0.6918F, 2.1364F, -1.2637F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 22).cuboid(-1.3078F, 2.1364F, -1.2637F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 3.1416F, -0.6545F));

		ModelPartData cube_r168 = middle_coconut.addChild("cube_r168", ModelPartBuilder.create().uv(76, 18).cuboid(0.2664F, 2.2256F, -1.3635F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 36).cuboid(-0.3496F, 2.2256F, -1.3635F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, 1.2654F));

		ModelPartData cube_r169 = middle_coconut.addChild("cube_r169", ModelPartBuilder.create().uv(84, 36).cuboid(-0.4792F, 2.2314F, -1.3249F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 44).cuboid(-1.0952F, 2.2314F, -1.3249F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, 0.0F));

		ModelPartData cube_r170 = middle_coconut.addChild("cube_r170", ModelPartBuilder.create().uv(88, 22).cuboid(-0.0999F, 2.1975F, -1.4621F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 34).cuboid(-0.7159F, 2.1975F, -1.4621F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, 0.6545F));

		ModelPartData cube_r171 = middle_coconut.addChild("cube_r171", ModelPartBuilder.create().uv(84, 22).cuboid(0.5088F, 2.3013F, -1.0811F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 20).cuboid(-0.1072F, 2.3013F, -1.0811F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, 1.8762F));

		ModelPartData cube_r172 = middle_coconut.addChild("cube_r172", ModelPartBuilder.create().uv(80, 22).cuboid(0.5331F, 2.4039F, -0.6914F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 38).cuboid(-0.0829F, 2.4039F, -0.6914F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, 2.5307F));

		ModelPartData cube_r173 = middle_coconut.addChild("cube_r173", ModelPartBuilder.create().uv(76, 4).cuboid(0.3272F, 2.483F, -0.3858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 40).cuboid(-0.2888F, 2.483F, -0.3858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, -3.1416F));

		ModelPartData cube_r174 = middle_coconut.addChild("cube_r174", ModelPartBuilder.create().uv(76, 2).cuboid(-0.0246F, 2.5166F, -0.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 42).cuboid(-0.6406F, 2.5166F, -0.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, -2.5307F));

		ModelPartData cube_r175 = middle_coconut.addChild("cube_r175", ModelPartBuilder.create().uv(80, 50).cuboid(-0.3949F, 2.4925F, -0.3332F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 28).cuboid(-1.0109F, 2.4925F, -0.3332F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, -1.9199F));

		ModelPartData cube_r176 = middle_coconut.addChild("cube_r176", ModelPartBuilder.create().uv(84, 44).cuboid(-0.6499F, 2.4195F, -0.6052F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 30).cuboid(-1.2659F, 2.4195F, -0.6052F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, -1.309F));

		ModelPartData cube_r177 = middle_coconut.addChild("cube_r177", ModelPartBuilder.create().uv(92, 6).cuboid(-0.6918F, 2.3172F, -0.9936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 32).cuboid(-1.3078F, 2.3172F, -0.9936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 3.1416F, -0.6545F));

		ModelPartData cube_r178 = middle_coconut.addChild("cube_r178", ModelPartBuilder.create().uv(80, 26).cuboid(0.3175F, 0.445F, -0.8462F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 4).cuboid(-0.2985F, 0.445F, -0.8462F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r179 = middle_coconut.addChild("cube_r179", ModelPartBuilder.create().uv(88, 28).cuboid(-0.0597F, 0.4112F, -0.9834F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 50).cuboid(-0.6757F, 0.4112F, -0.9834F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r180 = middle_coconut.addChild("cube_r180", ModelPartBuilder.create().uv(88, 54).cuboid(-0.4213F, 0.4393F, -0.8848F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 52).cuboid(-1.0373F, 0.4393F, -0.8848F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 1.2654F));

		ModelPartData cube_r181 = middle_coconut.addChild("cube_r181", ModelPartBuilder.create().uv(92, 48).cuboid(-0.6579F, 0.5149F, -0.6024F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 12).cuboid(-1.2739F, 0.5149F, -0.6024F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 1.8762F));

		ModelPartData cube_r182 = middle_coconut.addChild("cube_r182", ModelPartBuilder.create().uv(84, 28).cuboid(-0.6772F, 0.6175F, -0.2127F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 54).cuboid(-1.2932F, 0.6175F, -0.2127F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r183 = middle_coconut.addChild("cube_r183", ModelPartBuilder.create().uv(80, 54).cuboid(-0.4695F, 0.6966F, 0.0929F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 32).cuboid(-1.0855F, 0.6966F, 0.0929F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -3.1416F));

		ModelPartData cube_r184 = middle_coconut.addChild("cube_r184", ModelPartBuilder.create().uv(92, 38).cuboid(-0.1195F, 0.7302F, 0.2286F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 12).cuboid(-0.7355F, 0.7302F, 0.2286F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r185 = middle_coconut.addChild("cube_r185", ModelPartBuilder.create().uv(88, 12).cuboid(0.2462F, 0.7062F, 0.1455F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 4).cuboid(-0.3698F, 0.7062F, 0.1455F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -1.9199F));

		ModelPartData cube_r186 = middle_coconut.addChild("cube_r186", ModelPartBuilder.create().uv(92, 36).cuboid(0.4954F, 0.6332F, -0.1266F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 46).cuboid(-0.1206F, 0.6332F, -0.1266F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -1.309F));

		ModelPartData cube_r187 = middle_coconut.addChild("cube_r187", ModelPartBuilder.create().uv(92, 34).cuboid(0.5321F, 0.5308F, -0.515F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 48).cuboid(-0.0839F, 0.5308F, -0.515F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r188 = middle_coconut.addChild("cube_r188", ModelPartBuilder.create().uv(72, 44).cuboid(0.3175F, 0.4277F, -0.4838F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 16).cuboid(-0.2985F, 0.4277F, -0.4838F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r189 = middle_coconut.addChild("cube_r189", ModelPartBuilder.create().uv(72, 42).cuboid(-0.0597F, 0.3492F, -0.6002F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 34).cuboid(-0.6757F, 0.3492F, -0.6002F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r190 = middle_coconut.addChild("cube_r190", ModelPartBuilder.create().uv(80, 4).cuboid(-0.4213F, 0.4094F, -0.5166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 34).cuboid(-1.0373F, 0.4094F, -0.5166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 1.2654F));

		ModelPartData cube_r191 = middle_coconut.addChild("cube_r191", ModelPartBuilder.create().uv(72, 40).cuboid(-0.6579F, 0.5771F, -0.2771F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 50).cuboid(-1.2739F, 0.5771F, -0.2771F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 1.8762F));

		ModelPartData cube_r192 = middle_coconut.addChild("cube_r192", ModelPartBuilder.create().uv(72, 38).cuboid(-0.6772F, 0.8067F, 0.0534F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 26).cuboid(-1.2932F, 0.8067F, 0.0534F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r193 = middle_coconut.addChild("cube_r193", ModelPartBuilder.create().uv(72, 36).cuboid(-0.4695F, 0.9854F, 0.3126F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 28).cuboid(-1.0855F, 0.9854F, 0.3126F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -3.1416F));

		ModelPartData cube_r194 = middle_coconut.addChild("cube_r194", ModelPartBuilder.create().uv(72, 34).cuboid(-0.1195F, 1.0632F, 0.4277F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 50).cuboid(-0.7355F, 1.0632F, 0.4277F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r195 = middle_coconut.addChild("cube_r195", ModelPartBuilder.create().uv(92, 26).cuboid(0.2462F, 1.0121F, 0.3572F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 12).cuboid(-0.3698F, 1.0121F, 0.3572F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -1.9199F));

		ModelPartData cube_r196 = middle_coconut.addChild("cube_r196", ModelPartBuilder.create().uv(72, 32).cuboid(0.4954F, 0.8504F, 0.1265F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 20).cuboid(-0.1206F, 0.8504F, 0.1265F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -1.309F));

		ModelPartData cube_r197 = middle_coconut.addChild("cube_r197", ModelPartBuilder.create().uv(72, 30).cuboid(0.5321F, 0.6215F, -0.2029F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 14).cuboid(-0.0839F, 0.6215F, -0.2029F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r198 = middle_coconut.addChild("cube_r198", ModelPartBuilder.create().uv(72, 10).cuboid(0.3175F, 0.6058F, -0.0203F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 2).cuboid(-0.2985F, 0.6058F, -0.0203F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r199 = middle_coconut.addChild("cube_r199", ModelPartBuilder.create().uv(84, 20).cuboid(-0.0597F, 0.4828F, -0.0858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 2).cuboid(-0.6757F, 0.4828F, -0.0858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 0.6545F));

		ModelPartData cube_r200 = middle_coconut.addChild("cube_r200", ModelPartBuilder.create().uv(72, 8).cuboid(-0.4213F, 0.575F, -0.0387F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 10).cuboid(-1.0373F, 0.575F, -0.0387F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 1.2654F));

		ModelPartData cube_r201 = middle_coconut.addChild("cube_r201", ModelPartBuilder.create().uv(72, 6).cuboid(-0.6579F, 0.8343F, 0.0963F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 10).cuboid(-1.2739F, 0.8343F, 0.0963F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 1.8762F));

		ModelPartData cube_r202 = middle_coconut.addChild("cube_r202", ModelPartBuilder.create().uv(80, 20).cuboid(-0.6772F, 1.1903F, 0.2826F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 10).cuboid(-1.2932F, 1.1903F, 0.2826F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r203 = middle_coconut.addChild("cube_r203", ModelPartBuilder.create().uv(80, 48).cuboid(-0.4695F, 1.4682F, 0.4287F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 26).cuboid(-1.0855F, 1.4682F, 0.4287F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -3.1416F));

		ModelPartData cube_r204 = middle_coconut.addChild("cube_r204", ModelPartBuilder.create().uv(84, 42).cuboid(-0.1195F, 1.5901F, 0.4936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 26).cuboid(-0.7355F, 1.5901F, 0.4936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r205 = middle_coconut.addChild("cube_r205", ModelPartBuilder.create().uv(92, 4).cuboid(0.2462F, 1.512F, 0.4538F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 48).cuboid(-0.3698F, 1.512F, 0.4538F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -1.9199F));

		ModelPartData cube_r206 = middle_coconut.addChild("cube_r206", ModelPartBuilder.create().uv(92, 18).cuboid(0.4954F, 1.262F, 0.3238F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 24).cuboid(-0.1206F, 1.262F, 0.3238F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -1.309F));

		ModelPartData cube_r207 = middle_coconut.addChild("cube_r207", ModelPartBuilder.create().uv(88, 42).cuboid(0.5321F, 0.9071F, 0.1381F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 2).cuboid(-0.0839F, 0.9071F, 0.1381F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -0.6545F));

		ModelPartData middle_coconut2 = body.addChild("middle_coconut2", ModelPartBuilder.create().uv(92, 10).mirrored().cuboid(-5.4268F, -11.7521F, -6.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 32).mirrored().cuboid(-4.8108F, -11.7521F, -6.4763F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 8).mirrored().cuboid(-4.8108F, -11.7521F, -5.9263F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 46).mirrored().cuboid(-5.4268F, -11.7521F, -5.9263F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 50).mirrored().cuboid(-4.9983F, -13.1161F, -8.3353F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 54).mirrored().cuboid(-3.8983F, -14.7661F, -7.7853F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 52).mirrored().cuboid(-6.0983F, -14.7661F, -7.7853F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0148F, 0.3943F, 0.0306F));

		ModelPartData cube_r208 = middle_coconut2.addChild("cube_r208", ModelPartBuilder.create().uv(88, 16).mirrored().cuboid(-0.9403F, 0.8388F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 42).mirrored().cuboid(-0.3243F, 0.8388F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 20).mirrored().cuboid(-0.3243F, 0.8388F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 40).mirrored().cuboid(-0.9403F, 0.8388F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r209 = middle_coconut2.addChild("cube_r209", ModelPartBuilder.create().uv(92, 44).mirrored().cuboid(-0.5787F, 0.9425F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 44).mirrored().cuboid(0.0373F, 0.9425F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 18).mirrored().cuboid(0.0373F, 0.9425F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 12).mirrored().cuboid(-0.5787F, 0.9425F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -1.2654F));

		ModelPartData cube_r210 = middle_coconut2.addChild("cube_r210", ModelPartBuilder.create().uv(92, 42).mirrored().cuboid(-0.3421F, 1.2349F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 8).mirrored().cuboid(0.2739F, 1.2349F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 32).mirrored().cuboid(0.2739F, 1.2349F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 14).mirrored().cuboid(-0.3421F, 1.2349F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -1.8762F));

		ModelPartData cube_r211 = middle_coconut2.addChild("cube_r211", ModelPartBuilder.create().uv(84, 16).mirrored().cuboid(-0.3228F, 1.6365F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 46).mirrored().cuboid(0.2932F, 1.6365F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 18).mirrored().cuboid(0.2932F, 1.6365F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 16).mirrored().cuboid(-0.3228F, 1.6365F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, -2.5307F));

		ModelPartData cube_r212 = middle_coconut2.addChild("cube_r212", ModelPartBuilder.create().uv(92, 40).mirrored().cuboid(-0.5305F, 1.9501F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 48).mirrored().cuboid(0.0855F, 1.9501F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 18).mirrored().cuboid(0.0855F, 1.9501F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 2).mirrored().cuboid(-0.5305F, 1.9501F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 3.1416F));

		ModelPartData cube_r213 = middle_coconut2.addChild("cube_r213", ModelPartBuilder.create().uv(76, 54).mirrored().cuboid(-0.8805F, 2.0879F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 8).mirrored().cuboid(-0.2645F, 2.0879F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 18).mirrored().cuboid(-0.2645F, 2.0879F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 40).mirrored().cuboid(-0.8805F, 2.0879F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r214 = middle_coconut2.addChild("cube_r214", ModelPartBuilder.create().uv(80, 16).mirrored().cuboid(-1.2462F, 2.0F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 36).mirrored().cuboid(-0.6302F, 2.0F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 48).mirrored().cuboid(-0.6302F, 2.0F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 46).mirrored().cuboid(-1.2462F, 2.0F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 1.9199F));

		ModelPartData cube_r215 = middle_coconut2.addChild("cube_r215", ModelPartBuilder.create().uv(76, 52).mirrored().cuboid(-1.4954F, 1.7183F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 38).mirrored().cuboid(-0.8794F, 1.7183F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 24).mirrored().cuboid(-0.8794F, 1.7183F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 2).mirrored().cuboid(-1.4954F, 1.7183F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 1.309F));

		ModelPartData cube_r216 = middle_coconut2.addChild("cube_r216", ModelPartBuilder.create().uv(76, 50).mirrored().cuboid(-1.5321F, 1.3179F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 40).mirrored().cuboid(-0.9161F, 1.3179F, 0.3087F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 22).mirrored().cuboid(-0.9161F, 1.3179F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 4).mirrored().cuboid(-1.5321F, 1.3179F, -0.2413F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.235F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r217 = middle_coconut2.addChild("cube_r217", ModelPartBuilder.create().uv(76, 34).mirrored().cuboid(-0.7112F, 2.3222F, -1.2117F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 26).mirrored().cuboid(-1.3272F, 2.3222F, -1.2117F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, 3.1416F));

		ModelPartData cube_r218 = middle_coconut2.addChild("cube_r218", ModelPartBuilder.create().uv(92, 30).mirrored().cuboid(-0.9754F, 2.4441F, -1.1468F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 28).mirrored().cuboid(-0.3594F, 2.4441F, -1.1468F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, 2.5307F));

		ModelPartData cube_r219 = middle_coconut2.addChild("cube_r219", ModelPartBuilder.create().uv(76, 32).mirrored().cuboid(-0.6051F, 2.3659F, -1.1866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 52).mirrored().cuboid(0.0109F, 2.3659F, -1.1866F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, 1.9199F));

		ModelPartData cube_r220 = middle_coconut2.addChild("cube_r220", ModelPartBuilder.create().uv(76, 30).mirrored().cuboid(-0.3501F, 2.116F, -1.3166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 24).mirrored().cuboid(0.2659F, 2.116F, -1.3166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, 1.309F));

		ModelPartData cube_r221 = middle_coconut2.addChild("cube_r221", ModelPartBuilder.create().uv(72, 0).mirrored().cuboid(-0.3082F, 1.761F, -1.5023F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 6).mirrored().cuboid(0.3078F, 1.761F, -1.5023F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, 0.6545F));

		ModelPartData cube_r222 = middle_coconut2.addChild("cube_r222", ModelPartBuilder.create().uv(84, 54).mirrored().cuboid(-1.5331F, 2.0443F, -1.3578F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 24).mirrored().cuboid(-0.9171F, 2.0443F, -1.3578F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, -2.5307F));

		ModelPartData cube_r223 = middle_coconut2.addChild("cube_r223", ModelPartBuilder.create().uv(88, 38).mirrored().cuboid(-1.5088F, 1.6883F, -1.5441F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 12).mirrored().cuboid(-0.8928F, 1.6883F, -1.5441F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, -1.8762F));

		ModelPartData cube_r224 = middle_coconut2.addChild("cube_r224", ModelPartBuilder.create().uv(84, 38).mirrored().cuboid(-1.2664F, 1.429F, -1.6791F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 10).mirrored().cuboid(-0.6504F, 1.429F, -1.6791F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, -1.2654F));

		ModelPartData cube_r225 = middle_coconut2.addChild("cube_r225", ModelPartBuilder.create().uv(76, 16).mirrored().cuboid(-0.5208F, 1.4598F, -1.6607F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 8).mirrored().cuboid(0.0952F, 1.4598F, -1.6607F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, 0.0F));

		ModelPartData cube_r226 = middle_coconut2.addChild("cube_r226", ModelPartBuilder.create().uv(76, 14).mirrored().cuboid(-0.9001F, 1.3367F, -1.7262F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 24).mirrored().cuboid(-0.2841F, 1.3367F, -1.7262F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, -3.1416F, -0.6545F));

		ModelPartData cube_r227 = middle_coconut2.addChild("cube_r227", ModelPartBuilder.create().uv(84, 46).mirrored().cuboid(-0.5208F, 1.9426F, -1.5446F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 24).mirrored().cuboid(0.0952F, 1.9426F, -1.5446F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, 0.0F));

		ModelPartData cube_r228 = middle_coconut2.addChild("cube_r228", ModelPartBuilder.create().uv(92, 8).mirrored().cuboid(-0.9001F, 1.8641F, -1.6609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 52).mirrored().cuboid(-0.2841F, 1.8641F, -1.6609F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, -0.6545F));

		ModelPartData cube_r229 = middle_coconut2.addChild("cube_r229", ModelPartBuilder.create().uv(80, 44).mirrored().cuboid(-1.2664F, 1.9243F, -1.5773F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 52).mirrored().cuboid(-0.6504F, 1.9243F, -1.5773F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, -1.2654F));

		ModelPartData cube_r230 = middle_coconut2.addChild("cube_r230", ModelPartBuilder.create().uv(92, 22).mirrored().cuboid(-1.5088F, 2.092F, -1.3378F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 28).mirrored().cuboid(-0.8928F, 2.092F, -1.3378F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, -1.8762F));

		ModelPartData cube_r231 = middle_coconut2.addChild("cube_r231", ModelPartBuilder.create().uv(88, 46).mirrored().cuboid(-1.5331F, 2.3216F, -1.0073F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 6).mirrored().cuboid(-0.9171F, 2.3216F, -1.0073F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, -2.5307F));

		ModelPartData cube_r232 = middle_coconut2.addChild("cube_r232", ModelPartBuilder.create().uv(88, 30).mirrored().cuboid(-0.9754F, 2.5781F, -0.633F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 6).mirrored().cuboid(-0.3594F, 2.5781F, -0.633F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, 2.5307F));

		ModelPartData cube_r233 = middle_coconut2.addChild("cube_r233", ModelPartBuilder.create().uv(84, 30).mirrored().cuboid(-1.3272F, 2.5003F, -0.7482F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 6).mirrored().cuboid(-0.7112F, 2.5003F, -0.7482F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, 3.1416F));

		ModelPartData cube_r234 = middle_coconut2.addChild("cube_r234", ModelPartBuilder.create().uv(88, 14).mirrored().cuboid(-0.6051F, 2.527F, -0.7036F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 20).mirrored().cuboid(0.0109F, 2.527F, -0.7036F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, 1.9199F));

		ModelPartData cube_r235 = middle_coconut2.addChild("cube_r235", ModelPartBuilder.create().uv(84, 14).mirrored().cuboid(-0.3501F, 2.3653F, -0.9343F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 36).mirrored().cuboid(0.2659F, 2.3653F, -0.9343F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, 1.309F));

		ModelPartData cube_r236 = middle_coconut2.addChild("cube_r236", ModelPartBuilder.create().uv(80, 14).mirrored().cuboid(-0.3082F, 2.1364F, -1.2637F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(76, 22).mirrored().cuboid(0.3078F, 2.1364F, -1.2637F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, -3.1416F, 0.6545F));

		ModelPartData cube_r237 = middle_coconut2.addChild("cube_r237", ModelPartBuilder.create().uv(76, 18).mirrored().cuboid(-1.2664F, 2.2256F, -1.3635F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 36).mirrored().cuboid(-0.6504F, 2.2256F, -1.3635F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, -1.2654F));

		ModelPartData cube_r238 = middle_coconut2.addChild("cube_r238", ModelPartBuilder.create().uv(84, 36).mirrored().cuboid(-0.5208F, 2.2314F, -1.3249F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 44).mirrored().cuboid(0.0952F, 2.2314F, -1.3249F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, 0.0F));

		ModelPartData cube_r239 = middle_coconut2.addChild("cube_r239", ModelPartBuilder.create().uv(88, 22).mirrored().cuboid(-0.9001F, 2.1975F, -1.4621F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 34).mirrored().cuboid(-0.2841F, 2.1975F, -1.4621F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, -0.6545F));

		ModelPartData cube_r240 = middle_coconut2.addChild("cube_r240", ModelPartBuilder.create().uv(84, 22).mirrored().cuboid(-1.5088F, 2.3013F, -1.0811F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 20).mirrored().cuboid(-0.8928F, 2.3013F, -1.0811F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, -1.8762F));

		ModelPartData cube_r241 = middle_coconut2.addChild("cube_r241", ModelPartBuilder.create().uv(80, 22).mirrored().cuboid(-1.5331F, 2.4039F, -0.6914F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 38).mirrored().cuboid(-0.9171F, 2.4039F, -0.6914F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, -2.5307F));

		ModelPartData cube_r242 = middle_coconut2.addChild("cube_r242", ModelPartBuilder.create().uv(76, 4).mirrored().cuboid(-1.3272F, 2.483F, -0.3858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 40).mirrored().cuboid(-0.7112F, 2.483F, -0.3858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, 3.1416F));

		ModelPartData cube_r243 = middle_coconut2.addChild("cube_r243", ModelPartBuilder.create().uv(76, 2).mirrored().cuboid(-0.9754F, 2.5166F, -0.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 42).mirrored().cuboid(-0.3594F, 2.5166F, -0.25F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, 2.5307F));

		ModelPartData cube_r244 = middle_coconut2.addChild("cube_r244", ModelPartBuilder.create().uv(80, 50).mirrored().cuboid(-0.6051F, 2.4925F, -0.3332F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 28).mirrored().cuboid(0.0109F, 2.4925F, -0.3332F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, 1.9199F));

		ModelPartData cube_r245 = middle_coconut2.addChild("cube_r245", ModelPartBuilder.create().uv(84, 44).mirrored().cuboid(-0.3501F, 2.4195F, -0.6052F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 30).mirrored().cuboid(0.2659F, 2.4195F, -0.6052F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, 1.309F));

		ModelPartData cube_r246 = middle_coconut2.addChild("cube_r246", ModelPartBuilder.create().uv(92, 6).mirrored().cuboid(-0.3082F, 2.3172F, -0.9936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 32).mirrored().cuboid(0.3078F, 2.3172F, -0.9936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, -3.1416F, 0.6545F));

		ModelPartData cube_r247 = middle_coconut2.addChild("cube_r247", ModelPartBuilder.create().uv(80, 26).mirrored().cuboid(-1.3175F, 0.445F, -0.8462F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 4).mirrored().cuboid(-0.7015F, 0.445F, -0.8462F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r248 = middle_coconut2.addChild("cube_r248", ModelPartBuilder.create().uv(88, 28).mirrored().cuboid(-0.9403F, 0.4112F, -0.9834F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 50).mirrored().cuboid(-0.3243F, 0.4112F, -0.9834F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r249 = middle_coconut2.addChild("cube_r249", ModelPartBuilder.create().uv(88, 54).mirrored().cuboid(-0.5787F, 0.4393F, -0.8848F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 52).mirrored().cuboid(0.0373F, 0.4393F, -0.8848F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -1.2654F));

		ModelPartData cube_r250 = middle_coconut2.addChild("cube_r250", ModelPartBuilder.create().uv(92, 48).mirrored().cuboid(-0.3421F, 0.5149F, -0.6024F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 12).mirrored().cuboid(0.2739F, 0.5149F, -0.6024F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -1.8762F));

		ModelPartData cube_r251 = middle_coconut2.addChild("cube_r251", ModelPartBuilder.create().uv(84, 28).mirrored().cuboid(-0.3228F, 0.6175F, -0.2127F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 54).mirrored().cuboid(0.2932F, 0.6175F, -0.2127F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r252 = middle_coconut2.addChild("cube_r252", ModelPartBuilder.create().uv(80, 54).mirrored().cuboid(-0.5305F, 0.6966F, 0.0929F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 32).mirrored().cuboid(0.0855F, 0.6966F, 0.0929F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 3.1416F));

		ModelPartData cube_r253 = middle_coconut2.addChild("cube_r253", ModelPartBuilder.create().uv(92, 38).mirrored().cuboid(-0.8805F, 0.7302F, 0.2286F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 12).mirrored().cuboid(-0.2645F, 0.7302F, 0.2286F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r254 = middle_coconut2.addChild("cube_r254", ModelPartBuilder.create().uv(88, 12).mirrored().cuboid(-1.2462F, 0.7062F, 0.1455F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 4).mirrored().cuboid(-0.6302F, 0.7062F, 0.1455F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 1.9199F));

		ModelPartData cube_r255 = middle_coconut2.addChild("cube_r255", ModelPartBuilder.create().uv(92, 36).mirrored().cuboid(-1.4954F, 0.6332F, -0.1266F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 46).mirrored().cuboid(-0.8794F, 0.6332F, -0.1266F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 1.309F));

		ModelPartData cube_r256 = middle_coconut2.addChild("cube_r256", ModelPartBuilder.create().uv(92, 34).mirrored().cuboid(-1.5321F, 0.5308F, -0.515F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 48).mirrored().cuboid(-0.9161F, 0.5308F, -0.515F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r257 = middle_coconut2.addChild("cube_r257", ModelPartBuilder.create().uv(72, 44).mirrored().cuboid(-1.3175F, 0.4277F, -0.4838F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 16).mirrored().cuboid(-0.7015F, 0.4277F, -0.4838F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r258 = middle_coconut2.addChild("cube_r258", ModelPartBuilder.create().uv(72, 42).mirrored().cuboid(-0.9403F, 0.3492F, -0.6002F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 34).mirrored().cuboid(-0.3243F, 0.3492F, -0.6002F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r259 = middle_coconut2.addChild("cube_r259", ModelPartBuilder.create().uv(80, 4).mirrored().cuboid(-0.5787F, 0.4094F, -0.5166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 34).mirrored().cuboid(0.0373F, 0.4094F, -0.5166F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -1.2654F));

		ModelPartData cube_r260 = middle_coconut2.addChild("cube_r260", ModelPartBuilder.create().uv(72, 40).mirrored().cuboid(-0.3421F, 0.5771F, -0.2771F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 50).mirrored().cuboid(0.2739F, 0.5771F, -0.2771F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -1.8762F));

		ModelPartData cube_r261 = middle_coconut2.addChild("cube_r261", ModelPartBuilder.create().uv(72, 38).mirrored().cuboid(-0.3228F, 0.8067F, 0.0534F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 26).mirrored().cuboid(0.2932F, 0.8067F, 0.0534F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r262 = middle_coconut2.addChild("cube_r262", ModelPartBuilder.create().uv(72, 36).mirrored().cuboid(-0.5305F, 0.9854F, 0.3126F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 28).mirrored().cuboid(0.0855F, 0.9854F, 0.3126F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 3.1416F));

		ModelPartData cube_r263 = middle_coconut2.addChild("cube_r263", ModelPartBuilder.create().uv(72, 34).mirrored().cuboid(-0.8805F, 1.0632F, 0.4277F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 50).mirrored().cuboid(-0.2645F, 1.0632F, 0.4277F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r264 = middle_coconut2.addChild("cube_r264", ModelPartBuilder.create().uv(92, 26).mirrored().cuboid(-1.2462F, 1.0121F, 0.3572F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 12).mirrored().cuboid(-0.6302F, 1.0121F, 0.3572F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 1.9199F));

		ModelPartData cube_r265 = middle_coconut2.addChild("cube_r265", ModelPartBuilder.create().uv(72, 32).mirrored().cuboid(-1.4954F, 0.8504F, 0.1265F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 20).mirrored().cuboid(-0.8794F, 0.8504F, 0.1265F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 1.309F));

		ModelPartData cube_r266 = middle_coconut2.addChild("cube_r266", ModelPartBuilder.create().uv(72, 30).mirrored().cuboid(-1.5321F, 0.6215F, -0.2029F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(72, 14).mirrored().cuboid(-0.9161F, 0.6215F, -0.2029F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r267 = middle_coconut2.addChild("cube_r267", ModelPartBuilder.create().uv(72, 10).mirrored().cuboid(-1.3175F, 0.6058F, -0.0203F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 2).mirrored().cuboid(-0.7015F, 0.6058F, -0.0203F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r268 = middle_coconut2.addChild("cube_r268", ModelPartBuilder.create().uv(84, 20).mirrored().cuboid(-0.9403F, 0.4828F, -0.0858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 2).mirrored().cuboid(-0.3243F, 0.4828F, -0.0858F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -0.6545F));

		ModelPartData cube_r269 = middle_coconut2.addChild("cube_r269", ModelPartBuilder.create().uv(72, 8).mirrored().cuboid(-0.5787F, 0.575F, -0.0387F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 10).mirrored().cuboid(0.0373F, 0.575F, -0.0387F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -1.2654F));

		ModelPartData cube_r270 = middle_coconut2.addChild("cube_r270", ModelPartBuilder.create().uv(72, 6).mirrored().cuboid(-0.3421F, 0.8343F, 0.0963F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 10).mirrored().cuboid(0.2739F, 0.8343F, 0.0963F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -1.8762F));

		ModelPartData cube_r271 = middle_coconut2.addChild("cube_r271", ModelPartBuilder.create().uv(80, 20).mirrored().cuboid(-0.3228F, 1.1903F, 0.2826F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 10).mirrored().cuboid(0.2932F, 1.1903F, 0.2826F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r272 = middle_coconut2.addChild("cube_r272", ModelPartBuilder.create().uv(80, 48).mirrored().cuboid(-0.5305F, 1.4682F, 0.4287F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(84, 26).mirrored().cuboid(0.0855F, 1.4682F, 0.4287F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 3.1416F));

		ModelPartData cube_r273 = middle_coconut2.addChild("cube_r273", ModelPartBuilder.create().uv(84, 42).mirrored().cuboid(-0.8805F, 1.5901F, 0.4936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 26).mirrored().cuboid(-0.2645F, 1.5901F, 0.4936F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r274 = middle_coconut2.addChild("cube_r274", ModelPartBuilder.create().uv(92, 4).mirrored().cuboid(-1.2462F, 1.512F, 0.4538F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(88, 48).mirrored().cuboid(-0.6302F, 1.512F, 0.4538F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 1.9199F));

		ModelPartData cube_r275 = middle_coconut2.addChild("cube_r275", ModelPartBuilder.create().uv(92, 18).mirrored().cuboid(-1.4954F, 1.262F, 0.3238F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(92, 24).mirrored().cuboid(-0.8794F, 1.262F, 0.3238F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 1.309F));

		ModelPartData cube_r276 = middle_coconut2.addChild("cube_r276", ModelPartBuilder.create().uv(88, 42).mirrored().cuboid(-1.5321F, 0.9071F, 0.1381F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 2).mirrored().cuboid(-0.9161F, 0.9071F, 0.1381F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.1093F, -12.73F, -6.51F, -0.48F, 0.0F, 0.6545F));

		ModelPartData center_coconut = body.addChild("center_coconut", ModelPartBuilder.create().uv(0, 4).cuboid(-0.6768F, -11.3356F, -5.4141F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-1.5224F, -11.3356F, -5.4141F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 64).cuboid(-1.5224F, -11.3356F, -4.6591F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 60).cuboid(-0.6768F, -11.3356F, -4.6591F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 68).cuboid(0.7F, -14.28F, -7.71F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 68).cuboid(-1.5F, -14.28F, -7.71F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 70).cuboid(-0.4F, -12.63F, -8.26F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r277 = center_coconut.addChild("cube_r277", ModelPartBuilder.create().uv(24, 56).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 64).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(-1.5825F, 1.3864F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-0.7369F, 1.3864F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, 0.6545F));

		ModelPartData cube_r278 = center_coconut.addChild("cube_r278", ModelPartBuilder.create().uv(16, 56).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 52).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 8).cuboid(-1.5792F, 1.3887F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-0.7336F, 1.3887F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, 1.2654F));

		ModelPartData cube_r279 = center_coconut.addChild("cube_r279", ModelPartBuilder.create().uv(8, 68).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 52).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 20).cuboid(-1.5752F, 1.3887F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.7296F, 1.3887F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, 1.8762F));

		ModelPartData cube_r280 = center_coconut.addChild("cube_r280", ModelPartBuilder.create().uv(64, 0).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 4).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(-1.5718F, 1.3862F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 12).cuboid(-0.7262F, 1.3862F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, 2.5307F));

		ModelPartData cube_r281 = center_coconut.addChild("cube_r281", ModelPartBuilder.create().uv(0, 68).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 8).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 20).cuboid(-1.5706F, 1.3824F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 0).cuboid(-0.725F, 1.3824F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, -3.1416F));

		ModelPartData cube_r282 = center_coconut.addChild("cube_r282", ModelPartBuilder.create().uv(48, 68).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 68).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 8).cuboid(-1.5718F, 1.3786F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-0.7262F, 1.3786F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, -2.5307F));

		ModelPartData cube_r283 = center_coconut.addChild("cube_r283", ModelPartBuilder.create().uv(40, 68).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 56).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 24).cuboid(-1.5749F, 1.3762F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 16).cuboid(-0.7293F, 1.3762F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, -1.9199F));

		ModelPartData cube_r284 = center_coconut.addChild("cube_r284", ModelPartBuilder.create().uv(32, 68).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 60).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-1.5789F, 1.376F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 4).cuboid(-0.7333F, 1.376F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r285 = center_coconut.addChild("cube_r285", ModelPartBuilder.create().uv(24, 68).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 64).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 8).cuboid(-1.5825F, 1.3784F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 4).cuboid(-0.7369F, 1.3784F, -1.6006F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -3.8135F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cube_r286 = center_coconut.addChild("cube_r286", ModelPartBuilder.create().uv(56, 64).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 64).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, -3.1416F));

		ModelPartData cube_r287 = center_coconut.addChild("cube_r287", ModelPartBuilder.create().uv(64, 52).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 40).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, -2.5307F));

		ModelPartData cube_r288 = center_coconut.addChild("cube_r288", ModelPartBuilder.create().uv(64, 48).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 60).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, -1.9199F));

		ModelPartData cube_r289 = center_coconut.addChild("cube_r289", ModelPartBuilder.create().uv(48, 64).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 0).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, -1.309F));

		ModelPartData cube_r290 = center_coconut.addChild("cube_r290", ModelPartBuilder.create().uv(64, 44).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 60).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, -0.6545F));

		ModelPartData cube_r291 = center_coconut.addChild("cube_r291", ModelPartBuilder.create().uv(64, 36).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 20).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, 2.5307F));

		ModelPartData cube_r292 = center_coconut.addChild("cube_r292", ModelPartBuilder.create().uv(64, 32).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 16).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, 1.8762F));

		ModelPartData cube_r293 = center_coconut.addChild("cube_r293", ModelPartBuilder.create().uv(32, 64).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 12).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, 1.2654F));

		ModelPartData cube_r294 = center_coconut.addChild("cube_r294", ModelPartBuilder.create().uv(64, 28).cuboid(-0.7382F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 48).cuboid(-1.5838F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, 0.0F));

		ModelPartData cube_r295 = center_coconut.addChild("cube_r295", ModelPartBuilder.create().uv(64, 24).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 48).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 3.1416F, 0.6545F));

		ModelPartData cube_r296 = center_coconut.addChild("cube_r296", ModelPartBuilder.create().uv(56, 60).cuboid(-0.7382F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 56).cuboid(-1.5838F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, 0.0F));

		ModelPartData cube_r297 = center_coconut.addChild("cube_r297", ModelPartBuilder.create().uv(48, 60).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 40).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, 0.6545F));

		ModelPartData cube_r298 = center_coconut.addChild("cube_r298", ModelPartBuilder.create().uv(40, 60).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 44).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, 1.2654F));

		ModelPartData cube_r299 = center_coconut.addChild("cube_r299", ModelPartBuilder.create().uv(32, 60).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 56).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, 1.8762F));

		ModelPartData cube_r300 = center_coconut.addChild("cube_r300", ModelPartBuilder.create().uv(56, 8).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 48).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, 2.5307F));

		ModelPartData cube_r301 = center_coconut.addChild("cube_r301", ModelPartBuilder.create().uv(56, 4).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 56).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, -2.5307F));

		ModelPartData cube_r302 = center_coconut.addChild("cube_r302", ModelPartBuilder.create().uv(24, 44).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 52).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, -3.1416F));

		ModelPartData cube_r303 = center_coconut.addChild("cube_r303", ModelPartBuilder.create().uv(16, 44).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 56).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, -1.9199F));

		ModelPartData cube_r304 = center_coconut.addChild("cube_r304", ModelPartBuilder.create().uv(8, 56).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 32).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, -1.309F));

		ModelPartData cube_r305 = center_coconut.addChild("cube_r305", ModelPartBuilder.create().uv(0, 56).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(56, 36).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 3.1416F, -0.6545F));

		ModelPartData cube_r306 = center_coconut.addChild("cube_r306", ModelPartBuilder.create().uv(56, 28).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 4).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, 1.2654F));

		ModelPartData cube_r307 = center_coconut.addChild("cube_r307", ModelPartBuilder.create().uv(56, 24).cuboid(-0.7382F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 36).cuboid(-1.5838F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, 0.0F));

		ModelPartData cube_r308 = center_coconut.addChild("cube_r308", ModelPartBuilder.create().uv(56, 20).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 36).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, 0.6545F));

		ModelPartData cube_r309 = center_coconut.addChild("cube_r309", ModelPartBuilder.create().uv(56, 16).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 8).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, 1.8762F));

		ModelPartData cube_r310 = center_coconut.addChild("cube_r310", ModelPartBuilder.create().uv(56, 12).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 52).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, 2.5307F));

		ModelPartData cube_r311 = center_coconut.addChild("cube_r311", ModelPartBuilder.create().uv(24, 40).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 52).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, -3.1416F));

		ModelPartData cube_r312 = center_coconut.addChild("cube_r312", ModelPartBuilder.create().uv(16, 40).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 52).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, -2.5307F));

		ModelPartData cube_r313 = center_coconut.addChild("cube_r313", ModelPartBuilder.create().uv(8, 52).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 48).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, -1.9199F));

		ModelPartData cube_r314 = center_coconut.addChild("cube_r314", ModelPartBuilder.create().uv(48, 0).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, -1.309F));

		ModelPartData cube_r315 = center_coconut.addChild("cube_r315", ModelPartBuilder.create().uv(0, 52).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 48).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 3.1416F, -0.6545F));

		ModelPartData cube_r316 = center_coconut.addChild("cube_r316", ModelPartBuilder.create().uv(48, 44).cuboid(-0.7382F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 44).cuboid(-1.5838F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, 0.0F));

		ModelPartData cube_r317 = center_coconut.addChild("cube_r317", ModelPartBuilder.create().uv(48, 40).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 44).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, 0.6545F));

		ModelPartData cube_r318 = center_coconut.addChild("cube_r318", ModelPartBuilder.create().uv(40, 48).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 0).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, 1.2654F));

		ModelPartData cube_r319 = center_coconut.addChild("cube_r319", ModelPartBuilder.create().uv(48, 36).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 44).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, 1.8762F));

		ModelPartData cube_r320 = center_coconut.addChild("cube_r320", ModelPartBuilder.create().uv(48, 32).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 32).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, 2.5307F));

		ModelPartData cube_r321 = center_coconut.addChild("cube_r321", ModelPartBuilder.create().uv(32, 48).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 32).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, -3.1416F));

		ModelPartData cube_r322 = center_coconut.addChild("cube_r322", ModelPartBuilder.create().uv(48, 28).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(48, 12).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, -2.5307F));

		ModelPartData cube_r323 = center_coconut.addChild("cube_r323", ModelPartBuilder.create().uv(48, 24).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 4).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, -1.9199F));

		ModelPartData cube_r324 = center_coconut.addChild("cube_r324", ModelPartBuilder.create().uv(48, 20).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 8).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, -1.309F));

		ModelPartData cube_r325 = center_coconut.addChild("cube_r325", ModelPartBuilder.create().uv(48, 16).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 44).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -1.309F, 0.0F, -0.6545F));

		ModelPartData cube_r326 = center_coconut.addChild("cube_r326", ModelPartBuilder.create().uv(24, 28).cuboid(-0.7382F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-1.5838F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r327 = center_coconut.addChild("cube_r327", ModelPartBuilder.create().uv(16, 28).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 36).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, 0.6545F));

		ModelPartData cube_r328 = center_coconut.addChild("cube_r328", ModelPartBuilder.create().uv(8, 40).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 24).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, 1.2654F));

		ModelPartData cube_r329 = center_coconut.addChild("cube_r329", ModelPartBuilder.create().uv(0, 40).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 24).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, 1.8762F));

		ModelPartData cube_r330 = center_coconut.addChild("cube_r330", ModelPartBuilder.create().uv(40, 40).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 12).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, 2.5307F));

		ModelPartData cube_r331 = center_coconut.addChild("cube_r331", ModelPartBuilder.create().uv(40, 36).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 16).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, -3.1416F));

		ModelPartData cube_r332 = center_coconut.addChild("cube_r332", ModelPartBuilder.create().uv(40, 32).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 20).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, -2.5307F));

		ModelPartData cube_r333 = center_coconut.addChild("cube_r333", ModelPartBuilder.create().uv(32, 40).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 8).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, -1.9199F));

		ModelPartData cube_r334 = center_coconut.addChild("cube_r334", ModelPartBuilder.create().uv(40, 28).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 36).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, -1.309F));

		ModelPartData cube_r335 = center_coconut.addChild("cube_r335", ModelPartBuilder.create().uv(40, 24).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.9599F, 0.0F, -0.6545F));

		ModelPartData cube_r336 = center_coconut.addChild("cube_r336", ModelPartBuilder.create().uv(32, 4).cuboid(-0.7382F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 60).cuboid(-1.5838F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, 0.0F));

		ModelPartData cube_r337 = center_coconut.addChild("cube_r337", ModelPartBuilder.create().uv(24, 20).cuboid(-0.7369F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-1.5825F, 1.3864F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, 0.6545F));

		ModelPartData cube_r338 = center_coconut.addChild("cube_r338", ModelPartBuilder.create().uv(16, 20).cuboid(-0.7336F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 64).cuboid(-1.5792F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, 1.2654F));

		ModelPartData cube_r339 = center_coconut.addChild("cube_r339", ModelPartBuilder.create().uv(8, 32).cuboid(-0.7296F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 28).cuboid(-1.5752F, 1.3887F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, 1.8762F));

		ModelPartData cube_r340 = center_coconut.addChild("cube_r340", ModelPartBuilder.create().uv(0, 32).cuboid(-0.7262F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 16).cuboid(-1.5718F, 1.3862F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, 2.5307F));

		ModelPartData cube_r341 = center_coconut.addChild("cube_r341", ModelPartBuilder.create().uv(32, 32).cuboid(-0.725F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 16).cuboid(-1.5706F, 1.3824F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, -3.1416F));

		ModelPartData cube_r342 = center_coconut.addChild("cube_r342", ModelPartBuilder.create().uv(32, 28).cuboid(-0.7262F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 12).cuboid(-1.5718F, 1.3786F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, -2.5307F));

		ModelPartData cube_r343 = center_coconut.addChild("cube_r343", ModelPartBuilder.create().uv(32, 24).cuboid(-0.7293F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 12).cuboid(-1.5749F, 1.3762F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, -1.9199F));

		ModelPartData cube_r344 = center_coconut.addChild("cube_r344", ModelPartBuilder.create().uv(32, 20).cuboid(-0.7333F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 12).cuboid(-1.5789F, 1.376F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, -1.309F));

		ModelPartData cube_r345 = center_coconut.addChild("cube_r345", ModelPartBuilder.create().uv(32, 16).cuboid(-0.7369F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 64).cuboid(-1.5825F, 1.3784F, -0.8456F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0614F, -12.718F, -4.191F, -0.48F, 0.0F, -0.6545F));

		ModelPartData blue_triangle1 = body.addChild("blue_triangle1", ModelPartBuilder.create().uv(72, 62).cuboid(-1.8817F, -0.9389F, 0.5748F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 58).cuboid(-0.8817F, -0.9389F, 0.5748F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 70).cuboid(-1.6317F, -0.4389F, 0.3248F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 66).cuboid(-1.6317F, -0.6889F, 0.3248F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 70).cuboid(-1.1317F, -0.1889F, 0.3248F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0862F, 12.6757F, -8.625F, 0.2444F, -0.2059F, -0.0108F));

		ModelPartData cube_r346 = blue_triangle1.addChild("cube_r346", ModelPartBuilder.create().uv(72, 68).cuboid(-4.8889F, -0.7075F, 0.4498F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.6638F, -0.4257F, -0.125F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r347 = blue_triangle1.addChild("cube_r347", ModelPartBuilder.create().uv(72, 56).cuboid(-5.8889F, -0.7075F, -0.0502F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.9138F, -0.1757F, 0.625F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r348 = blue_triangle1.addChild("cube_r348", ModelPartBuilder.create().uv(72, 60).cuboid(-2.8889F, -0.7075F, -0.0502F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.6638F, -0.1757F, 0.625F, 0.0F, 0.0F, -0.3491F));

		ModelPartData blue_triangle2 = body.addChild("blue_triangle2", ModelPartBuilder.create().uv(76, 70).cuboid(-0.6098F, -0.3634F, 0.1698F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 66).cuboid(-4.1098F, -0.8634F, 0.1698F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 70).cuboid(-0.1098F, -0.6134F, 0.1698F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.6275F, 11.7016F, -5.75F, 0.1309F, 0.829F, 0.0F));

		ModelPartData cube_r349 = blue_triangle2.addChild("cube_r349", ModelPartBuilder.create().uv(72, 68).cuboid(0.3373F, -0.665F, 0.1698F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.8725F, -0.4516F, 0.0F, 0.0F, 0.0F, 0.3491F));

		ModelPartData red_triangle1 = body.addChild("red_triangle1", ModelPartBuilder.create().uv(86, 62).cuboid(0.7865F, -1.9142F, 0.5748F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(86, 58).cuboid(-4.2135F, 0.0858F, 0.5748F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 70).cuboid(0.5365F, -1.4142F, 0.3248F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 66).cuboid(-3.4635F, -0.1642F, 0.3248F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 70).cuboid(0.0365F, -0.6642F, 0.3248F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.5862F, 9.5743F, -8.125F, -0.0944F, 0.3044F, 0.5673F));

		ModelPartData cube_r350 = red_triangle1.addChild("cube_r350", ModelPartBuilder.create().uv(84, 68).cuboid(0.7491F, -0.187F, 0.4498F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.6638F, 0.4257F, -0.125F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r351 = red_triangle1.addChild("cube_r351", ModelPartBuilder.create().uv(86, 56).cuboid(-0.2509F, -0.187F, -0.0502F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.9138F, 0.1757F, 0.625F, 0.0F, 0.0F, -0.3491F));

		ModelPartData cube_r352 = red_triangle1.addChild("cube_r352", ModelPartBuilder.create().uv(86, 60).cuboid(-0.2509F, -0.187F, -0.0502F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.6638F, 0.1757F, 0.625F, 0.0F, 0.0F, -0.3491F));

		ModelPartData red_triangle2 = body.addChild("red_triangle2", ModelPartBuilder.create().uv(88, 70).cuboid(-0.4017F, -0.5576F, 0.1797F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 66).cuboid(-0.9017F, -1.0576F, 0.1797F, 5.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 70).cuboid(-0.9017F, -0.8076F, 0.1797F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.8775F, 9.2016F, -5.5F, -0.1547F, -0.8121F, -0.1809F));

		ModelPartData cube_r353 = red_triangle2.addChild("cube_r353", ModelPartBuilder.create().uv(84, 68).cuboid(-4.2817F, -0.8514F, 0.1797F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.8725F, -0.4516F, 0.0F, 0.0F, 0.0F, -0.3491F));

		ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

		ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

		ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

		ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
		return modelData;
	}
}