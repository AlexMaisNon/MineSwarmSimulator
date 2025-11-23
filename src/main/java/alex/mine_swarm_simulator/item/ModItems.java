package alex.mine_swarm_simulator.item;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.component.Passives;
import alex.mine_swarm_simulator.component.PassivesComponent;
import alex.mine_swarm_simulator.item.armor.*;
import alex.mine_swarm_simulator.item.misc.*;
import alex.mine_swarm_simulator.item.tools.*;
import alex.mine_swarm_simulator.sound.ModSounds;
import alex.mine_swarm_simulator.util.BeeType;
import dev.emi.trinkets.api.TrinketItem;
import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.armor.ArmorModelHandler;
import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;

import java.util.Arrays;
import java.util.List;

public class ModItems{
	// Miscellaneous Items
	public static final Item PRONGED_COG = registerItem("7_pronged_cog", new Item(new Item.Settings()));
	public static final Item AGED_GINGERBREAD_BEAR = registerItem("aged_gingerbread_bear", new TreatItem(500, 0.011f));
	public static final Item ANT_PASS = registerItem("ant_pass", new Item(new Item.Settings().maxCount(10)));
	public static final Item ATOMIC_TREAT = registerItem("atomic_treat", new TreatItem(1000, 0f));
	public static final Item BASIC_EGG = registerItem("basic_egg", new Item(new Item.Settings()));
	public static final Item BITTERBERRY = registerItem("bitterberry", new TreatItem(100, 0f));
	public static final Item BLACK_BALLON = registerItem("black_ballon", new Item(new Item.Settings().maxCount(25)));
	public static final Item BLUE_DRIVE = registerItem("blue_drive", new DriveItem(ModStatusEffects.BLUE_DRIVE_STATUS_EFFECT));
	public static final Item BLUE_EXTRACT = registerItem("blue_extract", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.BLUE_EXTRACT_STATUS_EFFECT, 12000), 20));
	public static final Item BLUEBERRY = registerItem("blueberry", new TreatItem(25, new BeeType[]{BeeType.BUMBLE, BeeType.COOL, BeeType.BUBBLE, BeeType.BUCKO, BeeType.FROSTY, BeeType.DIAMOND, BeeType.MUSIC, BeeType.BUOYANT, BeeType.TADPOLE}));
	public static final Item BOX_O_FROGS = registerItem("box_o_frogs", new Item(new Item.Settings().maxCount(15)));
	public static final Item BROKEN_DRIVE = registerItem("broken_drive", new Item(new Item.Settings()));
	public static final Item CAUSTIC_WAX = registerItem("caustic_wax", new WaxItem());
	public static final Item CLOUD_VIAL = registerItem("cloud_vial", new Item(new Item.Settings().maxCount(10)));
	public static final Item COCONUT = registerItem("coconut", new Item(new Item.Settings().maxCount(500)));
	public static final Item COG = registerItem("cog", new Item(new Item.Settings()));
	public static final Item COMFORTING_VIAL = registerItem("comforting_vial", new ConsumableItem(new Item.Settings().maxCount(10), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.COMFORTING_NECTAR_STATUS_EFFECT, 288000), 20, true));
	public static final Item DEBUG_WAX = registerItem("debug_wax", new WaxItem());
	public static final Item DIAMOND_EGG = registerItem("diamond_egg", new Item(new Item.Settings()));
	public static final Item ENZYMES = registerItem("enzymes", new ConsumableItem(new Item.Settings(), UseAction.EAT, new StatusEffectInstance(ModStatusEffects.ENZYMES_STATUS_EFFECT, 12000), 20));
	public static final Item EVICTION = registerItem("eviction", new Item(new Item.Settings()));
	public static final Item FESTIVE_BEAN = registerItem("festive_bean", new Item(new Item.Settings()));
	public static final Item FIELD_DICE = registerItem("field_dice", new Item(new Item.Settings()));
	public static final Item GIFTED_DIAMOND_EGG = registerItem("gifted_diamond_egg", new Item(new Item.Settings()));
	public static final Item GIFTED_GOLD_EGG = registerItem("gifted_gold_egg", new Item(new Item.Settings()));
	public static final Item GIFTED_MYTHIC_EGG = registerItem("gifted_mythic_egg", new Item(new Item.Settings()));
	public static final Item GIFTED_SILVER_EGG = registerItem("gifted_silver_egg", new Item(new Item.Settings()));
	public static final Item GINGERBREAD_BEAR = registerItem("gingerbread_bear", new TreatItem(250, 0.01f));
	public static final Item GLITCHED_DRIVE = registerItem("glitched_drive", new DriveItem(ModStatusEffects.GLITCHED_DRIVE_STATUS_EFFECT));
	public static final Item GLITTER = registerItem("glitter", new Item(new Item.Settings()));
	public static final Item GLUE = registerItem("glue", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.GLUE_STATUS_EFFECT, 12000), 20, true));
	public static final Item GOLD_EGG = registerItem("gold_egg", new Item(new Item.Settings()));
	public static final Item GUMDROPS = registerItem("gumdrops", new GumdropsItem());
	public static final Item HARD_WAX = registerItem("hard_wax", new WaxItem());
	public static final Item HONEYSUCKLE = registerItem("honeysuckle", new Item(new Item.Settings()));
	public static final Item INVIGORATING_VIAL = registerItem("invigorating_vial", new ConsumableItem(new Item.Settings().maxCount(10), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.INVIGORATING_NECTAR_STATUS_EFFECT, 288000), 20, true));
	public static final Item JELLY_BEANS = registerItem("jelly_beans", new Item(new Item.Settings().maxCount(100)));
	public static final Item LOADED_DICE = registerItem("loaded_dice", new Item(new Item.Settings().maxCount(25)));
	public static final Item MAGIC_BEAN = registerItem("magic_bean", new Item(new Item.Settings()));
	public static final Item MARSHMALLOW_BEE = registerItem("marshmallow_bee", new ConsumableItem(new Item.Settings().maxCount(25), UseAction.EAT, new StatusEffectInstance(ModStatusEffects.MARSHMALLOW_BEE_STATUS_EFFECT, 36000), 20));
	public static final Item MICRO_CONVERTER = registerItem("micro_converter", new Item(new Item.Settings().maxCount(15)));
	public static final Item MOON_CHARM = registerItem("moon_charm", new TreatItem(250, 0f));
	public static final Item MOTIVATING_VIAL = registerItem("motivating_vial", new ConsumableItem(new Item.Settings().maxCount(10), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.MOTIVATING_NECTAR_STATUS_EFFECT, 288000), 20, true));
	public static final Item MYTHIC_EGG = registerItem("mythic_egg", new Item(new Item.Settings()));
	public static final Item NECTAR_SHOWER_VIAL = registerItem("nectar_shower_vial", new NectarShowerVialItem());
	public static final Item NECTAR_TESTER = registerItem("nectar_tester", new NectarTesterItem());
	public static final Item NEONBERRY = registerItem("neonberry", new TreatItem(500, 0f));
	public static final Item NIGHT_BELL = registerItem("night_bell", new NightBellItem(new Item.Settings()));
	public static final Item OIL = registerItem("oil", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.OIL_STATUS_EFFECT, 12000, 0), 20, true));
	public static final Item PINEAPPLE = registerItem("pineapple", new TreatItem(25, new BeeType[]{BeeType.BRAVE, BeeType.HASTY, BeeType.EXHAUSTED, BeeType.FIRE, BeeType.HONEY, BeeType.SHOCKED, BeeType.DEMON, BeeType.LION, BeeType.FUZZY}));
	public static final Item PINK_BALLON = registerItem("pink_ballon", new Item(new Item.Settings().maxCount(25)));
	public static final Item PLASTIC_EGG = registerItem("plastic_egg", new Item(new Item.Settings().maxCount(3)));
	public static final Item PRESENT = registerItem("present", new Item(new Item.Settings()));
	public static final Item PURPLE_POTION = registerItem("purple_potion", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.PURPLE_POTION_STATUS_EFFECT, 18000), 20, true));
	public static final Item RED_BALLON = registerItem("red_ballon", new Item(new Item.Settings().maxCount(25)));
	public static final Item RED_DRIVE = registerItem("red_drive", new DriveItem(ModStatusEffects.RED_DRIVE_STATUS_EFFECT));
	public static final Item RED_EXTRACT = registerItem("red_extract", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.RED_EXTRACT_STATUS_EFFECT, 12000), 20));
	public static final Item REFRESHING_VIAL = registerItem("refreshing_vial", new ConsumableItem(new Item.Settings().maxCount(10), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.REFRESHING_NECTAR_STATUS_EFFECT, 288000), 20, true));
	public static final Item ROBO_PASS = registerItem("robo_pass", new Item(new Item.Settings().maxCount(10)));
	public static final Item ROYAL_JELLY = registerItem("royal_jelly", new Item(new Item.Settings()));
	public static final Item SATISFYING_VIAL = registerItem("satisfying_vial", new ConsumableItem(new Item.Settings().maxCount(10), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.SATISFYING_NECTAR_STATUS_EFFECT, 288000), 20, true));
	public static final Item SILVER_EGG = registerItem("silver_egg", new Item(new Item.Settings()));
	public static final Item SMOOTH_DICE = registerItem("smooth_dice", new Item(new Item.Settings()));
	public static final Item SNOWFLAKE = registerItem("snowflake", new Item(new Item.Settings()));
	public static final Item SOFT_WAX = registerItem("soft_wax", new WaxItem());
	public static final Item SPIRIT_PETAL = registerItem("spirit_petal", new Item(new Item.Settings()));
	public static final Item STAR_EGG = registerItem("star_egg", new Item(new Item.Settings()));
	public static final Item STAR_JELLY = registerItem("star_jelly", new Item(new Item.Settings()));
	public static final Item STAR_TREAT = registerItem("star_treat", new TreatItem(1000, 1f));
	public static final Item STINGER = registerItem("stinger", new ConsumableItem(new Item.Settings(), UseAction.NONE, new StatusEffectInstance(ModStatusEffects.STINGER_STATUS_EFFECT, 600), 20));
	public static final Item STRAWBERRY = registerItem("strawberry", new TreatItem(25, new BeeType[]{BeeType.RAD, BeeType.RASCAL, BeeType.STUBBORN, BeeType.RAGE, BeeType.RILEY, BeeType.BABY, BeeType.SHY, BeeType.SPICY}));
	public static final Item SUNFLOWER_SEED = registerItem("sunflower_seed", new TreatItem(25, new BeeType[]{BeeType.BASIC, BeeType.BOMBER, BeeType.LOOKER, BeeType.COMMANDER, BeeType.DEMO, BeeType.CARPENTER, BeeType.NINJA, BeeType.VECTOR, BeeType.PRECISE}));
	public static final Item SUPER_SMOOTHIE = registerItem("super_smoothie", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.SUPER_SMOOTHIE_STATUS_EFFECT, 24000), 24000));
	public static final Item SWIRLED_WAX = registerItem("swirled_wax", new WaxItem());
	public static final Item TICKET = registerItem("ticket", new Item(new Item.Settings()));
	public static final Item TRANSLATOR = registerItem("translator", new Item(new Item.Settings()));
	public static final Item TREAT = registerItem("treat", new TreatItem(10, 0f));
	public static final Item TROPICAL_DRINK = registerItem("tropical_drink", new ConsumableItem(new Item.Settings(), UseAction.DRINK, new StatusEffectInstance(ModStatusEffects.TROPICAL_DRINK_STATUS_EFFECT, 12000), 20));
	public static final Item TURPENTINE = registerItem("turpentine", new Item(new Item.Settings().maxCount(25)));
	public static final Item WHIRLIGIG = registerItem("whirligig", new Item(new Item.Settings().maxCount(100)));
	public static final Item WHITE_BALLON = registerItem("white_ballon", new Item(new Item.Settings().maxCount(25)));
	public static final Item WHITE_DRIVE = registerItem("white_drive", new DriveItem(ModStatusEffects.WHITE_DRIVE_STATUS_EFFECT));

	// Music Discs
	public static final Item ANTMARCH1_MUSIC_DISC = registerItem("music_disc_antmarch1", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.ANTMARCH1_KEY).rarity(Rarity.EPIC)));
	public static final Item BPATROL_MUSIC_DISC = registerItem("music_disc_bpatrol", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.BPATROL_KEY).rarity(Rarity.EPIC)));
	public static final Item CRAWLERS_MUSIC_DISC = registerItem("music_disc_crawlers", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.CRAWLERS_KEY).rarity(Rarity.EPIC)));
	public static final Item DIGITIZE_MUSIC_DISC = registerItem("music_disc_digitize", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.DIGITIZE_KEY).rarity(Rarity.EPIC)));
	public static final Item DRONE_MUSIC_DISC = registerItem("music_disc_drone", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.DRONE_KEY).rarity(Rarity.EPIC)));
	public static final Item GBTUNE1_MUSIC_DISC = registerItem("music_disc_gbtune1", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.GBTUNE1_KEY).rarity(Rarity.EPIC)));
	public static final Item HIBERNATION1_MUSIC_DISC = registerItem("music_disc_hibernation1", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.HIBERNATION1_KEY).rarity(Rarity.EPIC)));
	public static final Item MOUNTAINCALL_MUSIC_DISC = registerItem("music_disc_mountaincall", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.MOUNTAINCALL_KEY).rarity(Rarity.EPIC)));
	public static final Item NECTAR_MUSIC_DISC = registerItem("music_disc_nectar", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.NECTAR_KEY).rarity(Rarity.EPIC)));
	public static final Item OVERFLOWIN4_MUSIC_DISC = registerItem("music_disc_overflowin4", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.OVERFLOWIN4_KEY).rarity(Rarity.EPIC)));
	public static final Item RBCLOADING_MUSIC_DISC = registerItem("music_disc_rbcloading", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.RBCLOADING_KEY).rarity(Rarity.EPIC)));
	public static final Item STARHALL_MUSIC_DISC = registerItem("music_disc_starhall", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.STARHALL_KEY).rarity(Rarity.EPIC)));
	public static final Item STICKBUG_MUSIC_DISC = registerItem("music_disc_stickbug", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.STICKBUG_KEY).rarity(Rarity.EPIC)));
	public static final Item VENDOR_MUSIC_DISC = registerItem("music_disc_vendor", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.VENDOR_KEY).rarity(Rarity.EPIC)));
	public static final Item WAX_MUSIC_DISC = registerItem("music_disc_wax", new Item(new Item.Settings().maxCount(1).jukeboxPlayable(ModSounds.WAX_KEY).rarity(Rarity.EPIC)));


	// Tools
	public static final Item SCOOPER = registerItem("scooper", new CollectToolItem(-1, 0.8f, 2, new BlockPos[]{
			new BlockPos(0, 0, -1),
			new BlockPos(0, 0, 0)
	}, true, "item.mine_swarm_simulator.scooper.desc"
	));

	public static final Item RAKE = registerItem("rake", new CollectToolItem(-1, 0.7f, 2, new BlockPos[]{
			new BlockPos(0, 0, -2),
			new BlockPos(0, 0, -1),
			new BlockPos(0, 0, 0)
	}, true, "item.mine_swarm_simulator.rake.desc"
	));

	public static final Item CLIPPERS = registerItem("clippers", new CollectToolItem(-1, 0.6f, 9, new BlockPos[]{
			new BlockPos(0, 0, 0)
	}, false, "item.mine_swarm_simulator.clippers.desc"
	));

	public static final Item MAGNET = registerItem("magnet", new CollectToolItem(-1, 0.8f, 2, new BlockPos[]{
			new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1),
			new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0),
			new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1)
	}, false, "item.mine_swarm_simulator.magnet.desc"
	));

	public static final Item VACUUM = registerItem("vacuum", new CollectToolItem(-1, 0.8f, 2, new BlockPos[]{
			new BlockPos(0, 0, -2),
			new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1),
			new BlockPos(-2, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0), new BlockPos(2, 0, 0),
			new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1),
			new BlockPos(0, 0, 2)
	}, false, "item.mine_swarm_simulator.vacuum.desc"
	));

	public static final Item SUPER_SCOOPER = registerItem("super_scooper", new CollectToolItem(-1, 0.5f, 4, new BlockPos[]{
			new BlockPos(0, 0, -4),
			new BlockPos(0, 0, -3),
			new BlockPos(0, 0, -2),
			new BlockPos(0, 0, -1),
			new BlockPos(0, 0, 0)
	}, true, "item.mine_swarm_simulator.super_scooper.desc"
	));

	public static final Item PULSAR = registerItem("pulsar", new CollectToolItem(-1, 1f, 2, new BlockPos[]{
			new BlockPos(0, 0, -3),
			new BlockPos(-2, 0, -2), new BlockPos(-1, 0, -2), new BlockPos(0, 0, -2), new BlockPos(1, 0, -2), new BlockPos(2, 0, -2),
			new BlockPos(-2, 0, -1), new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1), new BlockPos(2, 0, -1),
			new BlockPos(-3, 0, 0), new BlockPos(-2, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0), new BlockPos(2, 0, 0), new BlockPos(3, 0, 0),
			new BlockPos(-2, 0, 1), new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1), new BlockPos(2, 0, 1),
			new BlockPos(-2, 0, 2), new BlockPos(-1, 0, 2), new BlockPos(0, 0, 2), new BlockPos(1, 0, 2), new BlockPos(2, 0, 2),
			new BlockPos(0, 0, 3)
	}, false, "item.mine_swarm_simulator.pulsar.desc"
	));

	public static final Item ELECTRO_MAGNET = registerItem("electro_magnet", new CollectToolItem(-1, 0.5f, 4, new BlockPos[]{
			new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1),
			new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0),
			new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1)
	}, false, "item.mine_swarm_simulator.electro_magnet.desc"
	));

	public static final Item SCISSORS = registerItem("scissors", new ScissorsItem());

	public static final Item HONEY_DIPPER = registerItem("honey_dipper", new CollectToolItem(-1, 0.9f, 2, new BlockPos[]{
			new BlockPos(0, 0, -4),
			new BlockPos(-2, 0, -3), new BlockPos(-1, 0, -3), new BlockPos(0, 0, -3), new BlockPos(1, 0, -3), new BlockPos(2, 0, -3),
			new BlockPos(-3, 0, -2), new BlockPos(-2, 0, -2), new BlockPos(-1, 0, -2), new BlockPos(0, 0, -2), new BlockPos(1, 0, -2), new BlockPos(2, 0, -2), new BlockPos(3, 0, -2),
			new BlockPos(-3, 0, -1), new BlockPos(-2, 0, -1), new BlockPos(-1, 0, -1), new BlockPos(0, 0, -1), new BlockPos(1, 0, -1), new BlockPos(2, 0, -1), new BlockPos(3, 0, -1),
			new BlockPos(-4, 0, 0), new BlockPos(-3, 0, 0), new BlockPos(-2, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 0), new BlockPos(1, 0, 0), new BlockPos(2, 0, 0), new BlockPos(3, 0, 0), new BlockPos(4, 0, 0),
			new BlockPos(-3, 0, 1), new BlockPos(-2, 0, 1), new BlockPos(-1, 0, 1), new BlockPos(0, 0, 1), new BlockPos(1, 0, 1), new BlockPos(2, 0, 1), new BlockPos(3, 0, 1),
			new BlockPos(-3, 0, 2), new BlockPos(-2, 0, 2), new BlockPos(-1, 0, 2), new BlockPos(0, 0, 2), new BlockPos(1, 0, 2), new BlockPos(2, 0, 2), new BlockPos(3, 0, 2),
			new BlockPos(-2, 0, 3), new BlockPos(-1, 0, 3), new BlockPos(0, 0, 3), new BlockPos(1, 0, 3), new BlockPos(2, 0, 3),
			new BlockPos(0, 0, 4)
	}, false, "item.mine_swarm_simulator.honey_dipper.desc"
	));

	public static final Item BUBBLE_WAND = registerItem("bubble_wand", new BubbleWandItem());
	public static final Item SCYTHE = registerItem("scythe", new ScytheItem());
	//public static final Item STICKER_SEEKER = registerItem("sticker_seeker", new HoeItem(ToolMaterials.WOOD, new Item.Settings()));
	public static final Item GOLDEN_RAKE = registerItem("golden_rake", new GoldenRakeItem());
	public static final Item SPARK_STAFF = registerItem("spark_staff", new SparkStaffItem());
	public static final Item PORCELAIN_DIPPER = registerItem("porcelain_dipper", new PorcelainDipperItem());
	public static final Item PETAL_WAND = registerItem("petal_wand", new PetalWandItem());
	public static final Item DARK_SCYTHE = registerItem("dark_scythe", new DarkScytheItem());
	public static final Item TIDE_POPPER = registerItem("tide_popper", new TidePopperItem());
	public static final Item GUMMYBALLER = registerItem("gummyballer", new GummyballerItem());



	// Armor/Trinkets Items
	public static final Item BRAVE_GUARD = registerItem("brave_guard", new BraveGuardItem());
	public static final Item HASTY_GUARD = registerItem("hasty_guard", new HastyGuardItem());
	public static final Item BOMBER_GUARD = registerItem("bomber_guard", new BomberGuardItem());
	public static final Item LOOKER_GUARD = registerItem("looker_guard", new LookerGuardItem());
	public static final Item BLUE_GUARD = registerItem("blue_guard", new BlueGuardItem());
	public static final Item ELITE_BLUE_GUARD = registerItem("elite_blue_guard", new EliteBlueGuardItem());
	public static final Item BUCKO_GUARD = registerItem("bucko_guard", new BuckoGuardItem());
	public static final Item COBALT_GUARD = registerItem("cobalt_guard", new CobaltGuardItem());
	public static final Item RED_GUARD = registerItem("red_guard", new RedGuardItem());
	public static final Item ELITE_RED_GUARD = registerItem("elite_red_guard", new EliteRedGuardItem());
	public static final Item RILEY_GUARD = registerItem("riley_guard", new RileyGuardItem());
	public static final Item CRIMSON_GUARD = registerItem("crimson_guard", new CrimsonGuardItem());



	public static final Item HELMET = registerItem("helmet", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "helmet.pollen"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "helmet.defense"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		),
		ArmorModelHandler.HELMET,
		"textures/models/armor/helmet.png"));

	public static final Item STRANGE_GOGGLES = registerItem("strange_goggles", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "strange_goggles.capacity"),
				77d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "strange_goggles.defense"),
				0.07d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		),
		ArmorModelHandler.STRANGE_GOGGLES,
		"textures/models/armor/strange_goggles.png"));

	public static final Item PROPELLER_HAT = registerItem("propeller_hat", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "propeller_hat.pollen"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "propeller_hat.bee_ability_rate"),
				0.05d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "propeller_hat.defense"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			EntityAttributes.GENERIC_JUMP_STRENGTH, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "propeller_hat.jump_strength"),
				0.00805d * 10d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		),
		ArmorModelHandler.PROPELLER_HAT,
		"textures/models/armor/propeller_hat.png"));

	public static final Item BEEKEEPER_MASK = registerItem("beekeeper_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_mask.pollen"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_GATHER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_mask.bee_ability_rate"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_mask.defense"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_mask.defense"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		),
		ArmorModelHandler.BEEKEEPER_MASK,
		"textures/models/armor/beekeeper_mask.png"));

	public static final Item HONEY_MASK = registerItem("honey_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_GATHER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.bee_gather_pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.capacity_multiplier"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.honey_from_tokens"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.bonus_convert_amount"),
				80d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.defense"),
				0.3d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honey_mask.bee_ability_rate"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.COIN_SCATTER}))
		),
		ArmorModelHandler.HONEY_MASK,
		"textures/models/armor/honey_mask.png"));

	public static final Item BUBBLE_MASK = registerItem("bubble_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_BLUE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bubble_mask.blue_pollen"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bubble_mask.capacity_multiplier"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BLUE_FIELD_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bubble_mask.blue_field_capacity"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BUBBLE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bubble_mask.bubble_pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bubble_mask.defense"),
				0.3d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bubble_mask.bee_ability_rate"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.BUBBLE_BOMBS}))
		),
		ArmorModelHandler.BUBBLE_MASK,
		"textures/models/armor/bubble_mask.png"));

	public static final Item FIRE_MASK = registerItem("fire_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_RED_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.red_pollen"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.capacity_multiplier"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_INSTANT_RED_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.instant_red_conversion"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_INSTANT_FLAME_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.instant_flame_conversion"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.bee_attack_multiplier"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.defense"),
				0.35d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "fire_mask.bee_ability_rate"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.IGNITE}))
		),
		ArmorModelHandler.FIRE_MASK,
		"textures/models/armor/fire_mask.png"));

	public static final Item DEMON_MASK = registerItem("demon_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_RED_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.red_pollen"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.capacity_multiplier"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_RED_FIELD_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.red_field_capacity"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_INSTANT_RED_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.instant_red_conversion"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_INSTANT_FLAME_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.instant_flame_conversion"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_FLAME_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.flame_pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.bee_attack_multiplier"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.defense"),
				0.35d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "demon_mask.bee_ability_rate"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.IGNITE, Passives.X_FLAME}))
		),
		ArmorModelHandler.DEMON_MASK,
		"textures/models/armor/demon_mask.png"));

	public static final Item DIAMOND_MASK = registerItem("diamond_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_BLUE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.blue_pollen"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.instant_blue_conversion"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.capacity_multiplier"),
				2d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BUBBLE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.bubble_pollen"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.defense"),
				0.35d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "diamond_mask.bee_ability_rate"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.BUBBLE_BOMBS, Passives.DIAMOND_DRAIN}))
		),
		ArmorModelHandler.DIAMOND_MASK,
		"textures/models/armor/diamond_mask.png"));

	public static final Item GUMMY_MASK = registerItem("gummy_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_GOO, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.goo"),
				0.75d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_GOO_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.goo_conversion"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_WHITE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.white_pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.capacity_multiplier"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_WHITE_FIELD_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.white_field_capacity"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_DEFENSE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.defense"),
				0.3d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_mask.bee_ability_rate"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.COIN_SCATTER, Passives.GUMMY_MORPH}))
		),
		ArmorModelHandler.GUMMY_MASK,
		"textures/models/armor/gummy_mask.png"));

	public static final Item BBM_MASK = registerItem("bbm_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bbm_mask.capacity"),
				75000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bbm_mask.bonus_convert_amount"),
				25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bbm_mask.honey_from_tokens"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BLUE_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "bbm_mask.blue_bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		),
		ArmorModelHandler.BBM_MASK,
		"textures/models/armor/bbm_mask.png"));

	public static final Item MONDO_BBM_MASK = registerItem("mondo_bbm_mask", new ModelArmorItem(
		ArmorItem.Type.HELMET,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_bbm_mask.capacity"),
				250000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_bbm_mask.bonus_convert_amount"),
				50d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_bbm_mask.honey_from_tokens"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).add(
			ModAttributes.PLAYER_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_bbm_mask.bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.HEAD).build()
		),
		ArmorModelHandler.MONDO_BBM_MASK,
		"textures/models/armor/mondo_bbm_mask.png"));


	public static final Item BELT_POCKET = registerItem("belt_pocket", new ModelArmorItem(
		ArmorItem.Type.LEGGINGS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "belt_pocket.capacity"),
				5000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "belt_pocket.bonus_convert_amount"),
				10d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_LOOT_LUCK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "belt_pocket.loot_luck"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).build()
		),
		ArmorModelHandler.BELT_POCKET,
		"textures/models/armor/belt_pocket.png"));

	public static final Item BELT_BAG = registerItem("belt_bag", new ModelArmorItem(
		ArmorItem.Type.LEGGINGS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "belt_bag.capacity"),
				25000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "belt_bag.bonus_convert_amount"),
				20d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_LOOT_LUCK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "belt_bag.loot_luck"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).build()
		),
		ArmorModelHandler.BELT_BAG,
		"textures/models/armor/belt_bag.png"));

	public static final Item MONDO_BELT_BAG = registerItem("mondo_belt_bag", new ModelArmorItem(
		ArmorItem.Type.LEGGINGS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_belt_bag.capacity"),
				100000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_belt_bag.bonus_convert_amount"),
				50d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_LOOT_LUCK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_belt_bag.loot_luck"),
				0.75d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BUZZ_BOMB_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_belt_bag.buzz_bomb_pollen"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_COLORLESS_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mondo_belt_bag.colorless_bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).build()
		),
		ArmorModelHandler.MONDO_BELT_BAG,
		"textures/models/armor/mondo_belt_bag.png"));

	public static final Item HONEYCOMB_BELT = registerItem("honeycomb_belt", new ModelArmorItem(
		ArmorItem.Type.LEGGINGS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.capacity"),
				150000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.capacity_multiplier"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.bonus_convert_amount"),
				75d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_LOOT_LUCK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.loot_luck"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BUZZ_BOMB_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.buzz_bomb_pollen"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.honey_from_tokens"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_COLORLESS_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "honeycomb_belt.colorless_bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).build()),
		ArmorModelHandler.HONEYCOMB_BELT,
		"textures/models/armor/honeycomb_belt.png"));

	public static final Item PETAL_BELT = registerItem("petal_belt", new ModelArmorItem(
		ArmorItem.Type.LEGGINGS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.capacity"),
				250000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.capacity_multiplier"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.bonus_convert_amount"),
				100d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_LOOT_LUCK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.loot_luck"),
				1.01d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.honey_from_tokens"),
				0.75d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BUZZ_BOMB_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.buzz_bomb_pollen"),
				0.3d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_COLORLESS_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "petal_belt.colorless_bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.PETAL_STORM}))
		),
		ArmorModelHandler.PETAL_BELT,
		"textures/models/armor/petal_belt.png"));

	public static final Item COCONUT_BELT = registerItem("coconut_belt", new ModelArmorItem(
		ArmorItem.Type.LEGGINGS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.capacity"),
				350000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_CAPACITY_MULTIPLIER, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.capacity_multiplier"),
				0.75d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.bonus_convert_amount"),
				120d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_LOOT_LUCK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.loot_luck"),
				1.02d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.honey_from_tokens"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_COCONUT_FIELD_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.coconut_field_pollen"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_GIFTED_BEE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.gifted_bee_pollen"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).add(
			ModAttributes.PLAYER_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_belt.bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.LEGS).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.PETAL_STORM, Passives.COMBO_COCONUTS}))
		),
		ArmorModelHandler.COCONUT_BELT,
		"textures/models/armor/coconut_belt.png"));



	public static final Item BASIC_BOOTS = registerItem("basic_boots", new ModelArmorItem(
		ArmorItem.Type.BOOTS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "basic_boots.movement_speed"),
				0.00579d * 4d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_MOVEMENT_COLLECTION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "basic_boots.movement_collection"),
				2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).build()),
		ArmorModelHandler.BASIC_BOOTS,
		"textures/models/armor/basic_boots.png"));

	public static final Item HIKING_BOOTS = registerItem("hiking_boots", new ModelArmorItem(
		ArmorItem.Type.BOOTS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "hiking_boots.movement_speed"),
				0.00579d * 5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_JUMP_STRENGTH, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "hiking_boots.jump_strength"),
				0.00805d * 10d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_MOVEMENT_COLLECTION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "hiking_boots.movement_collection"),
				6d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "hiking_boots.bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).build()),
		ArmorModelHandler.HIKING_BOOTS,
		"textures/models/armor/hiking_boots.png"));

	public static final Item BEEKEEPER_BOOTS = registerItem("beekeeper_boots", new ModelArmorItem(
		ArmorItem.Type.BOOTS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_BEE_GATHER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_boots.bee_gather_pollen"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_boots.movement_speed"),
				0.00579d * 6d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_JUMP_STRENGTH, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_boots.jump_strength"),
				0.00805d * 20d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_MOVEMENT_COLLECTION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_boots.movement_collection"),
				10d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "beekeeper_boots.bee_attack"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).build()),
		ArmorModelHandler.BEEKEEPER_BOOTS,
		"textures/models/armor/beekeeper_boots.png"));

	public static final Item COCONUT_CLOGS = registerItem("coconut_clogs", new ModelArmorItem(
		ArmorItem.Type.BOOTS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_clogs.pollen"),
				0.15d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_clogs.honey_from_tokens"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_clogs.bee_attack"),
				2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_clogs.movement_speed"),
				0.00579d * 7d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_JUMP_STRENGTH, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_clogs.jump_strength"),
				0.00805d * 22d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_MOVEMENT_COLLECTION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_clogs.movement_collection"),
				14d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.COCONUT_HASTE}))
		),
		ArmorModelHandler.COCONUT_CLOGS,
		"textures/models/armor/coconut_clogs.png"));

	public static final Item GUMMY_BOOTS = registerItem("gummy_boots", new ModelArmorItem(
		ArmorItem.Type.BOOTS,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_GOO, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.goo"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.pollen"),
				0.2d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_HONEY_FROM_TOKENS, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.honey_from_tokens"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_BEE_ATTACK, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.bee_attack"),
				3d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.movement_speed"),
				0.00579d * 9d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			EntityAttributes.GENERIC_JUMP_STRENGTH, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.jump_strength"),
				0.00805d * 22d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).add(
			ModAttributes.PLAYER_MOVEMENT_COLLECTION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "gummy_boots.movement_collection"),
				16d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.FEET).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.COCONUT_HASTE, Passives.GOO_TRAIL}))
		),
		ArmorModelHandler.GUMMY_BOOTS,
		"textures/models/armor/gummy_boots.png"));



	public static final Item POUCH = registerItem("pouch", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "pouch.capacity"),
				200d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.POUCH,
		"textures/models/armor/pouch.png"));

	public static final Item JAR = registerItem("jar", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "jar.capacity"),
				750d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.JAR,
		"textures/models/armor/jar.png"));

	public static final Item BACKPACK = registerItem("backpack", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "backpack.capacity"),
				3500d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.BACKPACK,
		"textures/models/armor/backpack.png"));

	public static final Item CANISTER = registerItem("canister", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "canister.capacity"),
				10000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "canister.convert_rate"),
				0.3d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.CANISTER,
		"textures/models/armor/canister.png"));

	public static final Item MEGA_JUG = registerItem("mega_jug", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mega_jug.capacity"),
				25000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "mega_jug.convert_rate"),
				0.4d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.MEGA_JUG,
		"textures/models/armor/mega_jug.png"));

	public static final Item COMPRESSOR = registerItem("compressor", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "compressor.capacity"),
				50000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "compressor.convert_rate"),
				0.55d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.COMPRESSOR,
		"textures/models/armor/compressor.png"));

	public static final Item ELITE_BARREL = registerItem("elite_barrel", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "elite_barrel.capacity"),
				125000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "elite_barrel.convert_rate"),
				0.7d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.ELITE_BARREL,
		"textures/models/armor/elite_barrel.png"));

	public static final Item PORT_O_HIVE = registerItem("port_o_hive", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "port_o_hive.capacity"),
				250000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "port_o_hive.convert_rate"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_INSTANT_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "port_o_hive.instant_conversion"),
				0.05d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.PORT_O_HIVE,
		"textures/models/armor/port_o_hive.png"));

	public static final Item RED_PORT_O_HIVE = registerItem("red_port_o_hive", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "red_port_o_hive.capacity"),
				400000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "red_port_o_hive.convert_rate"),
				1.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_RED_BEE_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "red_port_o_hive.red_bee_convert_rate"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_INSTANT_RED_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "red_port_o_hive.instant_red_conversion"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_RED_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "red_port_o_hive.red_pollen"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.PORT_O_HIVE,
		"textures/models/armor/red_port_o_hive.png"));

	public static final Item BLUE_PORT_O_HIVE = registerItem("blue_port_o_hive", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "blue_port_o_hive.capacity"),
				400000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "blue_port_o_hive.convert_rate"),
				1.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_BLUE_BEE_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "blue_port_o_hive.blue_bee_convert_rate"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "blue_port_o_hive.instant_blue_conversion"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_BLUE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "blue_port_o_hive.blue_pollen"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.PORT_O_HIVE,
		"textures/models/armor/blue_port_o_hive.png"));

	public static final Item PORCELAIN_PORT_O_HIVE = registerItem("porcelain_port_o_hive", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "porcelain_port_o_hive.capacity"),
				600000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "porcelain_port_o_hive.convert_rate"),
				2.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "porcelain_port_o_hive.convert_rate_at_hive"),
				0.25d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_INSTANT_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "porcelain_port_o_hive.instant_conversion"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_WHITE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "porcelain_port_o_hive.blue_pollen"),
				0.5d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		),
		ArmorModelHandler.PORCELAIN_PORT_O_HIVE,
		"textures/models/armor/porcelain_port_o_hive.png"));

	public static final Item COCONUT_CANISTER = registerItem("coconut_canister", new ModelArmorItem(
		ArmorItem.Type.CHESTPLATE,
		new Item.Settings().attributeModifiers(AttributeModifiersComponent.builder().add(
			ModAttributes.PLAYER_CAPACITY, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_canister.capacity"),
				1000000d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_canister.convert_rate"),
				4d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_canister.convert_rate_at_hive"),
				1.5d,
				EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_INSTANT_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_canister.instant_conversion"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_INSTANT_WHITE_CONVERSION, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_canister.instant_white_conversion"),
				0.1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).add(
			ModAttributes.PLAYER_WHITE_POLLEN, new EntityAttributeModifier(
				Identifier.of(MineSwarmSimulator.MOD_ID, "coconut_canister.white_pollen"),
				1d,
				EntityAttributeModifier.Operation.ADD_VALUE),
			AttributeModifierSlot.CHEST).build()
		).component(
			ModComponents.PASSIVES_COMPONENT,
			new PassivesComponent(List.of(new PassivesComponent.Passive[]{Passives.INSPIRE_COCONUTS, Passives.EMERGENCY_COCONUT_SHIELD}))
		),
		ArmorModelHandler.COCONUT_CANISTER,
		"textures/models/armor/coconut_canister.png"));


	// Amulets
	public static final Item KING_BEETLE_AMULET = registerItem("king_beetle_amulet", new ModelTrinketItem(new Item.Settings(), "king_beetle_amulet", ArmorModelHandler.KING_BEETLE_AMULET, "textures/models/armor/king_beetle_amulet.png"));
	public static final Item BRONZE_ANT_AMULET = registerItem("bronze_ant_amulet", new ModelTrinketItem(new Item.Settings(), "ant_amulet", ArmorModelHandler.ANT_AMULET, "textures/models/armor/bronze_ant_amulet.png"));
	public static final Item SILVER_ANT_AMULET = registerItem("silver_ant_amulet", new ModelTrinketItem(new Item.Settings(), "ant_amulet", ArmorModelHandler.ANT_AMULET, "textures/models/armor/silver_ant_amulet.png"));
	public static final Item GOLD_ANT_AMULET = registerItem("gold_ant_amulet", new ModelTrinketItem(new Item.Settings(), "ant_amulet", ArmorModelHandler.ANT_AMULET, "textures/models/armor/gold_ant_amulet.png"));
	public static final Item DIAMOND_ANT_AMULET = registerItem("diamond_ant_amulet", new ModelTrinketItem(new Item.Settings(), "ant_amulet", ArmorModelHandler.ANT_AMULET, "textures/models/armor/diamond_ant_amulet.png"));
	public static final Item SUPREME_ANT_AMULET = registerItem("supreme_ant_amulet", new ModelTrinketItem(new Item.Settings(), "ant_amulet", ArmorModelHandler.SUPREME_ANT_AMULET, "textures/models/armor/supreme_ant_amulet.png"));
	public static final Item MOON_AMULET = registerItem("moon_amulet", new ModelTrinketItem(new Item.Settings(), "moon_amulet", ArmorModelHandler.MOON_AMULET, "textures/models/armor/moon_amulet.png"));
	public static final Item BRONZE_STICK_BUG_AMULET = registerItem("bronze_stick_bug_amulet", new ModelTrinketItem(new Item.Settings(), "stick_bug_amulet", ArmorModelHandler.STICK_BUG_AMULET, "textures/models/armor/bronze_stick_bug_amulet.png"));
	public static final Item SILVER_STICK_BUG_AMULET = registerItem("silver_stick_bug_amulet", new ModelTrinketItem(new Item.Settings(), "stick_bug_amulet", ArmorModelHandler.STICK_BUG_AMULET, "textures/models/armor/silver_stick_bug_amulet.png"));
	public static final Item GOLD_STICK_BUG_AMULET = registerItem("gold_stick_bug_amulet", new ModelTrinketItem(new Item.Settings(), "stick_bug_amulet", ArmorModelHandler.STICK_BUG_AMULET, "textures/models/armor/gold_stick_bug_amulet.png"));
	public static final Item DIAMOND_STICK_BUG_AMULET = registerItem("diamond_stick_bug_amulet", new ModelTrinketItem(new Item.Settings(), "stick_bug_amulet", ArmorModelHandler.STICK_BUG_AMULET, "textures/models/armor/diamond_stick_bug_amulet.png"));
	public static final Item BRONZE_STAR_AMULET = registerItem("bronze_star_amulet", new ModelTrinketItem(new Item.Settings(), "star_amulet", ArmorModelHandler.STAR_AMULET, "textures/models/armor/bronze_star_amulet.png"));
	public static final Item SILVER_STAR_AMULET = registerItem("silver_star_amulet", new ModelTrinketItem(new Item.Settings(), "star_amulet", ArmorModelHandler.STAR_AMULET, "textures/models/armor/silver_star_amulet.png"));
	public static final Item GOLD_STAR_AMULET = registerItem("gold_star_amulet", new ModelTrinketItem(new Item.Settings(), "star_amulet", ArmorModelHandler.STAR_AMULET, "textures/models/armor/gold_star_amulet.png"));
	public static final Item DIAMOND_STAR_AMULET = registerItem("diamond_star_amulet", new ModelTrinketItem(new Item.Settings(), "star_amulet", ArmorModelHandler.STAR_AMULET, "textures/models/armor/diamond_star_amulet.png"));
	public static final Item SUPREME_STAR_AMULET = registerItem("supreme_star_amulet", new ModelTrinketItem(new Item.Settings(), "star_amulet", ArmorModelHandler.STAR_AMULET, "textures/models/armor/supreme_star_amulet.png"));
	public static final Item BRONZE_SHELL_AMULET = registerItem("bronze_shell_amulet", new ModelTrinketItem(new Item.Settings(), "shell_amulet", ArmorModelHandler.SHELL_AMULET, "textures/models/armor/bronze_shell_amulet.png"));
	public static final Item SILVER_SHELL_AMULET = registerItem("silver_shell_amulet", new ModelTrinketItem(new Item.Settings(), "shell_amulet", ArmorModelHandler.SHELL_AMULET, "textures/models/armor/silver_shell_amulet.png"));
	public static final Item GOLD_SHELL_AMULET = registerItem("gold_shell_amulet", new ModelTrinketItem(new Item.Settings(), "shell_amulet", ArmorModelHandler.SHELL_AMULET, "textures/models/armor/gold_shell_amulet.png"));
	public static final Item DIAMOND_SHELL_AMULET = registerItem("diamond_shell_amulet", new ModelTrinketItem(new Item.Settings(), "shell_amulet", ArmorModelHandler.SHELL_AMULET, "textures/models/armor/diamond_shell_amulet.png"));
	public static final Item SUPREME_SHELL_AMULET = registerItem("supreme_shell_amulet", new ModelTrinketItem(new Item.Settings(), "shell_amulet", ArmorModelHandler.SHELL_AMULET, "textures/models/armor/supreme_shell_amulet.png"));
	public static final Item BRONZE_COG_AMULET = registerItem("bronze_cog_amulet", new ModelTrinketItem(new Item.Settings(), "cog_amulet", ArmorModelHandler.COG_AMULET, "textures/models/armor/bronze_cog_amulet.png"));
	public static final Item SILVER_COG_AMULET = registerItem("silver_cog_amulet", new ModelTrinketItem(new Item.Settings(), "cog_amulet", ArmorModelHandler.COG_AMULET, "textures/models/armor/silver_cog_amulet.png"));
	public static final Item GOLD_COG_AMULET = registerItem("gold_cog_amulet", new ModelTrinketItem(new Item.Settings(), "cog_amulet", ArmorModelHandler.COG_AMULET, "textures/models/armor/gold_cog_amulet.png"));
	public static final Item DIAMOND_COG_AMULET = registerItem("diamond_cog_amulet", new ModelTrinketItem(new Item.Settings(), "cog_amulet", ArmorModelHandler.COG_AMULET, "textures/models/armor/diamond_cog_amulet.png"));
	public static final Item SUPREME_COG_AMULET = registerItem("supreme_cog_amulet", new ModelTrinketItem(new Item.Settings(), "cog_amulet", ArmorModelHandler.COG_AMULET, "textures/models/armor/supreme_cog_amulet.png"));


	// Beequips
	public static final Item BEEQUIP_CASE = registerItem("beequip_case", new BeequipCaseItem());
	public static final Item BEEQUIP_THIMBLE = registerItem("beequip_thimble", new BeequipItem());
	public static final Item BEEQUIP_SWEATBAND = registerItem("beequip_sweatband", new BeequipItem());
	public static final Item BEEQUIP_BANDAGE = registerItem("beequip_bandage", new BeequipItem());
	public static final Item BEEQUIP_THUMBTACK = registerItem("beequip_thumbtack", new BeequipItem());
	public static final Item BEEQUIP_CAMO_BANDANA = registerItem("beequip_camo_bandana", new BeequipItem());
	public static final Item BEEQUIP_BOTTLE_CAP = registerItem("beequip_bottle_cap", new BeequipItem());
	public static final Item BEEQUIP_KAZOO = registerItem("beequip_kazoo", new BeequipItem());
	public static final Item BEEQUIP_SMILEY_STICKER = registerItem("beequip_smiley_sticker", new BeequipItem());
	public static final Item BEEQUIP_WHISTLE = registerItem("beequip_whistle", new BeequipItem());
	public static final Item BEEQUIP_CHARM_BRACELET = registerItem("beequip_charm_bracelet", new BeequipItem());
	public static final Item BEEQUIP_PAPERCLIP = registerItem("beequip_paperclip", new BeequipItem());
	public static final Item BEEQUIP_BERET = registerItem("beequip_beret", new BeequipItem());
	public static final Item BEEQUIP_BANG_SNAP = registerItem("beequip_bang_snap", new BeequipItem());
	public static final Item BEEQUIP_BEAD_LIZARD = registerItem("beequip_bead_lizard", new BeequipItem());
	public static final Item BEEQUIP_PINK_SHADES = registerItem("beequip_pink_shades", new BeequipItem());
	public static final Item BEEQUIP_LEI = registerItem("beequip_lei", new BeequipItem());
	public static final Item BEEQUIP_DEMON_TALISMAN = registerItem("beequip_demon_talisman", new BeequipItem());
	public static final Item BEEQUIP_CAMPHOR_LIP_BALM = registerItem("beequip_camphor_lip_balm", new BeequipItem());
	public static final Item BEEQUIP_AUTUMN_SUNHAT = registerItem("beequip_autumn_sunhat", new BeequipItem());
	public static final Item BEEQUIP_ROSE_HEADBAND = registerItem("beequip_rose_headband", new BeequipItem());
	public static final Item BEEQUIP_PINK_ERASER = registerItem("beequip_pink_eraser", new BeequipItem());
	public static final Item BEEQUIP_CANDY_RING = registerItem("beequip_candy_ring", new BeequipItem());

	public static final Item BEEQUIP_ELF_CAP = registerItem("beequip_elf_cap", new BeequipItem());
	public static final Item BEEQUIP_SINGLE_MITTEN = registerItem("beequip_single_mitten", new BeequipItem());
	public static final Item BEEQUIP_WARM_SCARF = registerItem("beequip_warm_scarf", new BeequipItem());
	public static final Item BEEQUIP_PEPPERMINT_ANTENNAS = registerItem("beequip_peppermint_antennas", new BeequipItem());
	public static final Item BEEQUIP_BEESMAS_TOP = registerItem("beequip_beesmas_top", new BeequipItem());
	public static final Item BEEQUIP_PINECONE = registerItem("beequip_pinecone", new BeequipItem());
	public static final Item BEEQUIP_ICICLES = registerItem("beequip_icicles", new BeequipItem());
	public static final Item BEEQUIP_BEESMAS_TREE_HAT = registerItem("beequip_beesmas_tree_hat", new BeequipItem());
	public static final Item BEEQUIP_BUBBLE_LIGHT = registerItem("beequip_bubble_light", new BeequipItem());
	public static final Item BEEQUIP_SNOW_TIARA = registerItem("beequip_snow_tiara", new BeequipItem());
	public static final Item BEEQUIP_SNOWGLOBE = registerItem("beequip_snowglobe", new BeequipItem());
	public static final Item BEEQUIP_REINDEER_ANTLERS = registerItem("beequip_reindeer_antlers", new BeequipItem());
	public static final Item BEEQUIP_TOY_HORN = registerItem("beequip_toy_horn", new BeequipItem());
	public static final Item BEEQUIP_PAPER_ANGEL = registerItem("beequip_paper_angel", new BeequipItem());
	public static final Item BEEQUIP_TOY_DRUM = registerItem("beequip_toy_drum", new BeequipItem());
	public static final Item BEEQUIP_LUMP_OF_COAL = registerItem("beequip_lump_of_coal", new BeequipItem());
	public static final Item BEEQUIP_POINSETTIA = registerItem("beequip_poinsettia", new BeequipItem());
	public static final Item BEEQUIP_ELECTRIC_CANDLE = registerItem("beequip_electric_candle", new BeequipItem());
	public static final Item BEEQUIP_FESTIVE_WREATH = registerItem("beequip_festive_wreath", new BeequipItem());


	// Stickers
	public static final Item STICKER_BOOK = registerItem("sticker_book", new StickerBookItem());

	public static final Item STICKER_BROWN_CUB_SKIN = registerItem("sticker_brown_cub_skin", new StickerItem());
	public static final Item STICKER_ROBO_CUB_SKIN = registerItem("sticker_robo_cub_skin", new StickerItem());
	public static final Item STICKER_STICK_CUB_SKIN = registerItem("sticker_stick_cub_skin", new StickerItem());
	public static final Item STICKER_STAR_CUB_SKIN = registerItem("sticker_star_cub_skin", new StickerItem());
	public static final Item STICKER_NOOB_CUB_SKIN = registerItem("sticker_noob_cub_skin", new StickerItem());
	public static final Item STICKER_BEE_CUB_SKIN = registerItem("sticker_bee_cub_skin", new StickerItem());
	public static final Item STICKER_GINGERBREAD_CUB_SKIN = registerItem("sticker_gingerbread_cub_skin", new StickerItem());
	public static final Item STICKER_SNOW_CUB_SKIN = registerItem("sticker_snow_cub_skin", new StickerItem());
	public static final Item STICKER_PEPPERMINT_CUB_SKIN = registerItem("sticker_peppermint_cub_skin", new StickerItem());
	public static final Item STICKER_DOODLE_CUB_SKIN = registerItem("sticker_doodle_cub_skin", new StickerItem());
	public static final Item STICKER_GLOOMY_CUB_SKIN = registerItem("sticker_gloomy_cub_skin", new StickerItem());

	public static final Item STICKER_BASIC_RED_HIVE_SKIN = registerItem("sticker_basic_red_hive_skin", new StickerItem());
	public static final Item STICKER_BASIC_BLUE_HIVE_SKIN = registerItem("sticker_basic_blue_hive_skin", new StickerItem());
	public static final Item STICKER_BASIC_PINK_HIVE_SKIN = registerItem("sticker_basic_pink_hive_skin", new StickerItem());
	public static final Item STICKER_BASIC_GREEN_HIVE_SKIN = registerItem("sticker_basic_green_hive_skin", new StickerItem());
	public static final Item STICKER_BASIC_WHITE_HIVE_SKIN = registerItem("sticker_basic_white_hive_skin", new StickerItem());
	public static final Item STICKER_BASIC_BLACK_HIVE_SKIN = registerItem("sticker_basic_black_hive_skin", new StickerItem());
	public static final Item STICKER_WAVY_YELLOW_HIVE_SKIN = registerItem("sticker_wavy_yellow_hive_skin", new StickerItem());
	public static final Item STICKER_WAVY_CYAN_HIVE_SKIN = registerItem("sticker_wavy_cyan_hive_skin", new StickerItem());
	public static final Item STICKER_WAVY_PURPLE_HIVE_SKIN = registerItem("sticker_wavy_purple_hive_skin", new StickerItem());
	public static final Item STICKER_WAVY_FESTIVE_HIVE_SKIN = registerItem("sticker_wavy_festive_hive_skin", new StickerItem());
	public static final Item STICKER_WAVY_DOODLE_HIVE_SKIN = registerItem("sticker_wavy_doodle_hive_skin", new StickerItem());
	public static final Item STICKER_ICY_CROWNED_HIVE_SKIN = registerItem("sticker_icy_crowned_hive_skin", new StickerItem());

	public static final Item STICKER_BEAR_BEE_VOUCHER = registerItem("sticker_bear_bee_voucher", new StickerItem());
	public static final Item STICKER_CUB_BUDDY_VOUCHER = registerItem("sticker_cub_buddy_voucher", new StickerItem());
	public static final Item STICKER_BEE_GATHER_VOUCHER = registerItem("sticker_bee_gather_voucher", new StickerItem());
	public static final Item STICKER_CONVERT_SPEED_VOUCHER = registerItem("sticker_convert_speed_voucher", new StickerItem());

	public static final Item STICKER_PLAY_BUTTON = registerItem("sticker_play_button", new StickerItem());
	public static final Item STICKER_GAMER_CHAT_ICON = registerItem("sticker_gamer_chat_icon", new StickerItem());
	public static final Item STICKER_FLYING_RAD_BEE = registerItem("sticker_flying_rad_bee", new StickerItem());
	public static final Item STICKER_FLYING_NINJA_BEE = registerItem("sticker_flying_ninja_bee", new StickerItem());
	public static final Item STICKER_FLYING_BRAVE_BEE = registerItem("sticker_flying_brave_bee", new StickerItem());
	public static final Item STICKER_FLYING_PHOTON_BEE = registerItem("sticker_flying_photon_bee", new StickerItem());
	public static final Item STICKER_DROOPING_STUBBORN_BEE = registerItem("sticker_drooping_stubborn_bee", new StickerItem());
	public static final Item STICKER_WOBBLY_LOOKER_BEE = registerItem("sticker_wobbly_looker_bee", new StickerItem());
	public static final Item STICKER_BLOB_BUMBLE_BEE = registerItem("sticker_blob_bumble_bee", new StickerItem());
	public static final Item STICKER_ROUND_RASCAL_BEE = registerItem("sticker_round_rascal_bee", new StickerItem());
	public static final Item STICKER_ROUND_BASIC_BEE = registerItem("sticker_round_basic_bee", new StickerItem());
	public static final Item STICKER_DIAMOND_DIAMOND_BEE = registerItem("sticker_diamond_diamond_bee", new StickerItem());
	public static final Item STICKER_4_PRONGED_VECTOR_BEE = registerItem("sticker_4_pronged_vector_bee", new StickerItem());
	public static final Item STICKER_SHOCKED_HIVE_SLOT = registerItem("sticker_shocked_hive_slot", new StickerItem());
	public static final Item STICKER_BEAR_BEE_OFFER = registerItem("sticker_bear_bee_offer", new StickerItem());
	public static final Item STICKER_TABBY_SCRATCH = registerItem("sticker_tabby_scratch", new StickerItem());
	public static final Item STICKER_TABBY_FROM_BEHIND = registerItem("sticker_tabby_from_behind", new StickerItem());
	public static final Item STICKER_FUZZ_BOMB = registerItem("sticker_fuzz_bomb", new StickerItem());
	public static final Item STICKER_PRECISE_EYE = registerItem("sticker_precise_eye", new StickerItem());
	public static final Item STICKER_CHEF_HAT_POLAR_BEAR = registerItem("sticker_chef_hat_polar_bear", new StickerItem());
	public static final Item STICKER_HONEY_BEE_BEAR = registerItem("sticker_honey_bee_bear", new StickerItem());
	public static final Item STICKER_BOMBER_BEE_BEAR = registerItem("sticker_bomber_bee_bear", new StickerItem());
	public static final Item STICKER_UPLOOKING_BEAR = registerItem("sticker_uplooking_bear", new StickerItem());
	public static final Item STICKER_SITTING_GREEN_SHIRT_BEAR = registerItem("sticker_sitting_green_shirt_bear", new StickerItem());
	public static final Item STICKER_SHY_BROWN_BEAR = registerItem("sticker_shy_brown_bear", new StickerItem());
	public static final Item STICKER_SITTING_MOTHER_BEAR = registerItem("sticker_sitting_mother_bear", new StickerItem());
	public static final Item STICKER_SQUASHED_HEAD_BEAR = registerItem("sticker_squashed_head_bear", new StickerItem());
	public static final Item STICKER_STRETCHED_HEAD_BEAR = registerItem("sticker_stretched_head_bear", new StickerItem());
	public static final Item STICKER_PANICKED_SCIENCE_BEAR = registerItem("sticker_panicked_science_bear", new StickerItem());
	public static final Item STICKER_DAPPER_FROM_ABOVE = registerItem("sticker_dapper_from_above", new StickerItem());
	public static final Item STICKER_SIDEWAYS_SPIRIT_BEAR = registerItem("sticker_sideways_spirit_bear", new StickerItem());
	public static final Item STICKER_GLOWERING_GUMMY_BEAR = registerItem("sticker_glowering_gummy_bear", new StickerItem());
	public static final Item STICKER_STRANDED_SUN_BEAR = registerItem("sticker_stranded_sun_bear", new StickerItem());
	public static final Item STICKER_MENACING_MANTIS = registerItem("sticker_menacing_mantis", new StickerItem());
	public static final Item STICKER_LITTLE_SCORPION = registerItem("sticker_little_scorpion", new StickerItem());
	public static final Item STICKER_LEFT_FACING_ANT = registerItem("sticker_left_facing_ant", new StickerItem());
	public static final Item STICKER_WALKING_STICK_NYMPH = registerItem("sticker_walking_stick_nymph", new StickerItem());
	public static final Item STICKER_FORWARD_FACING_SPIDER = registerItem("sticker_forward_facing_spider", new StickerItem());
	public static final Item STICKER_FORWARD_FACING_APHID = registerItem("sticker_forward_facing_aphid", new StickerItem());
	public static final Item STICKER_RIGHT_FACING_STUMP_SNAIL = registerItem("sticker_right_facing_stump_snail", new StickerItem());
	public static final Item STICKER_STANDING_BEAN_BUG = registerItem("sticker_standing_bean_bug", new StickerItem());
	public static final Item STICKER_SMALL_BLUE_CHICK = registerItem("sticker_small_blue_chick", new StickerItem());
	public static final Item STICKER_TADPOLE = registerItem("sticker_tadpole", new StickerItem());
	public static final Item STICKER_HAPPY_FISH = registerItem("sticker_happy_fish", new StickerItem());
	public static final Item STICKER_COILED_SNAKE = registerItem("sticker_coiled_snake", new StickerItem());
	public static final Item STICKER_STANDING_CATERPILLAR = registerItem("sticker_standing_caterpillar", new StickerItem());
	public static final Item STICKER_ROUND_GREEN_CRITTER = registerItem("sticker_round_green_critter", new StickerItem());
	public static final Item STICKER_FLYING_MAGENTA_CRITTER = registerItem("sticker_flying_magenta_critter", new StickerItem());
	public static final Item STICKER_BLUE_TRIANGLE_CRITTER = registerItem("sticker_blue_triangle_critter", new StickerItem());
	public static final Item STICKER_PURPLE_POINTED_CRITTER = registerItem("sticker_purple_pointed_critter", new StickerItem());
	public static final Item STICKER_ORANGE_LEG_CRITTER = registerItem("sticker_orange_leg_critter", new StickerItem());
	public static final Item STICKER_GREEN_PLUS_SIGN = registerItem("sticker_green_plus_sign", new StickerItem());
	public static final Item STICKER_GREEN_CHECK_MARK = registerItem("sticker_green_check_mark", new StickerItem());
	public static final Item STICKER_RED_X = registerItem("sticker_red_x", new StickerItem());
	public static final Item STICKER_ALERT_ICON = registerItem("sticker_alert_icon", new StickerItem());
	public static final Item STICKER_YELLOW_RIGHT_ARROW = registerItem("sticker_yellow_right_arrow", new StickerItem());
	public static final Item STICKER_YELLOW_LEFT_ARROW = registerItem("sticker_yellow_left_arrow", new StickerItem());
	public static final Item STICKER_SIMPLE_SUN = registerItem("sticker_simple_sun", new StickerItem());
	public static final Item STICKER_PINK_CUPCAKE = registerItem("sticker_pink_cupcake", new StickerItem());
	public static final Item STICKER_RUBBER_DUCK = registerItem("sticker_rubber_duck", new StickerItem());
	public static final Item STICKER_BASEBALL_SWING = registerItem("sticker_baseball_swing", new StickerItem());
	public static final Item STICKER_YELLOW_COFFEE_MUG = registerItem("sticker_yellow_coffee_mug", new StickerItem());
	public static final Item STICKER_LAUNCHING_ROCKET = registerItem("sticker_launching_rocket", new StickerItem());
	public static final Item STICKER_THUMBS_UP_HAND = registerItem("sticker_thumbs_up_hand", new StickerItem());
	public static final Item STICKER_PEACE_SIGN_HAND = registerItem("sticker_peace_sign_hand", new StickerItem());
	public static final Item STICKER_TRAFFIC_LIGHT = registerItem("sticker_traffic_light", new StickerItem());
	public static final Item STICKER_WINDOW = registerItem("sticker_window", new StickerItem());
	public static final Item STICKER_SIMPLE_SKYSCRAPER = registerItem("sticker_simple_skyscraper", new StickerItem());
	public static final Item STICKER_SIMPLE_MOUNTAIN = registerItem("sticker_simple_mountain", new StickerItem());
	public static final Item STICKER_PALE_HEART = registerItem("sticker_pale_heart", new StickerItem());
	public static final Item STICKER_COLORFUL_BUTTONS = registerItem("sticker_colorful_buttons", new StickerItem());
	public static final Item STICKER_GIRAFFE = registerItem("sticker_giraffe", new StickerItem());
	public static final Item STICKER_SILLY_TONGUE = registerItem("sticker_silly_tongue", new StickerItem());
	public static final Item STICKER_WHITE_FLAG = registerItem("sticker_white_flag", new StickerItem());
	public static final Item STICKER_PYRAMID = registerItem("sticker_pyramid", new StickerItem());
	public static final Item STICKER_TINY_HOUSE = registerItem("sticker_tiny_house", new StickerItem());
	public static final Item STICKER_TNT = registerItem("sticker_tnt", new StickerItem());
	public static final Item STICKER_WISHBONE = registerItem("sticker_wishbone", new StickerItem());
	public static final Item STICKER_YELLOW_UMBRELLA = registerItem("sticker_yellow_umbrella", new StickerItem());
	public static final Item STICKER_RED_PALM_HAND = registerItem("sticker_red_palm_hand", new StickerItem());
	public static final Item STICKER_YELLOW_STICKY_HAND = registerItem("sticker_yellow_sticky_hand", new StickerItem());
	public static final Item STICKER_YELLOW_WALKING_WIGGLY_PERSON = registerItem("sticker_yellow_walking_wiggly_person", new StickerItem());
	public static final Item STICKER_GREEN_SELL = registerItem("sticker_green_sell", new StickerItem());
	public static final Item STICKER_YELLOW_HI = registerItem("sticker_yellow_hi", new StickerItem());
	public static final Item STICKER_AFK = registerItem("sticker_afk", new StickerItem());
	public static final Item STICKER_AURYN = registerItem("sticker_auryn", new StickerItem());
	public static final Item STICKER_PINK_CHAIR = registerItem("sticker_pink_chair", new StickerItem());
	public static final Item STICKER_DOODLE_S = registerItem("sticker_doodle_s", new StickerItem());
	public static final Item STICKER_TRIPLE_EXCLAMATION = registerItem("sticker_triple_exclamation", new StickerItem());
	public static final Item STICKER_EIGHTH_NOTE = registerItem("sticker_eighth_note", new StickerItem());
	public static final Item STICKER_EVICTION = registerItem("sticker_eviction", new StickerItem());
	public static final Item STICKER_FORK_AND_KNIFE = registerItem("sticker_fork_and_knife", new StickerItem());
	public static final Item STICKER_SHINING_HALO = registerItem("sticker_shining_halo", new StickerItem());
	public static final Item STICKER_RHUBARB = registerItem("sticker_rhubarb", new StickerItem());
	public static final Item STICKER_SPROUT = registerItem("sticker_sprout", new StickerItem());
	public static final Item STICKER_PALM_TREE = registerItem("sticker_palm_tree", new StickerItem());
	public static final Item STICKER_JACK_O_LANTERN = registerItem("sticker_jack_o_lantern", new StickerItem());
	public static final Item STICKER_LIGHTNING = registerItem("sticker_lightning", new StickerItem());
	public static final Item STICKER_SIMPLE_CLOUD = registerItem("sticker_simple_cloud", new StickerItem());
	public static final Item STICKER_GREY_RAINING_CLOUD = registerItem("sticker_grey_raining_cloud", new StickerItem());
	public static final Item STICKER_TORNADO = registerItem("sticker_tornado", new StickerItem());
	public static final Item STICKER_SMALL_FLAME = registerItem("sticker_small_flame", new StickerItem());
	public static final Item STICKER_DARK_FLAME = registerItem("sticker_dark_flame", new StickerItem());
	public static final Item STICKER_SMALL_SHIELD = registerItem("sticker_small_shield", new StickerItem());
	public static final Item STICKER_ROBOT_HEAD = registerItem("sticker_robot_head", new StickerItem());
	public static final Item STICKER_CYAN_HILTED_SWORD = registerItem("sticker_cyan_hilted_sword", new StickerItem());
	public static final Item STICKER_COOL_BACKPACK = registerItem("sticker_cool_backpack", new StickerItem());
	public static final Item STICKER_STANDING_BEEKEEPER = registerItem("sticker_standing_beekeeper", new StickerItem());
	public static final Item STICKER_RED_WAILING_CRY = registerItem("sticker_red_wailing_cry", new StickerItem());
	public static final Item STICKER_HOURGLASS = registerItem("sticker_hourglass", new StickerItem());
	public static final Item STICKER_ATOM_SYMBOL = registerItem("sticker_atom_symbol", new StickerItem());
	public static final Item STICKER_BARCODE = registerItem("sticker_barcode", new StickerItem());
	public static final Item STICKER_WALL_CRACK = registerItem("sticker_wall_crack", new StickerItem());
	public static final Item STICKER_GREEN_CIRCLE = registerItem("sticker_green_circle", new StickerItem());
	public static final Item STICKER_BLUE_SQUARE = registerItem("sticker_blue_square", new StickerItem());
	public static final Item STICKER_BLACK_DIAMOND = registerItem("sticker_black_diamond", new StickerItem());
	public static final Item STICKER_WAXING_CRESCENT_MOON = registerItem("sticker_waxing_crescent_moon", new StickerItem());
	public static final Item STICKER_GLOWING_SMILE = registerItem("sticker_glowing_smile", new StickerItem());
	public static final Item STICKER_SATURN = registerItem("sticker_saturn", new StickerItem());
	public static final Item STICKER_BLACK_STAR = registerItem("sticker_black_star", new StickerItem());
	public static final Item STICKER_CYAN_STAR = registerItem("sticker_cyan_star", new StickerItem());
	public static final Item STICKER_SHINING_STAR = registerItem("sticker_shining_star", new StickerItem());
	public static final Item STICKER_GREY_DIAMOND_LOGO = registerItem("sticker_grey_diamond_logo", new StickerItem());
	public static final Item STICKER_ORPHAN_DOG = registerItem("sticker_orphan_dog", new StickerItem());
	public static final Item STICKER_PIZZA_DELIVERY_MAN = registerItem("sticker_pizza_delivery_man", new StickerItem());
	public static final Item STICKER_INTERROBANG_BLOCK = registerItem("sticker_interrobang_block", new StickerItem());
	public static final Item STICKER_THEATRICAL_INTRUDER = registerItem("sticker_theatrical_intruder", new StickerItem());
	public static final Item STICKER_DESPERATE_BOOTH = registerItem("sticker_desperate_booth", new StickerItem());
	public static final Item STICKER_BUILT_SHIP = registerItem("sticker_built_ship", new StickerItem());
	public static final Item STICKER_GREY_SHAPE_COMPANION = registerItem("sticker_grey_shape_companion", new StickerItem());
	public static final Item STICKER_EVIL_PIG = registerItem("sticker_evil_pig", new StickerItem());
	public static final Item STICKER_WAVING_TOWNSPERSON = registerItem("sticker_walking_townsperson", new StickerItem());
	public static final Item STICKER_COP_AND_ROBBER = registerItem("sticker_cop_and_robber", new StickerItem());
	public static final Item STICKER_TOUGH_POTATO = registerItem("sticker_tough_potato", new StickerItem());
	public static final Item STICKER_YOUNG_ELF = registerItem("sticker_young_elf", new StickerItem());
	public static final Item STICKER_SHRUGGING_HEART = registerItem("sticker_shrugging_heart", new StickerItem());
	public static final Item STICKER_CLASSIC_KILLROY = registerItem("sticker_classic_killroy", new StickerItem());
	public static final Item STICKER_KILLROY_WITH_HAIR = registerItem("sticker_killroy_with_hair", new StickerItem());
	public static final Item STICKER_TAUNTING_DOODLE_PERSON = registerItem("sticker_taunting_doodle_person", new StickerItem());
	public static final Item STICKER_PREHISTORIC_HAND = registerItem("sticker_prehistoric_hand", new StickerItem());
	public static final Item STICKER_PREHISTORIC_BOAR = registerItem("sticker_prehistoric_boar", new StickerItem());
	public static final Item STICKER_RED_DOODLE_PERSON = registerItem("sticker_red_doodle_person", new StickerItem());
	public static final Item STICKER_PEARL_GIRL = registerItem("sticker_pearl_girl", new StickerItem());
	public static final Item STICKER_ABSTRACT_COLOR_PAINTING = registerItem("sticker_abstract_color_painting", new StickerItem());
	public static final Item STICKER_PRISM_PAINTING = registerItem("sticker_prism_painting", new StickerItem());
	public static final Item STICKER_BANANA_PAINTING = registerItem("sticker_banana_painting", new StickerItem());
	public static final Item STICKER_MOAI = registerItem("sticker_moai", new StickerItem());
	public static final Item STICKER_NESSIE = registerItem("sticker_nessie", new StickerItem());
	public static final Item STICKER_IONIC_COLUMN_TOP = registerItem("sticker_ionic_column_top", new StickerItem());
	public static final Item STICKER_IONIC_COLUMN_MIDDLE = registerItem("sticker_ionic_column_middle", new StickerItem());
	public static final Item STICKER_IONIC_COLUMN_BASE = registerItem("sticker_ionic_column_base", new StickerItem());
	public static final Item STICKER_ORANGE_STEP_ARRAY = registerItem("sticker_orange_step_array", new StickerItem());
	public static final Item STICKER_ORANGE_GREEN_TRI_DECO = registerItem("sticker_orange_green_tri_deco", new StickerItem());
	public static final Item STICKER_ORANGE_SWIRLED_MARBLE = registerItem("sticker_orange_swirled_marble", new StickerItem());
	public static final Item STICKER_BLUE_AND_GREEN_MARBLE = registerItem("sticker_blue_and_green_marble", new StickerItem());
	public static final Item STICKER_YELLOW_SWIRLED_MARBLE = registerItem("sticker_yellow_swirled_marble", new StickerItem());
	public static final Item STICKER_DIAMOND_CLUSTER = registerItem("sticker_diamond_cluster", new StickerItem());
	public static final Item STICKER_DIAMOND_TRIM = registerItem("sticker_diamond_trim", new StickerItem());
	public static final Item STICKER_CYAN_DECORATIVE_BORDER = registerItem("sticker_cyan_decorative_border", new StickerItem());
	public static final Item STICKER_LEFT_GOLD_SWIRL_FLEURON = registerItem("sticker_left_gold_swirl_fleuron", new StickerItem());
	public static final Item STICKER_RIGHT_GOLD_SWIRL_FLEURON = registerItem("sticker_right_gold_swirl_fleuron", new StickerItem());
	public static final Item STICKER_LEFT_SHINING_DIAMOND_FLEURON = registerItem("sticker_left_shining_diamond_fleuron", new StickerItem());
	public static final Item STICKER_RIGHT_SHINING_DIAMOND_FLEURON = registerItem("sticker_right_shining_diamond_fleuron", new StickerItem());
	public static final Item STICKER_LEFT_MYTHIC_GEM_FLEURON = registerItem("sticker_left_mythic_gem_fleuron", new StickerItem());
	public static final Item STICKER_RIGHT_MYTHIC_GEM_FLEURON = registerItem("sticker_right_mythic_gem_fleuron", new StickerItem());
	public static final Item STICKER_PURPLE_FLEURON = registerItem("sticker_purple_fleuron", new StickerItem());
	public static final Item STICKER_ROYAL_SYMBOL = registerItem("sticker_royal_symbol", new StickerItem());
	public static final Item STICKER_ROYAL_BEAR = registerItem("sticker_royal_bear", new StickerItem());
	public static final Item STICKER_MYTHIC_M = registerItem("sticker_mythic_m", new StickerItem());
	public static final Item STICKER_SATISFYING_NECTAR_ICON = registerItem("sticker_satisfying_nectar_icon", new StickerItem());
	public static final Item STICKER_REFRESHING_NECTAR_ICON = registerItem("sticker_refreshing_nectar_icon", new StickerItem());
	public static final Item STICKER_MOTIVATING_NECTAR_ICON = registerItem("sticker_motivating_nectar_icon", new StickerItem());
	public static final Item STICKER_INVIGORATING_NECTAR_ICON = registerItem("sticker_invigorating_nectar_icon", new StickerItem());
	public static final Item STICKER_COMFORTING_NECTAR_ICON = registerItem("sticker_comforting_nectar_icon", new StickerItem());
	public static final Item STICKER_SMALL_TICKSEED = registerItem("sticker_small_tickseed", new StickerItem());
	public static final Item STICKER_SMALL_WHITE_DAISY = registerItem("sticker_small_white_daisy", new StickerItem());
	public static final Item STICKER_SMALL_PINK_TULIP = registerItem("sticker_small_pink_tulip", new StickerItem());
	public static final Item STICKER_SMALL_DANDELION = registerItem("sticker_small_dandelion", new StickerItem());
	public static final Item STICKER_PURPLE_4_POINT_FLOWER = registerItem("sticker_purple_4_point_flower", new StickerItem());
	public static final Item STICKER_SPORE_COVERED_PUFFSHROOM = registerItem("sticker_spore_covered_puffshroom", new StickerItem());
	public static final Item STICKER_WHITE_BUTTON_MUSHROOM = registerItem("sticker_white_button_mushroom", new StickerItem());
	public static final Item STICKER_FLY_AGARIC_MUSHROOM = registerItem("sticker_fly_agaric_mushroom", new StickerItem());
	public static final Item STICKER_PORCINI_MUSHROOM = registerItem("sticker_porcini_mushroom", new StickerItem());
	public static final Item STICKER_OILER_MUSHROOM = registerItem("sticker_oiler_mushroom", new StickerItem());
	public static final Item STICKER_MOREL_MUSHROOM = registerItem("sticker_morel_mushroom", new StickerItem());
	public static final Item STICKER_CHANTERELLE_MUSHROOM = registerItem("sticker_chanterelle_mushroom", new StickerItem());
	public static final Item STICKER_SHIITAKE_MUSHROOM = registerItem("sticker_shiitake_mushroom", new StickerItem());
	public static final Item STICKER_BLACK_TRUFFLE_MUSHROOM = registerItem("sticker_black_truffle_mushroom", new StickerItem());
	public static final Item STICKER_PRISMATIC_MUSHROOM = registerItem("sticker_prismatic_mushroom", new StickerItem());
	public static final Item STICKER_BLOWING_LEAF = registerItem("sticker_blowing_leaf", new StickerItem());
	public static final Item STICKER_CORDATE_LEAF = registerItem("sticker_cordate_leaf", new StickerItem());
	public static final Item STICKER_CUNATE_LEAF = registerItem("sticker_cunate_leaf", new StickerItem());
	public static final Item STICKER_ELLIPTIC_LEAF = registerItem("sticker_elliptic_leaf", new StickerItem());
	public static final Item STICKER_HASTATE_LEAF = registerItem("sticker_hastate_leaf", new StickerItem());
	public static final Item STICKER_LANCEOLATE_LEAF = registerItem("sticker_lanceolate_leaf", new StickerItem());
	public static final Item STICKER_LYRATE_LEAF = registerItem("sticker_lyrate_leaf", new StickerItem());
	public static final Item STICKER_OBLIQUE_LEAF = registerItem("sticker_oblique_leaf", new StickerItem());
	public static final Item STICKER_RHOMBOID_LEAF = registerItem("sticker_rhomboid_leaf", new StickerItem());
	public static final Item STICKER_RENIFORM_LEAF = registerItem("sticker_reniform_leaf", new StickerItem());
	public static final Item STICKER_SPATULATE_LEAF = registerItem("sticker_spatulate_leaf", new StickerItem());
	public static final Item STICKER_SCOOPER = registerItem("sticker_scooper", new StickerItem());
	public static final Item STICKER_RAKE = registerItem("sticker_rake", new StickerItem());
	public static final Item STICKER_CLIPPERS = registerItem("sticker_clippers", new StickerItem());
	public static final Item STICKER_MAGNET = registerItem("sticker_magnet", new StickerItem());
	public static final Item STICKER_VACUUM = registerItem("sticker_vacuum", new StickerItem());
	public static final Item STICKER_SUPER_SCOOPER = registerItem("sticker_super_scooper", new StickerItem());
	public static final Item STICKER_PULSAR = registerItem("sticker_pulsar", new StickerItem());
	public static final Item STICKER_ELECTRO_MAGNET = registerItem("sticker_electro_magnet", new StickerItem());
	public static final Item STICKER_SCISSORS = registerItem("sticker_scissors", new StickerItem());
	public static final Item STICKER_HONEY_DIPPER = registerItem("sticker_honey_dipper", new StickerItem());
	public static final Item STICKER_BUBBLE_WAND = registerItem("sticker_bubble_wand", new StickerItem());
	public static final Item STICKER_SCYTHE = registerItem("sticker_scythe", new StickerItem());
	public static final Item STICKER_GOLDEN_RAKE = registerItem("sticker_golden_rake", new StickerItem());
	public static final Item STICKER_SPARK_STAFF = registerItem("sticker_spark_staff", new StickerItem());
	public static final Item STICKER_PORCELAIN_DIPPER = registerItem("sticker_porcelain_dipper", new StickerItem());
	public static final Item STICKER_PETAL_WAND = registerItem("sticker_petal_wand", new StickerItem());
	public static final Item STICKER_TIDE_POPPER = registerItem("sticker_tide_popper", new StickerItem());
	public static final Item STICKER_DARK_SCYTHE = registerItem("sticker_dark_scythe", new StickerItem());
	public static final Item STICKER_GUMMYBALLER = registerItem("sticker_gummyballer", new StickerItem());
	public static final Item STICKER_CAPRICORN_STAR_SIGN = registerItem("sticker_capricorn_star_sign", new StickerItem());
	public static final Item STICKER_AQUARIUS_STAR_SIGN = registerItem("sticker_aquarius_star_sign", new StickerItem());
	public static final Item STICKER_PISCES_STAR_SIGN = registerItem("sticker_pisces_star_sign", new StickerItem());
	public static final Item STICKER_ARIES_STAR_SIGN = registerItem("sticker_aries_star_sign", new StickerItem());
	public static final Item STICKER_TAURUS_STAR_SIGN = registerItem("sticker_taurus_star_sign", new StickerItem());
	public static final Item STICKER_GEMINI_STAR_SIGN = registerItem("sticker_gemini_star_sign", new StickerItem());
	public static final Item STICKER_CANCER_STAR_SIGN = registerItem("sticker_cancer_star_sign", new StickerItem());
	public static final Item STICKER_LEO_STAR_SIGN = registerItem("sticker_leo_star_sign", new StickerItem());
	public static final Item STICKER_VIRGO_STAR_SIGN = registerItem("sticker_virgo_star_sign", new StickerItem());
	public static final Item STICKER_LIBRA_STAR_SIGN = registerItem("sticker_libra_star_sign", new StickerItem());
	public static final Item STICKER_SCORPIO_STAR_SIGN = registerItem("sticker_scorpio_star_sign", new StickerItem());
	public static final Item STICKER_SAGITTARIUS_STAR_SIGN = registerItem("sticker_sagittarius_star_sign", new StickerItem());
	public static final Item STICKER_SUNFLOWER_FIELD_STAMP = registerItem("sticker_sunflower_field_stamp", new StickerItem());
	public static final Item STICKER_DANDELION_FIELD_STAMP = registerItem("sticker_dandelion_field_stamp", new StickerItem());
	public static final Item STICKER_MUSHROOM_FIELD_STAMP = registerItem("sticker_mushroom_field_stamp", new StickerItem());
	public static final Item STICKER_BLUE_FLOWER_FIELD_STAMP = registerItem("sticker_blue_flower_field_stamp", new StickerItem());
	public static final Item STICKER_CLOVER_FIELD_STAMP = registerItem("sticker_clover_field_stamp", new StickerItem());
	public static final Item STICKER_STRAWBERRY_FIELD_STAMP = registerItem("sticker_strawberry_field_stamp", new StickerItem());
	public static final Item STICKER_SPIDER_FIELD_STAMP = registerItem("sticker_spider_field_stamp", new StickerItem());
	public static final Item STICKER_BAMBOO_FIELD_STAMP = registerItem("sticker_bamboo_field_stamp", new StickerItem());
	public static final Item STICKER_PINEAPPLE_PATCH_STAMP = registerItem("sticker_pineapple_patch_stamp", new StickerItem());
	public static final Item STICKER_STUMP_FIELD_STAMP = registerItem("sticker_stump_field_stamp", new StickerItem());
	public static final Item STICKER_CACTUS_FIELD_STAMP = registerItem("sticker_cactus_field_stamp", new StickerItem());
	public static final Item STICKER_PUMPKIN_PATCH_STAMP = registerItem("sticker_pumpkin_patch_stamp", new StickerItem());
	public static final Item STICKER_PINE_TREE_FOREST_STAMP = registerItem("sticker_pine_tree_forest_stamp", new StickerItem());
	public static final Item STICKER_ROSE_FIELD_STAMP = registerItem("sticker_rose_field_stamp", new StickerItem());
	public static final Item STICKER_HUB_FIELD_STAMP = registerItem("sticker_hub_field_stamp", new StickerItem());
	public static final Item STICKER_MOUNTAIN_TOP_FIELD_STAMP = registerItem("sticker_mountain_top_field_stamp", new StickerItem());
	public static final Item STICKER_PEPPER_PATCH_STAMP = registerItem("sticker_pepper_patch_stamp", new StickerItem());
	public static final Item STICKER_COCONUT_FIELD_STAMP = registerItem("sticker_coconut_field_stamp", new StickerItem());
	public static final Item STICKER_ANT_FIELD_STAMP = registerItem("sticker_ant_field_stamp", new StickerItem());
	public static final Item STICKER_GREEN_BEESMAS_LIGHT = registerItem("sticker_green_beesmas_light", new StickerItem());
	public static final Item STICKER_BLUE_BEESMAS_LIGHT = registerItem("sticker_blue_beesmas_light", new StickerItem());
	public static final Item STICKER_RED_BEESMAS_LIGHT = registerItem("sticker_red_beesmas_light", new StickerItem());
	public static final Item STICKER_YELLOW_BEESMAS_LIGHT = registerItem("sticker_yellow_beesmas_light", new StickerItem());
	public static final Item STICKER_CRITTER_IN_A_STOCKING = registerItem("sticker_critter_in_a_stocking", new StickerItem());
	public static final Item STICKER_FLYING_FESTIVE_BEE = registerItem("sticker_flying_festive_bee", new StickerItem());
	public static final Item STICKER_FLYING_BEE_BEAR = registerItem("sticker_flying_bee_bear", new StickerItem());
	public static final Item STICKER_PARTY_ROBO_BEAR = registerItem("sticker_party_robo_bear", new StickerItem());
	public static final Item STICKER_FESTIVE_PUFFERFISH = registerItem("sticker_festive_pufferfish", new StickerItem());
	public static final Item STICKER_FESTIVE_PEA = registerItem("sticker_festive_pea", new StickerItem());
	public static final Item STICKER_BBM_FROM_BELOW = registerItem("sticker_bbm_from_below", new StickerItem());


	public static Item[] trinketList = Arrays.stream(ModItems.class.getFields()).filter(field -> {
		try {
			return field.get(null) instanceof TrinketItem;
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}).map(field -> {
		try {
			return (Item)field.get(null);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}).toArray(Item[]::new);

	private static Item registerItem(String id, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(MineSwarmSimulator.MOD_ID, id), item);
	}

	public static void registerModItems() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Items for " + MineSwarmSimulator.MOD_ID);
	}
}
