package nl.daniquedejong.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
        super.onDisable();
    }
}

