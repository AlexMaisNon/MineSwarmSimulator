package alex.mine_swarm_simulator.block.custom;

import alex.mine_swarm_simulator.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenTexts;
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

	private static final Map<Item, float[]> chances = new HashMap<>();
	private static final List<Item> giftedItems = List.of(new Item[]{
		ModItems.GIFTED_SILVER_EGG,
		ModItems.GIFTED_GOLD_EGG,
		ModItems.GIFTED_DIAMOND_EGG,
		ModItems.GIFTED_MYTHIC_EGG,
		ModItems.STAR_EGG,
		ModItems.STAR_JELLY
	});

	private static final int[][] bees = new int[][]{
		{1},
		{2, 3, 4, 5, 6, 7, 8, 9, 10},
		{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21},
		{22, 23, 24, 25, 26, 27, 28, 29},
		{30, 31, 32, 33, 34, 35},
		{36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46}
	};

	private static final String[] beeNames = new String[]{
		null, "basic_bee",
		"bomber_bee", "brave_bee", "bumble_bee", "cool_bee", "hasty_bee", "looker_bee", "rad_bee", "rascal_bee", "stubborn_bee",
		"bubble_bee", "bucko_bee", "commander_bee", "demo_bee", "exhausted_bee", "fire_bee", "frosty_bee", "honey_bee", "rage_bee", "riley_bee", "shocked_bee",
		"baby_bee", "carpenter_bee", "demon_bee", "diamond_bee", "lion_bee", "music_bee", "ninja_bee", "shy_bee",
		"buoyant_bee", "fuzzy_bee", "precise_bee", "spicy_bee", "tadpole_bee", "vector_bee",
		"bear_bee", "cobalt_bee", "crimson_bee", "digital_bee", "festive_bee", "gummy_bee", "photon_bee", "puppy_bee", "tabby_bee", "vicious_bee", "windy_bee",
	};

	private static final String[] typeNames = new String[]{
		"common", "rare", "epic", "legendary", "mythic", "event"
	};

	private static final Formatting[] typeColors = new Formatting[]{
		Formatting.WHITE, Formatting.GRAY, Formatting.YELLOW, Formatting.AQUA, Formatting.LIGHT_PURPLE, Formatting.GREEN
	};

	public HiveBlock(Settings settings) {
		super(settings.noCollision().nonOpaque().sounds(BlockSoundGroup.HONEY));
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(GIFTED, false).with(BEE_ID, 0));

		chances.put(ModItems.BASIC_EGG, new float[]{0.87f, 0.1f, 0.025f, 0.005f, 0f});
		chances.put(ModItems.SILVER_EGG, new float[]{0f, 0.649f, 0.3f, 0.05f, 0.001f});
		chances.put(ModItems.GIFTED_SILVER_EGG, new float[]{0f, 0.649f, 0.3f, 0.05f, 0.001f});
		chances.put(ModItems.GOLD_EGG, new float[]{0f, 0f, 0.79f, 0.2f, 0.01f});
		chances.put(ModItems.GIFTED_GOLD_EGG, new float[]{0f, 0f, 0.79f, 0.2f, 0.01f});
		chances.put(ModItems.DIAMOND_EGG, new float[]{0f, 0f, 0f, 0.95f, 0.05f});
		chances.put(ModItems.GIFTED_DIAMOND_EGG, new float[]{0f, 0f, 0f, 0.95f, 0.05f});
		chances.put(ModItems.MYTHIC_EGG, new float[]{0f, 0f, 0f, 0f, 1f});
		chances.put(ModItems.GIFTED_MYTHIC_EGG, new float[]{0f, 0f, 0f, 0f, 1f});
		chances.put(ModItems.ROYAL_JELLY, new float[]{0f, 0.7f, 0.27f, 0.02996f, 0.00004f});
		chances.put(ModItems.STAR_JELLY, new float[]{0f, 0.7f, 0.27f, 0.02996f, 0.00004f});
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
				int selectedBee = random.nextInt(1, 36);
				int typeId;
				if(selectedBee == 1) {
					typeId = 0;
				} else if(selectedBee < 11) {
					typeId = 1;
				} else if(selectedBee < 22) {
					typeId = 2;
				} else if(selectedBee < 30) {
					typeId = 3;
				} else {
					typeId = 4;
				}

				player.sendMessage(Text.translatable("block.mine_swarm_simulator.hive_slot.hatched", "gifted" + " " + beeNames[selectedBee], typeNames[typeId]).formatted(typeColors[typeId]));
				world.setBlockState(pos, state.with(BEE_ID, selectedBee).with(GIFTED, true));

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
					boolean isGifted = random.nextFloat() < 0.004 || giftedItems.contains(stack.getItem());

					if(stack.isOf(ModItems.ROYAL_JELLY) || stack.isOf(ModItems.STAR_JELLY)) {
						player.sendMessage(Text.translatable("block.mine_swarm_simulator.hive_slot.transform", beeNames[state.get(BEE_ID)], isGifted ? "gifted" + " " + beeNames[selectedBee] : beeNames[selectedBee], typeNames[typeId]).formatted(typeColors[typeId]));
					} else {
						player.sendMessage(Text.translatable("block.mine_swarm_simulator.hive_slot.hatched", isGifted ? "gifted" + " " + beeNames[selectedBee] : beeNames[selectedBee], typeNames[typeId]).formatted(typeColors[typeId]));
					}

					world.setBlockState(pos, state.with(BEE_ID, selectedBee).with(GIFTED, isGifted));

					if (!player.isInCreativeMode()) {
						stack.decrement(1);
					}
				}
			}
		}
		return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
	}
}
