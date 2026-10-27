package io.github.fewwan.packserver.neoforge;

import io.github.fewwan.packserver.Packserver;
import net.neoforged.fml.common.Mod;

@Mod("packserver")
public class PackserverNeoForge {

    public PackserverNeoForge() {
        Packserver.init();
    }
}
