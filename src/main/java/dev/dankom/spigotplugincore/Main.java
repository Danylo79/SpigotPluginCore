package dev.dankom.spigotplugincore;

public final class Main extends SpigotPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();

        setup(this, "&b[&aSpigotPluginCore&b]", "SpigotPluginCore");
        log(true, "&aEnabling Spigot Plugin Core!");
    }

    @Override
    public void onDisable() {
        log(true, "&cDisabling Spigot Plugin Core!");
    }
}
