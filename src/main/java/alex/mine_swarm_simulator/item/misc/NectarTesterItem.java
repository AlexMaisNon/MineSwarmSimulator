package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class NectarTesterItem extends Item {
	public NectarTesterItem() {
		super(new Item.Settings());
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		if(!world.isClient()) {
			ItemStack currentItemStack = user.getStackInHand(hand);
			user.getItemCooldownManager().set(this, 72000);
			user.addStatusEffect(new StatusEffectInstance(ModStatusEffects.COMFORTING_NECTAR_STATUS_EFFECT, 1728000));
			user.addStatusEffect(new StatusEffectInstance(ModStatusEffects.INVIGORATING_NECTAR_STATUS_EFFECT, 1728000));
			user.addStatusEffect(new StatusEffectInstance(ModStatusEffects.MOTIVATING_NECTAR_STATUS_EFFECT, 1728000));
			user.addStatusEffect(new StatusEffectInstance(ModStatusEffects.REFRESHING_NECTAR_STATUS_EFFECT, 1728000));
			user.addStatusEffect(new StatusEffectInstance(ModStatusEffects.SATISFYING_NECTAR_STATUS_EFFECT, 1728000));

			if(!user.isInCreativeMode()) {
				currentItemStack.decrement(1);
			}
		}
		return super.use(world, user, hand);
	}
}
