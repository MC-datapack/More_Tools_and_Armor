package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class CustomEquipmentModels implements EquipmentAssetKeys {
    public static final RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> COPPER = register("copper");
    public static final RegistryKey<EquipmentAsset> BUDDING_AMETHYST = register("budding_amethyst");
    public static final RegistryKey<EquipmentAsset> EMERALD = register("emerald");
    public static final RegistryKey<EquipmentAsset> OBSIDIAN = register("obsidian");
    public static final RegistryKey<EquipmentAsset> DEEPSLATE_EMERALD = register("deepslate_emerald");
    public static final RegistryKey<EquipmentAsset> END_DIAMOND = register("end_diamond");
    public static final RegistryKey<EquipmentAsset> VOID = register("void");
    public static final RegistryKey<EquipmentAsset> ONETHDENDERITE = register("onethdenderite");
    public static final RegistryKey<EquipmentAsset> OLED = register("oled");

    public static RegistryKey<EquipmentAsset> register(String name) {
        return RegistryKey.of(REGISTRY_KEY, MoreToolsAndArmor.id(name));
    }
}
