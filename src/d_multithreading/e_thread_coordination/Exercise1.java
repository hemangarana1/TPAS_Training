package d_multithreading.e_thread_coordination;

// Write a program to demonstrate thread coordination using wait() and notify().
class SharedResource {
    private int value;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.value = value;
        available = true;
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false;
        notify();
        return value;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource.produce(i);
                System.out.println("Produced: " + i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                int value = resource.consume();
                System.out.println("Consumed: " + value);
            }
        });

        producer.start();
        consumer.start();
    }
}
