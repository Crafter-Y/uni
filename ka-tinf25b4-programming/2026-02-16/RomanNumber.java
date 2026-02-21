import java.util.Scanner;

public class RomanNumber {
    @SuppressWarnings("resource")
    public static void main() {
        System.out.println();
        System.out.println();

        System.out.print("Bitte geben Sie eine röm. Zahl ein: ");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        input = input.replace("IV", "IIII");
        input = input.replace("IX", "VIII");
        input = input.replace("XL", "XXXX");
        input = input.replace("XC", "LXXXX");
        input = input.replace("CD", "CCCC");
        input = input.replace("CM", "DCCCC");

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            
                default:
                    System.out.println("Ungültige Eingabe!");
                    System.exit(1);
                    break;
            }
        }

        System.out.println("Der Wert der Zahl " + input + " ist " + sum);
    }
}
