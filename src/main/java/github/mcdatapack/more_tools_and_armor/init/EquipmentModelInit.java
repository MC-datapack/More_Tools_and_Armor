package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public interface EquipmentModelInit {
    Identifier COAL = MoreToolsAndArmor.id("coal");
    Identifier COPPER = MoreToolsAndArmor.id("copper");
    Identifier LAPIS = MoreToolsAndArmor.id("lapis");
    Identifier BUDDING_AMETHYST = MoreToolsAndArmor.id("budding_amethyst");
    Identifier EMERALD = MoreToolsAndArmor.id("emerald");
    Identifier REDSTONE = MoreToolsAndArmor.id("redstone");
    Identifier OBSIDIAN = MoreToolsAndArmor.id("obsidian");
    Identifier DEEPSLATE_EMERALD = MoreToolsAndArmor.id("deepslate_emerald");
    Identifier END_DIAMOND = MoreToolsAndArmor.id("end_diamond");
    Identifier VOID = MoreToolsAndArmor.id("void");
    Identifier ONETHDENDERITE = MoreToolsAndArmor.id("onethdenderite");
    Identifier OLED = MoreToolsAndArmor.id("oled");
    Identifier ANCIENT = MoreToolsAndArmor.id("ancient");

    static void bootstrap(BiConsumer<Identifier, EquipmentModel> equipmentModelBiConsumer) {
        equipmentModelBiConsumer.accept(COAL, buildHumanoid(COAL));
        equipmentModelBiConsumer.accept(COPPER, buildHumanoid(COPPER));
        equipmentModelBiConsumer.accept(LAPIS, buildHumanoid(LAPIS));
        equipmentModelBiConsumer.accept(BUDDING_AMETHYST, buildHumanoid(BUDDING_AMETHYST));
        equipmentModelBiConsumer.accept(EMERALD, buildHumanoid(EMERALD));
        equipmentModelBiConsumer.accept(REDSTONE, buildHumanoid(REDSTONE));
        equipmentModelBiConsumer.accept(OBSIDIAN, buildHumanoid(OBSIDIAN));
        equipmentModelBiConsumer.accept(DEEPSLATE_EMERALD, buildHumanoid(DEEPSLATE_EMERALD));
        equipmentModelBiConsumer.accept(VOID, buildHumanoid(VOID));
        equipmentModelBiConsumer.accept(ONETHDENDERITE, buildHumanoid(ONETHDENDERITE));
        equipmentModelBiConsumer.accept(OLED, buildHumanoid(OLED));
        equipmentModelBiConsumer.accept(ANCIENT, buildHumanoid(ANCIENT));
    }

    private static EquipmentModel buildHumanoid(Identifier path) {
        return EquipmentModel.builder().addHumanoidLayers(path).build();
    }
}
