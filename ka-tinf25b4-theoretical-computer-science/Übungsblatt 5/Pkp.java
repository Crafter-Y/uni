import java.util.ArrayList;
import java.util.List;

public class Pkp {
    public record Pair(String a, String b, String idv) {
        public Pair(String a, String b) {
            this(a, b, "");
        }
    }

    public static Pair solve(List<Pair> pairs, int maxDepth) {
        List<Pair> prevPairs = new ArrayList<>();
        prevPairs.add(new Pair("", ""));

        for (int i = 0; i < maxDepth; i++) {
            List<Pair> newPairs = new ArrayList<>();

            for(Pair prevPair : prevPairs) {
                for (int j = 0; j < pairs.size(); j++) {
                    Pair appendPair = pairs.get(j);

                    String a1 = prevPair.a + appendPair.a;
                    String a2 = prevPair.b + appendPair.b;

                    if (a1.equals(a2)) return new Pair(a1, a2, prevPair.idv + (j + 1));

                    boolean aValid = true;
                    for (int idx = 0; idx < Math.min(a1.length(), a2.length()); idx++) {
                        if (a1.charAt(idx) != a2.charAt(idx)) aValid = false;
                    }

                    if (aValid) newPairs.add(new Pair(a1, a2, prevPair.idv + (j + 1)));
                }
            }

            prevPairs = newPairs;
        }

        return null;
    }


    public static void main() {
        System.out.println();
        System.out.println();

        List<Pair> r = new ArrayList<>();
        r.add(new Pair("1", "2112"));
        r.add(new Pair("21", "1"));
        r.add(new Pair("01", "0"));
        System.out.println("K0: "  + solve(r, 12));

        List<Pair> a = new ArrayList<>();
        a.add(new Pair("0", "52"));
        a.add(new Pair("2", "0"));
        a.add(new Pair("2505", "25"));
        a.add(new Pair("3", "23"));
        System.out.println("K1: "  + solve(a, 12));

        List<Pair> b = new ArrayList<>();
        b.add(new Pair("11", "0"));
        b.add(new Pair("011", "1"));
        b.add(new Pair("0", "011"));
        System.out.println("K2: "  + solve(b, 12));

        List<Pair> c = new ArrayList<>();
        c.add(new Pair("10", "101"));
        c.add(new Pair("011", "11"));
        c.add(new Pair("101", "011"));
        System.out.println("K3: "  + solve(c, 10_000));

        List<Pair> d = new ArrayList<>();
        d.add(new Pair("0", "000"));
        d.add(new Pair("1", "0"));
        d.add(new Pair("110", "1"));
        d.add(new Pair("00", "110"));
        System.out.println("K4: "  + solve(d, 12));

        List<Pair> e = new ArrayList<>();
        e.add(new Pair("001", "0"));
        e.add(new Pair("01", "011"));
        e.add(new Pair("01", "101"));
        e.add(new Pair("10", "001"));
        System.out.println("K5: "  + solve(e, 100));       
    }
}