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
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PinkLupineBlock
extends FlowerBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    private static final Supplier<MobEffect> mob_effect_supplier = new Supplier<MobEffect>() {
        @Override
        public MobEffect get() {
            return MobEffects.JUMP;
        }
    };


    public PinkLupineBlock(Properties pProperties) {
        super(mob_effect_supplier, 0, pProperties);
        //super(BlockBehaviour.Properties.m_60939_((Material)Material.f_76300_).m_60918_(SoundType.f_56740_).m_60966_().m_60953_(s -> 1).m_60910_().m_60955_().m_60924_((bs, br, bp) -> false));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

//    public BlockState rotate(BlockState state, Rotation rot) {
//        return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
//    }
//
//    public BlockState mirror(BlockState state, Mirror mirrorIn) {
//        return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
//    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

//    public List<ItemStack> dropResources(BlockState state, LootContext.Builder builder) {
//        List dropsOriginal = super.m_7381_(state, builder);
//        if (!dropsOriginal.isEmpty()) {
//            return dropsOriginal;
//        }
//        return Collections.singletonList(new ItemStack((ItemLike)this, 1));
//    }

//    @OnlyIn(value=Dist.CLIENT)
//    public static void registerRenderLayer() {
//        ItemBlockRenderTypes.setRenderLayer((Block)((Block)SereneShrubberyModBlocks.PINK_LUPINE.get()), renderType -> renderType == RenderType.m_110463_());
//    }
}

