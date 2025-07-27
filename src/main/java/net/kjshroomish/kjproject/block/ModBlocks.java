package net.kjshroomish.kjproject.block;

import net.kjshroomish.kjproject.block.custom.CounterBlock;
import net.kjshroomish.kjproject.KJ_Project;
import net.kjshroomish.kjproject.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KJ_Project.MOD_ID);

    //WALLPAPERS
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_A = registerBlock("wallpaper_flowery_a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_B = registerBlock("wallpaper_flowery_b",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_C = registerBlock("wallpaper_flowery_c",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_D = registerBlock("wallpaper_flowery_d",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_E = registerBlock("wallpaper_flowery_e",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_F = registerBlock("wallpaper_flowery_f",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_G = registerBlock("wallpaper_flowery_g",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WALLPAPER_FLOWERY_H = registerBlock("wallpaper_flowery_h",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> WALLPAPER_MUSHROOM_A = registerBlock("wallpaper_mushroom_a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    //WALL PANELS

    public static final RegistryObject<Block> PANEL_BLUE_BLOCK = registerBlock("panel_blue_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BLUE_BOTTOM = registerBlock("panel_blue_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BLUE_MIDDLE = registerBlock("panel_blue_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BLUE_TOP = registerBlock("panel_blue_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_BLACK_BLOCK = registerBlock("panel_black_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BLACK_BOTTOM = registerBlock("panel_black_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BLACK_MIDDLE = registerBlock("panel_black_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BLACK_TOP = registerBlock("panel_black_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_PURPLE_BLOCK = registerBlock("panel_purple_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_PURPLE_BOTTOM = registerBlock("panel_purple_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_PURPLE_MIDDLE = registerBlock("panel_purple_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_PURPLE_TOP = registerBlock("panel_purple_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_GREEN_BLOCK = registerBlock("panel_green_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_GREEN_BOTTOM = registerBlock("panel_green_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_GREEN_MIDDLE = registerBlock("panel_green_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_GREEN_TOP = registerBlock("panel_green_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_YELLOW_BLOCK = registerBlock("panel_yellow_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_YELLOW_BOTTOM = registerBlock("panel_yellow_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_YELLOW_MIDDLE = registerBlock("panel_yellow_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_YELLOW_TOP = registerBlock("panel_yellow_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_LIGHT_BLUE_BLOCK = registerBlock("panel_light_blue_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIGHT_BLUE_BOTTOM = registerBlock("panel_light_blue_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIGHT_BLUE_MIDDLE = registerBlock("panel_light_blue_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIGHT_BLUE_TOP = registerBlock("panel_light_blue_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_BROWN_BLOCK = registerBlock("panel_brown_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BROWN_BOTTOM = registerBlock("panel_brown_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BROWN_MIDDLE = registerBlock("panel_brown_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BROWN_TOP = registerBlock("panel_brown_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_MAGENTA_BLOCK = registerBlock("panel_magenta_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_MAGENTA_BOTTOM = registerBlock("panel_magenta_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_MAGENTA_MIDDLE = registerBlock("panel_magenta_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_MAGENTA_TOP = registerBlock("panel_magenta_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_RED_BLOCK = registerBlock("panel_red_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_RED_BOTTOM = registerBlock("panel_red_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_RED_MIDDLE = registerBlock("panel_red_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_RED_TOP = registerBlock("panel_red_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_LIGHT_GRAY_BLOCK = registerBlock("panel_light_gray_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIGHT_GRAY_BOTTOM = registerBlock("panel_light_gray_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIGHT_GRAY_MIDDLE = registerBlock("panel_light_gray_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIGHT_GRAY_TOP = registerBlock("panel_light_gray_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_WHITE_BLOCK = registerBlock("panel_white_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_WHITE_BOTTOM = registerBlock("panel_white_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_WHITE_MIDDLE = registerBlock("panel_white_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_WHITE_TOP = registerBlock("panel_white_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_ORANGE_BLOCK = registerBlock("panel_orange_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_ORANGE_BOTTOM = registerBlock("panel_orange_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_ORANGE_MIDDLE = registerBlock("panel_orange_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_ORANGE_TOP = registerBlock("panel_orange_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_PINK_BLOCK = registerBlock("panel_pink_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_PINK_BOTTOM = registerBlock("panel_pink_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_PINK_MIDDLE = registerBlock("panel_pink_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_PINK_TOP = registerBlock("panel_pink_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_LIME_BLOCK = registerBlock("panel_lime_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIME_BOTTOM = registerBlock("panel_lime_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIME_MIDDLE = registerBlock("panel_lime_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_LIME_TOP = registerBlock("panel_lime_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_CYAN_BLOCK = registerBlock("panel_cyan_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_CYAN_BOTTOM = registerBlock("panel_cyan_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_CYAN_MIDDLE = registerBlock("panel_cyan_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_CYAN_TOP = registerBlock("panel_cyan_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_BIRCH_BLOCK = registerBlock("panel_birch_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BIRCH_BOTTOM = registerBlock("panel_birch_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BIRCH_MIDDLE = registerBlock("panel_birch_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_BIRCH_TOP = registerBlock("panel_birch_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_SPRUCE_BLOCK = registerBlock("panel_spruce_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_SPRUCE_BOTTOM = registerBlock("panel_spruce_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_SPRUCE_MIDDLE = registerBlock("panel_spruce_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_SPRUCE_TOP = registerBlock("panel_spruce_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_DARK_OAK_BLOCK = registerBlock("panel_dark_oak_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_DARK_OAK_BOTTOM = registerBlock("panel_dark_oak_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_DARK_OAK_MIDDLE = registerBlock("panel_dark_oak_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_DARK_OAK_TOP = registerBlock("panel_dark_oak_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_ACACIA_BLOCK = registerBlock("panel_acacia_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_ACACIA_BOTTOM = registerBlock("panel_acacia_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_ACACIA_MIDDLE = registerBlock("panel_acacia_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_ACACIA_TOP = registerBlock("panel_acacia_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_MANGROVE_BLOCK = registerBlock("panel_mangrove_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_MANGROVE_BOTTOM = registerBlock("panel_mangrove_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_MANGROVE_MIDDLE = registerBlock("panel_mangrove_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_MANGROVE_TOP = registerBlock("panel_mangrove_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_CHERRY_BLOCK = registerBlock("panel_cherry_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> PANEL_CHERRY_BOTTOM = registerBlock("panel_cherry_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> PANEL_CHERRY_MIDDLE = registerBlock("panel_cherry_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> PANEL_CHERRY_TOP = registerBlock("panel_cherry_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> PANEL_WARPED_BLOCK = registerBlock("panel_warped_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> PANEL_WARPED_BOTTOM = registerBlock("panel_warped_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> PANEL_WARPED_MIDDLE = registerBlock("panel_warped_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> PANEL_WARPED_TOP = registerBlock("panel_warped_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> PANEL_CRIMSON_BLOCK = registerBlock("panel_crimson_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> PANEL_CRIMSON_BOTTOM = registerBlock("panel_crimson_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> PANEL_CRIMSON_MIDDLE = registerBlock("panel_crimson_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> PANEL_CRIMSON_TOP = registerBlock("panel_crimson_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> PANEL_JUNGLE_BLOCK = registerBlock("panel_jungle_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_JUNGLE_BOTTOM = registerBlock("panel_jungle_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_JUNGLE_MIDDLE = registerBlock("panel_jungle_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_JUNGLE_TOP = registerBlock("panel_jungle_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PANEL_BAMBOO_BLOCK = registerBlock("panel_bamboo_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> PANEL_BAMBOO_BOTTOM = registerBlock("panel_bamboo_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> PANEL_BAMBOO_MIDDLE = registerBlock("panel_bamboo_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> PANEL_BAMBOO_TOP = registerBlock("panel_bamboo_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> PANEL_OAK_BLOCK = registerBlock("panel_oak_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_OAK_BOTTOM = registerBlock("panel_oak_bottom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_OAK_MIDDLE = registerBlock("panel_oak_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PANEL_OAK_TOP = registerBlock("panel_oak_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BOARDS_ACACIA = registerBlock("boards_acacia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_BIRCH = registerBlock("boards_birch",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_CHERRY = registerBlock("boards_cherry",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> BOARDS_CRIMSON = registerBlock("boards_crimson",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> BOARDS_DARK_OAK = registerBlock("boards_dark_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_JUNGLE = registerBlock("boards_jungle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_MANGROVE = registerBlock("boards_mangrove",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_OAK = registerBlock("boards_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_SPRUCE = registerBlock("boards_spruce",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOARDS_WARPED = registerBlock("boards_warped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> SLAB_ACACIA = registerBlock("slab_acacia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_BIRCH = registerBlock("slab_birch",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_CHERRY = registerBlock("slab_cherry",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> SLAB_CRIMSON = registerBlock("slab_crimson",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> SLAB_DARK_OAK = registerBlock("slab_dark_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_JUNGLE = registerBlock("slab_jungle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_MANGROVE = registerBlock("slab_mangrove",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_OAK = registerBlock("slab_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_SPRUCE = registerBlock("slab_spruce",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_WARPED = registerBlock("slab_warped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_SLAB).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> SIDE_BOARDS_ACACIA = registerBlock("side_boards_acacia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_BIRCH = registerBlock("side_boards_birch",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_CHERRY = registerBlock("side_boards_cherry",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_CRIMSON = registerBlock("side_boards_crimson",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_DARK_OAK = registerBlock("side_boards_dark_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_JUNGLE = registerBlock("side_boards_jungle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_MANGROVE = registerBlock("side_boards_mangrove",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_OAK = registerBlock("side_boards_oak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_SPRUCE = registerBlock("side_boards_spruce",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SIDE_BOARDS_WARPED = registerBlock("side_boards_warped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> KITCHEN_COUNTER_ACACIA = registerBlock(
            "kitchen_counter_acacia",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_BIRCH = registerBlock(
            "kitchen_counter_birch",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_CHERRY = registerBlock(
            "kitchen_counter_cherry",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CHERRY_WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_CRIMSON = registerBlock(
            "kitchen_counter_crimson",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_DARK_OAK = registerBlock(
            "kitchen_counter_dark_oak",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_JUNGLE = registerBlock(
            "kitchen_counter_jungle",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_MANGROVE = registerBlock(
            "kitchen_counter_mangrove",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_OAK = registerBlock(
            "kitchen_counter_oak",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_SPRUCE = registerBlock(
            "kitchen_counter_spruce",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_WARPED = registerBlock(
            "kitchen_counter_warped",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_WOOD))
    );

    public static final RegistryObject<Block> COUNTER_TEST = registerBlock(
            "counter_test",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    // Corner Variants
    public static final RegistryObject<Block> KITCHEN_COUNTER_ACACIA_CORNER = registerBlock(
            "kitchen_counter_acacia_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_BIRCH_CORNER = registerBlock(
            "kitchen_counter_birch_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_CHERRY_CORNER = registerBlock(
            "kitchen_counter_cherry_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CHERRY_WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_CRIMSON_CORNER = registerBlock(
            "kitchen_counter_crimson_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_DARK_OAK_CORNER = registerBlock(
            "kitchen_counter_dark_oak_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_JUNGLE_CORNER = registerBlock(
            "kitchen_counter_jungle_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_MANGROVE_CORNER = registerBlock(
            "kitchen_counter_mangrove_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_OAK_CORNER = registerBlock(
            "kitchen_counter_oak_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_SPRUCE_CORNER = registerBlock(
            "kitchen_counter_spruce_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> KITCHEN_COUNTER_WARPED_CORNER = registerBlock(
            "kitchen_counter_warped_corner",
            () -> new CounterBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)
                    .noOcclusion()
                    .strength(2.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_WOOD))
    );

    private ModBlocks() {} // Prevent instantiation

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}