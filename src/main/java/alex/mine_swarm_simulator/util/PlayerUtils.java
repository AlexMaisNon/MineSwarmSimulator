package alex.mine_swarm_simulator.util;

import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerUtils {
	public static long getPlayerCapacity(PlayerEntity player) {
		return (long)Math.floor(player.getAttributeValue(ModAttributes.PLAYER_CAPACITY) * player.getAttributeValue(ModAttributes.PLAYER_CAPACITY_MULTIPLIER));
	}

	public static long getPlayerPollen(PlayerEntity player) {
		PlayerData playerData = StateSaverAndLoader.getPlayerState(player);
		return playerData.pollen;
	}
}
