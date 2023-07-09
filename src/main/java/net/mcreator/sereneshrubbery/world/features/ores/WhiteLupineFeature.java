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
//import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
//import net.minecraft.world.level.levelgen.feature.OreFeature;
//import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
//import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
//import net.minecraft.world.level.levelgen.placement.BiomeFilter;
//import net.minecraft.world.level.levelgen.placement.CountPlacement;
//import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
//import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
//import net.minecraft.world.level.levelgen.placement.PlacedFeature;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
//import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
//
//public class WhiteLupineFeature
//extends OreFeature {
//    public static WhiteLupineFeature FEATURE = null;
//    public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
//    public static Holder<PlacedFeature> PLACED_FEATURE = null;
//    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[]{new ResourceLocation("windswept_hills"), new ResourceLocation("biomesoplenty:coniferous_forest"), new ResourceLocation("biomesoplenty:fir_clearing"), new ResourceLocation("biomesoplenty:snowy_coniferous_forest"), new ResourceLocation("biomesoplenty:snowy_fir_clearing"), new ResourceLocation("biomesoplenty:forested_field"), new ResourceLocation("biomesoplenty:highland"), new ResourceLocation("biomesoplenty:highland_moor"), new ResourceLocation("biomesoplenty:jade_cliffs"), new ResourceLocation("biomesoplenty:maple_woods"), new ResourceLocation("biomesoplenty:snowy_maple_woods"), new ResourceLocation("biomesoplenty:mediterranean_forest"), new ResourceLocation("biomesoplenty:redwood_forest"), new ResourceLocation("byg:redwood_thicket"), new ResourceLocation("byg:canadian_shield"), new ResourceLocation("byg:borealis_grove"), new ResourceLocation("byg:cika_woods"), new ResourceLocation("byg:coniferous_forest"), new ResourceLocation("byg:dacite_ridges"), new ResourceLocation("byg:maple_taiga"), new ResourceLocation("byg:autumnal_taiga"), new ResourceLocation("byg:black_forest"), new ResourceLocation("byg:frosted_coniferous_forest"), new ResourceLocation("byg:howling_peaks")});
//    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
//
//    public static Feature<?> feature() {
//        FEATURE = new WhiteLupineFeature();
//        CONFIGURED_FEATURE = FeatureUtils.m_206488_((String)"serene_shrubbery:white_lupine", (Feature)FEATURE, (FeatureConfiguration)new OreConfiguration((RuleTest)WhiteLupineFeatureRuleTest.INSTANCE, ((Block)SereneShrubberyModBlocks.WHITE_LUPINE.get()).m_49966_(), 5));
//        PLACED_FEATURE = PlacementUtils.m_206509_((String)"serene_shrubbery:white_lupine", CONFIGURED_FEATURE, List.of(CountPlacement.m_191628_((int)30), InSquarePlacement.m_191715_(), HeightRangePlacement.m_191680_((VerticalAnchor)VerticalAnchor.m_158922_((int)0), (VerticalAnchor)VerticalAnchor.m_158922_((int)100)), BiomeFilter.m_191561_()));
//        return FEATURE;
//    }
//
//    public static Holder<PlacedFeature> placedFeature() {
//        return PLACED_FEATURE;
//    }
//
//    public WhiteLupineFeature() {
//        super(OreConfiguration.f_67837_);
//    }
//
//    public boolean m_142674_(FeaturePlaceContext<OreConfiguration> context) {
//        WorldGenLevel world = context.m_159774_();
//        if (!this.generate_dimensions.contains((Object)world.m_6018_().m_46472_())) {
//            return false;
//        }
//        return super.m_142674_(context);
//    }
//
//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
//    private static class WhiteLupineFeatureRuleTest
//    extends RuleTest {
//        static final WhiteLupineFeatureRuleTest INSTANCE = new WhiteLupineFeatureRuleTest();
//        private static final Codec<WhiteLupineFeatureRuleTest> CODEC = Codec.unit(() -> INSTANCE);
//        private static final RuleTestType<WhiteLupineFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;
//        private List<Block> base_blocks = null;
//
//        private WhiteLupineFeatureRuleTest() {
//        }
//
//        @SubscribeEvent
//        public static void init(FMLCommonSetupEvent event) {
//            Registry.m_122965_((Registry)Registry.f_122861_, (ResourceLocation)new ResourceLocation("serene_shrubbery:white_lupine_match"), CUSTOM_MATCH);
//        }
//
//        public boolean m_7715_(BlockState blockAt, Random random) {
//            if (this.base_blocks == null) {
//                this.base_blocks = List.of(Blocks.f_50034_, Blocks.f_50035_, Blocks.f_50111_, Blocks.f_50112_, (Block)SereneShrubberyModBlocks.PEACH_FOXGLOVE.get(), (Block)SereneShrubberyModBlocks.PURPLE_FOXGLOVE.get(), (Block)SereneShrubberyModBlocks.WHITE_FOXGLOVE.get(), (Block)SereneShrubberyModBlocks.SUNSET_FOXGLOVE.get());
//            }
//            return this.base_blocks.contains((Object)blockAt.m_60734_());
//        }
//
//        protected RuleTestType<?> m_7319_() {
//            return CUSTOM_MATCH;
//        }
//    }
//}
//
