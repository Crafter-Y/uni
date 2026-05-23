package lottery;

import java.util.*;

public class Lottery {
    public static void main() {
        Set<Integer> result = new TreeSet<>();

        List<Integer> possibilities = new ArrayList<>();

        for (int i = 1; i <= 49; i++) {
            possibilities.add(i);
        }

        for (int i = 0; i < 6; i++) {
            Integer take = possibilities.get((int) Math.floor(Math.random() * possibilities.size()));
            result.add(take);
            possibilities.remove(take);
        }

        Integer special = possibilities.get((int) Math.floor(Math.random() * possibilities.size()));

        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println("Zusatzzahl: " + special);
    }
}
