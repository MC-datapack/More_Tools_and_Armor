package github.mcdatapack.more_tools_and_armor.item;

import github.mcdatapack.more_tools_and_armor.init.BlockTransformerInit;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;

public class PaxelItem extends Item {
    public final ToolMaterial material;
    public PaxelItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Item.Properties settings) {
        super(settings.tool(toolMaterial, TagList.BlockTags.PAXEL_MINEABLE, attackDamage, attackSpeed, 0.0F)
                .delayedComponent(DataComponents.BLOCK_TRANSFORMER, context -> context.getOrThrow(BlockTransformerInit.PAXEL)));
        this.material = toolMaterial;
    }
}
