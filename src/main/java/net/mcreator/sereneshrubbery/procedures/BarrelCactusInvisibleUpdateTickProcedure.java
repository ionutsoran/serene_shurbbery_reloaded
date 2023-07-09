///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  net.minecraft.core.BlockPos
// *  net.minecraft.world.level.LevelAccessor
// *  net.minecraft.world.level.block.Block
// */
//package net.mcreator.sereneshrubbery.procedures;
//
//import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.level.LevelAccessor;
//import net.minecraft.world.level.block.Block;
//
//public class BarrelCactusInvisibleUpdateTickProcedure {
//    public static void execute(LevelAccessor world, double x, double y, double z) {
//        if (Math.random() < 0.5) {
//            world.m_7731_(new BlockPos(x, y, z), ((Block)SereneShrubberyModBlocks.BARREL_CACTUS_2.get()).m_49966_(), 3);
//        } else {
//            world.m_7731_(new BlockPos(x, y, z), ((Block)SereneShrubberyModBlocks.BARREL_CACTUSS_1.get()).m_49966_(), 3);
//        }
//    }
//}
//
