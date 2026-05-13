package guessinggame;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
public class NumberGuess extends JFrame {
    private final Game game;

    public NumberGuess() {
        this.game = new Game();

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
        guessRow.add(new JLabel("Enter number between 1 and 1000 "));

        JTextField guessInput = new JTextField();
        guessInput.setColumns(10);
        guessRow.add(guessInput);
        vertical.add(guessRow);

        JPanel controlRow = new JPanel();

        JButton newGameButton = new JButton("New Game");
        newGameButton.addActionListener(_ -> this.game.newGame(nameInput.getText()));
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> this.game.guess(guessInput.getText()));
        JButton bestPlayerButton = new JButton("Best Player");
        bestPlayerButton.addActionListener(_ -> this.game.showBestPlayer());
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(_ -> System.exit(0));

        controlRow.add(newGameButton);
        controlRow.add(okButton);
        controlRow.add(bestPlayerButton);
        controlRow.add(exitButton);

        vertical.add(controlRow);

        JTextField statusOutput = new JTextField();
        statusOutput.setColumns(40);

        JPanel outputRow = new JPanel();
        outputRow.add(statusOutput);

        vertical.add(outputRow);

        this.game.setOutputBox(statusOutput);

        this.setSize(420, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private static class Game {
        final static String OUTPUT_FILE = "./out/guessing-results.txt";

        private int goal;
        private String name;
        private JTextField outputBox;
        private int numGuesses = 0;

        public Game() {
            this.reset();
        }

        public void setOutputBox(JTextField outputBox) {
            this.outputBox = outputBox;
        }

        private void reset() {
            this.goal = (int) Math.floor(Math.random() * 1000);
            this.numGuesses = 0;
            this.name = null;
            System.out.println("Debug: " + goal);
        }

        public void newGame(String name) {
            reset();
            this.name = name;

            outputBox.setText("New Game started. Time to guess a number!");
        }

        public void guess(String stringInput) {
            if (this.name == null) {
                outputBox.setText("Game not started yet - press New Game to start a game!");
                return;
            }
            try {
                int guess = Integer.parseInt(stringInput);

                this.numGuesses++;

                StringBuilder response = new StringBuilder();
                response.append("Attempt #")
                        .append(this.numGuesses)
                        .append(": ")
                        .append(guess)
                        .append(" => ");

                if (guess > goal) {
                    response.append("too big!");
                } else if (guess < goal) {
                    response.append("too small!");
                } else {
                    response.append("you won!");
                    this.appendResults();
                    this.name = null; // to prevent new guesses
                }

                this.outputBox.setText(response.toString());
            } catch (NumberFormatException e) {
                outputBox.setText("Guess is not a number - pick a valid number!");
            }
        }

        private void appendResults() {
            try {
                Path path = Paths.get(OUTPUT_FILE);
                if (!Files.exists(path)) {
                    Files.createFile(path);
                }

                String line = this.numGuesses + " - " + this.name;

                Files.writeString(path, line + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                this.outputBox.setText("File output failed!");
            }
        }

        public void showBestPlayer() {
            try {
                Path path = Paths.get(OUTPUT_FILE);

                if (!Files.exists(path)) {
                    outputBox.setText("No best results yet!");
                    return;
                }

                List<String> lines = Files.readAllLines(path);

                var entries = lines.stream()
                        .map(el -> el.split(" "))
                        .map(el -> new Pair<>(Integer.parseInt(el[0]), el[2]))
                        .toList();

                Pair<Integer, String> lowest = entries.getFirst();
                for (Pair<Integer, String> entry : entries) {
                    if (lowest.l > entry.l) {
                        lowest = entry;
                    }
                }

                outputBox.setText("Player " + lowest.r + " holds the hightscore with " + lowest.l);

            } catch (IOException e) {
                outputBox.setText("Reading score file failed!");
            } catch (NumberFormatException e) {
                outputBox.setText("Scores file format seems wrong!");
            }
        }
    }

    public static class Pair<L,R> {
        private L l;
        private R r;
        public Pair(L l, R r){
            this.l = l;
            this.r = r;
        }
        public L getL(){ return l; }
        public R getR(){ return r; }
        public void setL(L l){ this.l = l; }
        public void setR(R r){ this.r = r; }
    }

    public static void main() {
        new NumberGuess();
    }
}
