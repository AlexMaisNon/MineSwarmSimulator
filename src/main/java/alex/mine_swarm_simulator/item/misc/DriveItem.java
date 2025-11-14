package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.item.ConsumableItem;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.UseAction;

public class DriveItem extends ConsumableItem {
	public DriveItem(RegistryEntry<StatusEffect> effect) {
		super(new Item.Settings().maxCount(5), UseAction.NONE, new StatusEffectInstance(effect, 6000), 6000);
	}
}
