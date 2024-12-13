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

import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.DEEPSLATE_LAPIS_ORE;

public class BlockInit {
    private static final RegistryKey<Block> DEEPSLATE_EMERALD_BLOCK_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("deepslate_emerald_block"));
    private static final RegistryKey<Item> DEEPSLATE_EMERALD_BLOCK_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("deepslate_emerald_block"));
    public static final Block DEEPSLATE_EMERALD_BLOCK = registerWithItem("deepslate_emerald_block", new Block(AbstractBlock.Settings.create()
            .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 3600000F).registryKey(DEEPSLATE_EMERALD_BLOCK_k)),
            new Item.Settings().fireproof().maxCount(96).rarity(Rarity.EPIC).useBlockPrefixedTranslationKey().registryKey(DEEPSLATE_EMERALD_BLOCK_I));

    private static final RegistryKey<Block> END_DIAMOND_BLOCK_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_diamond_block"));
    private static final RegistryKey<Item> END_DIAMOND_BLOCK_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_block"));
    public static final Block END_DIAMOND_BLOCK = registerWithItem("end_diamond_block", new Block(AbstractBlock.Settings.create()
            .sounds(BlockSoundGroup.METAL).requiresTool().strength(15F, 36000000F).registryKey(END_DIAMOND_BLOCK_k)),
            new Item.Settings().fireproof().maxCount(96).rarity(Rarity.EPIC).useBlockPrefixedTranslationKey().registryKey(END_DIAMOND_BLOCK_I));

    private static final RegistryKey<Block> SCULK_EMERALD_BLOCK_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("sculk_emerald_block"));
    private static final RegistryKey<Item> SCULK_EMERALD_BLOCK_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("sculk_emerald_block"));
    public static final Block SCULK_EMERALD_BLOCK = registerWithItem("sculk_emerald_block", new Block(AbstractBlock.Settings.create()
            .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 36000000F).registryKey(SCULK_EMERALD_BLOCK_k)),
            new Item.Settings().fireproof().maxCount(96).rarity(Rarity.EPIC).useBlockPrefixedTranslationKey().registryKey(SCULK_EMERALD_BLOCK_I));

    private static final RegistryKey<Block> BLACKSTONE_EMERALD_BLOCK_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("blackstone_emerald_block"));
    private static final RegistryKey<Item> BLACKSTONE_EMERALD_BLOCK_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("blackstone_emerald_block"));
    public static final Block BLACKSTONE_EMERALD_BLOCK = registerWithItem("blackstone_emerald_block", new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 36000000F).registryKey(BLACKSTONE_EMERALD_BLOCK_k)),
            new Item.Settings().fireproof().maxCount(96).rarity(Rarity.EPIC).useBlockPrefixedTranslationKey().registryKey(BLACKSTONE_EMERALD_BLOCK_I));

    private static final RegistryKey<Block> END_EMERALD_BLOCK_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_emerald_block"));
    private static final RegistryKey<Item> END_EMERALD_BLOCK_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_emerald_block"));
    public static final Block END_EMERALD_BLOCK = registerWithItem("end_emerald_block", new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.METAL).instrument(NoteBlockInstrument.BIT).requiresTool().strength(25F, 36000000F).registryKey(END_EMERALD_BLOCK_k)),
            new Item.Settings().fireproof().maxCount(96).rarity(Rarity.EPIC).useBlockPrefixedTranslationKey().registryKey(END_EMERALD_BLOCK_I));


    private static final RegistryKey<Block> END_COAL_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_coal_ore"));
    private static final RegistryKey<Item> END_COAL_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_coal_ore"));
    public static final Block END_COAL_ORE = registerWithItem("end_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 3),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE).sounds(BlockSoundGroup.STONE).registryKey(END_COAL_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_COAL_ORE_I));
    private static final RegistryKey<Block> END_COPPER_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_copper_ore"));
    private static final RegistryKey<Item> END_COPPER_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_copper_ore"));
    public static final Block END_COPPER_ORE = registerWithItem("end_copper_ore", new Block(copy(Blocks.DEEPSLATE_COPPER_ORE)
            .registryKey(END_COPPER_ORE_k)), new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_COPPER_ORE_I));
    private static final RegistryKey<Block> END_IRON_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_iron_ore"));
    private static final RegistryKey<Item> END_IRON_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_iron_ore"));
    public static final Block END_IRON_ORE = registerWithItem("end_iron_ore", new Block(copy(Blocks.DEEPSLATE_IRON_ORE)
            .registryKey(END_IRON_ORE_k)), new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_IRON_ORE_I));
    private static final RegistryKey<Block> END_GOLD_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_gold_ore"));
    private static final RegistryKey<Item> END_GOLD_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_gold_ore"));
    public static final Block END_GOLD_ORE = registerWithItem("end_gold_ore", new Block(copy(Blocks.DEEPSLATE_GOLD_ORE)
            .registryKey(END_GOLD_ORE_k)), new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_GOLD_ORE_I));
    private static final RegistryKey<Block> END_LAPIS_LAZULI_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_lapis_lazuli_ore"));
    private static final RegistryKey<Item> END_LAPIS_LAZULI_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_lapis_lazuli_ore"));
    public static final Block END_LAPIS_LAZULI_ORE = registerWithItem("end_lapis_lazuli_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 8),
                    AbstractBlock.Settings.copy(DEEPSLATE_LAPIS_ORE).sounds(BlockSoundGroup.STONE).registryKey(END_LAPIS_LAZULI_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_LAPIS_LAZULI_ORE_I));
    private static final RegistryKey<Block> END_EMERALD_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_emerald_ore"));
    private static final RegistryKey<Item> END_EMERALD_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_emerald_ore"));
    public static final Block END_EMERALD_ORE = registerWithItem("end_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE).sounds(BlockSoundGroup.STONE).registryKey(END_EMERALD_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_EMERALD_ORE_I));
    private static final RegistryKey<Block> END_REDSTONE_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_redstone_ore"));
    private static final RegistryKey<Item> END_REDSTONE_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_redstone_ore"));
    public static final Block END_REDSTONE_ORE = registerWithItem("end_redstone_ore",
            new RedstoneOreBlock(copy(Blocks.DEEPSLATE_REDSTONE_ORE).sounds(BlockSoundGroup.STONE).registryKey(END_REDSTONE_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_REDSTONE_ORE_I));
    private static final RegistryKey<Block> END_DIAMOND_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("end_diamond_ore"));
    private static final RegistryKey<Item> END_DIAMOND_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("end_diamond_ore"));
    public static final Block END_DIAMOND_ORE = registerWithItem("end_diamond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).sounds(BlockSoundGroup.STONE).registryKey(END_DIAMOND_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().registryKey(END_DIAMOND_ORE_I));
    private static final RegistryKey<Block> SCULK_EMERALD_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("sculk_emerald_ore"));
    private static final RegistryKey<Item> SCULK_EMERALD_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("sculk_emerald_ore"));
    public static final Block SCULK_EMERALD_ORE = registerWithItem("sculk_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE).sounds(BlockSoundGroup.STONE).registryKey(SCULK_EMERALD_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().useBlockPrefixedTranslationKey().registryKey(SCULK_EMERALD_ORE_I));
    private static final RegistryKey<Block> BLACKSTONE_EMERALD_ORE_k = RegistryKey.of(RegistryKeys.BLOCK, MoreToolsAndArmor.id("blackstone_emerald_ore"));
    private static final RegistryKey<Item> BLACKSTONE_EMERALD_ORE_I = RegistryKey.of(RegistryKeys.ITEM, MoreToolsAndArmor.id("blackstone_emerald_ore"));
    public static final Block BLACKSTONE_EMERALD_ORE = registerWithItem("blackstone_emerald_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE).sounds(BlockSoundGroup.STONE).registryKey(BLACKSTONE_EMERALD_ORE_k)),
            new Item.Settings().useBlockPrefixedTranslationKey().useBlockPrefixedTranslationKey().registryKey(BLACKSTONE_EMERALD_ORE_I));



    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, MoreToolsAndArmor.id(name), block);
    }

    public static  <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static void load() {}
}
