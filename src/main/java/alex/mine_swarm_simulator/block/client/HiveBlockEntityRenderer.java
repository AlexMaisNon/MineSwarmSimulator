package alex.mine_swarm_simulator.block.client;

import alex.mine_swarm_simulator.block.entity.HiveBlockEntity;
import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.item.misc.BeequipItem;
import alex.mine_swarm_simulator.item.misc.WaxItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;

public class HiveBlockEntityRenderer implements BlockEntityRenderer<HiveBlockEntity> {
	// atk, ca, ga, en, ic, bar, cc, ms
	public static int[] mutations = new int[]{0xE53A36, 0xE5B737, 0xB2FF83, 0xAE8B56, 0xF5FF1C, 0xB9A5F2, 0x42BE66, 0x4FB8F2};

	public HiveBlockEntityRenderer(BlockEntityRendererFactory.Context context) {}

	@Override
	public void render(HiveBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
		Direction direction = entity.getCachedState().get(Properties.HORIZONTAL_FACING);

		// Level rendering
		if(entity.getBeeLevel() > 1) {
			matrices.push();

			TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
			matrices.translate(0.5, 0.5, 0.5);

			matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180));
			switch(direction) {
				case NORTH -> matrices.translate(-0.35, 0, 0.2);
				case EAST -> {
					matrices.translate(0.2, 0, 0.35);
					matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
				}
				case WEST -> {
					matrices.translate(-0.2, 0, -0.35);
					matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(90));
				}
				case SOUTH -> {
					matrices.translate(0.35, 0, -0.2);
					matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
				}
			}

			matrices.scale(0.45f/18f, 0.45f/18f, 0.45f/18f);

			String text = entity.getBeeLevel() > 0 && !entity.getBeeUUID().equals(HiveBlockEntity.defaultUUID) ? String.valueOf(entity.getBeeLevel()) : "";
			float width = textRenderer.getWidth(text);

			textRenderer.draw(text, -width / 2f, -3.5f, entity.getBeeMutationId() > 0 ? mutations[entity.getBeeMutationId() - 1] : 0xffffff, false, matrices.peek().getPositionMatrix(), vertexConsumers, TextRenderer.TextLayerType.NORMAL, 0, light);
			matrices.pop();
		}

		// Beequip rendering
		ClientPlayerEntity player = MinecraftClient.getInstance().player;
		if(!entity.getBeeBeequip().isEmpty() && player != null && (player.getMainHandStack().getItem() instanceof BeequipItem || player.getMainHandStack().getItem() instanceof WaxItem || player.getMainHandStack().isOf(ModItems.BEEQUIP_CASE))) {
			matrices.push();

			ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
			matrices.translate(0.5, 0.4, 0.5);

			switch(direction) {
				case NORTH -> {
					matrices.translate(-0.1, 0, 0.15);
					matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
				}
				case EAST -> {
					matrices.translate(-0.15, 0, -0.1);
					matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
				}
				case WEST -> {
					matrices.translate(0.15, 0, 0.1);
					matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(90));
				}
				case SOUTH -> matrices.translate(0.1, 0, -0.15);
			}

			matrices.scale(0.5f, 0.5f, 0.5f);
			itemRenderer.renderItem(entity.getBeeBeequip(), ModelTransformationMode.GUI, light, overlay, matrices, vertexConsumers, entity.getWorld(), 1);

			matrices.pop();
		}
	}
}
