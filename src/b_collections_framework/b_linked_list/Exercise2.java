package b_collections_framework.b_linked_list;

import java.util.Collections;
import java.util.LinkedList;

// Write a program to reverse a LinkedList.
public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.reverse(list);

        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
