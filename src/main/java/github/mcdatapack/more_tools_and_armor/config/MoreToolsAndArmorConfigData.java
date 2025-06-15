package github.mcdatapack.more_tools_and_armor.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "more_tools_and_armor")
public class MoreToolsAndArmorConfigData implements ConfigData {
    @ConfigEntry.Gui.TransitiveObject
    public boolean showTooltip = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean endermanSave = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean powderSnowWalk = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean piglinPassive = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean ironGolemPassive = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean endermanPassive = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean phantomPassive = true;

    @ConfigEntry.Gui.TransitiveObject
    @Comment("Instand Damage always gets applied")
    public boolean statusEffectImmune = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean bedrockMining = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean randomOre = true;

    @ConfigEntry.Gui.TransitiveObject
    public boolean moreXP = true;
}
