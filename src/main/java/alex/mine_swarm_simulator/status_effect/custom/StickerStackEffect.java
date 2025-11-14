package alex.mine_swarm_simulator.status_effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;

public class StickerStackEffect extends ModStatusEffect {
	public StickerStackEffect() {
		super("sticker_stack", StatusEffectCategory.BENEFICIAL, 0xE0E2E6);
	}

	@Override
	public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
		// custom things here for sticker stack
		return super.applyUpdateEffect(entity, amplifier);
	}
}
