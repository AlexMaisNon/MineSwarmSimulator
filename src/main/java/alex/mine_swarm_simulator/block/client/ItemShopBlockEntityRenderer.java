package alex.mine_swarm_simulator.block.client;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.block.entity.ItemShopBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;

public class ItemShopBlockEntityRenderer implements BlockEntityRenderer<ItemShopBlockEntity> {
	public ItemShopBlockEntityRenderer(BlockEntityRendererFactory.Context context) {}

	@Override
	public void render(ItemShopBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
		Direction direction = entity.getCachedState().get(Properties.HORIZONTAL_FACING);

		matrices.push();

		// Item rendering
		ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();

		matrices.translate(0.5f, 0.5f, 0.5f);
		matrices.scale(1f, 1f, 1f);

		matrices.multiply(direction.getRotationQuaternion());
		matrices.multiply(RotationAxis.NEGATIVE_X.rotationDegrees(90f));
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));

		ItemStack itemToRender = entity.getShopItem() == Items.AIR ? ModBlocks.ITEM_SHOP.asItem().getDefaultStack() : entity.getShopItem().getDefaultStack();

		itemRenderer.renderItem(itemToRender, ModelTransformationMode.FIXED, light, overlay, matrices, vertexConsumers, entity.getWorld(), 0);

		matrices.pop();
	}
}
