package github.mcdatapack.more_tools_and_armor.init.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class BiomeModificationInit {
    public static void load() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_COAL_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_COPPER_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_IRON_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_GOLD_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_LAPIS_LAZULI_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_EMERALD_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_REDSTONE_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.END_DIAMOND_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.SCULK_EMERALD_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.BLACKSTONE_EMERALD_ORE
        );
    }
}
