/**
 * RelationalOperators.java
 * Topic: Operators
 *
 * Description:
 * Demonstrates Relational (Comparison) Operators in Java.
 * These operators compare two values and return boolean (true/false).
 *
 * Relational Operators:
 *   ==   Equal to
 *   !=   Not equal to
 *   >    Greater than
 *   <    Less than
 *   >=   Greater than or equal to
 *   <=   Less than or equal to
 *
 * Use case: Used in if conditions, loops, and expressions.
 *
 * Author: Pinnamaneni Rohith Venkata Sai
 * Course: Wipro TalentNext (WTN) - Java Fundamentals
 */
public class RelationalOperators {

      public static void main(String[] args) {

                System.out.println("============================================");
                System.out.println("       Relational Operators Demo            ");
                System.out.println("============================================");

                int a = 10;
                int b = 20;

                System.out.println("  a = " + a + ",  b = " + b);
                System.out.println();

                // Equal to
                System.out.println("  a == b  :  " + (a == b));  // false

                // Not equal to
                System.out.println("  a != b  :  " + (a != b));  // true

                // Greater than
                System.out.println("  a > b   :  " + (a > b));   // false

                // Less than
                System.out.println("  a < b   :  " + (a < b));   // true

                // Greater than or equal to
                System.out.println("  a >= b  :  " + (a >= b));  // false

                // Less than or equal to
                System.out.println("  a <= b  :  " + (a <= b));  // true

                // --- Equal to same value ---
                System.out.println("\n--- Comparing equal values ---");
                int x = 15;
                int y = 15;
                System.out.println("  x = " + x + ",  y = " + y);
                System.out.println("  x == y  :  " + (x == y));  // true
                System.out.println("  x >= y  :  " + (x >= y));  // true
                System.out.println("  x <= y  :  " + (x <= y));  // true
                System.out.println("  x != y  :  " + (x != y));  // false

                // --- Practical Use in if condition ---
                System.out.println("\n--- Practical Use: Age Checker ---");
                int age = 18;
                System.out.println("  age = " + age);
                if (age >= 18) {
                              System.out.println("  Eligible to vote! (age >= 18 is true)");
                          } else {
                              System.out.println("  Not eligible to vote. (age >= 18 is false)");
                          }

                // --- Comparing characters ---
                System.out.println("\n--- Comparing Characters ---");
                char ch1 = 'A';
                char ch2 = 'B';
                System.out.println("  ch1 = '" + ch1 + "',  ch2 = '" + ch2 + "'");
                System.out.println("  ch1 < ch2  :  " + (ch1 < ch2));  // true (65 < 66)
                System.out.println("  ch1 == ch2 :  " + (ch1 == ch2)); // false

                System.out.println("============================================");
            }
  }
