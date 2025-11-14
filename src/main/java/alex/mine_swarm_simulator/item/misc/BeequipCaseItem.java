package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.screens.handlers.BeequipCaseScreenHandler;
import alex.mine_swarm_simulator.component.InventoryComponent;
import alex.mine_swarm_simulator.component.ModComponents;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class BeequipCaseItem extends Item implements ExtendedScreenHandlerFactory<ItemStack> {
	public BeequipCaseItem() {
		super(new Item.Settings().maxCount(1).component(ModComponents.INVENTORY_COMPONENT, new InventoryComponent(new ArrayList<>(), 5)));
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		// open the beequip case inventory screen
		user.openHandledScreen(this);
		return super.use(world, user, hand);
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
