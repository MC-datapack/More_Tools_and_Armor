package github.mcdatapack.more_tools_and_armor.init.worldgen;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedFeatureInit {

    public static final RegistryKey<PlacedFeature> END_COAL_ORE = registerKey("end_coal_ore");
    public static final RegistryKey<PlacedFeature> END_COPPER_ORE = registerKey("end_copper_ore");
    public static final RegistryKey<PlacedFeature> END_IRON_ORE = registerKey("end_iron_ore");
    public static final RegistryKey<PlacedFeature> END_GOLD_ORE = registerKey("end_gold_ore");
    public static final RegistryKey<PlacedFeature> END_LAPIS_LAZULI_ORE = registerKey("end_lapis_lazuli_ore");
    public static final RegistryKey<PlacedFeature> END_EMERALD_ORE = registerKey("end_emerald_ore");
    public static final RegistryKey<PlacedFeature> END_REDSTONE_ORE = registerKey("end_redstone_ore");
    public static final RegistryKey<PlacedFeature> END_DIAMOND_ORE = registerKey("end_diamond_ore");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        register(context, END_COAL_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_COAL_ORE_KEY),
                Modifiers.modifiersCount(30, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(138))));
        register(context, END_COPPER_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_COPPER_ORE_KEY),
                Modifiers.modifiersCount(16, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(138))));
        register(context, END_IRON_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_IRON_ORE_KEY),
                Modifiers.modifiersCount(10, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_GOLD_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_GOLD_ORE_KEY),
                Modifiers.modifiersCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(96))));
        register(context, END_LAPIS_LAZULI_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_LAPIS_LAZULI_ORE_KEY),
                Modifiers.modifiersCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_EMERALD_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_EMERALD_ORE_KEY),
                Modifiers.modifiersCount(6, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(96))));
        register(context, END_REDSTONE_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_REDSTONE_ORE_KEY),
                Modifiers.modifiersCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(72))));
        register(context, END_DIAMOND_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_DIAMOND_ORE_KEY),
                Modifiers.modifiersCount(6, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));
    }


    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, MoreToolsAndArmor.id(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }
}
