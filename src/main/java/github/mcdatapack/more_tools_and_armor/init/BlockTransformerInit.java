package github.mcdatapack.more_tools_and_armor.init;

import com.google.common.collect.ImmutableList;
import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.list.LootTableList;
import net.minecraft.core.Direction;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.component.BlockTransformers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;

import java.util.List;

public interface BlockTransformerInit {
    ResourceKey<BlockTransformer> PAXEL = ResourceKey.create(Registries.BLOCK_TRANSFORMER, MoreToolsAndArmor.id("paxel"));

    static void bootstrap(BootstrapContext<BlockTransformer> context) {
        context.register(PAXEL, new BlockTransformer(new ImmutableList.Builder<BlockTransformer.BlockTransformData>()
                .add(BlockTransformers.axeStrippables())
                .addAll(BlockTransformers.axe(WeatheringCopper.PREVIOUS_BY_BLOCK.get().entrySet(), SoundEvents.AXE_SCRAPE, BlockTransformer.TransformParticle.SCRAPE))
                .addAll(BlockTransformers.axe(HoneycombItem.WAX_OFF_BY_BLOCK.get().entrySet(), SoundEvents.AXE_WAX_OFF, BlockTransformer.TransformParticle.WAX_OFF))
                .add(BlockTransformer.BlockTransformData.builder(BlockPredicate.matchesBlocks(Blocks.PODZOL, Blocks.MYCELIUM), Blocks.DIRT)
                        .sound(SoundEvents.SHOVEL_FLATTEN)
                        .loot(LootTableList.TILL_MUSHROOM_SUPPORTING)
                        .build())
                .add(BlockTransformer.BlockTransformData.builder(
                                BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.TURNS_INTO_DIRT_PATH), BlockPredicate.matchesTag(Direction.UP, BlockTags.AIR)),
                                Blocks.DIRT_PATH
                        )
                        .sound(SoundEvents.SHOVEL_FLATTEN)
                        .disallowedFaces(List.of(Direction.DOWN))
                        .build())
                .add(BlockTransformer.BlockTransformData.builder(
                                RuleBasedStateProvider.builder()
                                        .ifTrueThenProvide(
                                                BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.TURNS_INTO_FARMLAND), BlockPredicate.matchesTag(Direction.UP, BlockTags.AIR)), Blocks.FARMLAND
                                        )
                                        .ifTrueThenProvide(
                                                BlockPredicate.allOf(BlockPredicate.matchesBlocks(Blocks.COARSE_DIRT), BlockPredicate.matchesTag(Direction.UP, BlockTags.AIR)), Blocks.DIRT
                                        )
                                        .build()
                        )
                        .sound(SoundEvents.HOE_TILL)
                        .disallowedFaces(List.of(Direction.DOWN))
                        .build())
                .add(BlockTransformer.BlockTransformData.builder(BlockPredicate.matchesBlocks(Blocks.ROOTED_DIRT), Blocks.DIRT)
                        .sound(SoundEvents.HOE_TILL)
                        .loot(BuiltInLootTables.TILL_ROOTED_DIRT)
                        .dropStrategy(BlockTransformer.DropStrategy.CLICKED_FACE)
                        .build())
                .build()));
    }
}
