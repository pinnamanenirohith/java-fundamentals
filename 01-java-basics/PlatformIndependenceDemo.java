/**
 * PlatformIndependenceDemo.java
   * Topic: Java Basics
      *
      * Description:
    * Demonstrates Java's platform independence concept.
      *
      * Java follows the principle: "Write Once, Run Anywhere" (WORA).
      *
      * How it works:
    * 1. You write Java code on Windows.
      * 2. javac compiles it to bytecode (.class file).
      * 3. The SAME bytecode runs on Linux, Mac, or any OS with JVM.
      * 4. The JVM translates bytecode to native machine code for each OS.
      *
      * This is different from C/C++ where code compiled on Windows
      * cannot run directly on Linux.
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class PlatformIndependenceDemo {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("   Java Platform Independence Demo          ");
              System.out.println("============================================");

          // Detecting the current OS using system properties
          String osName    = System.getProperty("os.name");
              String osVersion = System.getProperty("os.version");
              String osArch    = System.getProperty("os.arch");
              String javaVer   = System.getProperty("java.version");

          System.out.println("\nThis program is running on:");
              System.out.println("  Operating System : " + osName);
              System.out.println("  OS Version       : " + osVersion);
              System.out.println("  Architecture     : " + osArch);
              System.out.println("  Java Version     : " + javaVer);

          System.out.println("\nKey Concept:");
              System.out.println("  The SAME .class file runs on any OS with a JVM.");
              System.out.println("  This is Java's Platform Independence!");

          System.out.println("\nWORA - Write Once, Run Anywhere:");
              System.out.println("  [Java Source] -> [Bytecode] -> [JVM on any OS]");

          System.out.println("============================================");
    }
}
