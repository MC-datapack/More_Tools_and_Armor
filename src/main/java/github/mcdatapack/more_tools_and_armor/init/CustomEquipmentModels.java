package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentModels;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class CustomEquipmentModels implements EquipmentModels {
    static Identifier COPPER = MoreToolsAndArmor.id("copper");
    static Identifier BUDDING_AMETHYST = MoreToolsAndArmor.id("budding_amethyst");
    static Identifier EMERALD = MoreToolsAndArmor.id("emerald");
    static Identifier OBSIDIAN = MoreToolsAndArmor.id("obsidian");
    static Identifier DEEPSLATE_EMERALD = MoreToolsAndArmor.id("deepslate_emerald");
    static Identifier END_DIAMOND = MoreToolsAndArmor.id("end_diamond");
    static Identifier VOID = MoreToolsAndArmor.id("void");
    static Identifier ONETHDENDERITE = MoreToolsAndArmor.id("onethdenderite");

    public static void accept(BiConsumer<Identifier, EquipmentModel> equipmentModelBiConsumer) {
        equipmentModelBiConsumer.accept(COPPER, buildHumanoid("copper"));
        equipmentModelBiConsumer.accept(BUDDING_AMETHYST, buildHumanoid("budding_amethyst"));
        equipmentModelBiConsumer.accept(EMERALD, buildHumanoid("emerald"));
        equipmentModelBiConsumer.accept(OBSIDIAN, buildHumanoid("obsidian"));
        equipmentModelBiConsumer.accept(DEEPSLATE_EMERALD, buildHumanoid("deepslate_emerald"));
        equipmentModelBiConsumer.accept(END_DIAMOND, buildHumanoid("end_diamond"));
        equipmentModelBiConsumer.accept(VOID, buildHumanoid("void"));
        equipmentModelBiConsumer.accept(ONETHDENDERITE, buildHumanoid("onethdenderite"));
    }

    private static EquipmentModel buildHumanoid(String path) {
        return EquipmentModel.builder().addHumanoidLayers(MoreToolsAndArmor.id(path)).build();
    }
}
