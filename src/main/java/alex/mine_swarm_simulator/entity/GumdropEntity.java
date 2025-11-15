package alex.mine_swarm_simulator.entity;

import alex.mine_swarm_simulator.block.ModBlocks;
import alex.mine_swarm_simulator.block.entity.FlowerBlockEntity;
import alex.mine_swarm_simulator.util.GooObject;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.projectile.thrown.ThrownEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GumdropEntity extends ThrownEntity {
	private short radius = 0;
	private short life = 0;

	public GumdropEntity(EntityType<? extends GumdropEntity> entityType, World world) {
		super(entityType, world);
	}

	public void setRadius(short radius) {
		this.radius = radius;
	}

	@Override
	protected double getGravity() {
		return 0.05;
	}

	@Override
	protected void initDataTracker(DataTracker.Builder builder) {}

	@Override
	public void tick() {
		super.tick();
		age();
	}

	protected void age() {
		this.life++;
		if(this.life >= 20) {
			this.discard();
		}
	}

	@Override
	protected void onBlockCollision(BlockState state) {
		super.onBlockCollision(state);
		if(state.isOf(ModBlocks.FLOWER_BLOCK) && this.getWorld().getBlockState(this.getBlockPos()).isOf(ModBlocks.FLOWER_BLOCK) && this.getWorld() instanceof ServerWorld serverWorld) {
			int x = this.getBlockX();
			int y = this.getBlockY();
			int z = this.getBlockZ();
			List<BlockPos> corners = new ArrayList<>();

			switch(this.radius) {
				case 9:
					BlockPos.iterate(new BlockPos(x - 1, y, z - 1), new BlockPos(x + 1, y, z + 1)).forEach(blockPos -> {
						if(serverWorld.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
							flowerBlockEntity.addGoo(new GooObject(this.radius, 1f, null));
						}
					});
					break;
				case 13:
					BlockPos.iterate(new BlockPos(x - 1, y, z - 1), new BlockPos(x + 1, y, z + 1)).forEach(blockPos -> {
						if(serverWorld.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
							flowerBlockEntity.addGoo(new GooObject(this.radius, 1f, null));
						}
					});
					corners.addAll(Arrays.asList(new BlockPos(x - 2, y, z), new BlockPos(x + 2, y, z), new BlockPos(x, y, z - 2), new BlockPos(x, y, z + 2)));
					break;
				case 29:
					BlockPos.iterate(new BlockPos(x - 2, y, z - 2), new BlockPos(x + 2, y, z + 2)).forEach(blockPos -> {
						if(serverWorld.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
							flowerBlockEntity.addGoo(new GooObject(this.radius, 1f, null));
						}
					});
					corners.addAll(Arrays.asList(new BlockPos(x - 3, y, z), new BlockPos(x + 3, y, z), new BlockPos(x, y, z - 3), new BlockPos(x, y, z + 3)));
					break;
				default:
					break;
			}

			corners.forEach(blockPos -> {
				if(serverWorld.getBlockEntity(blockPos) instanceof FlowerBlockEntity flowerBlockEntity) {
					flowerBlockEntity.addGoo(new GooObject(this.radius, 1f, null));
				}
			});

			this.discard();
		} else if(!state.isOf(Blocks.AIR)) {
			this.discard();
		}
	}

	@Override
	protected void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
		nbt.putShort("life", this.life);
		if(this.radius > 0) {
			nbt.putShort("Radius", this.radius);
		}
	}

	@Override
	protected void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);
		this.life = nbt.getShort("life");
		if(nbt.contains("Radius") && nbt.getShort("Radius") > 0) {
			this.radius = nbt.getShort("Radius");
		}
	}
}
