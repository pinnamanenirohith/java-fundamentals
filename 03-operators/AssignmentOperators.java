/**
 * AssignmentOperators.java
   * Topic: Operators
      *
      * Description:
 * Demonstrates Assignment Operators in Java.
      *
      * Assignment Operators:
    *   =    Simple assignment
       *   +=   Add and assign      (a += b  is same as  a = a + b)
 *   -=   Subtract and assign (a -= b  is same as  a = a - b)
 *   *=   Multiply and assign (a *= b  is same as  a = a * b)
 *   /=   Divide and assign   (a /= b  is same as  a = a / b)
 *   %=   Modulus and assign  (a %= b  is same as  a = a % b)
 *
 * These are shorthand operators that make code cleaner and concise.
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class AssignmentOperators {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("       Assignment Operators Demo            ");
              System.out.println("============================================");

          int a = 20;
              System.out.println("  Initial value: a = " + a);

          // Simple assignment
          System.out.println("\n--- Simple Assignment (=) ---");
              a = 50;
              System.out.println("  a = 50;     a = " + a);

          // Add and assign
          System.out.println("\n--- Compound Assignment Operators ---");
              a = 20;  // reset
          System.out.println("  Reset: a = 20");

          a += 5;  // same as: a = a + 5
          System.out.println("  a += 5;  -->  a = " + a + "  (was 20)");

          a -= 3;  // same as: a = a - 3
          System.out.println("  a -= 3;  -->  a = " + a + "  (was 25)");

          a *= 2;  // same as: a = a * 2
          System.out.println("  a *= 2;  -->  a = " + a + "  (was 22)");

          a /= 4;  // same as: a = a / 4
          System.out.println("  a /= 4;  -->  a = " + a + "  (was 44)");

          a %= 3;  // same as: a = a % 3
          System.out.println("  a %= 3;  -->  a = " + a + "  (was 11)");

          // --- Practical: Accumulator pattern ---
          System.out.println("\n--- Practical: Sum Accumulator ---");
              int total = 0;
              System.out.println("  Start: total = 0");
              total += 100;
              System.out.println("  After += 100 : total = " + total);
              total += 250;
              System.out.println("  After += 250 : total = " + total);
              total += 75;
              System.out.println("  After += 75  : total = " + total);

          // --- Chained assignment ---
          System.out.println("\n--- Chained Assignment ---");
              int x, y, z;
              x = y = z = 10;  // all assigned the same value
          System.out.println("  x = y = z = 10");
              System.out.println("  x = " + x + ", y = " + y + ", z = " + z);

          System.out.println("============================================");
    }
}
