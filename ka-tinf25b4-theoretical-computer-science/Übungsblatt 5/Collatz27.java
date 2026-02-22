public class Collatz27 {
    private static int collatzCounter(int n, int iter) {
        int next = n % 2 == 0 ? n/2 : 3 * n + 1;

        if (next == 1) return iter;
        return collatzCounter(next, iter+1);
    }


    public static void main() {
        int steps = collatzCounter(27, 1);

        System.out.println("Lösbar in " + steps + " Schritten");
    }
}
