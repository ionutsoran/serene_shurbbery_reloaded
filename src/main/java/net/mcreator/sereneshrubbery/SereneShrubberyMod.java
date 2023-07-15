/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraftforge.eventbus.api.IEventBus
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
 *  net.minecraftforge.network.NetworkEvent$Context
 *  net.minecraftforge.network.NetworkRegistry
 *  net.minecraftforge.network.simple.SimpleChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.mcreator.sereneshrubbery;

import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
import net.mcreator.sereneshrubbery.item.SereneShrubberyModItems;
import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModBOPPlacedFeatures;
import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModBYGPlacedFeatures;
import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModConfiguredFeatures;
import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModPlacedFeatures;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value="serene_shrubbery")
public class SereneShrubberyMod {
    public static final Logger LOGGER = LogManager.getLogger(SereneShrubberyMod.class);
    public static final String MOD_ID = "serene_shrubbery";
    private static final String PROTOCOL_VERSION = "1";


    public SereneShrubberyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SereneShrubberyModBlocks.BLOCKS.register(bus);
        SereneShrubberyModItems.ITEMS.register(bus);
        SereneShrubberyModPlacedFeatures.register(bus);
        SereneShrubberyModBOPPlacedFeatures.register(bus);
        SereneShrubberyModBYGPlacedFeatures.register(bus);
        SereneShrubberyModConfiguredFeatures.register(bus);
    }
}

