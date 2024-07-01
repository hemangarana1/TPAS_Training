package b_collections_framework.a_array_list;

import java.util.ArrayList;

// Write a program to create an ArrayList of Strings and add elements to it. Then, iterate through the ArrayList and print each element.
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
