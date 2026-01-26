void main () {
    System.out.println("Zentimeter    | Größe");
    System.out.println("--------------+------");

    for (int i = 30; i < 50; i++) {
        double from = (i -1) / 1.5;
        double to = i / 1.5;

        System.out.printf("%4.2f - %4.2f | %2d \n", from, to, i);
    }
}