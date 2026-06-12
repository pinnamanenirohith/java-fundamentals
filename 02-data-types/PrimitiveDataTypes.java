/**
 * PrimitiveDataTypes.java
   * Topic: Data Types
      *
      * Description:
    * Demonstrates all 8 primitive data types in Java.
      * Primitive types are the most basic data types built into Java.
      * They are NOT objects and hold their values directly in memory.
      *
      * The 8 Primitive Data Types:
    *   1. byte    - 8-bit integer  (-128 to 127)
      *   2. short   - 16-bit integer (-32,768 to 32,767)
      *   3. int     - 32-bit integer (-2^31 to 2^31-1) [most common]
      *   4. long    - 64-bit integer (-2^63 to 2^63-1)
      *   5. float   - 32-bit decimal (single precision)
      *   6. double  - 64-bit decimal (double precision) [most common]
      *   7. char    - 16-bit Unicode character
      *   8. boolean - true or false
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class PrimitiveDataTypes {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("       Java Primitive Data Types            ");
              System.out.println("============================================");

          // 1. byte - smallest integer type (8-bit)
          byte myByte = 100;
              System.out.println("\n1. byte");
              System.out.println("   Value   : " + myByte);
              System.out.println("   Size    : 8-bit");
              System.out.println("   Range   : -128 to 127");

          // 2. short - 16-bit integer
          short myShort = 30000;
              System.out.println("\n2. short");
              System.out.println("   Value   : " + myShort);
              System.out.println("   Size    : 16-bit");
              System.out.println("   Range   : -32,768 to 32,767");

          // 3. int - most commonly used integer type (32-bit)
          int myInt = 1000000;
              System.out.println("\n3. int");
              System.out.println("   Value   : " + myInt);
              System.out.println("   Size    : 32-bit");
              System.out.println("   Range   : -2,147,483,648 to 2,147,483,647");

          // 4. long - for very large integers (64-bit)
          // Note: append 'L' or 'l' suffix for long literals
          long myLong = 9876543210L;
              System.out.println("\n4. long");
              System.out.println("   Value   : " + myLong);
              System.out.println("   Size    : 64-bit");
              System.out.println("   Suffix  : Use 'L' after the value");

          // 5. float - single precision decimal (32-bit)
          // Note: append 'f' or 'F' suffix for float literals
          float myFloat = 3.14f;
              System.out.println("\n5. float");
              System.out.println("   Value   : " + myFloat);
              System.out.println("   Size    : 32-bit");
              System.out.println("   Suffix  : Use 'f' after the value");

          // 6. double - double precision decimal (64-bit) [default for decimals]
          double myDouble = 3.141592653589793;
              System.out.println("\n6. double");
              System.out.println("   Value   : " + myDouble);
              System.out.println("   Size    : 64-bit");
              System.out.println("   Note    : Default type for decimal numbers");

          // 7. char - single character (16-bit Unicode)
          // Note: use single quotes for char literals
          char myChar = 'A';
              System.out.println("\n7. char");
              System.out.println("   Value   : " + myChar);
              System.out.println("   Size    : 16-bit");
              System.out.println("   Note    : Stores a single character in quotes");
              System.out.println("   Unicode : " + (int) myChar);  // ASCII value

          // 8. boolean - true or false only
          boolean isJavaFun = true;
              System.out.println("\n8. boolean");
              System.out.println("   Value   : " + isJavaFun);
              System.out.println("   Values  : true or false only");

          System.out.println("\n============================================");
    }
}
