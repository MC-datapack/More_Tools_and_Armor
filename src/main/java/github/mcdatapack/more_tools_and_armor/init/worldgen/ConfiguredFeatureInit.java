package github.mcdatapack.more_tools_and_armor.init.worldgen;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import java.util.List;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COAL_ORE_KEY = registerKey("end_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COPPER_ORE_KEY = registerKey("end_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_IRON_ORE_KEY = registerKey("end_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_GOLD_ORE_KEY = registerKey("end_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_LAPIS_LAZULI_ORE_KEY = registerKey("end_lapis_lazuli_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE_KEY = registerKey("end_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE_KEY = registerKey("end_diamond_ore");



    public static  void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest endOreReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> endTargetsCoal = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsCopper = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsIron = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsGold = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsLapisLazuli = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_LAPIS_LAZULI_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsEmerald = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsRedstone= List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTargetsDiamond = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.END_DIAMOND_ORE.getDefaultState()));

        register(context, END_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsCoal, 17,0F));
        register(context, END_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsCopper, 10,0F));
        register(context, END_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsIron, 9,0F));
        register(context, END_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsGold, 9,0F));
        register(context, END_LAPIS_LAZULI_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsLapisLazuli, 7,0F));
        register(context, END_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsEmerald, 6,0F));
        register(context, END_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsRedstone, 8,0.75F));
        register(context, END_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTargetsDiamond, 8,0.75F));
    }



    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, MoreToolsAndArmor.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
