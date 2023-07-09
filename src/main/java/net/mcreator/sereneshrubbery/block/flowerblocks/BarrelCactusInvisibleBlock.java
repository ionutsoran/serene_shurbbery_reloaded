///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  net.minecraft.client.renderer.ItemBlockRenderTypes
// *  net.minecraft.client.renderer.RenderType
// *  net.minecraft.core.BlockPos
// *  net.minecraft.core.Direction
// *  net.minecraft.server.level.ServerLevel
// *  net.minecraft.world.effect.MobEffects
// *  net.minecraft.world.item.ItemStack
// *  net.minecraft.world.level.BlockGetter
// *  net.minecraft.world.level.ItemLike
// *  net.minecraft.world.level.LevelAccessor
// *  net.minecraft.world.level.block.Block
// *  net.minecraft.world.level.block.FlowerBlock
// *  net.minecraft.world.level.block.SoundType
// *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
// *  net.minecraft.world.level.block.state.BlockState
// *  net.minecraft.world.level.material.Material
// *  net.minecraft.world.level.storage.loot.LootContext$Builder
// *  net.minecraftforge.api.distmarker.Dist
// *  net.minecraftforge.api.distmarker.OnlyIn
// *  net.minecraftforge.common.PlantType
// */
//package net.mcreator.sereneshrubbery.block.flowerblocks;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.mcreator.sereneshrubbery.procedures.BarrelCactusInvisibleUpdateTickProcedure;
//import net.minecraft.client.renderer.ItemBlockRenderTypes;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Direction;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.world.effect.MobEffects;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.ItemLike;
//import net.minecraft.world.level.LevelAccessor;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.FlowerBlock;
//import net.minecraft.world.level.block.SoundType;
//import net.minecraft.world.level.block.state.BlockBehaviour;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.material.Material;
//import net.minecraft.world.level.storage.loot.LootContext;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraftforge.common.PlantType;
//
//public class BarrelCactusInvisibleBlock
//extends FlowerBlock {
//    public BarrelCactusInvisibleBlock() {
//        super(MobEffects.f_19596_, 100, BlockBehaviour.Properties.m_60939_((Material)Material.f_76300_).m_60977_().m_60910_().m_60918_(SoundType.f_56740_).m_60966_());
//    }
//
//    public int m_53522_() {
//        return 100;
//    }
//
//    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
//        return 100;
//    }
//
//    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
//        return 60;
//    }
//
//    public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
//        List dropsOriginal = super.m_7381_(state, builder);
//        if (!dropsOriginal.isEmpty()) {
//            return dropsOriginal;
//        }
//        return Collections.singletonList(new ItemStack((ItemLike)this, 1));
//    }
//
//    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
//        return PlantType.DESERT;
//    }
//
//    public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
//        super.m_7458_(blockstate, world, pos, random);
//        BarrelCactusInvisibleUpdateTickProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
//    }
//
//    @OnlyIn(value=Dist.CLIENT)
//    public static void registerRenderLayer() {
//        ItemBlockRenderTypes.setRenderLayer((Block)((Block)SereneShrubberyModBlocks.BARREL_CACTUS_INVISIBLE.get()), renderType -> renderType == RenderType.m_110463_());
//    }
//}
//
