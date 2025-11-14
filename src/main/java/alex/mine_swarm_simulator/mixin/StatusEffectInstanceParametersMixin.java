package alex.mine_swarm_simulator.mixin;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Optional;

@Mixin(StatusEffectInstance.Parameters.class)
public class StatusEffectInstanceParametersMixin {
	@Invoker("create")
	public static StatusEffectInstance.Parameters create(int amplifier, int duration, boolean ambient, boolean showParticles, Optional<Boolean> showIcon, Optional<StatusEffectInstance.Parameters> hiddenEffect) {
		throw new AssertionError();
	}

	@Shadow @Final
	public static final MapCodec<StatusEffectInstance.Parameters> CODEC = MapCodec.recursive(
		"MobEffectInstance.Details",
		codec -> RecordCodecBuilder.mapCodec(
			instance -> instance.group(
					Codec.INT.optionalFieldOf("amplifier", Integer.valueOf(0)).forGetter(StatusEffectInstance.Parameters::amplifier),
					Codec.INT.optionalFieldOf("duration", Integer.valueOf(0)).forGetter(StatusEffectInstance.Parameters::duration),
					Codec.BOOL.optionalFieldOf("ambient", Boolean.valueOf(false)).forGetter(StatusEffectInstance.Parameters::ambient),
					Codec.BOOL.optionalFieldOf("show_particles", Boolean.valueOf(true)).forGetter(StatusEffectInstance.Parameters::showParticles),
					Codec.BOOL.optionalFieldOf("show_icon").forGetter(parameters -> Optional.of(parameters.showIcon())),
					codec.optionalFieldOf("hidden_effect").forGetter(StatusEffectInstance.Parameters::hiddenEffect)
				)
				.apply(instance, StatusEffectInstanceParametersMixin::create)
		)
	);
}
