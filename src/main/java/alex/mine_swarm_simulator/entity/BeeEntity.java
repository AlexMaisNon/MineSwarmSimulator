package alex.mine_swarm_simulator.entity;

import alex.mine_swarm_simulator.entity.ai.control.BeeFlightControl;
import alex.mine_swarm_simulator.entity.ai.goal.FollowAroundOwnerGoal;
import alex.mine_swarm_simulator.entity.ai.goal.WanderAroundOwnerGoal;
import alex.mine_swarm_simulator.entity.ai.pathing.BeeNavigation;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
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
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BeeEntity extends TameableEntity {
	public final AnimationState idleAnimationState = new AnimationState();
	private int idleAnimationTimeout = 0;

	private static final TrackedData<Integer> DATA_ID_TYPE = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.INTEGER);
	private static final TrackedData<Boolean> DATA_ID_GIFTED = DataTracker.registerData(BeeEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

	protected BeeEntity(EntityType<? extends BeeEntity> entityType, World world) {
		super(entityType, world);
		this.moveControl = new BeeFlightControl(this);
		this.setNoGravity(true);
		this.noClip = true;
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(0, new WanderAroundOwnerGoal(this, 1d));
		this.goalSelector.add(1, new FollowAroundOwnerGoal(this, 1.5d, 4, Integer.MAX_VALUE));
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

	@Override
	public void tick() {
		super.tick();

		if(this.getWorld().isClient()) {
			this.updateAnimations();
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

	public BeeType getBeeType() {
		return BeeType.byId(this.getTypeId());
	}

	public int getTypeId() {
		return Math.clamp(this.dataTracker.get(DATA_ID_TYPE), 0, 45);
	}

	public void setTypeId(int value) {
		this.dataTracker.set(DATA_ID_TYPE, value);
	}

	public boolean getGifted() {
		return this.dataTracker.get(DATA_ID_GIFTED);
	}

	public void setGifted(boolean value) {
		this.dataTracker.set(DATA_ID_GIFTED, value);
	}

	@Override
	protected void initDataTracker(DataTracker.Builder builder) {
		super.initDataTracker(builder);
		builder.add(DATA_ID_TYPE, 0);
		builder.add(DATA_ID_GIFTED, false);
	}

	@Override
	public void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);
		this.setTypeId(nbt.getInt("Type"));
		this.setGifted(nbt.getBoolean("Gifted"));
	}

	@Override
	public void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
		nbt.putInt("Type", this.getTypeId());
		nbt.putBoolean("Gifted", this.getGifted());
	}

	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData) {
		return super.initialize(world, difficulty, spawnReason, entityData);
	}
}
