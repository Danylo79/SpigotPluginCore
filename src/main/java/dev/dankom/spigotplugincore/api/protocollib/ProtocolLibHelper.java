package dev.dankom.spigotplugincore.api.protocollib;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;

public class ProtocolLibHelper {
    public static ProtocolManager getProtocolManager() {
        return ProtocolLibrary.getProtocolManager();
    }

    public void addPacketListener(PacketAdapter packetAdapter) {
        ProtocolLibHelper.getProtocolManager().addPacketListener(packetAdapter);
    }
}
