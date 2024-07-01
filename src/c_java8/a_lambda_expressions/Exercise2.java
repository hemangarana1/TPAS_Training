package c_java8.a_lambda_expressions;

import java.util.Comparator;

// Rewrite a traditional anonymous inner class with a lambda expression.
public class Exercise2 {
    public static void main(String[] args) {
        Comparator<String> comparator = (a, b) -> a.compareTo(b);

        System.out.println(comparator.compare("Apple", "Banana"));
    }
}
