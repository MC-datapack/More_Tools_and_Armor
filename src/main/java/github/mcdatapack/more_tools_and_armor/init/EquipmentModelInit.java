package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentModels;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class EquipmentModelInit implements EquipmentModels {
    public static final Identifier COPPER = MoreToolsAndArmor.id("copper");
    public static final Identifier BUDDING_AMETHYST = MoreToolsAndArmor.id("budding_amethyst");
    public static final Identifier EMERALD = MoreToolsAndArmor.id("emerald");
    public static final Identifier OBSIDIAN = MoreToolsAndArmor.id("obsidian");
    public static final Identifier DEEPSLATE_EMERALD = MoreToolsAndArmor.id("deepslate_emerald");
    public static final Identifier END_DIAMOND = MoreToolsAndArmor.id("end_diamond");
    public static final Identifier VOID = MoreToolsAndArmor.id("void");
    public static final Identifier ONETHDENDERITE = MoreToolsAndArmor.id("onethdenderite");
    public static final Identifier OLED = MoreToolsAndArmor.id("oled");
    public static final Identifier ANCIENT = MoreToolsAndArmor.id("ancient");

    public static void accept(BiConsumer<Identifier, EquipmentModel> equipmentModelBiConsumer) {
        equipmentModelBiConsumer.accept(COPPER, buildHumanoid("copper"));
        equipmentModelBiConsumer.accept(BUDDING_AMETHYST, buildHumanoid("budding_amethyst"));
        equipmentModelBiConsumer.accept(EMERALD, buildHumanoid("emerald"));
        equipmentModelBiConsumer.accept(OBSIDIAN, buildHumanoid("obsidian"));
        equipmentModelBiConsumer.accept(DEEPSLATE_EMERALD, buildHumanoid("deepslate_emerald"));
        equipmentModelBiConsumer.accept(END_DIAMOND, buildHumanoid("end_diamond"));
        equipmentModelBiConsumer.accept(VOID, buildHumanoid("void"));
        equipmentModelBiConsumer.accept(ONETHDENDERITE, buildHumanoid("onethdenderite"));
        equipmentModelBiConsumer.accept(OLED, buildHumanoid("oled"));
        equipmentModelBiConsumer.accept(ANCIENT, buildHumanoid("ancient"));
    }

    private static EquipmentModel buildHumanoid(String path) {
        return EquipmentModel.builder().addHumanoidLayers(MoreToolsAndArmor.id(path)).build();
    }
}
