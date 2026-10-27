package io.github.fewwan.packserver.fabric;

import io.github.fewwan.packserver.client.PackserverClient;
import net.fabricmc.api.ClientModInitializer;

public class PackserverClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        PackserverClient.init();
    }
}
