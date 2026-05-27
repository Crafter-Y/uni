package collections;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
    private T value;
    private BinaryTree<T> right;
    private BinaryTree<T> left;

    public void add(T node) {
        if (this.value == null) {
            this.value = node;
        } else if (this.value.compareTo(node) > 0) {
            if (this.right == null) this.right = new BinaryTree<>();
            this.right.add(node);
        } else if (this.value.compareTo(node) < 0) {
            if (this.left == null) this.left = new BinaryTree<>();
            this.left.add(node);
        }
    }

    public T getValue() {
        return this.value;
    }

    public List<T> traverse() {
        List<T> returner = new ArrayList<>();
        if (this.right != null) returner.addAll(this.right.traverse());
        returner.add(this.value);
        if (this.left != null) returner.addAll(this.left.traverse());

        return returner;
    }

    public static void main() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(2);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(69);
        tree.add(420);
        tree.add(10);
        tree.add(42);

        for (Integer i : tree.traverse()) {
            System.out.println(i);
        }
    }
}
