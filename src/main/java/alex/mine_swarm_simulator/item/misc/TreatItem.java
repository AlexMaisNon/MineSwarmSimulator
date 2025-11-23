package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.util.BeeType;
import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;

public class TreatItem extends Item {
	private final int bond;
	private final float giftedChance;
	@Nullable private final BeeType[] favorites;

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
}
