package c_java8.c_functional_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Write a program that takes a list of strings and sorts them based on their length using a Comparator composed with lambda expressions.
public class Exercise2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Oranges");
        list.add("Banana");
        list.add("Cherry");

        Collections.sort(list, Comparator.comparingInt(String::length));

        list.forEach(System.out::println);
    }
}
