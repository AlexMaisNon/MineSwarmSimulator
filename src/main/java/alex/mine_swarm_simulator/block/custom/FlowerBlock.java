package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class FlowerBlock extends BlockWithEntity {
	public static final IntProperty DEPLETION = IntProperty.of("depletion", 0, 12);
	public static final IntProperty COLOR = IntProperty.of("color", 0, 2);
	public static final IntProperty LEVEL = IntProperty.of("level", 0, 4);
	public static final IntProperty GOO = IntProperty.of("goo", 0, 8);

	public FlowerBlock(Settings settings) {
		super(settings.strength(-1.0F, 3600000.0F).noCollision().sounds(BlockSoundGroup.GRASS));
		setDefaultState(getDefaultState().with(DEPLETION, 0).with(COLOR, 0).with(LEVEL, 0).with(GOO, 0));
	}

	public static int getColors(BlockPos pos, int[] colormap) {
		int i = pos.getX() + pos.getY() & 0xff;
		int j = pos.getZ() + pos.getY() & 0xff;
		int loc = i << 8 | j;
		return colormap[loc];
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		BlockPos blockPosDown = pos.down();
		BlockState blockState = world.getBlockState(blockPosDown);
		return blockState.isSideSolidFullSquare(world, blockPosDown, Direction.UP);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(DEPLETION, COLOR, LEVEL, GOO);
	}

	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, state.get(DEPLETION) < 12 ? 12.0 - state.get(DEPLETION) : 1.0, 16.0);
	}

	@Override
	protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
		return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, state.get(DEPLETION) < 12 ? 12.0 - state.get(DEPLETION) : 1.0, 16.0);
	}

	@Override
	protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 12.0 - state.get(DEPLETION), 16.0);
	}

	@Override
	protected MapCodec<? extends BlockWithEntity> getCodec() {
		return createCodec(FlowerBlock::new);
	}

	@Override
	protected BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new FlowerBlockEntity(pos, state);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return validateTicker(type, ModBlockEntities.FLOWER_BLOCK_ENTITY, FlowerBlockEntity::tick);
	}
}
