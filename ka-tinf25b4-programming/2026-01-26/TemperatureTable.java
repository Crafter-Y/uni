import java.util.Locale;

void main() {
    System.out.println("Fahreheit | Celsius");
    System.out.println("----------+--------");

    for (int i = 0; i <= 300; i+=20) {
        double celsius = (5 / 9d) * ( i - 32);
        System.out.printf(Locale.ENGLISH, "%3d       | %5.1f\n", i, celsius);
    }
}