package alex.mine_swarm_simulator.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.WorldView;

public class ShopBlock extends Block {

	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
	public static final IntProperty PART_ID = IntProperty.of("part_id", 0, 2);

	public ShopBlock(Settings settings) {
		super(settings.sounds(BlockSoundGroup.STONE));
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(PART_ID, 0));
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		int partId = state.get(PART_ID);
		if(direction == Direction.UP) {
			if(neighborState.getBlock() instanceof ShopBlock && neighborState.get(PART_ID) != partId) {
				return (BlockState) neighborState.with(PART_ID, partId);
			}
			return Blocks.AIR.getDefaultState();
		}
		return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
		world.setBlockState(pos.up(), state.with(PART_ID, 1), Block.NOTIFY_ALL);
		world.setBlockState(pos.up(2), state.with(PART_ID, 2), Block.NOTIFY_ALL);
	}

	@Override
	public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
		if (!(world.isClient || !player.isCreative() && player.canHarvest(state))) {
			BlockPos blockPos;
			BlockState blockState;
			BlockPos blockPos2;
			BlockState blockState2;

			int partId = state.get(PART_ID);
			switch(partId) {
				case 2:
					if((blockState = world.getBlockState(blockPos = pos.down())).isOf(state.getBlock()) && blockState.get(PART_ID) == 1
						&& (blockState2 = world.getBlockState(blockPos2 = pos.down(2))).isOf(state.getBlock()) && blockState2.get(PART_ID) == 0) {
						onBreakTall(world, player, blockState, blockPos, blockState2, blockPos2);
					}
					break;
				case 1:
					if((blockState = world.getBlockState(blockPos = pos.up())).isOf(state.getBlock()) && blockState.get(PART_ID) == 2
						&& (blockState2 = world.getBlockState(blockPos2 = pos.down())).isOf(state.getBlock()) && blockState2.get(PART_ID) == 0) {
						onBreakTall(world, player, blockState, blockPos, blockState2, blockPos2);
					}
					break;
				case 0:
					if((blockState = world.getBlockState(blockPos = pos.up(2))).isOf(state.getBlock()) && blockState.get(PART_ID) == 2
						&& (blockState2 = world.getBlockState(blockPos2 = pos.up())).isOf(state.getBlock()) && blockState2.get(PART_ID) == 1) {
						onBreakTall(world, player, blockState, blockPos, blockState2, blockPos2);
					}
					break;
			}
		}
		return super.onBreak(world, pos, state, player);
	}

	private static void onBreakTall(World world, PlayerEntity player, BlockState blockState, BlockPos blockPos, BlockState blockState2, BlockPos blockPos2) {
		BlockState blockStateRemove = blockState.getFluidState().isOf(Fluids.WATER) ? Blocks.WATER.getDefaultState() : Blocks.AIR.getDefaultState();
		world.setBlockState(blockPos, blockStateRemove, Block.NOTIFY_ALL | Block.SKIP_DROPS);
		world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));

		BlockState blockStateRemove2 = blockState2.getFluidState().isOf(Fluids.WATER) ? Blocks.WATER.getDefaultState() : Blocks.AIR.getDefaultState();
		world.setBlockState(blockPos2, blockStateRemove2, Block.NOTIFY_ALL | Block.SKIP_DROPS);
		world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos2, Block.getRawIdFromState(blockState2));
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		BlockPos blockPosDown = pos.down();
		BlockState blockStateDown = world.getBlockState(blockPosDown);
		BlockPos blockPosUp = pos.up();
		BlockState blockStateUp = world.getBlockState(blockPosUp);
		BlockPos blockPosUp2 = pos.up(2);
		BlockState blockStateUp2 = world.getBlockState(blockPosUp2);
		if(state.get(PART_ID) == 0) {
			return blockStateUp.isOf(Blocks.AIR) && blockStateUp2.isOf(Blocks.AIR);
		}
		return blockStateDown.isOf(this) && world.getBlockState(pos).isOf(Blocks.AIR);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(PART_ID, FACING);
	}

}
