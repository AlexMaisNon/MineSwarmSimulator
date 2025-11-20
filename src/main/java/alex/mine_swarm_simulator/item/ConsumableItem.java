package alex.mine_swarm_simulator.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ConsumableItem extends Item {
	private final boolean thickSound;
	private final UseAction action;
	@Nullable private final StatusEffectInstance effect;
	private final int cooldown;

	public ConsumableItem(Settings settings, UseAction action, @Nullable StatusEffectInstance effect, int cooldown) {
		super(settings);
		this.effect = effect;
		this.action = action;
		this.cooldown = cooldown;
		this.thickSound = false;
	}

	public ConsumableItem(Settings settings, UseAction action, @Nullable StatusEffectInstance effect, int cooldown, boolean thickSound) {
		super(settings);
		this.effect = effect;
		this.action = action;
		this.cooldown = cooldown;
		this.thickSound = thickSound;
	}

	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		if(this.action != UseAction.NONE) {
			this.useItem(stack, world, user);
		}
		return super.finishUsing(stack, world, user);
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return action;
	}

	@Override
	public SoundEvent getDrinkSound() {
		return thickSound ? SoundEvents.ITEM_HONEY_BOTTLE_DRINK : SoundEvents.ENTITY_GENERIC_DRINK;
	}

	@Override
	public int getMaxUseTime(ItemStack stack, LivingEntity user) {
		return action == UseAction.NONE ? 0 : 32;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		if(this.action == UseAction.NONE) {
			this.useItem(user.getStackInHand(hand), world, user);
		}

		return ItemUsage.consumeHeldItem(world, user, hand);
	}

	private void useItem(ItemStack stack, World world, LivingEntity user) {
		if(user instanceof PlayerEntity playerEntity) {
			playerEntity.getItemCooldownManager().set(this, cooldown);
			if(!playerEntity.isInCreativeMode()) {
				stack.decrement(1);
			}
		} else {
			stack.decrement(1);
		}

		if(effect != null && !world.isClient) {
			user.addStatusEffect(new StatusEffectInstance(effect));
		}
	}
}
