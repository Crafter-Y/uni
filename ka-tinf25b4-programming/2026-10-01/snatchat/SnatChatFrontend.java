package snatchat;

public interface SnatChatFrontend {
    void receiveMessages(Message msg);
    void receiveMessage(String text);
    Account getAccount();
}
