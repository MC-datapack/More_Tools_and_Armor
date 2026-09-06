package github.mcdatapack.more_tools_and_armor.list;

import net.minecraft.world.food.FoodProperties;

public class FoodList {
    public static final FoodProperties ANCIENT_HONEY_BOTTLE = new FoodProperties.Builder()
            .nutrition(500)
            .saturationModifier(10)
            .alwaysEdible()
            .build();
}