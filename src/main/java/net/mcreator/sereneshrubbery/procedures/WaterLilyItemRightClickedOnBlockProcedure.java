///*
// * Decompiled with CFR 0.150.
// *
// * Could not load the following classes:
// *  net.minecraft.client.Minecraft
// *  net.minecraft.core.BlockPos
// *  net.minecraft.core.Direction
// *  net.minecraft.resources.ResourceLocation
// *  net.minecraft.server.level.ServerPlayer
// *  net.minecraft.sounds.SoundEvent
// *  net.minecraft.sounds.SoundSource
// *  net.minecraft.world.entity.Entity
// *  net.minecraft.world.entity.player.Player
// *  net.minecraft.world.item.ItemStack
// *  net.minecraft.world.level.ClipContext
// *  net.minecraft.world.level.ClipContext$Block
// *  net.minecraft.world.level.ClipContext$Fluid
// *  net.minecraft.world.level.GameType
// *  net.minecraft.world.level.Level
// *  net.minecraft.world.level.LevelAccessor
// *  net.minecraft.world.level.block.Block
// *  net.minecraft.world.level.block.Blocks
// *  net.minecraft.world.level.block.state.BlockState
// *  net.minecraft.world.level.block.state.properties.DirectionProperty
// *  net.minecraft.world.level.block.state.properties.EnumProperty
// *  net.minecraft.world.level.block.state.properties.Property
// *  net.minecraft.world.phys.HitResult$Type
// *  net.minecraftforge.registries.ForgeRegistries
// */
//package net.mcreator.sereneshrubbery.procedures;
//
//import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
//import net.minecraft.client.Minecraft;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Direction;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.sounds.SoundEvent;
//import net.minecraft.sounds.SoundSource;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.ClipContext;
//import net.minecraft.world.level.GameType;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.LevelAccessor;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.properties.DirectionProperty;
//import net.minecraft.world.level.block.state.properties.EnumProperty;
//import net.minecraft.world.level.block.state.properties.Property;
//import net.minecraft.world.phys.HitResult;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class WaterLilyItemRightClickedOnBlockProcedure {
//    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
//        block25: {
//            block27: {
//                block26: {
//                    EnumProperty _ap;
//                    DirectionProperty _dp;
//                    Property _property;
//                    BlockState _bs;
//                    BlockPos _pos;
//                    Direction _dir;
//                    if (entity == null) {
//                        return;
//                    }
//                    double raytrace_y = 0.0;
//                    double raytrace_x = 0.0;
//                    double raytrace_z = 0.0;
//                    if (entity.f_19853_.m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_6662_() != HitResult.Type.BLOCK || new Object(){
//
//                        public boolean checkGamemode(Entity _ent) {
//                            if (_ent instanceof ServerPlayer) {
//                                ServerPlayer _serverPlayer = (ServerPlayer)_ent;
//                                return _serverPlayer.f_8941_.m_9290_() == GameType.ADVENTURE;
//                            }
//                            if (_ent.f_19853_.m_5776_() && _ent instanceof Player) {
//                                Player _player = (Player)_ent;
//                                return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.ADVENTURE;
//                            }
//                            return false;
//                        }
//                    }.checkGamemode(entity) || world.m_6425_(new BlockPos(raytrace_x = (double)entity.f_19853_.m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_82425_().m_123341_(), raytrace_y = (double)entity.f_19853_.m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_82425_().m_123342_(), raytrace_z = (double)entity.f_19853_.m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_82425_().m_123343_())).m_76188_().m_60734_() != Blocks.f_49990_ || !world.m_46859_(new BlockPos(raytrace_x, raytrace_y + 1.0, raytrace_z))) break block25;
//                    if (Math.random() < 0.5) {
//                        world.m_7731_(new BlockPos(raytrace_x, raytrace_y + 1.0, raytrace_z), ((Block)SereneShrubberyModBlocks.WATER_LILY.get()).m_49966_(), 3);
//                    }
//                    if (Math.random() < 0.5) {
//                        world.m_7731_(new BlockPos(raytrace_x, raytrace_y + 1.0, raytrace_z), ((Block)SereneShrubberyModBlocks.WATER_LILY_2.get()).m_49966_(), 3);
//                    }
//                    if (Math.random() < 0.4) {
//                        _dir = Direction.NORTH;
//                        _pos = new BlockPos(x, y, z);
//                        _bs = world.m_8055_(_pos);
//                        _property = _bs.m_60734_().m_49965_().m_61081_("facing");
//                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains((Object)_dir)) {
//                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
//                        } else {
//                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
//                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains((Object)_dir.m_122434_())) {
//                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
//                            }
//                        }
//                    }
//                    if (Math.random() < 0.4) {
//                        _dir = Direction.SOUTH;
//                        _pos = new BlockPos(x, y, z);
//                        _bs = world.m_8055_(_pos);
//                        _property = _bs.m_60734_().m_49965_().m_61081_("facing");
//                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains((Object)_dir)) {
//                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
//                        } else {
//                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
//                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains((Object)_dir.m_122434_())) {
//                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
//                            }
//                        }
//                    }
//                    if (Math.random() < 0.4) {
//                        _dir = Direction.WEST;
//                        _pos = new BlockPos(x, y, z);
//                        _bs = world.m_8055_(_pos);
//                        _property = _bs.m_60734_().m_49965_().m_61081_("facing");
//                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains((Object)_dir)) {
//                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
//                        } else {
//                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
//                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains((Object)_dir.m_122434_())) {
//                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
//                            }
//                        }
//                    }
//                    if (Math.random() < 0.4) {
//                        _dir = Direction.EAST;
//                        _pos = new BlockPos(x, y, z);
//                        _bs = world.m_8055_(_pos);
//                        _property = _bs.m_60734_().m_49965_().m_61081_("facing");
//                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains((Object)_dir)) {
//                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
//                        } else {
//                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
//                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains((Object)_dir.m_122434_())) {
//                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
//                            }
//                        }
//                    }
//                    if (!(entity instanceof Player)) break block26;
//                    Player _plr = (Player)entity;
//                    if (_plr.m_150110_().f_35937_) break block27;
//                }
//                itemstack.m_41774_(1);
//            }
//            if (world instanceof Level) {
//                Level _level = (Level)world;
//                if (!_level.m_5776_()) {
//                    _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lily_pad.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
//                } else {
//                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lily_pad.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
//                }
//            }
//        }
//    }
//}
//
