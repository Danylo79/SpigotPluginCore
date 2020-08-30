package dev.dankom.spigotplugincore.api.papi;

import dev.dankom.spigotplugincore.util.ArrayUtil;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.entity.Player;

import java.util.List;

public class PlaceholderHelper {
    public String setPlaceHolders(Player player, String text) {
        return PlaceholderAPI.setPlaceholders(player, text);
    }

    public List<String> setPlaceHolders(Player player, String... text) {
        return PlaceholderAPI.setPlaceholders(player, new ArrayUtil<String>().toArrayList(text));
    }
}
