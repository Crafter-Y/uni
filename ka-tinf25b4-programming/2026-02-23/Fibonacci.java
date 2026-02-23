import java.util.Scanner;

public class Fibonacci {
    private static int fib(int n) {
       if (n == 1 || n == 2) return 1;

       return fib(n-1) + fib(n-2);
    }

    @SuppressWarnings("resource")
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Wie viele Fibonacci-Zahlen berechnen? ");
            try {
                String next = scanner.nextLine();
                n = Integer.parseInt(next);
                if (n >= 1) break;
            } catch (Exception ignored) {}
            System.out.println("Die Eingegebene Zahl ist nicht gültig.");
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }
}
