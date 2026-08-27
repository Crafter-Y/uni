package buffer;

import java.util.Random;

public class ProducerThread extends Thread {
    private final MyBuffer buffer;
    private final int count;
    private final Random random = new Random();

    public ProducerThread(MyBuffer buffer, int count) {
        this.buffer = buffer;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            this.buffer.put(i);
            try {
                Thread.sleep(this.random.nextInt(1000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
