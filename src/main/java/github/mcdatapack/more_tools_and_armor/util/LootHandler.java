package github.mcdatapack.more_tools_and_armor.util;

import github.mcdatapack.more_tools_and_armor.init.BlockInit;
import github.mcdatapack.more_tools_and_armor.init.ItemInit;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class LootHandler {
    public static void registerListeners() {
        LootTableEvents.MODIFY.register((lootTable, builder, lootTableSource, wrapperLookup) -> {
            addItemsToLootTable(builder, BuiltInLootTables.SNIFFER_DIGGING, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_HONEY_BOTTLE, 0.01F));
            addItemsToLootTable(builder, EntityType.BAT.getDefaultLootTable().get(), lootTable,
                    new LootTableItem(ItemInit.BAT_WING, 0.1F));
            addItemsToLootTable(builder, BuiltInLootTables.DESERT_WELL_ARCHAEOLOGY, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_COIN, 0.15F));
            addItemsToLootTable(builder, Blocks.BUDDING_AMETHYST.getLootTable().get(), lootTable,
                    new LootTableItem(ItemInit.BUDDING_AMETHYST_CRYSTAL, UniformGenerator.between(1, 3)));
            addItemsToLootTable(builder, BuiltInLootTables.DESERT_PYRAMID_ARCHAEOLOGY, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, 0.05F));
            addItemsToLootTable(builder, BuiltInLootTables.DESERT_PYRAMID, lootTable,
                    new LootTableItem(ItemInit.ANCIENT_UPGRADE_SMITHING_TEMPLATE, 0.0125F));
            addItemsToLootTable(builder, BuiltInLootTables.ANCIENT_CITY, lootTable,
                    new LootTableItem(Blocks.DEEPSLATE_EMERALD_ORE, UniformGenerator.between(1, 3), 0.075F),
                    new LootTableItem(ItemInit.SCULK_EMERALD, UniformGenerator.between(1, 2), 0.12F));
            addItemsToLootTable(builder, BuiltInLootTables.END_CITY_TREASURE, lootTable,
                    new LootTableItem(ItemInit.END_DIAMOND, UniformGenerator.between(1, 2), 0.075F),
                    new LootTableItem(ItemInit.END_EMERALD, UniformGenerator.between(1, 4), 0.075F),
                    new LootTableItem(Items.DIAMOND_BLOCK, 0.12F));
            addItemsToLootTable(builder, BuiltInLootTables.BASTION_TREASURE, lootTable,
                    new LootTableItem(ItemInit.BLACKSTONE_EMERALD, UniformGenerator.between(1, 2), 0.1F),
                    new LootTableItem(Items.NETHERITE_INGOT, UniformGenerator.between(1, 4), 0.25F));
            addItemsToLootTable(builder, BuiltInLootTables.BASTION_OTHER, lootTable,
                    new LootTableItem(ItemInit.BLACKSTONE_EMERALD, 0.075F));
            addItemsToLootTable(builder, BuiltInLootTables.BASTION_BRIDGE, lootTable,
                    new LootTableItem(BlockInit.BLACKSTONE_EMERALD_ORE, 0.1F));
            addItemsToLootTable(builder, BuiltInLootTables.STRONGHOLD_CROSSING, lootTable,
                    new LootTableItem(ItemInit.DEEPSLATE_EMERALD, 0.5F));
            addItemsToLootTable(builder, BuiltInLootTables.STRONGHOLD_CORRIDOR, lootTable,
                    new LootTableItem(ItemInit.DEEPSLATE_EMERALD, 0.1F));
        });
        LootTableEvents.REPLACE.register((key, original, source, registries) -> {
            HolderGetter<Enchantment> getter = registries.lookupOrThrow(Registries.ENCHANTMENT);
            if (Blocks.DEEPSLATE_EMERALD_ORE.getLootTable().get().equals(key)) {
                LootPool.Builder poolBuilder1 = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ItemInit.DEEPSLATE_EMERALD));
                LootPool.Builder poolBuilder2 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ItemInit.DEEPSLATE_EMERALD))
                        .apply(ApplyBonusCount.addOreBonusCount(getter.get(Enchantments.FORTUNE).get()));
                LootPool.Builder poolBuilder3 = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ItemInit.DEEPSLATE_EMERALD_UPGRADE_SMITHING_TEMPLATE))
                        .when(LootItemRandomChanceCondition.randomChance(UniformGenerator.between(0.25F, 0.125F)));

                LootTable.Builder tableBuilder = LootTable.lootTable().pool(poolBuilder1.build()).pool(poolBuilder2.build()).pool(poolBuilder3.build());
                return tableBuilder.build();
            }

            return original;
        });
    }

    public static void addItemsToLootTable(LootTable.Builder builder, ResourceKey<LootTable> target, ResourceKey<LootTable> lottTable, LootTableItem... entries) {
        if (target.equals(lottTable)) {
            for (LootTableItem entry : entries) {
                addLootPool(builder, entry.item(), entry.count(), entry.chance());
            }
        }
    }

    public static void addLootPool(LootTable.Builder builder, ItemLike item, NumberProvider count, float chance) {
        builder.pool(LootPool.lootPool()
                .setRolls(count)
                .add(LootItem.lootTableItem(item))
                .when(LootItemRandomChanceCondition.randomChance(chance))
                .build());
    }

    public record LootTableItem(ItemLike item, NumberProvider count, float chance) {
        public LootTableItem(ItemLike item, float chance) {
            this(item, ConstantValue.exactly(1), chance);
        }
        public LootTableItem(ItemLike item, NumberProvider count) {
            this(item, count, 1.0F);
        }
    }
}
