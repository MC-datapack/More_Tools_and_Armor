package github.mcdatapack.more_tools_and_armor.datagen.generator;

import github.mcdatapack.more_tools_and_armor.init.EnchantmentInit;
import github.mcdatapack.more_tools_and_armor.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntryList;

import java.util.concurrent.CompletableFuture;

public class MoreToolsAndArmorEnchantmentGenerator extends FabricDynamicRegistryProvider {
    public MoreToolsAndArmorEnchantmentGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup, Entries entries) {
        RegistryEntryList<Item> hammerEnchantable = wrapperLookup.getWrapperOrThrow(RegistryKeys.ITEM).getOrThrow(TagList.ItemTags.HAMMER_ENCHANTABLE);
        entries.add(EnchantmentInit.RANGE, Enchantment.builder(
                Enchantment.definition(
                        hammerEnchantable,
                        1,
                        3,
                        Enchantment.leveledCost(3, 4),
                        Enchantment.leveledCost(4, 7),
                        7,
                        AttributeModifierSlot.HAND
                )).build(EnchantmentInit.RANGE.getValue()));
    }

    @Override
    public String getName() {
        return "Enchantment Generator";
    }
}
