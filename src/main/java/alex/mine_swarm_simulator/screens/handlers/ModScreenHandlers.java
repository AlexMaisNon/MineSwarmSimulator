package alex.mine_swarm_simulator.screens.handlers;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.screens.BeequipCaseScreen;
import alex.mine_swarm_simulator.screens.StickerBookScreen;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
	public static ScreenHandlerType<BeequipCaseScreenHandler> BEEQUIP_CASE_SCREEN_HANDLER = registerScreenHandler("beequip_case_screen_handler", new ExtendedScreenHandlerType<>(BeequipCaseScreenHandler::new, ItemStack.PACKET_CODEC), BeequipCaseScreen::new);
	public static ScreenHandlerType<StickerBookScreenHandler> STICKER_BOOK_SCREEN_HANDLER = registerScreenHandler("sticker_book_screen_handler", new ExtendedScreenHandlerType<>(StickerBookScreenHandler::new, ItemStack.PACKET_CODEC), StickerBookScreen::new);

	public static <T extends ScreenHandler, D, U extends Screen & ScreenHandlerProvider<T>> ScreenHandlerType<T> registerScreenHandler(String name, ExtendedScreenHandlerType<T, D> extendedScreenHandlerType, HandledScreens.Provider<T, U> screen) {
		ScreenHandlerType<T> screenHandlerType = Registry.register(Registries.SCREEN_HANDLER, Identifier.of(MineSwarmSimulator.MOD_ID, name), extendedScreenHandlerType);
		HandledScreens.register(screenHandlerType, screen);
		return screenHandlerType;
	}

	public static void registerScreenHandlers() {
		MineSwarmSimulator.LOGGER.info("Registered Screen Handlers for " + MineSwarmSimulator.MOD_ID);
	}
}
