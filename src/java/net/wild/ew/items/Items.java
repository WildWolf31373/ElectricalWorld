package net.wild.ew.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by magnus97 on 15/02/2016.
 */
public class Items {

    private static String modid = "electricalworld";
    private static Item classes[] = {new CircuitBoard()};
    private static String string[] = {"Circuit Board"};

    public static void initItems(){
        for(int i = 0; i < classes.length; i++) {
            Register(classes[i], string[i]);
        }
    }

    public static void Register(Item item, String string){
        GameRegistry.registerItem(item, string);
    }

}
