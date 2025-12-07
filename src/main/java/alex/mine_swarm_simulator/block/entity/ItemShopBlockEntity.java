package alex.mine_swarm_simulator.block.entity;

import alex.mine_swarm_simulator.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class ItemShopBlockEntity extends BlockEntity {
	private static final byte MAX_BOUGHT_LIST_SIZE = 64;

	private Item shopItem = Items.AIR;
	private long itemPrice = 0L;
	private Map<Item, Integer> materials = new HashMap<>();
	private Set<UUID> boughtList = new HashSet<>();

	public ItemShopBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlockEntities.ITEM_SHOP_BLOCK_ENTITY, pos, state);
	}

	public Item getShopItem() {
		return this.shopItem;
	}

	public long getItemPrice() {
		return this.itemPrice;
	}

	public Map<Item, Integer> getMaterials() {
		return this.materials;
	}

	public Set<UUID> getBoughtList() {
		return this.boughtList;
	}

	public void addUUIDToBoughtList(UUID uuid) {
		this.boughtList.add(uuid);

		if(this.boughtList.size() > MAX_BOUGHT_LIST_SIZE) {
			Iterator<UUID> iterator = this.boughtList.iterator();
			if(iterator.hasNext()) {
				iterator.next();
				iterator.remove();
			}
		}
		markDirty();
	}

	@Override
	public @Nullable Packet<ClientPlayPacketListener> toUpdatePacket() {
		return BlockEntityUpdateS2CPacket.create(this);
	}

	@Override
	public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
		return createNbt(registryLookup);
	}

	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		NbtCompound shopCompound = nbt.getCompound("Shop");

		Identifier itemId = Identifier.trySplitOn(shopCompound.getString("Item"), ':');
		this.shopItem = itemId == null ? Items.AIR : Registries.ITEM.get(itemId);

		this.itemPrice = shopCompound.getLong("Price");

		if(shopCompound.contains("Materials")) {
			this.materials = new HashMap<>();
			NbtList materialList = shopCompound.getList("Materials", NbtElement.COMPOUND_TYPE);

			materialList.forEach(material -> {
				if(material instanceof NbtCompound materialCompound) {
					Identifier materialId = Identifier.trySplitOn(materialCompound.getString("Item"), ':');
					if(itemId != null && Registries.ITEM.get(materialId) != Items.AIR) {
						this.materials.put(Registries.ITEM.get(materialId), materialCompound.getInt("Quantity"));
					}
				}
			});
		}
		if(shopCompound.contains("Bought")) {
			this.boughtList = new HashSet<>();
			NbtList boughtList = shopCompound.getList("Bought", NbtElement.INT_ARRAY_TYPE);

			boughtList.forEach(uuid -> this.boughtList.add(NbtHelper.toUuid(uuid)));
		}
	}

	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		NbtCompound shopCompound = new NbtCompound();

		if(!this.shopItem.equals(Items.AIR)) {
			shopCompound.putString("Item", this.shopItem.toString());
		}
		shopCompound.putLong("Price", this.itemPrice);

		if(!this.materials.isEmpty()) {
			NbtList materialList = new NbtList();
			this.materials.forEach((item, price) -> {
				if(!item.equals(Items.AIR)) {
					NbtCompound materialCompound = new NbtCompound();
					materialCompound.putString("Item", item.toString());
					materialCompound.putInt("Quantity", price);
					materialList.add(materialCompound);
				}
			});
			shopCompound.put("Materials", materialList);
		}
		if(!this.boughtList.isEmpty()) {
			NbtList playerList = new NbtList();
			this.boughtList.forEach(uuid -> {
				playerList.add(NbtHelper.fromUuid(uuid));
			});
			shopCompound.put("Bought", playerList);
		}

		nbt.put("Shop", shopCompound);
	}
}
