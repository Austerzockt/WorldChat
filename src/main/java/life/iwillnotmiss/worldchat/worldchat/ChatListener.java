package life.iwillnotmiss.worldchat.worldchat;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {
    private final WorldChat worldChat;

    public ChatListener(WorldChat worldChat) {
        this.worldChat = worldChat;
    }

    public void onChat(AsyncChatEvent event) {
        event.setCancelled(true);
        var worldGroup = worldChat.getWorldGroupManager().getWorldGroupContainingWorld(event.getPlayer().getWorld().getName());
        worldGroup.getWorlds().forEach(s -> Bukkit.getWorld(s).getPlayers().forEach(x -> x.sendMessage(event.message())));

    }
}
