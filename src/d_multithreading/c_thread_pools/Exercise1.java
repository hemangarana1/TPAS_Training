package d_multithreading.c_thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Write a program to create a fixed-size thread pool using Executors.newFixedThreadPool() and submit tasks to it.
public class Exercise1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is running");
            });
        }

        executor.shutdown();
    }
}

