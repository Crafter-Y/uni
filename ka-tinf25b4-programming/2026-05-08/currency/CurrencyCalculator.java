package currency;

import javax.swing.*;
import java.awt.*;

public class CurrencyCalculator extends JFrame {
    public CurrencyCalculator() {

        this.add(new JTextField("Please enter amount to convert"), BorderLayout.NORTH);

        JPanel btnRow = new JPanel();

        btnRow.add(new JButton("EUR -> USD"));
        btnRow.add(new JButton("USD -> EUR"));
        btnRow.add(new JButton("Cancel"));

        this.add(btnRow, BorderLayout.SOUTH);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main() {
        new CurrencyCalculator();
    }
}
