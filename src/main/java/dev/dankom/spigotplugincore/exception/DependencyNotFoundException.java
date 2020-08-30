package dev.dankom.spigotplugincore.exception;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class DependencyNotFoundException extends Exception {
    private String depName;
    private String url;

    public DependencyNotFoundException(String depName, String url) {
        this.depName = depName;
        this.url = url;
    }

    public void sendMessage() {
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou tried to use a feature that needs a dependency " + "(" + depName + ") please install it from (" + url + ") and try again! ["));
        printStackTrace();
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c]"));
    }
}
