package alex.mine_swarm_simulator.item.armor;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.armor.ArmorModelHandler;
import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.component.Passives;
import alex.mine_swarm_simulator.component.PassivesComponent;
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

import java.util.List;

public class CobaltGuardItem extends ModelTrinketItem {
	public CobaltGuardItem() {
		super(
			new Item.Settings().component(
				ModComponents.PASSIVES_COMPONENT,
				new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.HASTE_PULSER}))
			),
			"right_guard",
			ArmorModelHandler.COBALT_GUARD,
			"textures/models/armor/cobalt_guard.png"
		);
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "cobalt_guard.capacity"),
			250000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BLUE_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "cobalt_guard.blue_pollen"),
			0.5d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BLUE_BOMB_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "cobalt_guard.blue_bomb_pollen"),
			0.2d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "cobalt_guard.defense"),
			0.1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_CRITICAL_POWER, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "cobalt_guard.critical_power"),
			1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_BLUE_BEE_ATTACK, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "cobalt_guard.blue_bee_attack"),
			3d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		return modifiers;
	}
}
