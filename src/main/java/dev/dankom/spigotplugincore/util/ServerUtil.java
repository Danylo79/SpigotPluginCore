package dev.dankom.spigotplugincore.util;

import org.bukkit.Bukkit;

public class ServerUtil {
    public static String getServerVersion() {
        String v = Bukkit.getServer().getClass().getPackage().getName();
        v = v.substring(v.lastIndexOf(".") + 1);
        return v;
    }

    public static Class<?> getNMSClass(String name) throws ClassNotFoundException {
        return Class.forName("net.minecraft.server." + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
    }
}
