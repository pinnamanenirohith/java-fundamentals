/**
 * JDKJREJVMExplanation.java
   * Topic: Java Basics
      *
      * Description:
    * This program explains the three core components of the Java ecosystem:
    * JDK, JRE, and JVM, along with the Java compilation flow.
      *
      * -------------------------------------------------------
      * JDK - Java Development Kit
      * -------------------------------------------------------
      * - A full-featured software development kit for Java.
      * - Includes the Java compiler (javac), JRE, debugger, and
      *   development tools.
      * - Used by developers to WRITE and COMPILE Java programs.
      * - Example: JDK 17, JDK 21
      *
      * -------------------------------------------------------
      * JRE - Java Runtime Environment
      * -------------------------------------------------------
      * - Provides the libraries, JVM, and other components needed
      *   to RUN Java programs.
      * - Does NOT include development tools like the compiler.
      * - End users need JRE to run Java applications.
      * - JRE = JVM + Standard Libraries
      *
      * -------------------------------------------------------
      * JVM - Java Virtual Machine
      * -------------------------------------------------------
      * - The engine that EXECUTES Java bytecode (.class files).
 * - Provides platform independence (Write Once, Run Anywhere).
      * - Handles memory management, garbage collection, and security.
      * - JVM is platform-specific (different JVM for Windows, Linux, Mac)
 *   but the bytecode it runs is platform-independent.
      *
      * -------------------------------------------------------
      * Java Compilation Flow:
    * -------------------------------------------------------
       * Step 1: Developer writes code in a .java file.
      * Step 2: javac (Java Compiler) compiles it to .class (bytecode).
      * Step 3: JVM reads and executes the .class file on any platform.
      *
      *   Source Code (.java)
 *        |  javac (compiler)
      *        v
      *   Bytecode (.class)
      *        |  JVM (interpreter)
      *        v
      *   Output (on any OS)
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class JDKJREJVMExplanation {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("       Java Ecosystem: JDK, JRE, JVM        ");
              System.out.println("============================================");

          System.out.println("\nJDK (Java Development Kit):");
              System.out.println("  - Used to DEVELOP Java programs.");
              System.out.println("  - Includes: javac compiler + JRE + tools.");

          System.out.println("\nJRE (Java Runtime Environment):");
              System.out.println("  - Used to RUN Java programs.");
              System.out.println("  - Includes: JVM + standard libraries.");

          System.out.println("\nJVM (Java Virtual Machine):");
              System.out.println("  - Executes Java bytecode (.class files).");
              System.out.println("  - Makes Java platform-independent.");

          System.out.println("\nCompilation Flow:");
              System.out.println("  .java --> [javac] --> .class --> [JVM] --> Output");

          System.out.println("\nRelationship:");
              System.out.println("  JDK contains JRE, JRE contains JVM.");
              System.out.println("  JDK > JRE > JVM");

          System.out.println("============================================");
    }
}
