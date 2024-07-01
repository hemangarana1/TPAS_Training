package c_java8.a_lambda_expressions;

// Write a program that uses lambda expressions to implement a simple interface (e.g., Runnable, Comparator).
public class Exercise1 {
    interface Greeting {
        void sayHello(String name);
    }

    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name);
        greeting.sayHello("Alice");
    }

}
