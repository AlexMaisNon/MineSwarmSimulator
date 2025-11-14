package alex.mine_swarm_simulator.block;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.custom.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

	// Sprinklers
	public static final Block BASIC_SPRINKLER = registerBlock("basic_sprinkler", new SprinklerBlock(AbstractBlock.Settings.create()), 1);
	public static final Block SILVER_SOAKERS = registerBlock("silver_soakers", new SprinklerBlock(AbstractBlock.Settings.create()), 2);
	public static final Block GOLDEN_GUSHERS = registerBlock("golden_gushers", new SprinklerBlock(AbstractBlock.Settings.create()), 3);
	public static final Block DIAMOND_DRENCHERS = registerBlock("diamond_drenchers", new SprinklerBlock(AbstractBlock.Settings.create()), 4);
	public static final Block SUPREME_SATURATOR = registerBlock("supreme_saturator", new SprinklerBlock(AbstractBlock.Settings.create()), 1);

	// Shop Blocks
	public static final Block BASIC_EGG_SHOP = registerBlock("basic_egg_shop", new ShopBlock(AbstractBlock.Settings.create()));
	public static final Block GUMDROP_SHOP = registerBlock("gumdrop_shop", new ShopBlock(AbstractBlock.Settings.create()));
	public static final Block MAGIC_BEAN_SHOP = registerBlock("magic_bean_shop", new ShopBlock(AbstractBlock.Settings.create()));
	public static final Block ROYAL_JELLY_SHOP = registerBlock("royal_jelly_shop", new ShopBlock(AbstractBlock.Settings.create()));
	public static final Block STINGER_SHOP = registerBlock("stinger_shop", new ShopBlock(AbstractBlock.Settings.create()));
	public static final Block TICKET_SHOP = registerBlock("ticket_shop", new ShopBlock(AbstractBlock.Settings.create()));
	public static final Block TREAT_SHOP = registerBlock("treat_shop", new ShopBlock(AbstractBlock.Settings.create()));

	// Misc.
	public static final Block HIVE_SLOT = registerBlock("hive_slot", new HiveBlock(AbstractBlock.Settings.create()));
	public static final Block FLOWER_BLOCK = registerBlock("flower_block", new FlowerBlock(AbstractBlock.Settings.create()));


	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(MineSwarmSimulator.MOD_ID, name), block);
	}

	// Can specify stack count if wanted (only used for sprinklers btw)
	private static Block registerBlock(String name, Block block, int maxCount) {
		registerBlockItem(name, block, maxCount);
		return Registry.register(Registries.BLOCK, Identifier.of(MineSwarmSimulator.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, Identifier.of(MineSwarmSimulator.MOD_ID, name), new BlockItem(block, new Item.Settings()));
	}

	// Can specify stack count if wanted (only used for sprinklers btw)
	private static Item registerBlockItem(String name, Block block, int maxCount) {
		return Registry.register(Registries.ITEM, Identifier.of(MineSwarmSimulator.MOD_ID, name), new BlockItem(block, new Item.Settings().maxCount(maxCount)));
	}

	public static void registerModBlocks() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Blocks for " + MineSwarmSimulator.MOD_ID);
	}
}
