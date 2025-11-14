package alex.mine_swarm_simulator.mixin;

import alex.mine_swarm_simulator.event.MiningBlockCallback;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerInteractionManager.class)
public class ServerPlayerInteractionManagerMixin {
	@Shadow
	public ServerWorld world;
	@Shadow
	public ServerPlayerEntity player;
	@Shadow
	public BlockPos miningPos;

	@Inject(method = "update", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/network/ServerPlayerInteractionManager;continueMining(Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;I)F", ordinal = 1), cancellable = true)
	public void update(CallbackInfo ci) {
		ActionResult result = MiningBlockCallback.EVENT.invoker().interact(player, world, Hand.MAIN_HAND, miningPos);
		if(result != ActionResult.PASS) {
			ci.cancel();
		}
	}
}
