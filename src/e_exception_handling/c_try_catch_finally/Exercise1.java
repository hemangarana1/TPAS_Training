package e_exception_handling.c_try_catch_finally;

import java.util.ArrayList;
import java.util.Scanner;

// Write a program to read integers from the user until the user enters "done". Calculate the average of the entered numbers and handle any NumberFormatException that may occur.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;

        while (true) {
            System.out.print("Enter a number (or 'done' to finish): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = numbers.isEmpty() ? 0 : (double) sum / numbers.size();
        System.out.println("Average: " + average);
    }
}
