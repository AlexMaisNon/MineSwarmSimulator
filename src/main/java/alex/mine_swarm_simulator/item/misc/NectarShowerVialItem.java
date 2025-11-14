package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.item.ConsumableItem;
import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class NectarShowerVialItem extends ConsumableItem {
	public NectarShowerVialItem() {
		super(new Item.Settings(), UseAction.DRINK, null, 100, true);
	}

	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		if(!world.isClient()) {
			world.getPlayers().forEach(playerEntity -> {
				playerEntity.sendMessage(Text.translatable("item.mine_swarm_simulator.nectar_shower_vial.use", user.getName()).formatted(Formatting.GREEN));
				playerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.COMFORTING_NECTAR_STATUS_EFFECT, 288000));
				playerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.INVIGORATING_NECTAR_STATUS_EFFECT, 288000));
				playerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.MOTIVATING_NECTAR_STATUS_EFFECT, 288000));
				playerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.REFRESHING_NECTAR_STATUS_EFFECT, 288000));
				playerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.SATISFYING_NECTAR_STATUS_EFFECT, 288000));
			});
		}
		return super.finishUsing(stack, world, user);
	}
}
