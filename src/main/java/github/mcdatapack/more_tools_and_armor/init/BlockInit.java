package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import java.util.function.Function;

public class BlockInit {
    public static final HoneyBlock ANCIENT_HONEY_BLOCK = registerWithItem("ancient_honey_block", settings -> new HoneyBlock(
            settings.mapColor(DyeColor.ORANGE).speedFactor(0.4F)
                    .jumpFactor(0.5F).noCollision().sound(SoundType.HONEY_BLOCK)));


    public static final Block DEEPSLATE_EMERALD_BLOCK = registerWithItem("deepslate_emerald_block", settings -> new Block(settings
            .sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(25F, 3600000F)),
            settings -> settings.fireResistant().stacksTo(96).rarity(Rarity.EPIC));
    public static final Block END_DIAMOND_BLOCK = registerWithItem("end_diamond_block", settings -> new Block(settings
            .sound(SoundType.METAL).requiresCorrectToolForDrops().strength(15F, 36000000F)),
            settings -> settings.fireResistant().stacksTo(96).rarity(Rarity.EPIC));
    public static final Block SCULK_EMERALD_BLOCK = registerWithItem("sculk_emerald_block", settings ->  new Block(settings
             .sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(25F, 36000000F)),
            settings -> settings.fireResistant().stacksTo(96).rarity(Rarity.EPIC));
    public static final Block BLACKSTONE_EMERALD_BLOCK = registerWithItem("blackstone_emerald_block", settings -> new Block(settings
                    .sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(25F, 36000000F)),
            settings -> settings.fireResistant().stacksTo(96).rarity(Rarity.EPIC));
    public static final Block END_EMERALD_BLOCK = registerWithItem("end_emerald_block", settings -> new Block(settings
            .sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT).requiresCorrectToolForDrops().strength(25F, 36000000F)),
            settings -> settings.fireResistant().stacksTo(96).rarity(Rarity.EPIC));


    public static final DropExperienceBlock END_COAL_ORE = registerWithItem("end_coal_ore",
            settings -> new DropExperienceBlock(UniformInt.of(2, 3),
                    settings.strength(4.5f, 3).requiresCorrectToolForDrops()));
    public static final Block END_COPPER_ORE = registerWithItem("end_copper_ore", settings -> new Block(settings.strength(4.5f, 3).requiresCorrectToolForDrops()));
    public static final Block END_IRON_ORE = registerWithItem("end_iron_ore", settings -> new Block(settings.strength(4.5f, 3).requiresCorrectToolForDrops()));
    public static final Block END_GOLD_ORE = registerWithItem("end_gold_ore", settings -> new Block(settings.strength(4.5f, 3).requiresCorrectToolForDrops()));
    public static final DropExperienceBlock END_LAPIS_LAZULI_ORE = registerWithItem("end_lapis_lazuli_ore",
            settings -> new DropExperienceBlock(UniformInt.of(3, 8),
                    settings.strength(4.5f, 3).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DropExperienceBlock END_EMERALD_ORE = registerWithItem("end_emerald_ore",
            settings -> new DropExperienceBlock(UniformInt.of(5, 10),
                    settings.strength(4.5f, 3).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RedStoneOreBlock END_REDSTONE_ORE = registerWithItem("end_redstone_ore",
            settings -> new RedStoneOreBlock(settings.strength(4.5f, 3).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DropExperienceBlock END_DIAMOND_ORE = registerWithItem("end_diamond_ore",
            settings -> new DropExperienceBlock(UniformInt.of(5, 10),
                    settings.strength(4.5f, 3).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DropExperienceBlock SCULK_EMERALD_ORE = registerWithItem("sculk_emerald_ore",
            settings -> new DropExperienceBlock(UniformInt.of(5, 10),
                    settings.strength(4.5f, 3).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DropExperienceBlock BLACKSTONE_EMERALD_ORE = registerWithItem("blackstone_emerald_ore",
            settings -> new DropExperienceBlock(UniformInt.of(5, 10),
                    settings.strength(4.5f, 3).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    public static final DropExperienceBlock OVERWORLD_UNSTABLE_ORE = registerWithItem("overworld_unstable_ore",
            settings -> new DropExperienceBlock(UniformInt.of(25, 100), settings
                    .strength(15, 20000)
                    .sound(SoundType.TUFF)
                    .requiresCorrectToolForDrops()));
    public static final DropExperienceBlock NETHER_UNSTABLE_ORE = registerWithItem("nether_unstable_ore",
            settings -> new DropExperienceBlock(UniformInt.of(25, 100), settings
                    .strength(15, 20000)
                    .sound(SoundType.BASALT)
                    .requiresCorrectToolForDrops()));
    public static final DropExperienceBlock END_UNSTABLE_ORE = registerWithItem("end_unstable_ore",
            settings -> new DropExperienceBlock(UniformInt.of(25, 100), settings
                    .strength(15, 20000)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));


    public static <T extends Block> T register(String name, Function<BlockBehaviour.Properties, T> block) {
        return Registry.register(BuiltInRegistries.BLOCK, MoreToolsAndArmor.id(name),
                block.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, MoreToolsAndArmor.id(name)))));
    }

    public static  <T extends Block> T registerWithItem(String name, Function<BlockBehaviour.Properties, T> block, Function<Item.Properties, Item.Properties> setting) {
        T registered = register(name, block);
        ItemInit.register(name, settings -> new BlockItem(registered, setting.apply(settings).useBlockDescriptionPrefix()));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, Function<BlockBehaviour.Properties, T> block) {
        return registerWithItem(name, block, settings -> settings);
    }

    public static void load() {}
}
