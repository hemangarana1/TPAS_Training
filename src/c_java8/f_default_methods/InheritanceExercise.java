package c_java8.f_default_methods;

// Write a program that demonstrates the use of default methods in interfaces.
interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class InheritanceExercise implements MyInterface {
    public static void main(String[] args) {
        InheritanceExercise example = new InheritanceExercise();
        example.defaultMethod();
    }
}
