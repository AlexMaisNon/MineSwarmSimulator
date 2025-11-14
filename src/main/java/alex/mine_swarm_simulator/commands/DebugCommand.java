package alex.mine_swarm_simulator.commands;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.component.Passives;
import alex.mine_swarm_simulator.component.PassivesComponent;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsAttributeModifiersComponent;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.command.argument.ItemStackArgumentType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.*;

public class DebugCommand {
	public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
		dispatcher.register(
			CommandManager.literal("mssdebug")
				.requires(source -> source.hasPermissionLevel(4))
				.then(
					CommandManager.literal("add")
						.then(
							CommandManager.literal("honey")
								.then(
									CommandManager.argument("amount", LongArgumentType.longArg(0))
										.executes(
											context -> DebugCommand.add(
												context,
												"honey",
												LongArgumentType.getLong(context, "amount")
											)
										)
								)
						)
						.then(
							CommandManager.literal("pollen")
								.then(
									CommandManager.argument("amount", LongArgumentType.longArg(0))
										.executes(
											context -> DebugCommand.add(
												context,
												"pollen",
												LongArgumentType.getLong(context, "amount")
											)
										)
								)
						)
				)
				.then(
					CommandManager.literal("remove")
						.then(
							CommandManager.literal("honey")
								.then(
									CommandManager.argument("amount", LongArgumentType.longArg(0))
										.executes(
											context -> DebugCommand.add(
												context,
												"honey",
												-LongArgumentType.getLong(context, "amount")
											)
										)
								)
						)
						.then(
							CommandManager.literal("pollen")
								.then(
									CommandManager.argument("amount", LongArgumentType.longArg(0))
										.executes(
											context -> DebugCommand.add(
												context,
												"pollen",
												-LongArgumentType.getLong(context, "amount")
											)
										)
								)
						)
				)
				.then(
					CommandManager.literal("generate")
						.then(
							CommandManager.literal("ssa")
								.then(
									CommandManager.argument("amulet", ItemStackArgumentType.itemStack(registryAccess))
										.executes(
											context -> DebugCommand.generateAmulet(
												context,
												ItemStackArgumentType.getItemStackArgument(context, "amulet")
											)
										)
								)
						)
				)
		);
	}

	private static int add(CommandContext<ServerCommandSource> context, String variable, long amount) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			if(context.getSource().getEntity() instanceof ServerPlayerEntity serverPlayer) {
				PlayerData playerData = StateSaverAndLoader.getPlayerState(serverPlayer);

				if(variable.equals("honey")) {
					playerData.honey += amount;
					if(playerData.honey < 0) {
						playerData.honey = 0;
					}
				} else {
					playerData.pollen += amount;
					if(playerData.pollen < 0) {
						playerData.pollen = 0;
					}
				}

				String firstWord = amount >= 0 ? "Added " : "Removed ";
				context.getSource().sendFeedback(() -> Text.literal(firstWord + Math.abs(amount) + " " + variable), false);
				return (int)amount;
			}
		}
		return 0;
	}

	private static int generateAmulet(CommandContext<ServerCommandSource> context, ItemStackArgument item) throws CommandSyntaxException {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			if(context.getSource().getEntity() instanceof ServerPlayerEntity serverPlayer) {
				ItemStack amulet = item.createStack(1, false);
				Random random = new Random();
				List<PassivesComponent.Passive> possiblePassives = new ArrayList<>(List.of(new PassivesComponent.Passive[]{
					Passives.GUIDING_STAR,
					Passives.STAR_SHOWER,
					Passives.GUMMY_STAR,
					Passives.POP_STAR,
					Passives.SCORCHING_STAR,
					Passives.STAR_SAW
				}));
				List<RegistryEntry> possibleStats = new ArrayList<>(List.of(new RegistryEntry[]{
					ModAttributes.PLAYER_POLLEN,
					ModAttributes.PLAYER_WHITE_POLLEN,
					ModAttributes.PLAYER_RED_POLLEN,
					ModAttributes.PLAYER_BLUE_POLLEN,
					ModAttributes.PLAYER_BEE_GATHER_POLLEN,
					ModAttributes.PLAYER_INSTANT_CONVERSION,
					ModAttributes.PLAYER_CONVERT_RATE,
					ModAttributes.PLAYER_BEE_ABILITY_RATE,
					ModAttributes.PLAYER_CRITICAL_CHANCE
				}));
				Map<RegistryEntry<EntityAttribute>, EntityAttributeModifier> possibleModifiers = new HashMap<>();
				possibleModifiers.put(ModAttributes.PLAYER_POLLEN, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.pollen"), random.nextInt(5, 21) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_WHITE_POLLEN, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.white_pollen"), random.nextInt(15, 71) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_RED_POLLEN, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.red_pollen"), random.nextInt(15, 71) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_BLUE_POLLEN, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.blue_pollen"), random.nextInt(15, 71) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_BEE_GATHER_POLLEN, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.bee_gather_pollen"), random.nextInt(15, 71) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_INSTANT_CONVERSION, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.instant_conversion"), random.nextInt(3, 13) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_CONVERT_RATE, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.convert_rate"), random.nextInt(5, 26) / 100d, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
				possibleModifiers.put(ModAttributes.PLAYER_BEE_ABILITY_RATE, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.bee_ability_rate"), random.nextInt(1, 8) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));
				possibleModifiers.put(ModAttributes.PLAYER_CRITICAL_CHANCE, new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "supreme_star_amulet.critical_chance"), random.nextInt(1, 8) / 100d, EntityAttributeModifier.Operation.ADD_VALUE));

				List<PassivesComponent.Passive> passives = new ArrayList<>();
				passives.add(possiblePassives.remove(random.nextInt(0, 6)));
				if(random.nextFloat() < 0.02f) {
					passives.add(possiblePassives.remove(random.nextInt(0, 5)));
				}
				amulet.set(ModComponents.PASSIVES_COMPONENT, new PassivesComponent(passives));

				if(amulet.getItem() instanceof TrinketItem) {
					TrinketsAttributeModifiersComponent.Builder builder = TrinketsAttributeModifiersComponent.builder();
					byte limit = (byte)(possibleStats.size() - 5);
					for(byte i = (byte)(possibleStats.size() - 1); i >= limit; i--) {
						RegistryEntry<EntityAttribute> currentStat = possibleStats.remove(random.nextInt(0, i));
						builder.add(
							currentStat,
							possibleModifiers.remove(currentStat)
						);
					}
					amulet.set(TrinketsAttributeModifiersComponent.TYPE, builder.build());
				} else {
					context.getSource().sendError(Text.literal("Item isn't a trinket."));
					return 0;
				}
				serverPlayer.giveItemStack(amulet);
				return 1;
			}
		}
		return 0;
	}
}
