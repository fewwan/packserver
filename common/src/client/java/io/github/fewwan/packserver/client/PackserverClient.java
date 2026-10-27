package io.github.fewwan.packserver.client;

import io.github.fewwan.packserver.Packserver;

public class PackserverClient {

    public static void init() {
        Packserver.LOGGER.info("Initializing {} client", Packserver.MOD_ID);
    }
}
