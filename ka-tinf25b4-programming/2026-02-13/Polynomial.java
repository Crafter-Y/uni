public class Polynomial {
    protected double a;
    protected double b;
    protected double c;

    public Polynomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Polynomial(double b, double c) {
        this(1, b, c);
    }

    public String toString() {
        return String.format("%.1fx^2 %+.1fx %+.1f", a,b,c);
    }

    public double calculate(double x) {
        return a * x * x + b * x + c;
    }

    public Polynomial add(Polynomial other) {
        return new Polynomial(this.a + other.a, this.b + other.b, this.c + other.c);
    }

    public Polynomial subtract(Polynomial other) {
        return new Polynomial(this.a - other.a, this.b - other.b, this.c - other.c);
    }

    public Polynomial scale(double factor) {
        return new Polynomial(this.a * factor, this.b * factor, this.c * factor);
    }

    public double[] solve() {
        if (a == 0) return b == 0 ? new double[0] : new double[] {-c / b};

        double squareTerm = b*b - 4*a*c;

        if (squareTerm < 0) {
            return new double[0];
        } else if (squareTerm == 0) {
            // returned as just one alltough it is a double solution
            return new double[] {-b / 2*a};
        } else {
            double solution1 = (-b + Math.sqrt(squareTerm)) / (2*a);
            double solution2 = (-b - Math.sqrt(squareTerm)) / (2*a);

            return new double[] {solution1, solution2};
        }
    }

    public static void main() {
        System.out.println();
        Polynomial p1 = new Polynomial(2, 0, 0);
        System.out.println("P1: " + p1);
        Polynomial p2 = new Polynomial(0, -4, 1);
        System.out.println("P2: " + p2);
        Polynomial p3 = p1.add(p2);
        System.out.println("P3 = P1 + P2: " + p3);
        p3 = p3.scale(2);
        System.out.println("P3 = 2.0 * P3: " + p3);
        System.out.print("Nullstellen von P3 (" + p3 + "): ");
        for(double i : p3.solve()) {
            System.out.printf("%f ", i);
        }
        System.out.println();
    }
}
