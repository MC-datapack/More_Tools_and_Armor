package github.mcdatapack.more_tools_and_armor;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.init.*;
import github.mcdatapack.more_tools_and_armor.init.worldgen.BiomeModificationInit;
import github.mcdatapack.more_tools_and_armor.util.CopperItemOxidationRegistry;
import github.mcdatapack.more_tools_and_armor.util.LootHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreToolsAndArmor implements ModInitializer {
	public static final String MOD_ID = "more_tools_and_armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading More Tools and Armor");
		MoreToolsAndArmorConfig.register();
		LootHandler.registerListeners();
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		ArmorMaterialInit.load();
		BiomeModificationInit.load();
		GameRuleInit.load();
		EnchantmentInit.load();

		CopperItemOxidationRegistry.OXIDATION.put(Items.COPPER_INGOT, ItemInit.EXPOSED_COPPER_INGOT);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_INGOT, ItemInit.WEATHERED_COPPER_INGOT);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_INGOT, ItemInit.OXIDIZED_COPPER_INGOT);

		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_SWORD, ItemInit.EXPOSED_COPPER_SWORD);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_SWORD, ItemInit.WEATHERED_COPPER_SWORD);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_SWORD, ItemInit.OXIDIZED_COPPER_SWORD);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_AXE, ItemInit.EXPOSED_COPPER_AXE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_AXE, ItemInit.WEATHERED_COPPER_AXE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_AXE, ItemInit.OXIDIZED_COPPER_AXE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_PICKAXE, ItemInit.EXPOSED_COPPER_PICKAXE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_PICKAXE, ItemInit.WEATHERED_COPPER_PICKAXE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_PICKAXE, ItemInit.OXIDIZED_COPPER_PICKAXE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_SHOVEL, ItemInit.EXPOSED_COPPER_SHOVEL);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_SHOVEL, ItemInit.WEATHERED_COPPER_SHOVEL);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_SHOVEL, ItemInit.OXIDIZED_COPPER_SHOVEL);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_HOE, ItemInit.EXPOSED_COPPER_HOE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_HOE, ItemInit.WEATHERED_COPPER_HOE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_HOE, ItemInit.OXIDIZED_COPPER_HOE);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_PAXEL, ItemInit.EXPOSED_COPPER_PAXEL);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_PAXEL, ItemInit.WEATHERED_COPPER_PAXEL);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_PAXEL, ItemInit.OXIDIZED_COPPER_PAXEL);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.COPPER_HAMMER, ItemInit.EXPOSED_COPPER_HAMMER);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.EXPOSED_COPPER_HAMMER, ItemInit.WEATHERED_COPPER_HAMMER);
		CopperItemOxidationRegistry.OXIDATION.put(ItemInit.WEATHERED_COPPER_HAMMER, ItemInit.OXIDIZED_COPPER_HAMMER);

		CopperItemOxidationRegistry.WAXING.put(Items.COPPER_INGOT, ItemInit.WAXED_COPPER_INGOT);
		CopperItemOxidationRegistry.WAXING.put(ItemInit.EXPOSED_COPPER_INGOT, ItemInit.WAXED_EXPOSED_COPPER_INGOT);
		CopperItemOxidationRegistry.WAXING.put(ItemInit.WEATHERED_COPPER_INGOT, ItemInit.WAXED_WEATHERED_COPPER_INGOT);
		CopperItemOxidationRegistry.WAXING.put(ItemInit.OXIDIZED_COPPER_INGOT, ItemInit.WAXED_OXIDIZED_COPPER_INGOT);

		LOGGER.info("Loaded More Tools and Armor");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
