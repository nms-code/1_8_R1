package net.minecraft.server;

import java.util.Random;

class WorldGenJungleTemplePiece extends StructurePieceBlockSelector {

    private WorldGenJungleTemplePiece() {}

    public void a(Random random, int i, int j, int k, boolean flag) {
        if (random.nextFloat() < 0.4F) {
            this.a = Blocks.COBBLESTONE.getBlockData();
        } else {
            this.a = Blocks.MOSSY_COBBLESTONE.getBlockData();
        }

    }

    WorldGenJungleTemplePiece(WorldGenJungleTempleUnknown worldgenjungletempleunknown) {
        this();
    }
}
