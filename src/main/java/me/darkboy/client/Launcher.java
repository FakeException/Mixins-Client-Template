package me.darkboy.client;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class Launcher implements IMixinConnector {

    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.templateclient.json");
    }
}
