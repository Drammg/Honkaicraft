package net.drammg.honkaicraft.item;

import net.drammg.honkaicraft.Honkaicraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup HONKAIMATERIALS = FabricItemGroupBuilder.build(
            new Identifier(Honkaicraft.MOD_ID, "honkai_materials"), ()->new ItemStack(ModItems.HONKAI_CUBE));

}
