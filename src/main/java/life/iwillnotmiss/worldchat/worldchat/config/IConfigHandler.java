package life.iwillnotmiss.worldchat.worldchat.config;


import java.util.Map;

public interface IConfigHandler {
    void registerConfig(String configName);

    Map<String, MyConfig> getConfigs();

    MyConfig getConfig(String configName);
}
