# CSC372_M5CT_OP1_PRODUCT_RECURSION
 CSC372_M5CT_OP1_PRODUCT_RECURSION

### MulRecursion - Recursive Multiplication and Product Calculation

This Java program demonstrates the implementation of recursive functions for performing multiplication and calculating the product of an array of numbers. It includes robust error handling to gracefully address potential issues such as stack overflow and arithmetic exceptions.

**Key Features:**

* **`mul(a, b)`:** Recursively calculates the product of two integers `a` and `b`. Handles positive and negative numbers.
* **`productRecursion(numbers, index)`:**  Recursively calculates the product of an array of integers `numbers` starting from the given `index`.
* **`main(args)`:** Prompts the user to enter five numbers, stores them in an array, and calculates their product using recursion. It also includes error handling for invalid input and potential arithmetic overflows.

**How to Compile and Run:**

1. Make sure you have Java Development Kit (JDK) installed on your system.
2. Save the provided code as `MulRecursion.java`.
3. Open a terminal or command prompt and navigate to the directory where you saved the file.
4. Compile the code using the following command:
   ```bash
   javac MulRecursion.java
   ```
5. Run the compiled program:
   ```bash
   java MulRecursion
   ```
6. Follow the on-screen prompts to enter five numbers. The program will then display their product.

**Important Notes:**

* The program employs recursion, which can lead to stack overflow errors if the recursion depth is too high. It includes a check to gracefully handle such situations.
* It also handles potential arithmetic exceptions that might occur if the product of the numbers is too large to be represented as an integer.
* Input validation is implemented to ensure that the user enters valid integer values.

**Example Usage:**

```
Enter five numbers:
2
3
-4
5
1
These are your five numbers:
2 3 -4 5 1 
The product of the five numbers is: -120
```

**Disclaimer:**

* While the program includes error handling, it is always a good practice to use recursion judiciously, especially when dealing with large input values, to avoid potential performance issues or stack overflow errors.
* Consider alternative iterative approaches for scenarios where recursion might not be the most efficient solution.
