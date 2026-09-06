package github.mcdatapack.more_tools_and_armor.init.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class BiomeModificationInit {
    public static void load() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_COAL_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_COPPER_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_IRON_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_GOLD_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_LAPIS_LAZULI_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_EMERALD_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_REDSTONE_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_DIAMOND_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(Biomes.DEEP_DARK),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.SCULK_EMERALD_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(Biomes.BASALT_DELTAS),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.BLACKSTONE_EMERALD_ORE
        );

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.OVERWORLD_UNSTABLE_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.NETHER_UNSTABLE_ORE
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheEnd(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                PlacedFeatureInit.END_UNSTABLE_ORE
        );
    }
}
