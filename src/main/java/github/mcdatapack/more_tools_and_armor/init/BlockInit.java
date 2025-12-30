package github.mcdatapack.more_tools_and_armor.init;

import github.mcdatapack.more_tools_and_armor.MoreToolsAndArmor;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Consumer;
import java.util.function.Function;

import static net.minecraft.block.AbstractBlock.Settings.*;
import static net.minecraft.block.Blocks.DEEPSLATE_LAPIS_ORE;

public class BlockInit {
    public static final HoneyBlock ANCIENT_HONEY_BLOCK = registerWithItem("ancient_honey_block", settings -> new HoneyBlock(
            settings.mapColor(MapColor.ORANGE).velocityMultiplier(0.4F)
                    .jumpVelocityMultiplier(0.5F).nonOpaque().sounds(BlockSoundGroup.HONEY)));


    public static final Block DEEPSLATE_EMERALD_BLOCK = registerWithItem("deepslate_emerald_block", settings -> new Block(settings
            .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 3600000F)),
            settings -> settings.fireproof().maxCount(96).rarity(Rarity.EPIC));
    public static final Block END_DIAMOND_BLOCK = registerWithItem("end_diamond_block", settings -> new Block(settings
            .sounds(BlockSoundGroup.METAL).requiresTool().strength(15F, 36000000F)),
            settings -> settings.fireproof().maxCount(96).rarity(Rarity.EPIC));
    public static final Block SCULK_EMERALD_BLOCK = registerWithItem("sculk_emerald_block", settings ->  new Block(settings
             .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 36000000F)),
            settings -> settings.fireproof().maxCount(96).rarity(Rarity.EPIC));
    public static final Block BLACKSTONE_EMERALD_BLOCK = registerWithItem("blackstone_emerald_block", settings -> new Block(settings
                    .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 36000000F)),
            settings -> settings.fireproof().maxCount(96).rarity(Rarity.EPIC));
    public static final Block END_EMERALD_BLOCK = registerWithItem("end_emerald_block", settings -> new Block(settings
            .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 36000000F)),
            settings -> settings.fireproof().maxCount(96).rarity(Rarity.EPIC));


    public static final ExperienceDroppingBlock END_COAL_ORE = registerWithItem("end_coal_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(2, 3),
                    settings.strength(4.5f, 3)));
    public static final Block END_COPPER_ORE = registerWithItem("end_copper_ore", settings -> new Block(settings.strength(4.5f, 3)));
    public static final Block END_IRON_ORE = registerWithItem("end_iron_ore", settings -> new Block(settings.strength(4.5f, 3)));
    public static final Block END_GOLD_ORE = registerWithItem("end_gold_ore", settings -> new Block(settings.strength(4.5f, 3)));
    public static final ExperienceDroppingBlock END_LAPIS_LAZULI_ORE = registerWithItem("end_lapis_lazuli_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3, 8),
                    settings.strength(4.5f, 3).sounds(BlockSoundGroup.STONE)));
    public static final ExperienceDroppingBlock END_EMERALD_ORE = registerWithItem("end_emerald_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    settings.strength(4.5f, 3).sounds(BlockSoundGroup.STONE)));
    public static final RedstoneOreBlock END_REDSTONE_ORE = registerWithItem("end_redstone_ore",
            settings -> new RedstoneOreBlock(settings.strength(4.5f, 3).sounds(BlockSoundGroup.STONE)));
    public static final ExperienceDroppingBlock END_DIAMOND_ORE = registerWithItem("end_diamond_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    settings.strength(4.5f, 3).sounds(BlockSoundGroup.STONE)));
    public static final ExperienceDroppingBlock SCULK_EMERALD_ORE = registerWithItem("sculk_emerald_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    settings.strength(4.5f, 3).sounds(BlockSoundGroup.STONE)));
    public static final ExperienceDroppingBlock BLACKSTONE_EMERALD_ORE = registerWithItem("blackstone_emerald_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    settings.strength(4.5f, 3).sounds(BlockSoundGroup.STONE)));


    public static final ExperienceDroppingBlock OVERWORLD_UNSTABLE_ORE = registerWithItem("overworld_unstable_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(25, 100), settings
                    .strength(15, 20000)
                    .sounds(BlockSoundGroup.TUFF)
                    .requiresTool()));
    public static final ExperienceDroppingBlock NETHER_UNSTABLE_ORE = registerWithItem("nether_unstable_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(25, 100), settings
                    .strength(15, 20000)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()));
    public static final ExperienceDroppingBlock END_UNSTABLE_ORE = registerWithItem("end_unstable_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(25, 100), settings
                    .strength(15, 20000)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));


    public static <T extends Block> T register(String name, Function<AbstractBlock.Settings, T> block) {
        return Registry.register(Registries.BLOCK, MoreToolsAndArmor.id(name), 
                block.apply(create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id(name)))));
    }

    public static  <T extends Block> T registerWithItem(String name, Function<AbstractBlock.Settings, T> block, Function<Item.Settings, Item.Settings> setting) {
        T registered = register(name, block);
        ItemInit.register(name, settings -> new BlockItem(registered, setting.apply(settings).useBlockPrefixedTranslationKey()));
        return registered;
    }
    public static <T extends Block> T registerWithItem(String name, Function<AbstractBlock.Settings, T> block) {
        return registerWithItem(name, block, settings -> settings);
    }

    public static void load() {}
}
