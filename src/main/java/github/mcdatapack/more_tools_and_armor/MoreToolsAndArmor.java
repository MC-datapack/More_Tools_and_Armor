package github.mcdatapack.more_tools_and_armor;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import github.mcdatapack.more_tools_and_armor.init.*;
import github.mcdatapack.more_tools_and_armor.init.worldgen.BiomeModificationInit;
import github.mcdatapack.more_tools_and_armor.util.LootHandler;
import github.mcdatapack.more_tools_and_armor.util.TradeHandler;
import net.fabricmc.api.ModInitializer;
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
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		ArmorMaterialInit.load();
		BiomeModificationInit.load();
		EnchantmentInit.load();
		LootHandler.registerListeners();
		if (MoreToolsAndArmorConfig.getConfig().trades)
			TradeHandler.registerTrades();

		LOGGER.info("Loaded More Tools and Armor");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
