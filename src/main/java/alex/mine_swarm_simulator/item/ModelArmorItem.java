package alex.mine_swarm_simulator.item;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import alex.mine_swarm_simulator.armor.ArmorBipedModel;
import alex.mine_swarm_simulator.armor.ModArmorMaterials;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModelArmorItem extends ArmorItem {

	@Environment(EnvType.CLIENT)
	private BipedEntityModel<LivingEntity> model;
	public final ArmorItem.Type type;
	public final EntityModelLayer modelLayer;
	public final String armorTexturePath;

	public ModelArmorItem(Type type, Settings settings, EntityModelLayer modelLayer, String armorTexturePath) {
		super(ModArmorMaterials.AirMaterial, type, settings.maxCount(1));
		this.type = type;
		this.modelLayer = modelLayer;
		this.armorTexturePath = armorTexturePath;
	}

	@Environment(EnvType.CLIENT)
	public BipedEntityModel<LivingEntity> getArmorModel() {
		if (model == null) {
			model = provideArmorModelForSlot(type.getEquipmentSlot());
		}
		return model;
	}

	@Environment(EnvType.CLIENT)
	protected BipedEntityModel<LivingEntity> provideArmorModelForSlot(EquipmentSlot slot) {
		var models = MinecraftClient.getInstance().getEntityModelLoader();
		var root = models.getModelPart(modelLayer);
		return new ArmorBipedModel(root, slot);
	}

	@NotNull
	public Identifier getArmorTexture(ItemStack stack, EquipmentSlot slot) {
		return Identifier.of(MineSwarmSimulator.MOD_ID, armorTexturePath);
	}
}
