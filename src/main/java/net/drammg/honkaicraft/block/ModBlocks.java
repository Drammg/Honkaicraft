package net.drammg.honkaicraft.block;

import net.drammg.honkaicraft.Honkaicraft;
import net.drammg.honkaicraft.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BLUE_CRYSTALYTE_ORE = registerBlock("blue_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block DEEPSLATE_BLUE_CRYSTALYTE_ORE = registerBlock("deepslate_blue_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block RED_CRYSTALYTE_ORE = registerBlock("red_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block DEEPSLATE_RED_CRYSTALYTE_ORE = registerBlock("deepslate_red_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block PURPLE_CRYSTALYTE_ORE = registerBlock("purple_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block DEEPSLATE_PURPLE_CRYSTALYTE_ORE = registerBlock("deepslate_purple_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block GREY_CRYSTALYTE_ORE = registerBlock("grey_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);

    public static final Block DEEPSLATE_GREY_CRYSTALYTE_ORE = registerBlock("deepslate_grey_crystalyte_ore",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(7),
                    UniformIntProvider.create(4,8)), ModItemGroup.HONKAIMATERIALS);


    public static Block registerBlock(String name, Block block, ItemGroup tab){

        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Honkaicraft.MOD_ID, name),block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){

        return Registry.register(Registry.ITEM, new Identifier(Honkaicraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));

    }

    public static void registerModBlocks() {

        Honkaicraft.LOGGER.debug("Registering ModBlocks for " + Honkaicraft.MOD_ID);
    }
}
