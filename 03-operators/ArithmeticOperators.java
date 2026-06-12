/**
 * ArithmeticOperators.java
   * Topic: Operators
      *
      * Description:
 * Demonstrates all Arithmetic Operators in Java.
      *
      * Arithmetic Operators:
      *   +   Addition
      *   -   Subtraction
      *   *   Multiplication
      *   /   Division
      *   %   Modulus (remainder)
      *   ++  Increment
      *   --  Decrement
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class ArithmeticOperators {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("       Arithmetic Operators Demo            ");
              System.out.println("============================================");

          int a = 20;
              int b = 6;

          System.out.println("  a = " + a + ",  b = " + b);
              System.out.println();

          // Addition
          System.out.println("  a + b  = " + (a + b));   // 26

          // Subtraction
          System.out.println("  a - b  = " + (a - b));   // 14

          // Multiplication
          System.out.println("  a * b  = " + (a * b));   // 120

          // Division (integer division - no decimal)
          System.out.println("  a / b  = " + (a / b));   // 3 (not 3.33)

          // Modulus (remainder after division)
          System.out.println("  a % b  = " + (a % b));   // 2

          // Division with double (for decimal result)
          System.out.println("  a / (double)b = " + (a / (double) b));  // 3.33

          // ---  Increment & Decrement ---
          System.out.println("\n--- Increment & Decrement ---");

          int x = 10;
              System.out.println("  x = " + x);

          // Pre-increment: increment first, then use the value
          System.out.println("  ++x = " + (++x));   // x becomes 11, prints 11

          // Post-increment: use the value first, then increment
          System.out.println("  x++ = " + (x++));   // prints 11, then x becomes 12
          System.out.println("  x   = " + x);        // x is now 12

          // Pre-decrement
          System.out.println("  --x = " + (--x));   // x becomes 11, prints 11

          // Post-decrement
          System.out.println("  x-- = " + (x--));   // prints 11, then x becomes 10
          System.out.println("  x   = " + x);        // x is now 10

          // --- Practical Example ---
          System.out.println("\n--- Practical Example: Simple Calculator ---");
              double num1 = 15.5;
              double num2 = 4.2;
              System.out.printf("  num1 = %.1f,  num2 = %.1f%n", num1, num2);
              System.out.printf("  Sum        = %.2f%n", num1 + num2);
              System.out.printf("  Difference = %.2f%n", num1 - num2);
              System.out.printf("  Product    = %.2f%n", num1 * num2);
              System.out.printf("  Quotient   = %.2f%n", num1 / num2);
              System.out.printf("  Remainder  = %.2f%n", num1 % num2);

          System.out.println("============================================");
    }
}
