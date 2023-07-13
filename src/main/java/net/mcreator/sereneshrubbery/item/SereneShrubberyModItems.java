/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sereneshrubbery.item;

import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
import net.mcreator.sereneshrubbery.tabs.SereneShrubberyModTabs;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class SereneShrubberyModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, (String)"serene_shrubbery");
//    public static final RegistryObject<Item> LUPINE = ITEMS.register("lupine_item",
//            () -> new ItemNameBlockItem(SereneShrubberyModBlocks.LUPINE.get()),
//            new Item.Properties().tab(SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY));
            //SereneShrubberyModItems.block(SereneShrubberyModBlocks.LUPINE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PEACH_FOXGLOVE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PEACH_FOXGLOVE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PURPLE_FOXGLOVE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PURPLE_FOXGLOVE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WHITE_FOXGLOVE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WHITE_FOXGLOVE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> SUNSET_FOXGLOVE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.SUNSET_FOXGLOVE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> RED_PANSIES = SereneShrubberyModItems.block(SereneShrubberyModBlocks.RED_PANSIES, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> YELLOW_PANSIES = SereneShrubberyModItems.block(SereneShrubberyModBlocks.YELLOW_PANSIES, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WHITE_PANSIES = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WHITE_PANSIES, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> ORANGE_PANSIES = SereneShrubberyModItems.block(SereneShrubberyModBlocks.ORANGE_PANSIES, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PINK_PANSIES = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PINK_PANSIES, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PURPLE_PANSIES = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PURPLE_PANSIES, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WATER_LILY = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WATER_LILY, null);
//    public static final RegistryObject<Item> WATER_LILY_ITEM = ITEMS.register("water_lily_item", () -> new WaterLilyItemItem());
//    public static final RegistryObject<Item> PURPLE_BUTTERFLY_BUSH = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PURPLE_BUTTERFLY_BUSH, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PINK_LUPINE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PINK_LUPINE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WHITE_LUPINE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WHITE_LUPINE, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> BLANKET_FLOWER = SereneShrubberyModItems.block(SereneShrubberyModBlocks.BLANKET_FLOWER, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> HYDRANGEA = SereneShrubberyModItems.block(SereneShrubberyModBlocks.HYDRANGEA, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PURPLE_HYDRANGEA = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PURPLE_HYDRANGEA, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> RED_HYDRANGEA = SereneShrubberyModItems.block(SereneShrubberyModBlocks.RED_HYDRANGEA, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WHITE_HYDRANGEA = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WHITE_HYDRANGEA, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WATER_LILY_2 = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WATER_LILY_2, null);
//    public static final RegistryObject<Item> BARREL_CACTUS_2 = SereneShrubberyModItems.block(SereneShrubberyModBlocks.BARREL_CACTUS_2, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> BARREL_CACTUSS_1 = SereneShrubberyModItems.block(SereneShrubberyModBlocks.BARREL_CACTUSS_1, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> BARREL_CACTUS_INVISIBLE = SereneShrubberyModItems.block(SereneShrubberyModBlocks.BARREL_CACTUS_INVISIBLE, null);
//    public static final RegistryObject<Item> TWINFLOWER = SereneShrubberyModItems.block(SereneShrubberyModBlocks.TWINFLOWER, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> BLUE_LIVERWORT = SereneShrubberyModItems.block(SereneShrubberyModBlocks.BLUE_LIVERWORT, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> PURPLE_LIVERWORT = SereneShrubberyModItems.block(SereneShrubberyModBlocks.PURPLE_LIVERWORT, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> WHITE_LIVERWORT = SereneShrubberyModItems.block(SereneShrubberyModBlocks.WHITE_LIVERWORT, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
//    public static final RegistryObject<Item> FIREWEED = SereneShrubberyModItems.block(SereneShrubberyModBlocks.FIREWEED, SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Item>  WATER_LILY_ITEM = ITEMS.register("water_lily_item",
            () -> new PlaceOnWaterBlockItem(SereneShrubberyModBlocks.WATER_LILY.get(), new Item.Properties().tab(SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY)));

    public static final RegistryObject<Item>  WATER_LILY_2_ITEM = ITEMS.register("water_lily_2_item",
            () -> new PlaceOnWaterBlockItem(SereneShrubberyModBlocks.WATER_LILY_2.get(), new Item.Properties().tab(SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY)));


    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

