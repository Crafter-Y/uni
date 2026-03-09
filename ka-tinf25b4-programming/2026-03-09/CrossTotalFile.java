import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public final class CrossTotalFile {
    @SuppressWarnings("resource")
    private static String crossTotal() {
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
                return null;
            }

            sum += (character - 48);
        }

        return "Die Quersumme von " + input + " ist " + sum;
    }

    public static void main() throws IOException {
        Path output = Paths.get("./crosstotals.txt");

        if (!Files.exists(output)) {
            Files.createFile(output);
        }

        String cross = crossTotal();

        if (cross != null) {
            Files.writeString(output, cross + "\n", StandardOpenOption.APPEND);
        }
    }
}