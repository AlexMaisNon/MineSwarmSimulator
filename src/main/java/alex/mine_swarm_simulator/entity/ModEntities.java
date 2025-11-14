package alex.mine_swarm_simulator.entity;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
	public static final EntityType<GumdropEntity> GUMDROP = Registry.register(
		Registries.ENTITY_TYPE,
		Identifier.of(MineSwarmSimulator.MOD_ID, "gumdrop"),
		EntityType.Builder.create(GumdropEntity::new, SpawnGroup.MISC).dimensions(1f, 1f).build()
	);
	public static final EntityType<BeeEntity> BEE = Registry.register(
		Registries.ENTITY_TYPE,
		Identifier.of(MineSwarmSimulator.MOD_ID, "bee"),
		EntityType.Builder.create(BeeEntity::new, SpawnGroup.CREATURE).dimensions(1f, 1f).build()
	);

	public static void registerModEntities() {
		FabricDefaultAttributeRegistry.register(BEE, BeeEntity.createBeeAttributes());
		MineSwarmSimulator.LOGGER.info("Registering Mod Entities for " + MineSwarmSimulator.MOD_ID);
	}
}
