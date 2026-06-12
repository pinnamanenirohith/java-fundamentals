/**
 * UnaryOperators.java
   * Topic: Operators
      *
      * Description:
 * Demonstrates Unary Operators in Java.
      * Unary operators work on a SINGLE operand.
      *
      * Unary Operators:
      *   +    Unary plus  (positive value)
      *   -    Unary minus (negates the value)
      *   ++   Increment (pre and post)
      *   --   Decrement (pre and post)
      *   !    Logical NOT (for boolean)
      *   ~    Bitwise complement
      *
      * Key Difference: Pre vs Post Increment/Decrement
      *   Pre  (++x): Increment first, THEN use the value.
      *   Post (x++): Use the value first, THEN increment.
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class UnaryOperators {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("         Unary Operators Demo               ");
              System.out.println("============================================");

          // Unary plus and minus
          System.out.println("\n--- Unary Plus and Minus ---");
              int a = 10;
              System.out.println("  a  = " + a);
              System.out.println("  +a = " + (+a));   // positive (no change)
          System.out.println("  -a = " + (-a));   // negated

          // Pre-increment
          System.out.println("\n--- Pre-Increment (++x) ---");
              int x = 5;
              System.out.println("  Before: x = " + x);
              int result1 = ++x;   // x becomes 6 first, then assigns to result1
          System.out.println("  result1 = ++x --> result1 = " + result1 + ", x = " + x);

          // Post-increment
          System.out.println("\n--- Post-Increment (x++) ---");
              int y = 5;
              System.out.println("  Before: y = " + y);
              int result2 = y++;   // result2 gets 5 first, then y becomes 6
          System.out.println("  result2 = y++ --> result2 = " + result2 + ", y = " + y);

          // Pre-decrement
          System.out.println("\n--- Pre-Decrement (--x) ---");
              int p = 10;
              System.out.println("  Before: p = " + p);
              int result3 = --p;   // p becomes 9 first
          System.out.println("  result3 = --p --> result3 = " + result3 + ", p = " + p);

          // Post-decrement
          System.out.println("\n--- Post-Decrement (p--) ---");
              int q = 10;
              System.out.println("  Before: q = " + q);
              int result4 = q--;   // result4 gets 10 first, then q becomes 9
          System.out.println("  result4 = q-- --> result4 = " + result4 + ", q = " + q);

          // Logical NOT
          System.out.println("\n--- Logical NOT (!) ---");
              boolean flag = true;
              System.out.println("  flag  = " + flag);
              System.out.println("  !flag = " + !flag);

          // Bitwise Complement
          System.out.println("\n--- Bitwise Complement (~) ---");
              int num = 5;
              System.out.println("  num  = " + num  + "  (binary: " + Integer.toBinaryString(num) + ")");
              System.out.println("  ~num = " + (~num) + "  (formula: ~n = -(n+1))");

          System.out.println("============================================");
    }
}
