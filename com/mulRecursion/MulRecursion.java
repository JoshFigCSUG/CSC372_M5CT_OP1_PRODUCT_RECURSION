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
    public static void main(String[] args) {
        
    }
}