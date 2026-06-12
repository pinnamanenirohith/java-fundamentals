/**
 * BitwiseOperators.java
   * Topic: Operators
      *
      * Description:
 * Demonstrates Bitwise Operators in Java.
      * Bitwise operators work at the binary (bit) level.
      *
      * Bitwise Operators:
    *   &    Bitwise AND     (1 if both bits are 1)
 *   |    Bitwise OR      (1 if at least one bit is 1)
      *   ^    Bitwise XOR     (1 if bits are different)
      *   ~    Bitwise NOT     (flips all bits)
      *   <<   Left shift      (multiply by 2)
      *   >>   Right shift     (divide by 2)
      *   >>>  Unsigned right shift
      *
      * Example:
 *   a = 5  = 0101 in binary
      *   b = 3  = 0011 in binary
      *
      *   a & b  = 0001 = 1
      *   a | b  = 0111 = 7
      *   a ^ b  = 0110 = 6
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class BitwiseOperators {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("          Bitwise Operators Demo            ");
              System.out.println("============================================");

          int a = 5;   // binary: 0101
          int b = 3;   // binary: 0011

          System.out.println("  a = " + a + "  (binary: " + Integer.toBinaryString(a) + ")");
              System.out.println("  b = " + b + "  (binary: " + Integer.toBinaryString(b) + ")");

          // Bitwise AND
          System.out.println("\n--- Bitwise AND (&) ---");
              System.out.println("  Rule: 1 only if BOTH bits are 1");
              System.out.println("  a & b = " + (a & b) + "  (binary: " + Integer.toBinaryString(a & b) + ")");

          // Bitwise OR
          System.out.println("\n--- Bitwise OR (|) ---");
              System.out.println("  Rule: 1 if at LEAST ONE bit is 1");
              System.out.println("  a | b = " + (a | b) + "  (binary: " + Integer.toBinaryString(a | b) + ")");

          // Bitwise XOR
          System.out.println("\n--- Bitwise XOR (^) ---");
              System.out.println("  Rule: 1 if bits are DIFFERENT");
              System.out.println("  a ^ b = " + (a ^ b) + "  (binary: " + Integer.toBinaryString(a ^ b) + ")");

          // Bitwise NOT (complement)
          System.out.println("\n--- Bitwise NOT (~) ---");
              System.out.println("  Rule: flips all bits (~n = -(n+1))");
              System.out.println("  ~a    = " + (~a));
              System.out.println("  ~b    = " + (~b));

          // Left Shift
          System.out.println("\n--- Left Shift (<<) ---");
              System.out.println("  Rule: multiply by 2 for each shift");
              System.out.println("  a << 1 = " + (a << 1) + "  (5 * 2 = 10)");
              System.out.println("  a << 2 = " + (a << 2) + "  (5 * 4 = 20)");

          // Right Shift
          System.out.println("\n--- Right Shift (>>) ---");
              System.out.println("  Rule: divide by 2 for each shift");
              int c = 20;
              System.out.println("  c = " + c);
              System.out.println("  c >> 1 = " + (c >> 1) + "  (20 / 2 = 10)");
              System.out.println("  c >> 2 = " + (c >> 2) + "  (20 / 4 = 5)");

          System.out.println("============================================");
    }
}
