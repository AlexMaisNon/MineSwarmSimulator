package alex.mine_swarm_simulator.entity.client;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.util.BeeType;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BeeEntityRenderer extends MobEntityRenderer<BeeEntity, BeeEntityModel<BeeEntity>> {
	private static final String[] beeTextures = new String[]{
		"basic_bee.png",
		"bomber_bee.png",
		"brave_bee.png",
		"bumble_bee.png",
		"cool_bee.png",
		"hasty_bee.png",
		"looker_bee.png",
		"rad_bee.png",
		"rascal_bee.png",
		"stubborn_bee.png",
		"bubble_bee.png",
		"bucko_bee.png",
		"commander_bee.png",
		"demo_bee.png",
		"exhausted_bee.png",
		"fire_bee.png",
		"frosty_bee.png",
		"honey_bee.png",
		"rage_bee.png",
		"riley_bee.png",
		"shocked_bee.png",
		"baby_bee.png",
		"carpenter_bee.png",
		"demon_bee.png",
		"diamond_bee.png",
		"lion_bee.png",
		"music_bee.png",
		"ninja_bee.png",
		"shy_bee.png",
		"buoyant_bee.png",
		"fuzzy_bee.png",
		"precise_bee.png",
		"spicy_bee.png",
		"tadpole_bee.png",
		"vector_bee.png",
		"bear_bee.png",
		"cobalt_bee.png",
		"crimson_bee.png",
		"digital_bee.png",
		"festive_bee.png",
		"gummy_bee.png",
		"photon_bee.png",
		"puppy_bee.png",
		"tabby_bee.png",
		"vicious_bee.png",
		"windy_bee.png"
	};

	public BeeEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new BeeEntityModel<>(context.getPart(BeeEntityModel.BEE_MODEL_LAYER)), 0.5f);
	}

	@Override
	public Identifier getTexture(BeeEntity entity) {
		String path = entity.getGifted() ? "textures/entity/gifted_" + beeTextures[entity.getBeeType().getId()] : "textures/entity/" + beeTextures[entity.getBeeType().getId()];
		return Identifier.of(MineSwarmSimulator.MOD_ID, path);
	}

	@Override
	public void render(BeeEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
		if(livingEntity.getBeeType() == BeeType.BABY || livingEntity.getBeeType() == BeeType.TADPOLE) {
			matrixStack.scale(0.7f, 0.7f, 0.7f);
		} else {
			matrixStack.scale(1f, 1f, 1f);
		}
		super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
	}
}
