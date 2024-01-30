public class Message extends Submission{
    private String messageText;

    public Message(String username, String messageText) {
        super(username);
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public String toString(){
        return "message: {" + super.toString() + "}";
    }
}
