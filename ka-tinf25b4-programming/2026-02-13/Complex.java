import java.util.ArrayList;
import java.util.List;

public class Complex {
    protected double r;
    protected double i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getReal() {
        return this.r;
    }

    public double getImag() {
        return this.i;
    }

    public Complex add(Complex other) {
        return new Complex(this.r + other.r, this.i + other.i);
    }

    public Complex sub(Complex other) {
        return new Complex(this.r - other.r, this.i - other.i);
    }

     public Complex mult(Complex other) {
        return new Complex(
            this.r * other.r - this.i * other.i, 
            this.r * other.i + this.i * other.r
        );
    }

    public Complex div(Complex other) {
        return new Complex(
            (this.r * other.r + this.i * other.i)/(other.r * other.r + other.i * other.i), 
            (this.i * other.r - this.r * other.i)/(other.r * other.r + other.i * other.i)
        );
    }

    public String toString() {
        return String.format("%.3f + %.3fi", this.r, this.i);
    }

    public String print1() {
        return String.format("Complex %.1f, %.1fi", this.r, this.i);
    }

    public double getMagnitude() {
        return Math.sqrt(this.r * this.r + this.i * this.i);
    }

    public boolean isLess(Complex comp) {
        return this.getMagnitude() < comp.getMagnitude();
    }

    public static void main() {
        System.out.println();
        Complex c1 = new Complex(1,2);
        System.out.println("C1:     " + c1.print1());
        Complex c2 = new Complex(2,1);
        System.out.println("C2:     " + c2.print1());
        System.out.println("C1+C2:  " + c1.add(c2).print1());
        System.out.println("C1-C2:  " + c1.sub(c2).print1());
        System.out.println("C1*C2:  " + c1.mult(c2).print1());
        System.out.println("C1/C2:  " + c1.div(c2).print1());
        System.out.println("C1<C2?: " + c1.isLess(c2));

        List<Complex> list = new ArrayList<>();
        System.out.println("Unsoriert:");

        for (int i = 0; i < 10; i++) {
            double real = Math.random()*10;
            double complex = Math.random()*10;

            Complex comp = new Complex(real, complex);
            list.add(comp);

            System.out.printf("%s  Betrag: %.3f\n", comp, comp.getMagnitude());
        }

        list.sort((a,b) -> a.isLess(b) ? -1 : 1);

        System.out.println("Sortiert:");
        for (Complex comp : list) {
            System.out.printf("%s  Betrag: %.3f\n", comp, comp.getMagnitude());
        }
    }
}
