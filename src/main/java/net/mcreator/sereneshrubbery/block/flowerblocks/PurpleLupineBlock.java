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
 *  net.minecraft.world.level.material.PushReaction
 *  net.minecraft.world.level.storage.loot.LootContext$Builder
 *  net.minecraft.world.phys.Vec3
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.VoxelShape
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.sereneshrubbery.block.flowerblocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class PurpleLupineBlock
extends FlowerBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final Supplier<MobEffect> mob_effect_supplier = new Supplier<MobEffect>() {
        @Override
        public MobEffect get() {
            return MobEffects.JUMP;
        }
    };

    public PurpleLupineBlock(Properties pProperties) {
        super(mob_effect_supplier, 0, pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        //super(BlockBehaviour.Properties.m_60939_((Material)Material.f_76300_).m_60918_(SoundType.f_56740_).m_60966_().m_60953_(s -> 1).m_60910_().m_60955_().m_60924_((bs, br, bp) -> false));
                //(BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
    }

    public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

//    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull CollisionContext context) {
//        Vec3 offset = state.getOffset(world, pos);
//        switch (state.getValue(FACING)) {
//            case WEST, EAST, NORTH -> {
//                return PurpleLupineBlock.box(0.0, 0.0, 0.0, 16.0, 32.0, 16.0)
//                        .move(offset.x, offset.y, offset.z);
//                        //.m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//            }
//        }
//        return PurpleLupineBlock.box(0.0, 0.0, 0.0, 16.0, 32.0, 16.0)
//                .move(offset.x, offset.y, offset.z);
//                //.m_83216_(offset.f_82479_, offset.f_82480_, offset.f_82481_);
//    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

//    public @NotNull BlockState rotate(BlockState state, Rotation rot) {
//        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
//    }
//
//    public @NotNull BlockState mirror(BlockState state, Mirror mirrorIn) {
//        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
//    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        //this.m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
    }

//    public PushReaction m_5537_(BlockState state) {
//        return PushReaction.DESTROY;
//    }

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
//        ItemBlockRenderTypes.setRenderLayer((Block)((Block)SereneShrubberyModBlocks.LUPINE.get()), renderType -> renderType == RenderType.m_110463_());
//    }
}

//FLOWER_PLAIN = FeatureUtils.register(
//        "flower_plain",
//        Feature.FLOWER,
//        new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(
//                Feature.SIMPLE_BLOCK,
//                new SimpleBlockConfiguration(
//                        new NoiseThresholdProvider(
//                                2345L, new NormalNoise.NoiseParameters(0, 1.0D), 0.005F, -0.8F, 0.33333334F,
//        Blocks.DANDELION.defaultBlockState(),
//        List.of(
//                Blocks.ORANGE_TULIP.defaultBlockState(),
//                Blocks.RED_TULIP.defaultBlockState(),
//                Blocks.PINK_TULIP.defaultBlockState(),
//                Blocks.WHITE_TULIP.defaultBlockState()),
//                List.of(Blocks.POPPY.defaultBlockState(),
//                Blocks.AZURE_BLUET.defaultBlockState(),
//                Blocks.OXEYE_DAISY.defaultBlockState(),
//                Blocks.CORNFLOWER.defaultBlockState()))))));