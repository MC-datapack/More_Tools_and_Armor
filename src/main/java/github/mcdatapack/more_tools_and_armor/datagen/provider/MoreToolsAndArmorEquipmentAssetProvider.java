package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import github.mcdatapack.more_tools_and_armor.init.EquipmentModelInit;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class MoreToolsAndArmorEquipmentAssetProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public MoreToolsAndArmorEquipmentAssetProvider(final PackOutput output) {
        this.pathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(final BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(EquipmentModelInit.COAL, onlyHumanoid("coal"));
        consumer.accept(EquipmentModelInit.LAPIS, onlyHumanoid("lapis"));
        consumer.accept(EquipmentModelInit.BUDDING_AMETHYST, onlyHumanoid("budding_amethyst"));
        consumer.accept(EquipmentModelInit.EMERALD, onlyHumanoid("emerald"));
        consumer.accept(EquipmentModelInit.REDSTONE, onlyHumanoid("redstone"));
        consumer.accept(EquipmentModelInit.OBSIDIAN, onlyHumanoid("obsidian"));
        consumer.accept(EquipmentModelInit.DEEPSLATE_EMERALD, onlyHumanoid("deepslate_emerald"));
        consumer.accept(EquipmentModelInit.END_DIAMOND, onlyHumanoid("end_diamond"));
        consumer.accept(EquipmentModelInit.VOID, onlyHumanoid("void"));
        consumer.accept(EquipmentModelInit.ONETHDENDERITE, onlyHumanoid("onethdenderite"));
        consumer.accept(EquipmentModelInit.OLED, onlyHumanoid("oled"));
        consumer.accept(EquipmentModelInit.ANCIENT, onlyHumanoid("ancient"));
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, pathProvider::json, equipmentAssets);
    }

    private static EquipmentClientInfo onlyHumanoid(final String name) {
        return EquipmentClientInfo.builder().addHumanoidLayers(MoreToolsAndArmor.id(name)).build();
    }

    @Override
    public String getName() {
        return "Equipment Asset Provider";
    }
}
