package github.mcdatapack.more_tools_and_armor.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "more_tools_and_armor")
public class MoreToolsAndArmorConfigData implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig endermanSave = new AbilityConfig(true);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig powderSnowWalk = new AbilityConfig(true);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig piglinPassive = new AbilityConfig(true);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig ironGolemPassive = new AbilityConfig(true);

    @ConfigEntry.Gui.CollapsibleObject
    public AbilityConfig endermanPassive = new AbilityConfig(true);

    @ConfigEntry.Gui.CollapsibleObject
    @Comment("Instand Damage always gets applied")
    public AbilityConfig statusEffectImmune = new AbilityConfig(true);

    public static class AbilityConfig {
        public AbilityConfig(boolean activated) {
            this.activated = activated;
        }

        @ConfigEntry.Gui.TransitiveObject
        public boolean activated;

    }
}
