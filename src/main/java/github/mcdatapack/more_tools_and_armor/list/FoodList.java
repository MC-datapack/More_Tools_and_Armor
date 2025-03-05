package github.mcdatapack.more_tools_and_armor.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Items;

public class FoodList {
    public static final FoodComponent ANCIENT_HONEY_BOTTLE = new FoodComponent.Builder()
            .nutrition(500)
            .saturationModifier(10)
            .alwaysEdible()
            .usingConvertsTo(Items.GLASS_BOTTLE)
            .build();
}
