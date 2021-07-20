package fr.infernium.com.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block
{

    public BlockBase(Material p_i45394_1_, int level)
    {
        super(p_i45394_1_);
        this.setHarvestLevel("pickaxe", level);
    }
    

}
