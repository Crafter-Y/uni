final int RANGE = 100;

void main() {
    boolean[] sieve = new boolean[RANGE];
    boolean[] primes = new boolean[RANGE];
    for (int i = 0; i < sieve.length; i++) {
        sieve[i] = true;
        primes[i] = false;
    }

    for (int i = 2; i < sieve.length; i++) {
        if (!sieve[i]) continue;

        primes[i] = true;

        int prime = i;

        while (prime < RANGE) {
            sieve[prime] = false;
            prime += i;
        }
    }

    for (int i = 0; i < primes.length; i++) {
        if (primes[i]) System.out.println(i);
    }
}