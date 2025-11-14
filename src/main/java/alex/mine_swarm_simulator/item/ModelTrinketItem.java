package alex.mine_swarm_simulator.item;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class ModelTrinketItem extends TrinketItem {
	public final String slot;
	public final EntityModelLayer model;
	public final String armorTexturePath;

	public ModelTrinketItem(Settings settings, String slot, EntityModelLayer model, String armorTexturePath) {
		super(settings.maxCount(1));
		this.slot = slot;
		this.model = model;
		this.armorTexturePath = armorTexturePath;
	}
}