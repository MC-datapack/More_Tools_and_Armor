package github.mcdatapack.more_tools_and_armor.list;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public interface LootTableList {
    ResourceKey<LootTable> TILL_MUSHROOM_SUPPORTING = ResourceKey.create(Registries.LOOT_TABLE, MoreToolsAndArmor.id("till/mushroom_supporting"));
}
