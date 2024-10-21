package github.mcdatapack.more_tools_and_armor;

import github.mcdatapack.more_tools_and_armor.init.*;
import github.mcdatapack.more_tools_and_armor.init.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
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
		LOGGER.info("Before ItemInit");
		ItemInit.load();
		LOGGER.info("After ItemInit");
		BlockInit.load();
		ItemGroupInit.load();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {entries.addAfter(Items.AMETHYST_SHARD, ItemInit.BUDDING_AMETHYST_CRYSTAL);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {entries.addAfter(Items.EMERALD, ItemInit.DEEPSLATE_EMERALD);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(Items.NETHERITE_BLOCK, BlockInit.DEEPSLATE_EMERALD_BLOCK));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {entries.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_COAL_ORE, BlockInit.END_COAL_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_COPPER_ORE, BlockInit.END_COPPER_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_IRON_ORE, BlockInit.END_IRON_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_GOLD_ORE, BlockInit.END_GOLD_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_LAPIS_ORE, BlockInit.END_LAPIS_LAZULI_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_EMERALD_ORE, BlockInit.END_EMERALD_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_REDSTONE_ORE, BlockInit.END_REDSTONE_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {entries.addAfter(Items.REDSTONE_ORE, BlockInit.END_REDSTONE_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.addAfter(Items.DEEPSLATE_DIAMOND_ORE, BlockInit.END_DIAMOND_ORE);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {entries.addAfter(ItemInit.DEEPSLATE_EMERALD, ItemInit.END_DIAMOND);});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {entries.addAfter(BlockInit.DEEPSLATE_EMERALD_BLOCK, BlockInit.END_DIAMOND_BLOCK);});
		ArmorMaterialInit.load();
		BiomeModificationInit.load();
		LOGGER.info("Loaded More Tools and Armor");

	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
