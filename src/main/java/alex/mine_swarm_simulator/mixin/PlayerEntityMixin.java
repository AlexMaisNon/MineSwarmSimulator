package alex.mine_swarm_simulator.mixin;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
abstract class LivingEntityMixin {
	@Shadow protected abstract float modifyAppliedDamage(DamageSource source, float amount);

	@Inject(method = "onRemoval", at = @At(value = "INVOKE", target = "Ljava/util/Map;clear()V"), cancellable = true)
	private void modifyOnRemoval(Entity.RemovalReason reason, CallbackInfo ci) {
		// This should prevent the effects from being deleted
		ci.cancel();
	}
}

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntityMixin {

    /* This part removes sprinting so it's more accurate to the og bee swarm simulator
    @Inject(method = "setSprinting", at = @At("HEAD"), cancellable = true)
    public void modifySprint(boolean sprinting, CallbackInfo ci) {
        if(((Object)this) instanceof PlayerEntity) {
            ((PlayerEntity)(Object)this).sendMessage(Text.literal("Sorry, you can't sprint in this mod !").formatted(Formatting.RED), true);
            ci.cancel();
        }
    }
    */

	@Inject(method = "createPlayerAttributes", at = @At("RETURN"), cancellable = true)
	private static void changePlayerAttributes(CallbackInfoReturnable cir) {
		DefaultAttributeContainer.Builder builder = (DefaultAttributeContainer.Builder)cir.getReturnValue();
		builder.add(ModAttributes.PLAYER_CONVERT_RATE);
		builder.add(ModAttributes.PLAYER_CONVERT_RATE_AT_HIVE);
		builder.add(ModAttributes.PLAYER_BONUS_CONVERT_AMOUNT);
		builder.add(ModAttributes.PLAYER_LOOT_LUCK);
		builder.add(ModAttributes.PLAYER_CRITICAL_CHANCE);
		builder.add(ModAttributes.PLAYER_CRITICAL_POWER);
		builder.add(ModAttributes.PLAYER_SUPER_CRIT_CHANCE);
		builder.add(ModAttributes.PLAYER_SUPER_CRIT_POWER);
		builder.add(ModAttributes.PLAYER_BEE_ABILITY_RATE);
		builder.add(ModAttributes.PLAYER_POLLEN);
		builder.add(ModAttributes.PLAYER_WHITE_POLLEN);
		builder.add(ModAttributes.PLAYER_RED_POLLEN);
		builder.add(ModAttributes.PLAYER_BLUE_POLLEN);
		builder.add(ModAttributes.PLAYER_TOOL_POLLEN);
		builder.add(ModAttributes.PLAYER_BEE_GATHER_POLLEN);
		builder.add(ModAttributes.PLAYER_BEE_ABILITY_POLLEN);
		builder.add(ModAttributes.PLAYER_BOMB_POLLEN);
		builder.add(ModAttributes.PLAYER_BUZZ_BOMB_POLLEN);
		builder.add(ModAttributes.PLAYER_RED_BOMB_POLLEN);
		builder.add(ModAttributes.PLAYER_BLUE_BOMB_POLLEN);
		builder.add(ModAttributes.PLAYER_BUBBLE_POLLEN);
		builder.add(ModAttributes.PLAYER_FLAME_POLLEN);
		builder.add(ModAttributes.PLAYER_INSTANT_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_WHITE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_RED_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BLUE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BOMB_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_FLAME_CONVERSION);
		builder.add(ModAttributes.PLAYER_HONEY_PER_POLLEN);
		builder.add(ModAttributes.PLAYER_HONEY_AT_HIVE);
		builder.add(ModAttributes.PLAYER_DEFENSE);
		builder.add(ModAttributes.PLAYER_BOND_FROM_TREATS);
		builder.add(ModAttributes.PLAYER_BOND_FROM_BATTLE);
		builder.add(ModAttributes.PLAYER_HONEY_FROM_TOKENS);
		builder.add(ModAttributes.PLAYER_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_RED_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_BLUE_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_COLORLESS_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_BEE_ATTACK_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_GOO);
		builder.add(ModAttributes.PLAYER_GOO_CONVERSION);
		builder.add(ModAttributes.PLAYER_CAPACITY_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_WHITE_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_RED_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_BLUE_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_CONVERT_TOTAL);
		builder.add(ModAttributes.PLAYER_GATHER_TOTAL);
		builder.add(ModAttributes.PLAYER_ATTACK_TOTAL);

		builder.add(ModAttributes.PLAYER_CAPACITY);
		builder.add(ModAttributes.PLAYER_MOVEMENT_COLLECTION);
		builder.add(ModAttributes.PLAYER_TICKET_CHANCE);
		builder.add(ModAttributes.PLAYER_BEE_MOVESPEED);
		builder.add(ModAttributes.PLAYER_ABILITY_TOKEN_LIFESPAN);
		builder.add(ModAttributes.PLAYER_BOMB_POWER);
		builder.add(ModAttributes.PLAYER_FLAME_DURATION);
		builder.add(ModAttributes.PLAYER_BUBBLE_DURATION);
		builder.add(ModAttributes.PLAYER_MARK_DURATION);
		builder.add(ModAttributes.PLAYER_ABILITY_DUPLICATION_CHANCE);
		builder.add(ModAttributes.PLAYER_DUPED_ABILITY_POLLEN);
		builder.add(ModAttributes.PLAYER_INSTANT_DUPED_ABILITY_CONVERSION);
		builder.add(ModAttributes.PLAYER_MONSTER_RESPAWN_TIME);
		builder.add(ModAttributes.PLAYER_COLLECTOR_TOOL_SPEED);
		builder.add(ModAttributes.PLAYER_CONVERSION_LINKS);
		builder.add(ModAttributes.PLAYER_MAX_BEE_ENERGY);
		builder.add(ModAttributes.PLAYER_INSTANT_BUBBLE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BEE_GATHER_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_TOOL_CONVERSION);
		builder.add(ModAttributes.PLAYER_UNIQUE_INSTANT_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_GIFTED_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_RED_ABILITY_CONVERSION);
		builder.add(ModAttributes.PLAYER_EVENT_BEE_ABILITY_POLLEN);
		builder.add(ModAttributes.PLAYER_TABBY_BEE_CONVERT_RATE);
		builder.add(ModAttributes.PLAYER_TABBY_BEE_POLLEN_COLLECTION);
		builder.add(ModAttributes.PLAYER_POLLEN_FROM_SCRATCH);
		builder.add(ModAttributes.PLAYER_TORNADO_POLLEN);
		builder.add(ModAttributes.PLAYER_GUMMY_BEE_SPEED);
		builder.add(ModAttributes.PLAYER_GUMMY_BEE_GATHER_AMOUNT);
		builder.add(ModAttributes.PLAYER_GUMMY_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_BLUE_BEE_CONVERT_RATE);
		builder.add(ModAttributes.PLAYER_RED_BEE_CONVERT_RATE);
		builder.add(ModAttributes.PLAYER_COLORLESS_BEE_CONVERT_RATE);
		builder.add(ModAttributes.PLAYER_COMMON_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_RARE_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_EPIC_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_LEGENDARY_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_MYTHIC_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_EVENT_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_UNGIFTED_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_GIFTED_BEE_POLLEN);
		builder.add(ModAttributes.PLAYER_MARK_ABILITY_POLLEN);
		builder.add(ModAttributes.PLAYER_BLUE_BEE_ATTACK_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_RED_BEE_ATTACK_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_COLORLESS_BEE_ATTACK_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_COMMON_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_RARE_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_EPIC_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_LEGENDARY_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_MYTHIC_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_EVENT_BEE_ATTACK);
		builder.add(ModAttributes.PLAYER_UNGIFTED_BEE_ATTACK_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_GIFTED_BEE_ATTACK_MULTIPLIER);
		builder.add(ModAttributes.PLAYER_INSTANT_COMMON_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_RARE_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_EPIC_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_LEGENDRAY_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_MYTHIC_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_EVENT_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BLUE_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_RED_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_COLORLESS_BEE_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BEE_ABILITY_CONVERSION);
		builder.add(ModAttributes.PLAYER_HONEY_PER_GOO);
		builder.add(ModAttributes.PLAYER_POLLEN_FROM_COCONUTS);
		builder.add(ModAttributes.PLAYER_DODGE_CHANCE);
		builder.add(ModAttributes.PLAYER_MOVEMENT_COLLECTION_POLLEN);
		builder.add(ModAttributes.PLAYER_FLAME_DAMAGE);
		builder.add(ModAttributes.PLAYER_IMPALE_DAMAGE);
		builder.add(ModAttributes.PLAYER_NECTAR);
		builder.add(ModAttributes.PLAYER_CONVERT_SPEED);
		builder.add(ModAttributes.PLAYER_DANDELION_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_SUNFLOWER_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_MUSHROOM_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_CLOVER_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_STRAWBERRY_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_SPIDER_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_BAMBOO_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_PINEAPPLE_PATCH_POLLEN);
		builder.add(ModAttributes.PLAYER_STUMP_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_CACTUS_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_PUMPKIN_PATCH_POLLEN);
		builder.add(ModAttributes.PLAYER_ROSE_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_PINE_TREE_FOREST_POLLEN);
		builder.add(ModAttributes.PLAYER_ANT_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_HUB_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_COCONUT_FIELD_POLLEN);
		builder.add(ModAttributes.PLAYER_PEPPER_PATCH_POLLEN);
		builder.add(ModAttributes.PLAYER_DANDELION_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_SUNFLOWER_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_MUSHROOM_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_CLOVER_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_BLUE_FLOWER_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_STRAWBERRY_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_SPIDER_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_BAMBOO_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_PINEAPPLE_PATCH_CAPACITY);
		builder.add(ModAttributes.PLAYER_STUMP_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_CACTUS_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_PUMPKIN_PATCH_CAPACITY);
		builder.add(ModAttributes.PLAYER_ROSE_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_PINE_TREE_FOREST_CAPACITY);
		builder.add(ModAttributes.PLAYER_ANT_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_HUB_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_MOUNTAIN_TOP_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_COCONUT_FIELD_CAPACITY);
		builder.add(ModAttributes.PLAYER_PEPPER_PATCH_CAPACITY);
		builder.add(ModAttributes.PLAYER_INSTANT_DANDELION_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_SUNFLOWER_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_MUSHROOM_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_CLOVER_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BLUE_FLOWER_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_STRAWBERRY_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_SPIDER_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_BAMBOO_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_PINEAPPLE_PATCH_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_STUMP_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_CACTUS_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_PUMPKIN_PATCH_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_ROSE_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_PINE_TREE_FOREST_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_ANT_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_HUB_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_MOUNTAIN_TOP_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_COCONUT_FIELD_CONVERSION);
		builder.add(ModAttributes.PLAYER_INSTANT_PEPPER_PATCH_CONVERSION);
	}

	@Redirect(method = "applyDamage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;modifyAppliedDamage(Lnet/minecraft/entity/damage/DamageSource;F)F"))
	public float modifiedApplyDamage(PlayerEntity instance, DamageSource damageSource, float v) {
		float damageAmount = this.modifyAppliedDamage(damageSource, v);
		double defenseStat = instance.getAttributes().getValue(ModAttributes.PLAYER_DEFENSE);
		return (float)(1 - defenseStat < 0 ? 0 : damageAmount * (1 - defenseStat));
	}
}
