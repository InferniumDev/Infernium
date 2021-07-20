package fr.infernium.com.init.armorset;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemPlatineArmor extends ItemArmor
{

    public ItemPlatineArmor(ArmorMaterial platine, int type)
    {
        super(platine, 0, type);
    }
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(slot == 2)
        {
            return "infernium:textures/models/armor/platine_armor_2.png";
        }
        return "infernium:textures/models/armor/platine_armor_1.png";
    }

}
