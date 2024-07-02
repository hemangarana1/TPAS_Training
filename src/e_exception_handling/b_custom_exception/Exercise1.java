package e_exception_handling.b_custom_exception;

// Define a custom exception class called InvalidAgeException. Write a program that takes the age of a person as input and throws InvalidAgeException if the age is less than 0 or greater than 150.
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        int age = -5;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        } else {
            System.out.println("Age is valid.");
        }
    }
}
