package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.block.custom.HiveBlock;
import alex.mine_swarm_simulator.block.entity.HiveSlotBlockEntity;
import alex.mine_swarm_simulator.component.InventoryComponent;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.screens.handlers.StickerBookScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class StickerBookItem extends Item implements ExtendedScreenHandlerFactory<ItemStack> {
	public StickerBookItem() {
		super(new Settings().maxCount(1).component(ModComponents.INVENTORY_COMPONENT, new InventoryComponent(new ArrayList<>(), 16)));
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		// Opens the sticker book inventory screen

		// Opens the beequip case inventory screen only if the user can't get the hive skin from the Hive BLock
		BlockHitResult hitResult = (BlockHitResult)user.raycast(5, 0, false);
		BlockState blockState = world.getBlockState(hitResult.getBlockPos());

		if((!blockState.isOf(ModBlocks.HIVE_BLOCK) && !blockState.isOf(ModBlocks.HIVE_BLOCK_SLAB)) || blockState.get(HiveBlock.SKIN) == 0 || !user.isSneaking()) {
			user.openHandledScreen(this);
		}
		return super.use(world, user, hand);
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		if(context.getPlayer() != null && context.getPlayer().isSneaking()) {
			BlockState blockState = context.getWorld().getBlockState(context.getBlockPos());
			if((blockState.isOf(ModBlocks.HIVE_BLOCK) || blockState.isOf(ModBlocks.HIVE_BLOCK_SLAB)) && blockState.get(HiveBlock.SKIN) > 0) {
				boolean inserted = false;
				int i = 0;

				ItemStack itemStack = new ItemStack(HiveBlock.ITEM_TO_SKIN[blockState.get(HiveBlock.SKIN) - 1]);

				Inventory inv = context.getStack().get(ModComponents.INVENTORY_COMPONENT).createInventory();

				while(i < inv.size() && !inserted) {
					if(inv.getStack(i).isEmpty()) {
						inv.setStack(i, itemStack);
						inserted = true;
					}
					i++;
				}

				if(inserted) {
					context.getStack().set(ModComponents.INVENTORY_COMPONENT, InventoryComponent.ofInventory(inv));
				} else {
					context.getPlayer().giveItemStack(itemStack);
				}

				HiveBlock.changeSkin(0, blockState, context.getWorld(), context.getBlockPos(), new ArrayList<>());

				return ActionResult.SUCCESS;
			}
		}
		return ActionResult.PASS;
	}

	@Override
	public ItemStack getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
		return serverPlayerEntity.getMainHandStack();
	}

	@Override
	public Text getDisplayName() {
		return MinecraftClient.getInstance().player.getMainHandStack().getName();
	}

	@Nullable
	@Override
	public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
		return new StickerBookScreenHandler(syncId, playerInventory, player.getMainHandStack());
	}
}
