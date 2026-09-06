package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.config.MoreToolsAndArmorConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import static github.mcdatapack.more_tools_and_armor.item.ConvertTo.replace;

public class ConvertPickaxeItem extends PickaxeItem {
    private final int max;

    public ConvertPickaxeItem(int max, ToolMaterial material, float attackDamage, float attackSpeed, Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
        this.max = max;
    }

    @Override
    public boolean mineBlock(ItemStack itemStack, Level level, BlockState state, BlockPos pos, LivingEntity owner) {
        if (MoreToolsAndArmorConfig.getConfig().randomOre)
            replace(level, state, pos, max);
        return super.mineBlock(itemStack, level, state, pos, owner);
    }
}
