package b_collections_framework.b_linked_list;

import java.util.LinkedList;

// Write a program to create a LinkedList of integers and add elements to it. Then, iterate through the LinkedList and print each element.
public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
