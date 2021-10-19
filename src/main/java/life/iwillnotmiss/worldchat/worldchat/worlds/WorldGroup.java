package life.iwillnotmiss.worldchat.worldchat.worlds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldGroup {
    private List<String> worlds = new ArrayList<>();

    public WorldGroup(String... worlds) {
        this.worlds.addAll(Arrays.asList(worlds));

    }

    public WorldGroup(List<String> worlds) {
        this.worlds = worlds;
    }

    public List<String> getWorlds() {
        return worlds;
    }

    public boolean containsWorld(String world) {
        return worlds.contains(world);
    }
}
