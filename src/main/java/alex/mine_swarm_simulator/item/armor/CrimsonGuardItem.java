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

public class CrimsonGuardItem extends ModelTrinketItem {
	public CrimsonGuardItem() {
		super(
			new Item.Settings().component(
				ModComponents.PASSIVES_COMPONENT,
				new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.FOCUS_PULSER}))
			),
			"left_guard",
			ArmorModelHandler.CRIMSON_GUARD,
			"textures/models/armor/crimson_guard.png"
		);
	}

	@Override
	public Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, Identifier slotIdentifier) {
		Multimap<RegistryEntry<EntityAttribute>, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, slotIdentifier);
		modifiers.put(ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "crimson_guard.capacity"),
			250000d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_RED_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "crimson_guard.red_pollen"),
			0.5d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_RED_BOMB_POLLEN, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "crimson_guard.red_bomb_pollen"),
			0.2d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "crimson_guard.defense"),
			0.1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_CRITICAL_CHANCE, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "crimson_guard.critical_chance"),
			0.1d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		modifiers.put(ModAttributes.PLAYER_RED_BEE_ATTACK, new EntityAttributeModifier(
			Identifier.of(MineSwarmSimulator.MOD_ID, "crimson_guard.red_bee_attack"),
			3d,
			EntityAttributeModifier.Operation.ADD_VALUE
		));
		return modifiers;
	}
}
