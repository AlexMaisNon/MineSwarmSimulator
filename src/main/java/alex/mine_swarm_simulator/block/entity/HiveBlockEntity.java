package alex.mine_swarm_simulator.block.entity;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.custom.HiveBlock;
import alex.mine_swarm_simulator.entity.BeeEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.UUID;

public class HiveBlockEntity extends BlockEntity {
	public static final UUID defaultUUID = new UUID(0, 0);
	private UUID beeUUID = defaultUUID;

	public HiveBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.HIVE_BLOCK_ENTITY, pos, state);
	}

	public void setBeeUUID(UUID value) {
		this.beeUUID = value;
		markDirty();
	}

	public UUID getBeeUUID() {
		return this.beeUUID;
	}

	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		this.beeUUID = nbt.getUuid("Bee");
	}

	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		nbt.putUuid("Bee", this.beeUUID);
	}

	public static void tick(World world, BlockPos blockPos, BlockState blockState, HiveBlockEntity hiveBlockEntity) {
		if(!world.isClient() && world instanceof ServerWorld serverWorld && hiveBlockEntity.getBeeUUID() != HiveBlockEntity.defaultUUID) {
			if(serverWorld.getEntity(hiveBlockEntity.getBeeUUID()) instanceof BeeEntity beeEntity) {
				int typeId = beeEntity.getBeeTypeId() + 1;
				if(typeId != blockState.get(HiveBlock.BEE_ID) || beeEntity.getGifted() != blockState.get(HiveBlock.GIFTED)) {
					world.setBlockState(blockPos, blockState.with(HiveBlock.BEE_ID, typeId).with(HiveBlock.GIFTED, beeEntity.getGifted()));
				};
			} else {
				hiveBlockEntity.setBeeUUID(defaultUUID);
				world.setBlockState(blockPos, blockState.with(HiveBlock.BEE_ID, 0));
			}
		}
	}
}
