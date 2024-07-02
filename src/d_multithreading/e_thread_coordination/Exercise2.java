package d_multithreading.e_thread_coordination;

import java.util.concurrent.CountDownLatch;

// Write a program to demonstrate thread coordination using CountDownLatch.
public class Exercise2 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            latch.countDown();
        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }

        try {
            latch.await();
            System.out.println("All threads have finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
