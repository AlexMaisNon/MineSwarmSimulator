package alex.mine_swarm_simulator.armor;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.armor.client.*;
import alex.mine_swarm_simulator.mixin.EntityModelLayersAccessor;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ArmorModelHandler {

	// Guards
	public static final EntityModelLayer LEFT_GUARD = model("left_guard");
	public static final EntityModelLayer RIGHT_GUARD = model("right_guard");
	public static final EntityModelLayer ELITE_RED_GUARD = model("elite_red_guard");
	public static final EntityModelLayer ELITE_BLUE_GUARD = model("elite_blue_guard");
	public static final EntityModelLayer RILEY_GUARD = model("bucko_guard");
	public static final EntityModelLayer BUCKO_GUARD = model("riley_guard");
	public static final EntityModelLayer CRIMSON_GUARD = model("crimson_guard");
	public static final EntityModelLayer COBALT_GUARD = model("cobalt_guard");

	// Hats
	public static final EntityModelLayer HELMET = model("helmet");
	public static final EntityModelLayer PROPELLER_HAT = model("propeller_hat");
	public static final EntityModelLayer STRANGE_GOGGLES = model("strange_goggles");
	public static final EntityModelLayer BEEKEEPER_MASK = model("beekeeper_mask");
	public static final EntityModelLayer HONEY_MASK = model("honey_mask");
	public static final EntityModelLayer BUBBLE_MASK = model("bubble_mask");
	public static final EntityModelLayer FIRE_MASK = model("fire_mask");
	public static final EntityModelLayer DEMON_MASK = model("demon_mask");
	public static final EntityModelLayer DIAMOND_MASK = model("diamond_mask");
	public static final EntityModelLayer GUMMY_MASK = model("gummy_mask");
	public static final EntityModelLayer BBM_MASK = model("bbm_mask");
	public static final EntityModelLayer MONDO_BBM_MASK = model("mondo_bbm_mask");

	// Belts
	public static final EntityModelLayer BELT_POCKET = model("belt_pocket");
	public static final EntityModelLayer BELT_BAG = model("belt_bag");
	public static final EntityModelLayer MONDO_BELT_BAG = model("mondo_belt_bag");
	public static final EntityModelLayer HONEYCOMB_BELT = model("honeycomb_belt");
	public static final EntityModelLayer PETAL_BELT = model("petal_belt");
	public static final EntityModelLayer COCONUT_BELT = model("coconut_belt");

	// Boots
	public static final EntityModelLayer BASIC_BOOTS = model("basic_boots");
	public static final EntityModelLayer HIKING_BOOTS = model("hiking_boots");
	public static final EntityModelLayer BEEKEEPER_BOOTS = model("beekeeper_boots");
	public static final EntityModelLayer COCONUT_CLOGS = model("coconut_clogs");
	public static final EntityModelLayer GUMMY_BOOTS = model("gummy_boots");

	// Bags
	public static final EntityModelLayer POUCH = model("pouch");
	public static final EntityModelLayer JAR = model("jar");
	public static final EntityModelLayer BACKPACK = model("backpack");
	public static final EntityModelLayer CANISTER = model("canister");
	public static final EntityModelLayer MEGA_JUG = model("mega_jug");
	public static final EntityModelLayer COMPRESSOR = model("compressor");
	public static final EntityModelLayer ELITE_BARREL = model("elite_barrel");
	public static final EntityModelLayer PORT_O_HIVE = model("port_o_hive");
	public static final EntityModelLayer PORCELAIN_PORT_O_HIVE = model("porcelain_port_o_hive");
	public static final EntityModelLayer COCONUT_CANISTER = model("coconut_canister");

	// Amulets
	public static final EntityModelLayer KING_BEETLE_AMULET = model("king_beetle_amulet");
	public static final EntityModelLayer ANT_AMULET = model("ant_amulet");
	public static final EntityModelLayer SUPREME_ANT_AMULET = model("supreme_ant_amulet");
	public static final EntityModelLayer MOON_AMULET = model("moon_amulet");
	public static final EntityModelLayer STICK_BUG_AMULET = model("stick_bug_amulet");
	public static final EntityModelLayer STAR_AMULET = model("star_amulet");
	public static final EntityModelLayer SHELL_AMULET = model("shell_amulet");
	public static final EntityModelLayer COG_AMULET = model("cog_amulet");

	public static void init(BiConsumer<EntityModelLayer, TexturedModelData> consumer) {
		// Guards
		consumer.accept(LEFT_GUARD, TexturedModelData.of(LeftGuardModel.getModelData(), 32, 32));
		consumer.accept(RIGHT_GUARD, TexturedModelData.of(RightGuardModel.getModelData(), 32, 32));
		consumer.accept(ELITE_RED_GUARD, TexturedModelData.of(EliteRedGuardModel.getModelData(), 32, 32));
		consumer.accept(ELITE_BLUE_GUARD, TexturedModelData.of(EliteBlueGuardModel.getModelData(), 32, 32));
		consumer.accept(BUCKO_GUARD, TexturedModelData.of(BuckoGuardModel.getModelData(), 64, 64));
		consumer.accept(RILEY_GUARD, TexturedModelData.of(RileyGuardModel.getModelData(), 64, 64));
		consumer.accept(CRIMSON_GUARD, TexturedModelData.of(CrimsonGuardModel.getModelData(), 64, 64));
		consumer.accept(COBALT_GUARD, TexturedModelData.of(CobaltGuardModel.getModelData(), 64, 64));

		// Hats
		consumer.accept(HELMET, TexturedModelData.of(HelmetModel.getModelData(), 64, 64));
		consumer.accept(PROPELLER_HAT, TexturedModelData.of(PropellerHatModel.getModelData(), 64, 64));
		consumer.accept(STRANGE_GOGGLES, TexturedModelData.of(StrangeGogglesModel.getModelData(), 32, 32));
		consumer.accept(BEEKEEPER_MASK, TexturedModelData.of(BeekeeperMaskModel.getModelData(), 64, 64));
		consumer.accept(HONEY_MASK, TexturedModelData.of(MaskModel.getModelData(), 64, 64));
		consumer.accept(BUBBLE_MASK, TexturedModelData.of(MaskModel.getModelData(), 64, 64));
		consumer.accept(FIRE_MASK, TexturedModelData.of(MaskModel.getModelData(), 64, 64));
		consumer.accept(DEMON_MASK, TexturedModelData.of(DemonMaskModel.getModelData(), 64, 64));
		consumer.accept(DIAMOND_MASK, TexturedModelData.of(DiamondMaskModel.getModelData(), 64, 64));
		consumer.accept(GUMMY_MASK, TexturedModelData.of(GummyMaskModel.getModelData(), 64, 64));
		consumer.accept(BBM_MASK, TexturedModelData.of(BbmMaskModel.getModelData(), 64, 64));
		consumer.accept(MONDO_BBM_MASK, TexturedModelData.of(MondoBbmMaskModel.getModelData(), 128, 128));

		// Belts
		consumer.accept(BELT_POCKET, TexturedModelData.of(BeltPocketModel.getModelData(), 32, 32));
		consumer.accept(BELT_BAG, TexturedModelData.of(BeltBagModel.getModelData(), 32, 32));
		consumer.accept(MONDO_BELT_BAG, TexturedModelData.of(MondoBeltBagModel.getModelData(), 32, 32));
		consumer.accept(HONEYCOMB_BELT, TexturedModelData.of(HoneycombBeltModel.getModelData(), 32, 32));
		consumer.accept(PETAL_BELT, TexturedModelData.of(PetalBeltModel.getModelData(), 32, 32));
		consumer.accept(COCONUT_BELT, TexturedModelData.of(CoconutBeltModel.getModelData(), 128, 128));

		// Boots
		consumer.accept(BASIC_BOOTS, TexturedModelData.of(BasicBootsModel.getModelData(), 64, 64));
		consumer.accept(HIKING_BOOTS, TexturedModelData.of(HikingBootsModel.getModelData(), 64, 64));
		consumer.accept(BEEKEEPER_BOOTS, TexturedModelData.of(BeekeeperBootsModel.getModelData(), 64, 64));
		consumer.accept(COCONUT_CLOGS, TexturedModelData.of(CoconutClogsModel.getModelData(), 64, 64));
		consumer.accept(GUMMY_BOOTS, TexturedModelData.of(GummyBootsModel.getModelData(), 64, 64));

		// Bags
		consumer.accept(POUCH, TexturedModelData.of(PouchModel.getModelData(), 64, 64));
		consumer.accept(JAR, TexturedModelData.of(JarModel.getModelData(), 128, 128));
		consumer.accept(BACKPACK, TexturedModelData.of(BackpackModel.getModelData(), 64, 64));
		consumer.accept(CANISTER, TexturedModelData.of(CanisterModel.getModelData(), 128, 128));
		consumer.accept(MEGA_JUG, TexturedModelData.of(MegaJugModel.getModelData(), 128, 128));
		consumer.accept(COMPRESSOR, TexturedModelData.of(CompressorModel.getModelData(), 256, 256));
		consumer.accept(ELITE_BARREL, TexturedModelData.of(EliteBarrelModel.getModelData(), 256, 256));
		consumer.accept(PORT_O_HIVE, TexturedModelData.of(PortOHiveModel.getModelData(), 256, 256));
		consumer.accept(PORCELAIN_PORT_O_HIVE, TexturedModelData.of(PorcelainPortOHiveModel.getModelData(), 256, 256));
		consumer.accept(COCONUT_CANISTER, TexturedModelData.of(CoconutCanisterModel.getModelData(), 256, 256));

		// Amulets
		consumer.accept(KING_BEETLE_AMULET, TexturedModelData.of(KingBeetleAmuletModel.getModelData(), 32, 32));
		consumer.accept(ANT_AMULET, TexturedModelData.of(AntAmuletModel.getModelData(), 16, 16));
		consumer.accept(SUPREME_ANT_AMULET, TexturedModelData.of(SupremeAntAmuletModel.getModelData(), 16, 16));
		consumer.accept(MOON_AMULET, TexturedModelData.of(MoonAmuletModel.getModelData(), 32, 32));
		consumer.accept(STICK_BUG_AMULET, TexturedModelData.of(StickBugAmuletModel.getModelData(), 16, 16));
		consumer.accept(STAR_AMULET, TexturedModelData.of(StarAmuletModel.getModelData(), 32, 32));
		consumer.accept(SHELL_AMULET, TexturedModelData.of(ShellAmuletModel.getModelData(), 32, 32));
		consumer.accept(COG_AMULET, TexturedModelData.of(CogAmuletModel.getModelData(), 32, 32));
	}

	public static EntityModelLayer model(String name) {
		var result = new EntityModelLayer(Identifier.of(MineSwarmSimulator.MOD_ID, name), "main");
		EntityModelLayersAccessor.getLAYERS().add(result);
		return result;
	}
}
