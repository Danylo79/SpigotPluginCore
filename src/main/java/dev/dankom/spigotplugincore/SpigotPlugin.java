package dev.dankom.spigotplugincore;

import dev.dankom.spigotplugincore.plugin.PluginManager;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin implements Listener {

    private String prefix;
    private String name;
    private SpigotPlugin source;

    public void setup(SpigotPlugin source, String prefix, String name) {
        setSource(source);
        setPrefix(prefix);
        setName(name);
        PluginManager.registerPlugin(this);
        getServer().getPluginManager().registerEvents(this, source);
    }

    public void log(boolean prefix, String message) {
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', (prefix ? getPrefix() + " &f" : "&f") + message));
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpigotPlugin getSource() {
        return source;
    }

    public void setSource(SpigotPlugin source) {
        this.source = source;
    }
}
