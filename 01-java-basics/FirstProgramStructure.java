/**
 * FirstProgramStructure.java
   * Topic: Java Basics
      *
      * Description:
    * Explains the structure of a Java program step by step.
      * This is a beginner's guide to understanding the anatomy
      * of every Java program.
      *
      * -------------------------------------------------------
      * STRUCTURE OF A JAVA PROGRAM:
      * -------------------------------------------------------
      *
      * 1. CLASS DECLARATION:
      *    - Every Java program starts with a class.
      *    - Syntax: public class ClassName { ... }
 *    - ClassName must match the filename.
    *    - 'public' means accessible from anywhere.
    *    - 'class' is a keyword to define a class.
    *
    * 2. MAIN METHOD:
  *    - Entry point of every Java application.
    *    - Syntax: public static void main(String[] args) { ... }
 *    - 'public'  : accessible by JVM from outside the class.
 *    - 'static'  : can be called without creating an object.
    *    - 'void'    : does not return any value.
    *    - 'main'    : name recognized by JVM as entry point.
    *    - 'String[] args' : command-line arguments (array of strings).
    *
    * 3. STATEMENTS:
  *    - Instructions inside the main method.
     *    - Each statement ends with a semicolon (;).
 *    - Example: System.out.println("Hello");
 *
 * 4. COMMENTS:
  *    - Single-line: // This is a comment
 *    - Multi-line:  /* This is a multi-line comment *\/
    *    - Javadoc:     /** Used for documentation *\/
    *
    * 5. PACKAGES (optional):
 *    - Groups related classes.
    *    - Syntax: package com.example;
 *
 * Author: Pinnamaneni Rohith Venkata Sai
    * Course: Wipro TalentNext (WTN) - Java Fundamentals
    */

// Class declaration - class name must match the filename
public class FirstProgramStructure {

    // The main method - entry point of the Java program
    // JVM looks for this exact signature to start execution
    public static void main(String[] args) {

          // --- SINGLE LINE COMMENT ---
          // System.out is the standard output stream
          // println() prints text and moves to the next line
          // print()   prints text WITHOUT moving to the next line

          System.out.println("=== Java Program Structure ===");

          // Demonstrating print vs println
          System.out.print("Hello");       // no newline
          System.out.print(", ");           // no newline
          System.out.println("World!");    // newline at end

          // Printing different data types
          System.out.println("Integer : " + 42);
              System.out.println("Double  : " + 3.14);
              System.out.println("Boolean : " + true);
              System.out.println("Char    : " + 'A');

          // Formatted output using printf
          System.out.printf("Formatted: Name = %s, Age = %d%n", "Rohith", 21);

          System.out.println("=== End of Program ===");

    } // end of main method

} // end of class FirstProgramStructure
