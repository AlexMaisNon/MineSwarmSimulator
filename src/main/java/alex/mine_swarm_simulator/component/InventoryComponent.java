package alex.mine_swarm_simulator.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public record InventoryComponent(List<Item> items, int size) {
	public static final Codec<InventoryComponent> CODEC = RecordCodecBuilder.create(builder -> builder.group(
		Item.CODEC.listOf().fieldOf("items").forGetter(InventoryComponent::items),
		Codec.INT.fieldOf("size").forGetter(InventoryComponent::size)
	).apply(builder, InventoryComponent::new));

	public Inventory createInventory() {
		Inventory inventory = new SimpleInventory(this.size);
		this.items.forEach(item -> {
			inventory.setStack(item.slot(), item.stack());
		});
		return inventory;
	}

	public InventoryComponent syncInventory(Inventory inventory) {
		List<Item> itemList = new ArrayList<>();
		for(int i = 0; i < inventory.size(); i++) {
			if(!inventory.getStack(i).isEmpty()) {
				itemList.add(new Item(inventory.getStack(i), i));
			}
		}
		return new InventoryComponent(itemList, this.size);
	}

	public record Item(ItemStack stack, int slot) {
		public static final Codec<Item> CODEC = RecordCodecBuilder.create(builder -> builder.group(
			ItemStack.UNCOUNTED_CODEC.fieldOf("Item").forGetter(Item::stack),
			Codec.INT.fieldOf("Slot").forGetter(Item::slot)
		).apply(builder, Item::new));
	}
}
