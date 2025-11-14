package alex.mine_swarm_simulator.data;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import it.unimi.dsi.fastutil.Hash;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtIntArray;
import net.minecraft.nbt.NbtList;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.PersistentState;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.UUID;

public class StateSaverAndLoader extends PersistentState {

	public HashMap<String, FieldData> fields = new HashMap<>();
	public HashMap<UUID, PlayerData> players = new HashMap<>();

	@Override
	public NbtCompound writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
		NbtCompound fieldsNbt = new NbtCompound();
		fields.forEach((id, data) -> {
			NbtCompound fieldData = new NbtCompound();

			fieldData.putString("display_name", data.display_name.getString());

			NbtList poses = new NbtList();
			NbtIntArray pos1 = new NbtIntArray(new int[]{data.pos[0].getX(), data.pos[0].getY(), data.pos[0].getZ()});
			poses.add(pos1);
			NbtIntArray pos2 = new NbtIntArray(new int[]{data.pos[1].getX(), data.pos[1].getY(), data.pos[1].getZ()});
			poses.add(pos2);

			fieldData.put("pos", poses);
			fieldData.putString("color", data.color);

			NbtCompound flower_colors = new NbtCompound();
			flower_colors.putFloat("white", data.flower_colors.get("white"));
			flower_colors.putFloat("red", data.flower_colors.get("red"));
			flower_colors.putFloat("blue", data.flower_colors.get("blue"));

			NbtCompound flower_levels = new NbtCompound();
			flower_levels.putFloat("1", data.flower_levels.get(1));
			flower_levels.putFloat("2", data.flower_levels.get(2));
			flower_levels.putFloat("3", data.flower_levels.get(3));

			fieldData.put("flower_colors", flower_colors);
			fieldData.put("flower_levels", flower_levels);

			fieldsNbt.put(id, fieldData);
		});
		nbt.put("fields", fieldsNbt);

		NbtCompound playersNbt = new NbtCompound();
		players.forEach((key, value) -> {
			NbtCompound playerNbt = new NbtCompound();
			playerNbt.putString("currentField", players.get(key).currentField);
			playerNbt.putLong("honey", players.get(key).honey);
			playerNbt.putLong("pollen", players.get(key).pollen);
			playersNbt.put(key.toString(), playerNbt);
		});
		nbt.put("players", playersNbt);

		return nbt;
	}

	public static StateSaverAndLoader createFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
		StateSaverAndLoader state = new StateSaverAndLoader();
		NbtCompound fields = tag.getCompound("fields");
		fields.getKeys().forEach(key -> {
			FieldData fieldData = new FieldData();
			fieldData.display_name = Text.literal(fields.getCompound(key).getString("display_name"));
			int[] pos1 = ((NbtList)fields.getCompound(key).get("pos")).getIntArray(0);
			int[] pos2 = ((NbtList)fields.getCompound(key).get("pos")).getIntArray(1);
			fieldData.pos[0] = new BlockPos(pos1[0], pos1[1], pos1[2]);
			fieldData.pos[1] = new BlockPos(pos2[0], pos2[1], pos2[2]);
			fieldData.color = fields.getCompound(key).getString("color");

			fieldData.flower_colors.put("white", fields.getCompound(key).getCompound("flower_colors").getFloat("white"));
			fieldData.flower_colors.put("red", fields.getCompound(key).getCompound("flower_colors").getFloat("red"));
			fieldData.flower_colors.put("blue", fields.getCompound(key).getCompound("flower_colors").getFloat("blue"));
			fieldData.flower_levels.put(1, fields.getCompound(key).getCompound("flower_levels").getFloat("1"));
			fieldData.flower_levels.put(2, fields.getCompound(key).getCompound("flower_levels").getFloat("2"));
			fieldData.flower_levels.put(3, fields.getCompound(key).getCompound("flower_levels").getFloat("3"));

			state.fields.put(key, fieldData);
		});

		NbtCompound players = tag.getCompound("players");
		players.getKeys().forEach(key -> {
			PlayerData playerData = new PlayerData();
			playerData.currentField = players.getCompound(key).getString("currentField");
			playerData.honey = players.getCompound(key).getLong("honey");
			playerData.pollen = players.getCompound(key).getLong("pollen");
			state.players.put(UUID.fromString(key), playerData);
		});

		return state;
	}

	public static StateSaverAndLoader createNew() {
		StateSaverAndLoader state = new StateSaverAndLoader();
		state.fields = new HashMap<>();
		state.players = new HashMap<>();
		return state;
	}

	private static final Type<StateSaverAndLoader> type = new Type<>(StateSaverAndLoader::createNew, StateSaverAndLoader::createFromNbt, null);

	public static StateSaverAndLoader getServerState(MinecraftServer server) {
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader state = serverWorld.getPersistentStateManager().getOrCreate(type, MineSwarmSimulator.MOD_ID);
			state.markDirty();
			return state;
		} else {
			return null;
		}
	}

	public static PlayerData getPlayerState(PlayerEntity player) {
		StateSaverAndLoader state = getServerState(player.getServer());
		return state.players.computeIfAbsent(player.getUuid(), uuid -> new PlayerData());
	}
}
