package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public interface EquipmentModelInit {
    ResourceKey<EquipmentAsset> COAL = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("coal"));
    ResourceKey<EquipmentAsset> LAPIS = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("lapis"));
    ResourceKey<EquipmentAsset> BUDDING_AMETHYST = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("budding_amethyst"));
    ResourceKey<EquipmentAsset> EMERALD = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("emerald"));
    ResourceKey<EquipmentAsset> REDSTONE = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("redstone"));
    ResourceKey<EquipmentAsset> OBSIDIAN = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("obsidian"));
    ResourceKey<EquipmentAsset> DEEPSLATE_EMERALD = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("deepslate_emerald"));
    ResourceKey<EquipmentAsset> END_DIAMOND = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("end_diamond"));
    ResourceKey<EquipmentAsset> VOID = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("void"));
    ResourceKey<EquipmentAsset> ONETHDENDERITE = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("onethdenderite"));
    ResourceKey<EquipmentAsset> OLED = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("oled"));
    ResourceKey<EquipmentAsset> ANCIENT = ResourceKey.create(EquipmentAssets.ROOT_ID, MoreToolsAndArmor.id("ancient"));
}
