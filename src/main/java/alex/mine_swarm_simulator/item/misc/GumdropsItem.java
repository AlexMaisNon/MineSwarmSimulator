package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.entity.GumdropEntity;
import alex.mine_swarm_simulator.entity.ModEntities;
import alex.mine_swarm_simulator.sound.ModSounds;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class GumdropsItem extends Item {
	public GumdropsItem() {
		super(new Item.Settings());
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		ItemStack currentStack = user.getStackInHand(hand);
		user.getItemCooldownManager().set(this, 45);

		if(!world.isClient()) {
			int x = user.getBlockX();
			int y = user.getBlockY();
			int z = user.getBlockZ();
			BlockPos[] positions = new BlockPos[20];

			for(byte i = 0; i < 20; i++) {
				positions[i] = new BlockPos(x + 10 - 4 * (i % 5), y + 4, z - 6 + 4 * (i / 5));
			}

			ArrayList<Integer> indexes = new java.util.ArrayList<>(IntStream.range(0, 20).boxed().toList());
			Random random = new Random();
			int quantity = random.nextInt(8, 14);
			for(byte i = 0; i < 20 - quantity; i++) {
				indexes.remove(random.nextInt(0, indexes.size()));
			}

			Thread dropThread = new Thread(() -> {
				for(int index : indexes) {
					float n = random.nextFloat();
					GumdropEntity gumdrop = new GumdropEntity(ModEntities.GUMDROP, world);
					gumdrop.setPosition(positions[index].toCenterPos());
					if(n < 0.26) {
						gumdrop.setRadius(9);
					} else if(n < 0.74) {
						gumdrop.setRadius(13);
					} else {
						gumdrop.setRadius(29);
					}
					world.spawnEntity(gumdrop);
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
			});
			dropThread.start();

			world.playSound(null, user.getBlockPos(), ModSounds.GUMDROPS_USE, SoundCategory.PLAYERS);

			if(!user.isInCreativeMode()) {
				currentStack.decrement(1);
			}
		}
		return super.use(world, user, hand);
	}
}
