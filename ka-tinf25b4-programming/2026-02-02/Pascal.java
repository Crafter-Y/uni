final int DEPTH = 9;

void main() {
    int[][] tree = new int[DEPTH][];

    for (int i = 0; i < tree.length; i++) {
        tree[i] = new int[i + 1];
    }

    tree[0][0] = 1;

    for (int i = 1; i < tree.length; i++) {
        for (int j = 0; j < tree[i].length; j++) {
            if (j == 0 || j == tree[i].length - 1) {
                tree[i][j] = 1;
            } else {
                tree[i][j] = tree[i-1][j - 1] + tree[i-1][j];
            }
        }
    }

    for (int i = 0; i < tree.length; i++) {
        for (int j = 0; j < DEPTH - i; j++) {
            System.out.print("  ");
        }
        for (int j = 0; j < tree[i].length; j++) {
            System.out.printf(" %2d ", tree[i][j]);
        }
        System.out.println();
    }
}