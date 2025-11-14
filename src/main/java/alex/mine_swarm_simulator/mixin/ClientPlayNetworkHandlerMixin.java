package alex.mine_swarm_simulator.mixin;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

	@Shadow private ClientWorld world;

	@Inject(method = "onEntityStatusEffect", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;setStatusEffect(Lnet/minecraft/entity/effect/StatusEffectInstance;Lnet/minecraft/entity/Entity;)V"), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
	public void changeStatusEffect(EntityStatusEffectS2CPacket packet, CallbackInfo ci) {
		Entity entity = world.getEntityById(packet.getEntityId());
		RegistryEntry<StatusEffect> registryEntry = packet.getEffectId();
		StatusEffectInstance statusEffectInstance = new StatusEffectInstance(registryEntry, packet.getDuration(), packet.getAmplifier(), packet.isAmbient(), packet.shouldShowParticles(), packet.shouldShowIcon(), null);
		if (entity != null) {
			((LivingEntity)entity).setStatusEffect(statusEffectInstance, null);
		}
		ci.cancel();
	}
}