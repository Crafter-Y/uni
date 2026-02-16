import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {
    private int of;
    private int[] tips;
    private int[] result;

    public Lotto(int guesses, int of) {
        this.tips = new int[guesses];
        this.result = new int[guesses];
        this.of = of;
    }

    private int getTipCount() {
        int counter = 0;
        for(int i : this.tips) {
            if (i != 0) counter++;
        }

        return counter;
    }

    @SuppressWarnings("resource")
    private void acceptTip() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Geben Sie bitte Ihren Tipp für die %d. Zahl ein: ", this.getTipCount() + 1);

            try {
                String next = scanner.next();

                int tip = Integer.parseInt(next);

                if (tip >= 1 && tip <= this.of) {
                    boolean doubleTip = false;
                    for (int i : tips) {
                        if (i == tip) doubleTip = true;
                    }

                    if (!doubleTip) {
                        this.tips[this.getTipCount()] = tip;
                        break;
                    }
                }
            } catch (NumberFormatException ignored) {}

            System.out.println("Bitte geben Sie einen gültigen Tip ab.");
            System.out.printf("Der Tip muss zwischen 1 und %d liegen und darf nicht doppelt vorkommen.\n", this.of);
        }
    }

    public void tippen() {
        while(this.getTipCount() < this.tips.length) {
            acceptTip();
        }
    }

    public void tippen(int[] tipp) {
        if (tipp.length != this.tips.length) {
            System.err.println("Es müssen " + this.tips.length + " Tips abgegeben werden.");
            return;
        }

        for (int i = 0; i < tipp.length; i++) {
            if (tipp[i] <= 1 || tipp[i] >= this.of) {
                System.out.printf("Der Tip muss zwischen 1 und %d liegen.\n", this.of);
                return;
            }

            for (int j = 0; j < tipp.length; j++) {
                if (i == j) continue;

                if (tipp[i] == tipp[j]) {
                    System.out.println("Der Tipp darf keine doppelten Elemente enthalten");
                    return;
                }
            }
        }

        this.tips = tipp;
    }

    public void ziehen() {
        List<Integer> pool = new ArrayList<>();
        for (int i = 0; i < this.of; i++) {
            pool.add(i+1);
        }
        for (int i = 0; i < result.length; i++) {
            int randomIndex = (int) Math.floor(Math.random() * pool.size());
            result[i] = pool.get(randomIndex);
            pool.remove(randomIndex);
        }
    }

    public int richtige() {
        int richtige = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (this.tips[i] == this.result[j]) richtige++;
            }
        }
        return richtige;
    }

    public static String toSortedString(int[] ints) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }
        list.sort((a,b) -> a > b ? 1 : -1);

        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (this.getTipCount() == this.tips.length) {
            sb.append("Tipp: ").append(Lotto.toSortedString(this.tips)).append("\n");;
        }

        if (this.result[0] != 0) {
            sb.append("Gezogene Zahlen: ").append(Lotto.toSortedString(this.result)).append("\n");
        }

        return sb.toString();
    }

    public static void main() {
        Lotto game = new Lotto(6, 49);
        game.tippen();
        System.out.println(game);
        game.ziehen();
        System.out.println(game);

        System.out.println("Richtige: " + game.richtige());
    }
}
