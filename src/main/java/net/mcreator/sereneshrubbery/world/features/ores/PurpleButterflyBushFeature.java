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
//public class PurpleButterflyBushFeature
//extends OreFeature {
//    public static PurpleButterflyBushFeature FEATURE = null;
//    public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
//    public static Holder<PlacedFeature> PLACED_FEATURE = null;
//    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[]{new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("plains"), new ResourceLocation("flower_forest"), new ResourceLocation("biomesoplenty:field"), new ResourceLocation("biomesoplenty:fir_clearing"), new ResourceLocation("biomesoplenty:grassland"), new ResourceLocation("biomesoplenty:highland"), new ResourceLocation("biomesoplenty:highland_moor"), new ResourceLocation("biomesoplenty:mediterranean_forest"), new ResourceLocation("biomesoplenty:rocky_shrubland"), new ResourceLocation("biomesoplenty:shrubland"), new ResourceLocation("biomesoplenty:wooded_scrubland"), new ResourceLocation("byg:amaranth_fields"), new ResourceLocation("byg:temperate_grove"), new ResourceLocation("byg:coconino_meadow"), new ResourceLocation("byg:orchard")});
//    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
//
//    public static Feature<?> feature() {
//        FEATURE = new PurpleButterflyBushFeature();
//        CONFIGURED_FEATURE = FeatureUtils.m_206488_((String)"serene_shrubbery:purple_butterfly_bush", (Feature)FEATURE, (FeatureConfiguration)new OreConfiguration((RuleTest)PurpleButterflyBushFeatureRuleTest.INSTANCE, ((Block)SereneShrubberyModBlocks.PURPLE_BUTTERFLY_BUSH.get()).m_49966_(), 5));
//        PLACED_FEATURE = PlacementUtils.m_206509_((String)"serene_shrubbery:purple_butterfly_bush", CONFIGURED_FEATURE, List.of(CountPlacement.m_191628_((int)30), InSquarePlacement.m_191715_(), HeightRangePlacement.m_191680_((VerticalAnchor)VerticalAnchor.m_158922_((int)0), (VerticalAnchor)VerticalAnchor.m_158922_((int)70)), BiomeFilter.m_191561_()));
//        return FEATURE;
//    }
//
//    public static Holder<PlacedFeature> placedFeature() {
//        return PLACED_FEATURE;
//    }
//
//    public PurpleButterflyBushFeature() {
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
//    private static class PurpleButterflyBushFeatureRuleTest
//    extends RuleTest {
//        static final PurpleButterflyBushFeatureRuleTest INSTANCE = new PurpleButterflyBushFeatureRuleTest();
//        private static final Codec<PurpleButterflyBushFeatureRuleTest> CODEC = Codec.unit(() -> INSTANCE);
//        private static final RuleTestType<PurpleButterflyBushFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;
//        private List<Block> base_blocks = null;
//
//        private PurpleButterflyBushFeatureRuleTest() {
//        }
//
//        @SubscribeEvent
//        public static void init(FMLCommonSetupEvent event) {
//            Registry.m_122965_((Registry)Registry.f_122861_, (ResourceLocation)new ResourceLocation("serene_shrubbery:purple_butterfly_bush_match"), CUSTOM_MATCH);
//        }
//
//        public boolean m_7715_(BlockState blockAt, Random random) {
//            if (this.base_blocks == null) {
//                this.base_blocks = List.of(Blocks.f_50034_, Blocks.f_50114_, Blocks.f_50111_, Blocks.f_50112_, (Block)SereneShrubberyModBlocks.RED_PANSIES.get(), (Block)SereneShrubberyModBlocks.YELLOW_PANSIES.get(), (Block)SereneShrubberyModBlocks.WHITE_PANSIES.get(), (Block)SereneShrubberyModBlocks.ORANGE_PANSIES.get(), (Block)SereneShrubberyModBlocks.PINK_PANSIES.get(), (Block)SereneShrubberyModBlocks.PURPLE_PANSIES.get());
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
