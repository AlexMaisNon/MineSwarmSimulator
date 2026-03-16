package alex.mine_swarm_simulator.data;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.UUID;

public class PlayerData {
	public long honey;
	public long pollen;
	public long capacity; // Only for client as the attribute already exists server-side
	public HashMap<BlockPos, UUID> bees = new HashMap<>(); // map for bees in hive
	// public HashSet<StickerItem, Boolean> stickersInStack = new HashSet<>(); // set of stickers in sticker stack

	public static PlayerData getPlayerData(PlayerEntity player) {
		return StateSaverAndLoader.getPlayerState(player);
	}

	public static long getPlayerHoney(PlayerEntity player) {
		PlayerData playerData = StateSaverAndLoader.getPlayerState(player);
		return playerData.honey;
	}

	public static long getPlayerPollen(PlayerEntity player) {
		PlayerData playerData = StateSaverAndLoader.getPlayerState(player);
		return playerData.pollen;
	}

	public static long getPlayerCapacity(PlayerEntity player) {
		PlayerData playerData = StateSaverAndLoader.getPlayerState(player);
		return playerData.capacity;
	}
}
