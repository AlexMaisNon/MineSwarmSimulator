package alex.mine_swarm_simulator.event;

import alex.mine_swarm_simulator.component.ModComponents;
import alex.mine_swarm_simulator.component.PassivesComponent;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class ItemTooltipHandler implements ItemTooltipCallback {
	@Override
	public void getTooltip(ItemStack itemStack, Item.TooltipContext tooltipContext, TooltipType tooltipType, List<Text> list) {
		if(itemStack.contains(ModComponents.PASSIVES_COMPONENT)) {
			List<PassivesComponent.Passive> passives = itemStack.get(ModComponents.PASSIVES_COMPONENT).passives();
			for(PassivesComponent.Passive passive : passives) {
				if(tooltipType.isAdvanced()) {
					list.add(list.size() - 2, Text.literal("+").append(Text.translatable("passive.mine_swarm_simulator.tooltip")).append(": ").append(Text.translatable(passive.getTranslationKey())).formatted(Formatting.BLUE));
				} else {
					list.add(Text.literal("+").append(Text.translatable("passive.mine_swarm_simulator.tooltip")).append(": ").append(Text.translatable(passive.getTranslationKey())).formatted(Formatting.BLUE));
				}
			}
		}
	}
}
