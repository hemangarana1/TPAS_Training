package b_collections_framework.a_array_list;

import java.util.ArrayList;
import java.util.HashSet;

//Write a program to remove duplicates from an ArrayList of integers.
public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
