package c_java8.b_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Write a program that uses Streams to filter a list of strings based on a condition.
public class Exercise1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        List<String> filteredList = list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        for (String item : filteredList) {
            System.out.println(item);
        }
    }
}
