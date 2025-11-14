package alex.mine_swarm_simulator.data;

import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

public class FieldData {
	public Text display_name = Text.literal("");
	public BlockPos[] pos = new BlockPos[2];
	public String color = "mixed";
	public HashMap<String, Float> flower_colors = new HashMap<>();
	public HashMap<Integer, Float> flower_levels = new HashMap<>();

	public FieldData() {
		flower_colors.put("white", 33.33f);
		flower_colors.put("red", 33.33f);
		flower_colors.put("blue", 33.33f);
		flower_levels.put(1, 33.33f);
		flower_levels.put(2, 33.33f);
		flower_levels.put(3, 33.33f);
	}
}
