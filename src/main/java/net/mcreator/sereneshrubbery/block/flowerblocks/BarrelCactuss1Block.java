/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  net.minecraft.client.renderer.ItemBlockRenderTypes
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.context.BlockPlaceContext
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
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
 *  net.minecraft.world.phys.BlockHitResult
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
///import net.mcreator.sereneshrubbery.procedures.BarrelCactus2EntityCollidesInTheBlockProcedure;
//import net.mcreator.sereneshrubbery.procedures.BarrelCactuss1OnBlockRightClickedProcedure;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BarrelCactuss1Block
extends Block implements net.minecraftforge.common.IPlantable{

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape COLLISION_SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
    private static final Supplier<MobEffect> mob_effect_supplier = new Supplier<MobEffect>() {
        @Override
        public MobEffect get() {
            return MobEffects.JUMP;
        }
    };

//    @Override
//    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
//        return pState.is(BlockTags.DIRT) || pState.is(Blocks.FARMLAND) || pState.is(BlockTags.SAND);
//    }

    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pLevel.isAreaLoaded(pPos, 1)) return; // Forge: prevent growing cactus from loading unloaded chunks with block update
        if (!pState.canSurvive(pLevel, pPos)) {
            pLevel.destroyBlock(pPos, true);
        }

    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
//        for(Direction direction : Direction.Plane.HORIZONTAL) {
//            BlockState blockstate = pLevel.getBlockState(pPos.relative(direction));
//            if (!blockstate.is(BlockTags.DIRT) && !blockstate.is(Blocks.FARMLAND) &&  !blockstate.is(BlockTags.SAND) || pLevel.getFluidState(pPos.relative(direction)).is(FluidTags.LAVA)) {
//                return false;
//            }
//        }
        return true;
//        BlockState blockstate1 = pLevel.getBlockState(pPos.below());
//        return (blockstate1.is(BlockTags.DIRT) || blockstate1.is(Blocks.FARMLAND) || blockstate1.is(BlockTags.SAND)) &&
//                !pLevel.getBlockState(pPos.above()).getMaterial().isLiquid();
        //blockstate1.canSustainPlant(pLevel, pPos, Direction.UP, this)
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        pEntity.hurt(DamageSource.CACTUS, 1.0F);
    }

    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return COLLISION_SHAPE;
    }

    public BarrelCactuss1Block(Properties pProperties) {
        //super(mob_effect_supplier, 0, pProperties);
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        //this.m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return defaultBlockState();
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
//                return BarrelCactuss1Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)10.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//            case NORTH: {
//                return BarrelCactuss1Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)10.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//            case EAST: {
//                return BarrelCactuss1Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)10.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//            case WEST:
//        }
//        return BarrelCactuss1Block.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)10.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
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
//        return Collections.singletonList(new ItemStack((ItemLike)this, 1));
//    }
//
//    public void m_7892_(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
//        super.m_7892_(blockstate, world, pos, entity);
//        BarrelCactus2EntityCollidesInTheBlockProcedure.execute(entity);
//    }
//
//    public InteractionResult m_6227_(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
//        super.m_6227_(blockstate, world, pos, entity, hand, hit);
//        int x = pos.m_123341_();
//        int y = pos.m_123342_();
//        int z = pos.m_123343_();
//        double hitX = hit.m_82450_().f_82479_;
//        double hitY = hit.m_82450_().f_82480_;
//        double hitZ = hit.m_82450_().f_82481_;
//        Direction direction = hit.m_82434_();
//        BarrelCactuss1OnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
//        return InteractionResult.SUCCESS;
//    }
//
//    @OnlyIn(value=Dist.CLIENT)
//    public static void registerRenderLayer() {
//        ItemBlockRenderTypes.setRenderLayer((Block)((Block)SereneShrubberyModBlocks.BARREL_CACTUSS_1.get()), renderType -> renderType == RenderType.m_110463_());
//    }
}

