package alex.mine_swarm_simulator.armor;

import alex.mine_swarm_simulator.MineSwarmSimulator;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class ModArmorMaterials {
	public static final RegistryEntry<ArmorMaterial> AirMaterial = registerMaterial(new ArmorMaterial(
		Map.of(
			ArmorItem.Type.HELMET, 0,
			ArmorItem.Type.CHESTPLATE, 0,
			ArmorItem.Type.LEGGINGS, 0,
			ArmorItem.Type.BOOTS, 0
		),
		0,
		SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
		() -> Ingredient.EMPTY,
		List.of(new ArmorMaterial.Layer(Identifier.of(MineSwarmSimulator.MOD_ID, "air_material"), "", false)),
		0f,
		0f
	), "air_material");

	private static RegistryEntry<ArmorMaterial> registerMaterial(ArmorMaterial material, String name) {
		return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(MineSwarmSimulator.MOD_ID, name), material);
	}

	public static void registerModArmorMaterials() {
		MineSwarmSimulator.LOGGER.info("Registering Mod Materials for " + MineSwarmSimulator.MOD_ID);
	}
}
