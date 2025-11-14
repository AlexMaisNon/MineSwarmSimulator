package alex.mine_swarm_simulator.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

@Mixin(AbstractInventoryScreen.class)
public class AbstractInventoryScreenMixin {

	/**
	 * @author AlexMaisNon
	 * @reason Overwrites the status effect text to match Bee Swarm's.
	 */
	@Overwrite()
	private Text getStatusEffectDescription(StatusEffectInstance statusEffect) {
		MutableText mutableText = statusEffect.getEffectType().value().getName().copy();
		if(statusEffect.getAmplifier() >= 0) {
			MutableText text = mutableText.append(ScreenTexts.SPACE);
			text.append(Text.literal("(x" + (statusEffect.getAmplifier() + 1) + ")"));
			// text.append(Text.literal(statusEffect.getAmplifier() + " / " + statusEffect.getDuration() + "%"));
		}
		return mutableText;
	}
}