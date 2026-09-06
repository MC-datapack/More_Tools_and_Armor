package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;

public class EnchantmentInit {
    public static final ResourceKey<Enchantment> RANGE = ResourceKey.create(Registries.ENCHANTMENT, MoreToolsAndArmor.id("range"));

    public static void bootstrap(BootstrapContext<Enchantment> context) {
        HolderSet<Item> hammerEnchantable = context.lookup(Registries.ITEM).getOrThrow(TagList.ItemTags.HAMMER_ENCHANTABLE);
        context.register(RANGE, Enchantment.enchantment(
                Enchantment.definition(
                        hammerEnchantable,
                        1,
                        3,
                        Enchantment.dynamicCost(3, 4),
                        Enchantment.dynamicCost(4, 7),
                        7,
                        EquipmentSlotGroup.HAND
                )).build(EnchantmentInit.RANGE.identifier()));
    }

    public static void load() {}
}
