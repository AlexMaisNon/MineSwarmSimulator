package alex.mine_swarm_simulator.networking;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;

public record SyncPlayerDataPayload(long honey, long pollen, long capacity) implements CustomPayload {
	public static final CustomPayload.Id<SyncPlayerDataPayload> ID = new CustomPayload.Id<>(MineSwarmSimulator.SYNC_PLAYER_DATA);
	public static final PacketCodec<RegistryByteBuf, SyncPlayerDataPayload> CODEC = PacketCodec.tuple(
		PacketCodecs.VAR_LONG, SyncPlayerDataPayload::honey,
		PacketCodecs.VAR_LONG, SyncPlayerDataPayload::pollen,
		PacketCodecs.VAR_LONG, SyncPlayerDataPayload::capacity,
		SyncPlayerDataPayload::new
	);

	@Override
	public Id<? extends CustomPayload> getId() {
		return ID;
	}
}
