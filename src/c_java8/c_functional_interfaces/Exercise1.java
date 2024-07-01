package c_java8.c_functional_interfaces;

// Write a custom functional interface and use it with lambda expressions.

@FunctionalInterface
interface StringOperation {
    String operate(String s);
}

public class Exercise1 {
    public static void main(String[] args) {
        StringOperation toUpperCase = (s) -> s.toUpperCase();
        System.out.println(toUpperCase.operate("hello"));
    }
}
