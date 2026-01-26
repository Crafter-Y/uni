void main() {
    int deers = 205;
    int i = 1;
    for (; deers <= 300; i++) {
        System.out.println(i + ": " + deers + " Hirsche");

        deers = (int) (deers * 1.1) - 15;
    }
    System.out.println(i + ": " + deers + " Hirsche");
}