final int SIZE = 50;

void main() {
    long[] fib = new long[SIZE];
    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i < fib.length; i++) {
        fib[i] = fib[i-1] + fib[i-2];
    }

    for (long i : fib) {
        System.out.println(i);
    }
}