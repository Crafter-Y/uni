import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeFile {
    private static String palindrom() {
        System.out.println();
        System.out.println();

        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bitte Wort eingeben: ");

            input = scanner.nextLine();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = input.length(); i > 0; i--) {
            sb.append(input.charAt(i-1));
        }

        System.out.println("Umgekehrt: " + sb);

        if (sb.toString().equalsIgnoreCase(input)) {
            System.out.println(input + " ist ein Palindrom.");
            return sb.toString();
        }
        return null;
    }

    public static void main() throws IOException {
        File palindromFile = new File("./palindrom.txt"); 

        String palindrom = palindrom();

        if (palindrom != null) {
            try (FileWriter writer = new FileWriter(palindromFile, true)) {
                writer.append(palindrom + "\n");
            }
        }

        System.out.println("Alle bisher gefundenen Palindrome:");
        try (FileReader reader = new FileReader(palindromFile)) {
            for(String line : reader.readAllLines()) {
                System.out.println(line);
            }
        }
    }
}
