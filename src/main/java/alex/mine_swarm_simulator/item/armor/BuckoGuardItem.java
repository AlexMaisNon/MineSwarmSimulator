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

public class BuckoGuardItem extends ModelTrinketItem {
	public BuckoGuardItem() {
		super(new Item.Settings(), "right_guard", ArmorModelHandler.BUCKO_GUARD, "textures/models/armor/bucko_guard.png");
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bucko_guard.capacity"),
			150000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BLUE_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bucko_guard.blue_pollen"),
			0.35d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BLUE_BOMB_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bucko_guard.blue_bomb_pollen"),
			0.1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bucko_guard.defense"),
			0.1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_CRITICAL_POWER, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bucko_guard.critical_power"),
			0.75d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BLUE_BEE_ATTACK, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "bucko_guard.blue_bee_attack"),
			2d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		return modifiers;
	}
}
