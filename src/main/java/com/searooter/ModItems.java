package com.searooter;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.IdentityHashMap;

public class ModItems {
    public static void initialize(){

    };
    public static Item register(Item item, String id) {
        // Create identifier for item  
        Identifier itemID = Identifier.of(FirstMod.MOD_ID, id);

        // Register the item
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    public static final Item TEST_ITEM = register(
            new Item(new Item.Settings()),
            "test_item"
    );


}
