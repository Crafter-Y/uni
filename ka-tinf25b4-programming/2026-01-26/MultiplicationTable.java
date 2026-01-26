void main() {
    for (int i = 0; i < 100; i+=10) {
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%4d", i + j);
        }
        System.out.print("\n");
    }
}