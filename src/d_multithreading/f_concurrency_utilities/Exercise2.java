package d_multithreading.f_concurrency_utilities;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// Write a program to demonstrate the use of CyclicBarrier to synchronize threads at a barrier point.
public class Exercise2 {
    public static void main(String[] args) {
        final int PARTIES = 3;
        CyclicBarrier barrier = new CyclicBarrier(PARTIES, () -> System.out.println("All parties are at the barrier."));

        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier.");
            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
        };

        for (int i = 0; i < PARTIES; i++) {
            new Thread(task).start();
        }
    }
}
