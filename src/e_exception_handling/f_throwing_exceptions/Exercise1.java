package e_exception_handling.f_throwing_exceptions;

// Write a method called validateEmail that accepts an email address as a parameter and throws an IllegalArgumentException if the email address is not valid (e.g., doesn't contain "@" symbol).
public class Exercise1 {
    public static void main(String[] args) {
        try {
            validateEmail("invalid-email");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        } else {
            System.out.println("Valid email address.");
        }
    }
}
