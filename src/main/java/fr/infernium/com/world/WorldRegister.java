package fr.infernium.com.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
    public static void MainRegistery()
    {
        registerWorldGen(new WorldGenInfernium(), -1);  
        registerWorldGen(new WorldGenInfernium(), 0); 
        registerWorldGen(new WorldGenInfernium(), 1); 
    }
    
    public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
