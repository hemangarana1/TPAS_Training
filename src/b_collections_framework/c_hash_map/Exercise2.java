package b_collections_framework.c_hash_map;

import java.util.Map;
import java.util.HashMap;

// Write a program to remove an entry from a HashMap given the key.
public class Exercise2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        map.remove("Bob");

        map.forEach((name, age) -> System.out.println(name + ": " + age));
    }
}
