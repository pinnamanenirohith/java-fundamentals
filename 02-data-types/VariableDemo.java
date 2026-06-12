/**
 * VariableDemo.java
   * Topic: Data Types
      *
      * Description:
    * Demonstrates three types of variables in Java:
    *   1. Local Variables    - declared inside a method
      *   2. Instance Variables - declared inside a class, outside methods
      *   3. Static Variables   - declared with 'static' keyword (class-level)
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class VariableDemo {

    // -------------------------------------------------------
    // INSTANCE VARIABLE:
    // - Declared inside the class but outside any method.
    // - Each object (instance) gets its OWN copy.
    // - Default values: 0, 0.0, false, null
    // -------------------------------------------------------
    String studentName;   // instance variable
    int    studentAge;    // instance variable

    // -------------------------------------------------------
    // STATIC VARIABLE (Class Variable):
    // - Declared with the 'static' keyword.
    // - Shared across ALL objects of the class.
    // - There is only ONE copy in memory.
    // - Accessed using className.variableName
    // -------------------------------------------------------
    static String collegeName = "KL University";  // static variable
    static int    studentCount = 0;               // tracks total students

    // Constructor to initialize instance variables
    VariableDemo(String name, int age) {
              this.studentName = name;
              this.studentAge  = age;
              studentCount++;   // increment shared counter for each new student
    }

    // Method to display student details
    void displayDetails() {
              System.out.println("  Name    : " + studentName);
              System.out.println("  Age     : " + studentAge);
              System.out.println("  College : " + collegeName);
    }

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("       Java Variable Types Demo             ");
              System.out.println("============================================");

          // -------------------------------------------------------
          // LOCAL VARIABLE:
          // - Declared inside a method or block.
          // - Only accessible within that method/block.
          // - Must be initialized before use (no default value).
          // -------------------------------------------------------
          int localVar = 50;   // local variable
          System.out.println("\n--- Local Variable ---");
              System.out.println("  localVar = " + localVar);
              System.out.println("  Scope: inside main() only");

          // Creating objects to demonstrate instance and static variables
          System.out.println("\n--- Instance Variables ---");
              VariableDemo student1 = new VariableDemo("Rohith", 21);
              VariableDemo student2 = new VariableDemo("Priya", 20);

          System.out.println("Student 1:");
              student1.displayDetails();

          System.out.println("Student 2:");
              student2.displayDetails();

          // Demonstrating static variable - shared across all objects
          System.out.println("\n--- Static Variable ---");
              System.out.println("  College Name   : " + VariableDemo.collegeName);
              System.out.println("  Total Students : " + VariableDemo.studentCount);
              System.out.println("  (Static variables are shared by all instances)");

          System.out.println("============================================");
    }
}
