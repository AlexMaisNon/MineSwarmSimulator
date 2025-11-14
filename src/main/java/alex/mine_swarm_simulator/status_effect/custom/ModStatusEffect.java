package alex.mine_swarm_simulator.status_effect.custom;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModStatusEffect extends StatusEffect {
	private final Identifier identifier;
	private final Identifier modifierIdentifier;
	private final List<ModStatusModifier> customModifiers = new ArrayList<>();

	public ModStatusEffect(String name, StatusEffectCategory statusEffectCategory, int color) {
		super(statusEffectCategory, color);
		this.identifier = Identifier.of(MineSwarmSimulator.MOD_ID, name);
		this.modifierIdentifier = Identifier.of(MineSwarmSimulator.MOD_ID, name + "_status_effect");
	}

	public ModStatusEffect(String name, StatusEffectCategory statusEffectCategory, int color, ModStatusModifier[] attributes) {
		super(statusEffectCategory, color);
		this.identifier = Identifier.of(MineSwarmSimulator.MOD_ID, name);
		this.modifierIdentifier = Identifier.of(MineSwarmSimulator.MOD_ID, name + "_status_effect");
		for(ModStatusModifier modStatusModifier : attributes) {
			if(modStatusModifier.getStatic() || modStatusModifier.hasStartingValue()) {
				this.customModifiers.add(modStatusModifier);
			} else {
				this.addAttributeModifier(modStatusModifier.getAttribute(), this.modifierIdentifier, modStatusModifier.getAmount(), modStatusModifier.getOperation());
			}
		}
	}

	public Identifier getIdentifier() {
		return this.identifier;
	}

	@Override
	public void onApplied(AttributeContainer attributeContainer, int amplifier) {
		super.onApplied(attributeContainer, amplifier);
		this.customModifiers.forEach(modStatusModifier -> {
			EntityAttributeInstance entityAttributeInstance = attributeContainer.getCustomInstance(modStatusModifier.getAttribute());
			if(entityAttributeInstance != null) {
				entityAttributeInstance.removeModifier(this.modifierIdentifier);
				entityAttributeInstance.addPersistentModifier(modStatusModifier.createModifier(this.modifierIdentifier, amplifier));
			}
		});
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		// tick based for time based effects ?
		return super.canApplyUpdateEffect(duration, amplifier);
	}

	@Override
	public void onRemoved(AttributeContainer attributeContainer) {
		super.onRemoved(attributeContainer);
		this.customModifiers.forEach(modStatusModifier -> {
			EntityAttributeInstance entityAttributeInstance = attributeContainer.getCustomInstance(modStatusModifier.getAttribute());
			if(entityAttributeInstance != null) {
				entityAttributeInstance.removeModifier(this.modifierIdentifier);
			}
		});
	}
}