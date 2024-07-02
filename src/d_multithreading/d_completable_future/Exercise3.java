package d_multithreading.d_completable_future;

import java.util.concurrent.CompletableFuture;

// Write a program to combine two CompletableFutures and perform some action when both are complete using thenCombine().
public class Exercise3 {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

        future1.thenCombine(future2, (s1, s2) -> s1 + " " + s2)
                .thenAccept(System.out::println);
    }
}
