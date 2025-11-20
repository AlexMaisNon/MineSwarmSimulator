package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.screens.handlers.BeequipCaseScreenHandler;
import alex.mine_swarm_simulator.component.InventoryComponent;
import alex.mine_swarm_simulator.component.ModComponents;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class BeequipCaseItem extends Item implements ExtendedScreenHandlerFactory<ItemStack> {
	public BeequipCaseItem() {
		super(new Item.Settings().maxCount(1).component(ModComponents.INVENTORY_COMPONENT, new InventoryComponent(new ArrayList<>(), 5)));
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		// InventoryComponent oldComponent = user.getStackInHand(hand).get(ModComponents.INVENTORY_COMPONENT);
		// user.getStackInHand(hand).set(ModComponents.INVENTORY_COMPONENT, new InventoryComponent(oldComponent.items(), oldComponent.size() + 1));

		// Opens the beequip case inventory screen only if not looking at a hive slot
		BlockHitResult hitResult = (BlockHitResult)user.raycast(5, 0, false);
		if(!world.getBlockState(hitResult.getBlockPos()).isOf(ModBlocks.HIVE_SLOT)) {
			user.openHandledScreen(this);
		}
		return super.use(world, user, hand);
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		if(!context.getWorld().getBlockState(context.getBlockPos()).isOf(ModBlocks.HIVE_SLOT)) {}
		return super.useOnBlock(context);
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
		return new BeequipCaseScreenHandler(syncId, playerInventory, player.getMainHandStack());
	}
}
