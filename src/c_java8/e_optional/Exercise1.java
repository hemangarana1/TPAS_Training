package c_java8.e_optional;

import java.util.Optional;

// Write a program that uses Optional to handle a potentially null value.
public class Exercise1 {
    public static void main(String[] args) {
        String str = null;
//        String str = "John";
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.orElse("Default Value"));
    }
}
