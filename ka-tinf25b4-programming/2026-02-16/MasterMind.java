import java.util.Scanner;

public class MasterMind {
    private static final char[] COLORS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    private static final int WIDTH = 5;
    private static final int MAX_TIPS = 20;

    private final char[] solution;
    private final char[][] guesses;

    public MasterMind() {
        this.solution = new char[WIDTH];
        for (int i = 0; i < WIDTH; i++) {
            this.solution[i] = COLORS[(int) (Math.random() * COLORS.length)];
        }
        this.guesses = new char[MAX_TIPS][WIDTH];
    }

    public MasterMind(char[] solution) {
        this.solution = solution;
        this.guesses = new char[MAX_TIPS][WIDTH];
    }

    public void play() {
        int turn = 1;
        while(turn <= MAX_TIPS) {
            char[] guess = collectGuess();
            guesses[turn - 1] = guess;

            if (evaluateGuess(guess, true)) {
                System.out.println("Mit " + turn + " Versuchen gewonnen!");
                return;
            }

            System.out.println(turn + " bisherige Versuche: ");

            for (int i = 0; i < turn; i++) {
                evaluateGuess(guesses[i], false);
            }

            turn++;
        }

        System.out.println("Sie haben es leider nicht in " + MAX_TIPS + " Schritten geschafft, die Lösung zu erraten");
    }

    private boolean evaluateGuess(char[] guess, boolean silent) {
        int correct = 0;
        int containing = 0;

        char[] localSolution = new char[WIDTH];
        System.arraycopy(this.solution, 0, localSolution, 0, WIDTH);

        for (int i = 0; i < WIDTH; i++) {
            if (guess[i] == localSolution[i]) {
                correct++;
                localSolution[i] = ' ';
            }
        }

        outer:
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == j) continue;

                if (guess[i] == localSolution[j]) {
                    containing++;
                    localSolution[j] = ' ';
                    continue outer;
                }
            }
        }

        if (correct == WIDTH) return true;

        if (!silent) {
            for (int i = 0; i < guess.length; i++) {
                System.out.print((guess[i] + "").toUpperCase());
            }
            System.out.println(" " + correct + "  " + containing);
        }

        return false;
    }

    @SuppressWarnings("resource")
    private char[] collectGuess() {
        Scanner scanner = new Scanner(System.in);

        char[] guess = new char[WIDTH];

        outer:
        while (true) {
            System.out.print("Geben Sie ihren Tipp ab: ");

            String next = scanner.nextLine().toUpperCase();

            if (next.length() != WIDTH) {
                System.out.println("Bitte geben Sie 5 Zeichen ein!");
                continue;
            }

            for (int i = 0; i < next.length(); i++) {
                char pos = next.charAt(i);

                boolean found = false;
                for (int j = 0; j < COLORS.length; j++) {
                    if (COLORS[j] == pos) found = true;
                }
                if (!found) {
                    System.out.println("Bitte geben Sie 5 gültige Zeichen ein!");
                    continue outer;
                }
                guess[i] = pos;
            }
            return guess;
        }
    }

    public static void main() {
        System.out.println();
        System.out.println();
        //new MasterMind(new char[] {'H', 'D', 'G', 'D', 'F'}).play();
        new MasterMind().play();
    }
}
