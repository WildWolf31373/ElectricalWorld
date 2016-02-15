package net.wild.ew.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.wild.ew.blocks.Blocks;
import net.wild.ew.items.Items;

/**
 * Created by magnus97 on 15/02/2016.
 */
@Mod(modid = "electricalworld", name = "Electrical World", version = "0.0.1", dependencies = "required-after:Forge@[" // require forge.
        + net.minecraftforge.common.ForgeVersion.majorVersion + '.' // majorVersion
        + net.minecraftforge.common.ForgeVersion.minorVersion + '.' // minorVersion
        + net.minecraftforge.common.ForgeVersion.revisionVersion + '.' // revisionVersion
        + net.minecraftforge.common.ForgeVersion.buildVersion + ",)" // buildVersion
        ,acceptedMinecraftVersions = "1.7.10")

public class ElecticalWorld {

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){

        Blocks.initBlocks();

        Items.initItems();

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }

}
