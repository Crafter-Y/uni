package snatchat;

import java.util.ArrayList;
import java.util.Collection;

public class SnatChatRoom {
    private final String name;
    private final Collection<SnatChatFrontend> clients = new ArrayList<>();

    public SnatChatRoom(String name) {
        this.name = name;
    }

    public String getRoomName() {
        return this.name;
    }

    public void register(SnatChatFrontend s) {
        clients.add(s);
    }

    public void unregister(SnatChatFrontend s) {
        clients.remove(s);
    }

    public void sendMessage(Message msg) {
        for (SnatChatFrontend client : clients) {
            client.receiveMessages(msg);
        }
    }

    public void sendMessage(String text) {
        for (SnatChatFrontend client : clients) {
            client.receiveMessage(text);
        }
    }
}
