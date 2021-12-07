package lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    private final ChatMessageRepository chatMessageRepository = ChatMessageRepository.getInstance();

    public void onMessage(String message) {
        System.out.println("add");
        chatMessageRepository.addChatMessage(message);
    }
}
