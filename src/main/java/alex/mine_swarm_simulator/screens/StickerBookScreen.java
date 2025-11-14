package alex.mine_swarm_simulator.screens;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.screens.handlers.StickerBookScreenHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class StickerBookScreen extends HandledScreen<StickerBookScreenHandler> {
	private static final Identifier STICKER_BOOK_GUI = Identifier.of(MineSwarmSimulator.MOD_ID, "textures/gui/sticker_book.png");
	private static final Identifier SLOT_GUI = Identifier.of(MineSwarmSimulator.MOD_ID, "textures/gui/sticker_slot.png");
	private final ButtonWidget pageLeft = ButtonWidget.builder(
			Text.translatable("screen.mine_swarm_simulator.sticker_book.previous_page"),
			button -> this.handler.previousPage()
		)
		.size(20, 20)
		.tooltip(Tooltip.of(Text.translatable("screen.mine_swarm_simulator.sticker_book.previous_page.tooltip")))
		.build();
	private final ButtonWidget pageRight = ButtonWidget.builder(
			Text.translatable("screen.mine_swarm_simulator.sticker_book.next_page"),
			button -> this.handler.nextPage()
		)
		.size(20, 20)
		.tooltip(Tooltip.of(Text.translatable("screen.mine_swarm_simulator.sticker_book.next_page.tooltip")))
		.build();

	public StickerBookScreen(StickerBookScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
		this.backgroundHeight = 246;
		this.playerInventoryTitleY = 154;
	}

	@Override
	protected void init() {
		super.init();
		int x = (this.width - this.backgroundWidth) / 2;
		int y = (this.height - this.backgroundHeight) / 2;
		this.pageLeft.setPosition(x + 7, y + 130);
		this.pageRight.setPosition(x + 150, y + 130);

		this.pageLeft.active = false;
		this.pageRight.active = false;

		this.addDrawableChild(pageLeft);
		this.addDrawableChild(pageRight);
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY, float delta) {
		super.render(context, mouseX, mouseY, delta);

		int x = (this.width - this.backgroundWidth) / 2;
		int y = (this.height - this.backgroundHeight) / 2;

		this.drawMouseoverTooltip(context, mouseX, mouseY);

		this.pageLeft.active = this.handler.getCurrentPage() > 0;
		this.pageRight.active = this.handler.getCurrentPage() < this.handler.getPages();

		MinecraftClient client = MinecraftClient.getInstance();
		Text pageText = Text.translatable("screen.mine_swarm_simulator.sticker_book.page", this.handler.getCurrentPage() + 1, this.handler.getPages() + 1);

		context.drawText(client.textRenderer, pageText, x + 88 - client.textRenderer.getWidth(pageText) / 2, y + 136, 4210752, false);
	}

	@Override
	protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
		int x = (this.width - this.backgroundWidth) / 2;
		int y = (this.height - this.backgroundHeight) / 2;
		context.drawTexture(STICKER_BOOK_GUI, x, y, 0, 0, this.backgroundWidth, 256);

		for(int i = handler.getCurrentPage() * 54; i < handler.slots.size() - 36 && i < (handler.getCurrentPage() + 1) * 54; i++) {
			context.drawTexture(SLOT_GUI, (i % 9) * 18 + x + 7, ((i % 54) / 9) * 18 + y + 17, 0, 0, 18, 18, 18, 18);
		}
	}
}
