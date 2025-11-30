package alex.mine_swarm_simulator.block.entity;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.BlockPos;

import java.util.UUID;

public class HivePlateBlockEntity extends BlockEntity {
	private UUID owner;

	public HivePlateBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.HIVE_PLATE_BLOCK_ENTITY, pos, state);
	}

	public UUID getOwnerUUID() {
		return this.owner;
	}

	public void setOwner(UUID owner) {
		this.owner = owner;
		markDirty();
	}

	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		this.owner = nbt.getUuid("Owner");
	}

	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		nbt.putUuid("Owner", this.owner);
	}
}
