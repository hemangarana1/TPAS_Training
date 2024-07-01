package b_collections_framework.d_hash_set;

import java.util.HashSet;

// Write a program to find the intersection of two HashSet objects.
public class Exercise2 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Date");

        set1.retainAll(set2);

        for (String item : set1) {
            System.out.println(item);
        }
    }
}
