package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class NightBellItem extends Item {

	public NightBellItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack currentItemStack = user.getStackInHand(hand);
		user.getItemCooldownManager().set(this, 20);

		if(world.isDay()) {
			if(world instanceof ServerWorld serverWorld) {
				for(PlayerEntity player : world.getPlayers()) {
					player.sendMessage(Text.translatable("item.mine_swarm_simulator.night_bell.announce", user.getName()).formatted(Formatting.GRAY));
				}
				world.playSound(null, user.getBlockPos(), ModSounds.NIGHT_BELL_USE, SoundCategory.PLAYERS, 100f, 1f);

				if(!user.isInCreativeMode()) {
					currentItemStack.decrement(1);
				}
				serverWorld.setTimeOfDay(18000L);
			}

		} else {
			user.sendMessage(Text.translatable("item.mine_swarm_simulator.night_bell.failure").formatted(Formatting.RED));
		}
		return super.use(world, user, hand);
	}

}
