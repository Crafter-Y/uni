import java.util.Scanner;

public class Nimmspiel {
    private String player1;
    private String player2;

    private int stack1;
    private int stack2;

    public Nimmspiel(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;

        this.stack1 = (int) Math.ceil(Math.random() * 9);
        this.stack2 = (int) Math.ceil(Math.random() * 9);
    }

    public String toString() {
        return String.format("Spieler: %s und %s, Haufen 1: %d Kugel(n), Haufen 2: %d Kugel(n)", player1, player2,
                stack1, stack2);
    }

    @SuppressWarnings("resource")
    public int selectStack(String currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Spieler %s: Von welchem Haufen ziehen Sie die Kugeln?: ", currentPlayer);

            String next = scanner.nextLine();
            try {
                int selection = Integer.parseInt(next);

                if ((selection == 1 && this.stack1 > 0) || selection == 2 && this.stack2 > 0)
                    return selection;
            } catch (NumberFormatException irgnored) {
            }

            System.out.print("Bitte wählen Sie einen verfügbaren Haufen: ");
            if (this.stack1 > 0) {
                System.out.print("1 ");
            }
            if (this.stack2 > 0) {
                System.out.print("2\n");
            }
        }
    }

    @SuppressWarnings("resource")
    public void take(String currentPlayer, int stack) {
        Scanner scanner = new Scanner(System.in);

        int available = stack == 1 ? this.stack1 : this.stack2;

        while (true) {
            System.out.printf("Spieler %s: Wie viele Kugeln ziehen Sie?: ", currentPlayer);

            String next = scanner.nextLine();
            try {
                int selection = Integer.parseInt(next);

                if (selection >= 1 && selection <= available) {
                    if (stack == 1) {
                        this.stack1 -= selection;
                    } else {
                        this.stack2 -= selection;
                    }
                    return;
                }
            } catch (NumberFormatException irgnored) {
            }

            System.out.println("Bitte wählen Sie eine Zahl zwischen 1 und " + available);
        }
    }

    public void play() {
        String currentPlayer = player1;

        System.out.println(this);
        while (true) {
            int selectedStack = this.selectStack(currentPlayer);

            this.take(currentPlayer, selectedStack);

            System.out.println(this);

            if (stack1 + stack2 == 0) {
                System.out.println("Spiel beendet.");
                System.out.println("Gewonnen hat Spieler " + currentPlayer);
                break;
            }

            currentPlayer = currentPlayer == player1 ? player2 : player1;
        }
    }

    public static void main() {
        Nimmspiel game = new Nimmspiel("Alf", "Ben");
        game.play();
    }
}