package alex.mine_swarm_simulator.block.entity;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.block.ModBlockEntities;
import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.util.GooObject;
import alex.mine_swarm_simulator.util.PlayerUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class FlowerBlockEntity extends BlockEntity {
	private byte pollen;
	private byte maxPollen;
	private List<GooObject> goo;

	public FlowerBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.FLOWER_BLOCK_ENTITY, pos, state);
		this.maxPollen = (byte)(15 + 15 * (state.get(FlowerBlock.LEVEL) + 1));
		this.pollen = this.maxPollen;
		this.goo = new ArrayList<>();
	}

	public byte getPollen() {
		return this.pollen;
	}

	public byte getMaxPollen() {
		return this.maxPollen;
	}

	public List<GooObject> getGoo() {
		return goo;
	}

	public void setPollen(int value) {
		this.pollen = (byte)Math.max(Math.min(this.maxPollen, value), 0);
		markDirty();
	}

	public void setMaxPollen(int value) {
		this.maxPollen = (byte)Math.max(value, 0);
		markDirty();
	}

	public void setGoo(List<GooObject> value) {
		this.goo = value;
		markDirty();
	}

	public void addGoo(GooObject value) {
		this.goo.add(value);
		markDirty();
	}

	public void modifyGooRadius(GooObject gooObject, int value) {
		this.goo.get(this.goo.indexOf(gooObject)).setRadius(value);
	}

	public void modifyGooDuration(GooObject gooObject, float value) {
		this.goo.get(this.goo.indexOf(gooObject)).setDuration(value);
	}

	public int collectPollen(int amount, LivingEntity livingEntity, float multiplier) {
		int collected = this.pollen - amount > 0 ? amount : this.pollen;
		int totalCollected = Math.round(collected * (this.getCachedState().get(FlowerBlock.LEVEL) + 1) * multiplier);

		ServerPlayerEntity serverPlayer = null;
		if(livingEntity instanceof ServerPlayerEntity serverPlayerEntity) {
			serverPlayer = serverPlayerEntity;
		} else if(livingEntity instanceof BeeEntity beeEntity && beeEntity.getOwner() instanceof ServerPlayerEntity serverPlayerEntity) {
			serverPlayer = serverPlayerEntity;
		}

		if(serverPlayer != null) {
			PlayerData playerData = StateSaverAndLoader.getPlayerState(serverPlayer);
			totalCollected = Math.toIntExact(playerData.pollen + totalCollected <= PlayerUtils.getPlayerCapacity(serverPlayer) ? totalCollected : Math.max(PlayerUtils.getPlayerCapacity(serverPlayer) - playerData.pollen, 0));
			playerData.pollen += totalCollected;
			this.setPollen(this.pollen - amount);
		}
		return totalCollected;
	}

	public int collectPollen(int amount, LivingEntity livingEntity) {
		return this.collectPollen(amount, livingEntity, 1f);
	}

	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		nbt.putByte("pollen", this.pollen);
		nbt.putByte("max_pollen", this.maxPollen);

		NbtList gooObjects = new NbtList();
		this.goo.forEach(gooObject -> {
			NbtCompound nbtObject = new NbtCompound();
			nbtObject.putInt("radius", gooObject.getRadius());
			nbtObject.putFloat("duration", gooObject.getDuration());
			nbtObject.putString("owner", gooObject.getOwner() != null ? gooObject.getOwner() : "");
			gooObjects.add(nbtObject);
		});
		nbt.put("goo", gooObjects);
	}

	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		this.pollen = nbt.getByte("pollen");
		this.maxPollen = nbt.getByte("max_pollen");

		this.goo = new ArrayList<>();
		NbtList gooObjects = (NbtList)nbt.get("goo");
		gooObjects.forEach(gooObject -> {
			NbtCompound nbtObject = (NbtCompound)gooObject;
			this.goo.add(new GooObject(nbtObject.getInt("radius"), nbtObject.getFloat("duration"), nbtObject.getString("owner").isEmpty() ? null : nbtObject.getString("owner")));
		});
	}

	public static void tick(World world, BlockPos blockPos, BlockState blockState, FlowerBlockEntity flowerBlockEntity) {
		if(!world.isClient()) {
			if(world.getTime() % (int)(60f / (blockState.get(FlowerBlock.LEVEL) + 2f)) == 0) {
				if(flowerBlockEntity.pollen < flowerBlockEntity.maxPollen) {
					flowerBlockEntity.setPollen(flowerBlockEntity.pollen + 1);
				}
			}
			if(!flowerBlockEntity.goo.isEmpty()) {
				List<GooObject> gooObjectsToDelete = new ArrayList<>();
				flowerBlockEntity.goo.forEach(gooObject -> {
					if(gooObject.getOwner() != null && !gooObject.getOwner().equals("gummy_morph_passive")) {
						gooObject.setDuration(gooObject.getDuration() - 0.0125f);
					} else {
						gooObject.setDuration(gooObject.getDuration() - 0.00625f);
					}
					if(gooObject.getDuration() < 0) {
						gooObjectsToDelete.add(gooObject);
					}
				});
				gooObjectsToDelete.forEach(gooObject -> flowerBlockEntity.goo.remove(gooObject));
			}

			// Updates the blockstate depletion value
			int depletionValue = (int)Math.ceil(12f - (12f / flowerBlockEntity.maxPollen) * flowerBlockEntity.pollen);
			if(blockState.get(FlowerBlock.DEPLETION) != depletionValue) {
				world.setBlockState(blockPos, blockState.with(FlowerBlock.DEPLETION, depletionValue >= 0 && depletionValue <= 12 ? depletionValue : 0));
			}

			// Finds the highest goo duration
			double maxDuration = flowerBlockEntity.goo.stream().mapToDouble(GooObject::getDuration).max().orElse(0);

			// Updates the blockstate goo value
			int gooValue = (int)Math.ceil(8f * maxDuration);
			if(blockState.get(FlowerBlock.GOO) != gooValue) {
				world.setBlockState(blockPos, blockState.with(FlowerBlock.GOO, Math.max(gooValue, 0)));
			}

			// Updates the max pollen based on the level of the flower
			if(flowerBlockEntity.maxPollen != 15 + 15 * (blockState.get(FlowerBlock.LEVEL) + 1)) {
				flowerBlockEntity.setMaxPollen(15 + 15 * (blockState.get(FlowerBlock.LEVEL) + 1));
			}
		}
	}
}
