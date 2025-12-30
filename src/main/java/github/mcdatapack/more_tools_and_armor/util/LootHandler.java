package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.predicate.item.ItemSubPredicateTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;

public class LootHandler {
    public static void registerListeners() {
        LootTableEvents.MODIFY.register((lootTable, builder, lootTableSource, wrapperLookup) -> {
            addItemsToLootTable(builder, LootTables.SNIFFER_DIGGING_GAMEPLAY, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_HONEY_BOTTLE, 0.01F));
            addItemsToLootTable(builder, EntityType.BAT.getLootTableKey().get(), lootTable,
                    new LootTableItem(ItemInit.BAT_WING, 0.1F));
            addItemsToLootTable(builder, LootTables.DESERT_WELL_ARCHAEOLOGY, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_COIN, 0.15F));
            addItemsToLootTable(builder, Blocks.BUDDING_AMETHYST.getLootTableKey().get(), lootTable,
                    new LootTableItem(ItemInit.BUDDING_AMETHYST_CRYSTAL, UniformLootNumberProvider.create(1, 3)));
            addItemsToLootTable(builder, LootTables.DESERT_PYRAMID_ARCHAEOLOGY, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, 0.05F));
            addItemsToLootTable(builder, LootTables.DESERT_PYRAMID_CHEST, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, 0.0125F));
            addItemsToLootTable(builder, LootTables.ANCIENT_CITY_CHEST, lootTable,
                    new LootTableItem(Blocks.DEEPSLATE_EMERALD_ORE, UniformLootNumberProvider.create(1, 3), 0.075F),
                    new LootTableItem(ItemInit.SCULK_EMERALD, UniformLootNumberProvider.create(1, 2), 0.12F));
            addItemsToLootTable(builder, LootTables.END_CITY_TREASURE_CHEST, lootTable,
                    new LootTableItem(ItemInit.END_DIAMOND, UniformLootNumberProvider.create(1, 2), 0.075F),
                    new LootTableItem(ItemInit.END_EMERALD, UniformLootNumberProvider.create(1, 4), 0.075F),
                    new LootTableItem(Items.DIAMOND_BLOCK, 0.12F));
            addItemsToLootTable(builder, LootTables.BASTION_TREASURE_CHEST, lootTable,
                    new LootTableItem(ItemInit.BLACKSTONE_EMERALD, UniformLootNumberProvider.create(1, 2), 0.1F),
                    new LootTableItem(Items.NETHERITE_INGOT, UniformLootNumberProvider.create(1, 4), 0.25F));
            addItemsToLootTable(builder, LootTables.BASTION_OTHER_CHEST, lootTable,
                    new LootTableItem(ItemInit.BLACKSTONE_EMERALD, 0.075F));
            addItemsToLootTable(builder, LootTables.BASTION_BRIDGE_CHEST, lootTable,
                    new LootTableItem(BlockInit.BLACKSTONE_EMERALD_ORE, 0.1F));
            addItemsToLootTable(builder, LootTables.STRONGHOLD_CROSSING_CHEST, lootTable,
                    new LootTableItem(ItemInit.DEEPSLATE_EMERALD, 0.5F));
            addItemsToLootTable(builder, LootTables.STRONGHOLD_CORRIDOR_CHEST, lootTable,
                    new LootTableItem(ItemInit.DEEPSLATE_EMERALD, 0.1F));
        });
        LootTableEvents.REPLACE.register((key, original, source, registries) -> {
            RegistryWrapper.Impl<Enchantment> impl = registries.getOrThrow(RegistryKeys.ENCHANTMENT);
            if (Blocks.DEEPSLATE_EMERALD_ORE.getLootTableKey().equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ItemInit.DEEPSLATE_EMERALD).conditionally(
                                MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create()
                                                .subPredicate(
                                                ItemSubPredicateTypes.ENCHANTMENTS,
                                                EnchantmentsPredicate.enchantments(List.of(new EnchantmentPredicate(impl.getOrThrow(Enchantments.FORTUNE), NumberRange.IntRange.atLeast(1))))
                                        )
                                )
                        ))
                        .with(ItemEntry.builder(ItemInit.DEEPSLATE_EMERALD).apply(
                                ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE))
                        ))
                        .with(ItemEntry.builder(ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE).conditionally(
                                RandomChanceWithEnchantedBonusLootCondition.builder(registries, 0.25F, 0.125F)
                        ));

                LootTable.Builder tableBuilder = LootTable.builder().pool(poolBuilder);
                return tableBuilder.build();
            }

            return original;
        });
    }

    public static void addItemsToLootTable(LootTable.Builder builder, RegistryKey<LootTable> target, RegistryKey<LootTable> lottTable, LootTableItem... entries) {
        if (target.equals(lottTable)) {
            for (LootTableItem entry : entries) {
                addLootPool(builder, entry.item(), entry.count(), entry.chance());
            }
        }
    }

    public static void addLootPool(LootTable.Builder builder, ItemConvertible item, LootNumberProvider count, float chance) {
        builder.pool(LootPool.builder()
                .rolls(count)
                .with(ItemEntry.builder(item))
                .conditionally(RandomChanceLootCondition.builder(chance)));
    }

    public record LootTableItem(ItemConvertible item, LootNumberProvider count, float chance) {
        public LootTableItem(ItemConvertible item, float chance) {
            this(item, ConstantLootNumberProvider.create(1), chance);
        }
        public LootTableItem(ItemConvertible item, LootNumberProvider count) {
            this(item, count, 1.0F);
        }
    }
}
