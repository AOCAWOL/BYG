package voronoiaoc.byg.common.world.feature.features.overworld.trees.pine;

import com.mojang.serialization.Codec;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

public class LargePineTree2 extends BYGAbstractTreeFeature<NoneFeatureConfiguration> {

    public LargePineTree2(Codec<NoneFeatureConfiguration> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, WorldGenLevel worldIn, Random rand, BlockPos pos, BoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 26 + rand.nextInt(5);
        BlockPos.MutableBlockPos mainmutable = new BlockPos.MutableBlockPos().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {

            if (!isDesiredGroundwDirtTag(worldIn, pos.below(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {

                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(changedBlocks, worldIn, mainmutable, boundsIn);

                    mainmutable.move(Direction.UP);
                }
                mainmutable.set(pos);

                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 23, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 22, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 22, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 22, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 21, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 20, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 19, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 18, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 18, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 17, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 17, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 17, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 17, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 14, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 13, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 13, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 13, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 12, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 12, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 12, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 12, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 11, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 11, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 11, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 10, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 9, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 9, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 8, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 8, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 8, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 7, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 7, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 7, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 7, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 6, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 6, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 5, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 4, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 4, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 4, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 3, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 3, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 2, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 1, 1), boundsIn);

                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 24, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 24, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 23, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 23, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 23, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 23, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(5, randTreeHeight - 23, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 23, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 23, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 22, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 22, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 22, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 22, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 22, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 22, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 22, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 22, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 22, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 22, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-5, randTreeHeight - 22, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 22, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 22, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 22, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 22, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 22, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 22, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 21, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 21, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 21, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 21, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 21, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 21, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 21, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 21, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 21, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 20, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 20, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 20, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 20, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 20, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 20, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 20, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 20, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 20, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 20, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 20, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 20, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 20, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 20, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 20, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 19, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 19, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 19, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 19, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 19, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 19, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 19, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 18, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 18, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-5, randTreeHeight - 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(5, randTreeHeight - 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 18, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 18, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 17, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 17, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 17, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 17, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 17, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 17, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 17, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 17, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 17, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 17, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 17, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 17, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 16, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 16, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 16, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 15, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 14, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 13, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-5, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(5, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 13, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 13, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 12, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 12, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 10, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 10, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 9, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(5, randTreeHeight - 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 8, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 8, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 8, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 8, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-5, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 8, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 7, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 7, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 7, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 7, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 7, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 7, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 6, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 6, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 6, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(4, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-4, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(3, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-3, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-2, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 3, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 2, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight + 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(-1, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight + 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight + 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight + 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(1, randTreeHeight + 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.offset(0, randTreeHeight + 4, 0), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.defaultBlockState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.defaultBlockState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, WorldGenLevel reader, BlockPos pos, BoundingBox boundingBox) {
        BlockPos.MutableBlockPos blockpos = new BlockPos.MutableBlockPos().set(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, BYGBlockList.PINE_LEAVES.defaultBlockState(), boundingBox);
        }
    }


    private boolean doesTreeFit(LevelSimulatedReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 0;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canLogPlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}