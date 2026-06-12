/**
 * CompilerInterpreterNotes.java
   * Topic: Java Basics
      *
      * Description:
    * Explains the difference between a Compiler and an Interpreter
      * in the context of Java.
      *
      * -------------------------------------------------------
      * COMPILER:
 * -------------------------------------------------------
      * - Translates the ENTIRE source code at once to machine code
      *   or intermediate code (bytecode).
      * - Faster execution (translation done once before running).
      * - Errors are detected after the full compilation.
      * - Example: javac (Java Compiler) compiles .java to .class
      * - Languages that use only compiler: C, C++
      *
      * -------------------------------------------------------
      * INTERPRETER:
 * -------------------------------------------------------
      * - Translates and executes code LINE BY LINE at runtime.
      * - Slower (translates during execution).
      * - Errors are detected at the line being executed.
      * - Example: Python interpreter, early BASIC
      *
      * -------------------------------------------------------
      * JAVA USES BOTH:
    * -------------------------------------------------------
       * Step 1 - Compiler (javac):
 *   .java source file --> .class bytecode file
      *
      * Step 2 - Interpreter (JVM):
 *   .class bytecode --> native machine code (line by line)
      *
      * Additionally, JVM uses JIT (Just-In-Time) Compiler which
      * converts frequently used bytecode into native code for
      * improved performance.
      *
      * Java's Approach:
    *   Compiled once (to bytecode) + Interpreted at runtime
      *   This gives Java BOTH portability AND reasonable performance.
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class CompilerInterpreterNotes {

    public static void main(String[] args) {

          System.out.println("================================================");
              System.out.println("   Compiler vs Interpreter in Java              ");
              System.out.println("================================================");

          System.out.println("\nCompiler:");
              System.out.println("  - Translates entire code at once.");
              System.out.println("  - In Java: javac converts .java to .class");
              System.out.println("  - Faster execution after compilation.");

          System.out.println("\nInterpreter:");
              System.out.println("  - Translates and runs code line by line.");
              System.out.println("  - In Java: JVM interprets bytecode at runtime.");

          System.out.println("\nJava uses BOTH:");
              System.out.println("  Phase 1: javac compiles .java --> .class (bytecode)");
              System.out.println("  Phase 2: JVM interprets .class at runtime.");
              System.out.println("  Bonus:   JIT Compiler optimizes hot code paths.");

          System.out.println("\nResult: Java is portable AND performant!");
              System.out.println("================================================");
    }
}
