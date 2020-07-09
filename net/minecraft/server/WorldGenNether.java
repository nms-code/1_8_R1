package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.List;

public class WorldGenNether extends StructureGenerator {

    private List d = Lists.newArrayList();

    public WorldGenNether() {
        this.d.add(new BiomeMeta(EntityBlaze.class, 10, 2, 3));
        this.d.add(new BiomeMeta(EntityPigZombie.class, 5, 4, 4));
        this.d.add(new BiomeMeta(EntitySkeleton.class, 10, 4, 4));
        this.d.add(new BiomeMeta(EntityMagmaCube.class, 3, 4, 4));
    }

    public String a() {
        return "Fortress";
    }

    public List b() {
        return this.d;
    }

    protected boolean a(int i, int j) {
        int k = i >> 4;
        int l = j >> 4;

        this.b.setSeed((long) (k ^ l << 4) ^ this.c.getSeed());
        this.b.nextInt();
        return this.b.nextInt(3) != 0 ? false : (i != (k << 4) + 4 + this.b.nextInt(8) ? false : j == (l << 4) + 4 + this.b.nextInt(8));
    }

    protected StructureStart b(int i, int j) {
        return new WorldGenNetherStart(this.c, this.b, i, j);
    }
}
