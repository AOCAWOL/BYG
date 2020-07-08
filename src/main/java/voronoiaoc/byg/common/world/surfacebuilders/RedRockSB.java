package voronoiaoc.byg.common.world.surfacebuilders;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import voronoiaoc.byg.core.byglists.BYGBlockList;
import voronoiaoc.byg.core.byglists.BYGSBList;

import java.util.Random;

public class RedRockSB extends SurfaceBuilder<TernarySurfaceConfig> {
    public RedRockSB(Codec<TernarySurfaceConfig> p_i51312_1_) {
        super(p_i51312_1_);
    }

    public void generate(Random random, Chunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, TernarySurfaceConfig config) {
        BlockPos.Mutable block = new BlockPos.Mutable();
        int xPos = x & 15;
        int zPos = z & 15;
        for (int yPos = startHeight - 3; yPos >= seaLevel; --yPos) {
            block.set(xPos, yPos, zPos);
            BlockState currentBlockToReplace = chunkIn.getBlockState(block);
            if (currentBlockToReplace == Blocks.STONE.getDefaultState()) {
                chunkIn.setBlockState(block, BYGBlockList.RED_ROCK.getDefaultState(), false);
            }
        }
        if (noise > 1.75D) {
            SurfaceBuilder.DEFAULT.generate
                    (random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BYGSBList.BYGSBConfigList.RED_ROCK_CF);
        } else if (noise > -0.5D) {
            SurfaceBuilder.DEFAULT.generate
                    (random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, SurfaceBuilder.COARSE_DIRT_CONFIG);
        } else {
            SurfaceBuilder.DEFAULT.generate
                    (random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BYGSBList.BYGSBConfigList.TERRACOTTA_CF);
        }

    }
}