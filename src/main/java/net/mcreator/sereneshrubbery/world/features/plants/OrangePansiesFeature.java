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
//public class OrangePansiesFeature
//extends RandomPatchFeature {
//    public static OrangePansiesFeature FEATURE = null;
//    public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
//    public static Holder<PlacedFeature> PLACED_FEATURE = null;
//    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[]{new ResourceLocation("sunflower_plains"), new ResourceLocation("windswept_hills"), new ResourceLocation("sparse_jungle"), new ResourceLocation("plains"), new ResourceLocation("flower_forest"), new ResourceLocation("meadow"), new ResourceLocation("biomesoplenty:clover_patch"), new ResourceLocation("biomesoplenty:field"), new ResourceLocation("biomesoplenty:fir_clearing"), new ResourceLocation("biomesoplenty:grassland"), new ResourceLocation("biomesoplenty:highland"), new ResourceLocation("biomesoplenty:orchard"), new ResourceLocation("biomesoplenty:rocky_shrubland"), new ResourceLocation("biomesoplenty:scrubland"), new ResourceLocation("biomesoplenty:shrubland"), new ResourceLocation("biomesoplenty:wooded_scrubland"), new ResourceLocation("byg:temperate_grove"), new ResourceLocation("byg:coconino_meadow"), new ResourceLocation("byg:orchard"), new ResourceLocation("byg:autumnal_forest"), new ResourceLocation("byg:canadian_shield")});
//    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
//
//    public static Feature<?> feature() {
//        FEATURE = new OrangePansiesFeature();
//        CONFIGURED_FEATURE = FeatureUtils.m_206488_((String)"serene_shrubbery:orange_pansies", (Feature)FEATURE, (FeatureConfiguration)FeatureUtils.m_206480_((Feature)Feature.f_65741_, (FeatureConfiguration)new SimpleBlockConfiguration((BlockStateProvider)BlockStateProvider.m_191384_((BlockState)((Block)SereneShrubberyModBlocks.ORANGE_PANSIES.get()).m_49966_())), List.of(), (int)31));
//        PLACED_FEATURE = PlacementUtils.m_206509_((String)"serene_shrubbery:orange_pansies", CONFIGURED_FEATURE, List.of(CountPlacement.m_191628_((int)1), RarityFilter.m_191900_((int)32), InSquarePlacement.m_191715_(), PlacementUtils.f_195352_, BiomeFilter.m_191561_()));
//        return FEATURE;
//    }
//
//    public static Holder<PlacedFeature> placedFeature() {
//        return PLACED_FEATURE;
//    }
//
//    public OrangePansiesFeature() {
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
