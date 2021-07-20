package fr.infernium.com;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.infernium.com.init.BlockMod;
import fr.infernium.com.init.ItemMod;
import fr.infernium.com.proxy.CommonProxy;
import fr.infernium.com.world.WorldRegister;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Main
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        BlockMod.init();
        BlockMod.register();
        ItemMod.init();
        ItemMod.register();
        WorldRegister.MainRegistery();
    } 
    
    @EventHandler
    public void Init(FMLInitializationEvent e)
    {
        proxy.registerRenderers();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        
    }
}
