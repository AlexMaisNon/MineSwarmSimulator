package alex.mine_swarm_simulator.util;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public enum BeeRarity {
	COMMON,
	RARE,
	EPIC,
	LEGENDARY,
	MYTHIC,
	EVENT;

	public Text getTranslated() {
		return switch(this) {
			case COMMON -> Text.translatable("entity.mine_swarm_simulator.bee.rarity.common");
			case RARE -> Text.translatable("entity.mine_swarm_simulator.bee.rarity.rare");
			case EPIC -> Text.translatable("entity.mine_swarm_simulator.bee.rarity.epic");
			case LEGENDARY -> Text.translatable("entity.mine_swarm_simulator.bee.rarity.legendary");
			case MYTHIC -> Text.translatable("entity.mine_swarm_simulator.bee.rarity.mythic");
			case EVENT -> Text.translatable("entity.mine_swarm_simulator.bee.rarity.event");
		};
	}

	public Formatting getFormatting() {
		return switch(this) {
			case COMMON -> Formatting.WHITE;
			case RARE -> Formatting.GRAY;
			case EPIC -> Formatting.YELLOW;
			case LEGENDARY -> Formatting.AQUA;
			case MYTHIC -> Formatting.LIGHT_PURPLE;
			case EVENT -> Formatting.GREEN;
		};
	}
}
