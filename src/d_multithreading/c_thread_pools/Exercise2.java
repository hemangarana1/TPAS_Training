package d_multithreading.c_thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Write a program to create a cached thread pool using Executors.newCachedThreadPool() and submit tasks to it.
public class Exercise2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is running");
            });
        }

        executor.shutdown();
    }
}
