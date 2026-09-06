package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import static github.mcdatapack.more_tools_and_armor.item.ConvertTo.replace;

public class ConvertHammerItem extends HammerItem {
    private final int max;

    public ConvertHammerItem(int max, ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Properties settings, int range) {
        super(toolMaterial, attackDamage, attackSpeed, settings, range);
        this.max = max;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity owner) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre)
            replace(world, state, pos, max);
        if (!world.getBlockState(pos).isAir() && world.getBlockState(pos).getDestroySpeed(world, pos) != 0.0F) {
            world.destroyBlock(pos, true, owner);

            Block.getDrops(world.getBlockState(pos), (ServerLevel) world, pos, null, owner, stack)
                    .forEach(drop -> world.addFreshEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), drop)));
        }
        return super.mineBlock(stack, world, state, pos, owner);
    }
}
