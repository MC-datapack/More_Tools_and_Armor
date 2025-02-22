package github.mcdatapack.more_tools_and_armor.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class MoreToolsAndArmorConfig {
    public static MoreToolsAndArmorConfigData getConfig() {
        return AutoConfig.getConfigHolder(MoreToolsAndArmorConfigData.class).getConfig();
    }

    public static void saveConfig() {
        AutoConfig.getConfigHolder(MoreToolsAndArmorConfigData.class).save();
    }

    public static void register() {
        AutoConfig.register(MoreToolsAndArmorConfigData.class, JanksonConfigSerializer::new);
        ServerLifecycleEvents.START_DATA_PACK_RELOAD.register((s, m) -> AutoConfig.getConfigHolder(MoreToolsAndArmorConfigData.class).load());
    }
}
