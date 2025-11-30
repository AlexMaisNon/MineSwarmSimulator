package alex.mine_swarm_simulator.item.misc;

import alex.mine_swarm_simulator.block.entity.HiveSlotBlockEntity;
import alex.mine_swarm_simulator.entity.BeeEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;

public class BeequipItem extends Item {
	public BeequipItem() {
		super(new Settings().maxCount(1));
	}

	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		if(context.getPlayer() != null && context.getWorld() instanceof ServerWorld serverWorld && context.getWorld().getBlockEntity(context.getBlockPos()) instanceof HiveSlotBlockEntity hiveSlotBlockEntity) {
			if(serverWorld.getEntity(hiveSlotBlockEntity.getBeeUUID()) instanceof BeeEntity beeEntity) {
				beeEntity.setBeequip(context.getStack().copy());

				context.getStack().decrement(1);
				context.getPlayer().giveItemStack(hiveSlotBlockEntity.getBeeBeequip().copy());

				return ActionResult.SUCCESS;
			}
		}
		return ActionResult.PASS;
	}
}
