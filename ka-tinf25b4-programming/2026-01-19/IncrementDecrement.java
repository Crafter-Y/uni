void main() {
    int i=0;
    int j=0;
    j = ++i; // j: 1, i: 1
    int k = j++ + ++i; // k: 3, j: 2, i: 2
    System.out.println("k: " + k); // 3
    System.out.println("*: " + j++ + ++i); // 23, j: 3, i: 3
    System.out.println(j++ + ++i); // 7, j: 4, i: 4
    int m = j++ * ++i; // m: 20, j: 5, i: 5
    System.out.println("m: " + m); // m: 20
    int n = --j * --i; // n: 16, j: 4, i: 4
    System.out.println("n: " + n); // 16
    System.out.println("i: " + i); // 4
    System.out.println("j: " + j); // 4
}