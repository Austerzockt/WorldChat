package life.iwillnotmiss.worldchat.worldchat;

import life.iwillnotmiss.worldchat.worldchat.config.IConfigHandler;
import life.iwillnotmiss.worldchat.worldchat.config.SimpleConfigHandler;
import life.iwillnotmiss.worldchat.worldchat.worlds.WorldGroupManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldChat extends JavaPlugin {
    private IConfigHandler configHandler;
    private WorldGroupManager worldGroupManager;

    @Override
    public void onEnable() {
        configHandler = new SimpleConfigHandler(this);
        configHandler.registerConfig("config");
        this.worldGroupManager = new WorldGroupManager(this);
    }

    public IConfigHandler getConfigHandler() {
        return configHandler;
    }

    public WorldGroupManager getWorldGroupManager() {
        return worldGroupManager;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
