package alex.mine_swarm_simulator.status_effect.custom;

import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModStatusModifier {
	private final RegistryEntry<EntityAttribute> attribute;
	private final double amount;
	private final EntityAttributeModifier.Operation operation;
	private final double startingValue;
	private final boolean isStatic;

	public ModStatusModifier(RegistryEntry<EntityAttribute> attribute, double amount, EntityAttributeModifier.Operation operation) {
		this.attribute = attribute;
		this.amount = amount;
		this.operation = operation;
		this.startingValue = 0d;
		this.isStatic = false;
	}

	public ModStatusModifier(RegistryEntry<EntityAttribute> attribute, double amount, EntityAttributeModifier.Operation operation, double startingValue) {
		this.attribute = attribute;
		this.amount = amount;
		this.operation = operation;
		this.startingValue = startingValue;
		this.isStatic = false;
	}

	public ModStatusModifier(RegistryEntry<EntityAttribute> attribute, double amount, EntityAttributeModifier.Operation operation, double startingValue, boolean isStatic) {
		this.attribute = attribute;
		this.amount = amount;
		this.operation = operation;
		this.startingValue = startingValue;
		this.isStatic = isStatic;
	}

	public RegistryEntry<EntityAttribute> getAttribute() {
		return this.attribute;
	}

	public double getAmount() {
		return this.amount;
	}

	public EntityAttributeModifier.Operation getOperation() {
		return this.operation;
	}

	public boolean getStatic() {
		return this.isStatic;
	}

	public boolean hasStartingValue() {
		return this.startingValue > 0;
	}

	public EntityAttributeModifier createModifier(Identifier statusEffectIdentifier, int statusEffectAmplifier) {
		return new EntityAttributeModifier(statusEffectIdentifier, this.isStatic ? this.startingValue : this.startingValue + (this.amount * (statusEffectAmplifier + 1)), this.operation);
	}
}