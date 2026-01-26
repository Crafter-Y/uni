import java.util.Scanner;

@SuppressWarnings("resource")
void main() {
    Scanner scanner = new Scanner(System.in);

    for(;;) {
        System.out.print("Welches Jahr soll auf Schaltjahr geprüft werden? ");
        String number = scanner.next();
        try {
            int intNum = Integer.parseInt(number);

            boolean div4 = intNum % 4 == 0;
            boolean div100 = intNum % 100 == 0;
            boolean div400 = intNum % 400 == 0;

            if ((div4 && !div100) || div400) {
                System.out.println(intNum + " ist ein Schaltjahr!");
            } else {
                System.out.println(intNum + " ist kein Schaltjahr!");
            }
        } catch (NumberFormatException ex) {
            System.err.println("Ungültige Jahreszahl!");
        }
    }
}