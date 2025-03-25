package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static github.mcdatapack.more_tools_and_armor.item.ConvertTo.replace;

public class ConvertPaxelItem extends PaxelItem {
    private final int max;

    public ConvertPaxelItem(int max, ToolMaterial material, Item.Settings settings) {
        super(material, settings);
        this.max = max;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre)
            replace(world, state, pos, max);
        return super.postMine(stack, world, state, pos, miner);
    }
}
