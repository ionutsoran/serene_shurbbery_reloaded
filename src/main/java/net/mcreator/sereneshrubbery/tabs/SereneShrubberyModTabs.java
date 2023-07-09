/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.sereneshrubbery.tabs;

import net.mcreator.sereneshrubbery.block.SereneShrubberyModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SereneShrubberyModTabs {

    public static final CreativeModeTab TAB_SERENE_SHRUBBERY = new CreativeModeTab("serene_shrubbery_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SereneShrubberyModBlocks.PURPLE_LUPINE.get().asItem());
        }
    };

//    public static void load() {
//        TAB_SERENE_SHRUBBERY = new CreativeModeTab("tabserene_shrubbery"){
//
//            public ItemStack m_6976_() {
//                return new ItemStack((ItemLike)SereneShrubberyModBlocks.PURPLE_FOXGLOVE.get());
//            }
//
//            @OnlyIn(value=Dist.CLIENT)
//            public boolean hasSearchBar() {
//                return false;
//            }
//        };
//    }
}

