package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectToolItem extends Item {

	private final float collectSpeed;
	private final int baseCollection;
	private final BlockPos[] pattern;
	private final boolean rotate;
	private final Text text;

	public CollectToolItem(int durability, float collectSpeed, int baseCollection, BlockPos[] pattern, boolean rotate, String toolDescPath) {
		super(new Item.Settings().maxCount(1).maxDamage(durability > 0 ? durability : 10).component(DataComponentTypes.DAMAGE, Math.max(durability, 0)));

		this.collectSpeed = collectSpeed;
		this.baseCollection = baseCollection;
		this.pattern = pattern;
		this.rotate = rotate;
		this.text = Text.translatable(toolDescPath);
	}

	public float getCollectSpeed() {
		return this.collectSpeed;
	}

	public int getBaseCollection() {
		return this.baseCollection;
	}

	public BlockPos[] getPattern() {
		return this.pattern;
	}

	// This makes the tool unbreakable
	@Override
	public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
		return true;
	}

	@Override
	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
		List<String> words = new ArrayList<>();
		Collections.addAll(words, this.text.getString().split(" "));

		// Automatic text wrapping
		while(!words.isEmpty()) {
			String line = "";
			String word = words.removeFirst();

			// Wrap automatically every 5 words
			for(int i = 0; i < 4 && !words.isEmpty() && !word.contains("\n"); i++) {
				line += word + " ";
				word = words.removeFirst();
			}
			if(word.contains("\n")) {
				String[] parts = word.split("\n");
				line += parts[0];
				for(int j = 1; j < parts.length; j++) {
					words.addFirst(parts[j]);
				}
			} else {
				line += word;
			}
			tooltip.add(Text.literal(line).formatted(Formatting.GRAY));
		}
	}

	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			for(BlockPos blockPos : this.pattern) {
				// Calculate the rotation of the pattern
				BlockPos calculatedPos = blockPos;
				if(this.rotate) {
					if(miner.getYaw() <= 135 && miner.getYaw() >= 45) {
						calculatedPos = new BlockPos(blockPos.getZ(), blockPos.getY(), -blockPos.getX());
					} else if (miner.getYaw() <= 45 && miner.getYaw() >= -45) {
						calculatedPos = new BlockPos(-blockPos.getX(), blockPos.getY(), -blockPos.getZ());
					} else if (miner.getYaw() <= -45 && miner.getYaw() >= -135) {
						calculatedPos = new BlockPos(-blockPos.getZ(), blockPos.getY(), blockPos.getX());
					} else {
						calculatedPos = new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ());
					}
				}

				// Apply modifications to each flower block
				if(world.getBlockEntity(calculatedPos.add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity flowerBlockEntity) {
					flowerBlockEntity.removePollen(this.baseCollection);
				}
			}
			miner.getItemCooldownManager().set(this, (int)(20 * this.collectSpeed));
		}
		return 0;
	}
}
