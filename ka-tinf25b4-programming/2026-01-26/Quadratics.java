void quadratic(int a, int b, int c) {
    if (a == 0) {
        if (b == 0) {
            System.err.println("The Equation is degenerated");
            return;
        }
        double solution = -c / b;
        System.out.println("Solution: x=" + solution);
        return;
    }

    int squareTerm = b*b - 4*a*c;

    if (squareTerm < 0) {
        System.err.println("Complex solution");
    } else if (squareTerm == 0) {
        double solution = -b / 2*a;
        System.out.println("Solution: x1=" + solution + ", x2=" + solution);
    } else {
        double solution1 = (-b + Math.sqrt(squareTerm)) / (2*a);
        double solution2 = (-b - Math.sqrt(squareTerm)) / (2*a);

        System.out.println("Solution: x1=" + solution1 + ", x2=" + solution2);
    }
}

void main() {
    quadratic(-2, 0, 2);
    quadratic(1, 2, 1);
    quadratic(0, 1, 1);
    quadratic(1, 0, 1);
    quadratic(0, 0, 1);
}