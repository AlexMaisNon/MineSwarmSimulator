package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class HiveBlock extends Block {
	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
	public static final IntProperty SKIN = IntProperty.of("skin", 0, 12);

	public HiveBlock() {
		super(AbstractBlock.Settings.create());
		this.setDefaultState(this.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(SKIN, 0));
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING, SKIN);
	}

	@Override
	protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		return useWithItem(stack, state, world, pos, player);
	}

	public static ItemActionResult useWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player) {
		int skin = StickerBlock.HIVE_SKINS.indexOf(stack.getItem()) + 1;

		if(skin > 0 && state.get(SKIN) != skin) {
			if(state.get(SKIN) > 0) {
				player.giveItemStack(new ItemStack(StickerBlock.HIVE_SKINS.get(state.get(SKIN) - 1)));
			}
			changeSkin(skin, state, world, pos, new ArrayList<>());

			if(!player.isCreative()) {
				stack.decrement(1);
			}

			return ItemActionResult.SUCCESS;
		}

		return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
	}

	public static void changeSkin(int skin, BlockState state, World world, BlockPos pos, List<BlockPos> seen) {
		if(!seen.contains(pos)) {
			seen.add(pos);
			world.setBlockState(pos, state.with(SKIN, skin));

			BlockPos[] neighbors = new BlockPos[] {
				pos.add(1, 0, 0),
				pos.add(0, 1, 0),
				pos.add(0, 0, 1),
				pos.add(-1, 0, 0),
				pos.add(0, -1, 0),
				pos.add(0, 0, -1)
			};

			for(BlockPos blockPos : neighbors) {
				if(world.getBlockState(blockPos).isOf(ModBlocks.HIVE_BLOCK) || world.getBlockState(blockPos).isOf(ModBlocks.HIVE_BLOCK_SLAB)) {
					changeSkin(skin, world.getBlockState(blockPos), world, blockPos, seen);
				}
			}
		}
	}
}
