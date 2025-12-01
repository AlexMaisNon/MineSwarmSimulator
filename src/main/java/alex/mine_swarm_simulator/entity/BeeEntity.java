package alex.mine_swarm_simulator.entity;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.attributes.ModAttributes;
import alex.mine_swarm_simulator.block.entity.HiveSlotBlockEntity;
import alex.mine_swarm_simulator.entity.ai.control.BeeFlightControl;
import alex.mine_swarm_simulator.entity.ai.goal.*;
import alex.mine_swarm_simulator.entity.ai.pathing.BeeNavigation;
import alex.mine_swarm_simulator.util.BeeType;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BeeEntity extends TameableEntity {
	public static final long[] neededBondForLevel = new long[]{10L, 40L, 200L, 750L, 4000L, 15000L, 60000L, 270000L, 450000L, 1200000L, 2000000L, 4000000L, 7000000L, 15000000L, 120000000L, 450000000L, 1900000000L, 7500000000L, 15000000000L, 475000000000L, 4500000000000L, 95000000000000L, 900000000000000L, 9000000000000000L};

	public final AnimationState idleAnimationState = new AnimationState();
	private int idleAnimationTimeout = 0;

	private static final TrackedData<Byte> BEE_TYPE_ID = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.BYTE);
	private static final TrackedData<Boolean> GIFTED = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	private static final TrackedData<Byte> LEVEL = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.BYTE);
	private static final TrackedData<Integer> ENERGY = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.INTEGER);
	private static final TrackedData<Long> BOND = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.LONG);
	private static final TrackedData<ItemStack> BEEQUIP = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.ITEM_STACK);

	@Nullable private BlockPos hivePos;

	public BeeEntity(EntityType<? extends BeeEntity> entityType, World world) {
		super(entityType, world);
		this.moveControl = new BeeFlightControl(this);
		this.setNoGravity(true);
		this.noClip = true;
	}

	@Override
	protected void initDataTracker(DataTracker.Builder builder) {
		super.initDataTracker(builder);
		builder.add(BEE_TYPE_ID, (byte)0);
		builder.add(GIFTED, false);
		builder.add(LEVEL, (byte)0);
		builder.add(ENERGY, 0);
		builder.add(BOND, 0L);
		builder.add(BEEQUIP, ItemStack.EMPTY);
	}

	public BeeType getBeeType() {
		return BeeType.byId(this.getBeeTypeId());
	}

	public byte getBeeTypeId() {
		return this.dataTracker.get(BEE_TYPE_ID);
	}

	public void setBeeTypeId(byte value) {
		this.dataTracker.set(BEE_TYPE_ID, value);
	}

	public boolean getGifted() {
		return this.dataTracker.get(GIFTED);
	}

	public void setGifted(boolean value) {
		this.dataTracker.set(GIFTED, value);
	}

	public byte getLevel() {
		return this.dataTracker.get(LEVEL);
	}

	public void setLevel(byte value) {
		this.dataTracker.set(LEVEL, value);
	}

	public int getEnergy() {
		return this.dataTracker.get(ENERGY);
	}

	public void setEnergy(int value) {
		this.dataTracker.set(ENERGY, value);
	}

	public long getBond() {
		return this.dataTracker.get(BOND);
	}

	public void setBond(long value) {
		this.dataTracker.set(BOND, value);
	}

	public ItemStack getBeequip() {
		return this.dataTracker.get(BEEQUIP);
	}

	public void setBeequip(ItemStack value) {
		this.dataTracker.set(BEEQUIP, value);
	}

	public @Nullable BlockPos getHivePos() {
		return hivePos;
	}

	public void setHivePos(@Nullable BlockPos hivePos) {
		this.hivePos = hivePos;
	}

	public float getGatherAmount() {
		return this.getBeeType().getGatherAmount() * (1 + 0.05f * (this.getLevel() - 1));
	}

	public float getConvertAmount() {
		return this.getBeeType().getConvertAmount() * (1 + 0.1f * (this.getLevel() - 1));
	}

	public int getGatherSpeed() {
		return Math.round(20f * this.getBeeType().getGatherSpeed());
	}

	public int getConvertSpeed() {
		return Math.round(20f * this.getBeeType().getConvertSpeed());
	}

	@Override
	public void onTrackedDataSet(TrackedData<?> data) {
		super.onTrackedDataSet(data);
		this.initializeMovespeed();
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(0, new ReturnToHiveGoal(this, 1d));
		this.goalSelector.add(1, new ConvertPollenGoal(this, 1d));
		this.goalSelector.add(2, new CollectPollenGoal(this, 1d));
		this.goalSelector.add(3, new WanderAroundOwnerGoal(this, 1d));
		this.goalSelector.add(4, new FollowAroundOwnerGoal(this, 1d, 4));
	}

	@Override
	protected EntityNavigation createNavigation(World world) {
		BeeNavigation beeNavigation = new BeeNavigation(this, world);
		beeNavigation.setCanPathThroughDoors(true);
		return beeNavigation;
	}

	private void updateAnimations() {
		if(idleAnimationTimeout <= 0) {
			this.idleAnimationTimeout = 4;
			this.idleAnimationState.start(this.age);
		} else {
			--this.idleAnimationTimeout;
		}
	}

	private void initializeMovespeed() {
		this.getAttributeInstance(EntityAttributes.GENERIC_FLYING_SPEED).clearModifiers();

		// 0.23493 flying_speed = 14.84 Bee Movespeed <=> 0.01583 flying_speed = 1 Bee Movespeed
		this.getAttributeInstance(EntityAttributes.GENERIC_FLYING_SPEED).setBaseValue(this.getBeeType().getSpeed() * 0.01583d);
		this.getAttributeInstance(EntityAttributes.GENERIC_FLYING_SPEED).addPersistentModifier(new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "bee_level"), 0.03d * (this.getLevel() - 1), EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
		if(this.getOwner() != null) {
			this.getAttributeInstance(EntityAttributes.GENERIC_FLYING_SPEED).addPersistentModifier(new EntityAttributeModifier(Identifier.of(MineSwarmSimulator.MOD_ID, "bee_movespeed"), this.getOwner().getAttributeInstance(ModAttributes.PLAYER_BEE_MOVESPEED).getValue() - 1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
		}
	}

	public void initializeEnergy() {
		if(this.getOwner() != null) {
			this.setEnergy((int)Math.round(this.getBeeType().getEnergy() * (1f + 0.05f * (this.getLevel() - 1f)) * this.getOwner().getAttributeValue(ModAttributes.PLAYER_MAX_BEE_ENERGY)));
		}
	}

	public void addBond(long value) {
		this.setBond(this.getBond() + value);

		byte newLevel = 0;
		long sum = 0;

		while(sum <= this.getBond() && newLevel <= neededBondForLevel.length) {
			if(newLevel < neededBondForLevel.length) {
				sum += neededBondForLevel[newLevel];
			}
			newLevel++;
		}

		if(newLevel != this.getLevel() && this.getOwner() != null) {
			this.getOwner().sendMessage(Text.literal(this.getBeeType().getType() + " Bee leveled up to level " + newLevel + "!").formatted(Formatting.YELLOW));
		}
		this.setLevel(newLevel);
	}

	@Override
	public void tick() {
		super.tick();

		if(this.getWorld().isClient()) {
			this.updateAnimations();
		} else {
			if(this.hivePos != null && !(this.getWorld().getBlockEntity(this.hivePos) instanceof HiveSlotBlockEntity)) {
				this.hivePos = null;
			}
		}
	}

	@Override
	public boolean damage(DamageSource source, float amount) {
		return (source == this.getDamageSources().genericKill() || source == this.getDamageSources().outOfWorld()) && super.damage(source, amount);
	}

	public static DefaultAttributeContainer.Builder createBeeAttributes() {
		return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0).add(EntityAttributes.GENERIC_FLYING_SPEED, 0.2).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 48.0);
	}

	public boolean isClimbing() {
		return false;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return false;
	}

	@Nullable
	@Override
	public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
		return null;
	}

	@Override
	public boolean shouldTryTeleportToOwner() {
		return false;
	}

	@Override
	public int getMaxLookPitchChange() {
		return 90;
	}

	@Override
	public void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);

		this.setBeeTypeId(nbt.getByte("Type"));
		this.setGifted(nbt.getBoolean("Gifted"));
		this.setLevel(nbt.getByte("Level"));
		this.setBond(nbt.getLong("Bond"));
		this.setEnergy(nbt.getInt("Energy"));
		this.setBeequip(ItemStack.fromNbtOrEmpty(this.getRegistryManager(), nbt.getCompound("Beequip")));

		this.hivePos = NbtHelper.toBlockPos(nbt, "hive").orElse(null);
	}

	@Override
	public void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);

		nbt.putByte("Type", this.getBeeTypeId());
		nbt.putBoolean("Gifted", this.getGifted());
		nbt.putByte("Level", this.getLevel());
		nbt.putLong("Bond", this.getBond());
		nbt.putInt("Energy", this.getEnergy());

		if(!this.getBeequip().isEmpty()) {
			NbtCompound itemCompound = new NbtCompound();
			nbt.put("Beequip", this.getBeequip().encode(this.getRegistryManager(), itemCompound));
		}

		if(this.hivePos != null) {
			nbt.put("hive", NbtHelper.fromBlockPos(this.hivePos));
		}
	}

	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData) {
		this.setBeeTypeId((byte)0);
		this.setGifted(false);
		this.setLevel((byte)1);
		this.setBond(0L);
		this.setEnergy(20);
		this.setBeequip(ItemStack.EMPTY);
		this.hivePos = null;
		return super.initialize(world, difficulty, spawnReason, entityData);
	}
}
