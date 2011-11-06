package org.tulonsae.mc.commands;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Base Bukkit plugin class for TulCommands.
 *
 * @author Tulonsae
 */
public class TulCommands extends JavaPlugin {

    public String version;

    /**
     * Called when this plugin is enabled.
     * Loads the configuration and registers for Bukkit events.
     */
    public void onEnable() {

        // get plugin info
        version = this.getDescription().getVersion();
        
        // log enable message
        LogUtil.info("version " + version + " enabled.");
    }

    /**
     * Called when this plugin is disabled.
     */
    public void onDisable() {
        
        // log disable message
        LogUtil.info("version " + version + " disabled.");
    }
}
