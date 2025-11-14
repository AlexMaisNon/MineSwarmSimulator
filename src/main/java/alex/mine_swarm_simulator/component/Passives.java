package alex.mine_swarm_simulator.component;

import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import alex.mine_swarm_simulator.sound.ModSounds;
import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import alex.mine_swarm_simulator.util.GooObject;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passives {
	// Passives
	public static final PassivesComponent.Passive HASTE_PULSER = new PassivesComponent.Passive("haste_pulser", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive FOCUS_PULSER = new PassivesComponent.Passive("focus_pulser", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive BUBBLE_BOMBS = new PassivesComponent.Passive("bubble_bombs", (short)0, (short)25, 0L);
	public static final PassivesComponent.Passive DIAMOND_DRAIN = new PassivesComponent.Passive("diamond_drain", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive IGNITE = new PassivesComponent.Passive("ignite", (short)0, (short)15, 0L);
	public static final PassivesComponent.Passive X_FLAME = new PassivesComponent.Passive("x_flame", (short)0, (short)25, 0L);
	public static final PassivesComponent.Passive COIN_SCATTER = new PassivesComponent.Passive("coin_scatter", (short)0, (short)20, 0L);
	public static final PassivesComponent.Passive GUMMY_MORPH = new PassivesComponent.Passive("gummy_morph", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive COCONUT_HASTE = new PassivesComponent.Passive("coconut_haste", (short)0, (short)0, 0L);
	public static final PassivesComponent.Passive GOO_TRAIL = new PassivesComponent.Passive("goo_trail", (short)0, (short)0, 0L);
	public static final PassivesComponent.Passive EMERGENCY_COCONUT_SHIELD = new PassivesComponent.Passive("emergency_coconut_shield", (short)0, (short)0, 0L);
	public static final PassivesComponent.Passive INSPIRE_COCONUTS = new PassivesComponent.Passive("inspire_coconuts", (short)0, (short)5, 0L);
	public static final PassivesComponent.Passive PETAL_STORM = new PassivesComponent.Passive("petal_storm", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive COMBO_COCONUTS = new PassivesComponent.Passive("combo_coconuts", (short)0, (short)40, 0L);
	public static final PassivesComponent.Passive GUIDING_STAR = new PassivesComponent.Passive("guiding_star", (short)0, (short)250, 0L);
	public static final PassivesComponent.Passive STAR_SHOWER = new PassivesComponent.Passive("star_shower", (short)0, (short)40, 0L);
	public static final PassivesComponent.Passive POP_STAR = new PassivesComponent.Passive("pop_star", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive GUMMY_STAR = new PassivesComponent.Passive("gummy_star", (short)0, (short)75, 0L);
	public static final PassivesComponent.Passive SCORCHING_STAR = new PassivesComponent.Passive("scorching_star", (short)0, (short)30, 0L);
	public static final PassivesComponent.Passive STAR_SAW = new PassivesComponent.Passive("star_saw", (short)0, (short)3, 0L);

	// Accessory Passives
	public static void HastePulser() {

	}

	public static void FocusPulser() {

	}

	public static void BubbleBombs() {

	}

	public static void DiamondDrain() {

	}

	public static void Ignite() {

	}

	public static void XFlame() {

	}

	public static void CoinScatter() {

	}

	public static void GummyMorph() {

	}

	public static void CoconutHaste() {

	}

	public static void GooTrail(ServerWorld serverWorld, PlayerEntity playerEntity, BlockPos startPos) {
		BlockPos[] toCheck = {
			startPos,
			new BlockPos(startPos.getX() - 1, startPos.getY(), startPos.getZ()),
			new BlockPos(startPos.getX() + 1, startPos.getY(), startPos.getZ()),
			new BlockPos(startPos.getX(), startPos.getY(), startPos.getZ() - 1),
			new BlockPos(startPos.getX(), startPos.getY(), startPos.getZ() + 1)
		};

		for(BlockPos blockPos : toCheck) {
			if(serverWorld.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
				GooObject gooObject = flowerBlockEntity.getGoo().stream().filter(value -> Objects.equals(value.getOwner(), playerEntity.getUuidAsString())).findAny().orElse(null);
				if(gooObject != null) {
					flowerBlockEntity.modifyGooDuration(gooObject, 1f);
				} else {
					flowerBlockEntity.addGoo(new GooObject(5, 1f, playerEntity.getUuidAsString()));
				}
			}
		}
		GooTrailFix(serverWorld, playerEntity, startPos, new ArrayList<>());
	}

	public static void GooTrailFix(ServerWorld serverWorld, PlayerEntity playerEntity, BlockPos currentPos, List<BlockPos> seen) {
		if(!seen.contains(currentPos)) {
			seen.add(currentPos);

			BlockPos[] neighbors = {
				new BlockPos(currentPos.getX() - 1, currentPos.getY(), currentPos.getZ()),
				new BlockPos(currentPos.getX() + 1, currentPos.getY(), currentPos.getZ()),
				new BlockPos(currentPos.getX(), currentPos.getY(), currentPos.getZ() - 1),
				new BlockPos(currentPos.getX(), currentPos.getY(), currentPos.getZ() + 1)
			};
			for(BlockPos blockPos : neighbors) {
				if(serverWorld.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
					GooObject gooObject = flowerBlockEntity.getGoo().stream().filter(value -> Objects.equals(value.getOwner(), playerEntity.getUuidAsString())).findAny().orElse(null);
					if(gooObject != null) {
						flowerBlockEntity.modifyGooRadius(gooObject, seen.size());
						GooTrailFix(serverWorld, playerEntity, blockPos, seen);
					}
				}
			}
		}
	}

	public static void EmergencyCoconutShield(ServerWorld serverWorld, PlayerEntity playerEntity, ItemStack stack) {
		playerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.EMERGENCY_COCONUT_SHIELD_STATUS_EFFECT, 200));
		serverWorld.playSound(null, playerEntity.getBlockPos(), ModSounds.COCONUT_CANISTER_SHIELD, SoundCategory.PLAYERS, 10f, 1f);
		stack.set(ModComponents.PASSIVES_COMPONENT, stack.get(ModComponents.PASSIVES_COMPONENT).updatePassive("emergency_coconut_shield", serverWorld.getTime() + 6000L));
	}

	public static void InspireCoconuts() {

	}

	public static void PetalStorm() {

	}

	public static void ComboCoconuts() {

	}

	// SSA Passives
	public static void GuidingStar() {

	}

	public static void StarShower() {

	}

	public static void PopStar() {

	}

	public static void GummyStar() {

	}

	public static void ScorchingStar() {

	}

	public static void StarSaw() {

	}

	// Bee Passives
	public static void GatheringBubbles() {

	}

	public static void GatheringFlames() {

	}

	public static void SteamEngine() {

	}

	public static void FuzzyCoat() {

	}

	public static void NectarLover() {

	}

	public static void ShimmeringHoney() {

	}

	public static void BalloonEnthusiast() {

	}

	public static void Sniper() {

	}

	public static void DriveExpansion() {

	}
}
