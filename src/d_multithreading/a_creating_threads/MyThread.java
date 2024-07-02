package d_multithreading.a_creating_threads;

// Write a program to create a simple thread by extending the Thread class and overriding its run() method.

public class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}