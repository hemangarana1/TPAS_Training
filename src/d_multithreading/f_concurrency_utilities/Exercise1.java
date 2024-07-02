package d_multithreading.f_concurrency_utilities;

// Write a program to demonstrate the use of Semaphore to control access to a shared resource.

import java.util.concurrent.Semaphore;

class SharedPrinter {
    private final Semaphore semaphore = new Semaphore(1);

    public void print(String document) {
        try {
            semaphore.acquire();
            System.out.println("Printing: " + document);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                printer.print(Thread.currentThread().getName() + " document " + i);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}
