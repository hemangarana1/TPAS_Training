package b_collections_framework.d_hash_set;

import java.util.HashSet;

// Write a program to check if a specific element exists in a HashSet.
public class Exercise3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        if (set.contains("Banana")) {
            System.out.println("Banana is in the set.");
        } else {
            System.out.println("Banana is not in the set.");
        }
    }
}
