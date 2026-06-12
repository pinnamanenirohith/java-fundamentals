/**
 * LogicalOperators.java
   * Topic: Operators
      *
      * Description:
 * Demonstrates Logical Operators in Java.
      * Logical operators work with boolean values.
      *
      * Logical Operators:
      *   &&   Logical AND  - true only if BOTH operands are true
      *   ||   Logical OR   - true if AT LEAST ONE operand is true
      *   !    Logical NOT  - reverses the boolean value
      *
      * Truth Tables:
      *   AND (&&):  true && true = true
      *              true && false = false
      *              false && true = false
      *              false && false = false
      *
      *   OR  (||):  true || true = true
      *              true || false = true
      *              false || true = true
      *              false || false = false
      *
      *   NOT (!):   !true = false
                *              !false = true
                *
                * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class LogicalOperators {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("         Logical Operators Demo             ");
              System.out.println("============================================");

          boolean p = true;
              boolean q = false;

          System.out.println("  p = " + p + ",  q = " + q);

          // Logical AND (&&)
          System.out.println("\n--- Logical AND (&&) ---");
              System.out.println("  p && q  = " + (p && q));    // false
          System.out.println("  p && p  = " + (p && p));    // true
          System.out.println("  q && q  = " + (q && q));    // false

          // Logical OR (||)
          System.out.println("\n--- Logical OR (||) ---");
              System.out.println("  p || q  = " + (p || q));    // true
          System.out.println("  p || p  = " + (p || p));    // true
          System.out.println("  q || q  = " + (q || q));    // false

          // Logical NOT (!)
          System.out.println("\n--- Logical NOT (!) ---");
              System.out.println("  !p      = " + (!p));         // false
          System.out.println("  !q      = " + (!q));         // true
          System.out.println("  !!p     = " + (!!p));        // true (double negation)

          // --- Practical Example 1: Login Validation ---
          System.out.println("\n--- Practical: Login Validation ---");
              String username = "admin";
              String password = "1234";
              boolean validUser = username.equals("admin");
              boolean validPass = password.equals("1234");

          if (validUser && validPass) {
                        System.out.println("  Access GRANTED! (both conditions true)");
          } else {
                        System.out.println("  Access DENIED!");
          }

          // --- Practical Example 2: Age/Income check ---
          System.out.println("\n--- Practical: Loan Eligibility ---");
              int age    = 25;
              int salary = 50000;

          if (age >= 21 && salary >= 30000) {
                        System.out.println("  Eligible for loan (age>=21 AND salary>=30000)");
          } else {
                        System.out.println("  Not eligible for loan.");
          }

          // --- Short-circuit evaluation ---
          System.out.println("\n--- Short-Circuit Evaluation ---");
              System.out.println("  false && (any) = false  (second operand not checked)");
              System.out.println("  true  || (any) = true   (second operand not checked)");

          System.out.println("============================================");
    }
}
