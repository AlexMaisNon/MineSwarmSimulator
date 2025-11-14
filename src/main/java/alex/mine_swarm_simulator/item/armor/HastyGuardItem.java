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
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class HastyGuardItem extends ModelTrinketItem {
	public HastyGuardItem() {
		super(new Item.Settings(), "right_guard", ArmorModelHandler.RIGHT_GUARD, "textures/models/armor/hasty_guard.png");
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "hasty_guard.capacity"),
			15000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BEE_MOVESPEED, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "hasty_guard.bee_movespeed"),
			0.01d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "hasty_guard.movement_speed"),
			0.1d,
			EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
		));
		return modifiers;
	}
}
