package fr.infernium.com.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.infernium.com.Reference;
import fr.infernium.com.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockMod
{
	public static Block platine_block;
	public static Block nitronium_block;
    public static Block platine_ore;
    public static Block angelic_ore;
    public static Block infernium_ore;
    public static Block cave_block;
    public static Block infernium_block;
    public static Block nitronium_ore;
    
    public static void init()
    {
    	platine_block = new BlockBase(Material.iron, 1).setBlockName("platine_block").setBlockTextureName(Reference.MOD_ID + ":platine_block").setCreativeTab(CreativeTabs.tabMisc).setHardness(4.0f).setResistance(30.0f);
    	nitronium_block = new BlockBase(Material.iron, 1).setBlockName("nitronium_block").setBlockTextureName(Reference.MOD_ID + ":nitronium_block").setCreativeTab(CreativeTabs.tabMisc).setHardness(4.0f).setResistance(30.0f);
        platine_ore = new BlockBase(Material.rock, 1).setBlockName("platine_ore").setBlockTextureName(Reference.MOD_ID + ":platine_ore").setCreativeTab(CreativeTabs.tabMisc).setHardness(4.0f).setResistance(30.0f);
        angelic_ore = new BlockBase(Material.rock, 3).setBlockName("angelic_ore").setBlockTextureName(Reference.MOD_ID + ":angelic_ore").setCreativeTab(CreativeTabs.tabMisc).setHardness(6.0f).setResistance(50.0f);
        nitronium_ore = new BlockBase(Material.rock, 1).setBlockName("nitronium_ore").setBlockTextureName(Reference.MOD_ID + ":nitronium_ore").setCreativeTab(CreativeTabs.tabMisc).setHardness(4.0f).setResistance(30.0f);
        infernium_ore = new BlockBase(Material.rock, 3).setBlockName("infernium_ore").setBlockTextureName(Reference.MOD_ID + ":infernium_ore").setCreativeTab(CreativeTabs.tabMisc).setHardness(5.0f).setResistance(50.0f);
        infernium_block = new BlockBase(Material.iron, 3).setBlockName("infernium_block").setBlockTextureName(Reference.MOD_ID + ":infernium_block").setCreativeTab(CreativeTabs.tabMisc).setHardness(5.0f).setResistance(50.0f);
        cave_block = new BlockBase(Material.glass, 1).setBlockName("cave_block").setBlockTextureName(Reference.MOD_ID + ":cave_block").setCreativeTab(CreativeTabs.tabMisc).setBlockTextureName(Reference.MOD_ID + ":cave_block").setHardness(3.0f).setResistance(3.0f).setStepSound(Block.soundTypeGlass);
    }
    
    public static void register()
    {
    	GameRegistry.registerBlock(platine_block, platine_block.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(nitronium_block, nitronium_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(platine_ore, platine_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(angelic_ore, angelic_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(nitronium_ore, nitronium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(infernium_ore, infernium_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cave_block, cave_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(infernium_block, infernium_block.getUnlocalizedName().substring(5));    
    }
}
   

