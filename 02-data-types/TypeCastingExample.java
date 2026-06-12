/**
 * TypeCastingExample.java
   * Topic: Data Types
      *
      * Description:
    * Demonstrates Type Casting in Java.
      *
      * Type Casting = converting one data type to another.
      *
      * Two Types:
      *   1. Implicit Casting (Widening Conversion):
      *      - Automatically done by Java compiler.
      *      - Smaller type --> Larger type (no data loss).
      *      - Order: byte -> short -> int -> long -> float -> double
      *
      *   2. Explicit Casting (Narrowing Conversion):
      *      - Done manually by the programmer.
      *      - Larger type --> Smaller type (possible data loss).
      *      - Syntax: (targetType) value
                         *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class TypeCastingExample {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("         Java Type Casting Demo             ");
              System.out.println("============================================");

          // -------------------------------------------------------
          // 1. IMPLICIT CASTING (Widening)
          // -------------------------------------------------------
          System.out.println("\n--- Implicit Casting (Widening) ---");
              System.out.println("Smaller type is automatically converted to larger type.");

          int    intVal    = 100;
              long   longVal   = intVal;    // int --> long (automatic)
          float  floatVal  = longVal;   // long --> float (automatic)
          double doubleVal = floatVal;  // float --> double (automatic)

          System.out.println("  int    value : " + intVal);
              System.out.println("  long   value : " + longVal    + "  (int --> long)");
              System.out.println("  float  value : " + floatVal   + "  (long --> float)");
              System.out.println("  double value : " + doubleVal  + "  (float --> double)");

          // char to int (implicit)
          char ch = 'Z';
              int charToInt = ch;  // char --> int (ASCII value)
          System.out.println("  char  'Z'   : " + ch + "  --> int : " + charToInt);

          // -------------------------------------------------------
          // 2. EXPLICIT CASTING (Narrowing)
          // -------------------------------------------------------
          System.out.println("\n--- Explicit Casting (Narrowing) ---");
              System.out.println("Larger type manually converted to smaller type.");
              System.out.println("WARNING: Data loss may occur!");

          double pi = 3.99999;
              int    piInt = (int) pi;   // double --> int (decimal part is LOST)
          System.out.println("  double value : " + pi);
              System.out.println("  int    value : " + piInt + "  (double --> int, decimal lost)");

          long bigNumber = 1234567890123L;
              int  smallInt  = (int) bigNumber;   // long --> int (possible data loss)
          System.out.println("  long   value : " + bigNumber);
              System.out.println("  int    value : " + smallInt + "  (long --> int, data truncated)");

          // int to char (explicit)
          int  asciiVal  = 65;
              char charVal   = (char) asciiVal;   // int --> char
          System.out.println("  int    value : " + asciiVal + "  --> char : " + charVal);

          System.out.println("\n============================================");
    }
}
