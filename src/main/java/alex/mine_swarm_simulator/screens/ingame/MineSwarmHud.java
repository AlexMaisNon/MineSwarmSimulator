package alex.mine_swarm_simulator.screens.ingame;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.data.PlayerData;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import alex.mine_swarm_simulator.MineSwarmSimulatorClient;

import java.util.Locale;

@Environment(EnvType.CLIENT)
public class MineSwarmHud implements HudRenderCallback {
	private static final Identifier VALUE_BAR = Identifier.of(MineSwarmSimulator.MOD_ID, "textures/gui/hud/value_bar.png");
	private static final Identifier CAPACITY_BAR = Identifier.of(MineSwarmSimulator.MOD_ID, "textures/gui/hud/capacity_bar.png");

	@Override
	public void onHudRender(DrawContext drawContext, RenderTickCounter renderTickCounter) {
		MinecraftClient client = MinecraftClient.getInstance();
		if(client != null && client.player != null) {
			int windowWidth = drawContext.getScaledWindowWidth();

			// Draws the bars on top of the screen
			RenderSystem.enableBlend();
			drawContext.drawTexture(VALUE_BAR, windowWidth / 2 - 200, 10, 0, 0, 182, 22, 182, 22);
			drawContext.drawTexture(VALUE_BAR, windowWidth / 2 + 18, 10, 0, 0, 182, 22, 182, 22);
			RenderSystem.disableBlend();

			// Draws the Honey and Pollen texts
			Text honeyTitle = Text.translatable("hud.mine_swarm_simulator.honey_title");
			Text pollenTitle = Text.translatable("hud.mine_swarm_simulator.pollen_title");
			drawContext.drawText(client.textRenderer, honeyTitle, (windowWidth / 2 - 182) - client.textRenderer.getWidth(honeyTitle) / 2, 18, 0x1B2A35, false);
			drawContext.drawText(client.textRenderer, pollenTitle, (windowWidth / 2 + 36) - client.textRenderer.getWidth(pollenTitle) / 2, 18, 0x1B2A35, false);

			// Draws the capacity bar
			PlayerData currentPlayerData = MineSwarmSimulatorClient.getClientPlayerData(client.player);
			if(currentPlayerData != null) {
				if(currentPlayerData.capacity > 0) {
					drawContext.setShaderColor(
						(float) (0.671 * Math.pow((double) currentPlayerData.pollen / currentPlayerData.capacity, 3) + 0.329),
						(float) (-0.925 * Math.pow((double) currentPlayerData.pollen / currentPlayerData.capacity, 3) + 0.925),
						(float) (-0.561 * Math.pow((double) currentPlayerData.pollen / currentPlayerData.capacity, 3) + 0.561),
						1f);
					drawContext.drawTexture(CAPACITY_BAR, windowWidth / 2 + 54, 13, 0, 0, Math.min(Math.round(138 * ((float) currentPlayerData.pollen / currentPlayerData.capacity)), 138), 16, 138, 16);
					drawContext.setShaderColor(1f, 1f, 1f, 1f);
				}

				// Draws the quantity of honey and pollen
				String[] languageInfo = client.getLanguageManager().getLanguage().split("_");
				Locale locale = Locale.of(languageInfo[0], languageInfo[1]);
				drawContext.drawText(client.textRenderer, String.format(locale, "%,d", currentPlayerData.honey), windowWidth / 2 - 160, 18, 0xF8DC7D, true);
				drawContext.drawText(client.textRenderer, String.format(locale, "%,d", currentPlayerData.pollen) + "/" + String.format(locale, "%,d", currentPlayerData.capacity), windowWidth / 2 + 58, 18, 0xFFFFFF, true);
			}
		}
	}
}
