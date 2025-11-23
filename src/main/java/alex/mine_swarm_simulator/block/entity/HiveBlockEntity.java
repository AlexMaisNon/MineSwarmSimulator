package alex.mine_swarm_simulator.block.entity;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.custom.HiveBlock;
import alex.mine_swarm_simulator.entity.BeeEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class HiveBlockEntity extends BlockEntity {
	public static final UUID defaultUUID = new UUID(0, 0);

	private UUID beeUUID = defaultUUID;
	private byte beeLevel = 0;
	private long beeBond = 0;
	private byte beeMutationId = 0;
	private ItemStack beeBeequip = ItemStack.EMPTY;

	public HiveBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.HIVE_BLOCK_ENTITY, pos, state);
	}

	public UUID getBeeUUID() {
		return this.beeUUID;
	}

	public byte getBeeLevel() {
		return this.beeLevel;
	}

	public long getBeeBond() {
		return this.beeBond;
	}

	public byte getBeeMutationId() {
		return this.beeMutationId;
	}

	public ItemStack getBeeBeequip() {
		return this.beeBeequip;
	}

	public void setBeeUUID(UUID value) {
		this.beeUUID = value;
		markDirty();
	}

	public void setBeeLevel(byte value) {
		this.beeLevel = value;
		markDirty();
	}

	public void setBeeBond(long value) {
		this.beeBond = value;
		markDirty();
	}

	public void setBeeMutationId(byte value) {
		this.beeMutationId = value;
		markDirty();
	}

	public void setBeeBeequip(ItemStack value) {
		this.beeBeequip = value;
		markDirty();
	}

	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		NbtCompound beeCompound = nbt.getCompound("Bee");
		this.beeUUID = beeCompound.getUuid("UUID");
		this.beeLevel = beeCompound.getByte("Level");
		this.beeBond = beeCompound.getLong("Bond");
		this.beeMutationId = beeCompound.getByte("Mutation");
		this.beeBeequip = ItemStack.fromNbtOrEmpty(registryLookup, beeCompound.getCompound("Beequip"));
	}

	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		NbtCompound beeCompound = new NbtCompound();

		beeCompound.putUuid("UUID", this.beeUUID);
		beeCompound.putByte("Level", this.beeLevel);
		beeCompound.putLong("Bond", this.beeBond);
		beeCompound.putByte("Mutation", this.beeMutationId);

		if(!this.beeBeequip.isEmpty()) {
			NbtCompound itemCompound = new NbtCompound();
			beeCompound.put("Beequip", this.beeBeequip.encode(registryLookup, itemCompound));
		}

		nbt.put("Bee", beeCompound);
	}

	@Nullable
	@Override
	public Packet<ClientPlayPacketListener> toUpdatePacket() {
		return BlockEntityUpdateS2CPacket.create(this);
	}

	@Override
	public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
		return createNbt(registryLookup);
	}

	public static void tick(World world, BlockPos blockPos, BlockState blockState, HiveBlockEntity hiveBlockEntity) {
		if(!world.isClient() && world instanceof ServerWorld serverWorld && hiveBlockEntity.getBeeUUID() != HiveBlockEntity.defaultUUID) {
			if(serverWorld.getEntity(hiveBlockEntity.getBeeUUID()) instanceof BeeEntity beeEntity && !beeEntity.isDead()) {
				int typeId = beeEntity.getBeeTypeId() + 1;
				if(typeId != blockState.get(HiveBlock.BEE_ID) || beeEntity.getGifted() != blockState.get(HiveBlock.GIFTED)) {
					world.setBlockState(blockPos, blockState.with(HiveBlock.BEE_ID, typeId).with(HiveBlock.GIFTED, beeEntity.getGifted()));
				}
				if(beeEntity.getLevel() != hiveBlockEntity.getBeeLevel()) {
					hiveBlockEntity.setBeeLevel(beeEntity.getLevel());
					serverWorld.getChunkManager().markForUpdate(blockPos);
				}
				if(beeEntity.getBond() != hiveBlockEntity.getBeeBond()) {
					hiveBlockEntity.setBeeBond(beeEntity.getBond());
					serverWorld.getChunkManager().markForUpdate(blockPos);
				}
				if(beeEntity.getBeequip() != hiveBlockEntity.getBeeBeequip()) {
					hiveBlockEntity.setBeeBeequip(beeEntity.getBeequip());
					serverWorld.getChunkManager().markForUpdate(blockPos);
				}
			} else {
				hiveBlockEntity.setBeeUUID(defaultUUID);
				hiveBlockEntity.setBeeLevel((byte)0);
				hiveBlockEntity.setBeeMutationId((byte)0);
				hiveBlockEntity.setBeeBeequip(ItemStack.EMPTY);
				world.setBlockState(blockPos, blockState.with(HiveBlock.BEE_ID, 0).with(HiveBlock.GIFTED, false));
			}
		}
	}
}
