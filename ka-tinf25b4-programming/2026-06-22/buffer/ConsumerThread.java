package buffer;

import java.util.Random;

public class ConsumerThread extends Thread {
    private final MyBuffer buffer;
    private final int count;
    private final Random random = new Random();

    public ConsumerThread(MyBuffer buffer, int count) {
        this.buffer = buffer;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.count; i++) {
            this.buffer.get();
            try {
                Thread.sleep(this.random.nextInt(1000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
