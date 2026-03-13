import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrimesFile {
    private static int[] sieve(int range) {
        boolean[] sieve = new boolean[range];
        boolean[] primes = new boolean[range];
        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = true;
            primes[i] = false;
        }

        int hits = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (!sieve[i]) continue;

            primes[i] = true;
            hits++;

            int prime = i;

            while (prime < range) {
                sieve[prime] = false;
                prime += i;
            }
        }

        int[] results = new int[hits];

        int j = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                results[j] = i;
                j++;
            }
        }
        return results;
    }

    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println();

        File primeFile = new File("./primes.txt");

        try (FileWriter fw = new FileWriter(primeFile)) {
            for (int prime : sieve(100_000)) {
                fw.append(prime + "\n");
            }
            fw.flush();
        }

        System.out.println("Welche Zahl prüfen?: ");
        try (Scanner scanner = new Scanner(System.in); FileReader fr = new FileReader(primeFile)) {
            String query = scanner.nextLine();

            for (String line : fr.readAllLines()) {
                if (line.equals(query)) {
                    System.out.println("Found!");
                    return;
                }
            }
            System.out.println("Not Found!");
        }
    }
}