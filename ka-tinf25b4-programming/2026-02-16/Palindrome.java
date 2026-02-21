import java.util.Scanner;

public class Palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Wort eingeben: ");

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = input.length(); i > 0; i--) {
            sb.append(input.charAt(i-1));
        }

        System.out.println("Umgekehrt: " + sb);

        if (sb.toString().equalsIgnoreCase(input)) {
            System.out.println(input + " ist ein Palindrom.");
        }
    }
}
