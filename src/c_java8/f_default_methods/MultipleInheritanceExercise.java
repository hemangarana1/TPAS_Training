package c_java8.f_default_methods;

// Write a program that demonstrates multiple inheritance of default methods from interfaces.
interface InterfaceA {
    default void defaultMethod() {
        System.out.println("InterfaceA default method");
    }
}

interface InterfaceB {
    default void defaultMethod() {
        System.out.println("InterfaceB default method");
    }
}

public class MultipleInheritanceExercise implements InterfaceA, InterfaceB {
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
        InterfaceB.super.defaultMethod();
    }

    public static void main(String[] args) {
        MultipleInheritanceExercise example = new MultipleInheritanceExercise();
        example.defaultMethod();
    }
}
