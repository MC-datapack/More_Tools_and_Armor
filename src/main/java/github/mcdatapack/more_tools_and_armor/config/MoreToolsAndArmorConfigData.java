package github.mcdatapack.more_tools_and_armor.config;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit.*;

@Config(name = "more_tools_and_armor")
public class MoreToolsAndArmorConfigData implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig endermanSave = new AbilityConfig(true, END_DIAMOND, VOID, ONETHDENDERITE, OLED);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig powderSnowWalk = new AbilityConfig(true, VOID, ONETHDENDERITE, OLED);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig piglinPassive = new AbilityConfig(true, ONETHDENDERITE, OLED);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig ironGolemPassive = new AbilityConfig(true, OLED);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig endermanPassive = new AbilityConfig(true, OLED);

    @ConfigEntry.Gui.CollapsibleObject
    @Comment("Instand Damage always gets applied")
    public AbilityConfig statusEffectImmune = new AbilityConfig(true, OLED);

    public static class AbilityConfig {
        @SafeVarargs
        public AbilityConfig(boolean activated, RegistryEntry<ArmorMaterial>... materials) {
            this.activated = activated;
            List<String> temp = new ArrayList<>();
            for (RegistryEntry<ArmorMaterial> material : materials) {
                temp.add(Objects.requireNonNull(Registries.ARMOR_MATERIAL.getId(material.value())).toString());
            }
            this.materials = temp;
        }

        @ConfigEntry.Gui.TransitiveObject
        public boolean activated;

        @ConfigEntry.Gui.NoTooltip
        public List<String> materials;

        public List<RegistryEntry<ArmorMaterial>> getMaterials() {
            List<RegistryEntry<ArmorMaterial>> temp = new ArrayList<>();
            for (String s : materials) {
                temp.add(Registries.ARMOR_MATERIAL.getEntry(Registries.ARMOR_MATERIAL.get(Identifier.of(s))));
            }
            return temp;
        }

        public boolean isInMaterials(RegistryEntry<ArmorMaterial> material) {
            for (String s : materials) {
                if (Registries.ARMOR_MATERIAL.get(Identifier.of(s)) == material.value()) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsMaterial(RegistryEntry<ArmorMaterial> material) {
            for (String string : materials) {
                if (Objects.equals(Registries.ARMOR_MATERIAL.get(Identifier.of(string)), material.value())) {
                    return true;
                }
            }
            return false;
        }
    }
}
