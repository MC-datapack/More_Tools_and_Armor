package github.mcdatapack.more_tools_and_armor.init.worldgen;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COAL_ORE_KEY = registerKey("end_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COPPER_ORE_KEY = registerKey("end_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRON_ORE_KEY = registerKey("end_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_GOLD_ORE_KEY = registerKey("end_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LAPIS_LAZULI_ORE_KEY = registerKey("end_lapis_lazuli_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE_KEY = registerKey("end_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE_KEY = registerKey("end_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_EMERALD_ORE_KEY = registerKey("sculk_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_EMERALD_ORE_KEY = registerKey("blackstone_emerald_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_UNSTABLE_ORE = registerKey("overworld_unstable_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_UNSTABLE_ORE = registerKey("nether_unstable_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_UNSTABLE_ORE = registerKey("end_unstable_ore");



    public static  void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest endOreReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest sculkOreReplacebles = new BlockMatchTest(Blocks.SCULK);
        RuleTest blackstoneOreReplacebles = new BlockMatchTest(Blocks.BLACKSTONE);
        RuleTest basaltOreReplacebles = new BlockMatchTest(Blocks.BASALT);
        RuleTest tuffOreReplacables = new BlockMatchTest(Blocks.TUFF);

        register(context, END_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_COAL_ORE.defaultBlockState(), 17,0F));
        register(context, END_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_COPPER_ORE.defaultBlockState(), 10,0F));
        register(context, END_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_IRON_ORE.defaultBlockState(), 9,0F));
        register(context, END_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_GOLD_ORE.defaultBlockState(), 9,0F));
        register(context, END_LAPIS_LAZULI_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_LAPIS_LAZULI_ORE.defaultBlockState(), 7,0F));
        register(context, END_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_EMERALD_ORE.defaultBlockState(), 6,0F));
        register(context, END_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_REDSTONE_ORE.defaultBlockState(), 8,0.75F));
        register(context, END_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_DIAMOND_ORE.defaultBlockState(), 8,0.75F));
        register(context, SCULK_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(sculkOreReplacebles, BlockInit.SCULK_EMERALD_ORE.defaultBlockState(), 8, 0F));
        register(context, BLACKSTONE_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(blackstoneOreReplacebles, BlockInit.BLACKSTONE_EMERALD_BLOCK.defaultBlockState(), 8, 0F));

        register(context, OVERWORLD_UNSTABLE_ORE, Feature.ORE, new OreConfiguration(tuffOreReplacables, BlockInit.OVERWORLD_UNSTABLE_ORE.defaultBlockState(), 4, 1F));
        register(context, NETHER_UNSTABLE_ORE, Feature.ORE, new OreConfiguration(basaltOreReplacebles, BlockInit.NETHER_UNSTABLE_ORE.defaultBlockState(), 4, 1F));
        register(context, END_UNSTABLE_ORE, Feature.ORE, new OreConfiguration(endOreReplaceables, BlockInit.END_UNSTABLE_ORE.defaultBlockState(), 4, 1F));
    }



    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, MoreToolsAndArmor.id(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
