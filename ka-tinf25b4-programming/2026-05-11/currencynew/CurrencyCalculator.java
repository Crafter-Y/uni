package currencynew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyCalculator extends JFrame {
    public CurrencyCalculator() {

        JTextField input = new JTextField("Please enter amount to convert");

        this.add(input, BorderLayout.NORTH);

        ActionListener calculate = e -> {
            try {
                double number = Double.parseDouble(input.getText());
                if (((JButton) e.getSource()).getName().equals("EUR")) {
                    input.setText((number * 1.09 ) + "");
                } else {
                    input.setText((number / 1.09 ) + "");
                }
            } catch (NumberFormatException _) {}
        };

        JPanel btnRow = new JPanel();

        JButton eurUsdButton = new JButton("EUR -> USD");
        eurUsdButton.setName("EUR");
        JButton usdEurButton = new JButton("EUR -> USD");
        usdEurButton.setName("USD");
        JButton cancelButton = new JButton("Cancel");

        eurUsdButton.addActionListener(calculate);
        usdEurButton.addActionListener(calculate);

        cancelButton.addActionListener(_ -> System.exit(0));

        btnRow.add(eurUsdButton);
        btnRow.add(usdEurButton);
        btnRow.add(cancelButton);

        this.add(btnRow, BorderLayout.SOUTH);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main() {
        new CurrencyCalculator();
    }
}
