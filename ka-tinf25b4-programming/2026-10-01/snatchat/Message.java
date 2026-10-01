package snatchat;

public class Message {
    private final String text;
    private final Account sender;

    public Message(String text, Account sender) {
        this.text = text;
        this.sender = sender;
    }

    public String getText() {
        return this.text;
    }

    public Account getSender() {
        return this.sender;
    }
}
