package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.ArrayList;
import java.util.Iterator;

public class StickerBlock extends Block {
	public static final ArrayList<Item> HIVE_SKINS = new ArrayList<>();

	public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

	private boolean isHive = false;

	public StickerBlock() {
		super(AbstractBlock.Settings.create().noCollision().sounds(BlockSoundGroup.CANDLE).breakInstantly().offset(OffsetType.XYZ));
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
	}

	@Override
	protected float getMaxHorizontalModelOffset() {
		return 0f;
	}

	@Override
	protected float getVerticalModelOffsetMultiplier() {
		return 0.15f;
	}

	public StickerBlock(boolean isHive) {
		this();
		this.isHive = isHive;
	}

	@Override
	protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		return !this.isHive && this.hasAdjacentBlocks(world, pos);
	}

	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		return world.getBlockState(pos.add(state.get(FACING).getVector())).isOf(ModBlocks.HIVE_BLOCK) ? state : Blocks.AIR.getDefaultState();
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockHitResult hitResult = (BlockHitResult)ctx.getPlayer().raycast(5, 0, false);
		Direction facingDirection = hitResult.getSide().getOpposite();

		// Tries to find any neighbor if the facing direction isn't valid
		if(facingDirection.getHorizontal() < 0 || !ctx.getWorld().getBlockState(ctx.getBlockPos().add(facingDirection.getVector())).isOf(ModBlocks.HIVE_BLOCK)) {
			boolean found = false;
			Iterator<Direction> directions = Direction.Type.HORIZONTAL.iterator();

			while(!found && directions.hasNext()) {
				facingDirection = directions.next();
				found = ctx.getWorld().getBlockState(ctx.getBlockPos().add(facingDirection.getVector())).isOf(ModBlocks.HIVE_BLOCK);
			}
		}

		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, facingDirection);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.createHitbox(state);
	}

	@Override
	protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
		return this.createHitbox(state);
	}

	@Override
	protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.createHitbox(state);
	}

	private VoxelShape createHitbox(BlockState state) {
		return switch(state.get(FACING)) {
			case EAST -> Block.createCuboidShape(15.0d, 2.0d, 2.0d, 16.0d, 14.0d, 14.0d);
			case WEST -> Block.createCuboidShape(0.0d, 2.0d, 2.0d, 1.0d, 14.0d, 14.0d);
			case SOUTH -> Block.createCuboidShape(2.0d, 2.0d, 15.0d, 14.0d, 14.0d, 16.0d);
			default -> Block.createCuboidShape(2.0d, 2.0d, 0.0d, 14.0d, 14.0d, 1.0d);
		};
	}

	private boolean hasAdjacentBlocks(WorldView world, BlockPos blockPos) {
		boolean hasNeighbor = false;

		Iterator<Direction> directions = Direction.Type.HORIZONTAL.iterator();
		while(!hasNeighbor && directions.hasNext()) {
			hasNeighbor = world.getBlockState(blockPos.add(directions.next().getVector())).isOf(ModBlocks.HIVE_BLOCK);
		}

		return hasNeighbor;
	}
}
