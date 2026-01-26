int round(double num) {
    return (num >= 0) ?
            num % 1f >= 0.5 ? ((int) num + 1) : (int) num
            : -num % 1f >= 0.5 ? ((int) num - 1) : (int) num;
}

int roundOther(double num) {
    num += num >= 0 ? 0.5 : -0.5;
    return (int) num;
}

void main() {
    double pi = 3.1415926; // Naeherung der Kreiszahl Pi
    double e = 2.7182818; // Naeherung der Eulerschen Zahl e

    // vorher
    int piInt = (int) pi;
    int eInt = (int) e;
    System.out.println("Pi ganzzahlig: " + piInt); // Ausgabe: 3
    System.out.println("e ganzzahlig: " + eInt); // Ausgabe: 2

    // mit kaufmännischem Runden

    int piInt2 = round(pi);
    int eInt2 = round(e);

    System.out.println("Pi gerundet: " + piInt2); // Ausgabe: 3
    System.out.println("e gerundet: " + eInt2); // Ausgabe: 3

    // mit minus zahlen

    int piMinus = round(-pi);
    int eMinus = round(-e);

    System.out.println("-Pi gerundet: " + piMinus); // Ausgabe: -3
    System.out.println("-e gerundet: " + eMinus); // Ausgabe: -3
}