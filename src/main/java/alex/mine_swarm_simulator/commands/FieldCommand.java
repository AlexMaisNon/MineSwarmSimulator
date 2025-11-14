package alex.mine_swarm_simulator.commands;

import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.data.FieldData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.BlockPosArgumentType;
import net.minecraft.command.argument.TextArgumentType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FieldCommand {
	public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
		dispatcher.register(
			CommandManager.literal("field")
				.requires(source -> source.hasPermissionLevel(4))
				.then(
					CommandManager.literal("add")
						.then(
							CommandManager.argument("field", StringArgumentType.word())
								.then(
									CommandManager.argument("from", BlockPosArgumentType.blockPos())
										.then(
											CommandManager.argument("to", BlockPosArgumentType.blockPos())
												.executes(
													context -> FieldCommand.add(
														context,
														StringArgumentType.getString(context, "field"),
														BlockPosArgumentType.getBlockPos(context, "from"),
														BlockPosArgumentType.getBlockPos(context, "to")
													)
												)
										)
								)
						)
				)
				.then(
					CommandManager.literal("list")
						.executes(FieldCommand::list)
				)
				.then(
					CommandManager.literal("modify")
						.then(
							CommandManager.argument("field", StringArgumentType.word())
								.then(
									CommandManager.literal("display_name")
										.executes(
											context -> FieldCommand.modifyDisplayName(
												context,
												StringArgumentType.getString(context, "field"),
												null
											)
										)
										.then(
											CommandManager.argument("display_name", TextArgumentType.text(registryAccess))
												.executes(
													context -> FieldCommand.modifyDisplayName(
														context,
														StringArgumentType.getString(context, "field"),
														TextArgumentType.getTextArgument(context, "display_name")
													)
												)
										)
								)
								.then(
									CommandManager.literal("color")
										.then(
											CommandManager.literal("mixed")
												.executes(
													context -> FieldCommand.modifyColor(
														context,
														StringArgumentType.getString(context, "field"),
														"mixed"
													)
												)
										)
										.then(
											CommandManager.literal("white")
												.executes(
													context -> FieldCommand.modifyColor(
														context,
														StringArgumentType.getString(context, "field"),
														"white"
													)
												)
										)
										.then(
											CommandManager.literal("red")
												.executes(
													context -> FieldCommand.modifyColor(
														context,
														StringArgumentType.getString(context, "field"),
														"red"
													)
												)
										)
										.then(
											CommandManager.literal("blue")
												.executes(
													context -> FieldCommand.modifyColor(
														context,
														StringArgumentType.getString(context, "field"),
														"blue"
													)
												)
										)
								)
								.then(
									CommandManager.literal("flower_colors")
										.then(
											CommandManager.argument("white%", FloatArgumentType.floatArg())
												.then(
													CommandManager.argument("red%", FloatArgumentType.floatArg())
														.then(
															CommandManager.argument("blue%", FloatArgumentType.floatArg())
																.executes(
																	context -> FieldCommand.modifyColors(
																		context,
																		StringArgumentType.getString(context, "field"),
																		FloatArgumentType.getFloat(context, "white%"),
																		FloatArgumentType.getFloat(context, "red%"),
																		FloatArgumentType.getFloat(context, "blue%")
																	)
																)
														)
												)
										)
								)
								.then(
									CommandManager.literal("flower_levels")
										.then(
											CommandManager.argument("level1%", FloatArgumentType.floatArg())
												.then(
													CommandManager.argument("level2%", FloatArgumentType.floatArg())
														.then(
															CommandManager.argument("level3%", FloatArgumentType.floatArg())
																.executes(
																	context -> FieldCommand.modifyLevels(
																		context,
																		StringArgumentType.getString(context, "field"),
																		FloatArgumentType.getFloat(context, "level1%"),
																		FloatArgumentType.getFloat(context, "level2%"),
																		FloatArgumentType.getFloat(context, "level3%")
																	)
																)
														)
												)
										)
								)
						)
				)
				.then(
					CommandManager.literal("remove")
						.then(
							CommandManager.argument("field", StringArgumentType.word())
								.executes(
									context -> FieldCommand.remove(
										context,
										StringArgumentType.getString(context, "field")
									)
								)
						)
				)
				.then(
					CommandManager.literal("generate")
						.executes(FieldCommand::generate)
						.then(
							CommandManager.argument("field", StringArgumentType.word())
								.executes(
									context -> FieldCommand.generate(
										context,
										StringArgumentType.getString(context, "field")
									)
								)
						)
				)
		);
	}

	private static int add(CommandContext<ServerCommandSource> context, String field, BlockPos pos1, BlockPos pos2) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(!serverState.fields.containsKey(field)) {
				FieldData fieldData = new FieldData();
				fieldData.display_name = Text.literal(field);
				fieldData.pos[0] = pos1;
				fieldData.pos[1] = new BlockPos(pos2.getX(), pos1.getY(), pos2.getZ());

				serverState.fields.put(field, fieldData);
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.add.success", field), false);
				return serverState.fields.size();
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.add.failed").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static int list(CommandContext<ServerCommandSource> context) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(!serverState.fields.isEmpty()) {
				List<Text> displayNames = new ArrayList<>();
				serverState.fields.forEach((field, fieldData) -> displayNames.add(fieldData.display_name));
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.list.success", serverState.fields.size(), Texts.join(displayNames, Text.literal(", "))), false);
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.list.empty").formatted(Formatting.RED), false);
			}
			return serverState.fields.size();
		} else {
			return 0;
		}
	}

	private static int modifyDisplayName(CommandContext<ServerCommandSource> context, String field, @Nullable Text text) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(serverState.fields.containsKey(field)) {
				serverState.fields.get(field).display_name = Objects.requireNonNullElseGet(text, () -> Text.literal(field));
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.modify.display_name.success", serverState.fields.get(field).display_name), false);
				return serverState.fields.size();
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.not_found").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static int modifyColor(CommandContext<ServerCommandSource> context, String field, String color) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(serverState.fields.containsKey(field)) {
				serverState.fields.get(field).color = color;
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.modify.color.success", serverState.fields.get(field).display_name), false);
				return serverState.fields.size();
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.not_found").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static int modifyColors(CommandContext<ServerCommandSource> context, String field, float white_p, float red_p, float blue_p) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(serverState.fields.containsKey(field)) {
				serverState.fields.get(field).flower_colors.put("white", white_p);
				serverState.fields.get(field).flower_colors.put("red", red_p);
				serverState.fields.get(field).flower_colors.put("blue", blue_p);
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.modify.flower_colors.success", serverState.fields.get(field).display_name), false);
				return serverState.fields.size();
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.not_found").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static int modifyLevels(CommandContext<ServerCommandSource> context, String field, float lvl1_p, float lvl2_p, float lvl3_p) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(serverState.fields.containsKey(field)) {
				serverState.fields.get(field).flower_levels.put(1, lvl1_p);
				serverState.fields.get(field).flower_levels.put(2, lvl2_p);
				serverState.fields.get(field).flower_levels.put(3, lvl3_p);
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.modify.flower_levels.success", serverState.fields.get(field).display_name), false);
				return serverState.fields.size();
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.not_found").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static int remove(CommandContext<ServerCommandSource> context, String field) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(serverState.fields.containsKey(field)) {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.remove.success", serverState.fields.get(field).display_name), false);
				serverState.fields.remove(field);
				return serverState.fields.size();
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.not_found").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static int generate(CommandContext<ServerCommandSource> context) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(!serverState.fields.isEmpty()) {
				serverState.fields.forEach((field, fieldData) -> generateSingleField(serverState, serverWorld, field, fieldData));
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.generate.multiple",serverState.fields.size()), false);
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.generate.empty").formatted(Formatting.RED), false);
			}
			return serverState.fields.size();
		} else {
			return 0;
		}
	}

	private static int generate(CommandContext<ServerCommandSource> context, String field) {
		MinecraftServer server = context.getSource().getServer();
		ServerWorld serverWorld = server.getWorld(World.OVERWORLD);
		if(serverWorld != null) {
			StateSaverAndLoader serverState = StateSaverAndLoader.getServerState(server);
			if(serverState.fields.containsKey(field)) {
				generateSingleField(serverState, serverWorld, field, serverState.fields.get(field));
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.generate.single", serverState.fields.get(field).display_name), false);
				return 1;
			} else {
				context.getSource().sendFeedback(() -> Text.translatable("commands.mine_swarm_simulator.field.not_found").formatted(Formatting.RED), false);
				return 0;
			}
		} else {
			return 0;
		}
	}

	private static void generateSingleField(StateSaverAndLoader serverState, ServerWorld serverWorld, String field, FieldData fieldData) {
		List<BlockPos> blockPosList = new ArrayList<>();
		for(BlockPos blockPos : BlockPos.iterate(fieldData.pos[0], fieldData.pos[1])) {
			if(serverWorld.getBlockState(blockPos).getBlock() == ModBlocks.FLOWER_BLOCK) {
				blockPosList.add(blockPos.add(0, 0, 0));
			}
		}

		// Split the blockPos list into 3 other lists (based on color percentages)
		Collections.shuffle(blockPosList);
		float white_percent = serverState.fields.get(field).flower_colors.get("white");
		float red_percent = serverState.fields.get(field).flower_colors.get("red");
		float blue_percent = serverState.fields.get(field).flower_colors.get("blue");

		List<BlockPos>[] lists = greedyListSplitter(white_percent, red_percent, blue_percent, blockPosList);
		for(int i = 0; i < lists.length; i++) {
			for (BlockPos blockPos : lists[i]) {
				serverWorld.setBlockState(blockPos, ModBlocks.FLOWER_BLOCK.getDefaultState().with(FlowerBlock.COLOR, i));
			}
		}

		// Split the blockPos list into 3 other lists (based on level percentages)
		Collections.shuffle(blockPosList);
		float lvl1_percent = serverState.fields.get(field).flower_levels.get(1);
		float lvl2_percent = serverState.fields.get(field).flower_levels.get(2);
		float lvl3_percent = serverState.fields.get(field).flower_levels.get(3);

		lists = greedyListSplitter(lvl1_percent, lvl2_percent, lvl3_percent, blockPosList);
		for(int i = 0; i < lists.length; i++) {
			for (BlockPos blockPos : lists[i]) {
				serverWorld.setBlockState(blockPos, serverWorld.getBlockState(blockPos).with(FlowerBlock.LEVEL, i));
			}
		}

		// Update every block
		for(BlockPos blockPos : blockPosList) {
			serverWorld.updateNeighbors(blockPos, serverWorld.getBlockState(blockPos).getBlock());
		}
	}

	private static List<BlockPos>[] greedyListSplitter(float percent1, float percent2, float percent3, List<BlockPos> blockPosList) {
		List<BlockPos> pos1 = new ArrayList<>();
		List<BlockPos> pos2 = new ArrayList<>();
		List<BlockPos> pos3 = new ArrayList<>();

		for(int i = 0; i < blockPosList.size(); i++) {
			float p1 = (percent1 / 100) * (blockPosList.size() + 1) - (pos1.size() + 1);
			float p2 = (percent2 / 100) * (blockPosList.size() + 1) - (pos2.size() + 1);
			float p3 = (percent3 / 100) * (blockPosList.size() + 1) - (pos3.size() + 1);

			List<Float> sortList = new ArrayList<>();
			sortList.add(p1);
			sortList.add(p2);
			sortList.add(p3);
			Collections.sort(sortList);

			if(sortList.getLast() == p1) {
				pos1.add(blockPosList.get(i));
			} else if(sortList.getLast() == p2) {
				pos2.add(blockPosList.get(i));
			} else {
				pos3.add(blockPosList.get(i));
			}
		}
		return new List[]{pos1, pos2, pos3};
	}
}
