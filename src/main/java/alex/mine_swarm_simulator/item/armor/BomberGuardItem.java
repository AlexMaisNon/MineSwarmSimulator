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

public class BomberGuardItem extends ModelTrinketItem {
	public BomberGuardItem() {
		super(new Item.Settings(), "left_guard", ArmorModelHandler.LEFT_GUARD, "textures/models/armor/bomber_guard.png");
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bomber_guard.capacity"),
			15000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_WHITE_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bomber_guard.white_pollen"),
			0.05d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BOMB_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bomber_guard.bomb_pollen"),
			0.15d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		return modifiers;
	}
}
