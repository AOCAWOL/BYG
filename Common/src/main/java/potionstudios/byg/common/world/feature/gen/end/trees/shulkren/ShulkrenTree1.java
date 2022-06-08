package potionstudios.byg.common.world.feature.gen.end.trees.shulkren;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import potionstudios.byg.common.block.BYGBlocks;
import potionstudios.byg.common.world.feature.config.BYGMushroomConfig;
import potionstudios.byg.common.world.feature.gen.overworld.mushrooms.util.BYGAbstractMushroomFeature;

import net.minecraft.util.RandomSource;

public class ShulkrenTree1 extends BYGAbstractMushroomFeature<BYGMushroomConfig> {

    public ShulkrenTree1(Codec<BYGMushroomConfig> configIn) {
        super(configIn);
    }

    protected boolean placeMushroom(WorldGenLevel worldIn, RandomSource rand, BlockPos pos, boolean isMushroom, BYGMushroomConfig config) {
        BlockState STEM = config.getStemProvider().getState(rand, pos);
        BlockState MUSHROOM = config.getMushroomProvider().getState(rand, pos);
        BlockState MUSHROOM2 = config.getMushroom2Provider().getState(rand, pos);
        BlockState MUSHROOM3 = config.getMushroom3Provider().getState(rand, pos);
        BlockState POLLEN = config.getPollenProvider().getState(rand, pos);
        int randTreeHeight = 8 + rand.nextInt(5);
        BlockPos.MutableBlockPos mainmutable = new BlockPos.MutableBlockPos().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxBuildHeight()) {
            if (!isDesiredGroundwEndTags(config, worldIn, pos.below(), BYGBlocks.SHULKREN_PHYLIUM.get())) {
                return false;
            } else if (!this.isAnotherMushroomLikeThisNearby(worldIn, pos, randTreeHeight, 0, STEM.getBlock(), MUSHROOM.getBlock(), isMushroom)) {
                return false;
            } else if (!this.doesMushroomHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isMushroom)) {
                return false;
            } else {
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 0, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 1, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 3, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 5, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 7, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 9, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 11, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 12, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 13, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 14, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 15, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 16, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 17, 0));
                placeStem(STEM, worldIn, mainmutable.set(pos).move(0, 18, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 2, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 4, 1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(1, 6, 0));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(0, 8, -1));
                placeStemBranch(STEM, worldIn, mainmutable.set(pos).move(-1, 10, 0));
                placeHangingEnd(worldIn, mainmutable.set(pos).move(-2, 7, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 8, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 8, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 8, 4));
                placeHangingBody(worldIn, mainmutable.set(pos).move(-2, 8, 5));
                placeHangingEnd(worldIn, mainmutable.set(pos).move(0, 8, -6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 8, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 8, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 9, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 9, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 9, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 9, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 9, 5));
                placeHangingBody(worldIn, mainmutable.set(pos).move(0, 9, -6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 9, 4));
                placeHangingEnd(worldIn, mainmutable.set(pos).move(2, 9, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 9, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 9, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 9, -3));
                placeHangingEnd(worldIn, mainmutable.set(pos).move(4, 9, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 9, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 10, -2));
                placeHangingEnd(worldIn, mainmutable.set(pos).move(-5, 10, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 10, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 10, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 10, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 10, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 10, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-3, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 10, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 10, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 10, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 10, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 10, 5));
                placeHangingBody(worldIn, mainmutable.set(pos).move(0, 10, -6));
                placeHangingEnd(worldIn, mainmutable.set(pos).move(0, 10, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 10, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, -5));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 10, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 10, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 10, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 10, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(3, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 10, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 10, -3));
                placeHangingBody(worldIn, mainmutable.set(pos).move(4, 10, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 10, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 10, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 10, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-6, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 11, -2));
                placeHangingBody(worldIn, mainmutable.set(pos).move(-5, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 11, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 11, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-3, 11, -2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-3, 11, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 11, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, -5));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-2, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-2, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 11, 5));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-1, 11, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 11, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 11, -6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 11, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, -5));
                placeShroomlight(worldIn, mainmutable.set(pos).move(1, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 11, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 11, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 11, -4));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 11, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 11, 3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 11, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 11, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(3, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 11, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 11, -3));
                placeHangingBody(worldIn, mainmutable.set(pos).move(4, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 11, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 11, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 11, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 11, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 11, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-6, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 12, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 12, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 12, 6));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 12, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 12, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 12, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 12, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 12, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 12, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 12, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(6, 12, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-5, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 13, 1));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-4, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, -2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-2, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-1, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 13, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, -4));
                placeShroomlight(worldIn, mainmutable.set(pos).move(0, 13, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(0, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 13, 5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -5));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 13, 5));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 13, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, -2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 13, -1));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 13, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 13, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 13, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 13, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 13, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 13, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(5, 13, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 14, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 14, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 14, -4));
                placeShroomlight(worldIn, mainmutable.set(pos).move(0, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 14, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 14, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 14, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 14, -2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(2, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 14, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 14, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 14, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 14, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 14, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 14, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 15, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 15, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 15, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 15, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, -2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-2, 15, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 15, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 15, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 15, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 15, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 15, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 15, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 15, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 15, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 15, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 15, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 15, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 15, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 15, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 15, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 15, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-4, 16, 0));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-3, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 16, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-3, 16, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 16, -2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(-2, 16, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 16, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 16, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, -4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, -3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 16, 4));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, -3));
                placeShroomlight(worldIn, mainmutable.set(pos).move(1, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 16, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 16, 2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(3, 16, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 16, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 16, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(3, 16, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(4, 16, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 17, 2));
                placeShroomlight(worldIn, mainmutable.set(pos).move(1, 17, 3));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 17, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-2, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, -2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 18, 2));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 18, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(2, 18, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(-1, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, -1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, 0));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(1, 19, 1));
                placeMushroom(MUSHROOM, worldIn, mainmutable.set(pos).move(0, 20, 0));
            }
        }
        return true;
    }

        private void placeShroomlight(WorldGenLevel reader, BlockPos pos) {
            if (isAir(reader, pos)) {
                this.setFinalBlockState(reader, pos, BYGBlocks.PURPLE_SHROOMLIGHT.defaultBlockState());
            }
        }

    private void placeHangingEnd(WorldGenLevel reader, BlockPos pos) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(reader, pos, BYGBlocks.SHULKREN_VINE.defaultBlockState());
        }
    }

    private void placeHangingBody(WorldGenLevel reader, BlockPos pos) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(reader, pos, BYGBlocks.SHULKREN_VINE_PLANT.defaultBlockState());
        }
    }

}