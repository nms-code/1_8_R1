package net.minecraft.server;

import java.util.List;
import java.util.Random;

public class WorldGenNetherPiece3 extends WorldGenNetherPiece {

    public WorldGenNetherPiece3() {}

    public WorldGenNetherPiece3(int i, Random random, StructureBoundingBox structureboundingbox, EnumDirection enumdirection) {
        super(i);
        this.m = enumdirection;
        this.l = structureboundingbox;
    }

    public void a(StructurePiece structurepiece, List list, Random random) {
        this.a((WorldGenNetherPiece15) structurepiece, list, random, 1, 3, false);
    }

    public static WorldGenNetherPiece3 a(List list, Random random, int i, int j, int k, EnumDirection enumdirection, int l) {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.a(i, j, k, -1, -3, 0, 5, 10, 19, enumdirection);

        return a(structureboundingbox) && StructurePiece.a(list, structureboundingbox) == null ? new WorldGenNetherPiece3(l, random, structureboundingbox, enumdirection) : null;
    }

    public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
        this.a(world, structureboundingbox, 0, 3, 0, 4, 4, 18, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);
        this.a(world, structureboundingbox, 1, 5, 0, 3, 7, 18, Blocks.AIR.getBlockData(), Blocks.AIR.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 5, 0, 0, 5, 18, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);
        this.a(world, structureboundingbox, 4, 5, 0, 4, 5, 18, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 2, 0, 4, 2, 5, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 2, 13, 4, 2, 18, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 0, 0, 4, 1, 3, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 0, 15, 4, 1, 18, Blocks.NETHER_BRICK.getBlockData(), Blocks.NETHER_BRICK.getBlockData(), false);

        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 2; ++j) {
                this.b(world, Blocks.NETHER_BRICK.getBlockData(), i, -1, j, structureboundingbox);
                this.b(world, Blocks.NETHER_BRICK.getBlockData(), i, -1, 18 - j, structureboundingbox);
            }
        }

        this.a(world, structureboundingbox, 0, 1, 1, 0, 4, 1, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 3, 4, 0, 4, 4, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 3, 14, 0, 4, 14, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 0, 1, 17, 0, 4, 17, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 4, 1, 1, 4, 4, 1, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 4, 3, 4, 4, 4, 4, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 4, 3, 14, 4, 4, 14, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        this.a(world, structureboundingbox, 4, 1, 17, 4, 4, 17, Blocks.NETHER_BRICK_FENCE.getBlockData(), Blocks.NETHER_BRICK_FENCE.getBlockData(), false);
        return true;
    }
}
