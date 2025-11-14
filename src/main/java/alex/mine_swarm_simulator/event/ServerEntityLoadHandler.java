package alex.mine_swarm_simulator.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.Objects;

public class ServerEntityLoadHandler implements ServerEntityEvents.Load {

	@Override
	public void onLoad(Entity entity, ServerWorld serverWorld) {
		if(entity instanceof PlayerEntity) {
			// Modifies default generic attributes
			// 0.11582 movement_speed = 20 Movespeed <=> 0.00579 movement_speed = 1 Movespeed
			Objects.requireNonNull(((PlayerEntity) entity).getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED)).setBaseValue(0.11582d);
			// +0.177 jump_strength = +22 Jump Power <=> 0.00805 jump_strength = +1 Jump Power
			Objects.requireNonNull(((PlayerEntity) entity).getAttributeInstance(EntityAttributes.GENERIC_JUMP_STRENGTH)).setBaseValue(0.627d);
		}
	}
}
