package d_multithreading.d_completable_future;

import java.util.concurrent.CompletableFuture;

// Write a program to create a CompletableFuture and supply a result asynchronously using CompletableFuture.supplyAsync().
public class Exercise2 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
        future.thenAccept(System.out::println);
    }
}
