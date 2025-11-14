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

public class EliteRedGuardItem extends ModelTrinketItem {
	public EliteRedGuardItem() {
		super(new Item.Settings(), "left_guard", ArmorModelHandler.ELITE_RED_GUARD, "textures/models/armor/elite_red_guard.png");
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "elite_red_guard.capacity"),
			75000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_RED_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "elite_red_guard.red_pollen"),
			0.25d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "elite_red_guard.defense"),
			0.07d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_CRITICAL_CHANCE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "elite_red_guard.critical_chance"),
			0.05d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_RED_BEE_ATTACK, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "elite_red_guard.red_bee_attack"),
			1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		return modifiers;
	}
}
