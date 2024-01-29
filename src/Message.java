import java.time.LocalDateTime;
import java.util.ArrayList;

public class Message extends Submission{
    private String messageText;

    public Message(String username, LocalDateTime timestamp, int likes, ArrayList<String> commentList, String messageText) {
        super(username, timestamp, likes, commentList);
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
