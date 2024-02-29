// import java.util.concurrent.locks.Lock;
// import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;

class Buffer {
    private int value;
    // private Lock lock;
    private Semaphore empty;

    public Buffer() {
        this.value = 0;
        // this.lock = new ReentrantLock();
        this.empty = new Semaphore(1);
    }

    public void put(int value) throws InterruptedException {
        this.empty.acquire();
        try {
            this.value = value;
        } finally {
            this.empty.release();
        }
    }

    public Integer get() throws InterruptedException {
        this.empty.acquire();
        try {
            return this.value;
        } finally {
            this.empty.release();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();

        Thread producerThread = new Thread(() -> {
            try {
                producerConsumer(buffer, 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                consumer(buffer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }

    private static void producerConsumer(Buffer buffer, int value) throws InterruptedException {
        if (value == 1) {
            buffer.put(value);
        } else {
            int num1 = 2, num2 = 3, num3 = 4; // Simulating generation of numbers
            buffer.put(value);
            buffer.put(num1);
            buffer.put(num2);
            buffer.put(num3);
        }
    }

    private static void consumer(Buffer buffer) throws InterruptedException {
        Integer value = buffer.get();
        while (value != 1) {
            System.out.println(value);
            value = buffer.get();
        }
    }
}
