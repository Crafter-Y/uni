import java.util.Scanner;

@SuppressWarnings("resource")
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Bitte Anzahl der Elemente n eingeben: ");

    int dimensions = scanner.nextInt();

    int[] inputs = new int[dimensions];

    for (int i = 0; i < inputs.length; i++) {
        System.out.print("Bitte Zahl " + i + " eingeben: ");

        inputs[i] = scanner.nextInt();
    }

    for (int i = 0; i < dimensions - 1; i++) {
        for (int j = 0; j < dimensions - i - 1; j++) {
            if (inputs[j] > inputs[j + 1]) {
                int tmp = inputs[j];
                inputs[j] = inputs[j + 1];
                inputs[j+1] = tmp;
            }
        }
    }

    System.out.print("Sortiert:");
    for (int i : inputs) {
        System.out.print(" " + i);
    }
    System.out.println();
}