package c_java8.e_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Write a program that uses Optional to retrieve a value from a map and handle the absence of that key gracefully.
public class Exercise2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);

        Optional<Integer> age = Optional.ofNullable(map.get("Charlie"));
        System.out.println(age.orElse(0));
    }
}
