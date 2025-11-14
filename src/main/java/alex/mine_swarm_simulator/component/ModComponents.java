package alex.mine_swarm_simulator.component;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModComponents {
	public static final ComponentType<InventoryComponent> INVENTORY_COMPONENT = registerComponent("inventory", ComponentType.<InventoryComponent>builder().codec(InventoryComponent.CODEC).build());
	public static final ComponentType<PassivesComponent> PASSIVES_COMPONENT = registerComponent("passives", ComponentType.<PassivesComponent>builder().codec(PassivesComponent.CODEC).build());

	public static <T> ComponentType<T> registerComponent(String name, ComponentType<T> type) {
		return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(MineSwarmSimulator.MOD_ID, name), type);
	}

	public static void registerModComponents() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Components for " + MineSwarmSimulator.MOD_ID);
	}
}
