package net.drammg.honkaicraft.item;

import net.drammg.honkaicraft.Honkaicraft;
import net.drammg.honkaicraft.item.custom.EightBallItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HONKAI_SHARD = registerItem( "honkai_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));
    public static final Item HONKAI_CUBE = registerItem( "honkai_cube",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item PHANTOM_BLUE_CRYSTALYTE = registerItem( "phantom_blue_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item PHANTOM_RED_CRYSTALYTE = registerItem( "phantom_red_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item PHANTOM_PURPLE_CRYSTALYTE = registerItem( "phantom_purple_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item PHANTOM_GREY_CRYSTALYTE = registerItem( "phantom_grey_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item TWILIGHT_BLUE_CRYSTALYTE = registerItem( "twilight_blue_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item TWILIGHT_RED_CRYSTALYTE = registerItem( "twilight_red_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item TWILIGHT_PURPLE_CRYSTALYTE = registerItem( "twilight_purple_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item TWILIGHT_GREY_CRYSTALYTE = registerItem( "twilight_grey_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item CHASMIC_BLUE_CRYSTALYTE = registerItem( "chasmic_blue_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item CHASMIC_RED_CRYSTALYTE = registerItem( "chasmic_red_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item CHASMIC_PURPLE_CRYSTALYTE = registerItem( "chasmic_purple_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item CHASMIC_GREY_CRYSTALYTE = registerItem( "chasmic_grey_crystalyte",
            new Item(new FabricItemSettings().group(ModItemGroup.HONKAIMATERIALS)));

    public static final Item EIGHT_BALL = registerItem( "eight_ball",
            new EightBallItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registry.ITEM, new Identifier(Honkaicraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Honkaicraft.LOGGER.debug("Register Mod Items for " + Honkaicraft.MOD_ID);
    }
}
