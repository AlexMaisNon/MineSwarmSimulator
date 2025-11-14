package alex.mine_swarm_simulator.status_effect;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.status_effect.custom.ModStatusEffect;
import alex.mine_swarm_simulator.status_effect.custom.ModStatusModifier;
import alex.mine_swarm_simulator.status_effect.custom.StickerStackEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class ModStatusEffects {

	// Ability Tokens
	public static final RegistryEntry<StatusEffect> BLUE_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_boost",
		StatusEffectCategory.BENEFICIAL,
		0x509AED,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> RED_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"red_boost",
		StatusEffectCategory.BENEFICIAL,
		0xED5050,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> WHITE_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"white_boost",
		StatusEffectCategory.BENEFICIAL,
		0xD9D9D9,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> BOMB_COMBO_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"bomb_combo",
		StatusEffectCategory.BENEFICIAL,
		0x2B2B2B,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BOMB_POWER, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> HASTE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"haste",
		StatusEffectCategory.BENEFICIAL,
		0xFFFFFF,
		new ModStatusModifier[]{
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> FOCUS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"focus",
		StatusEffectCategory.BENEFICIAL,
		0x00FE42,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MELODY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"melody",
		StatusEffectCategory.BENEFICIAL,
		0xFFFFFF,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> RAGE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"rage",
		StatusEffectCategory.BENEFICIAL,
		0xEE792B,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BABY_LOVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"baby_love",
		StatusEffectCategory.BENEFICIAL,
		0x7EE3F2,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_LOOT_LUCK, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> TABBY_LOVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tabby_love",
		StatusEffectCategory.BENEFICIAL,
		0xFF9B3E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_TABBY_BEE_CONVERT_RATE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_TABBY_BEE_POLLEN_COLLECTION, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN_FROM_SCRATCH, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> TABBY_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tabby_blessing",
		StatusEffectCategory.BENEFICIAL,
		0xFF9B3E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> TABBY_BLESSING_PLUS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tabby_blessing_plus",
		StatusEffectCategory.BENEFICIAL,
		0xFF9B3E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PUPPY_LOVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"puppy_love",
		StatusEffectCategory.BENEFICIAL,
		0xFDDB8D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BALLOON_AURA_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"balloon_aura",
		StatusEffectCategory.BENEFICIAL,
		0xF8FC58,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.02d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_FROM_TOKENS, 0.02d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> POLLEN_MARK_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pollen_mark",
		StatusEffectCategory.BENEFICIAL,
		0x377041,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> HONEY_MARK_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"honey_mark",
		StatusEffectCategory.BENEFICIAL,
		0x377041,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERSION_LINKS, 2d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> FESTIVE_MARK_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"festive_mark",
		StatusEffectCategory.BENEFICIAL,
		0x377041,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BOMB_POLLEN, 0.4d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_RED_BOMB_POLLEN, 0.4d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BOMB_CONVERSION, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERSION_LINKS, 5d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_BOMB_SYNC_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_bomb_sync",
		StatusEffectCategory.BENEFICIAL,
		0x1941F7,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> RED_BOMB_SYNC_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"red_bomb_sync",
		StatusEffectCategory.BENEFICIAL,
		0xF0001A,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_RED_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLACK_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"black_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0x3F4346,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 10, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BROWN_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"brown_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0xAE7C4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 10, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PANDA_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"panda_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0x323232,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 10, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> POLAR_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"polar_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0xEFEDEA,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 10, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SCIENCE_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"science_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0xDA9133,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERSION_LINKS, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 10, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MOTHER_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mother_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0xDBC268,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 10, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> INSPIRE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"inspire",
		StatusEffectCategory.BENEFICIAL,
		0xF5F616,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> FESTIVE_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"festive_blessing",
		StatusEffectCategory.BENEFICIAL,
		0x00B441,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> BEESMAS_CHEER_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"beesmas_cheer",
		StatusEffectCategory.BENEFICIAL,
		0x00B441,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> FLAME_FUEL_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"flame_fuel",
		StatusEffectCategory.BENEFICIAL,
		0xD72122,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_FLAME_DURATION, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> REINDEER_GUIDANCE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"reindeer_guidance",
		StatusEffectCategory.BENEFICIAL,
		0xD32D34,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> PRECISION_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"precision",
		StatusEffectCategory.BENEFICIAL,
		0x9350AF,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.02d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PRECISE_MARK_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"precise_mark",
		StatusEffectCategory.BENEFICIAL,
		0xE6E6E6,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.07d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.07d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> FIELD_CORRUPTION_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"field_corruption",
		StatusEffectCategory.BENEFICIAL,
		0x000000,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_ABILITY_DUPLICATION_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_DUPED_ABILITY_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_DUPED_ABILITY_CONVERSION, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> APM_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"apm",
		StatusEffectCategory.BENEFICIAL,
		0x565656,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.03d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_COLLECTOR_TOOL_SPEED, 0.03d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> DEMARCATE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"demarcate",
		StatusEffectCategory.BENEFICIAL,
		0x202020,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.03d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_SCREEN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_screen",
		StatusEffectCategory.BENEFICIAL,
		0x242424,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.03d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_BEE_ATTACK_MULTIPLIER, 0.03d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> PROXY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"proxy",
		StatusEffectCategory.BENEFICIAL,
		0x707070,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_DODGE_CHANCE, 0.02d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));

	// NPC
	public static final RegistryEntry<StatusEffect> SCIENCE_ENHANCEMENT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"science_enhancement",
		StatusEffectCategory.BENEFICIAL,
		0xF9A735,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> POLAR_POWER_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"polar_power",
		StatusEffectCategory.BENEFICIAL,
		0x75EBFD,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MAX_BEE_ENERGY, 0.05d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> CONVERSION_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"conversion_boost",
		StatusEffectCategory.BENEFICIAL,
		0xFFE270,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));

	// Items
	public static final RegistryEntry<StatusEffect> STINGER_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"stinger",
		StatusEffectCategory.BENEFICIAL,
		0xFF0000,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> WHIRLIGIG_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"whirligig_boost",
		StatusEffectCategory.BENEFICIAL,
		0xB89063,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> OIL_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"oil",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> ENZYMES_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"enzymes",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_EXTRACT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_extract",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> RED_EXTRACT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"red_extract",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> GLUE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"glue",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> TROPICAL_DRINK_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tropical_drink",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PURPLE_POTION_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"purple_potion",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.3d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.3d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> SUPER_SMOOTHIE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"super_smoothie",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.6d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.6d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.6d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.4d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.4d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 0.12d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.07d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MARSHMALLOW_BEE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"marshmallow_bee",
		StatusEffectCategory.BENEFICIAL,
		0xF1BE4E,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 1.5d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> COOL_BREEZE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cool_breeze",
		StatusEffectCategory.BENEFICIAL,
		0xF5F5F5,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_LOOT_LUCK, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.25d, true)
		}
	));
	public static final RegistryEntry<StatusEffect> WHITE_DRIVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"white_drive",
		StatusEffectCategory.BENEFICIAL,
		0xDBDBDB,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_COLORLESS_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_DRIVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_drive",
		StatusEffectCategory.BENEFICIAL,
		0x4151F9,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> RED_DRIVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"red_drive",
		StatusEffectCategory.BENEFICIAL,
		0xD63233,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_RED_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_RED_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> GLITCHED_DRIVE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"glitched_drive",
		StatusEffectCategory.BENEFICIAL,
		0xDDA3E2,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_DANDELION_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_MUSHROOM_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_CLOVER_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_STRAWBERRY_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_SPIDER_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_BAMBOO_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_PINEAPPLE_PATCH_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_CACTUS_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_PUMPKIN_PATCH_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_ANT_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_HUB_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_COCONUT_FIELD_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			// new ModStatusModifier(ModAttributes.PLAYER_PEPPER_PATCH_CAPACITY, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));

	// Jelly beans
	public static final RegistryEntry<StatusEffect> RED_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"red_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xDA9E96,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.125d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> MAROON_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"maroon_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xC19AA0,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_RED_CONVERSION, 0.025d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xB5C8DB,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.125d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> NAVY_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"navy_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0x9D9EBD,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, 0.025d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d)
		}
	));
	public static final RegistryEntry<StatusEffect> WHITE_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"white_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xDCDADC,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.125d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> SLATE_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"slate_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xC2CACF,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_WHITE_CONVERSION, 0.025d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d)
		}
	));
	public static final RegistryEntry<StatusEffect> BROWN_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"brown_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xBDABA0,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BOMB_CONVERSION, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> PERIWINKLE_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"periwinkle_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xC9C2D4,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.125d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> TEAL_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"teal_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xA6DDCA,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_TOOL_CONVERSION, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> PINK_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pink_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xDCB3D8,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BEE_GATHER_CONVERSION, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> BLACK_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"black_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0x9F9F9F,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BOMB_POLLEN, 0.125d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d)
		}
	));
	public static final RegistryEntry<StatusEffect> GREEN_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"green_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0x97CF96,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE, 0.03d)
		}
	));
	public static final RegistryEntry<StatusEffect> YELLOW_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"yellow_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xDDDCA5,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.05d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d)
		}
	));
	public static final RegistryEntry<StatusEffect> MERIGOLD_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"merigold_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xD4C498,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 0.025d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d)
		}
	));
	public static final RegistryEntry<StatusEffect> JELLY_BEAN_SHARING_BONUS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"jelly_bean_sharing_bonus",
		StatusEffectCategory.BENEFICIAL,
		0xF9CCFF,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));

	// Nectars
	public static final RegistryEntry<StatusEffect> REFRESHING_NECTAR_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"refreshing_nectar",
		StatusEffectCategory.BENEFICIAL,
		0x6EB279,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_BEE_CONVERT_RATE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.2d),
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_UNIQUE_INSTANT_CONVERSION, 0.001d, EntityAttributeModifier.Operation.ADD_VALUE, 0.05d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01)
		}
	));
	public static final RegistryEntry<StatusEffect> COMFORTING_NECTAR_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"comforting_nectar",
		StatusEffectCategory.BENEFICIAL,
		0x7A9DB0,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.2d),
			new ModStatusModifier(ModAttributes.PLAYER_COLORLESS_BEE_CONVERT_RATE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.2d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01)
		}
	));
	public static final RegistryEntry<StatusEffect> SATISFYING_NECTAR_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"satisfying_nectar",
		StatusEffectCategory.BENEFICIAL,
		0xB497A5,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_AT_HIVE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_RED_BEE_CONVERT_RATE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.2d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.2d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01)
		}
	));
	public static final RegistryEntry<StatusEffect> MOTIVATING_NECTAR_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"motivating_nectar",
		StatusEffectCategory.BENEFICIAL,
		0x947CAF,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ABILITY_RATE, 0.001d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01)
		}
	));
	public static final RegistryEntry<StatusEffect> INVIGORATING_NECTAR_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"invigorating_nectar",
		StatusEffectCategory.BENEFICIAL,
		0xB85954,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.001d, EntityAttributeModifier.Operation.ADD_VALUE, 0.02d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01)
		}
	));

	// Codes
	public static final RegistryEntry<StatusEffect> CAPACITY_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"capacity_code",
		StatusEffectCategory.BENEFICIAL,
		0xFFE270,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> POLLEN_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pollen_boost",
		StatusEffectCategory.BENEFICIAL,
		0xEEDA5D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> CONSOLE_CODE_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"console_code_boost",
		StatusEffectCategory.BENEFICIAL,
		0x262626,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_EVENT_BEE_ABILITY_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT, 100d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_NECTAR, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));

	// Fields

	// Field Buffs
	// Field Boosts:
	public static final RegistryEntry<StatusEffect> DANDELION_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"dandelion_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_DANDELION_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SUNFLOWER_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"sunflower_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MUSHROOM_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mushroom_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MUSHROOM_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CLOVER_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"clover_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CLOVER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_FLOWER_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_flower_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STRAWBERRY_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"strawberry_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STRAWBERRY_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SPIDER_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"spider_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SPIDER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BAMBOO_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"bamboo_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BAMBOO_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINEAPPLE_PATCH_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pineapple_patch_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINEAPPLE_PATCH_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STUMP_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"stump_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CACTUS_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cactus_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CACTUS_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PUMPKIN_PATCH_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pumpkin_patch_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PUMPKIN_PATCH_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> ROSE_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"rose_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINE_TREE_FOREST_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pine_tree_forest_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> HUB_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"hub_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HUB_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MOUNTAIN_TOP_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mountain_top_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> COCONUT_FIELD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"coconut_field_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_COCONUT_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PEPPER_PATCH_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pepper_patch_boost",
		StatusEffectCategory.BENEFICIAL,
		0xDFCC63,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PEPPER_PATCH_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	// Field Winds:
	public static final RegistryEntry<StatusEffect> DANDELION_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"dandelion_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_DANDELION_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.32d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_DANDELION_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SUNFLOWER_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"sunflower_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.32d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_SUNFLOWER_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MUSHROOM_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mushroom_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MUSHROOM_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.32d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_MUSHROOM_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CLOVER_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"clover_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CLOVER_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.3d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CLOVER_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_FLOWER_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_flower_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.32d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BLUE_FLOWER_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STRAWBERRY_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"strawberry_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STRAWBERRY_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_STRAWBERRY_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SPIDER_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"spider_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SPIDER_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.3d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_SPIDER_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BAMBOO_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"bamboo_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BAMBOO_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BAMBOO_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINEAPPLE_PATCH_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pineapple_patch_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINEAPPLE_PATCH_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.3d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_PINEAPPLE_PATCH_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STUMP_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"stump_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_STUMP_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CACTUS_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cactus_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CACTUS_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CACTUS_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PUMPKIN_PATCH_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pumpkin_patch_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PUMPKIN_PATCH_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_PUMPKIN_PATCH_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> ROSE_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"rose_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_ROSE_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINE_TREE_FOREST_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pine_tree_forest_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_PINE_TREE_FOREST_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> HUB_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"hub_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HUB_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 1.05d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_HUB_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MOUNTAIN_TOP_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mountain_top_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_MOUNTAIN_TOP_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> COCONUT_FIELD_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"coconut_field_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_COCONUT_FIELD_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_COCONUT_FIELD_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PEPPER_PATCH_WINDS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pepper_patch_winds",
		StatusEffectCategory.BENEFICIAL,
		0xCFDBE1,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PEPPER_PATCH_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE, 0.28d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_PEPPER_PATCH_CONVERSION, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE, 0.25d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	// Field Capacity:
	public static final RegistryEntry<StatusEffect> DANDELION_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"dandelion_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_DANDELION_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SUNFLOWER_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"sunflower_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MUSHROOM_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mushroom_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MUSHROOM_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CLOVER_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"clover_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CLOVER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_FLOWER_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_flower_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STRAWBERRY_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"strawberry_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STRAWBERRY_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SPIDER_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"spider_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SPIDER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BAMBOO_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"bamboo_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BAMBOO_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINEAPPLE_PATCH_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pineapple_patch_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINEAPPLE_PATCH_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STUMP_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"stump_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CACTUS_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cactus_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CACTUS_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PUMPKIN_PATCH_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pumpkin_patch_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PUMPKIN_PATCH_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> ROSE_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"rose_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINE_TREE_FOREST_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pine_tree_forest_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> HUB_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"hub_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HUB_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MOUNTAIN_TOP_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mountain_top_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> COCONUT_FIELD_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"coconut_field_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_COCONUT_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PEPPER_PATCH_CAPACITY_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pepper_patch_capacity",
		StatusEffectCategory.BENEFICIAL,
		0x94684D,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PEPPER_PATCH_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	// Field Code:
	public static final RegistryEntry<StatusEffect> DANDELION_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"dandelion_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_DANDELION_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_DANDELION_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SUNFLOWER_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"sunflower_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MUSHROOM_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mushroom_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MUSHROOM_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_MUSHROOM_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CLOVER_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"clover_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CLOVER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CLOVER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BLUE_FLOWER_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"blue_flower_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STRAWBERRY_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"strawberry_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STRAWBERRY_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_STRAWBERRY_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> SPIDER_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"spider_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SPIDER_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SPIDER_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BAMBOO_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"bamboo_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BAMBOO_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BAMBOO_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINEAPPLE_PATCH_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pineapple_patch_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINEAPPLE_PATCH_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_PINEAPPLE_PATCH_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> STUMP_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"stump_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CACTUS_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cactus_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CACTUS_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CACTUS_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PUMPKIN_PATCH_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pumpkin_patch_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PUMPKIN_PATCH_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_PUMPKIN_PATCH_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> ROSE_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"rose_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PINE_TREE_FOREST_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pine_tree_forest_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> HUB_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"hub_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HUB_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_HUB_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MOUNTAIN_TOP_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mountain_top_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> COCONUT_FIELD_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"coconut_field_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_COCONUT_FIELD_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_COCONUT_FIELD_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> PEPPER_PATCH_CODE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pepper_patch_code",
		StatusEffectCategory.BENEFICIAL,
		0x15CA4C,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_PEPPER_PATCH_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_PEPPER_PATCH_CAPACITY, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));

	// Tools
	public static final RegistryEntry<StatusEffect> DARK_HEAT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"dark_heat",
		StatusEffectCategory.BENEFICIAL,
		0x8F4EB4,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_POWER, 0.05d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_RED_ABILITY_CONVERSION, 0.0099d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> GUMMYBALL_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"gummyball",
		StatusEffectCategory.BENEFICIAL,
		0x60FFCD,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.00009d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d)
		}
	));
	public static final RegistryEntry<StatusEffect> GUMMYBALL_COMBO_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"gummyball_combo",
		StatusEffectCategory.BENEFICIAL,
		0x60FFCD,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.1d, true),
			new ModStatusModifier(ModAttributes.PLAYER_GOO, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> TIDE_POWER_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tide_power",
		StatusEffectCategory.BENEFICIAL,
		0x8BC1FA,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_COLLECTOR_TOOL_SPEED, 0.00299d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d)
		}
	));
	public static final RegistryEntry<StatusEffect> TIDE_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tide_blessing",
		StatusEffectCategory.BENEFICIAL,
		0x8BC1FA,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_FROM_TOKENS, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.01d)
		}
	));
	public static final RegistryEntry<StatusEffect> TIDAL_SURGE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"tidal_surge",
		StatusEffectCategory.BENEFICIAL,
		0x8BC1FA,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_COLLECTOR_TOOL_SPEED, 0.005d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 0.5d)
		}
	));

	// Others
	public static final RegistryEntry<StatusEffect> GUMMY_BEAR_MORPH_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"gummy_bear_morph",
		StatusEffectCategory.BENEFICIAL,
		0xE180F0,
		new ModStatusModifier[]{
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 4, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, 0.00805d * 5, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_GOO, 0.75d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_GOO_CONVERSION, 2d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_GUMMY_BEE_SPEED, 2d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_GUMMY_BEE_GATHER_AMOUNT, 10d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_GUMMY_BEE_ATTACK, 300d, EntityAttributeModifier.Operation.ADD_VALUE),
		}
	));
	public static final RegistryEntry<StatusEffect> COCONUT_HASTE_SURGE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"coconut_haste_surge",
		StatusEffectCategory.BENEFICIAL,
		0xFFFFFF,
		new ModStatusModifier[]{
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.00579d * 10, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> EMERGENCY_COCONUT_SHIELD_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"emergency_coconut_shield",
		StatusEffectCategory.BENEFICIAL,
		0xFFFFFF,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_DEFENSE, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> FLAME_HEAT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"flame_heat",
		StatusEffectCategory.BENEFICIAL,
		0xD72122,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> UNLIMITED_GUMDROPS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"unlimited_gumdrops",
		StatusEffectCategory.BENEFICIAL,
		0xF281FF
	));
	public static final RegistryEntry<StatusEffect> HASTE_PLUS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"haste_plus",
		StatusEffectCategory.BENEFICIAL,
		0xEEDA5D,
		new ModStatusModifier[]{
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> WEALTH_CLOCK_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"wealth_clock",
		StatusEffectCategory.BENEFICIAL,
		0xE5AA48,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> ANT_CHALLENGE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"ant_challenge",
		StatusEffectCategory.BENEFICIAL,
		0x50A92B,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_ANT_FIELD_CONVERSION, 1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> GALENTINE_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"galentine_blessing",
		StatusEffectCategory.BENEFICIAL,
		0xFFF0FB,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BEE_ABILITY_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_ROSE_FIELD_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SUNFLOWER_FIELD_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_TICKET_CHANCE, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_LOOT_LUCK, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BEESMAS_REPENTANCE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"beesmas_repentance",
		StatusEffectCategory.BENEFICIAL,
		0x00B056,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.05d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BUBBLE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_PINE_TREE_FOREST_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_STUMP_FIELD_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_MOVEMENT_COLLECTION_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_LOOT_LUCK, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BALLOON_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"balloon_blessing",
		StatusEffectCategory.BENEFICIAL,
		0xBBC146,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.03d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_AT_HIVE, 0.015d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	// public static final RegistryEntry<StatusEffect> STICKER_STACK_STATUS_EFFECT = registerStatusEffect(new StickerStackEffect());
	public static final RegistryEntry<StatusEffect> PUFFSHROOM_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"puffshroom_blessing",
		StatusEffectCategory.BENEFICIAL,
		0xBC9B69,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_UNIQUE_INSTANT_CONVERSION, 0.00087d, EntityAttributeModifier.Operation.ADD_VALUE, 0.014d),
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.00087d, EntityAttributeModifier.Operation.ADD_VALUE, 0.014d),
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.00087d, EntityAttributeModifier.Operation.ADD_VALUE, 0.014d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_FROM_TOKENS, 0.00087d, EntityAttributeModifier.Operation.ADD_VALUE, 0.014d)
		}
	));
	public static final RegistryEntry<StatusEffect> HONEYDAY_EVENT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"honeyday_event",
		StatusEffectCategory.BENEFICIAL,
		0x00B441,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> CLOUD_BOOST_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cloud_boost",
		StatusEffectCategory.BENEFICIAL,
		0x9FB1C5,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_UNIQUE_INSTANT_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> CLOUD_BOOST_PLUS_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"cloud_boost_plus",
		StatusEffectCategory.BENEFICIAL,
		0x9FB1C5,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_UNIQUE_INSTANT_CONVERSION, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> MONDO_CHICK_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mondo_chick_blessing",
		StatusEffectCategory.BENEFICIAL,
		0xCFADA5,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.02d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.02d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d, true)
		}
	));
	public static final RegistryEntry<StatusEffect> FESTIVE_NYMPH_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"festive_nymph_blessing",
		StatusEffectCategory.BENEFICIAL,
		0x47AB55,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY, 1000d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BEE_GATHER_CONVERSION, 0.00016d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.00016d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.00016d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d)
		}
	));
	public static final RegistryEntry<StatusEffect> ROBO_PARTY_BLESSING_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"robo_party_blessing",
		StatusEffectCategory.BENEFICIAL,
		0x3EA33F,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY, 1000d, EntityAttributeModifier.Operation.ADD_VALUE),
			new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.00495d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.00495d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.00495d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.00495d, EntityAttributeModifier.Operation.ADD_VALUE, 0.01d)
		}
	));

	// Star Effects
	public static final RegistryEntry<StatusEffect> GUIDING_STAR_AURA_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"guiding_star_aura",
		StatusEffectCategory.BENEFICIAL,
		0xD1D1D1,
		new ModStatusModifier[]{ // For owner: 5 (amplifier) | For other: 0 (amplifier)
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> GUMMY_STAR_AURA_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"gummy_star_aura",
		StatusEffectCategory.BENEFICIAL,
		0xD3B7D1,
		new ModStatusModifier[]{ // NO FUCKING IDEA HOW TS WORKS
			new ModStatusModifier(ModAttributes.PLAYER_GOO, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_GOO_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d, true),
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_WHITE_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d, true)
		}
	));
	public static final RegistryEntry<StatusEffect> POP_STAR_AURA_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"pop_star_aura",
		StatusEffectCategory.BENEFICIAL,
		0x6A9AC0,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE, 0.1d, true),
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.01d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, 2d),
		}
	));
	public static final RegistryEntry<StatusEffect> SCORCHING_STAR_AURA_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"scorching_star_aura",
		StatusEffectCategory.BENEFICIAL,
		0x424248,
		new ModStatusModifier[]{ // NO FUCKING IDEA HOW TS WORKS
			new ModStatusModifier(ModAttributes.PLAYER_INSTANT_FLAME_CONVERSION, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE, 0.5d, true),
			new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERSION_LINKS, 5d, EntityAttributeModifier.Operation.ADD_VALUE)
		}
	));
	public static final RegistryEntry<StatusEffect> BUBBLE_BLOAT_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"bubble_bloat",
		StatusEffectCategory.BENEFICIAL,
		0x4880CC,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BLUE_FIELD_CAPACITY, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.001d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));

	// Debuffs
	public static final RegistryEntry<StatusEffect> SPLINTER_TRAP_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"splinter_trap",
		StatusEffectCategory.BENEFICIAL,
		0xEEDA5D,
		new ModStatusModifier[]{ // new SplinterTrapEffect with damage over time
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, -0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, -0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> SPOILED_JELLY_BEAN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"spoiled_jelly_bean",
		StatusEffectCategory.BENEFICIAL,
		0xCAFFD4,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, -0.1d, EntityAttributeModifier.Operation.ADD_VALUE, -0.3d)
		}
	));
	public static final RegistryEntry<StatusEffect> FROZEN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"frozen",
		StatusEffectCategory.HARMFUL,
		0xE1E7FF,
		new ModStatusModifier[]{
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, -1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(EntityAttributes.GENERIC_JUMP_STRENGTH, -1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
			new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, -0.8d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
		}
	));
	public static final RegistryEntry<StatusEffect> MECHSQUITO_TOXIN_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"mechsquito_toxin",
		StatusEffectCategory.BENEFICIAL,
		0xFFC900,
		new ModStatusModifier[]{ // new SplinterTrapEffect with damage over time
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN, -0.07777d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, -0.1d),
			new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, -0.01666d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, -0.1d)
		}
	));
	public static final RegistryEntry<StatusEffect> ROBO_BEAR_CHALLENGE_STATUS_EFFECT = registerStatusEffect(new ModStatusEffect(
		"robo_bear_challenge",
		StatusEffectCategory.BENEFICIAL,
		0xC6FCBA,
		new ModStatusModifier[]{
			new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.01666d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, -0.9d),
			new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.01666d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, -0.9d),
			new ModStatusModifier(ModAttributes.PLAYER_MOVEMENT_COLLECTION_POLLEN, 0.01666d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, -0.9d),
			new ModStatusModifier(ModAttributes.PLAYER_POLLEN_FROM_COCONUTS, 0.075d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL, -0.8d)
		}
	));

	private static RegistryEntry<StatusEffect> registerStatusEffect(ModStatusEffect effect) {
		return Registry.registerReference(Registries.STATUS_EFFECT, effect.getIdentifier(), effect);
	}

	public static void registerModStatusEffects() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Status Effects for " + MineSwarmSimulator.MOD_ID);
	}

	// TODO: Combo Coconut Status Effect (icon + etc.)
}
