package alex.mine_swarm_simulator.block;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.block.custom.*;
import alex.mine_swarm_simulator.item.ModItems;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;

public class ModBlocks {
	// Sprinklers
	public static final Block BASIC_SPRINKLER = registerBlock("basic_sprinkler", new SprinklerBlock(), 1);
	public static final Block SILVER_SOAKERS = registerBlock("silver_soakers", new SprinklerBlock(), 2);
	public static final Block GOLDEN_GUSHERS = registerBlock("golden_gushers", new SprinklerBlock(), 3);
	public static final Block DIAMOND_DRENCHERS = registerBlock("diamond_drenchers", new SprinklerBlock(), 4);
	public static final Block SUPREME_SATURATOR = registerBlock("supreme_saturator", new SprinklerBlock(), 1);

	// Shop Blocks
	public static final Block BASIC_EGG_SHOP = registerBlock("basic_egg_shop", new ShopBlock());
	public static final Block GUMDROP_SHOP = registerBlock("gumdrop_shop", new ShopBlock());
	public static final Block MAGIC_BEAN_SHOP = registerBlock("magic_bean_shop", new ShopBlock());
	public static final Block ROYAL_JELLY_SHOP = registerBlock("royal_jelly_shop", new ShopBlock());
	public static final Block STINGER_SHOP = registerBlock("stinger_shop", new ShopBlock());
	public static final Block TICKET_SHOP = registerBlock("ticket_shop", new ShopBlock());
	public static final Block TREAT_SHOP = registerBlock("treat_shop", new ShopBlock());

	// Misc.
	public static final Block HIVE_BLOCK = registerBlock("hive_block", new HiveBlock());
	public static final Block HIVE_BLOCK_SLAB = registerBlock("hive_block_slab", new HiveBlockSlab());
	public static final Block HIVE_PLATE = registerBlock("hive_plate", new HivePlateBlock(AbstractBlock.Settings.create()));
	public static final Block HIVE_SLOT = registerBlock("hive_slot", new HiveSlotBlock(AbstractBlock.Settings.create()));
	public static final Block FLOWER_BLOCK = registerBlock("flower_block", new FlowerBlock(AbstractBlock.Settings.create()));

	public static final Block ITEM_SHOP = registerBlock("item_shop", new ItemShopBlock(AbstractBlock.Settings.create()));
	// moon parkour block
	// bee gate block
	// etc..
	
	// Stickers
	public static final Block STICKER_BROWN_CUB_SKIN = registerSticker("sticker_brown_cub_skin");
	public static final Block STICKER_ROBO_CUB_SKIN = registerSticker("sticker_robo_cub_skin");
	public static final Block STICKER_STICK_CUB_SKIN = registerSticker("sticker_stick_cub_skin");
	public static final Block STICKER_STAR_CUB_SKIN = registerSticker("sticker_star_cub_skin");
	public static final Block STICKER_NOOB_CUB_SKIN = registerSticker("sticker_noob_cub_skin");
	public static final Block STICKER_BEE_CUB_SKIN = registerSticker("sticker_bee_cub_skin");
	public static final Block STICKER_GINGERBREAD_CUB_SKIN = registerSticker("sticker_gingerbread_cub_skin");
	public static final Block STICKER_SNOW_CUB_SKIN = registerSticker("sticker_snow_cub_skin");
	public static final Block STICKER_PEPPERMINT_CUB_SKIN = registerSticker("sticker_peppermint_cub_skin");
	public static final Block STICKER_DOODLE_CUB_SKIN = registerSticker("sticker_doodle_cub_skin");
	public static final Block STICKER_GLOOMY_CUB_SKIN = registerSticker("sticker_gloomy_cub_skin");

	public static final Block STICKER_BASIC_RED_HIVE_SKIN = registerHiveSticker("sticker_basic_red_hive_skin");
	public static final Block STICKER_BASIC_BLUE_HIVE_SKIN = registerHiveSticker("sticker_basic_blue_hive_skin");
	public static final Block STICKER_BASIC_PINK_HIVE_SKIN = registerHiveSticker("sticker_basic_pink_hive_skin");
	public static final Block STICKER_BASIC_GREEN_HIVE_SKIN = registerHiveSticker("sticker_basic_green_hive_skin");
	public static final Block STICKER_BASIC_WHITE_HIVE_SKIN = registerHiveSticker("sticker_basic_white_hive_skin");
	public static final Block STICKER_BASIC_BLACK_HIVE_SKIN = registerHiveSticker("sticker_basic_black_hive_skin");
	public static final Block STICKER_WAVY_YELLOW_HIVE_SKIN = registerHiveSticker("sticker_wavy_yellow_hive_skin");
	public static final Block STICKER_WAVY_CYAN_HIVE_SKIN = registerHiveSticker("sticker_wavy_cyan_hive_skin");
	public static final Block STICKER_WAVY_PURPLE_HIVE_SKIN = registerHiveSticker("sticker_wavy_purple_hive_skin");
	public static final Block STICKER_WAVY_FESTIVE_HIVE_SKIN = registerHiveSticker("sticker_wavy_festive_hive_skin");
	public static final Block STICKER_WAVY_DOODLE_HIVE_SKIN = registerHiveSticker("sticker_wavy_doodle_hive_skin");
	public static final Block STICKER_ICY_CROWNED_HIVE_SKIN = registerHiveSticker("sticker_icy_crowned_hive_skin");

	public static final Block STICKER_BEAR_BEE_VOUCHER = registerSticker("sticker_bear_bee_voucher");
	public static final Block STICKER_CUB_BUDDY_VOUCHER = registerSticker("sticker_cub_buddy_voucher");
	public static final Block STICKER_BEE_GATHER_VOUCHER = registerSticker("sticker_bee_gather_voucher");
	public static final Block STICKER_CONVERT_SPEED_VOUCHER = registerSticker("sticker_convert_speed_voucher");
	public static final Block STICKER_OFFLINE_VOUCHER = registerSticker("sticker_offline_voucher");
	public static final Block STICKER_TICKET_VOUCHER = registerSticker("sticker_ticket_voucher");

	public static final Block STICKER_PLAY_BUTTON = registerSticker("sticker_play_button");
	public static final Block STICKER_GAMER_CHAT_ICON = registerSticker("sticker_gamer_chat_icon");
	public static final Block STICKER_FLYING_RAD_BEE = registerSticker("sticker_flying_rad_bee");
	public static final Block STICKER_FLYING_NINJA_BEE = registerSticker("sticker_flying_ninja_bee");
	public static final Block STICKER_FLYING_BRAVE_BEE = registerSticker("sticker_flying_brave_bee");
	public static final Block STICKER_FLYING_PHOTON_BEE = registerSticker("sticker_flying_photon_bee");
	public static final Block STICKER_DROOPING_STUBBORN_BEE = registerSticker("sticker_drooping_stubborn_bee");
	public static final Block STICKER_WOBBLY_LOOKER_BEE = registerSticker("sticker_wobbly_looker_bee");
	public static final Block STICKER_BLOB_BUMBLE_BEE = registerSticker("sticker_blob_bumble_bee");
	public static final Block STICKER_ROUND_RASCAL_BEE = registerSticker("sticker_round_rascal_bee");
	public static final Block STICKER_ROUND_BASIC_BEE = registerSticker("sticker_round_basic_bee");
	public static final Block STICKER_DIAMOND_DIAMOND_BEE = registerSticker("sticker_diamond_diamond_bee");
	public static final Block STICKER_4_PRONGED_VECTOR_BEE = registerSticker("sticker_4_pronged_vector_bee");
	public static final Block STICKER_SHOCKED_HIVE_SLOT = registerSticker("sticker_shocked_hive_slot");
	public static final Block STICKER_BEAR_BEE_OFFER = registerSticker("sticker_bear_bee_offer");
	public static final Block STICKER_TABBY_SCRATCH = registerSticker("sticker_tabby_scratch");
	public static final Block STICKER_TABBY_FROM_BEHIND = registerSticker("sticker_tabby_from_behind");
	public static final Block STICKER_FUZZ_BOMB = registerSticker("sticker_fuzz_bomb");
	public static final Block STICKER_PRECISE_EYE = registerSticker("sticker_precise_eye");
	public static final Block STICKER_CHEF_HAT_POLAR_BEAR = registerSticker("sticker_chef_hat_polar_bear");
	public static final Block STICKER_HONEY_BEE_BEAR = registerSticker("sticker_honey_bee_bear");
	public static final Block STICKER_BOMBER_BEE_BEAR = registerSticker("sticker_bomber_bee_bear");
	public static final Block STICKER_UPLOOKING_BEAR = registerSticker("sticker_uplooking_bear");
	public static final Block STICKER_SITTING_GREEN_SHIRT_BEAR = registerSticker("sticker_sitting_green_shirt_bear");
	public static final Block STICKER_SHY_BROWN_BEAR = registerSticker("sticker_shy_brown_bear");
	public static final Block STICKER_SITTING_MOTHER_BEAR = registerSticker("sticker_sitting_mother_bear");
	public static final Block STICKER_SQUASHED_HEAD_BEAR = registerSticker("sticker_squashed_head_bear");
	public static final Block STICKER_STRETCHED_HEAD_BEAR = registerSticker("sticker_stretched_head_bear");
	public static final Block STICKER_PANICKED_SCIENCE_BEAR = registerSticker("sticker_panicked_science_bear");
	public static final Block STICKER_DAPPER_FROM_ABOVE = registerSticker("sticker_dapper_from_above");
	public static final Block STICKER_SIDEWAYS_SPIRIT_BEAR = registerSticker("sticker_sideways_spirit_bear");
	public static final Block STICKER_GLOWERING_GUMMY_BEAR = registerSticker("sticker_glowering_gummy_bear");
	public static final Block STICKER_STRANDED_SUN_BEAR = registerSticker("sticker_stranded_sun_bear");
	public static final Block STICKER_MENACING_MANTIS = registerSticker("sticker_menacing_mantis");
	public static final Block STICKER_LITTLE_SCORPION = registerSticker("sticker_little_scorpion");
	public static final Block STICKER_LEFT_FACING_ANT = registerSticker("sticker_left_facing_ant");
	public static final Block STICKER_WALKING_STICK_NYMPH = registerSticker("sticker_walking_stick_nymph");
	public static final Block STICKER_FORWARD_FACING_SPIDER = registerSticker("sticker_forward_facing_spider");
	public static final Block STICKER_FORWARD_FACING_APHID = registerSticker("sticker_forward_facing_aphid");
	public static final Block STICKER_RIGHT_FACING_STUMP_SNAIL = registerSticker("sticker_right_facing_stump_snail");
	public static final Block STICKER_STANDING_BEAN_BUG = registerSticker("sticker_standing_bean_bug");
	public static final Block STICKER_SMALL_BLUE_CHICK = registerSticker("sticker_small_blue_chick");
	public static final Block STICKER_TADPOLE = registerSticker("sticker_tadpole");
	public static final Block STICKER_HAPPY_FISH = registerSticker("sticker_happy_fish");
	public static final Block STICKER_COILED_SNAKE = registerSticker("sticker_coiled_snake");
	public static final Block STICKER_STANDING_CATERPILLAR = registerSticker("sticker_standing_caterpillar");
	public static final Block STICKER_ROUND_GREEN_CRITTER = registerSticker("sticker_round_green_critter");
	public static final Block STICKER_FLYING_MAGENTA_CRITTER = registerSticker("sticker_flying_magenta_critter");
	public static final Block STICKER_BLUE_TRIANGLE_CRITTER = registerSticker("sticker_blue_triangle_critter");
	public static final Block STICKER_PURPLE_POINTED_CRITTER = registerSticker("sticker_purple_pointed_critter");
	public static final Block STICKER_ORANGE_LEG_CRITTER = registerSticker("sticker_orange_leg_critter");
	public static final Block STICKER_GREEN_PLUS_SIGN = registerSticker("sticker_green_plus_sign");
	public static final Block STICKER_GREEN_CHECK_MARK = registerSticker("sticker_green_check_mark");
	public static final Block STICKER_RED_X = registerSticker("sticker_red_x");
	public static final Block STICKER_ALERT_ICON = registerSticker("sticker_alert_icon");
	public static final Block STICKER_YELLOW_RIGHT_ARROW = registerSticker("sticker_yellow_right_arrow");
	public static final Block STICKER_YELLOW_LEFT_ARROW = registerSticker("sticker_yellow_left_arrow");
	public static final Block STICKER_SIMPLE_SUN = registerSticker("sticker_simple_sun");
	public static final Block STICKER_PINK_CUPCAKE = registerSticker("sticker_pink_cupcake");
	public static final Block STICKER_RUBBER_DUCK = registerSticker("sticker_rubber_duck");
	public static final Block STICKER_BASEBALL_SWING = registerSticker("sticker_baseball_swing");
	public static final Block STICKER_YELLOW_COFFEE_MUG = registerSticker("sticker_yellow_coffee_mug");
	public static final Block STICKER_LAUNCHING_ROCKET = registerSticker("sticker_launching_rocket");
	public static final Block STICKER_THUMBS_UP_HAND = registerSticker("sticker_thumbs_up_hand");
	public static final Block STICKER_PEACE_SIGN_HAND = registerSticker("sticker_peace_sign_hand");
	public static final Block STICKER_TRAFFIC_LIGHT = registerSticker("sticker_traffic_light");
	public static final Block STICKER_WINDOW = registerSticker("sticker_window");
	public static final Block STICKER_SIMPLE_SKYSCRAPER = registerSticker("sticker_simple_skyscraper");
	public static final Block STICKER_SIMPLE_MOUNTAIN = registerSticker("sticker_simple_mountain");
	public static final Block STICKER_PALE_HEART = registerSticker("sticker_pale_heart");
	public static final Block STICKER_COLORFUL_BUTTONS = registerSticker("sticker_colorful_buttons");
	public static final Block STICKER_GIRAFFE = registerSticker("sticker_giraffe");
	public static final Block STICKER_SILLY_TONGUE = registerSticker("sticker_silly_tongue");
	public static final Block STICKER_WHITE_FLAG = registerSticker("sticker_white_flag");
	public static final Block STICKER_PYRAMID = registerSticker("sticker_pyramid");
	public static final Block STICKER_TINY_HOUSE = registerSticker("sticker_tiny_house");
	public static final Block STICKER_TNT = registerSticker("sticker_tnt");
	public static final Block STICKER_WISHBONE = registerSticker("sticker_wishbone");
	public static final Block STICKER_YELLOW_UMBRELLA = registerSticker("sticker_yellow_umbrella");
	public static final Block STICKER_RED_PALM_HAND = registerSticker("sticker_red_palm_hand");
	public static final Block STICKER_YELLOW_STICKY_HAND = registerSticker("sticker_yellow_sticky_hand");
	public static final Block STICKER_YELLOW_WALKING_WIGGLY_PERSON = registerSticker("sticker_yellow_walking_wiggly_person");
	public static final Block STICKER_GREEN_SELL = registerSticker("sticker_green_sell");
	public static final Block STICKER_YELLOW_HI = registerSticker("sticker_yellow_hi");
	public static final Block STICKER_AFK = registerSticker("sticker_afk");
	public static final Block STICKER_AURYN = registerSticker("sticker_auryn");
	public static final Block STICKER_PINK_CHAIR = registerSticker("sticker_pink_chair");
	public static final Block STICKER_DOODLE_S = registerSticker("sticker_doodle_s");
	public static final Block STICKER_TRIPLE_EXCLAMATION = registerSticker("sticker_triple_exclamation");
	public static final Block STICKER_EIGHTH_NOTE = registerSticker("sticker_eighth_note");
	public static final Block STICKER_EVICTION = registerSticker("sticker_eviction");
	public static final Block STICKER_FORK_AND_KNIFE = registerSticker("sticker_fork_and_knife");
	public static final Block STICKER_SHINING_HALO = registerSticker("sticker_shining_halo");
	public static final Block STICKER_RHUBARB = registerSticker("sticker_rhubarb");
	public static final Block STICKER_SPROUT = registerSticker("sticker_sprout");
	public static final Block STICKER_PALM_TREE = registerSticker("sticker_palm_tree");
	public static final Block STICKER_JACK_O_LANTERN = registerSticker("sticker_jack_o_lantern");
	public static final Block STICKER_LIGHTNING = registerSticker("sticker_lightning");
	public static final Block STICKER_SIMPLE_CLOUD = registerSticker("sticker_simple_cloud");
	public static final Block STICKER_GREY_RAINING_CLOUD = registerSticker("sticker_grey_raining_cloud");
	public static final Block STICKER_TORNADO = registerSticker("sticker_tornado");
	public static final Block STICKER_SMALL_FLAME = registerSticker("sticker_small_flame");
	public static final Block STICKER_DARK_FLAME = registerSticker("sticker_dark_flame");
	public static final Block STICKER_SMALL_SHIELD = registerSticker("sticker_small_shield");
	public static final Block STICKER_ROBOT_HEAD = registerSticker("sticker_robot_head");
	public static final Block STICKER_CYAN_HILTED_SWORD = registerSticker("sticker_cyan_hilted_sword");
	public static final Block STICKER_COOL_BACKPACK = registerSticker("sticker_cool_backpack");
	public static final Block STICKER_STANDING_BEEKEEPER = registerSticker("sticker_standing_beekeeper");
	public static final Block STICKER_RED_WAILING_CRY = registerSticker("sticker_red_wailing_cry");
	public static final Block STICKER_HOURGLASS = registerSticker("sticker_hourglass");
	public static final Block STICKER_ATOM_SYMBOL = registerSticker("sticker_atom_symbol");
	public static final Block STICKER_BARCODE = registerSticker("sticker_barcode");
	public static final Block STICKER_WALL_CRACK = registerSticker("sticker_wall_crack");
	public static final Block STICKER_GREEN_CIRCLE = registerSticker("sticker_green_circle");
	public static final Block STICKER_BLUE_SQUARE = registerSticker("sticker_blue_square");
	public static final Block STICKER_BLACK_DIAMOND = registerSticker("sticker_black_diamond");
	public static final Block STICKER_WAXING_CRESCENT_MOON = registerSticker("sticker_waxing_crescent_moon");
	public static final Block STICKER_GLOWING_SMILE = registerSticker("sticker_glowing_smile");
	public static final Block STICKER_SATURN = registerSticker("sticker_saturn");
	public static final Block STICKER_BLACK_STAR = registerSticker("sticker_black_star");
	public static final Block STICKER_CYAN_STAR = registerSticker("sticker_cyan_star");
	public static final Block STICKER_SHINING_STAR = registerSticker("sticker_shining_star");
	public static final Block STICKER_GREY_DIAMOND_LOGO = registerSticker("sticker_grey_diamond_logo");
	public static final Block STICKER_ORPHAN_DOG = registerSticker("sticker_orphan_dog");
	public static final Block STICKER_PIZZA_DELIVERY_MAN = registerSticker("sticker_pizza_delivery_man");
	public static final Block STICKER_INTERROBANG_BLOCK = registerSticker("sticker_interrobang_block");
	public static final Block STICKER_THEATRICAL_INTRUDER = registerSticker("sticker_theatrical_intruder");
	public static final Block STICKER_DESPERATE_BOOTH = registerSticker("sticker_desperate_booth");
	public static final Block STICKER_BUILT_SHIP = registerSticker("sticker_built_ship");
	public static final Block STICKER_GREY_SHAPE_COMPANION = registerSticker("sticker_grey_shape_companion");
	public static final Block STICKER_EVIL_PIG = registerSticker("sticker_evil_pig");
	public static final Block STICKER_WAVING_TOWNSPERSON = registerSticker("sticker_walking_townsperson");
	public static final Block STICKER_COP_AND_ROBBER = registerSticker("sticker_cop_and_robber");
	public static final Block STICKER_TOUGH_POTATO = registerSticker("sticker_tough_potato");
	public static final Block STICKER_YOUNG_ELF = registerSticker("sticker_young_elf");
	public static final Block STICKER_SHRUGGING_HEART = registerSticker("sticker_shrugging_heart");
	public static final Block STICKER_CLASSIC_KILLROY = registerSticker("sticker_classic_killroy");
	public static final Block STICKER_KILLROY_WITH_HAIR = registerSticker("sticker_killroy_with_hair");
	public static final Block STICKER_TAUNTING_DOODLE_PERSON = registerSticker("sticker_taunting_doodle_person");
	public static final Block STICKER_PREHISTORIC_HAND = registerSticker("sticker_prehistoric_hand");
	public static final Block STICKER_PREHISTORIC_BOAR = registerSticker("sticker_prehistoric_boar");
	public static final Block STICKER_RED_DOODLE_PERSON = registerSticker("sticker_red_doodle_person");
	public static final Block STICKER_PEARL_GIRL = registerSticker("sticker_pearl_girl");
	public static final Block STICKER_ABSTRACT_COLOR_PAINTING = registerSticker("sticker_abstract_color_painting");
	public static final Block STICKER_PRISM_PAINTING = registerSticker("sticker_prism_painting");
	public static final Block STICKER_BANANA_PAINTING = registerSticker("sticker_banana_painting");
	public static final Block STICKER_MOAI = registerSticker("sticker_moai");
	public static final Block STICKER_NESSIE = registerSticker("sticker_nessie");
	public static final Block STICKER_IONIC_COLUMN_TOP = registerSticker("sticker_ionic_column_top");
	public static final Block STICKER_IONIC_COLUMN_MIDDLE = registerSticker("sticker_ionic_column_middle");
	public static final Block STICKER_IONIC_COLUMN_BASE = registerSticker("sticker_ionic_column_base");
	public static final Block STICKER_ORANGE_STEP_ARRAY = registerSticker("sticker_orange_step_array");
	public static final Block STICKER_ORANGE_GREEN_TRI_DECO = registerSticker("sticker_orange_green_tri_deco");
	public static final Block STICKER_ORANGE_SWIRLED_MARBLE = registerSticker("sticker_orange_swirled_marble");
	public static final Block STICKER_BLUE_AND_GREEN_MARBLE = registerSticker("sticker_blue_and_green_marble");
	public static final Block STICKER_YELLOW_SWIRLED_MARBLE = registerSticker("sticker_yellow_swirled_marble");
	public static final Block STICKER_DIAMOND_CLUSTER = registerSticker("sticker_diamond_cluster");
	public static final Block STICKER_DIAMOND_TRIM = registerSticker("sticker_diamond_trim");
	public static final Block STICKER_CYAN_DECORATIVE_BORDER = registerSticker("sticker_cyan_decorative_border");
	public static final Block STICKER_LEFT_GOLD_SWIRL_FLEURON = registerSticker("sticker_left_gold_swirl_fleuron");
	public static final Block STICKER_RIGHT_GOLD_SWIRL_FLEURON = registerSticker("sticker_right_gold_swirl_fleuron");
	public static final Block STICKER_LEFT_SHINING_DIAMOND_FLEURON = registerSticker("sticker_left_shining_diamond_fleuron");
	public static final Block STICKER_RIGHT_SHINING_DIAMOND_FLEURON = registerSticker("sticker_right_shining_diamond_fleuron");
	public static final Block STICKER_LEFT_MYTHIC_GEM_FLEURON = registerSticker("sticker_left_mythic_gem_fleuron");
	public static final Block STICKER_RIGHT_MYTHIC_GEM_FLEURON = registerSticker("sticker_right_mythic_gem_fleuron");
	public static final Block STICKER_PURPLE_FLEURON = registerSticker("sticker_purple_fleuron");
	public static final Block STICKER_ROYAL_SYMBOL = registerSticker("sticker_royal_symbol");
	public static final Block STICKER_ROYAL_BEAR = registerSticker("sticker_royal_bear");
	public static final Block STICKER_MYTHIC_M = registerSticker("sticker_mythic_m");
	public static final Block STICKER_SATISFYING_NECTAR_ICON = registerSticker("sticker_satisfying_nectar_icon");
	public static final Block STICKER_REFRESHING_NECTAR_ICON = registerSticker("sticker_refreshing_nectar_icon");
	public static final Block STICKER_MOTIVATING_NECTAR_ICON = registerSticker("sticker_motivating_nectar_icon");
	public static final Block STICKER_INVIGORATING_NECTAR_ICON = registerSticker("sticker_invigorating_nectar_icon");
	public static final Block STICKER_COMFORTING_NECTAR_ICON = registerSticker("sticker_comforting_nectar_icon");
	public static final Block STICKER_SMALL_TICKSEED = registerSticker("sticker_small_tickseed");
	public static final Block STICKER_SMALL_WHITE_DAISY = registerSticker("sticker_small_white_daisy");
	public static final Block STICKER_SMALL_PINK_TULIP = registerSticker("sticker_small_pink_tulip");
	public static final Block STICKER_SMALL_DANDELION = registerSticker("sticker_small_dandelion");
	public static final Block STICKER_PURPLE_4_POINT_FLOWER = registerSticker("sticker_purple_4_point_flower");
	public static final Block STICKER_SPORE_COVERED_PUFFSHROOM = registerSticker("sticker_spore_covered_puffshroom");
	public static final Block STICKER_WHITE_BUTTON_MUSHROOM = registerSticker("sticker_white_button_mushroom");
	public static final Block STICKER_FLY_AGARIC_MUSHROOM = registerSticker("sticker_fly_agaric_mushroom");
	public static final Block STICKER_PORCINI_MUSHROOM = registerSticker("sticker_porcini_mushroom");
	public static final Block STICKER_OILER_MUSHROOM = registerSticker("sticker_oiler_mushroom");
	public static final Block STICKER_MOREL_MUSHROOM = registerSticker("sticker_morel_mushroom");
	public static final Block STICKER_CHANTERELLE_MUSHROOM = registerSticker("sticker_chanterelle_mushroom");
	public static final Block STICKER_SHIITAKE_MUSHROOM = registerSticker("sticker_shiitake_mushroom");
	public static final Block STICKER_BLACK_TRUFFLE_MUSHROOM = registerSticker("sticker_black_truffle_mushroom");
	public static final Block STICKER_PRISMATIC_MUSHROOM = registerSticker("sticker_prismatic_mushroom");
	public static final Block STICKER_BLOWING_LEAF = registerSticker("sticker_blowing_leaf");
	public static final Block STICKER_CORDATE_LEAF = registerSticker("sticker_cordate_leaf");
	public static final Block STICKER_CUNATE_LEAF = registerSticker("sticker_cunate_leaf");
	public static final Block STICKER_ELLIPTIC_LEAF = registerSticker("sticker_elliptic_leaf");
	public static final Block STICKER_HASTATE_LEAF = registerSticker("sticker_hastate_leaf");
	public static final Block STICKER_LANCEOLATE_LEAF = registerSticker("sticker_lanceolate_leaf");
	public static final Block STICKER_LYRATE_LEAF = registerSticker("sticker_lyrate_leaf");
	public static final Block STICKER_OBLIQUE_LEAF = registerSticker("sticker_oblique_leaf");
	public static final Block STICKER_RHOMBOID_LEAF = registerSticker("sticker_rhomboid_leaf");
	public static final Block STICKER_RENIFORM_LEAF = registerSticker("sticker_reniform_leaf");
	public static final Block STICKER_SPATULATE_LEAF = registerSticker("sticker_spatulate_leaf");
	public static final Block STICKER_SCOOPER = registerSticker("sticker_scooper");
	public static final Block STICKER_RAKE = registerSticker("sticker_rake");
	public static final Block STICKER_CLIPPERS = registerSticker("sticker_clippers");
	public static final Block STICKER_MAGNET = registerSticker("sticker_magnet");
	public static final Block STICKER_VACUUM = registerSticker("sticker_vacuum");
	public static final Block STICKER_SUPER_SCOOPER = registerSticker("sticker_super_scooper");
	public static final Block STICKER_PULSAR = registerSticker("sticker_pulsar");
	public static final Block STICKER_ELECTRO_MAGNET = registerSticker("sticker_electro_magnet");
	public static final Block STICKER_SCISSORS = registerSticker("sticker_scissors");
	public static final Block STICKER_HONEY_DIPPER = registerSticker("sticker_honey_dipper");
	public static final Block STICKER_BUBBLE_WAND = registerSticker("sticker_bubble_wand");
	public static final Block STICKER_SCYTHE = registerSticker("sticker_scythe");
	public static final Block STICKER_GOLDEN_RAKE = registerSticker("sticker_golden_rake");
	public static final Block STICKER_SPARK_STAFF = registerSticker("sticker_spark_staff");
	public static final Block STICKER_PORCELAIN_DIPPER = registerSticker("sticker_porcelain_dipper");
	public static final Block STICKER_PETAL_WAND = registerSticker("sticker_petal_wand");
	public static final Block STICKER_TIDE_POPPER = registerSticker("sticker_tide_popper");
	public static final Block STICKER_DARK_SCYTHE = registerSticker("sticker_dark_scythe");
	public static final Block STICKER_GUMMYBALLER = registerSticker("sticker_gummyballer");
	public static final Block STICKER_CAPRICORN_STAR_SIGN = registerSticker("sticker_capricorn_star_sign");
	public static final Block STICKER_AQUARIUS_STAR_SIGN = registerSticker("sticker_aquarius_star_sign");
	public static final Block STICKER_PISCES_STAR_SIGN = registerSticker("sticker_pisces_star_sign");
	public static final Block STICKER_ARIES_STAR_SIGN = registerSticker("sticker_aries_star_sign");
	public static final Block STICKER_TAURUS_STAR_SIGN = registerSticker("sticker_taurus_star_sign");
	public static final Block STICKER_GEMINI_STAR_SIGN = registerSticker("sticker_gemini_star_sign");
	public static final Block STICKER_CANCER_STAR_SIGN = registerSticker("sticker_cancer_star_sign");
	public static final Block STICKER_LEO_STAR_SIGN = registerSticker("sticker_leo_star_sign");
	public static final Block STICKER_VIRGO_STAR_SIGN = registerSticker("sticker_virgo_star_sign");
	public static final Block STICKER_LIBRA_STAR_SIGN = registerSticker("sticker_libra_star_sign");
	public static final Block STICKER_SCORPIO_STAR_SIGN = registerSticker("sticker_scorpio_star_sign");
	public static final Block STICKER_SAGITTARIUS_STAR_SIGN = registerSticker("sticker_sagittarius_star_sign");
	public static final Block STICKER_SUNFLOWER_FIELD_STAMP = registerSticker("sticker_sunflower_field_stamp");
	public static final Block STICKER_DANDELION_FIELD_STAMP = registerSticker("sticker_dandelion_field_stamp");
	public static final Block STICKER_MUSHROOM_FIELD_STAMP = registerSticker("sticker_mushroom_field_stamp");
	public static final Block STICKER_BLUE_FLOWER_FIELD_STAMP = registerSticker("sticker_blue_flower_field_stamp");
	public static final Block STICKER_CLOVER_FIELD_STAMP = registerSticker("sticker_clover_field_stamp");
	public static final Block STICKER_STRAWBERRY_FIELD_STAMP = registerSticker("sticker_strawberry_field_stamp");
	public static final Block STICKER_SPIDER_FIELD_STAMP = registerSticker("sticker_spider_field_stamp");
	public static final Block STICKER_BAMBOO_FIELD_STAMP = registerSticker("sticker_bamboo_field_stamp");
	public static final Block STICKER_PINEAPPLE_PATCH_STAMP = registerSticker("sticker_pineapple_patch_stamp");
	public static final Block STICKER_STUMP_FIELD_STAMP = registerSticker("sticker_stump_field_stamp");
	public static final Block STICKER_CACTUS_FIELD_STAMP = registerSticker("sticker_cactus_field_stamp");
	public static final Block STICKER_PUMPKIN_PATCH_STAMP = registerSticker("sticker_pumpkin_patch_stamp");
	public static final Block STICKER_PINE_TREE_FOREST_STAMP = registerSticker("sticker_pine_tree_forest_stamp");
	public static final Block STICKER_ROSE_FIELD_STAMP = registerSticker("sticker_rose_field_stamp");
	public static final Block STICKER_HUB_FIELD_STAMP = registerSticker("sticker_hub_field_stamp");
	public static final Block STICKER_MOUNTAIN_TOP_FIELD_STAMP = registerSticker("sticker_mountain_top_field_stamp");
	public static final Block STICKER_PEPPER_PATCH_STAMP = registerSticker("sticker_pepper_patch_stamp");
	public static final Block STICKER_COCONUT_FIELD_STAMP = registerSticker("sticker_coconut_field_stamp");
	public static final Block STICKER_ANT_FIELD_STAMP = registerSticker("sticker_ant_field_stamp");
	public static final Block STICKER_GREEN_BEESMAS_LIGHT = registerSticker("sticker_green_beesmas_light");
	public static final Block STICKER_BLUE_BEESMAS_LIGHT = registerSticker("sticker_blue_beesmas_light");
	public static final Block STICKER_RED_BEESMAS_LIGHT = registerSticker("sticker_red_beesmas_light");
	public static final Block STICKER_YELLOW_BEESMAS_LIGHT = registerSticker("sticker_yellow_beesmas_light");
	public static final Block STICKER_CRITTER_IN_A_STOCKING = registerSticker("sticker_critter_in_a_stocking");
	public static final Block STICKER_FLYING_FESTIVE_BEE = registerSticker("sticker_flying_festive_bee");
	public static final Block STICKER_FLYING_BEE_BEAR = registerSticker("sticker_flying_bee_bear");
	public static final Block STICKER_PARTY_ROBO_BEAR = registerSticker("sticker_party_robo_bear");
	public static final Block STICKER_FESTIVE_PUFFERFISH = registerSticker("sticker_festive_pufferfish");
	public static final Block STICKER_FESTIVE_PEA = registerSticker("sticker_festive_pea");
	public static final Block STICKER_BBM_FROM_BELOW = registerSticker("sticker_bbm_from_below");


	public static final List<StickerBlock> STICKERS = Arrays.stream(ModBlocks.class.getFields()).filter(field -> {
		try {
			return field.get(null) instanceof StickerBlock;
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}).map(field -> {
		try {
			return (StickerBlock)field.get(null);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}).toList();

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(MineSwarmSimulator.MOD_ID, name), block);
	}

	// Can specify stack count
	private static Block registerBlock(String name, Block block, int maxCount) {
		registerBlockItem(name, block, maxCount);
		return Registry.register(Registries.BLOCK, Identifier.of(MineSwarmSimulator.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, Identifier.of(MineSwarmSimulator.MOD_ID, name), new BlockItem(block, new Item.Settings()));
	}

	// Can specify stack count
	private static Item registerBlockItem(String name, Block block, int maxCount) {
		return Registry.register(Registries.ITEM, Identifier.of(MineSwarmSimulator.MOD_ID, name), new BlockItem(block, new Item.Settings().maxCount(maxCount)));
	}

	private static Block registerSticker(String name) {
		Block sticker = registerBlock(name, new StickerBlock(), 1);
		return sticker;
	}

	private static Block registerHiveSticker(String name) {
		Block hiveSkin = registerBlock(name, new StickerBlock(true), 1);
		StickerBlock.HIVE_SKINS.add(hiveSkin.asItem());
		return hiveSkin;
	}

	public static void registerModBlocks() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Blocks for " + MineSwarmSimulator.MOD_ID);
	}
}
