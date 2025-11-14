package alex.mine_swarm_simulator.data;

public class PlayerData {
	public String currentField;
	public long honey;
	public long pollen;
	public long capacity; // Only for client as the attribute already exists server-side
	// public HashMap<StickerItem, Boolean> stickersInStack = new HashMap<>(); map or list for sticker stack
	// public HashMap<BlockPos, HiveBeeEntity> bees = new HashMap<>(); map for bees in hive
}
