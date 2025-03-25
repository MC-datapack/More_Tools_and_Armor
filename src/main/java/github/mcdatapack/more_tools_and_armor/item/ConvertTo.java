package github.mcdatapack.more_tools_and_armor.item;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Either;
import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

record ConvertTo(int minLevel, float chance, Block result) {
    private static final Map<Either<TagKey<Block>, Block>, ConvertTo[]> CONVERT = new ImmutableMap.Builder<Either<TagKey<Block>, Block>, ConvertTo[]>()
            .put(Either.left(BlockTags.STONE_ORE_REPLACEABLES), new ConvertTo[] {
                    new ConvertTo(1, 1.3F, Blocks.COAL_ORE),
                    new ConvertTo(1, 1.1F, Blocks.COPPER_ORE),
                    new ConvertTo(2, 0.7F, Blocks.LAPIS_ORE),
                    new ConvertTo(3, 0.5F, Blocks.IRON_ORE),
                    new ConvertTo(4, 0.3F, Blocks.REDSTONE_ORE),
                    new ConvertTo(5, 0.1F, Blocks.EMERALD_ORE),
                    new ConvertTo(6, 0.05F, Blocks.DIAMOND_ORE)})
            .put(Either.left(BlockTags.DEEPSLATE_ORE_REPLACEABLES), new ConvertTo[] {
                    new ConvertTo(1, 1.3F, Blocks.DEEPSLATE_COAL_ORE),
                    new ConvertTo(1, 1.1F, Blocks.DEEPSLATE_COPPER_ORE),
                    new ConvertTo(2, 0.7F, Blocks.DEEPSLATE_LAPIS_ORE),
                    new ConvertTo(2, 0.5F, Blocks.DEEPSLATE_IRON_ORE),
                    new ConvertTo(3, 0.3F, Blocks.DEEPSLATE_REDSTONE_ORE),
                    new ConvertTo(3, 0.1F, Blocks.DEEPSLATE_EMERALD_ORE),
                    new ConvertTo(4, 0.05F, Blocks.DEEPSLATE_DIAMOND_ORE)})
            .put(Either.right(Blocks.END_STONE), new ConvertTo[] {
                    new ConvertTo(1, 1.3F, BlockInit.END_COAL_ORE),
                    new ConvertTo(1, 1.1F, BlockInit.END_COPPER_ORE),
                    new ConvertTo(2, 0.7F, BlockInit.END_LAPIS_LAZULI_ORE),
                    new ConvertTo(2, 0.5F, BlockInit.END_IRON_ORE),
                    new ConvertTo(3, 0.3F, BlockInit.END_REDSTONE_ORE),
                    new ConvertTo(3, 0.1F, BlockInit.END_EMERALD_ORE),
                    new ConvertTo(4, 0.05F, BlockInit.END_DIAMOND_ORE)})
            .put(Either.right(Blocks.NETHERRACK), new ConvertTo[] {
                    new ConvertTo(1, 2.5F, Blocks.NETHER_QUARTZ_ORE),
                    new ConvertTo(1, 2.25F, Blocks.NETHER_GOLD_ORE),
                    new ConvertTo(6, 0.5F, Blocks.ANCIENT_DEBRIS)
            })
            .put(Either.right(Blocks.BLACKSTONE), new ConvertTo[] {
                    new ConvertTo(6, 1.125F, BlockInit.BLACKSTONE_EMERALD_ORE)
            })
            .put(Either.right(Blocks.SCULK), new ConvertTo[] {
                    new ConvertTo(6, 1.125F, BlockInit.SCULK_EMERALD_ORE)
            })
            .build();

    static void replace(World world, BlockState state, BlockPos pos, int level) {
        for (Either<TagKey<Block>, Block> blockTag : ConvertTo.CONVERT.keySet()) {
            if ((blockTag.right().isPresent() && state.isOf(blockTag.right().get()))
                    ||
                    (blockTag.left().isPresent() && state.isIn(blockTag.left().get()))) {
                ConvertTo[] converts = ConvertTo.CONVERT.get(blockTag);
                for (ConvertTo convertTo : converts) {
                    if (convertTo.minLevel() > level)
                        break;
                    if (Math.random() * 100 <= convertTo.chance()) {
                        world.setBlockState(pos, convertTo.result().getDefaultState());
                        break;
                    }
                }
                break;
            }
        }
    }
}
