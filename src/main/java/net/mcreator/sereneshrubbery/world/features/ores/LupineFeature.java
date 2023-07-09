///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  com.mojang.serialization.Codec
// *  net.minecraft.core.Holder
// *  net.minecraft.core.Registry
// *  net.minecraft.data.worldgen.features.FeatureUtils
// *  net.minecraft.data.worldgen.placement.PlacementUtils
// *  net.minecraft.resources.ResourceKey
// *  net.minecraft.resources.ResourceLocation
// *  net.minecraft.world.level.Level
// *  net.minecraft.world.level.WorldGenLevel
// *  net.minecraft.world.level.block.Block
// *  net.minecraft.world.level.block.Blocks
// *  net.minecraft.world.level.block.state.BlockState
// *  net.minecraft.world.level.levelgen.VerticalAnchor
// *  net.minecraft.world.level.levelgen.feature.ConfiguredFeature
// *  net.minecraft.world.level.levelgen.feature.Feature
// *  net.minecraft.world.level.levelgen.feature.FeaturePlaceContext
// *  net.minecraft.world.level.levelgen.feature.OreFeature
// *  net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration
// *  net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration
// *  net.minecraft.world.level.levelgen.placement.BiomeFilter
// *  net.minecraft.world.level.levelgen.placement.CountPlacement
// *  net.minecraft.world.level.levelgen.placement.HeightRangePlacement
// *  net.minecraft.world.level.levelgen.placement.InSquarePlacement
// *  net.minecraft.world.level.levelgen.placement.PlacedFeature
// *  net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest
// *  net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType
// *  net.minecraftforge.eventbus.api.SubscribeEvent
// *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
// *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
// *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
// */
//package net.mcreator.sereneshrubbery.world.features.ores;
//
//import com.mojang.serialization.Codec;
//import java.util.List;
//import java.util.Random;
//import java.util.Set;
//import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.minecraft.core.Holder;
//import net.minecraft.core.Registry;
//import net.minecraft.data.worldgen.features.FeatureUtils;
//import net.minecraft.data.worldgen.placement.PlacementUtils;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.WorldGenLevel;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.levelgen.VerticalAnchor;
//import net.minecraft.world.level.levelgen.feature.*;
//import net.minecraft.world.level.levelgen.feature.configurations.*;
//import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
//import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseThresholdProvider;
//import net.minecraft.world.level.levelgen.placement.*;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
//import net.minecraft.world.level.levelgen.synth.NormalNoise;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
//
//public class LupineFeature
//extends VegetationPatchFeature {
//    public static LupineFeature FEATURE = null;
//    public static Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> PURPLE_LUPINE_FEATURE = null;
//    public static Holder<PlacedFeature> PLACED_FEATURE = null;
//    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(
//            new ResourceLocation("windswept_hills"),
//            new ResourceLocation("taiga"),
//            new ResourceLocation("old_growth_pine_taiga"),
//            new ResourceLocation("windswept_forest"),
//            new ResourceLocation("windswept_gravelly_hills"),
//            new ResourceLocation("snowy_taiga"),
//            new ResourceLocation("old_growth_spruce_taiga"),
//            new ResourceLocation("biomesoplenty:coniferous_forest"),
//            new ResourceLocation("biomesoplenty:fir_clearing"),
//            new ResourceLocation("biomesoplenty:snowy_coniferous_forest"),
//            new ResourceLocation("biomesoplenty:snowy_fir_clearing"),
//            new ResourceLocation("biomesoplenty:forested_field"),
//            new ResourceLocation("biomesoplenty:highland"),
//            new ResourceLocation("biomesoplenty:highland_moor"),
//            new ResourceLocation("biomesoplenty:jade_cliffs"),
//            new ResourceLocation("biomesoplenty:maple_woods"),
//            new ResourceLocation("biomesoplenty:snowy_maple_woods"),
//            new ResourceLocation("biomesoplenty:mediterranean_forest"),
//            new ResourceLocation("biomesoplenty:redwood_forest"),
//            new ResourceLocation("byg:redwood_thicket"),
//            new ResourceLocation("byg:canadian_shield"),
//            new ResourceLocation("byg:borealis_grove"),
//            new ResourceLocation("byg:cika_woods"),
//            new ResourceLocation("byg:coniferous_forest"),
//            new ResourceLocation("byg:dacite_ridges"),
//            new ResourceLocation("byg:maple_taiga"),
//            new ResourceLocation("byg:autumnal_taiga"),
//            new ResourceLocation("byg:black_forest"),
//            new ResourceLocation("byg:frosted_coniferous_forest"),
//            new ResourceLocation("byg:howling_peaks"));
//    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
//
//    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
//            PURPLE_LUPINE_FEATURE, RarityFilter.onAverageOnceEvery(16),
//            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
//
//    //public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PINK_ROSE =
//    public static Feature<?> feature() {
//        FEATURE = new LupineFeature();
//        PURPLE_LUPINE_FEATURE = FeatureUtils.register(
//                "serene_shrubbery:lupine",
//                        Feature.FLOWER,
//                        new RandomPatchConfiguration(64, 6,2,
//                                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SereneShrubberyModBlocks.LUPINE.get()))));
//                        //(SereneShrubberyModBlocks.LUPINE.get()).
//                                //.m_49966_(), 5));
////        PLACED_FEATURE = PlacementUtils.m_206509_(
////                "serene_shrubbery:lupine",
////                                CONFIGURED_FEATURE,
////                                List.of(CountPlacement.m_191628_((int)30),
////                                InSquarePlacement.m_191715_(),
////                                HeightRangePlacement.m_191680_(VerticalAnchor.m_158922_((int)60),
////                                VerticalAnchor.m_158922_((int)100)),
////                                BiomeFilter.m_191561_()));
//        //return FEATURE;
//    }
////
////    public static Holder<PlacedFeature> placedFeature() {
////        return PLACED_FEATURE;
////    }
////
////    public LupineFeature() {
////        super(VegetationPatchConfiguration.CODEC.);
////    }
////
////    public boolean m_142674_(FeaturePlaceContext<OreConfiguration> context) {
////        WorldGenLevel world = context.m_159774_();
////        if (!this.generate_dimensions.contains((Object)world.m_6018_().m_46472_())) {
////            return false;
////        }
////        return super.m_142674_(context);
////    }
//
////    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
////    private static class LupineFeatureRuleTest
////    extends RuleTest {
////        static final LupineFeatureRuleTest INSTANCE = new LupineFeatureRuleTest();
////        private static final Codec<LupineFeatureRuleTest> CODEC = Codec.unit(() -> INSTANCE);
////        private static final RuleTestType<LupineFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;
////        private List<Block> base_blocks = null;
////
////        private LupineFeatureRuleTest() {
////        }
////
////        @SubscribeEvent
////        public static void init(FMLCommonSetupEvent event) {
////            Registry.m_122965_((Registry)Registry.f_122861_, (ResourceLocation)new ResourceLocation("serene_shrubbery:lupine_match"), CUSTOM_MATCH);
////        }
////
////        public boolean m_7715_(BlockState blockAt, Random random) {
////            if (this.base_blocks == null) {
////                this.base_blocks = List.of(Blocks.f_50034_, Blocks.f_50112_, Blocks.f_50111_, Blocks.f_50035_, (Block)SereneShrubberyModBlocks.PEACH_FOXGLOVE.get(), (Block)SereneShrubberyModBlocks.PURPLE_FOXGLOVE.get(), (Block)SereneShrubberyModBlocks.WHITE_FOXGLOVE.get(), (Block)SereneShrubberyModBlocks.SUNSET_FOXGLOVE.get());
////            }
////            return this.base_blocks.contains((Object)blockAt.m_60734_());
////        }
////
////        protected RuleTestType<?> m_7319_() {
////            return CUSTOM_MATCH;
////        }
////    }
////}
//
