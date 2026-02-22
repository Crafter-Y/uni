import java.util.ArrayList;
import java.util.List;

public class Collatz37 {
    private static int collatzCounter(int n, int stop) {
        if (n == 1) return 0;

        for (int i = 1; i <= stop; i++) {
            n = n % 2 == 0 ? n/2 : 3 * n + 7;

            if (n == 1) return i;
        }

        return -1;
    }

    public static void main() {
        System.out.println();

        List<Integer> notSolvable = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            int sol = collatzCounter(i, 10_000);
            if (sol == -1) notSolvable.add(i);
            System.out.println(i + " :" + sol);
        }

        System.out.println();
        System.out.println("Not solvable: " + notSolvable);
    }
}
