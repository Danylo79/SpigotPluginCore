package dev.dankom.spigotplugincore.util;

import dev.dankom.spigotplugincore.api.SimpleDependencyFetch;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtil {
    public static String translate(Player player, String message) {
        if (new SimpleDependencyFetch().isPAPIEnabled()) {
            return ChatColor.translateAlternateColorCodes('&', new SimpleDependencyFetch().getPlaceholderAPI().setPlaceHolders(player, message));
        } else {
            return ChatColor.translateAlternateColorCodes('&', message);
        }
    }

    public static void sendMessage(Player player, String message) {
        player.sendMessage(translate(player, message));
    }
}
