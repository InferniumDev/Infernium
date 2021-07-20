package fr.infernium.com.init.armorset;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.infernium.com.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemInferArmor extends ItemArmor
{

    public ItemInferArmor(ArmorMaterial infernium, int type)
    {
        super(infernium, 0, type);
      
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(slot == 2)
        {
            return "infernium:textures/models/armor/infernium_armor_2.png";
        }
   
        return "infernium:textures/models/armor/infernium_armor_1.png";
    }
    
    public boolean getIsReparable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == this && (repair.getItem() == ItemMod.infernium_ingot))
        {
            return true;
        }
        return false;
    }
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        if(stack.getItem() == ItemMod.infernium_helmet)
        {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));
        }
        if(stack.getItem() == ItemMod.infernium_leggings)
        {
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 300, 0)); 
        }
        if(stack.getItem() == ItemMod.infernium_chestplate)
        {
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 300, 0));
        }
    }
}