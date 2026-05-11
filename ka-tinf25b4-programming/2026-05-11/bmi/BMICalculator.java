package bmi;

import javax.swing.*;
import java.awt.*;

public class BMICalculator extends JFrame {

    public BMICalculator() {
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel weightRow = new JPanel();
        weightRow.add(new JLabel("Weight [kg]: "));
        JTextField weight = new JTextField("74");
        weightRow.add(weight);

        panel.add(weightRow);

        JPanel heightRow = new JPanel();
        heightRow.add(new JLabel("Body height [m]: "));
        JTextField height = new JTextField("1.80");
        heightRow.add(height);

        panel.add(heightRow);

        JPanel radioRow = new JPanel();

        JRadioButton male = new JRadioButton("male", true);
        JRadioButton female = new JRadioButton("female");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(male);
        radioGroup.add(female);

        radioRow.add(male);
        radioRow.add(female);

        panel.add(radioRow);

        JButton calculate = new JButton("Calculate");

        panel.add(calculate);

        JPanel mainOutPanel = new JPanel();

        mainOutPanel.add(new JLabel("BMI: "));
        JTextField bmi = new JTextField("22.83...");
        mainOutPanel.add(bmi);

        panel.add(mainOutPanel);

        panel.add(new JTextField("Normal weight"));

        calculate.addActionListener(_ -> {
            try {
                double weightD = Double.parseDouble(weight.getText());
                double heightD = Double.parseDouble(height.getText());
                bmi.setText((weightD / (heightD * heightD)) + "");
            } catch (NumberFormatException _) {}
        });

        this.add(panel);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("BMI Calculator");
        this.setVisible(true);
    }

    public static void main() {
        new BMICalculator();
    }
}
