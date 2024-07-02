package d_multithreading.d_completable_future;

import java.util.concurrent.CompletableFuture;

// Write a program to create a CompletableFuture and supply a result using CompletableFuture.completedFuture().
public class Exercise1 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.completedFuture("Hello");
        future.thenAccept(System.out::println);
    }
}
