//package net.mcreator.sereneshrubbery.world.biomemods;
//
//import com.mojang.serialization.Codec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//import net.mcreator.sereneshrubbery.SereneShrubberyMod;
//import net.minecraft.world.level.biome.Biome;
//import net.minecraft.world.level.levelgen.placement.PlacedFeature;
//import net.minecraftforge.common.world.BiomeModifier;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//public class SereneShrubberyModBiomeModifiers {
//    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS =
//            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, SereneShrubberyMod.MOD_ID);
//
//    public static RegistryObject<Codec<SereneShrubberyModVegetalBiomeModifiers>> VEGETAL_MODIFIER =
//            BIOME_MODIFIERS.register("vegetal",
//                    () -> RecordCodecBuilder.create(builder -> builder.group(
//                                Biome.LIST_CODEC.fieldOf("biomes").forGetter(SereneShrubberyModVegetalBiomeModifiers::biomes),
//                                PlacedFeature.CODEC.fieldOf("feature").forGetter(SereneShrubberyModVegetalBiomeModifiers::feature)
//                         ).apply(builder, SereneShrubberyModVegetalBiomeModifiers::new)));
//
//
//    public static void register(IEventBus eventBus) {
//        BIOME_MODIFIERS.register(eventBus);
//    }
//}
