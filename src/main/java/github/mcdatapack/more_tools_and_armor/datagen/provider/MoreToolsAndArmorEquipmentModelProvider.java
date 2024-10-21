package github.mcdatapack.more_tools_and_armor.datagen.provider;

import github.mcdatapack.more_tools_and_armor.init.CustomEquipmentModels;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.data.client.EquipmentModelProvider;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class MoreToolsAndArmorEquipmentModelProvider extends EquipmentModelProvider implements DataProvider {
    private final DataOutput.PathResolver pathResolver;

    public MoreToolsAndArmorEquipmentModelProvider(DataOutput output) {
        super(output);
        pathResolver = output.getResolver(DataOutput.OutputType.RESOURCE_PACK, "models/equipment");
    }
    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        Map<Identifier, EquipmentModel> map = new HashMap();
        CustomEquipmentModels.accept((id, model) -> {
            if (map.putIfAbsent(id, model) != null) {
                throw new IllegalStateException("Tried to register equipment model twice for id: " + id);
            }
        });
        return DataProvider.writeAllToPath(writer, EquipmentModel.CODEC, this.pathResolver, map);
    }
}
