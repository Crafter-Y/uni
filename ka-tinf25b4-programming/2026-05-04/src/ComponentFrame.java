package src;

import javax.swing.*;
import java.awt.*;

public class ComponentFrame extends JFrame {
    public ComponentFrame() {
        this.setTitle("Several basic Swing components");

        JPanel firstRow = new JPanel();

        firstRow.add(new JLabel("JLabel"));
        firstRow.add(new JTextField("JTextField"));
        firstRow.add(new JPasswordField("JPasswordField", 32));
        firstRow.add(new JButton("JButton"));
        firstRow.add(new JToggleButton("JToggleButton"));
        firstRow.add(new JCheckBox("JCheckBox"));
        String[] options = {"Item 1", "Item 2", "Item 3", "Item 4"};
        firstRow.add(new JComboBox<>(options));

        this.add(firstRow, BorderLayout.NORTH);

        JPanel secondRow = new JPanel();

        JRadioButton radio1 = new JRadioButton("Radio-Button-1");
        JRadioButton radio2 = new JRadioButton("Radio-Button-2");
        JRadioButton radio3 = new JRadioButton("Radio-Button-3");

        secondRow.add(radio1);
        secondRow.add(radio2);
        secondRow.add(radio3);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        this.add(secondRow, BorderLayout.SOUTH);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main() {
        new ComponentFrame();
    }
}