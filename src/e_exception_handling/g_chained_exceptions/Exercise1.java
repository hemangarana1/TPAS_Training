package e_exception_handling.g_chained_exceptions;

import java.util.Scanner;

// Write a program that reads an integer from the user and attempts to convert it to a String. Handle NumberFormatException and throw a custom exception ConversionException with the original exception as the cause.
class ConversionException extends Exception {
    public ConversionException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();

        try {
            int number = convertToInt(input);
            System.out.println("Converted number: " + number);
        } catch (ConversionException e) {
            System.out.println(e.getMessage());
            e.getCause().printStackTrace();
        }
    }

    public static int convertToInt(String input) throws ConversionException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new ConversionException("Failed to convert input to integer", e);
        }
    }
}
