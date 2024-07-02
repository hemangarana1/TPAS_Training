package e_exception_handling.e_nested_try_catch_blocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// Write a program that reads a file path from the user and attempts to open the file. Handle both FileNotFoundException and IOException.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);

            try {
                int content;
                while ((content = fis.read()) != -1) {
                    System.out.print((char) content);
                }
            } catch (IOException e) {
                System.out.println("Error reading the file.");
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
