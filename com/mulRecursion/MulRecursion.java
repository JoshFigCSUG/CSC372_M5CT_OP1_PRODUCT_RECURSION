package com.mulrecursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulRecursion {

    private static boolean stackOverflowOccured = false;

    public static int mul(int a, int b) {
        if (stackOverflowOccured) {
            // Terminate the program if a StackOverflowError has already occurred
            System.exit(1); // Exit with a non-zero status to indicate an error
        }
        try {
            if (b == 0) {
                return 0; // Base case: anything multiplied by 0 is 0
            } else if (b > 0) {
                return a + mul(a, b - 1); // Recursively add 'a' to itself 'b' times
            } else { // b < 0
                // Handle negative 'b' by negating the result of multiplying 'a' with the absolute value of 'b'
                return -mul(a, -b);
            }
        } catch (StackOverflowError e) {
            // Handle the StackOverflowError gracefully
            stackOverflowOccured = true;
            System.err.println("""
                               Stack Overflow occurred during multiplication. The recursion depth might be too high.
                               \tPlease try with smaller numbers.""");
            return -1; // Example: Return -1 to indicate an error
        }
    }

    public static int productRecursion(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index]; // Base case: return last element
        } else {
            // Cycle through list of numbers
            return mul(numbers[index], productRecursion(numbers, index + 1));
        }
     }

     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];
            
            System.out.println("Enter five numbers:");
            for (int i = 0; i < 5; i++) {
                try {
                    numbers[i] = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Consume the invalid input
                    i--; // Decrement 'i' to retry the same input
                }
            }
            
            // loop to print the user's five numbers.
            System.out.println("These are your five numbers:");
            for (int i = 0; i < 5; i++) {
                System.out.print(numbers[i]+" ");
            }
            
            try {
                int product = productRecursion(numbers, 0);
                System.out.println("\nThe product of the five numbers is: " + product);
            } catch (ArithmeticException e) {
                System.out.println("\nError: The product is too large to be represented as an integer.");
            }
        }
    }
}