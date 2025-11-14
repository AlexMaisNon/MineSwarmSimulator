package alex.mine_swarm_simulator.item;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	private static final ItemGroup MSS_ITEMS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.BASIC_EGG))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_items"))
		.entries((context, entries) -> {
			entries.add(ModItems.COG);
			entries.add(ModItems.TICKET);
			entries.add(ModItems.PLASTIC_EGG);
			entries.add(ModItems.GUMDROPS);
			entries.add(ModItems.COCONUT);
			entries.add(ModItems.STINGER);
			entries.add(ModItems.SNOWFLAKE);
			entries.add(ModItems.MICRO_CONVERTER);
			entries.add(ModItems.HONEYSUCKLE);
			entries.add(ModItems.WHIRLIGIG);
			entries.add(ModItems.FIELD_DICE);
			entries.add(ModItems.SMOOTH_DICE);
			entries.add(ModItems.LOADED_DICE);
			entries.add(ModItems.JELLY_BEANS);
			entries.add(ModItems.RED_EXTRACT);
			entries.add(ModItems.BLUE_EXTRACT);
			entries.add(ModItems.GLITTER);
			entries.add(ModItems.GLUE);
			entries.add(ModItems.OIL);
			entries.add(ModItems.ENZYMES);
			entries.add(ModItems.TROPICAL_DRINK);
			entries.add(ModItems.PURPLE_POTION);
			entries.add(ModItems.SUPER_SMOOTHIE);
			entries.add(ModItems.NECTAR_TESTER);
			entries.add(ModItems.MARSHMALLOW_BEE);
			entries.add(ModItems.MAGIC_BEAN);
			entries.add(ModItems.FESTIVE_BEAN);
			entries.add(ModItems.CLOUD_VIAL);
			entries.add(ModItems.NIGHT_BELL);
			entries.add(ModItems.BOX_O_FROGS);
			entries.add(ModItems.ANT_PASS);
			entries.add(ModItems.PRONGED_COG);
			entries.add(ModItems.BROKEN_DRIVE);
			entries.add(ModItems.ROBO_PASS);
			entries.add(ModItems.TRANSLATOR);
			entries.add(ModItems.SPIRIT_PETAL);
			entries.add(ModItems.PRESENT);
			entries.add(ModItems.TREAT);
			entries.add(ModItems.STAR_TREAT);
			entries.add(ModItems.ATOMIC_TREAT);
			entries.add(ModItems.SUNFLOWER_SEED);
			entries.add(ModItems.STRAWBERRY);
			entries.add(ModItems.PINEAPPLE);
			entries.add(ModItems.BLUEBERRY);
			entries.add(ModItems.BITTERBERRY);
			entries.add(ModItems.NEONBERRY);
			entries.add(ModItems.MOON_CHARM);
			entries.add(ModItems.GINGERBREAD_BEAR);
			entries.add(ModItems.AGED_GINGERBREAD_BEAR);
			entries.add(ModItems.WHITE_DRIVE);
			entries.add(ModItems.RED_DRIVE);
			entries.add(ModItems.BLUE_DRIVE);
			entries.add(ModItems.GLITCHED_DRIVE);
			entries.add(ModItems.COMFORTING_VIAL);
			entries.add(ModItems.INVIGORATING_VIAL);
			entries.add(ModItems.MOTIVATING_VIAL);
			entries.add(ModItems.REFRESHING_VIAL);
			entries.add(ModItems.SATISFYING_VIAL);
			entries.add(ModItems.NECTAR_SHOWER_VIAL);
			entries.add(ModItems.PINK_BALLON);
			entries.add(ModItems.RED_BALLON);
			entries.add(ModItems.WHITE_BALLON);
			entries.add(ModItems.BLACK_BALLON);
			entries.add(ModItems.SOFT_WAX);
			entries.add(ModItems.HARD_WAX);
			entries.add(ModItems.CAUSTIC_WAX);
			entries.add(ModItems.DEBUG_WAX);
			entries.add(ModItems.SWIRLED_WAX);
			entries.add(ModItems.TURPENTINE);
			entries.add(ModItems.BASIC_EGG);
			entries.add(ModItems.SILVER_EGG);
			entries.add(ModItems.GOLD_EGG);
			entries.add(ModItems.DIAMOND_EGG);
			entries.add(ModItems.MYTHIC_EGG);
			entries.add(ModItems.STAR_EGG);
			entries.add(ModItems.GIFTED_SILVER_EGG);
			entries.add(ModItems.GIFTED_GOLD_EGG);
			entries.add(ModItems.GIFTED_DIAMOND_EGG);
			entries.add(ModItems.GIFTED_MYTHIC_EGG);
			entries.add(ModItems.ROYAL_JELLY);
			entries.add(ModItems.STAR_JELLY);
			entries.add(ModItems.EVICTION);
		})
		.build();

	private static final ItemGroup MSS_TOOLS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.HONEY_DIPPER))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_tools"))
		.entries((context, entries) -> {
			entries.add(ModItems.SCOOPER);
			entries.add(ModItems.RAKE);
			entries.add(ModItems.CLIPPERS);
			entries.add(ModItems.MAGNET);
			entries.add(ModItems.VACUUM);
			entries.add(ModItems.SUPER_SCOOPER);
			entries.add(ModItems.PULSAR);
			entries.add(ModItems.ELECTRO_MAGNET);
			entries.add(ModItems.SCISSORS);
			entries.add(ModItems.HONEY_DIPPER);
			entries.add(ModItems.BUBBLE_WAND);
			entries.add(ModItems.SCYTHE);
			entries.add(ModItems.GOLDEN_RAKE);
			entries.add(ModItems.SPARK_STAFF);
			entries.add(ModItems.PORCELAIN_DIPPER);
			entries.add(ModItems.PETAL_WAND);
			entries.add(ModItems.DARK_SCYTHE);
			entries.add(ModItems.TIDE_POPPER);
			entries.add(ModItems.GUMMYBALLER);

			entries.add(ModBlocks.BASIC_SPRINKLER);
			entries.add(ModBlocks.SILVER_SOAKERS);
			entries.add(ModBlocks.GOLDEN_GUSHERS);
			entries.add(ModBlocks.DIAMOND_DRENCHERS);
			entries.add(ModBlocks.SUPREME_SATURATOR);
		})
		.build();

	private static final ItemGroup MSS_ACCESSORIES = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.PROPELLER_HAT))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_accessories"))
		.entries((context, entries) -> {
			entries.add(ModItems.BRAVE_GUARD);
			entries.add(ModItems.HASTY_GUARD);
			entries.add(ModItems.BOMBER_GUARD);
			entries.add(ModItems.LOOKER_GUARD);
			entries.add(ModItems.BLUE_GUARD);
			entries.add(ModItems.ELITE_BLUE_GUARD);
			entries.add(ModItems.BUCKO_GUARD);
			entries.add(ModItems.COBALT_GUARD);
			entries.add(ModItems.RED_GUARD);
			entries.add(ModItems.ELITE_RED_GUARD);
			entries.add(ModItems.RILEY_GUARD);
			entries.add(ModItems.CRIMSON_GUARD);

			entries.add(ModItems.HELMET);
			entries.add(ModItems.PROPELLER_HAT);
			entries.add(ModItems.STRANGE_GOGGLES);
			entries.add(ModItems.BEEKEEPER_MASK);
			entries.add(ModItems.HONEY_MASK);
			entries.add(ModItems.BUBBLE_MASK);
			entries.add(ModItems.FIRE_MASK);
			entries.add(ModItems.DEMON_MASK);
			entries.add(ModItems.DIAMOND_MASK);
			entries.add(ModItems.GUMMY_MASK);
			entries.add(ModItems.BBM_MASK);
			entries.add(ModItems.MONDO_BBM_MASK);

			entries.add(ModItems.BELT_POCKET);
			entries.add(ModItems.BELT_BAG);
			entries.add(ModItems.MONDO_BELT_BAG);
			entries.add(ModItems.HONEYCOMB_BELT);
			entries.add(ModItems.PETAL_BELT);
			entries.add(ModItems.COCONUT_BELT);

			entries.add(ModItems.BASIC_BOOTS);
			entries.add(ModItems.HIKING_BOOTS);
			entries.add(ModItems.BEEKEEPER_BOOTS);
			entries.add(ModItems.COCONUT_CLOGS);
			entries.add(ModItems.GUMMY_BOOTS);

			entries.add(ModItems.POUCH);
			entries.add(ModItems.JAR);
			entries.add(ModItems.BACKPACK);
			entries.add(ModItems.CANISTER);
			entries.add(ModItems.MEGA_JUG);
			entries.add(ModItems.COMPRESSOR);
			entries.add(ModItems.ELITE_BARREL);
			entries.add(ModItems.PORT_O_HIVE);
			entries.add(ModItems.RED_PORT_O_HIVE);
			entries.add(ModItems.BLUE_PORT_O_HIVE);
			entries.add(ModItems.PORCELAIN_PORT_O_HIVE);
			entries.add(ModItems.COCONUT_CANISTER);

			entries.add(ModItems.KING_BEETLE_AMULET);
			entries.add(ModItems.MOON_AMULET);
			entries.add(ModItems.BRONZE_ANT_AMULET);
			entries.add(ModItems.SILVER_ANT_AMULET);
			entries.add(ModItems.GOLD_ANT_AMULET);
			entries.add(ModItems.DIAMOND_ANT_AMULET);
			entries.add(ModItems.SUPREME_ANT_AMULET);
			entries.add(ModItems.BRONZE_STICK_BUG_AMULET);
			entries.add(ModItems.SILVER_STICK_BUG_AMULET);
			entries.add(ModItems.GOLD_STICK_BUG_AMULET);
			entries.add(ModItems.DIAMOND_STICK_BUG_AMULET);
			entries.add(ModItems.BRONZE_STAR_AMULET);
			entries.add(ModItems.SILVER_STAR_AMULET);
			entries.add(ModItems.GOLD_STAR_AMULET);
			entries.add(ModItems.DIAMOND_STAR_AMULET);
			entries.add(ModItems.SUPREME_STAR_AMULET);
			entries.add(ModItems.BRONZE_SHELL_AMULET);
			entries.add(ModItems.SILVER_SHELL_AMULET);
			entries.add(ModItems.GOLD_SHELL_AMULET);
			entries.add(ModItems.DIAMOND_SHELL_AMULET);
			entries.add(ModItems.SUPREME_SHELL_AMULET);
			entries.add(ModItems.BRONZE_COG_AMULET);
			entries.add(ModItems.SILVER_COG_AMULET);
			entries.add(ModItems.GOLD_COG_AMULET);
			entries.add(ModItems.DIAMOND_COG_AMULET);
			entries.add(ModItems.SUPREME_COG_AMULET);
		})
		.build();

	private static final ItemGroup MSS_BLOCKS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModBlocks.FLOWER_BLOCK))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_blocks"))
		.entries((context, entries) -> {
			entries.add(ModBlocks.BASIC_EGG_SHOP);
			entries.add(ModBlocks.GUMDROP_SHOP);
			entries.add(ModBlocks.MAGIC_BEAN_SHOP);
			entries.add(ModBlocks.ROYAL_JELLY_SHOP);
			entries.add(ModBlocks.STINGER_SHOP);
			entries.add(ModBlocks.TICKET_SHOP);
			entries.add(ModBlocks.TREAT_SHOP);

			entries.add(ModBlocks.HIVE_SLOT);
			entries.add(ModBlocks.FLOWER_BLOCK);
		})
		.build();

	private static final ItemGroup MSS_MOBS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.BASIC_EGG))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_mobs"))
		.entries((context, entries) -> {
			entries.add(ModItems.TICKET);
		})
		.build();

	private static final ItemGroup MSS_PLANTERS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.BASIC_EGG))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_planters"))
		.entries((context, entries) -> {
			entries.add(ModItems.TICKET);
		})
		.build();

	private static final ItemGroup MSS_BEEQUIPS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.BEEQUIP_CASE))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_beequips"))
		.entries((context, entries) -> {
			entries.add(ModItems.BEEQUIP_CASE);

			entries.add(ModItems.BEEQUIP_THIMBLE);
			entries.add(ModItems.BEEQUIP_SWEATBAND);
			entries.add(ModItems.BEEQUIP_BANDAGE);
			entries.add(ModItems.BEEQUIP_THUMBTACK);
			entries.add(ModItems.BEEQUIP_CAMO_BANDANA);
			entries.add(ModItems.BEEQUIP_BOTTLE_CAP);
			entries.add(ModItems.BEEQUIP_KAZOO);
			entries.add(ModItems.BEEQUIP_SMILEY_STICKER);
			entries.add(ModItems.BEEQUIP_WHISTLE);
			entries.add(ModItems.BEEQUIP_CHARM_BRACELET);
			entries.add(ModItems.BEEQUIP_PAPERCLIP);
			entries.add(ModItems.BEEQUIP_BERET);
			entries.add(ModItems.BEEQUIP_BANG_SNAP);
			entries.add(ModItems.BEEQUIP_BEAD_LIZARD);
			entries.add(ModItems.BEEQUIP_PINK_SHADES);
			entries.add(ModItems.BEEQUIP_LEI);
			entries.add(ModItems.BEEQUIP_DEMON_TALISMAN);
			entries.add(ModItems.BEEQUIP_CAMPHOR_LIP_BALM);
			entries.add(ModItems.BEEQUIP_AUTUMN_SUNHAT);
			entries.add(ModItems.BEEQUIP_ROSE_HEADBAND);
			entries.add(ModItems.BEEQUIP_PINK_ERASER);
			entries.add(ModItems.BEEQUIP_CANDY_RING);

			entries.add(ModItems.BEEQUIP_ELF_CAP);
			entries.add(ModItems.BEEQUIP_SINGLE_MITTEN);
			entries.add(ModItems.BEEQUIP_WARM_SCARF);
			entries.add(ModItems.BEEQUIP_PEPPERMINT_ANTENNAS);
			entries.add(ModItems.BEEQUIP_BEESMAS_TOP);
			entries.add(ModItems.BEEQUIP_PINECONE);
			entries.add(ModItems.BEEQUIP_ICICLES);
			entries.add(ModItems.BEEQUIP_BEESMAS_TREE_HAT);
			entries.add(ModItems.BEEQUIP_BUBBLE_LIGHT);
			entries.add(ModItems.BEEQUIP_SNOW_TIARA);
			entries.add(ModItems.BEEQUIP_SNOWGLOBE);
			entries.add(ModItems.BEEQUIP_REINDEER_ANTLERS);
			entries.add(ModItems.BEEQUIP_TOY_HORN);
			entries.add(ModItems.BEEQUIP_PAPER_ANGEL);
			entries.add(ModItems.BEEQUIP_TOY_DRUM);
			entries.add(ModItems.BEEQUIP_LUMP_OF_COAL);
			entries.add(ModItems.BEEQUIP_POINSETTIA);
			entries.add(ModItems.BEEQUIP_ELECTRIC_CANDLE);
			entries.add(ModItems.BEEQUIP_FESTIVE_WREATH);
		})
		.build();

	private static final ItemGroup MSS_STICKERS = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.STICKER_BOOK))
		.displayName(Text.translatable("itemgroup.mine_swarm_simulator.mss_stickers"))
		.entries((context, entries) -> {
			entries.add(ModItems.STICKER_BOOK);

			entries.add(ModItems.STICKER_BROWN_CUB_SKIN);
			entries.add(ModItems.STICKER_ROBO_CUB_SKIN);
			entries.add(ModItems.STICKER_STICK_CUB_SKIN);
			entries.add(ModItems.STICKER_STAR_CUB_SKIN);
			entries.add(ModItems.STICKER_NOOB_CUB_SKIN);
			entries.add(ModItems.STICKER_BEE_CUB_SKIN);
			entries.add(ModItems.STICKER_GINGERBREAD_CUB_SKIN);
			entries.add(ModItems.STICKER_SNOW_CUB_SKIN);
			entries.add(ModItems.STICKER_PEPPERMINT_CUB_SKIN);
			entries.add(ModItems.STICKER_DOODLE_CUB_SKIN);
			entries.add(ModItems.STICKER_GLOOMY_CUB_SKIN);

			entries.add(ModItems.STICKER_BASIC_RED_HIVE_SKIN);
			entries.add(ModItems.STICKER_BASIC_BLUE_HIVE_SKIN);
			entries.add(ModItems.STICKER_BASIC_PINK_HIVE_SKIN);
			entries.add(ModItems.STICKER_BASIC_GREEN_HIVE_SKIN);
			entries.add(ModItems.STICKER_BASIC_WHITE_HIVE_SKIN);
			entries.add(ModItems.STICKER_BASIC_BLACK_HIVE_SKIN);
			entries.add(ModItems.STICKER_WAVY_YELLOW_HIVE_SKIN);
			entries.add(ModItems.STICKER_WAVY_CYAN_HIVE_SKIN);
			entries.add(ModItems.STICKER_WAVY_PURPLE_HIVE_SKIN);
			entries.add(ModItems.STICKER_WAVY_FESTIVE_HIVE_SKIN);
			entries.add(ModItems.STICKER_WAVY_DOODLE_HIVE_SKIN);
			entries.add(ModItems.STICKER_ICY_CROWNED_HIVE_SKIN);

			entries.add(ModItems.STICKER_BEAR_BEE_VOUCHER);
			entries.add(ModItems.STICKER_CUB_BUDDY_VOUCHER);
			entries.add(ModItems.STICKER_BEE_GATHER_VOUCHER);
			entries.add(ModItems.STICKER_CONVERT_SPEED_VOUCHER);

			entries.add(ModItems.STICKER_PLAY_BUTTON);
			entries.add(ModItems.STICKER_GAMER_CHAT_ICON);
			entries.add(ModItems.STICKER_FLYING_RAD_BEE);
			entries.add(ModItems.STICKER_FLYING_NINJA_BEE);
			entries.add(ModItems.STICKER_FLYING_BRAVE_BEE);
			entries.add(ModItems.STICKER_FLYING_PHOTON_BEE);
			entries.add(ModItems.STICKER_DROOPING_STUBBORN_BEE);
			entries.add(ModItems.STICKER_WOBBLY_LOOKER_BEE);
			entries.add(ModItems.STICKER_BLOB_BUMBLE_BEE);
			entries.add(ModItems.STICKER_ROUND_RASCAL_BEE);
			entries.add(ModItems.STICKER_ROUND_BASIC_BEE);
			entries.add(ModItems.STICKER_DIAMOND_DIAMOND_BEE);
			entries.add(ModItems.STICKER_4_PRONGED_VECTOR_BEE);
			entries.add(ModItems.STICKER_SHOCKED_HIVE_SLOT);
			entries.add(ModItems.STICKER_BEAR_BEE_OFFER);
			entries.add(ModItems.STICKER_TABBY_SCRATCH);
			entries.add(ModItems.STICKER_TABBY_FROM_BEHIND);
			entries.add(ModItems.STICKER_FUZZ_BOMB);
			entries.add(ModItems.STICKER_PRECISE_EYE);
			entries.add(ModItems.STICKER_CHEF_HAT_POLAR_BEAR);
			entries.add(ModItems.STICKER_HONEY_BEE_BEAR);
			entries.add(ModItems.STICKER_BOMBER_BEE_BEAR);
			entries.add(ModItems.STICKER_UPLOOKING_BEAR);
			entries.add(ModItems.STICKER_SITTING_GREEN_SHIRT_BEAR);
			entries.add(ModItems.STICKER_SHY_BROWN_BEAR);
			entries.add(ModItems.STICKER_SITTING_MOTHER_BEAR);
			entries.add(ModItems.STICKER_SQUASHED_HEAD_BEAR);
			entries.add(ModItems.STICKER_STRETCHED_HEAD_BEAR);
			entries.add(ModItems.STICKER_PANICKED_SCIENCE_BEAR);
			entries.add(ModItems.STICKER_DAPPER_FROM_ABOVE);
			entries.add(ModItems.STICKER_SIDEWAYS_SPIRIT_BEAR);
			entries.add(ModItems.STICKER_GLOWERING_GUMMY_BEAR);
			entries.add(ModItems.STICKER_STRANDED_SUN_BEAR);
			entries.add(ModItems.STICKER_MENACING_MANTIS);
			entries.add(ModItems.STICKER_LITTLE_SCORPION);
			entries.add(ModItems.STICKER_LEFT_FACING_ANT);
			entries.add(ModItems.STICKER_WALKING_STICK_NYMPH);
			entries.add(ModItems.STICKER_FORWARD_FACING_SPIDER);
			entries.add(ModItems.STICKER_FORWARD_FACING_APHID);
			entries.add(ModItems.STICKER_RIGHT_FACING_STUMP_SNAIL);
			entries.add(ModItems.STICKER_STANDING_BEAN_BUG);
			entries.add(ModItems.STICKER_SMALL_BLUE_CHICK);
			entries.add(ModItems.STICKER_TADPOLE);
			entries.add(ModItems.STICKER_HAPPY_FISH);
			entries.add(ModItems.STICKER_COILED_SNAKE);
			entries.add(ModItems.STICKER_STANDING_CATERPILLAR);
			entries.add(ModItems.STICKER_ROUND_GREEN_CRITTER);
			entries.add(ModItems.STICKER_FLYING_MAGENTA_CRITTER);
			entries.add(ModItems.STICKER_BLUE_TRIANGLE_CRITTER);
			entries.add(ModItems.STICKER_PURPLE_POINTED_CRITTER);
			entries.add(ModItems.STICKER_ORANGE_LEG_CRITTER);
			entries.add(ModItems.STICKER_GREEN_PLUS_SIGN);
			entries.add(ModItems.STICKER_GREEN_CHECK_MARK);
			entries.add(ModItems.STICKER_RED_X);
			entries.add(ModItems.STICKER_ALERT_ICON);
			entries.add(ModItems.STICKER_YELLOW_RIGHT_ARROW);
			entries.add(ModItems.STICKER_YELLOW_LEFT_ARROW);
			entries.add(ModItems.STICKER_SIMPLE_SUN);
			entries.add(ModItems.STICKER_PINK_CUPCAKE);
			entries.add(ModItems.STICKER_RUBBER_DUCK);
			entries.add(ModItems.STICKER_BASEBALL_SWING);
			entries.add(ModItems.STICKER_YELLOW_COFFEE_MUG);
			entries.add(ModItems.STICKER_LAUNCHING_ROCKET);
			entries.add(ModItems.STICKER_THUMBS_UP_HAND);
			entries.add(ModItems.STICKER_PEACE_SIGN_HAND);
			entries.add(ModItems.STICKER_TRAFFIC_LIGHT);
			entries.add(ModItems.STICKER_WINDOW);
			entries.add(ModItems.STICKER_SIMPLE_SKYSCRAPER);
			entries.add(ModItems.STICKER_SIMPLE_MOUNTAIN);
			entries.add(ModItems.STICKER_PALE_HEART);
			entries.add(ModItems.STICKER_COLORFUL_BUTTONS);
			entries.add(ModItems.STICKER_GIRAFFE);
			entries.add(ModItems.STICKER_SILLY_TONGUE);
			entries.add(ModItems.STICKER_WHITE_FLAG);
			entries.add(ModItems.STICKER_PYRAMID);
			entries.add(ModItems.STICKER_TINY_HOUSE);
			entries.add(ModItems.STICKER_TNT);
			entries.add(ModItems.STICKER_WISHBONE);
			entries.add(ModItems.STICKER_YELLOW_UMBRELLA);
			entries.add(ModItems.STICKER_RED_PALM_HAND);
			entries.add(ModItems.STICKER_YELLOW_STICKY_HAND);
			entries.add(ModItems.STICKER_YELLOW_WALKING_WIGGLY_PERSON);
			entries.add(ModItems.STICKER_GREEN_SELL);
			entries.add(ModItems.STICKER_YELLOW_HI);
			entries.add(ModItems.STICKER_AFK);
			entries.add(ModItems.STICKER_AURYN);
			entries.add(ModItems.STICKER_PINK_CHAIR);
			entries.add(ModItems.STICKER_DOODLE_S);
			entries.add(ModItems.STICKER_TRIPLE_EXCLAMATION);
			entries.add(ModItems.STICKER_EIGHTH_NOTE);
			entries.add(ModItems.STICKER_EVICTION);
			entries.add(ModItems.STICKER_FORK_AND_KNIFE);
			entries.add(ModItems.STICKER_SHINING_HALO);
			entries.add(ModItems.STICKER_RHUBARB);
			entries.add(ModItems.STICKER_SPROUT);
			entries.add(ModItems.STICKER_PALM_TREE);
			entries.add(ModItems.STICKER_JACK_O_LANTERN);
			entries.add(ModItems.STICKER_LIGHTNING);
			entries.add(ModItems.STICKER_SIMPLE_CLOUD);
			entries.add(ModItems.STICKER_GREY_RAINING_CLOUD);
			entries.add(ModItems.STICKER_TORNADO);
			entries.add(ModItems.STICKER_SMALL_FLAME);
			entries.add(ModItems.STICKER_DARK_FLAME);
			entries.add(ModItems.STICKER_SMALL_SHIELD);
			entries.add(ModItems.STICKER_ROBOT_HEAD);
			entries.add(ModItems.STICKER_CYAN_HILTED_SWORD);
			entries.add(ModItems.STICKER_COOL_BACKPACK);
			entries.add(ModItems.STICKER_STANDING_BEEKEEPER);
			entries.add(ModItems.STICKER_RED_WAILING_CRY);
			entries.add(ModItems.STICKER_HOURGLASS);
			entries.add(ModItems.STICKER_ATOM_SYMBOL);
			entries.add(ModItems.STICKER_BARCODE);
			entries.add(ModItems.STICKER_WALL_CRACK);
			entries.add(ModItems.STICKER_GREEN_CIRCLE);
			entries.add(ModItems.STICKER_BLUE_SQUARE);
			entries.add(ModItems.STICKER_BLACK_DIAMOND);
			entries.add(ModItems.STICKER_WAXING_CRESCENT_MOON);
			entries.add(ModItems.STICKER_GLOWING_SMILE);
			entries.add(ModItems.STICKER_SATURN);
			entries.add(ModItems.STICKER_BLACK_STAR);
			entries.add(ModItems.STICKER_CYAN_STAR);
			entries.add(ModItems.STICKER_SHINING_STAR);
			entries.add(ModItems.STICKER_GREY_DIAMOND_LOGO);
			entries.add(ModItems.STICKER_ORPHAN_DOG);
			entries.add(ModItems.STICKER_PIZZA_DELIVERY_MAN);
			entries.add(ModItems.STICKER_INTERROBANG_BLOCK);
			entries.add(ModItems.STICKER_THEATRICAL_INTRUDER);
			entries.add(ModItems.STICKER_DESPERATE_BOOTH);
			entries.add(ModItems.STICKER_BUILT_SHIP);
			entries.add(ModItems.STICKER_GREY_SHAPE_COMPANION);
			entries.add(ModItems.STICKER_EVIL_PIG);
			entries.add(ModItems.STICKER_WAVING_TOWNSPERSON);
			entries.add(ModItems.STICKER_COP_AND_ROBBER);
			entries.add(ModItems.STICKER_TOUGH_POTATO);
			entries.add(ModItems.STICKER_YOUNG_ELF);
			entries.add(ModItems.STICKER_SHRUGGING_HEART);
			entries.add(ModItems.STICKER_CLASSIC_KILLROY);
			entries.add(ModItems.STICKER_KILLROY_WITH_HAIR);
			entries.add(ModItems.STICKER_TAUNTING_DOODLE_PERSON);
			entries.add(ModItems.STICKER_PREHISTORIC_HAND);
			entries.add(ModItems.STICKER_PREHISTORIC_BOAR);
			entries.add(ModItems.STICKER_RED_DOODLE_PERSON);
			entries.add(ModItems.STICKER_PEARL_GIRL);
			entries.add(ModItems.STICKER_ABSTRACT_COLOR_PAINTING);
			entries.add(ModItems.STICKER_PRISM_PAINTING);
			entries.add(ModItems.STICKER_BANANA_PAINTING);
			entries.add(ModItems.STICKER_MOAI);
			entries.add(ModItems.STICKER_NESSIE);
			entries.add(ModItems.STICKER_IONIC_COLUMN_TOP);
			entries.add(ModItems.STICKER_IONIC_COLUMN_MIDDLE);
			entries.add(ModItems.STICKER_IONIC_COLUMN_BASE);
			entries.add(ModItems.STICKER_ORANGE_STEP_ARRAY);
			entries.add(ModItems.STICKER_ORANGE_GREEN_TRI_DECO);
			entries.add(ModItems.STICKER_ORANGE_SWIRLED_MARBLE);
			entries.add(ModItems.STICKER_BLUE_AND_GREEN_MARBLE);
			entries.add(ModItems.STICKER_YELLOW_SWIRLED_MARBLE);
			entries.add(ModItems.STICKER_DIAMOND_CLUSTER);
			entries.add(ModItems.STICKER_DIAMOND_TRIM);
			entries.add(ModItems.STICKER_CYAN_DECORATIVE_BORDER);
			entries.add(ModItems.STICKER_LEFT_GOLD_SWIRL_FLEURON);
			entries.add(ModItems.STICKER_RIGHT_GOLD_SWIRL_FLEURON);
			entries.add(ModItems.STICKER_LEFT_SHINING_DIAMOND_FLEURON);
			entries.add(ModItems.STICKER_RIGHT_SHINING_DIAMOND_FLEURON);
			entries.add(ModItems.STICKER_LEFT_MYTHIC_GEM_FLEURON);
			entries.add(ModItems.STICKER_RIGHT_MYTHIC_GEM_FLEURON);
			entries.add(ModItems.STICKER_PURPLE_FLEURON);
			entries.add(ModItems.STICKER_ROYAL_SYMBOL);
			entries.add(ModItems.STICKER_ROYAL_BEAR);
			entries.add(ModItems.STICKER_MYTHIC_M);
			entries.add(ModItems.STICKER_SATISFYING_NECTAR_ICON);
			entries.add(ModItems.STICKER_REFRESHING_NECTAR_ICON);
			entries.add(ModItems.STICKER_MOTIVATING_NECTAR_ICON);
			entries.add(ModItems.STICKER_INVIGORATING_NECTAR_ICON);
			entries.add(ModItems.STICKER_COMFORTING_NECTAR_ICON);
			entries.add(ModItems.STICKER_SMALL_TICKSEED);
			entries.add(ModItems.STICKER_SMALL_WHITE_DAISY);
			entries.add(ModItems.STICKER_SMALL_PINK_TULIP);
			entries.add(ModItems.STICKER_SMALL_DANDELION);
			entries.add(ModItems.STICKER_PURPLE_4_POINT_FLOWER);
			entries.add(ModItems.STICKER_SPORE_COVERED_PUFFSHROOM);
			entries.add(ModItems.STICKER_WHITE_BUTTON_MUSHROOM);
			entries.add(ModItems.STICKER_FLY_AGARIC_MUSHROOM);
			entries.add(ModItems.STICKER_PORCINI_MUSHROOM);
			entries.add(ModItems.STICKER_OILER_MUSHROOM);
			entries.add(ModItems.STICKER_MOREL_MUSHROOM);
			entries.add(ModItems.STICKER_CHANTERELLE_MUSHROOM);
			entries.add(ModItems.STICKER_SHIITAKE_MUSHROOM);
			entries.add(ModItems.STICKER_BLACK_TRUFFLE_MUSHROOM);
			entries.add(ModItems.STICKER_PRISMATIC_MUSHROOM);
			entries.add(ModItems.STICKER_BLOWING_LEAF);
			entries.add(ModItems.STICKER_CORDATE_LEAF);
			entries.add(ModItems.STICKER_CUNATE_LEAF);
			entries.add(ModItems.STICKER_ELLIPTIC_LEAF);
			entries.add(ModItems.STICKER_HASTATE_LEAF);
			entries.add(ModItems.STICKER_LANCEOLATE_LEAF);
			entries.add(ModItems.STICKER_LYRATE_LEAF);
			entries.add(ModItems.STICKER_OBLIQUE_LEAF);
			entries.add(ModItems.STICKER_RHOMBOID_LEAF);
			entries.add(ModItems.STICKER_RENIFORM_LEAF);
			entries.add(ModItems.STICKER_SPATULATE_LEAF);
			entries.add(ModItems.STICKER_SCOOPER);
			entries.add(ModItems.STICKER_RAKE);
			entries.add(ModItems.STICKER_CLIPPERS);
			entries.add(ModItems.STICKER_MAGNET);
			entries.add(ModItems.STICKER_VACUUM);
			entries.add(ModItems.STICKER_SUPER_SCOOPER);
			entries.add(ModItems.STICKER_PULSAR);
			entries.add(ModItems.STICKER_ELECTRO_MAGNET);
			entries.add(ModItems.STICKER_SCISSORS);
			entries.add(ModItems.STICKER_HONEY_DIPPER);
			entries.add(ModItems.STICKER_BUBBLE_WAND);
			entries.add(ModItems.STICKER_SCYTHE);
			entries.add(ModItems.STICKER_GOLDEN_RAKE);
			entries.add(ModItems.STICKER_SPARK_STAFF);
			entries.add(ModItems.STICKER_PORCELAIN_DIPPER);
			entries.add(ModItems.STICKER_PETAL_WAND);
			entries.add(ModItems.STICKER_TIDE_POPPER);
			entries.add(ModItems.STICKER_DARK_SCYTHE);
			entries.add(ModItems.STICKER_GUMMYBALLER);
			entries.add(ModItems.STICKER_CAPRICORN_STAR_SIGN);
			entries.add(ModItems.STICKER_AQUARIUS_STAR_SIGN);
			entries.add(ModItems.STICKER_PISCES_STAR_SIGN);
			entries.add(ModItems.STICKER_ARIES_STAR_SIGN);
			entries.add(ModItems.STICKER_TAURUS_STAR_SIGN);
			entries.add(ModItems.STICKER_GEMINI_STAR_SIGN);
			entries.add(ModItems.STICKER_CANCER_STAR_SIGN);
			entries.add(ModItems.STICKER_LEO_STAR_SIGN);
			entries.add(ModItems.STICKER_VIRGO_STAR_SIGN);
			entries.add(ModItems.STICKER_LIBRA_STAR_SIGN);
			entries.add(ModItems.STICKER_SCORPIO_STAR_SIGN);
			entries.add(ModItems.STICKER_SAGITTARIUS_STAR_SIGN);
			entries.add(ModItems.STICKER_SUNFLOWER_FIELD_STAMP);
			entries.add(ModItems.STICKER_DANDELION_FIELD_STAMP);
			entries.add(ModItems.STICKER_MUSHROOM_FIELD_STAMP);
			entries.add(ModItems.STICKER_BLUE_FLOWER_FIELD_STAMP);
			entries.add(ModItems.STICKER_CLOVER_FIELD_STAMP);
			entries.add(ModItems.STICKER_STRAWBERRY_FIELD_STAMP);
			entries.add(ModItems.STICKER_SPIDER_FIELD_STAMP);
			entries.add(ModItems.STICKER_BAMBOO_FIELD_STAMP);
			entries.add(ModItems.STICKER_PINEAPPLE_PATCH_STAMP);
			entries.add(ModItems.STICKER_STUMP_FIELD_STAMP);
			entries.add(ModItems.STICKER_CACTUS_FIELD_STAMP);
			entries.add(ModItems.STICKER_PUMPKIN_PATCH_STAMP);
			entries.add(ModItems.STICKER_PINE_TREE_FOREST_STAMP);
			entries.add(ModItems.STICKER_ROSE_FIELD_STAMP);
			entries.add(ModItems.STICKER_HUB_FIELD_STAMP);
			entries.add(ModItems.STICKER_MOUNTAIN_TOP_FIELD_STAMP);
			entries.add(ModItems.STICKER_PEPPER_PATCH_STAMP);
			entries.add(ModItems.STICKER_COCONUT_FIELD_STAMP);
			entries.add(ModItems.STICKER_ANT_FIELD_STAMP);
			entries.add(ModItems.STICKER_GREEN_BEESMAS_LIGHT);
			entries.add(ModItems.STICKER_BLUE_BEESMAS_LIGHT);
			entries.add(ModItems.STICKER_RED_BEESMAS_LIGHT);
			entries.add(ModItems.STICKER_YELLOW_BEESMAS_LIGHT);
			entries.add(ModItems.STICKER_CRITTER_IN_A_STOCKING);
			entries.add(ModItems.STICKER_FLYING_FESTIVE_BEE);
			entries.add(ModItems.STICKER_FLYING_BEE_BEAR);
			entries.add(ModItems.STICKER_PARTY_ROBO_BEAR);
			entries.add(ModItems.STICKER_FESTIVE_PUFFERFISH);
			entries.add(ModItems.STICKER_FESTIVE_PEA);
			entries.add(ModItems.STICKER_BBM_FROM_BELOW);
		})
		.build();

	public static void registerModItemGroups() {
		MineSwarmSimulator.LOGGER.info("Registered Item Groups for " + MineSwarmSimulator.MOD_ID);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_items"), MSS_ITEMS);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_tools"), MSS_TOOLS);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_accessories"), MSS_ACCESSORIES);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_blocks"), MSS_BLOCKS);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_mobs"), MSS_MOBS);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_planters"), MSS_PLANTERS);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_beequips"), MSS_BEEQUIPS);
		Registry.register(Registries.ITEM_GROUP, Identifier.of(MineSwarmSimulator.MOD_ID, "mss_stickers"), MSS_STICKERS);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(ModItems.ANTMARCH1_MUSIC_DISC);
			entries.add(ModItems.BPATROL_MUSIC_DISC);
			entries.add(ModItems.CRAWLERS_MUSIC_DISC);
			entries.add(ModItems.DIGITIZE_MUSIC_DISC);
			entries.add(ModItems.DRONE_MUSIC_DISC);
			entries.add(ModItems.GBTUNE1_MUSIC_DISC);
			entries.add(ModItems.HIBERNATION1_MUSIC_DISC);
			entries.add(ModItems.MOUNTAINCALL_MUSIC_DISC);
			entries.add(ModItems.NECTAR_MUSIC_DISC);
			entries.add(ModItems.OVERFLOWIN4_MUSIC_DISC);
			entries.add(ModItems.RBCLOADING_MUSIC_DISC);
			entries.add(ModItems.STARHALL_MUSIC_DISC);
			entries.add(ModItems.STICKBUG_MUSIC_DISC);
			entries.add(ModItems.VENDOR_MUSIC_DISC);
			entries.add(ModItems.WAX_MUSIC_DISC);
		});
	}
}
