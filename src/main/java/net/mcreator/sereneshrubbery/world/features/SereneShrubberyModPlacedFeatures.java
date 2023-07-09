package net.mcreator.sereneshrubbery.world.features;

import net.mcreator.sereneshrubbery.SereneShrubberyMod;
import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SereneShrubberyModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature>  PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SereneShrubberyMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> LUPIN_PLACED = PLACED_FEATURES.register("forest_simple",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.LUPIN_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));


    public static final RegistryObject<PlacedFeature> FOXGLOVE_PLACED = PLACED_FEATURES.register("jungle",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.FOXGLOVE_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> PANSIES_PLACED = PLACED_FEATURES.register("coniferous",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.PANSIES_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> HYDRANGEA_PLACED = PLACED_FEATURES.register("forest_and_plains",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.HYDRANGEA_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> LIVERWORT_PLACED = PLACED_FEATURES.register("birch",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.LIVERWORT_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> WATER_LILIES_PLACED = PLACED_FEATURES.register("swampy_and_jungle",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.WATER_LILY_GROUP.getHolder().get(),
                    List.of(
                            RarityFilter.onAverageOnceEvery((int)4),
                            CountPlacement.of((int)16),
                            InSquarePlacement.spread(),
                            HeightRangePlacement.uniform((VerticalAnchor)VerticalAnchor.aboveBottom((int)32),
                                                    (VerticalAnchor)VerticalAnchor.belowTop((int)55)),
                                                    EnvironmentScanPlacement.scanningFor((Direction)Direction.DOWN,
                                                    (BlockPredicate)BlockPredicate.matchesFluids((Fluid[])new Fluid[]{Fluids.WATER}),
                                                    (int)12),
                            RandomOffsetPlacement.horizontal((IntProvider) ConstantInt.of((int)1))
                    )));


    public static final RegistryObject<PlacedFeature> CACTUS_PLACED = PLACED_FEATURES.register("desert",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.CACTUS_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome()
                    )));

    public static final RegistryObject<PlacedFeature> NO_CATEGORY_PLACED = PLACED_FEATURES.register("savanna",
            () -> new PlacedFeature(SereneShrubberyModConfiguredFeatures.NO_CATEGORY_GROUP.getHolder().get(),
                    List.of(NoiseThresholdCountPlacement.of((double)-1.8, (int)16, (int)2),
                            RarityFilter.onAverageOnceEvery(16),
                            InSquarePlacement.spread(),
                            PlacementUtils.HEIGHTMAP,
                            BiomeFilter.biome())));

//    public static final RegistryObject<PlacedFeature> CHERRY_PLACED = FF_PLACED_FEATURES.register("cherry",
//            () -> new PlacedFeature((Holder)ModFlowersFeatures.CHERRY.getHolder().get(),
//                    List.of(NoiseThresholdCountPlacement.m_191756_((double)-1.8, (int)16, (int)2),
//                            RarityFilter.m_191900_((int)16),
//                            InSquarePlacement.m_191715_(),
//                            PlacementUtils.f_195352_,
//                            BiomeFilter.m_191561_())));



    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
