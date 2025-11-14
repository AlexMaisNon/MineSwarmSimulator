package alex.mine_swarm_simulator.mixin;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.EffectCommand;
import net.minecraft.server.command.ServerCommandSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EffectCommand.class)
public class EffectCommandMixin {
	@Redirect(method = "register", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/command/CommandManager;argument(Ljava/lang/String;Lcom/mojang/brigadier/arguments/ArgumentType;)Lcom/mojang/brigadier/builder/RequiredArgumentBuilder;"))
	private static <T> RequiredArgumentBuilder<ServerCommandSource, T> redirectAmplifierArgument(String name, ArgumentType<T> type) {
		if (name.equals("amplifier")) {
			return (RequiredArgumentBuilder<ServerCommandSource, T>) CommandManager.argument(name, IntegerArgumentType.integer(0));
		} else {
			return CommandManager.argument(name, type);
		}
	}
}