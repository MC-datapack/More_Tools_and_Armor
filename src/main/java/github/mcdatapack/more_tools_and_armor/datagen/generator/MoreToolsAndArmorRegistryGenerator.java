package github.mcdatapack.more_tools_and_armor.datagen.generator;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.CompletableFuture;

public class MoreToolsAndArmorRegistryGenerator extends FabricDynamicRegistryProvider {
    public MoreToolsAndArmorRegistryGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.BLOCK_TRANSFORMER));
        entries.addAll(registries.lookupOrThrow(Registries.ENCHANTMENT));
    }

    @Override
    public String getName() {
        return "World Generator";
    }
}
