package b_collections_framework.b_linked_list;

import java.util.LinkedList;

// Write a program to find the middle element of a LinkedList.
public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int middleIndex = list.size() / 2;
        System.out.println("Middle element: " + list.get(middleIndex));
    }
}
