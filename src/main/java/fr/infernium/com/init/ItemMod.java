package fr.infernium.com.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.infernium.com.Reference;
import fr.infernium.com.init.Items.ItemUnclaim;
import fr.infernium.com.init.armorset.ItemInferArmor;
import fr.infernium.com.init.armorset.ItemNitroniumArmor;
import fr.infernium.com.init.armorset.ItemParaArmor;
import fr.infernium.com.init.armorset.ItemPlatineArmor;
import fr.infernium.com.items.ItemAdminKillCommand;
import fr.infernium.com.items.ItemIferShovel;
import fr.infernium.com.items.ItemInferAxe;
import fr.infernium.com.items.ItemInferPickaxe;
import fr.infernium.com.items.ItemInferSword;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
    public static ToolMaterial admintool = EnumHelper.addToolMaterial("admintool", 10, 2000000000, 20000.0f, 20000.0f, 0);
    public static ToolMaterial specialtool = EnumHelper.addToolMaterial("specialtool", 3, 2000, 8.0f, 6.0f, 0);
    public static ToolMaterial paradiumtool = EnumHelper.addToolMaterial("paradiumtool", 4, 3000, 20.0f, 8.0f, 25);
    public static ToolMaterial platinetool = EnumHelper.addToolMaterial("platinetool", 3, 3000, 10.0f, 6.0f, 10);
    public static ToolMaterial inferniumtool = EnumHelper.addToolMaterial("infernium", 4, 2000, 15.0f, 6.0f, 12);
    
    public static Item unclaim_finder;
    public static Item platine_stick, platine_mechanism;
    public static Item infernium_stick, infernium_core, compressed_infernium;
    public static Item killsword;
    public static Item paradium_nuggets;
    public static Item paradium_ingot, paradium_helmet, paradium_chestplate, paradium_leggings, paradium_boots, paradium_sword, paradium_pickaxe, paradium_axe, paradium_shovel;
    public static Item infernium_coal;
    public static Item angelic;
    public static Item nitronium_ingot, nitronium_helmet, nitronium_chestplate, nitronium_leggings, nitronium_boots;
    public static Item platine_ingot, platine_helmet, platine_chestplate, platine_leggings, platine_boots, platine_sword, platine_pickaxe, platine_axe, platine_shovel;
    public static Item infernium_ingot, infernium_helmet, infernium_chestplate, infernium_leggings, infernium_boots, infernium_sword, infernium_pickaxe, infernium_axe, infernium_shovel;
    
    public static ArmorMaterial platine = EnumHelper.addArmorMaterial("platine", 3000, new int[] {2, 7, 5, 2}, 10);
    public static ArmorMaterial nitronium = EnumHelper.addArmorMaterial("nitronium", 190, new int[] {2, 8, 6, 2}, 0);
    public static ArmorMaterial paradium = EnumHelper.addArmorMaterial("paradium", 2000, new int[] {4, 10, 7, 4}, 25);
    public static ArmorMaterial infernium = EnumHelper.addArmorMaterial("infernium", 1500, new int[] {3, 9, 6, 3}, 10);
    
    public static void init()
    {
        compressed_infernium = new Item().setUnlocalizedName("compressed_infernium").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":compressed_infernium");
        platine_mechanism = new Item().setUnlocalizedName("platine_mechanism").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":platine_mechanism");
        infernium_core = new Item().setUnlocalizedName("infernium_core").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":infernium_core");
        platine_stick = new Item().setUnlocalizedName("platine_stick").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":platine_stick");
        infernium_stick = new Item().setUnlocalizedName("infernium_stick").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":infernium_stick");
        killsword = new ItemAdminKillCommand(ItemMod.admintool).setUnlocalizedName("killsword").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":killsword");
        paradium_shovel = new ItemIferShovel(ItemMod.paradiumtool).setUnlocalizedName("paradium_shovel").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":paradium_shovel");
        paradium_axe = new ItemInferAxe(ItemMod.paradiumtool).setUnlocalizedName("paradium_axe").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":paradium_axe");
        paradium_pickaxe = new ItemInferPickaxe(ItemMod.paradiumtool).setUnlocalizedName("paradium_pickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":paradium_pickaxe");
        paradium_sword = new ItemInferSword(ItemMod.paradiumtool).setUnlocalizedName("paradium_sword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":paradium_sword");
        platine_shovel = new ItemIferShovel(ItemMod.platinetool).setUnlocalizedName("platine_shovel").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":platine_shovel");
        platine_axe = new ItemInferAxe(ItemMod.platinetool).setUnlocalizedName("platine_axe").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":platine_axe");
        platine_pickaxe = new ItemInferPickaxe(ItemMod.platinetool).setUnlocalizedName("platine_pickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":platine_pickaxe");
        platine_sword = new ItemInferSword(ItemMod.platinetool).setUnlocalizedName("platine_sword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":platine_sword");
        infernium_shovel = new ItemIferShovel(ItemMod.inferniumtool).setUnlocalizedName("infernium_shovel").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":infernium_shovel");
        infernium_axe = new ItemInferAxe(ItemMod.inferniumtool).setUnlocalizedName("infernium_axe").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":infernium_axe");
        infernium_pickaxe = new ItemInferPickaxe(ItemMod.inferniumtool).setUnlocalizedName("infernium_pickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":infernium_pickaxe");
        infernium_sword = new ItemInferSword(ItemMod.inferniumtool).setUnlocalizedName("infernium_sword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":infernium_sword");
        platine_boots = new ItemPlatineArmor(platine, 3).setUnlocalizedName("platine_boots").setTextureName(Reference.MOD_ID + ":platine_boots");
        platine_leggings = new ItemPlatineArmor(platine, 2).setUnlocalizedName("platine_leggings").setTextureName(Reference.MOD_ID + ":platine_leggings");
        platine_chestplate = new ItemPlatineArmor(platine, 1).setUnlocalizedName("platine_chestplate ").setTextureName(Reference.MOD_ID + ":platine_chestplate");
        platine_helmet = new ItemPlatineArmor(platine, 0).setUnlocalizedName("platine_helmet").setTextureName(Reference.MOD_ID + ":platine_helmet");
        nitronium_boots = new ItemNitroniumArmor(nitronium, 3).setUnlocalizedName("nitronium_boots").setTextureName(Reference.MOD_ID + ":nitronium_boots");
        nitronium_leggings = new ItemNitroniumArmor(nitronium, 2).setUnlocalizedName("nitronium_leggings").setTextureName(Reference.MOD_ID + ":nitronium_leggings");
        nitronium_chestplate = new ItemNitroniumArmor(nitronium, 1).setUnlocalizedName("nitronium_chestplate").setTextureName(Reference.MOD_ID + ":nitronium_chestplate");
        nitronium_helmet = new ItemNitroniumArmor(nitronium, 0).setUnlocalizedName("nitronium_helmet").setTextureName(Reference.MOD_ID + ":nitronium_helmet");
        paradium_boots = new ItemParaArmor(paradium, 3).setUnlocalizedName("paradium_boots").setTextureName(Reference.MOD_ID + ":paradium_boots");
        paradium_leggings = new ItemParaArmor(paradium, 2).setUnlocalizedName("paradium_leggings").setTextureName(Reference.MOD_ID + ":paradium_leggings");
        paradium_chestplate = new ItemParaArmor(paradium, 1).setUnlocalizedName("paradium_chestplate").setTextureName(Reference.MOD_ID + ":paradium_chestplate");
        paradium_helmet = new ItemParaArmor(paradium, 0).setUnlocalizedName("paradium_helmet").setTextureName(Reference.MOD_ID + ":paradium_helmet");
        paradium_nuggets = new Item().setUnlocalizedName("paradium_nuggets").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":paradium_nuggets");
        paradium_ingot = new Item().setUnlocalizedName("paradium_ingot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":paradium_ingot");        
        infernium_leggings = new ItemInferArmor(infernium, 2).setUnlocalizedName("infernium_leggings").setTextureName(Reference.MOD_ID + ":infernium_leggings");
        infernium_boots = new ItemInferArmor(infernium, 3).setUnlocalizedName("infernium_boots").setTextureName(Reference.MOD_ID + ":infernium_boots");
        infernium_chestplate = new ItemInferArmor(infernium, 1).setUnlocalizedName("infernium_chestplate").setTextureName(Reference.MOD_ID + ":infernium_chestplate");
        infernium_helmet = new ItemInferArmor(infernium, 0).setUnlocalizedName("infernium_helmet").setTextureName(Reference.MOD_ID + ":infernium_helmet");
        infernium_coal = new Item().setUnlocalizedName("infernium_coal").setTextureName(Reference.MOD_ID + ":raw_infernium_nuggets").setCreativeTab(CreativeTabs.tabMisc);
        angelic = new Item().setUnlocalizedName("angelic").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":angelic");
        nitronium_ingot = new Item().setUnlocalizedName("nitronium_ingot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":nitronium_ingot");
        platine_ingot = new Item().setUnlocalizedName("platine_ingot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":platine_ingot");
        infernium_ingot = new Item().setUnlocalizedName("infernium_ingot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":infernium_ingot");        
    }
    
    public static void register()
    {
        GameRegistry.registerItem(platine_mechanism, "platine mechanism");
        GameRegistry.registerItem(infernium_core, "infernium_core");
        GameRegistry.registerItem(infernium_stick, "infernium_stick");
        GameRegistry.registerItem(platine_stick, "platine_stick");
        GameRegistry.registerItem(killsword, "killsword");
        GameRegistry.registerItem(paradium_shovel, "paradium_shovel");
        GameRegistry.registerItem(paradium_axe, "paradium_axe");
        GameRegistry.registerItem(paradium_pickaxe, "paradium_pickaxe");
        GameRegistry.registerItem(paradium_sword, "paradium_sword");
        GameRegistry.registerItem(platine_shovel, "platines_shovel");
        GameRegistry.registerItem(platine_axe, "platine_axe");
        GameRegistry.registerItem(platine_pickaxe, "platine_pickaxe");
        GameRegistry.registerItem(platine_sword, "platine_sword");
        GameRegistry.registerItem(infernium_shovel, "infernium_shovel");
        GameRegistry.registerItem(infernium_axe, "infernium_axe");
        GameRegistry.registerItem(infernium_pickaxe, "infernium_pickaxe");
        GameRegistry.registerItem(infernium_sword, "infernium_sword");
        GameRegistry.registerItem(platine_boots, "platine_boots");
        GameRegistry.registerItem(platine_leggings, "platine_leggings");
        GameRegistry.registerItem(platine_chestplate, "platine_chestplate");
        GameRegistry.registerItem(platine_helmet, "platine_helmet");
        GameRegistry.registerItem(nitronium_boots, "nitronium_boots");
        GameRegistry.registerItem(nitronium_leggings, "nitronium_leggings");
        GameRegistry.registerItem(nitronium_chestplate, "nitronium_chestplate");
        GameRegistry.registerItem(nitronium_helmet, "nitronium_helmet");
        GameRegistry.registerItem(paradium_boots, "paradium_boots");
        GameRegistry.registerItem(paradium_leggings, "paradium_leggings");
        GameRegistry.registerItem(paradium_chestplate, "paradium_chestplate");
        GameRegistry.registerItem(paradium_helmet, "paradium_helmet");
        GameRegistry.registerItem(paradium_nuggets, "paradium_nuggets");
        GameRegistry.registerItem(paradium_ingot, "paradium_ingot");
        GameRegistry.registerItem(infernium_boots, "infernium_boots");
        GameRegistry.registerItem(infernium_leggings, "infernium_leggings");
        GameRegistry.registerItem(infernium_chestplate, "infernium_chestplate");
        GameRegistry.registerItem(infernium_helmet, "infernium_helmet");
        GameRegistry.registerItem(infernium_coal, "infernium_coal");
        GameRegistry.registerItem(angelic, "angelic");
        GameRegistry.registerItem(nitronium_ingot, "nitronium_ingot");
        GameRegistry.registerItem(platine_ingot, "platine_ingot");
        GameRegistry.registerItem(infernium_ingot, "infernium ingot"); 
        //Recipe

   	    GameRegistry.addRecipe(new ItemStack(BlockMod.platine_block, 1), new Object[] {"XXX", "XXX", "XXX", 'X' , ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(BlockMod.infernium_block, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemMod.infernium_ingot});
        GameRegistry.addSmelting(BlockMod.platine_ore, new ItemStack(ItemMod.platine_ingot, 1), 5);
        GameRegistry.addSmelting(BlockMod.nitronium_ore, new ItemStack(ItemMod.nitronium_ingot, 1), 6);
        GameRegistry.addSmelting(BlockMod.infernium_ore, new ItemStack(ItemMod.infernium_ingot, 1), 7);
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_helmet, 1), new Object[] {"XXX", "X X", 'X', ItemMod.infernium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_leggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ItemMod.infernium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_chestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ItemMod.infernium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_boots, 1), new Object[] {"   ", "X X", "X X", 'X', ItemMod.infernium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_helmet, 1), new Object[] {"XXX", "X X", 'X', ItemMod.paradium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_leggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ItemMod.paradium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_chestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ItemMod.paradium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_boots, 1), new Object[] {"   ", "X X", "X X", 'X', ItemMod.paradium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nitronium_helmet, 1), new Object[] {"XXX", "X X", 'X', ItemMod.nitronium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nitronium_leggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ItemMod.nitronium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nitronium_chestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ItemMod.nitronium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.nitronium_boots, 1), new Object[] {"   ", "X X", "X X", 'X', ItemMod.nitronium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_helmet, 1), new Object[] {"XXX", "X X", "   ", 'X', ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_leggings, 1), new Object[] {"XXX", "X X", "X X", 'X', ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_chestplate, 1), new Object[] {"X X", "XXX", "XXX", 'X', ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_boots, 1), new Object[] {"   ", "X X", "X X", 'X', ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_ingot, 1), new Object[] {"XXX", "XXX", "XXX", 'X', ItemMod.paradium_nuggets});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_sword, 1), new Object[] {" X ", " X ", " Y ", 'X', ItemMod.infernium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_pickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ItemMod.infernium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_shovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ItemMod.infernium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_axe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ItemMod.infernium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_sword, 1), new Object[] {" X ", " X ", " Y ", 'X', ItemMod.paradium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_pickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ItemMod.paradium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_shovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ItemMod.paradium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.paradium_axe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ItemMod.paradium_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_sword, 1), new Object[] {" X ", " X ", " Y ", 'X', ItemMod.platine_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_pickaxe, 1), new Object[] {"XXX", " Y ", " Y ", 'X', ItemMod.platine_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_shovel, 1), new Object[] {" X ", " Y ", " Y ", 'X', ItemMod.platine_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_axe, 1), new Object[] {"XX ", "XY ", " Y ", 'X', ItemMod.platine_ingot, 'Y', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_stick, 4), new Object[] {"X", "X", 'X', ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_stick, 4), new Object[] {"X", "X", 'X', ItemMod.infernium_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.platine_mechanism, 2), new Object[] {" X ", "XXX", " X ", 'X', ItemMod.platine_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemMod.infernium_core, 2), new Object[] {"LXL", "XYX", "LXL", 'X', ItemMod.platine_mechanism, 'Y', BlockMod.infernium_block, 'L', ItemMod.infernium_ingot});
    }
}
