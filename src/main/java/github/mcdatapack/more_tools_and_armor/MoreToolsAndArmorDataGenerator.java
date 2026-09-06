package github.mcdatapack.more_tools_and_armor;

import github.mcdatapack.more_tools_and_armor.datagen.generator.MoreToolsAndArmorEnchantmentGenerator;
import github.mcdatapack.more_tools_and_armor.datagen.generator.MoreToolsAndArmorWorldGenerator;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorEquipmentAssetProvider;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorModelProvider;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorRecipeProvider;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorTagProvider;
import github.mcdatapack.more_tools_and_armor.init.EnchantmentInit;
import github.mcdatapack.more_tools_and_armor.init.worldgen.ConfiguredFeatureInit;
import github.mcdatapack.more_tools_and_armor.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class MoreToolsAndArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(MoreToolsAndArmorModelProvider::new);
		pack.addProvider(MoreToolsAndArmorWorldGenerator::new);
		pack.addProvider(MoreToolsAndArmorRecipeProvider::new);
		pack.addProvider(MoreToolsAndArmorTagProvider.BlockTagProvider::new);
		pack.addProvider(MoreToolsAndArmorTagProvider.ItemTagProvider::new);
		pack.addProvider(MoreToolsAndArmorEnchantmentGenerator::new);
		pack.addProvider((FabricDataGenerator.Pack.Factory<MoreToolsAndArmorEquipmentAssetProvider>) MoreToolsAndArmorEquipmentAssetProvider::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.add(Registries.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
		registryBuilder.add(Registries.ENCHANTMENT, EnchantmentInit::bootstrap);
	}
}
