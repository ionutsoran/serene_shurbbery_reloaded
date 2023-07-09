package net.mcreator.sereneshrubbery.world.features;

import net.mcreator.sereneshrubbery.SereneShrubberyMod;
import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.InclusiveRange;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SereneShrubberyModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SereneShrubberyMod.MOD_ID);

//    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PURPLE_LUPIN_CONFIGURED_FEATURE =
//            FeatureUtils.register("flower_purple_lupin", Feature.FLOWER,
//                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
//                            new SimpleBlockConfiguration(BlockStateProvider.simple(SereneShrubberyModBlocks.PURPLE_LUPINE.get())))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LUPIN_GROUP = CONFIGURED_FEATURES.register("lupin_configured_feature",
            () -> new ConfiguredFeature(Feature.FLOWER,
                    new RandomPatchConfiguration(96, 4, 4,
                            PlacementUtils.onlyWhenEmpty((Feature)Feature.SIMPLE_BLOCK,
                                    (FeatureConfiguration)new SimpleBlockConfiguration(new DualNoiseProvider(
                                            new InclusiveRange<>(10, 64),
                                            new NormalNoise.NoiseParameters(0, -2.0), 1.0f, 2345L,
                                            new NormalNoise.NoiseParameters(128, 2.0), 1.0f,
                                            List.of(
                                                    SereneShrubberyModBlocks.PURPLE_LUPINE.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.PINK_LUPINE.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.WHITE_LUPINE.get().defaultBlockState()
                                                    )))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> FOXGLOVE_GROUP = CONFIGURED_FEATURES.register("foxglove_configured_feature",
            () -> new ConfiguredFeature(Feature.FLOWER,
                    new RandomPatchConfiguration(96, 4, 4,
                            PlacementUtils.onlyWhenEmpty((Feature)Feature.SIMPLE_BLOCK,
                                    (FeatureConfiguration)new SimpleBlockConfiguration(new DualNoiseProvider(
                                            new InclusiveRange<>(10, 64),
                                            new NormalNoise.NoiseParameters(0, -2.0), 1.0f, 2345L,
                                            new NormalNoise.NoiseParameters(128, 2.0), 1.0f,
                                            List.of(
                                                    SereneShrubberyModBlocks.PEACH_FOXGLOVE.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.PURPLE_FOXGLOVE.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.WHITE_FOXGLOVE.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.SUNSET_FOXGLOVE.get().defaultBlockState()
                                            )))))));


    public static final RegistryObject<ConfiguredFeature<?, ?>> CACTUS_GROUP = CONFIGURED_FEATURES.register("cactus_configured_feature",
            () -> new ConfiguredFeature(Feature.FLOWER,
                    new RandomPatchConfiguration(96, 4, 4,
                            PlacementUtils.onlyWhenEmpty((Feature)Feature.SIMPLE_BLOCK,
                                    (FeatureConfiguration)new SimpleBlockConfiguration(new DualNoiseProvider(
                                            new InclusiveRange<>(10, 64),
                                            new NormalNoise.NoiseParameters(0, -2.0), 1.0f, 2345L,
                                            new NormalNoise.NoiseParameters(128, 2.0), 1.0f,
                                            List.of(
                                                    SereneShrubberyModBlocks.BARREL_CACTUS.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.BARREL_CACTUS_2.get().defaultBlockState()
                                            )))))));


    public static final RegistryObject<ConfiguredFeature<?, ?>> WATER_LILY_GROUP = CONFIGURED_FEATURES.register("water_lily_configured_feature",
            () -> new ConfiguredFeature(Feature.FLOWER,
                    new RandomPatchConfiguration(96, 4, 4,
                            PlacementUtils.onlyWhenEmpty((Feature)Feature.SIMPLE_BLOCK,
                                    (FeatureConfiguration)new SimpleBlockConfiguration(new DualNoiseProvider(
                                            new InclusiveRange<>(10, 64),
                                            new NormalNoise.NoiseParameters(0, -2.0), 1.0f, 2345L,
                                            new NormalNoise.NoiseParameters(128, 2.0), 1.0f,
                                            List.of(
                                                    SereneShrubberyModBlocks.WATER_LILY.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.WATER_LILY_2.get().defaultBlockState()
                                            )))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LIVERWORT_GROUP = CONFIGURED_FEATURES.register("liverwort_configured_feature",
            () -> new ConfiguredFeature(Feature.FLOWER,
                    new RandomPatchConfiguration(96, 4, 4,
                            PlacementUtils.onlyWhenEmpty((Feature)Feature.SIMPLE_BLOCK,
                                    (FeatureConfiguration)new SimpleBlockConfiguration(new DualNoiseProvider(
                                            new InclusiveRange<>(10, 64),
                                            new NormalNoise.NoiseParameters(0, -2.0), 1.0f, 2345L,
                                            new NormalNoise.NoiseParameters(128, 2.0), 1.0f,
                                            List.of(
                                                    SereneShrubberyModBlocks.BLUE_LIVERWORT.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.PURPLE_FOXGLOVE.get().defaultBlockState(),
                                                    SereneShrubberyModBlocks.WHITE_LIVERWORT.get().defaultBlockState()
                                            )))))));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }

}
