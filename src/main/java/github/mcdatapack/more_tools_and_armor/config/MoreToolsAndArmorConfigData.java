package github.mcdatapack.more_tools_and_armor.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "more_tools_and_armor")
public class MoreToolsAndArmorConfigData implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public boolean trades = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean showTooltip = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean endermanSave = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean powderSnowWalk = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean piglinPassive = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean ironGolemPassive = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean endermanPassive = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean phantomPassive = true;

    @ConfigEntry.Gui.CollapsibleObject
    @Comment("Instand Damage always gets applied")
    public boolean statusEffectImmune = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean bedrockMining = true;







    @ConfigEntry.Gui.CollapsibleObject
    public boolean randomOre = true;

    @ConfigEntry.Gui.CollapsibleObject
    public boolean moreXP = true;
}