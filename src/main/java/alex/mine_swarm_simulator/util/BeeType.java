package alex.mine_swarm_simulator.util;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.status_effect.custom.ModStatusModifier;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Comparator;

public enum BeeType {
	BASIC((byte)0, "basic", BeeRarity.COMMON, FlowerColor.COLORLESS, 20f, 14f, 1f, 10, 80, 4f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BOMBER((byte)1, "bomber", BeeRarity.RARE, FlowerColor.COLORLESS, 20f, 15.4f, 1f, 10, 120, 4f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_BOMB_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BRAVE((byte)2, "brave", BeeRarity.RARE, FlowerColor.COLORLESS, 30f, 16.8f, 5f, 10, 200, 4f, 4f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BUMBLE((byte)3, "bumble", BeeRarity.RARE, FlowerColor.BLUE, 50f, 10.5f, 1f, 18, 80, 4f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 1d / 12d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	COOL((byte)4, "cool", BeeRarity.RARE, FlowerColor.BLUE, 20f, 14f, 2f, 10, 120, 3f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	HASTY((byte)5, "hasty", BeeRarity.RARE, FlowerColor.COLORLESS, 20f, 19.6f, 1f, 10, 80, 3f, 3f, ModItems.PINEAPPLE, new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.15d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	LOOKER((byte)6, "looker", BeeRarity.RARE, FlowerColor.COLORLESS, 20f, 14f, 1f, 13, 160, 4f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	RAD((byte)7, "rad", BeeRarity.RARE, FlowerColor.RED, 20f, 14f, 1f, 13, 80, 4f, 3f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	RASCAL((byte)8, "rascal", BeeRarity.RARE, FlowerColor.RED, 20f, 16.1f, 3f, 10, 80, 4f, 4f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_RED_BOMB_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	STUBBORN((byte)9, "stubborn", BeeRarity.RARE, FlowerColor.COLORLESS, 20f, 11.9f, 2f, 10, 80, 4f, 3f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_ABILITY_TOKEN_LIFESPAN, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BUBBLE((byte)10, "bubble", BeeRarity.EPIC, FlowerColor.BLUE, 20f, 16.1f, 3f, 10, 160, 4f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_BUBBLE_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BUCKO((byte)11, "bucko", BeeRarity.EPIC, FlowerColor.BLUE, 30f, 15.4f, 5f, 17, 80, 4f, 3f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_BLUE_FIELD_CAPACITY, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	COMMANDER((byte)12, "commander", BeeRarity.EPIC, FlowerColor.COLORLESS, 30f, 14f, 4f, 15, 80, 4f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DEMO((byte)13, "demo", BeeRarity.EPIC, FlowerColor.COLORLESS, 20f, 16.8f, 3f, 10, 200, 4f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_BUZZ_BOMB_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	EXHAUSTED((byte)14, "exhausted", BeeRarity.EPIC, FlowerColor.COLORLESS, -1f, 10.5f, 1f, 10, 240, 4.6f, 4f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_WHITE_FIELD_CAPACITY, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	FIRE((byte)15, "fire", BeeRarity.EPIC, FlowerColor.RED, 25f, 11.2f, 4f, 10, 80, 4f, 4f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_FLAME_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	FROSTY((byte)16, "frosty", BeeRarity.EPIC, FlowerColor.BLUE, 25f, 11.2f, 1f, 10, 80, 4f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_BLUE_BOMB_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	HONEY((byte)17, "honey", BeeRarity.EPIC, FlowerColor.COLORLESS, 20f, 14f, 1f, 10, 360, 4f, 2f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_HONEY_FROM_TOKENS, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	RAGE((byte)18, "rage", BeeRarity.EPIC, FlowerColor.RED, 20f, 15.4f, 4f, 10, 80, 4f, 4f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)),
	RILEY((byte)19, "riley", BeeRarity.EPIC, FlowerColor.RED, 25f, 15.4f, 5f, 10, 140, 2f, 4f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_RED_FIELD_CAPACITY, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	SHOCKED((byte)20, "shocked", BeeRarity.EPIC, FlowerColor.COLORLESS, 20f, 19.6f, 2f, 10, 80, 4f, 2f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BABY((byte)21, "baby", BeeRarity.LEGENDARY, FlowerColor.COLORLESS, 15f, 10.5f, 0f, 10, 80, 5f, 5f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_LOOT_LUCK, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	CARPENTER((byte)22, "carpenter", BeeRarity.LEGENDARY, FlowerColor.COLORLESS, 25f, 11.2f, 4f, 10, 120, 3f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DEMON((byte)23, "demon", BeeRarity.LEGENDARY, FlowerColor.RED, 20f, 10.5f, 8f, 35, 60, 4f, 4f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BOMB_CONVERSION, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DIAMOND((byte)24, "diamond", BeeRarity.LEGENDARY, FlowerColor.BLUE, 20f, 14f, 1f, 10, 1000, 4f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	LION((byte)25, "lion", BeeRarity.LEGENDARY, FlowerColor.COLORLESS, 60f, 19.6f, 9f, 20, 160, 4f, 2f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_GIFTED_BEE_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	MUSIC((byte)26, "music", BeeRarity.LEGENDARY, FlowerColor.COLORLESS, 20f, 16.1f, 1f, 16, 240, 4f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	NINJA((byte)27, "ninja", BeeRarity.LEGENDARY, FlowerColor.BLUE, 20f, 21f, 4f, 10, 80, 2f, 3f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	SHY((byte)28, "shy", BeeRarity.LEGENDARY, FlowerColor.RED, 40f, 18.2f, 2f, 10, 320, 2f, 4f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_BEE_ABILITY_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BUOYANT((byte)29, "buoyant", BeeRarity.MYTHIC, FlowerColor.BLUE, 60f, 14f, 3f, 15, 150, 5f, 3f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	FUZZY((byte)30, "fuzzy", BeeRarity.MYTHIC, FlowerColor.COLORLESS, 50f, 11.9f, 3f, 100, 40, 6f, 6f, ModItems.PINEAPPLE, new ModStatusModifier(ModAttributes.PLAYER_BOMB_POWER, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	PRECISE((byte)31, "precise", BeeRarity.MYTHIC, FlowerColor.RED, 40f, 11.2f, 8f, 20, 130, 4f, 4f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE)),
	SPICY((byte)32, "spicy", BeeRarity.MYTHIC, FlowerColor.RED, 20f, 14f, 5f, 14, 200, 4f, 2f, ModItems.STRAWBERRY, new ModStatusModifier(ModAttributes.PLAYER_FLAME_DURATION, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	TADPOLE((byte)33, "tadpole", BeeRarity.MYTHIC, FlowerColor.BLUE, 10f, 11.2f, 0.5f, 10, 120, 6f, 4f, ModItems.BLUEBERRY, new ModStatusModifier(ModAttributes.PLAYER_BUBBLE_DURATION, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	VECTOR((byte)34, "vector", BeeRarity.MYTHIC, FlowerColor.COLORLESS, 45.6f, 16.24f, 5f, 18, 144, 4f, 2.72f, ModItems.SUNFLOWER_SEED, new ModStatusModifier(ModAttributes.PLAYER_MARK_DURATION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BEAR((byte)35, "bear", BeeRarity.EVENT, FlowerColor.COLORLESS, 35f, 14f, 5f, 15, 200, 2f, 2f, null, new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)),
	COBALT((byte)36, "cobalt", BeeRarity.EVENT, FlowerColor.BLUE, 35f, 18.2f, 6f, 10, 120, 4f, 3f, null, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	CRIMSON((byte)37, "crimson", BeeRarity.EVENT, FlowerColor.RED, 35f, 18.2f, 6f, 10, 120, 4f, 3f, null, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_RED_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DIGITAL((byte)38, "digital", BeeRarity.EVENT, FlowerColor.COLORLESS, 20f, 11.9f, 1f, 10, 80, 4f, 4f, null, new ModStatusModifier(ModAttributes.PLAYER_ABILITY_DUPLICATION_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)),
	FESTIVE((byte)39, "festive", BeeRarity.EVENT, FlowerColor.RED, 20f, 16.1f, 1f, 40, 150, 4f, 1f, null, new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	GUMMY((byte)40, "gummy", BeeRarity.EVENT, FlowerColor.COLORLESS, 50f, 14f, 3f, 10, 700, 4f, 4f, null, new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	PHOTON((byte)41, "photon", BeeRarity.EVENT, FlowerColor.COLORLESS, -1f, 21f, 3f, 20, 240, 2f, 2f, null, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	PUPPY((byte)42, "puppy", BeeRarity.EVENT, FlowerColor.COLORLESS, 40f, 16.1f, 2f, 25, 280, 4f, 4f, null, new ModStatusModifier(ModAttributes.PLAYER_BOND_FROM_TREATS, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	TABBY((byte)43, "tabby", BeeRarity.EVENT, FlowerColor.COLORLESS, 28f, 16.1f, 4f, 10, 160, 4f, 3f, null, new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE)),
	VICIOUS((byte)44, "vicious", BeeRarity.EVENT, FlowerColor.BLUE, 50f, 17.5f, 8f, 10, 80, 4f, 4f, null, new ModStatusModifier(ModAttributes.PLAYER_MONSTER_RESPAWN_TIME, -0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	WINDY((byte)45, "windy", BeeRarity.EVENT, FlowerColor.COLORLESS, 20f, 19.6f, 3f, 10, 180, 3f, 2f, null, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_WHITE_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE));

	private final byte id;
	private final String type;
	private final BeeRarity rarity;
	private final FlowerColor color;
	private final float energy;
	private final float speed;
	private final float attack;
	private final int gatherAmount;
	private final int convertAmount;
	private final float gatherSpeed;
	private final float convertSpeed;
	@Nullable private final Item favoriteFood;
	private final ModStatusModifier giftedHiveBonus;

	private static final BeeType[] beeIDs = Arrays.stream(values()).sorted(Comparator.comparingInt(BeeType::getId)).toArray(BeeType[]::new);

	BeeType(byte id, String type, BeeRarity rarity, FlowerColor color, float energy, float speed, float attack, int gatherAmount, int convertAmount, float gatherSpeed, float convertSpeed, Item favoriteFood, ModStatusModifier giftedHiveBonus) {
		this.id = id;
		this.type = type;
		this.rarity = rarity;
		this.color = color;
		this.energy = energy;
		this.speed = speed;
		this.attack = attack;
		this.gatherAmount = gatherAmount;
		this.convertAmount = convertAmount;
		this.gatherSpeed = gatherSpeed;
		this.convertSpeed = convertSpeed;
		this.favoriteFood = favoriteFood;
		this.giftedHiveBonus = giftedHiveBonus;
	}

	public byte getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	public Text getTranslatedType() {
		return Text.translatable("entity.mine_swarm_simulator.bee.type." + this.type);
	}

	public BeeRarity getRarity() {
		return this.rarity;
	}

	public FlowerColor getColor() {
		return this.color;
	}

	public float getEnergy() {
		return this.energy;
	}

	public float getSpeed() {
		return this.speed;
	}

	public float getAttack() {
		return this.attack;
	}

	public int getGatherAmount() {
		return this.gatherAmount;
	}

	public int getConvertAmount() {
		return this.convertAmount;
	}

	public float getGatherSpeed() {
		return this.gatherSpeed;
	}

	public float getConvertSpeed() {
		return this.convertSpeed;
	}

	@Nullable
	public Item getFavoriteFood() {
		return this.favoriteFood;
	}

	public ModStatusModifier getGiftedHiveBonus() {
		return this.giftedHiveBonus;
	}

	public static BeeType byId(byte id) {
		return beeIDs[id];
	}
}
