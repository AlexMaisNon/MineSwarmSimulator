package alex.mine_swarm_simulator.screens.handlers;

import alex.mine_swarm_simulator.component.InventoryComponent;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.item.misc.StickerItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import org.jetbrains.annotations.Nullable;

public class StickerBookScreenHandler extends ScreenHandler {
	private final Inventory inventory;
	private final ItemStack currentStack;
	private final byte pages;
	private byte currentPage = 0;

	public StickerBookScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack) {
		this(ModScreenHandlers.STICKER_BOOK_SCREEN_HANDLER, syncId, playerInventory, stack);
	}

	public StickerBookScreenHandler(@Nullable ScreenHandlerType<StickerBookScreenHandler> type, int syncId, PlayerInventory playerInventory, ItemStack stack) {
		super(type, syncId);
		this.currentStack = stack;
		this.inventory = this.currentStack.get(ModComponents.INVENTORY_COMPONENT).createInventory();
		this.pages = (byte)(this.inventory.size() / 54);
		for(int i = 0; i < this.inventory.size(); i++) {
			this.addSlot(new Slot(this.inventory, i, (i % 9) * 18 + 8, ((i % 54) / 9) * 18 + 18) {
				@Override
				public boolean isEnabled() {
					return this.getIndex() >= currentPage * 54 && this.getIndex() < (currentPage + 1) * 54;
				}

				@Override
				public boolean canInsert(ItemStack stack) {
					return stack.getItem() instanceof StickerItem;
				}

				@Override
				public int getMaxItemCount() {
					return 1;
				}
			});
		}

		// Player Inventory
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 9; ++j) {
				this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 165 + i * 18));
			}
		}

		// Player Hotbar
		for(int i = 0; i < 9; ++i) {
			this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 223) {
				@Override
				public boolean canTakeItems(PlayerEntity playerEntity) {
					return !this.getStack().isOf(ModItems.STICKER_BOOK);
				}
			});
		}
	}

	public int getCurrentPage() {
		return this.currentPage;
	}

	public int getPages() {
		return this.pages;
	}

	public void previousPage() {
		this.currentPage = (byte)Math.max(0, this.currentPage - 1);
	}

	public void nextPage() {
		this.currentPage = (byte)Math.min(this.currentPage + 1, this.pages);
	}

	@Override
	public void onClosed(PlayerEntity player) {
		super.onClosed(player);
		this.currentStack.set(ModComponents.INVENTORY_COMPONENT, InventoryComponent.ofInventory(this.inventory));
	}

	@Override
	public ItemStack quickMove(PlayerEntity player, int slot) {
		ItemStack itemStack = ItemStack.EMPTY;
		Slot slot2 = this.slots.get(slot);
		if(slot2.hasStack()) {
			ItemStack itemStack2 = slot2.getStack();
			itemStack = itemStack2.copy();
			int inventorySize = this.currentStack.get(ModComponents.INVENTORY_COMPONENT).size();

			// Transfer container -> player
			if(slot < inventorySize) {
				if(!this.insertItem(itemStack2, inventorySize, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
			// Transfer player -> container
			} else if(!this.insertItem(itemStack2, 0, inventorySize, false)) {
				return ItemStack.EMPTY;
			}

			if(itemStack2.isEmpty()) {
				slot2.setStack(ItemStack.EMPTY);
			} else {
				slot2.markDirty();
			}
		}
		return itemStack;
	}

	@Override
	public boolean canUse(PlayerEntity player) {
		return inventory.canPlayerUse(player);
	}
}
