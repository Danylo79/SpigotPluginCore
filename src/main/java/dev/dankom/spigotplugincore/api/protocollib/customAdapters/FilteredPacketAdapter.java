package dev.dankom.spigotplugincore.api.protocollib.customAdapters;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.plugin.Plugin;

public class FilteredPacketAdapter extends PacketAdapter {
    public FilteredPacketAdapter(Plugin plugin, Iterable<? extends PacketType> types) {
        super(plugin, types);
    }

    @Override
    public void onPacketReceiving(PacketEvent event) {

    }

    @Override
    public void onPacketSending(PacketEvent event) {

    }
}
