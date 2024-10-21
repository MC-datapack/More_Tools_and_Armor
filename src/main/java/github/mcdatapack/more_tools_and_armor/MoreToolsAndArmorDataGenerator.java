package github.mcdatapack.more_tools_and_armor;

import github.mcdatapack.more_tools_and_armor.datagen.generator.MoreToolsAndArmorWorldGenerator;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorModelProvider;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorTagProvider;
import github.mcdatapack.more_tools_and_armor.datagen.provider.MoreToolsAndArmorEquipmentModelProvider;
import github.mcdatapack.more_tools_and_armor.init.worldgen.ConfiguredFeatureInit;
import github.mcdatapack.more_tools_and_armor.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class MoreToolsAndArmorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		DataGenerator.Pack pack2 = fabricDataGenerator.createPack();
		pack.addProvider(MoreToolsAndArmorModelProvider::new);
		pack.addProvider(MoreToolsAndArmorWorldGenerator::new);
		pack.addProvider(MoreToolsAndArmorTagProvider.BlockTagProvider::new);
		pack.addProvider(MoreToolsAndArmorTagProvider.ItemTagProvider::new);
		pack2.addProvider(MoreToolsAndArmorEquipmentModelProvider::new);
	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}
