package dev.dankom.spigotplugincore.api;

import com.comphenix.protocol.PacketType;
import dev.dankom.spigotplugincore.api.hdb.HeadDatabaseHelper;
import dev.dankom.spigotplugincore.api.papi.PlaceholderHelper;
import dev.dankom.spigotplugincore.api.protocollib.ProtocolLibHelper;
import dev.dankom.spigotplugincore.exception.DependencyNotFoundException;
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import me.clip.placeholderapi.PlaceholderAPI;

public class SimpleDependencyFetch {
    public boolean isPAPIEnabled() {
        try {
            PlaceholderAPI.getPlaceholderPattern();
            return true;
        } catch (NoClassDefFoundError e) {
            return false;
        }
    }

    public boolean isHDBEnabled() {
        try {
            new HeadDatabaseAPI().isHead("10000");
            return true;
        } catch (NoClassDefFoundError e) {
            return false;
        }
    }

    public boolean isProtocolLibEnabled() {
        try {
            PacketType.Protocol.values();
            return true;
        } catch (NoClassDefFoundError e) {
            return false;
        }
    }

    public PlaceholderHelper getPlaceholderAPI() {
        if (isPAPIEnabled()) {
            return new PlaceholderHelper();
        } else {
            try {
                throw new DependencyNotFoundException("PlaceHolderAPI", "https://www.spigotmc.org/resources/placeholderapi.6245/");
            } catch (DependencyNotFoundException e) {
                e.sendMessage();
            }
            return null;
        }
    }

    public HeadDatabaseHelper getHeadDatabaseHelper() {
        if (isHDBEnabled()) {
            return new HeadDatabaseHelper();
        } else {
            try {
                throw new DependencyNotFoundException("HeadDatabase", "https://www.spigotmc.org/resources/head-database.14280/");
            } catch (DependencyNotFoundException e) {
                e.sendMessage();
            }
            return null;
        }
    }

    public ProtocolLibHelper getProtocolLibHelper() {
        if (isPAPIEnabled()) {
            return new ProtocolLibHelper();
        } else {
            try {
                throw new DependencyNotFoundException("ProtocolLib", "https://www.spigotmc.org/resources/protocollib.1997/");
            } catch (DependencyNotFoundException e) {
                e.sendMessage();
            }
            return null;
        }
    }
}
