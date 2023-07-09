///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  net.minecraft.core.Holder
// *  net.minecraft.resources.ResourceLocation
// *  net.minecraft.world.level.levelgen.GenerationStep$Decoration
// *  net.minecraft.world.level.levelgen.feature.Feature
// *  net.minecraft.world.level.levelgen.placement.PlacedFeature
// *  net.minecraftforge.event.world.BiomeLoadingEvent
// *  net.minecraftforge.eventbus.api.SubscribeEvent
// *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
// *  net.minecraftforge.registries.DeferredRegister
// *  net.minecraftforge.registries.ForgeRegistries
// *  net.minecraftforge.registries.IForgeRegistry
// *  net.minecraftforge.registries.RegistryObject
// */
//package net.mcreator.sereneshrubbery.world.features;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.function.Supplier;
//import net.mcreator.sereneshrubbery.world.features.ores.BarrelCactus2Feature;
//import net.mcreator.sereneshrubbery.world.features.ores.BarrelCactuss1Feature;
//import net.mcreator.sereneshrubbery.world.features.ores.LupineFeature;
//import net.mcreator.sereneshrubbery.world.features.ores.PinkLupineFeature;
//import net.mcreator.sereneshrubbery.world.features.ores.PurpleButterflyBushFeature;
//import net.mcreator.sereneshrubbery.world.features.ores.WaterLily2Feature;
//import net.mcreator.sereneshrubbery.world.features.ores.WhiteLupineFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.BarrelCactusInvisibleFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.BlanketFlowerFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.BlueLiverwortFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.FireweedFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.HydrangeaFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.OrangePansiesFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.PeachFoxgloveFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.PinkPansiesFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.PurpleFoxgloveFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.PurpleHydrangeaFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.PurpleLiverwortFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.PurplePansiesFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.RedHydrangeaFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.RedPansiesFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.SunsetFoxgloveFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.TwinflowerFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.WaterLilyFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.WhiteFoxgloveFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.WhiteHydrangeaFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.WhiteLiverwortFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.WhitePansiesFeature;
//import net.mcreator.sereneshrubbery.world.features.plants.YellowPansiesFeature;
//import net.minecraft.core.Holder;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.levelgen.GenerationStep;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.placement.PlacedFeature;
//import net.minecraftforge.event.world.BiomeLoadingEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.IForgeRegistry;
//import net.minecraftforge.registries.RegistryObject;
//
//@Mod.EventBusSubscriber
//public class SereneShrubberyModFeatures {
//    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.FEATURES, (String)"serene_shrubbery");
//    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<FeatureRegistration>();
//    public static final RegistryObject<Feature<?>> LUPINE = SereneShrubberyModFeatures.register("lupine", LupineFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LupineFeature.GENERATE_BIOMES, LupineFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PEACH_FOXGLOVE = SereneShrubberyModFeatures.register("peach_foxglove", PeachFoxgloveFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PeachFoxgloveFeature.GENERATE_BIOMES, PeachFoxgloveFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PURPLE_FOXGLOVE = SereneShrubberyModFeatures.register("purple_foxglove", PurpleFoxgloveFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurpleFoxgloveFeature.GENERATE_BIOMES, PurpleFoxgloveFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WHITE_FOXGLOVE = SereneShrubberyModFeatures.register("white_foxglove", WhiteFoxgloveFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WhiteFoxgloveFeature.GENERATE_BIOMES, WhiteFoxgloveFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> SUNSET_FOXGLOVE = SereneShrubberyModFeatures.register("sunset_foxglove", SunsetFoxgloveFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SunsetFoxgloveFeature.GENERATE_BIOMES, SunsetFoxgloveFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> RED_PANSIES = SereneShrubberyModFeatures.register("red_pansies", RedPansiesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RedPansiesFeature.GENERATE_BIOMES, RedPansiesFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> YELLOW_PANSIES = SereneShrubberyModFeatures.register("yellow_pansies", YellowPansiesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, YellowPansiesFeature.GENERATE_BIOMES, YellowPansiesFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WHITE_PANSIES = SereneShrubberyModFeatures.register("white_pansies", WhitePansiesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WhitePansiesFeature.GENERATE_BIOMES, WhitePansiesFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> ORANGE_PANSIES = SereneShrubberyModFeatures.register("orange_pansies", OrangePansiesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, OrangePansiesFeature.GENERATE_BIOMES, OrangePansiesFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PINK_PANSIES = SereneShrubberyModFeatures.register("pink_pansies", PinkPansiesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PinkPansiesFeature.GENERATE_BIOMES, PinkPansiesFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PURPLE_PANSIES = SereneShrubberyModFeatures.register("purple_pansies", PurplePansiesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurplePansiesFeature.GENERATE_BIOMES, PurplePansiesFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WATER_LILY = SereneShrubberyModFeatures.register("water_lily", WaterLilyFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WaterLilyFeature.GENERATE_BIOMES, WaterLilyFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PURPLE_BUTTERFLY_BUSH = SereneShrubberyModFeatures.register("purple_butterfly_bush", PurpleButterflyBushFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PurpleButterflyBushFeature.GENERATE_BIOMES, PurpleButterflyBushFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PINK_LUPINE = SereneShrubberyModFeatures.register("pink_lupine", PinkLupineFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PinkLupineFeature.GENERATE_BIOMES, PinkLupineFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WHITE_LUPINE = SereneShrubberyModFeatures.register("white_lupine", WhiteLupineFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WhiteLupineFeature.GENERATE_BIOMES, WhiteLupineFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> BLANKET_FLOWER = SereneShrubberyModFeatures.register("blanket_flower", BlanketFlowerFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlanketFlowerFeature.GENERATE_BIOMES, BlanketFlowerFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> HYDRANGEA = SereneShrubberyModFeatures.register("hydrangea", HydrangeaFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HydrangeaFeature.GENERATE_BIOMES, HydrangeaFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PURPLE_HYDRANGEA = SereneShrubberyModFeatures.register("purple_hydrangea", PurpleHydrangeaFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurpleHydrangeaFeature.GENERATE_BIOMES, PurpleHydrangeaFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> RED_HYDRANGEA = SereneShrubberyModFeatures.register("red_hydrangea", RedHydrangeaFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RedHydrangeaFeature.GENERATE_BIOMES, RedHydrangeaFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WHITE_HYDRANGEA = SereneShrubberyModFeatures.register("white_hydrangea", WhiteHydrangeaFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WhiteHydrangeaFeature.GENERATE_BIOMES, WhiteHydrangeaFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WATER_LILY_2 = SereneShrubberyModFeatures.register("water_lily_2", WaterLily2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WaterLily2Feature.GENERATE_BIOMES, WaterLily2Feature::placedFeature));
//    public static final RegistryObject<Feature<?>> BARREL_CACTUS_2 = SereneShrubberyModFeatures.register("barrel_cactus_2", BarrelCactus2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BarrelCactus2Feature.GENERATE_BIOMES, BarrelCactus2Feature::placedFeature));
//    public static final RegistryObject<Feature<?>> BARREL_CACTUSS_1 = SereneShrubberyModFeatures.register("barrel_cactuss_1", BarrelCactuss1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BarrelCactuss1Feature.GENERATE_BIOMES, BarrelCactuss1Feature::placedFeature));
//    public static final RegistryObject<Feature<?>> BARREL_CACTUS_INVISIBLE = SereneShrubberyModFeatures.register("barrel_cactus_invisible", BarrelCactusInvisibleFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BarrelCactusInvisibleFeature.GENERATE_BIOMES, BarrelCactusInvisibleFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> TWINFLOWER = SereneShrubberyModFeatures.register("twinflower", TwinflowerFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, TwinflowerFeature.GENERATE_BIOMES, TwinflowerFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> BLUE_LIVERWORT = SereneShrubberyModFeatures.register("blue_liverwort", BlueLiverwortFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueLiverwortFeature.GENERATE_BIOMES, BlueLiverwortFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> PURPLE_LIVERWORT = SereneShrubberyModFeatures.register("purple_liverwort", PurpleLiverwortFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurpleLiverwortFeature.GENERATE_BIOMES, PurpleLiverwortFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> WHITE_LIVERWORT = SereneShrubberyModFeatures.register("white_liverwort", WhiteLiverwortFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WhiteLiverwortFeature.GENERATE_BIOMES, WhiteLiverwortFeature::placedFeature));
//    public static final RegistryObject<Feature<?>> FIREWEED = SereneShrubberyModFeatures.register("fireweed", FireweedFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FireweedFeature.GENERATE_BIOMES, FireweedFeature::placedFeature));
//
//    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
//        FEATURE_REGISTRATIONS.add(featureRegistration);
//        return REGISTRY.register(registryname, feature);
//    }
//
//    @SubscribeEvent
//    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
//        for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
//            if (registration.biomes() != null && !registration.biomes().contains((Object)event.getName())) continue;
//            event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
//        }
//    }
//
//    private record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
//    }
//}
//
