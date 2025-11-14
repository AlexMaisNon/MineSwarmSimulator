package alex.mine_swarm_simulator.event;

import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.component.Passives;
import alex.mine_swarm_simulator.component.PassivesComponent;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LivingEntityAfterDamageHandler implements ServerLivingEntityEvents.AfterDamage {
	@Override
	public void afterDamage(LivingEntity livingEntity, DamageSource damageSource, float v, float v1, boolean b) {
		if(livingEntity instanceof PlayerEntity playerEntity && playerEntity.getEntityWorld() instanceof ServerWorld serverWorld) {
			for(ItemStack itemStack : playerEntity.getArmorItems()) {
				if(itemStack.contains(ModComponents.PASSIVES_COMPONENT)){
					Map<String, PassivesComponent.Passive> passives = itemStack.get(ModComponents.PASSIVES_COMPONENT).passives().stream().collect(Collectors.toMap(PassivesComponent.Passive::id, Function.identity()));
					if(passives.containsKey("emergency_coconut_shield") && passives.get("emergency_coconut_shield").cooldownTick() - serverWorld.getTime() < 0) {
						Passives.EmergencyCoconutShield(serverWorld, playerEntity, itemStack);
					}
				}
			}
		}
	}
}
