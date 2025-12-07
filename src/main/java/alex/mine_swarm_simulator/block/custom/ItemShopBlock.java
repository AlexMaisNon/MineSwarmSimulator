package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.entity.ItemShopBlockEntity;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class ItemShopBlock extends BlockWithEntity {
	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

	public ItemShopBlock(Settings settings) {
		super(settings.noCollision().pistonBehavior(PistonBehavior.BLOCK).allowsSpawning(Blocks::never));
		setDefaultState(this.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
	}

	@Override
	public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	protected MapCodec<? extends BlockWithEntity> getCodec() {
		return createCodec(ItemShopBlock::new);
	}

	@Override
	public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return ModBlockEntities.ITEM_SHOP_BLOCK_ENTITY.instantiate(pos, state);
	}

	@Override
	protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
		if(world instanceof ServerWorld serverWorld && serverWorld.getBlockEntity(pos) instanceof ItemShopBlockEntity itemShop && !itemShop.getShopItem().equals(Items.AIR)) {
			if(!itemShop.getBoughtList().contains(player.getUuid()) && itemShop.getItemPrice() > 0) {
				PlayerData playerData = StateSaverAndLoader.getPlayerState(player);

				if (playerData.honey >= itemShop.getItemPrice()) {
					AtomicBoolean enoughMaterials = new AtomicBoolean(true);

					itemShop.getMaterials().forEach((material, quantity) -> enoughMaterials.set(enoughMaterials.get() && player.getInventory().count(material) >= quantity));

					if (enoughMaterials.get()) {
						playerData.honey -= itemShop.getItemPrice();
						itemShop.getMaterials().forEach((item, quantity) -> {
							int amount = quantity;
							int i = 0;

							while (i < player.getInventory().size() && amount > 0) {
								ItemStack currentStack = player.getInventory().getStack(i);

								if (currentStack.isOf(item)) {
									int toDecrement = Math.min(amount, currentStack.getCount());
									amount -= toDecrement;
									currentStack.decrement(toDecrement);
								}

								i++;
							}
						});

						itemShop.addUUIDToBoughtList(player.getUuid());

						player.giveItemStack(itemShop.getShopItem().getDefaultStack());
						player.sendMessage(Text.literal("Bought ").append(Text.translatable(itemShop.getShopItem().getTranslationKey())).formatted(Formatting.YELLOW));

						return ActionResult.SUCCESS;
					} else {
						player.sendMessage(Text.literal("Not enough materials !").formatted(Formatting.RED));
					}
				} else {
					player.sendMessage(Text.literal("Not enough honey !").formatted(Formatting.RED));
				}
			} else {
				player.sendMessage(Text.literal("You already bought that item !").formatted(Formatting.RED));
			}
		}
		return super.onUse(state, world, pos, player, hit);
	}
}
