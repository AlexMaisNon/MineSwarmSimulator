package alex.mine_swarm_simulator.item.armor;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.armor.ArmorModelHandler;
import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.item.ModelTrinketItem;
import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class LookerGuardItem extends ModelTrinketItem {
	public LookerGuardItem() {
		super(new Item.Settings(), "left_guard", ArmorModelHandler.LEFT_GUARD, "textures/models/armor/looker_guard.png");
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "looker_guard.capacity"),
			15000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_CRITICAL_CHANCE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "looker_guard.critical_chance"),
			0.01d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_CRITICAL_POWER, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "looker_guard.critical_power"),
			0.25d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		return modifiers;
	}
}
