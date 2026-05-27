package gas;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class GasStations extends JFrame {
    private final Map<String, GasPrices> prices = new TreeMap<>();

    public GasStations() {
        JPanel vertical = new JPanel();
        vertical.setLayout(new BoxLayout(vertical, BoxLayout.Y_AXIS));

        JPanel inputs = new JPanel();
        inputs.setLayout(new GridLayout(4,2,2,2));

        inputs.add(new JLabel("Station Name"));
        JTextField name = new JTextField("VolkerSprit");
        inputs.add(name);

        inputs.add(new JLabel("Diesel"));
        JTextField diesel = new JTextField("1.96");
        inputs.add(diesel);

        inputs.add(new JLabel("Super E5"));
        JTextField superE5 = new JTextField("1.97");
        inputs.add(superE5);

        inputs.add(new JLabel("Super E10"));
        JTextField superE10 = new JTextField("1.91");
        inputs.add(superE10);

        vertical.add(inputs);

        JPanel saveRow = new JPanel();

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(_ -> {
            if (name.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Es muss ein Name eingegeben werden!",
                        "Fehlende Eingaben!",
                        JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }
            GasPrices gasPrices = new GasPrices(diesel.getText(), superE5.getText(), superE10.getText());
            prices.put(name.getText().trim(), gasPrices);

            JOptionPane.showMessageDialog(
                    this,
                    "Saved: " + gasPrices,
                    "Meldung",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });
        JButton showAllButton = new JButton("Show all");
        showAllButton.addActionListener(_ -> {
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<String, GasPrices> gasStation : this.prices.entrySet()) {
                sb.append(gasStation.getKey()).append(": ").append(gasStation.getValue()).append("\n");
            }

            JOptionPane.showMessageDialog(
                    this,
                    sb.toString(),
                    "Meldung",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        saveRow.add(saveButton);
        saveRow.add(showAllButton);

        vertical.add(saveRow);

        this.add(vertical);

        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Gas Stations");
        this.setVisible(true);
    }

    private record GasPrices(double diesel, double superE5, double superE10) {
        public GasPrices(String diesel, String superE5, String superE10) {
            this(extractPrice(diesel), extractPrice(superE5), extractPrice(superE10));
        }

        @Override
        public String toString() {
            return String.format("Diesel: %.2f, SuperE5: %.2f, SuperE10: %.2f", this.diesel, this.superE5, this.superE10);
        }

        private static double extractPrice(String field) {
            try {
                return Double.parseDouble(field);
            } catch (NumberFormatException _) {
                return -1;
            }
        }
    }

    public static void main() {
        new GasStations();
    }
}
