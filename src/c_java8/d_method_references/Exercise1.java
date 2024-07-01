package c_java8.d_method_references;

import java.util.Arrays;
import java.util.List;

// Write a program that demonstrates method references with a static method.
public class Exercise1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        list.forEach(System.out::println);
    }
}
