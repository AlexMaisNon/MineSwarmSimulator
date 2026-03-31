package alex.mine_swarm_simulator.component;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record BeeComponent(int id, boolean gifted) {
	public static final Codec<BeeComponent> CODEC = RecordCodecBuilder.create(builder -> builder.group(
		Codec.INT.fieldOf("id").forGetter(BeeComponent::id),
		Codec.BOOL.fieldOf("gifted").forGetter(BeeComponent::gifted)
	).apply(builder, BeeComponent::new));
}