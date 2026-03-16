package game;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    private final Board board;
    private final Player[] players;

    public Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
    }

    @SuppressWarnings("resource")
    private Visit parseVisit() {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.nextLine();

        String[] moves = next.split(" ");
        Field[] fields = new Field[moves.length];

        for (int i = 0; i < moves.length; i++) {
            fields[i] = this.board.parseField(moves[i]);
        }

        return new Visit(fields);
    }

    public void start() {
        int round = 0;

        while(true) {
            round++;

            if (round > 10) {
                System.out.println("You're too bad for this game!");
                return;
            }

            for (Player player : players) {
                System.out.println(player.toString());
                providePossibleCheckout(player.getRemainingPoints());

                System.out.print("Enter visit: ");

                Visit visit = this.parseVisit();

                if (player.addVisit(visit)) {
                    System.out.println("Scored: " + visit.getValue());
                } else {
                    System.out.println("Did not count, sorry!");
                }
                System.out.println("=========================");

                if (player.getRemainingPoints() == 0) {
                    System.out.println("Game shot and the leg, " + player.getName());
                    this.saveHighscore(player, player.getCountDartsThrown());
                    return;
                }
            }
        }
    }

    private void saveHighscore(Player player, int darts) {
        File file = new File("./highscore.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.append(player.getName() + " won with " + darts + " darts.");
        } catch (IOException ignored) {}
    }

    private void providePossibleCheckout(int pointsLeft) {
        File file = new File("./checkouts.txt");

        try (FileReader fr = new FileReader(file)) {
            System.out.println("Possible checkout: " + fr.readAllLines().get(pointsLeft - 1));
        } catch (IOException | IndexOutOfBoundsException ignored) {};
    }
}
