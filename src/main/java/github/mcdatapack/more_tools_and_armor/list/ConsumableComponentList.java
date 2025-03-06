package github.mcdatapack.more_tools_and_armor.list;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.sound.SoundEvents;

public class ConsumableComponentList {
    public static final ConsumableComponent ANCIENT_HONEY_BOTTLE = ConsumableComponents.drink()
            .consumeSeconds(2.0F)
            .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK)
            .build();
}
