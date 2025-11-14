package alex.mine_swarm_simulator.entity;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.status_effect.custom.ModStatusModifier;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;

import java.util.Arrays;
import java.util.Comparator;

public enum BeeType {
	BASIC(0, "common", "colorless", 20f, 14f, 1f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BOMBER(1, "rare", "colorless", 20f, 15.4f, 1f, 10, 120, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BOMB_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BRAVE(2, "rare", "colorless", 30f, 16.8f, 5f, 10, 200, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK, 1d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BUMBLE(3, "rare", "blue", 50f, 10.5f, 1f, 18, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 1d / 12d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	COOL(4, "rare", "blue", 20f, 14f, 2f, 10, 120, 3f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BLUE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	HASTY(5, "rare", "colorless", 20f, 19.6f, 1f, 10, 80, 3f, 3f, new ModStatusModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.15d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	LOOKER(6, "rare", "colorless", 20f, 14f, 1f, 13, 160, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	RAD(7, "rare", "red", 20f, 14f, 1f, 13, 80, 4f, 3f, new ModStatusModifier(ModAttributes.PLAYER_RED_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	RASCAL(8, "rare", "red", 20f, 16.1f, 3f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_RED_BOMB_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	STUBBORN(9, "rare", "colorless", 20f, 11.9f, 2f, 10, 80, 4f, 3f, new ModStatusModifier(ModAttributes.PLAYER_ABILITY_TOKEN_LIFESPAN, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BUBBLE(10, "epic", "blue", 20f, 16.1f, 3f, 10, 160, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BUBBLE_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BUCKO(11, "epic", "blue", 30f, 15.4f, 5f, 17, 80, 4f, 3f, new ModStatusModifier(ModAttributes.PLAYER_BLUE_FIELD_CAPACITY, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	COMMANDER(12, "epic", "colorless", 30f, 14f, 4f, 15, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_CHANCE, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DEMO(13, "epic", "colorless", 20f, 16.8f, 3f, 10, 200, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BUZZ_BOMB_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	EXHAUSTED(14, "epic", "colorless", -1f, 10.5f, 1f, 10, 240, 4.6f, 4f, new ModStatusModifier(ModAttributes.PLAYER_WHITE_FIELD_CAPACITY, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	FIRE(15, "epic", "red", 25f, 11.2f, 4f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_FLAME_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	FROSTY(16, "epic", "blue", 25f, 11.2f, 1f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BLUE_BOMB_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	HONEY(17, "epic", "colorless", 20f, 14f, 1f, 10, 360, 4f, 2f, new ModStatusModifier(ModAttributes.PLAYER_HONEY_FROM_TOKENS, 0.5d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	RAGE(18, "epic", "red", 20f, 15.4f, 4f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)),
	RILEY(19, "epic", "red", 25f, 15.4f, 5f, 10, 140, 2f, 4f, new ModStatusModifier(ModAttributes.PLAYER_RED_FIELD_CAPACITY, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	SHOCKED(20, "epic", "colorless", 20f, 19.6f, 2f, 10, 80, 4f, 2f, new ModStatusModifier(ModAttributes.PLAYER_WHITE_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	BABY(21, "legendary", "colorless", 15f, 10.5f, 0f, 10, 80, 5f, 5f, new ModStatusModifier(ModAttributes.PLAYER_LOOT_LUCK, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	CARPENTER(22, "legendary", "colorless", 25f, 11.2f, 4f, 10, 120, 3f, 4f, new ModStatusModifier(ModAttributes.PLAYER_TOOL_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DEMON(23, "legendary", "red", 20f, 10.5f, 8f, 35, 60, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BOMB_CONVERSION, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DIAMOND(24, "legendary", "blue", 20f, 14f, 1f, 10, 1000, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	LION(25, "legendary", "colorless", 60f, 19.6f, 9f, 20, 160, 4f, 2f, new ModStatusModifier(ModAttributes.PLAYER_GIFTED_BEE_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	MUSIC(26, "legendary", "colorless", 20f, 16.1f, 1f, 16, 240, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BEE_GATHER_POLLEN, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	NINJA(27, "legendary", "blue", 20f, 21f, 4f, 10, 80, 2f, 3f, new ModStatusModifier(ModAttributes.PLAYER_BEE_MOVESPEED, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	SHY(28, "legendary", "red", 40f, 18.2f, 2f, 10, 320, 2f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BEE_ABILITY_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BUOYANT(29, "mythic", "blue", 60f, 14f, 3f, 15, 150, 5f, 3f, new ModStatusModifier(ModAttributes.PLAYER_CAPACITY_MULTIPLIER, 0.2d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	FUZZY(30, "mythic", "colorless", 50f, 11.9f, 3f, 100, 40, 6f, 6f, new ModStatusModifier(ModAttributes.PLAYER_BOMB_POWER, 0.1d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	PRECISE(31, "mythic", "red", 40f, 11.2f, 8f, 20, 130, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_SUPER_CRIT_CHANCE, 0.03d, EntityAttributeModifier.Operation.ADD_VALUE)),
	SPICY(32, "mythic", "red", 20f, 14f, 5f, 14, 200, 4f, 2f, new ModStatusModifier(ModAttributes.PLAYER_FLAME_DURATION, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	TADPOLE(33, "mythic", "blue", 10f, 11.2f, 0.5f, 10, 120, 6f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BUBBLE_DURATION, 0.25d, EntityAttributeModifier.Operation.ADD_VALUE)),
	VECTOR(34, "mythic", "colorless", 45.6f, 16.24f, 5f, 18, 144, 4f, 2.72f, new ModStatusModifier(ModAttributes.PLAYER_MARK_DURATION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	BEAR(35, "event", "colorless", 35f, 14f, 5f, 15, 200, 2f, 2f, new ModStatusModifier(ModAttributes.PLAYER_POLLEN, 0.1d, EntityAttributeModifier.Operation.ADD_VALUE)),
	COBALT(36, "event", "blue", 35f, 18.2f, 6f, 10, 120, 4f, 3f, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	CRIMSON(37, "event", "red", 35f, 18.2f, 6f, 10, 120, 4f, 3f, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_RED_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	DIGITAL(38, "event", "colorless", 20f, 11.9f, 1f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_ABILITY_DUPLICATION_CHANCE, 0.01d, EntityAttributeModifier.Operation.ADD_VALUE)),
	FESTIVE(39, "event", "red", 20f, 16.1f, 1f, 40, 150, 4f, 1f, new ModStatusModifier(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE, 0.25d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)),
	GUMMY(40, "event", "colorless", 50f, 14f, 3f, 10, 700, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_HONEY_PER_POLLEN, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	PHOTON(41, "event", "colorless", -1f, 21f, 3f, 20, 240, 2f, 2f, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_CONVERSION, 0.05d, EntityAttributeModifier.Operation.ADD_VALUE)),
	PUPPY(42, "event", "colorless", 40f, 16.1f, 2f, 25, 280, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_BOND_FROM_TREATS, 0.2d, EntityAttributeModifier.Operation.ADD_VALUE)),
	TABBY(43, "event", "colorless", 28f, 16.1f, 4f, 10, 160, 4f, 3f, new ModStatusModifier(ModAttributes.PLAYER_CRITICAL_POWER, 0.5d, EntityAttributeModifier.Operation.ADD_VALUE)),
	VICIOUS(44, "event", "blue", 50f, 17.5f, 8f, 10, 80, 4f, 4f, new ModStatusModifier(ModAttributes.PLAYER_MONSTER_RESPAWN_TIME, -0.15d, EntityAttributeModifier.Operation.ADD_VALUE)),
	WINDY(45, "event", "colorless", 20f, 19.6f, 3f, 10, 180, 3f, 2f, new ModStatusModifier(ModAttributes.PLAYER_INSTANT_WHITE_CONVERSION, 0.15d, EntityAttributeModifier.Operation.ADD_VALUE));

	private final int id;
	private final String rarity;
	private final String color;
	private final float energy;
	private final float speed;
	private final float attack;
	private final int gatherAmount;
	private final int convertAmount;
	private final float gatherSpeed;
	private final float convertSpeed;
	private final ModStatusModifier giftedHiveBonus;

	private static final BeeType[] beeIds = Arrays.stream(values()).sorted(Comparator.comparingInt(BeeType::getId)).toArray(BeeType[]::new);

	BeeType(int id, String rarity, String color, float energy, float speed, float attack, int gatherAmount, int convertAmount, float gatherSpeed, float convertSpeed, ModStatusModifier giftedHiveBonus) {
		this.id = id;
		this.rarity = rarity;
		this.color = color;
		this.energy = energy;
		this.speed = speed;
		this.attack = attack;
		this.gatherAmount = gatherAmount;
		this.convertAmount = convertAmount;
		this.gatherSpeed = gatherSpeed;
		this.convertSpeed = convertSpeed;
		this.giftedHiveBonus = giftedHiveBonus;
	}

	public int getId() {
		return id;
	}

	public String getRarity() {
		return rarity;
	}

	public String getColor() {
		return color;
	}

	public float getEnergy() {
		return energy;
	}

	public float getSpeed() {
		return speed;
	}

	public float getAttack() {
		return attack;
	}

	public int getGatherAmount() {
		return gatherAmount;
	}

	public int getConvertAmount() {
		return convertAmount;
	}

	public float getGatherSpeed() {
		return gatherSpeed;
	}

	public float getConvertSpeed() {
		return convertSpeed;
	}

	public ModStatusModifier getGiftedHiveBonus() {
		return giftedHiveBonus;
	}

	public static BeeType byId(int id) {
		return beeIds[id];
	}
}
