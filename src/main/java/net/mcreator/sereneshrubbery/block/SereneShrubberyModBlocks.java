/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.sereneshrubbery.block;

import net.mcreator.sereneshrubbery.SereneShrubberyMod;
//import net.mcreator.sereneshrubbery.block.flowerblocks.BarrelCactus2Block;
//import net.mcreator.sereneshrubbery.block.flowerblocks.BarrelCactusInvisibleBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.BarrelCactuss1Block;
//import net.mcreator.sereneshrubbery.block.flowerblocks.BlanketFlowerBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.BlueLiverwortBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.FireweedBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.HydrangeaBlock;
import net.mcreator.sereneshrubbery.block.flowerblocks.*;
//import net.mcreator.sereneshrubbery.block.flowerblocks.OrangePansiesBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PeachFoxgloveBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PinkLupineBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PinkPansiesBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PurpleButterflyBushBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PurpleFoxgloveBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PurpleHydrangeaBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PurpleLiverwortBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.PurplePansiesBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.RedHydrangeaBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.RedPansiesBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.SunsetFoxgloveBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.TwinflowerBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WaterLily2Block;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WaterLilyBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WhiteFoxgloveBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WhiteHydrangeaBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WhiteLiverwortBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WhiteLupineBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.WhitePansiesBlock;
//import net.mcreator.sereneshrubbery.block.flowerblocks.YellowPansiesBlock;
import net.mcreator.sereneshrubbery.item.SereneShrubberyModItems;
import net.mcreator.sereneshrubbery.tabs.SereneShrubberyModTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SereneShrubberyModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SereneShrubberyMod.MOD_ID);
            //(String)"serene_shrubbery");
    public static final RegistryObject<Block> PURPLE_LUPINE = registerBlock("purple_lupine",
                    () -> new PurpleLupineBlock(BlockBehaviour.Properties.of(Material.GRASS)
                            .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
                    SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> PINK_LUPINE = registerBlock("pink_lupine",
            () -> new PinkLupineBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
    public static final RegistryObject<Block> WHITE_LUPINE = registerBlock("white_lupine",
            () -> new WhiteLupineBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);



    public static final RegistryObject<Block> PEACH_FOXGLOVE = registerBlock("peach_foxglove",
            () -> new PeachFoxgloveBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> PURPLE_FOXGLOVE = registerBlock("purple_foxglove",
            () -> new PurpleFoxgloveBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
    public static final RegistryObject<Block> WHITE_FOXGLOVE = registerBlock("white_foxglove",
            () -> new WhiteFoxgloveBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
    public static final RegistryObject<Block> SUNSET_FOXGLOVE = registerBlock("sunset_foxglove",
            () -> new SunsetFoxgloveBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);


    public static final RegistryObject<Block> PURPLE_HYDRANGEA = registerBlock("purple_hydrangea",
            () -> new PurpleHydrangeaBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> HYDRANGEA = registerBlock("hydrangea",
            () -> new HydrangeaBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> WHITE_HYDRANGEA = registerBlock("white_hydrangea",
            () -> new WhiteHydrangeaBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> RED_HYDRANGEA = registerBlock("red_hydrangea",
            () -> new RedHydrangeaBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);


    public static final RegistryObject<Block> PINK_PANSIES = registerBlock("pink_pansies",
            () -> new PinkPansiesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> WHITE_PANSIES = registerBlock("white_pansies",
            () -> new WhitePansiesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> YELLOW_PANSIES = registerBlock("yellow_pansies",
            () -> new YellowPansiesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> PURPLE_PANSIES = registerBlock("purple_pansies",
            () -> new PurplePansiesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> RED_PANSIES = registerBlock("red_pansies",
            () -> new RedPansiesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> ORANGE_PANSIES = registerBlock("orange_pansies",
            () -> new OrangePansiesBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> BARREL_CACTUS = registerBlock("barrel_cactuss_1",
            () -> new BarrelCactuss1Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<BarrelCactus2Block> BARREL_CACTUS_2 = registerBlock("barrel_cactus_2",
            () -> new BarrelCactus2Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> WATER_LILY = registerBlock("water_lily",
            () -> new WaterLilyBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> WATER_LILY_2 = registerBlock("water_lily_2",
            () -> new WaterLily2Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> PURPLE_BUTTERFLY_BUSH = registerBlock("purple_butterfly_bush",
            () -> new PurpleButterflyBushBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
    public static final RegistryObject<Block> BLUE_LIVERWORT = registerBlock("blue_liverwort",
            () -> new BlueLiverwortBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> PURPLE_LIVERWORT = registerBlock("purple_liverwort",
            () -> new PurpleLiverwortBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> WHITE_LIVERWORT = registerBlock("white_liverwort",
            () -> new PurpleLiverwortBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

    public static final RegistryObject<Block> BLANKET_FLOWER = registerBlock("blanket_flower",
            () -> new BlanketFlowerBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
    public static final RegistryObject<Block> TWINFLOWER = registerBlock("twinflower",
            () -> new TwinflowerBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);
    public static final RegistryObject<Block> FIREWEED = registerBlock("fireweed",
            () -> new FireweedBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .instabreak().noCollission().sound(SoundType.GRASS).lightLevel((l)-> {return 1;})),
            SereneShrubberyModTabs.TAB_SERENE_SHRUBBERY);

//    public static final RegistryObject<Block> BARREL_CACTUS_INVISIBLE = BLOCKS.register("barrel_cactus_invisible", () -> new BarrelCactusInvisibleBlock());


    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return SereneShrubberyModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
//    public static class ClientSideHandler {
//        @SubscribeEvent
//        public static void clientSetup(FMLClientSetupEvent event) {
////            LupineBlock.registerRenderLayer();
////            PeachFoxgloveBlock.registerRenderLayer();
////            PurpleFoxgloveBlock.registerRenderLayer();
////            WhiteFoxgloveBlock.registerRenderLayer();
////            SunsetFoxgloveBlock.registerRenderLayer();
////            RedPansiesBlock.registerRenderLayer();
////            YellowPansiesBlock.registerRenderLayer();
////            WhitePansiesBlock.registerRenderLayer();
////            OrangePansiesBlock.registerRenderLayer();
////            PinkPansiesBlock.registerRenderLayer();
////            PurplePansiesBlock.registerRenderLayer();
////            WaterLilyBlock.registerRenderLayer();
////            PurpleButterflyBushBlock.registerRenderLayer();
////            PinkLupineBlock.registerRenderLayer();
////            WhiteLupineBlock.registerRenderLayer();
////            BlanketFlowerBlock.registerRenderLayer();
////            HydrangeaBlock.registerRenderLayer();
////            PurpleHydrangeaBlock.registerRenderLayer();
////            RedHydrangeaBlock.registerRenderLayer();
////            WhiteHydrangeaBlock.registerRenderLayer();
////            WaterLily2Block.registerRenderLayer();
////            BarrelCactus2Block.registerRenderLayer();
////            BarrelCactuss1Block.registerRenderLayer();
////            BarrelCactusInvisibleBlock.registerRenderLayer();
////            TwinflowerBlock.registerRenderLayer();
////            BlueLiverwortBlock.registerRenderLayer();
////            PurpleLiverwortBlock.registerRenderLayer();
////            WhiteLiverwortBlock.registerRenderLayer();
////            FireweedBlock.registerRenderLayer();
//        }
//    }
}

