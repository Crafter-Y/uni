import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    for(;;) {
        System.out.print("Zahl eingeben (<0 für Abbruch): ");
        String input = scanner.next();
        try {
            int integer = Integer.parseInt(input);

            if (integer < 0) break;

            sum += integer;
        } catch (NumberFormatException ex) {
            System.err.println("Ungültige Zahl eingegeben!");
        }
    }
    System.out.println("Summe: " + sum);
}