///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  net.minecraft.core.Holder
// *  net.minecraft.data.worldgen.features.FeatureUtils
// *  net.minecraft.data.worldgen.placement.PlacementUtils
// *  net.minecraft.resources.ResourceKey
// *  net.minecraft.resources.ResourceLocation
// *  net.minecraft.world.level.Level
// *  net.minecraft.world.level.WorldGenLevel
// *  net.minecraft.world.level.block.Block
// *  net.minecraft.world.level.block.state.BlockState
// *  net.minecraft.world.level.levelgen.feature.ConfiguredFeature
// *  net.minecraft.world.level.levelgen.feature.Feature
// *  net.minecraft.world.level.levelgen.feature.FeaturePlaceContext
// *  net.minecraft.world.level.levelgen.feature.RandomPatchFeature
// *  net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration
// *  net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration
// *  net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration
// *  net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider
// *  net.minecraft.world.level.levelgen.placement.BiomeFilter
// *  net.minecraft.world.level.levelgen.placement.CountPlacement
// *  net.minecraft.world.level.levelgen.placement.InSquarePlacement
// *  net.minecraft.world.level.levelgen.placement.PlacedFeature
// *  net.minecraft.world.level.levelgen.placement.RarityFilter
// */
//package net.mcreator.sereneshrubbery.world.features.plants;
//
//import java.util.List;
//import java.util.Set;
//import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.minecraft.core.Holder;
//import net.minecraft.data.worldgen.features.FeatureUtils;
//import net.minecraft.data.worldgen.placement.PlacementUtils;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.WorldGenLevel;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
//import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
//import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
//import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
//import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
//import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
//import net.minecraft.world.level.levelgen.placement.BiomeFilter;
//import net.minecraft.world.level.levelgen.placement.CountPlacement;
//import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
//import net.minecraft.world.level.levelgen.placement.PlacedFeature;
//import net.minecraft.world.level.levelgen.placement.RarityFilter;
//
//public class PeachFoxgloveFeature
//extends RandomPatchFeature {
//    public static PeachFoxgloveFeature FEATURE = null;
//    public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
//    public static Holder<PlacedFeature> PLACED_FEATURE = null;
//    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[]{new ResourceLocation("windswept_hills"), new ResourceLocation("taiga"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("windswept_forest"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("biomesoplenty:coniferous_forest"), new ResourceLocation("biomesoplenty:fir_clearing"), new ResourceLocation("biomesoplenty:snowy_coniferous_forest"), new ResourceLocation("biomesoplenty:snowy_fir_clearing"), new ResourceLocation("biomesoplenty:forested_field"), new ResourceLocation("biomesoplenty:highland"), new ResourceLocation("biomesoplenty:highland_moor"), new ResourceLocation("biomesoplenty:jade_cliffs"), new ResourceLocation("biomesoplenty:maple_woods"), new ResourceLocation("biomesoplenty:snowy_maple_woods"), new ResourceLocation("biomesoplenty:mediterranean_forest"), new ResourceLocation("biomesoplenty:redwood_forest"), new ResourceLocation("byg:redwood_thicket"), new ResourceLocation("byg:canadian_shield"), new ResourceLocation("byg:borealis_grove"), new ResourceLocation("byg:cika_woods"), new ResourceLocation("byg:coniferous_forest"), new ResourceLocation("byg:dacite_ridges"), new ResourceLocation("byg:maple_taiga"), new ResourceLocation("byg:autumnal_taiga"), new ResourceLocation("byg:black_forest"), new ResourceLocation("byg:frosted_coniferous_forest"), new ResourceLocation("byg:howling_peaks")});
//    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
//
//    public static Feature<?> feature() {
//        FEATURE = new PeachFoxgloveFeature();
//        CONFIGURED_FEATURE = FeatureUtils.m_206488_((String)"serene_shrubbery:peach_foxglove", (Feature)FEATURE, (FeatureConfiguration)FeatureUtils.m_206480_((Feature)Feature.f_65741_, (FeatureConfiguration)new SimpleBlockConfiguration((BlockStateProvider)BlockStateProvider.m_191384_((BlockState)((Block)SereneShrubberyModBlocks.PEACH_FOXGLOVE.get()).m_49966_())), List.of(), (int)20));
//        PLACED_FEATURE = PlacementUtils.m_206509_((String)"serene_shrubbery:peach_foxglove", CONFIGURED_FEATURE, List.of(CountPlacement.m_191628_((int)1), RarityFilter.m_191900_((int)32), InSquarePlacement.m_191715_(), PlacementUtils.f_195352_, BiomeFilter.m_191561_()));
//        return FEATURE;
//    }
//
//    public static Holder<PlacedFeature> placedFeature() {
//        return PLACED_FEATURE;
//    }
//
//    public PeachFoxgloveFeature() {
//        super(RandomPatchConfiguration.f_67902_);
//    }
//
//    public boolean m_142674_(FeaturePlaceContext<RandomPatchConfiguration> context) {
//        WorldGenLevel world = context.m_159774_();
//        if (!this.generate_dimensions.contains((Object)world.m_6018_().m_46472_())) {
//            return false;
//        }
//        return super.m_142674_(context);
//    }
//}
//
