package c_java8.d_method_references;

import java.util.Arrays;
import java.util.List;

// Write a program that demonstrates method references with an instance method of an object.
public class Exercise2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
//        list.forEach(new Exercise2()::print);
        list.forEach(item -> new Exercise2().print(item));

    }

    public void print(String item) {
        System.out.println(item);
    }
}
