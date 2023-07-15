package net.mcreator.sereneshrubbery.world.features;

import net.mcreator.sereneshrubbery.SereneShrubberyMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SereneShrubberyModBOPPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> BOP_PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SereneShrubberyMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> BOP_LUPIN_PLACED = BOP_PLACED_FEATURES.register("bop_serene_forest_simple",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.LUPIN_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));


    public static final RegistryObject<PlacedFeature> BOP_FOXGLOVE_PLACED = BOP_PLACED_FEATURES.register("bop_serene_jungle",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.FOXGLOVE_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(10),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BOP_PANSIES_PLACED = BOP_PLACED_FEATURES.register("bop_serene_coniferous",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.PANSIES_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BOP_HYDRANGEA_PLACED = BOP_PLACED_FEATURES.register("bop_serene_forest_and_plains",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.HYDRANGEA_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BOP_CACTUS_PLACED = BOP_PLACED_FEATURES.register("bop_serene_desert",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.CACTUS_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome()
                    )));

    public static final RegistryObject<PlacedFeature> BOP_LIVERWORT_PLACED = BOP_PLACED_FEATURES.register("bop_serene_birch_and_old_forest",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.LIVERWORT_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> BOP_WATER_LILIES_PLACED = BOP_PLACED_FEATURES.register("bop_serene_swampy_and_jungle",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.WATER_LILY_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(10),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));



    public static final RegistryObject<PlacedFeature> BOP_NO_CATEGORY_PLACED = BOP_PLACED_FEATURES.register("bop_serene_savanna",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.NO_CATEGORY_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));


    public static final RegistryObject<PlacedFeature> BOP_FIREWEED_PLACED = BOP_PLACED_FEATURES.register("bop_serene_peaks_and_forest",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.FIREWEED_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));



    public static void register(IEventBus eventBus){
        BOP_PLACED_FEATURES.register(eventBus);
    }
}
