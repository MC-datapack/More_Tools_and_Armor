package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class EnchantmentInit {
    public static final RegistryKey<Enchantment> RANGE = RegistryKey.of(RegistryKeys.ENCHANTMENT, MoreToolsAndArmor.id("range"));

    public static void load() {}
}
