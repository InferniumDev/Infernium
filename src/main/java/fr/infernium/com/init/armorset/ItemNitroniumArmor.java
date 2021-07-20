package fr.infernium.com.init.armorset;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemNitroniumArmor extends ItemArmor
{

    public ItemNitroniumArmor(ArmorMaterial nitronium, int type)
    {
        super(nitronium, 0, type);
    }
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(slot == 2)
        {
            return "infernium:textures/models/armor/nitronium_armor_2.png";
        }
        return "infernium:textures/models/armor/nitronium_armor_1.png";
    }

}
