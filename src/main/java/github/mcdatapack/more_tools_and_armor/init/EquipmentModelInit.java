package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.client.render.entity.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public interface EquipmentModelInit {
    RegistryKey<EquipmentAsset> COAL = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("coal"));
    RegistryKey<EquipmentAsset> COPPER = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("copper"));
    RegistryKey<EquipmentAsset> LAPIS = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("lapis"));
    RegistryKey<EquipmentAsset> BUDDING_AMETHYST = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("budding_amethyst"));
    RegistryKey<EquipmentAsset> EMERALD = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("emerald"));
    RegistryKey<EquipmentAsset> REDSTONE = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("redstone"));
    RegistryKey<EquipmentAsset> OBSIDIAN = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("obsidian"));
    RegistryKey<EquipmentAsset> DEEPSLATE_EMERALD = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("deepslate_emerald"));
    RegistryKey<EquipmentAsset> END_DIAMOND = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("end_diamond"));
    RegistryKey<EquipmentAsset> VOID = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("void"));
    RegistryKey<EquipmentAsset> ONETHDENDERITE = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("onethdenderite"));
    RegistryKey<EquipmentAsset> OLED = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("oled"));
    RegistryKey<EquipmentAsset> ANCIENT = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, MoreToolsAndArmor.id("ancient"));

    static void bootstrap(BiConsumer<RegistryKey<EquipmentAsset>, EquipmentModel> context) {
        context.accept(COAL, humanoid(COAL.getValue()));
        context.accept(COPPER, humanoid(COPPER.getValue()));
        context.accept(LAPIS, humanoid(LAPIS.getValue()));
        context.accept(BUDDING_AMETHYST, humanoid(BUDDING_AMETHYST.getValue()));
        context.accept(EMERALD, humanoid(EMERALD.getValue()));
        context.accept(REDSTONE, humanoid(REDSTONE.getValue()));
        context.accept(OBSIDIAN, humanoid(OBSIDIAN.getValue()));
        context.accept(DEEPSLATE_EMERALD, humanoid(DEEPSLATE_EMERALD.getValue()));
        context.accept(END_DIAMOND, humanoid(END_DIAMOND.getValue()));
        context.accept(VOID, humanoid(VOID.getValue()));
        context.accept(ONETHDENDERITE, humanoid(ONETHDENDERITE.getValue()));
        context.accept(OLED, humanoid(OLED.getValue()));
        context.accept(ANCIENT, humanoid(ANCIENT.getValue()));
    }

    private static EquipmentModel humanoid(Identifier id) {
        return EquipmentModel.builder().addHumanoidLayers(id).build();
    }
}
