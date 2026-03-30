package alex.mine_swarm_simulator.util;

import org.jetbrains.annotations.Nullable;

public enum FlowerColor {
	COLORLESS,
	RED,
	BLUE;

	public int getColorId() {
		return switch(this) {
			case COLORLESS -> 0;
			case RED -> 1;
			case BLUE -> 2;
		};
	}

	@Nullable
	public static FlowerColor idToColor(int id) {
		return switch(id) {
			case 0 -> COLORLESS;
			case 1 -> RED;
			case 2 -> BLUE;
			default -> null;
		};
	}
}
