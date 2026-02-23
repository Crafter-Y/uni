import java.util.Locale;
import java.util.Scanner;

public class Exponentiation {
    public static double xPowerN(double x,int n) {
        return n == 0 ? 1 : x * xPowerN(x, n-1);
    }

    @SuppressWarnings("resource")
    public static void main() {
        System.out.println();
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie bitte die Basis ein: ");
        double x = scanner.nextDouble();
    
        System.out.print("Geben Sie bitte den positiven ganzzahligen Exponenten ein: ");
        int n = scanner.nextInt();
        System.out.printf(Locale.ENGLISH, "%.1f^%d = %.1f", x, n, xPowerN(x, n));
    }
}
