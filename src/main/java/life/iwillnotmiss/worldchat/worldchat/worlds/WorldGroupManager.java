package life.iwillnotmiss.worldchat.worldchat.worlds;

import life.iwillnotmiss.worldchat.worldchat.WorldChat;

import java.util.ArrayList;
import java.util.List;

public class WorldGroupManager {
    private final WorldChat worldChat;
    private final List<WorldGroup> worldGroups = new ArrayList<>();

    public WorldGroupManager(WorldChat worldChat) {
        this.worldChat = worldChat;
        var sec = worldChat.getConfigHandler().getConfig("config").getConfigurationSection("worlds");
        if (sec == null) return;
        sec.getKeys(false).forEach(s -> {
            var worldGroup = new WorldGroup(sec.getStringList(s));
            worldGroups.add(worldGroup);
        });
    }

    public WorldGroup getWorldGroupContainingWorld(String world) {
        for (var wG : worldGroups) {
            if (wG.containsWorld(world)) return wG;
        }
        throw new RuntimeException("This world is not in the configuration: " + world);
    }

}
