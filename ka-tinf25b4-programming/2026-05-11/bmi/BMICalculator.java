package bmi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {

    public BMICalculator() {
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel weightRow = new JPanel();
        weightRow.add(new JLabel("Weight [kg]: "));
        JTextField weight = new JTextField("74", 10);
        weightRow.add(weight);

        panel.add(weightRow);

        JPanel heightRow = new JPanel();
        heightRow.add(new JLabel("Body height [m]: "));
        JTextField height = new JTextField("1.80", 10);
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
        JTextField bmi = new JTextField("22.83...", 12);
        mainOutPanel.add(bmi);

        panel.add(mainOutPanel);

        JPanel infoPanel = new JPanel();
        JTextField weightClassField = new JTextField("Normal weight", 22);
        infoPanel.add(weightClassField);

        panel.add(infoPanel);

        ActionListener calculateAction = _ -> {
            try {
                double weightD = Double.parseDouble(weight.getText());
                double heightD = Double.parseDouble(height.getText());
                double bmiD = (weightD / (heightD * heightD));
                bmi.setText(bmiD + "");

                String weightClass = "Untergewicht";
                if (male.isSelected()) {
                    if (bmiD > 20 && bmiD <= 25) {
                        weightClass = "Normalgewicht";
                    } else if (bmiD > 25 && bmiD <= 30) {
                        weightClass = "Übergewicht";
                    }  else if (bmiD > 30 && bmiD <= 40) {
                        weightClass = "Adipositas";
                    } else if (bmiD > 40) {
                        weightClass = "massive Adipositas";
                    }
                } else {
                    if (bmiD > 19 && bmiD <= 24) {
                        weightClass = "Normalgewicht";
                    } else if (bmiD > 24 && bmiD <= 30) {
                        weightClass = "Übergewicht";
                    }  else if (bmiD > 30 && bmiD <= 40) {
                        weightClass = "Adipositas";
                    } else if (bmiD > 40) {
                        weightClass = "massive Adipositas";
                    }
                }
                weightClassField.setText(weightClass);
            } catch (NumberFormatException _) {
            }
        };
        calculate.addActionListener(calculateAction);
        calculateAction.actionPerformed(null);

        this.add(panel);

        this.setSize(300, 250);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("BMI Calculator");
        this.setVisible(true);
    }

    public static void main() {
        new BMICalculator();
    }
}
