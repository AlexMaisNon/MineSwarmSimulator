package alex.mine_swarm_simulator.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;

public class ArmorBipedModel extends BipedEntityModel<LivingEntity> {
	final EquipmentSlot slot;

	public ArmorBipedModel(ModelPart root, EquipmentSlot slot) {
		super(root, RenderLayer::getEntityTranslucent);
		this.slot = slot;
	}

	@Override
	public void animateModel(LivingEntity livingEntity, float f, float g, float h) {
		super.animateModel(livingEntity, f, g, h);
	}

	@Override
	public void setAngles(LivingEntity entity, float f, float g, float h, float i, float j) {
		if (!(entity instanceof ArmorStandEntity stand)) {
			super.setAngles(entity, f, g, h, i, j);
			return;
		}
		this.head.pitch = ((float) Math.PI / 180F) * stand.getHeadRotation().getPitch();
		this.head.yaw = ((float) Math.PI / 180F) * stand.getHeadRotation().getYaw();
		this.head.roll = ((float) Math.PI / 180F) * stand.getHeadRotation().getRoll();
		this.head.setPivot(0.0F, 1.0F, 0.0F);
		this.body.pitch = ((float) Math.PI / 180F) * stand.getBodyRotation().getPitch();
		this.body.yaw = ((float) Math.PI / 180F) * stand.getBodyRotation().getYaw();
		this.body.roll = ((float) Math.PI / 180F) * stand.getBodyRotation().getRoll();
		this.leftArm.pitch = ((float) Math.PI / 180F) * stand.getLeftArmRotation().getPitch();
		this.leftArm.yaw = ((float) Math.PI / 180F) * stand.getLeftArmRotation().getYaw();
		this.leftArm.roll = ((float) Math.PI / 180F) * stand.getLeftArmRotation().getRoll();
		this.rightArm.pitch = ((float) Math.PI / 180F) * stand.getRightArmRotation().getPitch();
		this.rightArm.yaw = ((float) Math.PI / 180F) * stand.getRightArmRotation().getYaw();
		this.rightArm.roll = ((float) Math.PI / 180F) * stand.getRightArmRotation().getRoll();
		this.leftLeg.pitch = ((float) Math.PI / 180F) * stand.getLeftLegRotation().getPitch();
		this.leftLeg.yaw = ((float) Math.PI / 180F) * stand.getLeftLegRotation().getYaw();
		this.leftLeg.roll = ((float) Math.PI / 180F) * stand.getLeftLegRotation().getRoll();
		this.leftLeg.setPivot(1.9F, 11.0F, 0.0F);
		this.rightLeg.pitch = ((float) Math.PI / 180F) * stand.getRightLegRotation().getPitch();
		this.rightLeg.yaw = ((float) Math.PI / 180F) * stand.getRightLegRotation().getYaw();
		this.rightLeg.roll = ((float) Math.PI / 180F) * stand.getRightLegRotation().getRoll();
		this.rightLeg.setPivot(-1.9F, 11.0F, 0.0F);
		this.hat.copyTransform(head);
	}
}
