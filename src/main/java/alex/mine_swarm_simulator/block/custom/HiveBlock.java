package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.util.BeeType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.*;

public class HiveBlock extends Block {
	private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
	private static final BooleanProperty GIFTED = BooleanProperty.of("gifted");
	private static final IntProperty BEE_ID = IntProperty.of("bee_id", 0, 46);

	private static final Map<Item, float[]> chances = new HashMap<>() {{
		put(ModItems.BASIC_EGG, new float[]{0.87f, 0.1f, 0.025f, 0.005f, 0f});
		put(ModItems.SILVER_EGG, new float[]{0f, 0.649f, 0.3f, 0.05f, 0.001f});
		put(ModItems.GIFTED_SILVER_EGG, new float[]{0f, 0.649f, 0.3f, 0.05f, 0.001f});
		put(ModItems.GOLD_EGG, new float[]{0f, 0f, 0.79f, 0.2f, 0.01f});
		put(ModItems.GIFTED_GOLD_EGG, new float[]{0f, 0f, 0.79f, 0.2f, 0.01f});
		put(ModItems.DIAMOND_EGG, new float[]{0f, 0f, 0f, 0.95f, 0.05f});
		put(ModItems.GIFTED_DIAMOND_EGG, new float[]{0f, 0f, 0f, 0.95f, 0.05f});
		put(ModItems.MYTHIC_EGG, new float[]{0f, 0f, 0f, 0f, 1f});
		put(ModItems.GIFTED_MYTHIC_EGG, new float[]{0f, 0f, 0f, 0f, 1f});
		put(ModItems.ROYAL_JELLY, new float[]{0f, 0.7f, 0.27f, 0.02996f, 0.00004f});
		put(ModItems.STAR_JELLY, new float[]{0f, 0.7f, 0.27f, 0.02996f, 0.00004f});
	}};
	private static final Item[] giftedItems = new Item[]{
		ModItems.GIFTED_SILVER_EGG,
		ModItems.GIFTED_GOLD_EGG,
		ModItems.GIFTED_DIAMOND_EGG,
		ModItems.GIFTED_MYTHIC_EGG,
		ModItems.STAR_EGG,
		ModItems.STAR_JELLY
	};

	private static final int[][] bees = new int[][]{
		{0},
		{1, 2, 3, 4, 5, 6, 7, 8, 9},
		{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
		{21, 22, 23, 24, 25, 26, 27, 28},
		{29, 30, 31, 32, 33, 34},
		{35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45}
	};

	private static final Map<String, Formatting> typeColors = Map.of(
		"common", Formatting.WHITE,
		"rare", Formatting.GRAY,
		"epic", Formatting.YELLOW,
		"legendary", Formatting.AQUA,
		"mythic", Formatting.LIGHT_PURPLE,
		"event", Formatting.GREEN
	);

	public HiveBlock(Settings settings) {
		super(settings.noCollision().nonOpaque().sounds(BlockSoundGroup.HONEY));
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(GIFTED, false).with(BEE_ID, 0));
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING, GIFTED, BEE_ID);
	}

	@Override
	protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if(!world.isClient()) {
			Random random = new Random();

			if(stack.isOf(ModItems.EVICTION) && state.get(BEE_ID) > 0) {
				world.setBlockState(pos, state.with(BEE_ID, 0).with(GIFTED, false));

				if (!player.isInCreativeMode()) {
					stack.decrement(1);
				}

			} else if(stack.isOf(ModItems.STAR_EGG)) {
				int selectedBee = random.nextInt(0, 35);
				BeeType beeType = BeeType.byId((byte)(selectedBee));

				player.sendMessage(Text.translatable("block.mine_swarm_simulator.hive_slot.hatched", "gifted" + "_" + beeType.getName(), beeType.getRarity()).formatted(typeColors.get(beeType.getRarity())));
				world.setBlockState(pos, state.with(BEE_ID, selectedBee + 1).with(GIFTED, true));

				if (!player.isInCreativeMode()) {
					stack.decrement(1);
				}

			} else if(chances.containsKey(stack.getItem())) {
				if(!(stack.isOf(ModItems.ROYAL_JELLY) || stack.isOf(ModItems.STAR_JELLY)) || state.get(BEE_ID) > 0) {
					byte typeId = 0;
					float currentChance = chances.get(stack.getItem())[typeId];
					while(random.nextFloat() >= currentChance) {
						typeId++;
						currentChance += chances.get(stack.getItem())[typeId];
					}

					int[] selectedBees = bees[typeId];
					int selectedBee = selectedBees[random.nextInt(selectedBees.length)];
					boolean isGifted = random.nextFloat() < 0.004 || Arrays.stream(giftedItems).anyMatch(item -> item == stack.getItem());

					BeeType beeType = BeeType.byId((byte)(selectedBee));
					String beeName = isGifted ? "gifted" + "_" + beeType.getName() : beeType.getName();

					if(stack.isOf(ModItems.ROYAL_JELLY) || stack.isOf(ModItems.STAR_JELLY)) {
						player.sendMessage(Text.translatable("block.mine_swarm_simulator.hive_slot.transform", BeeType.byId((byte)(state.get(BEE_ID) - 1)).getName(), beeName, beeType.getRarity()).formatted(typeColors.get(beeType.getRarity())));
					} else {
						player.sendMessage(Text.translatable("block.mine_swarm_simulator.hive_slot.hatched", beeName, beeType.getRarity()).formatted(typeColors.get(beeType.getRarity())));
					}

					world.setBlockState(pos, state.with(BEE_ID, selectedBee + 1).with(GIFTED, isGifted));

					if (!player.isInCreativeMode()) {
						stack.decrement(1);
					}
				}
			}
		}
		return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
	}
}
