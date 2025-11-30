package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.block.entity.HivePlateBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HivePlateBlock extends BlockWithEntity {
	public HivePlateBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected MapCodec<? extends BlockWithEntity> getCodec() {
		return createCodec(HivePlateBlock::new);
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
		if(!world.isClient()) {
			if(world.getBlockEntity(pos) instanceof HivePlateBlockEntity hivePlateBlockEntity && placer != null) {
				hivePlateBlockEntity.setOwner(placer.getUuid());
			}
		}
	}

	@Override
	public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new HivePlateBlockEntity(pos, state);
	}

	@Override
	protected BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.createHitbox();
	}

	@Override
	protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
		return this.createHitbox();
	}

	@Override
	protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.createHitbox();
	}

	private VoxelShape createHitbox() {
		return Block.createCuboidShape(0.0d, 0.0d, 0.0d, 16.0d, 10.0d, 16.0d);
	}
}
