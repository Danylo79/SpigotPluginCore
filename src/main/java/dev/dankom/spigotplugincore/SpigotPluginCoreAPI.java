package dev.dankom.spigotplugincore;

import dev.dankom.spigotplugincore.api.SimpleDependencyFetch;

public class SpigotPluginCoreAPI {
    public static SimpleDependencyFetch getDependencyFetch() {
        return new SimpleDependencyFetch();
    }
}
