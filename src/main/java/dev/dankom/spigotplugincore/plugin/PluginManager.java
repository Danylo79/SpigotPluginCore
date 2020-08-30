package dev.dankom.spigotplugincore.plugin;

import dev.dankom.spigotplugincore.SpigotPlugin;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {

    private static List<SpigotPlugin> plugins = new ArrayList<>();

    public static void registerPlugin(SpigotPlugin plugin) {
        plugins.add(plugin);
    }

    public static void unregisterPlugin(SpigotPlugin plugin) {
        plugins.remove(plugin);
    }
}
