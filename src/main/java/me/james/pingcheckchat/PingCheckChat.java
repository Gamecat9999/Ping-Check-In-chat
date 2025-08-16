package me.james.pingcheckchat;

import org.bukkit.plugin.java.JavaPlugin;

public class PingCheckChat extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new ChatListener(this), this);
        getLogger().info("PingCheckChat enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("PingCheckChat disabled.");
    }
}