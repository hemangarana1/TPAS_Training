package d_multithreading.a_creating_threads;

// Write a program to create a thread by implementing the Runnable interface and passing it to a Thread object.

public class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Runnable is running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
