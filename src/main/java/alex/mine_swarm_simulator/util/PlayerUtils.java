package alex.mine_swarm_simulator.util;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockBox;
import org.jetbrains.annotations.Nullable;

public class PlayerUtils {
	public static long getPlayerCapacity(PlayerEntity player) {
		return (long)Math.floor(player.getAttributeValue(ModAttributes.PLAYER_CAPACITY) * player.getAttributeValue(ModAttributes.PLAYER_CAPACITY_MULTIPLIER));
	}

	@Nullable
	public static String getPlayerField(PlayerEntity player) {
		StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(player.getServer());

		for(String fieldId : serverState.fields.keySet()) {
			if(BlockBox.create(serverState.fields.get(fieldId).pos[0], serverState.fields.get(fieldId).pos[1].add(0, 4, 0)).contains(player.getBlockPos())) {
				return fieldId;
			}
		}
		return null;
	}
}
