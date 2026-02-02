import java.util.Scanner;

@SuppressWarnings("resource")
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Bitte Anzahl der Elemente n eingeben: ");

    int dimensions = scanner.nextInt();

    int[] inputs = new int[dimensions];

    for (int i = 0; i < inputs.length; i++) {
        System.out.print("Bitte x_" + i + " eingeben: ");

        inputs[i] = scanner.nextInt();
    }

    int sum = 0;
    for (int i : inputs) {
        sum += Math.pow(i, 2);
    }

    double norm = Math.sqrt(sum);

    System.out.println("Der Betrag von x ist " + norm);
}