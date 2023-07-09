/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  net.minecraft.client.renderer.ItemBlockRenderTypes
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.context.BlockPlaceContext
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.HorizontalDirectionalBlock
 *  net.minecraft.world.level.block.Mirror
 *  net.minecraft.world.level.block.Rotation
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.StateDefinition$Builder
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.material.Material
 *  net.minecraft.world.level.storage.loot.LootContext$Builder
 *  net.minecraft.world.phys.Vec3
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.VoxelShape
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.sereneshrubbery.block.flowerblocks;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
import net.mcreator.sereneshrubbery.item.SereneShrubberyModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WaterLily2Block
extends FlowerBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final Supplier<MobEffect> mob_effect_supplier = new Supplier<MobEffect>() {
        @Override
        public MobEffect get() {
            return MobEffects.JUMP;
        }
    };

    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        super.entityInside(pState, pLevel, pPos, pEntity);
        if (pLevel instanceof ServerLevel && pEntity instanceof Boat) {
            pLevel.destroyBlock(new BlockPos(pPos), true, pEntity);
        }
    }

    public WaterLily2Block(Properties pProperties) {
        super(mob_effect_supplier, 0, pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        //this.m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
    }

//    public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
//        return true;
//    }
//
//    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
//        return 0;
//    }
//
//    public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
//        Vec3 offset = state.m_60824_(world, pos);
//        switch ((Direction)state.m_61143_((Property)FACING)) {
//            default: {
//                return WaterLily2Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)1.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//            case NORTH: {
//                return WaterLily2Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)1.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//            case EAST: {
//                return WaterLily2Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)1.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//            case WEST:
//        }
//        return WaterLily2Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)1.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//    }
//
//    protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
//        builder.m_61104_(new Property[]{FACING});
//    }
//
//    public BlockState m_6843_(BlockState state, Rotation rot) {
//        return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
//    }
//
//    public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
//        return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
//    }
//
//    public BlockState m_5573_(BlockPlaceContext context) {
//        return (BlockState)this.m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
//    }
//
//    public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
//        List dropsOriginal = super.m_7381_(state, builder);
//        if (!dropsOriginal.isEmpty()) {
//            return dropsOriginal;
//        }
//        return Collections.singletonList(new ItemStack((ItemLike)SereneShrubberyModItems.WATER_LILY_ITEM.get()));
//    }
//
//    @OnlyIn(value=Dist.CLIENT)
//    public static void registerRenderLayer() {
//        ItemBlockRenderTypes.setRenderLayer((Block)((Block)SereneShrubberyModBlocks.WATER_LILY_2.get()), renderType -> renderType == RenderType.m_110463_());
//    }
}

