package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.mcdatapack.more_tools_and_armor.item.ConvertTo.replace;

public class ConvertPickaxeItem extends PickaxeItem {
    private final int max;

    public ConvertPickaxeItem(int max, ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.max = max;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre)
            replace(world, state, pos, max);
        return super.postMine(stack, world, state, pos, miner);
    }
}
