package com.mulrecursion;

public class MulRecursion {
    public static int mul(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + mul(a, b - 1);
        } else { // b < 0 (handle negatives)
            return -mul(a, -b);
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
        
    }
}