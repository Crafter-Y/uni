import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("resource")
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Wurzel aus welcher Zahl ziehen? ");
    String input = scanner.next();
    int square = 0;
    try {
        square = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        System.err.println("Wrong number format");
        return;
    }

    double x_n = 1;

    System.out.println("xn: " + x_n);

    while (true) {
        double x_b = x_n;
        x_n = (x_n + square / x_n) / 2;
        System.out.println("xn: " + x_n);
        if (Math.abs(x_b - x_n) < 0.000001) break;
    }

    System.out.printf(Locale.ENGLISH, "Die Wurzel aus %d ist %.1f \n", square, x_n);
}