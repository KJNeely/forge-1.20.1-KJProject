package net.kjshroomish.kjproject.item;

import net.kjshroomish.kjproject.KJ_Project;
import net.kjshroomish.kjproject.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KJ_Project.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TEST_ITEM.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // Items will appear in the same order in creative as listed here.
                        pOutput.accept(ModItems.TEST_ITEM.get());

                        // WALLPAPER
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_A.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_B.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_C.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_D.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_E.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_F.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_G.get());
                        pOutput.accept(ModBlocks.WALLPAPER_FLOWERY_H.get());

                        pOutput.accept(ModBlocks.WALLPAPER_MUSHROOM_A.get());

                        // WALL PANELS

                        pOutput.accept(ModBlocks.PANEL_RED_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_RED_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_RED_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_RED_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_ORANGE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_ORANGE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_ORANGE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_ORANGE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_YELLOW_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_YELLOW_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_YELLOW_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_YELLOW_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_GREEN_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_GREEN_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_GREEN_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_GREEN_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_LIME_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_LIME_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_LIME_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_LIME_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_BLUE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_BLUE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_BLUE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_BLUE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_LIGHT_BLUE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_LIGHT_BLUE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_LIGHT_BLUE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_LIGHT_BLUE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_PURPLE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_PURPLE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_PURPLE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_PURPLE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_PINK_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_PINK_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_PINK_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_PINK_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_MAGENTA_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_MAGENTA_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_MAGENTA_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_MAGENTA_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_CYAN_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_CYAN_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_CYAN_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_CYAN_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_BLACK_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_BLACK_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_BLACK_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_BLACK_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_WHITE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_WHITE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_WHITE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_WHITE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_LIGHT_GRAY_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_LIGHT_GRAY_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_LIGHT_GRAY_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_LIGHT_GRAY_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_BROWN_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_BROWN_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_BROWN_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_BROWN_TOP.get());

                        // Wood-Type Variants

                        pOutput.accept(ModBlocks.PANEL_BIRCH_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_BIRCH_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_BIRCH_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_BIRCH_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_SPRUCE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_SPRUCE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_SPRUCE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_SPRUCE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_DARK_OAK_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_DARK_OAK_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_DARK_OAK_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_DARK_OAK_TOP.get());

                        // Acacia
                        pOutput.accept(ModBlocks.PANEL_ACACIA_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_ACACIA_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_ACACIA_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_ACACIA_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_MANGROVE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_MANGROVE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_MANGROVE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_MANGROVE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_CHERRY_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_CHERRY_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_CHERRY_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_CHERRY_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_WARPED_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_WARPED_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_WARPED_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_WARPED_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_CRIMSON_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_CRIMSON_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_CRIMSON_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_CRIMSON_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_JUNGLE_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_JUNGLE_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_JUNGLE_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_JUNGLE_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_BAMBOO_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_BAMBOO_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_BAMBOO_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_BAMBOO_TOP.get());

                        pOutput.accept(ModBlocks.PANEL_OAK_BLOCK.get());
                        pOutput.accept(ModBlocks.PANEL_OAK_BOTTOM.get());
                        pOutput.accept(ModBlocks.PANEL_OAK_MIDDLE.get());
                        pOutput.accept(ModBlocks.PANEL_OAK_TOP.get());

                        pOutput.accept(ModBlocks.BOARDS_ACACIA.get());
                        pOutput.accept(ModBlocks.BOARDS_BIRCH.get());
                        pOutput.accept(ModBlocks.BOARDS_CHERRY.get());
                        pOutput.accept(ModBlocks.BOARDS_CRIMSON.get());
                        pOutput.accept(ModBlocks.BOARDS_DARK_OAK.get());
                        pOutput.accept(ModBlocks.BOARDS_JUNGLE.get());
                        pOutput.accept(ModBlocks.BOARDS_MANGROVE.get());
                        pOutput.accept(ModBlocks.BOARDS_OAK.get());
                        pOutput.accept(ModBlocks.BOARDS_SPRUCE.get());
                        pOutput.accept(ModBlocks.BOARDS_WARPED.get());

                        pOutput.accept(ModBlocks.SIDE_BOARDS_ACACIA.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_BIRCH.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_CHERRY.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_CRIMSON.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_DARK_OAK.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_JUNGLE.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_MANGROVE.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_OAK.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_SPRUCE.get());
                        pOutput.accept(ModBlocks.SIDE_BOARDS_WARPED.get());

                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_ACACIA.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_BIRCH.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_CHERRY.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_CRIMSON.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_DARK_OAK.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_JUNGLE.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_MANGROVE.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_OAK.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_SPRUCE.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_WARPED.get());

                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_ACACIA_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_BIRCH_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_CHERRY_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_CRIMSON_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_DARK_OAK_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_JUNGLE_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_MANGROVE_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_OAK_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_SPRUCE_CORNER.get());
                        pOutput.accept(ModBlocks.KITCHEN_COUNTER_WARPED_CORNER.get());

                        pOutput.accept(ModBlocks.COUNTER_TEST.get());

                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
