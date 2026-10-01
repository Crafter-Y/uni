package snatchat;

import javax.swing.*;
import java.awt.*;

public class SnatChatWindow extends JFrame implements SnatChatFrontend {

    public SnatChatWindow(SnatChatRoom room, Account account) {
        this.setTitle(String.format("%s (%s)", account.getName(), room.getRoomName()));

        this.setLayout(new BorderLayout(5,5));

        JLabel nameLabel = new JLabel(account.getName(), SwingConstants.CENTER);
        nameLabel.setForeground(account.getColor());
        this.add(nameLabel, BorderLayout.NORTH);

        ChatMessagesComponent box = new ChatMessagesComponent();
        this.add(box, BorderLayout.CENTER);

        ButtonGroup radios = new ButtonGroup();
        JPanel radioPanel = new JPanel(new FlowLayout());

        for (State state : State.values()) {
            JRadioButton radio = new JRadioButton(state.name());
            radios.add(radio);
            radioPanel.add(radio);
        }

        //TODO: not finished

        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void receiveMessages(Message msg) {

    }

    @Override
    public void receiveMessage(String text) {

    }

    @Override
    public Account getAccount() {
        return null;
    }
}
