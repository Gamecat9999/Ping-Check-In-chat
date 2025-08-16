package me.james.pingcheckchat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private final PingCheckChat plugin;

    public ChatListener(PingCheckChat plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        int ping = player.getPing(); // Spigot-only method

        int good = plugin.getConfig().getInt("pingThresholds.good", 100);
        int moderate = plugin.getConfig().getInt("pingThresholds.moderate", 200);

        String symbol;
        if (ping < good) {
            symbol = plugin.getConfig().getString("symbols.good", "🟢");
        } else if (ping < moderate) {
            symbol = plugin.getConfig().getString("symbols.moderate", "🟡");
        } else {
            symbol = plugin.getConfig().getString("symbols.poor", "🔴");
        }

        String pingTag = String.format("%s %dms", symbol, ping);
        event.setFormat(String.format("[%s] %s: %s", pingTag, player.getDisplayName(), event.getMessage()));
    }
}