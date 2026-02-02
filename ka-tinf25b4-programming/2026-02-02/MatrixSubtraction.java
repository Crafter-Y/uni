import java.util.Random;
import java.util.Scanner;

void displayMat(String label, int[][] mat) {
    System.out.println(label + ":");
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            System.out.printf(" %3d", mat[i][j]);
        }
        System.out.println();
    }
}

@SuppressWarnings("resource")
void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Bitte Anzahl der Zeilen n eingeben: ");

    int rows = scanner.nextInt();

    System.out.print("Bitte Anzahl der Spalten m eingeben: ");

    int columns = scanner.nextInt();

    int[][] mat1 = new int[rows][columns];
    int[][] mat2 = new int[rows][columns];
    int[][] mat3 = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            mat1[i][j] = random.nextInt(100);
            mat2[i][j] = random.nextInt(100);

            mat3[i][j] = mat1[i][j] - mat2[i][j];
        }
    }

    displayMat("X", mat1);
    displayMat("Y", mat2);
    displayMat("X-Y", mat3);
}