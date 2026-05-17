package shellgame;

import guessinggame.NumberGuess;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ShellGame extends JFrame {
    final static String OUTPUT_FILE = "./out/shell-results.txt";

    private int goal;
    private int guess = 0;
    private final JTextField statusOutput;

    public ShellGame() {
        super("Shell Game");
        JPanel vertical = new JPanel();
        vertical.setLayout(new BoxLayout(vertical, BoxLayout.Y_AXIS));
        this.add(vertical);

        JPanel nameRow = new JPanel();
        nameRow.add(new JLabel("Player Name "));

        JTextField nameInput = new JTextField("Name");
        nameInput.setColumns(25);
        nameRow.add(nameInput);
        vertical.add(nameRow);

        JPanel guessRow = new JPanel();
        JButton guess1 = new JButton("Shell 1");
        guess1.addActionListener(_ -> guess(1, nameInput.getText()));
        guessRow.add(guess1);
        JButton guess2 = new JButton("Shell 2");
        guess2.addActionListener(_ -> guess(2, nameInput.getText()));
        guessRow.add(guess2);
        JButton guess3 = new JButton("Shell 3");
        guess3.addActionListener(_ -> guess(3, nameInput.getText()));
        guessRow.add(guess3);
        vertical.add(guessRow);

        JPanel controlRow = new JPanel();

        JButton statisticsButton = new JButton("Statistics");
        statisticsButton.addActionListener(_ -> showStatistics());
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(_ -> System.exit(0));

        controlRow.add(statisticsButton);
        controlRow.add(exitButton);

        vertical.add(controlRow);

        statusOutput = new JTextField();
        statusOutput.setColumns(40);

        JPanel outputRow = new JPanel();
        outputRow.add(statusOutput);

        vertical.add(outputRow);

        this.setSize(420, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        reset();
    }

    private void reset() {
        this.goal = (int) Math.ceil(Math.random() * 3);
    }

    private void guess(int num, String name) {
        this.guess++;

        StringBuilder output = new StringBuilder()
                .append("Attempt ")
                .append(this.guess);

        if (num == goal) {
            output.append(" wins: ");
            appendResults(name);
            this.guess = 0;
        } else {
            output.append(" looses: ");
        }

        output.append("Ball was below shell ").append(this.goal);
        reset();
        this.statusOutput.setText(output.toString());
    }

    private void appendResults(String name) {
        try {
            Path path = Paths.get(OUTPUT_FILE);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            String line = this.guess + " - " + name;

            Files.writeString(path, line + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            this.statusOutput.setText("File output failed!");
        }
    }

    private void showStatistics() {
        try {
            Path path = Paths.get(OUTPUT_FILE);

            if (!Files.exists(path)) {
                statusOutput.setText("No best results yet!");
                return;
            }

            List<String> lines = Files.readAllLines(path);

            var entries = lines.stream()
                    .map(el -> el.split(" "))
                    .map(el -> Integer.parseInt(el[0]))
                    .toList();

            int sum = 0;
            for (Integer score : entries) {
                sum += score;
            }

            float avg = sum/(entries.size() * 1.0f);

            statusOutput.setText("Success after "+ avg +" attempts!");

        } catch (IOException e) {
            statusOutput.setText("Reading score file failed!");
        } catch (NumberFormatException e) {
            statusOutput.setText("Scores file format seems wrong!");
        }
    }

    public static void main() {
        new ShellGame();
    }
}
