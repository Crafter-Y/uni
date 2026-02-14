public class Horner {
    private double[] polynomials;

    public Horner(double ...polynomials) {
        this.polynomials = polynomials;
    }

    public double getValue(double x) {
        if (polynomials.length == 0) return 0;

        double expr = polynomials[polynomials.length - 1];

        for (int i = polynomials.length - 2; i >= 0; i--) {
            expr = expr * x + polynomials[i];
        }

        return expr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = polynomials.length - 1; i >= 0; i--) {
            if (i == polynomials.length -1) {
                sb.append(String.format("%.1f*x^%d", polynomials[i], i));
            } else {
                sb.append(String.format(" %+.1f*x^%d", polynomials[i], i));
            }
        }

        return sb.toString();
    }


    public static void main() {
        System.out.println();

        Horner p = new Horner(1, -2, 3, 4.5, 8, -10, 3, 4, 2, -3, 0.5);        
        System.out.println("Polynomial f: " + p);
        System.out.println("f(1.5): " + p.getValue(1.5));
    }
}
