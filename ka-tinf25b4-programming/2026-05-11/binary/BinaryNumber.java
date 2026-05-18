package binary;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BinaryNumber extends JFrame {
    public BinaryNumber() throws IOException {
        ImageIcon imgOff = new ImageIcon("external/off.png");
        ImageIcon imgOn = new ImageIcon("external/on.png");

        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));

        JLabel output = new JLabel("0");
        output.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        JPanel switchRow = new JPanel();
        JPanel labelRow = new JPanel();

        List<JToggleButton> toggles = new ArrayList<>();

        for (int i = 7; i >= 0; i--) {
            JToggleButton switchButton = new JToggleButton();

            switchButton.setIcon(imgOff);
            switchButton.setSelectedIcon(imgOn);
            switchButton.setName(i + "");

            switchButton.addActionListener(_ -> {
                int sum = 0;
                for (int j = 0; j < 8; j++) {
                    if (toggles.get(j).isSelected()) {
                        sum += (int) Math.pow(2, 7-j);
                    }
                }
                output.setText(sum + "");
            });

            toggles.add(switchButton);
            switchRow.add(switchButton);
            JLabel label = new JLabel("         2^" + i + "           ");
            labelRow.add(label);
        }

        verticalPanel.add(switchRow);
        verticalPanel.add(labelRow);
        verticalPanel.add(output);

        this.add(verticalPanel);

        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Binary Number");
        this.setVisible(true);
    }


    public static void main() throws IOException {
        new BinaryNumber();
    }
}
