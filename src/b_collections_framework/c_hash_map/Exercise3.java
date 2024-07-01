package b_collections_framework.c_hash_map;

import java.util.HashMap;

//Write a program to check if a specific key exists in a HashMap.
public class Exercise3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        } else {
            System.out.println("Bob is not in the map.");
        }
    }
}
