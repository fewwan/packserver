package io.github.fewwan.packserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Packserver {

    public static final String MOD_ID = "packserver";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("Initializing {}", MOD_ID);
    }
}
