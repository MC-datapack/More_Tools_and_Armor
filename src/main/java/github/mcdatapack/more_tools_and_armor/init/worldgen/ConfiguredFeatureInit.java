package github.mcdatapack.more_tools_and_armor.init.worldgen;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final ResourceKey<Feature> END_COAL_ORE_KEY = registerKey("end_coal_ore");
    public static final ResourceKey<Feature> END_COPPER_ORE_KEY = registerKey("end_copper_ore");
    public static final ResourceKey<Feature> END_IRON_ORE_KEY = registerKey("end_iron_ore");
    public static final ResourceKey<Feature> END_GOLD_ORE_KEY = registerKey("end_gold_ore");
    public static final ResourceKey<Feature> END_LAPIS_LAZULI_ORE_KEY = registerKey("end_lapis_lazuli_ore");
    public static final ResourceKey<Feature> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
    public static final ResourceKey<Feature> END_REDSTONE_ORE_KEY = registerKey("end_redstone_ore");
    public static final ResourceKey<Feature> END_DIAMOND_ORE_KEY = registerKey("end_diamond_ore");
    public static final ResourceKey<Feature> SCULK_EMERALD_ORE_KEY = registerKey("sculk_emerald_ore");
    public static final ResourceKey<Feature> BLACKSTONE_EMERALD_ORE_KEY = registerKey("blackstone_emerald_ore");

    public static final ResourceKey<Feature> OVERWORLD_UNSTABLE_ORE = registerKey("overworld_unstable_ore");
    public static final ResourceKey<Feature> NETHER_UNSTABLE_ORE = registerKey("nether_unstable_ore");
    public static final ResourceKey<Feature> END_UNSTABLE_ORE = registerKey("end_unstable_ore");



    public static  void bootstrap(BootstrapContext<Feature> context) {
        RuleTest endOreReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest sculkOreReplacebles = new BlockMatchTest(Blocks.SCULK);
        RuleTest blackstoneOreReplacebles = new BlockMatchTest(Blocks.BLACKSTONE);
        RuleTest basaltOreReplacebles = new BlockMatchTest(Blocks.BASALT);
        RuleTest tuffOreReplacables = new BlockMatchTest(Blocks.TUFF);

        register(context, END_COAL_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_COAL_ORE.defaultBlockState()), 17, 0F));
        register(context, END_COPPER_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_COPPER_ORE.defaultBlockState()), 10,0F));
        register(context, END_IRON_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_IRON_ORE.defaultBlockState()), 9,0F));
        register(context, END_GOLD_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_GOLD_ORE.defaultBlockState()), 9,0F));
        register(context, END_LAPIS_LAZULI_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_LAPIS_LAZULI_ORE.defaultBlockState()), 7,0F));
        register(context, END_EMERALD_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_EMERALD_ORE.defaultBlockState()), 6,0F));
        register(context, END_REDSTONE_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_REDSTONE_ORE.defaultBlockState()), 8,0.75F));
        register(context, END_DIAMOND_ORE_KEY, new OreFeature(placement(endOreReplaceables, BlockInit.END_DIAMOND_ORE.defaultBlockState()), 8,0.75F));
        register(context, SCULK_EMERALD_ORE_KEY, new OreFeature(placement(sculkOreReplacebles, BlockInit.SCULK_EMERALD_ORE.defaultBlockState()), 8, 0F));
        register(context, BLACKSTONE_EMERALD_ORE_KEY, new OreFeature(placement(blackstoneOreReplacebles, BlockInit.BLACKSTONE_EMERALD_BLOCK.defaultBlockState()), 8, 0F));

        register(context, OVERWORLD_UNSTABLE_ORE, new OreFeature(placement(tuffOreReplacables, BlockInit.OVERWORLD_UNSTABLE_ORE.defaultBlockState()), 4, 1F));
        register(context, NETHER_UNSTABLE_ORE, new OreFeature(placement(basaltOreReplacebles, BlockInit.NETHER_UNSTABLE_ORE.defaultBlockState()), 4, 1F));
        register(context, END_UNSTABLE_ORE, new OreFeature(placement(endOreReplaceables, BlockInit.END_UNSTABLE_ORE.defaultBlockState()), 4, 1F));
    }

    private static List<BlockReplacement> placement(RuleTest ruleTest, BlockState state) {
        return List.of(new BlockReplacement(ruleTest, state));
    }

    private static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, MoreToolsAndArmor.id(name));
    }

    private static <F extends Feature> void register(BootstrapContext<Feature> context, ResourceKey<Feature> key, F feature) {
        context.register(key, feature);
    }
}
