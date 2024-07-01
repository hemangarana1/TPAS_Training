package b_collections_framework.c_hash_map;

import java.util.HashMap;
import java.util.Map;

// Write a program to create a HashMap where the keys are Strings (representing names) and the values are Integers (representing ages). Add some entries and then iterate through the HashMap, printing each key-value pair.
public class Exercise1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        map.forEach((name, age) -> System.out.println(name + ": " + age));
    }
}
