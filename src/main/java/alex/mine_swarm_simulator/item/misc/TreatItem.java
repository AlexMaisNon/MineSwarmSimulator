package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.block.entity.HiveBlockEntity;
import alex.mine_swarm_simulator.entity.BeeEntity;
import alex.mine_swarm_simulator.util.BeeType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class TreatItem extends Item {
	private final int bond;
	private final float giftedChance;
	@Nullable private final BeeType[] favorites;
	private final Random random = new Random();

	public TreatItem(int bond, float giftedChance) {
		super(new Item.Settings());

		this.bond = bond;
		this.giftedChance = giftedChance;
		this.favorites = null;
	}

	public TreatItem(int bond, BeeType[] favorites) {
		super(new Item.Settings());

		this.bond = bond;
		this.giftedChance = -1f;
		this.favorites = favorites;
	}

	public int getBond(BeeType beeType) {
		return this.inFavorites(beeType) ? this.bond * 2 : this.bond;
	}

	public float getGiftedChance(BeeType beeType) {
		if(this.giftedChance < 0) {
			return this.inFavorites(beeType) ? switch(beeType.getRarity()) {
				case "rare" -> 0.000125f;
				case "epic" -> 0.0001f;
				case "legendary", "common" -> 0.000083f;
				default -> 0.0000417f;
			} : 0;
		}
		return this.giftedChance;
	}

	public boolean inFavorites(BeeType beeType) {
		if(this.favorites == null) {
			return false;
		}
		boolean found = false;
		byte i = 0;

		while(!found && i < this.favorites.length) {
			found = this.favorites[i] == beeType;
			i++;
		}

		return found;
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		if(context.getPlayer() != null && context.getWorld() instanceof ServerWorld serverWorld && context.getWorld().getBlockEntity(context.getBlockPos()) instanceof HiveBlockEntity hiveBlockEntity) {
			if(serverWorld.getEntity(hiveBlockEntity.getBeeUUID()) instanceof BeeEntity beeEntity) {
				int count = context.getPlayer().isSneaking() ? context.getStack().getCount() : 1;
				long addedBond = (long) count * this.getBond(beeEntity.getBeeType());
				beeEntity.addBond(addedBond);
				if(!beeEntity.getGifted()) {
					if(random.nextFloat() < 1 - Math.pow((1 - this.getGiftedChance(beeEntity.getBeeType())), count)) {
						beeEntity.setGifted(true);
						context.getPlayer().sendMessage(Text.literal("The treat transformed " + beeEntity.getBeeType().getType() + " into a Gifted bee!").formatted(Formatting.YELLOW));
					}
				}

				long sum = 0;
				byte i = 0;

				while (i < beeEntity.getLevel() - 1) {
					sum += BeeEntity.neededBondForLevel[i];
					i++;
				}

				long currentBond = beeEntity.getBond() - sum;
				sum += BeeEntity.neededBondForLevel[i];

				context.getPlayer().sendMessage(Text.literal("Bee bond increased by " + addedBond + " (" + currentBond + "/" + sum + ")!").formatted(Formatting.LIGHT_PURPLE));

				if(!context.getPlayer().isInCreativeMode()) {
					context.getStack().decrement(count);
				}
				return ActionResult.SUCCESS;
			}
		}
		return ActionResult.PASS;
	}
}
