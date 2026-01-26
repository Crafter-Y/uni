import java.util.Scanner;

@SuppressWarnings("resource")
void main () {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Wie ist dein Name? ");
    String name = scanner.next();

    while (true) {
        int number = (int) Math.ceil(Math.random() * 100);

        int numTry = 1;
        while (true) {
            System.out.print(name + ", rate eine Zahl [1-100]: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                System.out.printf("Versuch %d: %d ist korrekt.\n", numTry, guess);
                break;
            } else if (guess > number) {
                System.out.printf("Versuch %d: %d ist zu hoch.\n", numTry, guess);
            } else {
                System.out.printf("Versuch %d: %d ist zu niedrig.\n", numTry, guess);
            }

            numTry++;
        }

        System.out.println("Was möchtest Du tun?");
        System.out.println("0 - Das Spiel beenden");
        System.out.print("1 - Das Spiel fortsetzen ");

        int next = scanner.nextInt();
        if (next == 0) break;
    }
}