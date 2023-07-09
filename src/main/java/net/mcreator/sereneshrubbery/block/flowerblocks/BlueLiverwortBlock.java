/*
 * Decompiled with CFR 0.150.
 *
 * Could not load the following classes:
 *  net.minecraft.client.renderer.ItemBlockRenderTypes
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.FlowerBlock
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
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
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlueLiverwortBlock
extends FlowerBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    //protected static final VoxelShape COLLISION_SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
    private static final Supplier<MobEffect> mob_effect_supplier = new Supplier<MobEffect>() {
        @Override
        public MobEffect get() {
            return MobEffects.JUMP;
        }
    };

    public BlueLiverwortBlock(Properties pProperties) {
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

//    public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
//        Vec3 offset = state.m_60824_(world, pos);
//        return BlueLiverwortBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)5.0, (double)16.0).m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
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
//    @OnlyIn(value=Dist.CLIENT)
//    public static void registerRenderLayer() {
//        ItemBlockRenderTypes.setRenderLayer((Block)((Block)SereneShrubberyModBlocks.BLUE_LIVERWORT.get()), renderType -> renderType == RenderType.m_110463_());
//    }
}

