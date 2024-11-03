package com.searooter;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PMT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PmtMod.MOD_ID, "pmt_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MOLDY_BRYCE))
                    .displayName(Text.translatable("itemgroup.pmtmod.pmt_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MOLDY_BRYCE);
                    }).build());

    public static void registerItemGroups() {
        PmtMod.LOGGER.info("Registering item groups for " + PmtMod.MOD_ID);
    }
}

