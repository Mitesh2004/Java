class SharedBuffer {
    private int value;
    private boolean available = false;  // Flag to check if the value is available for consumption

    // Method for producer to produce a value
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();  // Wait if the value is already available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.value = value;
        System.out.println("Produced: " + value);
        available = true;  // Mark value as available for consumption
        notify();  // Notify the consumer to consume the value
    }

    // Method for consumer to consume a value
    public synchronized int consume() {
        while (!available) {
            try {
                wait();  // Wait if no value is available to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + value);
        available = false;  // Mark value as consumed
        notify();  // Notify the producer to produce the next value
        return value;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;
    private int limit;

    public Producer(SharedBuffer buffer, int limit) {
        this.buffer = buffer;
        this.limit = limit;
    }

    @Override
    public void run() {
        int value = 1;
        int producedCount = 0;
        while (producedCount < limit) {
            buffer.produce(value);  // Produce a value
            value++;
            producedCount++;
            try {
                Thread.sleep(1000);  // Sleep for 1 second before producing the next value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;
    private int limit;

    public Consumer(SharedBuffer buffer, int limit) {
        this.buffer = buffer;
        this.limit = limit;
    }

    @Override
    public void run() {
        int consumedCount = 0;
        while (consumedCount < limit) {
            buffer.consume();  // Consume a value
            consumedCount++;
            try {
                Thread.sleep(1500);  // Sleep for 1.5 seconds before consuming the next value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class a3 {
    public static void main(String[] args) {
        int limit = 10;  // Set the limit for how many values to produce and consume

        SharedBuffer buffer = new SharedBuffer();  // Shared buffer between producer and consumer

        // Create producer and consumer threads with the same limit
        Producer producer = new Producer(buffer, limit);
        Consumer consumer = new Consumer(buffer, limit);

        // Start the threads
        producer.start();
        consumer.start();
    }
}