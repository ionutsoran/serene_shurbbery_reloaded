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
//public class WhiteHydrangeaFeature
//extends RandomPatchFeature {
//    public static WhiteHydrangeaFeature FEATURE = null;
//    public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
//    public static Holder<PlacedFeature> PLACED_FEATURE = null;
//    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[]{new ResourceLocation("bamboo_jungle"), new ResourceLocation("beach"), new ResourceLocation("flower_forest"), new ResourceLocation("river"), new ResourceLocation("biomesoplenty:bamboo_grove"), new ResourceLocation("biomesoplenty:cherry_blossom_grove"), new ResourceLocation("biomesoplenty:field"), new ResourceLocation("biomesoplenty:floodplain"), new ResourceLocation("biomesoplenty:marsh"), new ResourceLocation("biomesoplenty:mystic_grove"), new ResourceLocation("biomesoplenty:tropics"), new ResourceLocation("byg:crag_gardens"), new ResourceLocation("byg:cherry_blossom_forest"), new ResourceLocation("byg:coconino_meadow")});
//    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
//
//    public static Feature<?> feature() {
//        FEATURE = new WhiteHydrangeaFeature();
//        CONFIGURED_FEATURE = FeatureUtils.m_206488_((String)"serene_shrubbery:white_hydrangea", (Feature)FEATURE, (FeatureConfiguration)FeatureUtils.m_206480_((Feature)Feature.f_65741_, (FeatureConfiguration)new SimpleBlockConfiguration((BlockStateProvider)BlockStateProvider.m_191384_((BlockState)((Block)SereneShrubberyModBlocks.WHITE_HYDRANGEA.get()).m_49966_())), List.of(), (int)10));
//        PLACED_FEATURE = PlacementUtils.m_206509_((String)"serene_shrubbery:white_hydrangea", CONFIGURED_FEATURE, List.of(CountPlacement.m_191628_((int)1), RarityFilter.m_191900_((int)32), InSquarePlacement.m_191715_(), PlacementUtils.f_195352_, BiomeFilter.m_191561_()));
//        return FEATURE;
//    }
//
//    public static Holder<PlacedFeature> placedFeature() {
//        return PLACED_FEATURE;
//    }
//
//    public WhiteHydrangeaFeature() {
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