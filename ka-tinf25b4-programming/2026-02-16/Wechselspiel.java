import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
NOTE: Abweichungen von der Aufgabenstellung.

Ich habe hier erstmal das Spiel implementiert, sodass es spielbar ist

Was fehlt:
- Wechselspiel enthält alles. Steuerung "von außerhalb" ist nicht wirklich möglich
- Größe des Spielfelds nicht daynamisch
- Anzahl Farben nicht dynamisch
- Benutzeroberfläche und Logik sind eng verknüpft
- Alles ist in einer Datei, man könnte gewisse Dinge in mehrere Dateien refactorn
- Zeitnahme ist nicht implementiert.
  - Das Programm wartet auf Input
  - Es gibt keinen Renderloop
*/

public class Wechselspiel {
    private int points = 0;

    private final List<List<Color>> board = new ArrayList<>();

    private static enum Color {
        RED("\u001B[41m"),
        GREEN("\u001B[42m"),
        YELLOW("\u001B[43m"),
        BLUE("\u001B[44m"),
        PURPLE("\u001B[45m"),
        CYAN("\u001B[46m"),
        WHITE("\u001B[47m");
       

        private String terminalCode;

        Color(String terminalEscapeSequence) {
            this.terminalCode = terminalEscapeSequence;
        }

        public String getTerminalCode() {
            return this.terminalCode;
        }

        public static Color random() {
            return Color.values()[(int) (Math.random() * Color.values().length)];
        }
    }

    public Wechselspiel() {
        do {
            board.clear();
            for (int i = 0; i < 9; i++) {
                board.add(new ArrayList<>());
                for (int j = 0; j < 9; j++) {
                    board.get(i).add(Color.random());
                }
            }
        } while(validMove());
    }

    public void play() {
        while(true) {
            awaitLegalMovement();

            while (validMove()) {
                draw();
                try {
                    Thread.sleep(1000);
                } catch(Exception ignored){}

                collectBlocks();

                dropAndFill();
            }
        }
    }

    private void draw() {
        System.out.println("Punkte: " + this.points);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("     ");
                        continue;
                    }
                    System.out.printf(" %c   ", 64 + j);
                    continue;
                }
                if (j == 0) {
                    System.out.print(i + "    ");
                    continue;
                }

                System.out.print(this.board.get(i-1).get(j-1).getTerminalCode() + "   \u001B[0m");
                System.out.print("  ");
            }
            System.out.println();
            System.out.println();
        }

        System.out.println("Machen Sie eine Eingabe (z.B. B2B3):");
        System.out.print("> ");
    }

    // Checks if there is a 3 color row or column
    private boolean validMove() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (
                    j <= 6 &&
                    this.board.get(i).get(j) == this.board.get(i).get(j + 1) && 
                    this.board.get(i).get(j + 1) == this.board.get(i).get(j + 2)
                ) return true;
                if (
                    i <= 6 &&
                    this.board.get(i).get(j) == this.board.get(i + 1).get(j) && 
                    this.board.get(i + 1).get(j) == this.board.get(i + 2).get(j)
                ) return true;
            }
        }

        return false;
    }

    @SuppressWarnings("resource")
    private void awaitLegalMovement() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            draw();

            String next = scanner.nextLine();

            if (next.length() != 4) continue;

            int x1 = next.charAt(0);
            int y1 = next.charAt(1);
            int x2 = next.charAt(2);
            int y2 = next.charAt(3);

            if (
                x1 < 65 || // A
                x1 > 73 || // I
                y1 < 49 || // 1
                y1 > 57 || // 9
                x2 < 65 ||
                x2 > 73 ||
                y2 < 49 ||
                y2 > 57
            ) continue;

            if (Math.abs(x1 - x2) > 1) continue;
            if (Math.abs(y1 - y2) > 1) continue;
            if (x1 != x2 && y1 != y2) continue;

            Color from = this.board.get(y1 - 49).get(x1 - 65);
            Color to = this.board.get(y2 - 49).get(x2 - 65);

            this.board.get(y1 - 49).set(x1 - 65, to);
            this.board.get(y2 - 49).set(x2 - 65, from);

            if (!validMove()) {
                this.board.get(y1 - 49).set(x1 - 65, from);
                this.board.get(y2 - 49).set(x2 - 65, to);
                continue;
            }

            break;
        }
    }

    private void collectBlocks() {
        List<List<Boolean>> countedFields = new ArrayList<>();
        for (int i = 0; i < this.board.size(); i++) {
            countedFields.add(new ArrayList<>());
            for (int j = 0; j < this.board.size(); j++) {
                countedFields.get(i).add(false);
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // horizontal 5 blocks
                if (
                    j <= 4 &&
                    this.board.get(i).get(j) == this.board.get(i).get(j + 1) && 
                    this.board.get(i).get(j + 1) == this.board.get(i).get(j + 2) && 
                    this.board.get(i).get(j + 2) == this.board.get(i).get(j + 3) && 
                    this.board.get(i).get(j + 3) == this.board.get(i).get(j + 4)
                ) {
                    countedFields.get(i).set(j, true);
                    countedFields.get(i).set(j + 1, true);
                    countedFields.get(i).set(j + 2, true);
                    countedFields.get(i).set(j + 3, true);
                    countedFields.get(i).set(j + 4, true);

                    this.points += 50;
                }
                // vertical 5 blocks
                if (
                    i <= 4 &&
                    this.board.get(i).get(j) == this.board.get(i + 1).get(j) && 
                    this.board.get(i + 1).get(j) == this.board.get(i + 2).get(j) && 
                    this.board.get(i + 2).get(j) == this.board.get(i + 3).get(j) && 
                    this.board.get(i + 3).get(j) == this.board.get(i + 4).get(j)
                ) {
                    countedFields.get(i).set(j, true);
                    countedFields.get(i + 1).set(j, true);
                    countedFields.get(i + 2).set(j, true);
                    countedFields.get(i + 3).set(j, true);
                    countedFields.get(i + 4).set(j, true);

                    this.points += 50;
                }
                // horizontal 4 blocks
                if (
                    j <= 5 &&
                    this.board.get(i).get(j) == this.board.get(i).get(j + 1) && 
                    this.board.get(i).get(j + 1) == this.board.get(i).get(j + 2) && 
                    this.board.get(i).get(j + 2) == this.board.get(i).get(j + 3) &&
                    !(countedFields.get(i).get(j) && countedFields.get(i).get(j + 1) && countedFields.get(i).get(j + 2) && countedFields.get(i).get(j + 3))
                ) {
                    countedFields.get(i).set(j, true);
                    countedFields.get(i).set(j + 1, true);
                    countedFields.get(i).set(j + 2, true);
                    countedFields.get(i).set(j + 3, true);

                    this.points += 40;
                }
                // vertical 4 blocks
                if (
                    i <= 5 &&
                    this.board.get(i).get(j) == this.board.get(i + 1).get(j) && 
                    this.board.get(i + 1).get(j) == this.board.get(i + 2).get(j) && 
                    this.board.get(i + 2).get(j) == this.board.get(i + 3).get(j) &&
                    !(countedFields.get(i).get(j) && countedFields.get(i + 1).get(j) && countedFields.get(i + 2).get(j) && countedFields.get(i + 3).get(j))
                ) {
                    countedFields.get(i).set(j, true);
                    countedFields.get(i + 1).set(j, true);
                    countedFields.get(i + 2).set(j, true);
                    countedFields.get(i + 3).set(j, true);

                    this.points += 40;
                }
                 // horizontal 3 blocks
                if (
                    j <= 6 &&
                    this.board.get(i).get(j) == this.board.get(i).get(j + 1) && 
                    this.board.get(i).get(j + 1) == this.board.get(i).get(j + 2) && 
                    !(countedFields.get(i).get(j) && countedFields.get(i).get(j + 1) && countedFields.get(i).get(j + 2))
                ) {
                    countedFields.get(i).set(j, true);
                    countedFields.get(i).set(j + 1, true);
                    countedFields.get(i).set(j + 2, true);

                    this.points += 30;
                }
                // vertical 3 blocks
                if (
                    i <= 6 &&
                    this.board.get(i).get(j) == this.board.get(i + 1).get(j) && 
                    this.board.get(i + 1).get(j) == this.board.get(i + 2).get(j) && 
                    !(countedFields.get(i).get(j) && countedFields.get(i + 1).get(j) && countedFields.get(i + 2).get(j))
                ) {
                    countedFields.get(i).set(j, true);
                    countedFields.get(i + 1).set(j, true);
                    countedFields.get(i + 2).set(j, true);

                    this.points += 30;
                }
            }
        }
        
        for (int i = 0; i < countedFields.size(); i++) {
            for (int j = 0; j < countedFields.size(); j++) {
                if (countedFields.get(i).get(j)) this.board.get(i).set(j, null);
            }
        }
    }

    private void dropAndFill() {
        for (int i = 0; i < 5; i++) { // 4 times
            for (int row = 8; row > 0; row--) {
                for (int column = 0; column < this.board.size(); column++) {
                    if (
                        this.board.get(row).get(column) == null &&
                        this.board.get(row - 1).get(column) != null
                    ) {
                        this.board.get(row).set(column, this.board.get(row - 1).get(column));
                        this.board.get(row - 1).set(column, null);
                    }
                }
            }
        }

        for (List<Color> list : this.board) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == null) list.set(i, Color.random());
            }
        }
    }

    public static void main() {
        System.out.println();
        System.out.println();

        new Wechselspiel().play();
    }
}
