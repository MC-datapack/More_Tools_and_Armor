package github.mcdatapack.more_tools_and_armor.init.worldgen;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class PlacedFeatureInit {
    public static final ResourceKey<PlacedFeature> END_COAL_ORE = registerKey("end_coal_ore");
    public static final ResourceKey<PlacedFeature> END_COPPER_ORE = registerKey("end_copper_ore");
    public static final ResourceKey<PlacedFeature> END_IRON_ORE = registerKey("end_iron_ore");
    public static final ResourceKey<PlacedFeature> END_GOLD_ORE = registerKey("end_gold_ore");
    public static final ResourceKey<PlacedFeature> END_LAPIS_LAZULI_ORE = registerKey("end_lapis_lazuli_ore");
    public static final ResourceKey<PlacedFeature> END_EMERALD_ORE = registerKey("end_emerald_ore");
    public static final ResourceKey<PlacedFeature> END_REDSTONE_ORE = registerKey("end_redstone_ore");
    public static final ResourceKey<PlacedFeature> END_DIAMOND_ORE = registerKey("end_diamond_ore");
    public static final ResourceKey<PlacedFeature> SCULK_EMERALD_ORE = registerKey("sculk_emerald_ore");
    public static final ResourceKey<PlacedFeature> BLACKSTONE_EMERALD_ORE = registerKey("blackstone_emerald_ore");


    public static final ResourceKey<PlacedFeature> OVERWORLD_UNSTABLE_ORE = registerKey("overworld_unstable_ore");
    public static final ResourceKey<PlacedFeature> NETHER_UNSTABLE_ORE = registerKey("nether_unstable_ore");
    public static final ResourceKey<PlacedFeature> END_UNSTABLE_ORE = registerKey("end_unstable_ore");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> registryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, END_COAL_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_COAL_ORE_KEY),
                Modifiers.modifiersCount(30, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(138))));
        register(context, END_COPPER_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_COPPER_ORE_KEY),
                Modifiers.modifiersCount(16, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(138))));
        register(context, END_IRON_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_IRON_ORE_KEY),
                Modifiers.modifiersCount(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(138))));
        register(context, END_GOLD_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_GOLD_ORE_KEY),
                Modifiers.modifiersCount(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(96))));
        register(context, END_LAPIS_LAZULI_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_LAPIS_LAZULI_ORE_KEY),
                Modifiers.modifiersCount(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(138))));
        register(context, END_EMERALD_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_EMERALD_ORE_KEY),
                Modifiers.modifiersCount(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(96))));
        register(context, END_REDSTONE_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_REDSTONE_ORE_KEY),
                Modifiers.modifiersCount(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(72))));
        register(context, END_DIAMOND_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_DIAMOND_ORE_KEY),
                Modifiers.modifiersCount(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));
        register(context, SCULK_EMERALD_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.SCULK_EMERALD_ORE_KEY),
                Modifiers.modifiersCount(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
        register(context, BLACKSTONE_EMERALD_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.BLACKSTONE_EMERALD_ORE_KEY),
                Modifiers.modifiersCount(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30))));



        register(context, OVERWORLD_UNSTABLE_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.OVERWORLD_UNSTABLE_ORE),
                Modifiers.modifiersCount(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-40))));
        register(context, NETHER_UNSTABLE_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.NETHER_UNSTABLE_ORE),
                Modifiers.modifiersCount(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(15))));
        register(context, END_UNSTABLE_ORE, registryLookup.getOrThrow(ConfiguredFeatureInit.END_UNSTABLE_ORE),
                Modifiers.modifiersCount(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(32))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, MoreToolsAndArmor.id(name));
    }

    private static void register(BootstrapContext<PlacedFeature> context,
                                 ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, InSquarePlacement.spread(), heightModifier, BiomeFilter.biome());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacement.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilter.onAverageOnceEvery(chance), heightModifier);
        }
    }
}
