package alex.mine_swarm_simulator.block;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import alex.mine_swarm_simulator.block.entity.HiveBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
	public static final BlockEntityType<FlowerBlockEntity> FLOWER_BLOCK_ENTITY = registerBlockEntity("flower", FlowerBlockEntity::new, ModBlocks.FLOWER_BLOCK);
	public static final BlockEntityType<HiveBlockEntity> HIVE_BLOCK_ENTITY = registerBlockEntity("hive", HiveBlockEntity::new, ModBlocks.HIVE_SLOT);

	private static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String name, BlockEntityType.BlockEntityFactory<? extends T> entityFactory, Block block) {
		Identifier id = Identifier.of(MineSwarmSimulator.MOD_ID, name);
		return Registry.register(Registries.BLOCK_ENTITY_TYPE, id, BlockEntityType.Builder.<T>create(entityFactory, block).build());
	}

	public static void registerModBlockEntities() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Blocks for " + MineSwarmSimulator.MOD_ID);
	}
}
