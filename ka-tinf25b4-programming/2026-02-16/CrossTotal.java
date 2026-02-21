import java.util.Scanner;

public final class CrossTotal {
    @SuppressWarnings("resource")
    public static void main() {
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Zahl für Quersumme eingeben: ");

        String input = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (character < 48 || character > 57) {
                System.out.print("Einhabe enthält nicht nur Zahlen");
                return;
            }

            sum += (character - 48);
        }

        System.out.println("Die Quersumme von " + input + " ist " + sum);
    }
}