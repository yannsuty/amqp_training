package lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {
    private final ChatMessageRepository chatMessageRepository = ChatMessageRepository.getInstance();

    @GetMapping("/api/message")
    public List<String> getTenMessage() {
        return chatMessageRepository.getLastTenMessages();
    }
}
