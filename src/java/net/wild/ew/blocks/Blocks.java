package net.wild.ew.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by magnus97 on 15/02/2016.
 */
public class Blocks {

    public static void initBlocks(){

    }

    public static void Register(Block block, String string){
        GameRegistry.registerBlock(block, string);
    }

}
