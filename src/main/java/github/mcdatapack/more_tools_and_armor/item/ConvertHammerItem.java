package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.mcdatapack.more_tools_and_armor.item.ConvertTo.replace;

public class ConvertHammerItem extends HammerItem {
    private final int max;

    public ConvertHammerItem(int max, ToolMaterial toolMaterial, Settings settings, int range) {
        super(toolMaterial, settings, range);
        this.max = max;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre)
            replace(world, state, pos, max);
        if (!world.getBlockState(pos).isAir() && world.getBlockState(pos).getHardness(world, pos) != 0.0F) {
            world.breakBlock(pos, true, miner);

            Block.getDroppedStacks(world.getBlockState(pos), (ServerWorld) world, pos, null, miner, stack)
                    .forEach(drop -> world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), drop)));
        }
        return super.postMine(stack, world, state, pos, miner);
    }
}
