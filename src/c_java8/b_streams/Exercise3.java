package c_java8.b_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Write a program that uses Streams to find the maximum element in a list of integers.
public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println(max.get());
        }

    }
}
