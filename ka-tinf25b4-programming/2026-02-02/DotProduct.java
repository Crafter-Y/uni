import java.util.Scanner;

@SuppressWarnings("resource")
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Bitte Anzahl der Elemente n eingeben: ");

    int dimensions = scanner.nextInt();

    int[] inputs1 = new int[dimensions];

    for (int i = 0; i < inputs1.length; i++) {
        System.out.print("Bitte x_" + i + " eingeben: ");

        inputs1[i] = scanner.nextInt();
    }

    int[] inputs2 = new int[dimensions];

    for (int i = 0; i < inputs2.length; i++) {
        System.out.print("Bitte y_" + i + " eingeben: ");

        inputs2[i] = scanner.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < inputs1.length; i++) {
        sum += inputs1[i] * inputs2[i];
    }

    System.out.println("Das Skalarprodukt von x und y ist " + sum);
}