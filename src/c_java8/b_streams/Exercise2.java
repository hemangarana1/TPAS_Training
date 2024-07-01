package c_java8.b_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Write a program that uses Streams to map a list of integers to their squares.
public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> squaredList = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        squaredList.forEach(System.out::println);
    }
}
