package github.mcdatapack.more_tools_and_armor.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static github.mcdatapack.more_tools_and_armor.init.ArmorMaterialInit.*;
import static net.minecraft.item.ArmorMaterials.NETHERITE;

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
    public AbilityConfig statusEffectImmune = new AbilityConfig(true, OLED);

    public static class AbilityConfig {
        @SafeVarargs
        public AbilityConfig(boolean activated, RegistryEntry<ArmorMaterial>... materials) {
            this.activated = activated;
            List<String> temp = new ArrayList<>();
            for (RegistryEntry<ArmorMaterial> material : materials) {
                temp.add(Objects.requireNonNull(Registries.ARMOR_MATERIAL.getId(material.value())).toString());
            }
            this.materials = temp.toArray(new String[0]);
        }

        @ConfigEntry.Gui.TransitiveObject
        public boolean activated;

        @ConfigEntry.Gui.NoTooltip
        public String[] materials;

        public ArmorMaterial[] getMaterials() {
            List<ArmorMaterial> temp = new ArrayList<>();
            for (String s : materials) {
                temp.add(Registries.ARMOR_MATERIAL.get(Identifier.of(s)));
            }
            return temp.toArray(new ArmorMaterial[0]);
        }

        public boolean isInMaterials(RegistryEntry<ArmorMaterial> material) {
            for (String s : materials) {
                if (Registries.ARMOR_MATERIAL.get(Identifier.of(s)) == material.value()) {
                    return true;
                }
            }
            return false;
        }
    }
}
