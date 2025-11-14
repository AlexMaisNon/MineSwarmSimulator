package alex.mine_swarm_simulator.item.tools;

import alex.mine_swarm_simulator.block.custom.FlowerBlock;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import alex.mine_swarm_simulator.data.PlayerData;
import alex.mine_swarm_simulator.data.StateSaverAndLoader;
import alex.mine_swarm_simulator.item.ModItems;
import alex.mine_swarm_simulator.sound.ModSounds;
import alex.mine_swarm_simulator.status_effect.ModStatusEffects;
import alex.mine_swarm_simulator.util.GooObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GummyballerItem extends CollectToolItem {
	public GummyballerItem() {
		super(1000, 1f, 9, new BlockPos[]{
			new BlockPos(0, 0, -7),
			new BlockPos(-2, 0, -6), new BlockPos(-1, 0, -6), new BlockPos(0, 0, -6), new BlockPos(1, 0, -6), new BlockPos(2, 0, -6),
			new BlockPos(-2, 0, -5), new BlockPos(-1, 0, -5), new BlockPos(0, 0, -5), new BlockPos(1, 0, -5), new BlockPos(2, 0, -5),
			new BlockPos(-3, 0, -4), new BlockPos(-2, 0, -4), new BlockPos(-1, 0, -4), new BlockPos(0, 0, -4), new BlockPos(1, 0, -4), new BlockPos(2, 0, -4), new BlockPos(3, 0, -4),
			new BlockPos(-2, 0, -3), new BlockPos(-1, 0, -3), new BlockPos(0, 0, -3), new BlockPos(1, 0, -3), new BlockPos(2, 0, -3),
			new BlockPos(-2, 0, -2), new BlockPos(-1, 0, -2), new BlockPos(0, 0, -2), new BlockPos(1, 0, -2), new BlockPos(2, 0, -2),
			new BlockPos(0, 0, -1),
		}, true, "item.mine_swarm_simulator.gummyballer.desc");
	}

	@Override
	public int collect(World world, BlockPos pos, PlayerEntity miner) {
		if(!miner.getItemCooldownManager().isCoolingDown(this)) {
			int totalFlowers = 0;
			for(BlockPos blockPos : this.getPattern()) {
				// Calculate the rotation of the pattern
				BlockPos calculatedPos;
				if(miner.getYaw() <= 135 && miner.getYaw() >= 45) {
					calculatedPos = new BlockPos(blockPos.getZ(), blockPos.getY(), -blockPos.getX());
				} else if (miner.getYaw() <= 45 && miner.getYaw() >= -45) {
					calculatedPos = new BlockPos(-blockPos.getX(), blockPos.getY(), -blockPos.getZ());
				} else if (miner.getYaw() <= -45 && miner.getYaw() >= -135) {
					calculatedPos = new BlockPos(-blockPos.getZ(), blockPos.getY(), blockPos.getX());
				} else {
					calculatedPos = new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ());
				}

				// Apply modifications to each flower block
				if(world.getBlockEntity(calculatedPos.add(pos.getX(), pos.getY(), pos.getZ())) instanceof FlowerBlockEntity flowerBlockEntity) {
					flowerBlockEntity.removePollen(this.getBaseCollection());
					// count x2 pollen
					if(!flowerBlockEntity.getGoo().isEmpty()) {
						flowerBlockEntity.setGoo(new ArrayList<>());
						totalFlowers++;
					}
				}
			}
			miner.getItemCooldownManager().set(this, (int)(20 * this.getCollectSpeed()));

			if(totalFlowers > 0) {
				if (miner.hasStatusEffect(ModStatusEffects.GUMMYBALL_STATUS_EFFECT)) {
					miner.addStatusEffect(new StatusEffectInstance(ModStatusEffects.GUMMYBALL_STATUS_EFFECT, 240, miner.getStatusEffect(ModStatusEffects.GUMMYBALL_STATUS_EFFECT).getAmplifier() + totalFlowers));
				} else {
					miner.addStatusEffect(new StatusEffectInstance(ModStatusEffects.GUMMYBALL_STATUS_EFFECT, 240, totalFlowers - 1));
				}
				if (miner.getStatusEffect(ModStatusEffects.GUMMYBALL_STATUS_EFFECT).getAmplifier() >= 1000) {
					miner.removeStatusEffect(ModStatusEffects.GUMMYBALL_STATUS_EFFECT);
				}
			}
		}
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if(!world.isClient() && entity instanceof PlayerEntity player) {
			if(player.hasStatusEffect(ModStatusEffects.GUMMYBALL_STATUS_EFFECT)) {
				stack.setDamage(999 - player.getStatusEffect(ModStatusEffects.GUMMYBALL_STATUS_EFFECT).getAmplifier());
			} else {
				stack.setDamage(stack.getMaxDamage());
			}
		}
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		/* Gummy Mask thingy */
		if(!world.isClient() && user.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.GUMMY_MASK)) {
			StateSaverAndLoader state = StateSaverAndLoader.getServerState(world.getServer());
			PlayerData playerData = StateSaverAndLoader.getPlayerState(user);
			if(state.fields.containsKey(playerData.currentField)) {
				List<FlowerBlockEntity> flowerBlocks = new ArrayList<>();
				BlockPos.iterate(state.fields.get(playerData.currentField).pos[0], state.fields.get(playerData.currentField).pos[1]).forEach(blockPos -> {
					if(world.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
						flowerBlocks.add(flowerBlockEntity);
					}
				});
				flowerBlocks.forEach(flowerBlock -> {
					GooObject gooObject = flowerBlock.getGoo().stream().filter(value -> Objects.equals(value.getOwner(), "gummy_morph_passive")).findAny().orElse(null);
					if(gooObject != null) {
						flowerBlock.modifyGooDuration(gooObject, 1f);
					} else {
						flowerBlock.addGoo(new GooObject(flowerBlocks.size(), 1f, "gummy_morph_passive"));
					}
				});
			}
			world.playSound(null, user.getBlockPos(), ModSounds.GUMMY_MORPH, SoundCategory.PLAYERS, 5f, 1f);
		}
		return super.use(world, user, hand);
	}
}
