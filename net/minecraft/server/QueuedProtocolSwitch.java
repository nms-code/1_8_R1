package net.minecraft.server;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

class QueuedProtocolSwitch implements Runnable {

    final EnumProtocol a;
    final EnumProtocol b;
    final Packet c;
    final GenericFutureListener[] d;
    final NetworkManager e;

    QueuedProtocolSwitch(NetworkManager networkmanager, EnumProtocol enumprotocol, EnumProtocol enumprotocol1, Packet packet, GenericFutureListener[] agenericfuturelistener) {
        this.e = networkmanager;
        this.a = enumprotocol;
        this.b = enumprotocol1;
        this.c = packet;
        this.d = agenericfuturelistener;
    }

    public void run() {
        if (this.a != this.b) {
            this.e.a(this.a);
        }

        ChannelFuture channelfuture = NetworkManager.a(this.e).writeAndFlush(this.c);

        if (this.d != null) {
            channelfuture.addListeners(this.d);
        }

        channelfuture.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}
