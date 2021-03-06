package net.minecraft.server;

public class PacketPlayOutUpdateHealth implements Packet {

    private float a;
    private int b;
    private float c;

    public PacketPlayOutUpdateHealth() {}

    public PacketPlayOutUpdateHealth(float f, int i, float f1) {
        this.a = f;
        this.b = i;
        this.c = f1;
    }

    public void a(PacketDataSerializer packetdataserializer) {
        this.a = packetdataserializer.readFloat();
        this.b = packetdataserializer.e();
        this.c = packetdataserializer.readFloat();
    }

    public void b(PacketDataSerializer packetdataserializer) {
        packetdataserializer.writeFloat(this.a);
        packetdataserializer.b(this.b);
        packetdataserializer.writeFloat(this.c);
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
        packetlistenerplayout.a(this);
    }

    public void a(PacketListener packetlistener) {
        this.a((PacketListenerPlayOut) packetlistener);
    }
}
