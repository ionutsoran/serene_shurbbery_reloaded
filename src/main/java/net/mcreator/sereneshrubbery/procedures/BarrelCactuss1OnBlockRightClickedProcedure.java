///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  net.minecraft.core.BlockPos
// *  net.minecraft.core.particles.ParticleOptions
// *  net.minecraft.core.particles.ParticleTypes
// *  net.minecraft.server.level.ServerLevel
// *  net.minecraft.world.Container
// *  net.minecraft.world.entity.Entity
// *  net.minecraft.world.entity.LivingEntity
// *  net.minecraft.world.entity.player.Player
// *  net.minecraft.world.item.ItemStack
// *  net.minecraft.world.item.Items
// *  net.minecraft.world.level.ItemLike
// *  net.minecraft.world.level.LevelAccessor
// *  net.minecraft.world.level.block.Block
// */
//package net.mcreator.sereneshrubbery.procedures;
//
//import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.particles.ParticleOptions;
//import net.minecraft.core.particles.ParticleTypes;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.world.Container;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.level.ItemLike;
//import net.minecraft.world.level.LevelAccessor;
//import net.minecraft.world.level.block.Block;
//
//public class BarrelCactuss1OnBlockRightClickedProcedure {
//    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
//        ItemStack itemStack;
//        if (entity == null) {
//            return;
//        }
//        if (entity instanceof LivingEntity) {
//            LivingEntity _livEnt = (LivingEntity)entity;
//            itemStack = _livEnt.m_21205_();
//        } else {
//            itemStack = ItemStack.f_41583_;
//        }
//        if (itemStack.m_41720_() == Items.f_42499_ && Math.random() < 0.3) {
//            world.m_7731_(new BlockPos(x, y, z), ((Block)SereneShrubberyModBlocks.BARREL_CACTUS_2.get()).m_49966_(), 3);
//            if (world instanceof ServerLevel) {
//                ServerLevel _level = (ServerLevel)world;
//                _level.m_8767_((ParticleOptions)ParticleTypes.f_123748_, x, y, z, 10, 1.0, 1.0, 1.0, 0.1);
//            }
//            if (entity instanceof Player) {
//                Player _player = (Player)entity;
//                ItemStack _stktoremove = new ItemStack((ItemLike)Items.f_42499_);
//                _player.m_150109_().m_36022_(p -> _stktoremove.m_41720_() == p.m_41720_(), 1, (Container)_player.f_36095_.m_39730_());
//            }
//        }
//    }
//}
//
