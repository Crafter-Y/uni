package buffer;

import java.util.LinkedList;

public class MyBuffer {
    public static final int MAXSIZE = 3;

    private final LinkedList<Integer> values = new LinkedList<>();

    public synchronized void put(int v) {
        while (this.values.size() == MAXSIZE) {
            System.out.println("Puffer voll - warten!");
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.values.addLast(v);
        this.notifyAll();
        System.out.println("Put: " + v);
        System.out.println("Fill level after put: " + this.values.size());
    }

    public synchronized int get() {
        while (this.values.isEmpty()) {
            System.out.println("Puffer leer - warten!");
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        int v = this.values.removeFirst();
        this.notifyAll();
        System.out.println("Get: " + v);
        System.out.println("Fill level after get: " + this.values.size());
        return v;
    }

    public static void main() {
        MyBuffer buffer = new MyBuffer();
        new ProducerThread(buffer, 10).start();
        new ConsumerThread(buffer, 10).start();
    }
}
