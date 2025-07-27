package net.kjshroomish.kjproject.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CounterBlock extends HorizontalDirectionalBlock {
    // Define visual shape (for shadows and rendering)
    private static final VoxelShape VISUAL_SHAPE = Shapes.box(0, 0, 0, 1, 0.875, 1);

    public CounterBlock(Properties properties) {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                .noOcclusion() // Fixes transparent faces
                .lightLevel(state -> 0) // No light emission
                .strength(2.0f) // Same hardness as before
                .sound(SoundType.WOOD) // Wood sounds
                .requiresCorrectToolForDrops() // Tool requirements
        );
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH));
    }

    // Lighting and shape overrides
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.block(); // Full block collision
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.box(0, 0, 0, 1, 0.875, 1); // Match your model height
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true; // Better light handling
    }

    // Block state management
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    // Rendering
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    // Particles and effects
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (level.isClientSide) {
            for (int i = 0; i < 20; i++) {
                double x = pos.getX() + level.random.nextDouble();
                double y = pos.getY() + level.random.nextDouble();
                double z = pos.getZ() + level.random.nextDouble();
                level.addParticle(
                        new BlockParticleOption(ParticleTypes.BLOCK, state),
                        x, y, z,
                        0.0, 0.0, 0.0
                );
            }
        }
        super.playerWillDestroy(level, pos, state, player);
    }
}