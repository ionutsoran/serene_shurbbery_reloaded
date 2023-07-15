package net.mcreator.sereneshrubbery.world.features;

import net.mcreator.sereneshrubbery.SereneShrubberyMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SereneShrubberyModBYGPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> BYG_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SereneShrubberyMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> BYG_LUPIN_PLACED = BYG_PLACED_FEATURES.register("byg_serene_forest_simple",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.LUPIN_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));


    public static final RegistryObject<PlacedFeature> BYG_FOXGLOVE_PLACED = BYG_PLACED_FEATURES.register("byg_serene_jungle",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.FOXGLOVE_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(10),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BYG_PANSIES_PLACED = BYG_PLACED_FEATURES.register("byg_serene_coniferous",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.PANSIES_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BYG_HYDRANGEA_PLACED = BYG_PLACED_FEATURES.register("byg_serene_forest_and_plains",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.HYDRANGEA_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BYG_CACTUS_PLACED = BYG_PLACED_FEATURES.register("byg_serene_desert",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.CACTUS_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome()
                    )));

    public static final RegistryObject<PlacedFeature> BYG_LIVERWORT_PLACED = BYG_PLACED_FEATURES.register("byg_serene_birch_and_old_forest",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.LIVERWORT_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BYG_WATER_LILIES_PLACED = BYG_PLACED_FEATURES.register("byg_serene_swampy_and_jungle",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.WATER_LILY_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(10),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));



    public static final RegistryObject<PlacedFeature> BYG_NO_CATEGORY_PLACED = BYG_PLACED_FEATURES.register("byg_serene_savanna",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.NO_CATEGORY_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));


    public static final RegistryObject<PlacedFeature> BYG_FIREWEED_PLACED = BYG_PLACED_FEATURES.register("byg_serene_peaks_and_forest",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.FIREWEED_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));



    public static void register(IEventBus eventBus){
        BYG_PLACED_FEATURES.register(eventBus);
    }
}
