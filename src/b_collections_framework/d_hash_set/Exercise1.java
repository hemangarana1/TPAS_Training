package b_collections_framework.d_hash_set;

import java.util.HashSet;

// Write a program to create a HashSet of strings and add elements to it. Then, iterate through the HashSet and print each element.
public class Exercise1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        for (String item : set) {
            System.out.println(item);
        }
    }
}
