package io.github.fewwan.packserver.fabric;

import io.github.fewwan.packserver.Packserver;
import net.fabricmc.api.ModInitializer;

public class PackserverFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Packserver.init();
    }
}
