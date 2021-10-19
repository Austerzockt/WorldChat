package life.iwillnotmiss.worldchat.worldchat.config;


import com.google.common.collect.Maps;
import org.bukkit.plugin.Plugin;

import java.util.Map;

public class SimpleConfigHandler implements IConfigHandler {
    private final Map<String, MyConfig> configs;
    private final Plugin plugin;

    public SimpleConfigHandler(Plugin plugin) {
        configs = Maps.newHashMap();
        this.plugin = plugin;
    }

    @Override
    public void registerConfig(String name) {
        MyConfig config = new MyConfig(this.plugin, name);
        configs.put(config.getName(), config);
    }

    @Override
    public Map<String, MyConfig> getConfigs() {
        return configs;
    }

    @Override
    public MyConfig getConfig(String name) {

        return configs.getOrDefault(name, null);
    }
}
