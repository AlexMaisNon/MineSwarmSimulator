package alex.mine_swarm_simulator.screens;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.screens.handlers.BeequipCaseScreenHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BeequipCaseScreen extends HandledScreen<BeequipCaseScreenHandler> {
	private static final Identifier BEEQUIP_CASE_GUI = Identifier.of(MineSwarmSimulator.MOD_ID, "textures/gui/beequip_case.png");
	private static final Identifier SLOT_GUI = Identifier.of(MineSwarmSimulator.MOD_ID, "textures/gui/beequip_slot.png");

	public BeequipCaseScreen(BeequipCaseScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
	}

	@Override
	public void render(DrawContext context, int mouseX, int mouseY, float delta) {
		super.render(context, mouseX, mouseY, delta);
		this.drawMouseoverTooltip(context, mouseX, mouseY);
	}

	@Override
	protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
		int x = (this.width - this.backgroundWidth) / 2;
		int y = (this.height - this.backgroundHeight) / 2;
		context.drawTexture(BEEQUIP_CASE_GUI, x, y, 0, 0, this.backgroundWidth, this.backgroundHeight);

		for(byte i = 0; i < handler.slots.size() - 36; i++) {
			context.drawTexture(SLOT_GUI, (i % 5) * 18 + x + 42, (i / 5) * 18 + y + 16, 0, 0, 18, 18, 18, 18);
		}
	}
}
