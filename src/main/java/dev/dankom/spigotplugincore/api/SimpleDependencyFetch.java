package dev.dankom.spigotplugincore.api;

import dev.dankom.spigotplugincore.api.hdb.HeadDatabaseHelper;
import dev.dankom.spigotplugincore.api.papi.PlaceholderHelper;
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

    public PlaceholderHelper getPlaceholderAPI() {
        if (isPAPIEnabled()) {
            return new PlaceholderHelper();
        } else {
            try {
                throw new DependencyNotFoundException("PlaceHolderAPI");
            } catch (DependencyNotFoundException e) {
                e.sendMessage();
            }
            return null;
        }
    }

    public HeadDatabaseHelper getHeadDatabaseHelper() {
        if (isPAPIEnabled()) {
            return new HeadDatabaseHelper();
        } else {
            try {
                throw new DependencyNotFoundException("HeadDatabase");
            } catch (DependencyNotFoundException e) {
                e.sendMessage();
            }
            return null;
        }
    }
}
