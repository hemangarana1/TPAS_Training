package b_collections_framework.a_array_list;

import java.util.ArrayList;
import java.util.Collections;

// Write a program to sort an ArrayList of Strings alphabetically.
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        Collections.sort(list);

        for (String item : list) {
            System.out.println(item);
        }
    }
}
