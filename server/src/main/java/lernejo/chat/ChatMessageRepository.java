package lernejo.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageRepository {
    private static ChatMessageRepository instance=null;
    List<String> liste;

    private ChatMessageRepository() {
        liste = new ArrayList<>();
    }

    public static ChatMessageRepository getInstance() {
        if (instance==null) instance = new ChatMessageRepository();
        return instance;
    }

    public void addChatMessage(String message) {
        liste.add(message);
    }

    public List<String> getLastTenMessages() {
        return  liste.subList(Math.max(liste.size() - 10,0), liste.size());
    }
}
