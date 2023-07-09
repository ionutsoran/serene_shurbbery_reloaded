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

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModFeatures;
import net.mcreator.sereneshrubbery.item.SereneShrubberyModItems;
import net.mcreator.sereneshrubbery.tabs.SereneShrubberyModTabs;
//import net.mcreator.sereneshrubbery.world.biomemods.SereneShrubberyModBiomeModifiers;
import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModConfiguredFeatures;
import net.mcreator.sereneshrubbery.world.features.SereneShrubberyModPlacedFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value="serene_shrubbery")
public class SereneShrubberyMod {
    public static final Logger LOGGER = LogManager.getLogger(SereneShrubberyMod.class);
    public static final String MOD_ID = "serene_shrubbery";
    private static final String PROTOCOL_VERSION = "1";
    //public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel((ResourceLocation)new ResourceLocation("serene_shrubbery", "serene_shrubbery"), () -> "1", "1"::equals, "1"::equals);
    //private static int messageID = 0;

    public SereneShrubberyMod() {
        //SereneShrubberyModTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        SereneShrubberyModBlocks.BLOCKS.register(bus);
        SereneShrubberyModItems.ITEMS.register(bus);
//        SereneShrubberyModBiomeModifiers.register(bus);
        SereneShrubberyModPlacedFeatures.register(bus);
        SereneShrubberyModConfiguredFeatures.register(bus);
    }

//    public boolean emissiveRendering(BlockGetter pLevel, BlockPos pPos) {
//        return this.emissiveRendering.test(this.asState(), pLevel, pPos);
//    }


//    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
//        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
//        ++messageID;
//    }
}

