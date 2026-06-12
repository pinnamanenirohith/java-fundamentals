/**
 * DataTypeRange.java
   * Topic: Data Types
      *
      * Description:
    * Displays the minimum and maximum values of each primitive
      * data type in Java using Wrapper Classes.
      *
      * Wrapper Classes:
    * Each primitive type has a corresponding Wrapper Class:
    *   byte    -> Byte
       *   short   -> Short
      *   int     -> Integer
      *   long    -> Long
      *   float   -> Float
      *   double  -> Double
      *   char    -> Character
      *   boolean -> Boolean
      *
      * Wrapper classes provide useful constants like MIN_VALUE
      * and MAX_VALUE, and methods for type conversion.
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class DataTypeRange {

    public static void main(String[] args) {

          System.out.println("==================================================");
              System.out.println("   Java Data Type Ranges (using Wrapper Classes)  ");
              System.out.println("==================================================");
              System.out.printf("%-10s  %-6s  %-25s  %-25s%n",
                                                          "Type", "Size", "Min Value", "Max Value");
              System.out.println("--------------------------------------------------");

          // byte - 8 bit
          System.out.printf("%-10s  %-6s  %-25d  %-25d%n",
                                        "byte", "8-bit", Byte.MIN_VALUE, Byte.MAX_VALUE);

          // short - 16 bit
          System.out.printf("%-10s  %-6s  %-25d  %-25d%n",
                                        "short", "16-bit", Short.MIN_VALUE, Short.MAX_VALUE);

          // int - 32 bit
          System.out.printf("%-10s  %-6s  %-25d  %-25d%n",
                                        "int", "32-bit", Integer.MIN_VALUE, Integer.MAX_VALUE);

          // long - 64 bit
          System.out.printf("%-10s  %-6s  %-25d  %-25d%n",
                                        "long", "64-bit", Long.MIN_VALUE, Long.MAX_VALUE);

          // float - 32 bit (single precision)
          System.out.printf("%-10s  %-6s  %-25e  %-25e%n",
                                        "float", "32-bit", Float.MIN_VALUE, Float.MAX_VALUE);

          // double - 64 bit (double precision)
          System.out.printf("%-10s  %-6s  %-25e  %-25e%n",
                                        "double", "64-bit", Double.MIN_VALUE, Double.MAX_VALUE);

          // char - 16 bit Unicode
          System.out.printf("%-10s  %-6s  %-25d  %-25d%n",
                                        "char", "16-bit", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);

          System.out.println("\nUseful Integer Constants:");
              System.out.println("  Integer.MAX_VALUE = " + Integer.MAX_VALUE);
              System.out.println("  Integer.MIN_VALUE = " + Integer.MIN_VALUE);
              System.out.println("  Integer.SIZE      = " + Integer.SIZE + " bits");
              System.out.println("  Integer.BYTES     = " + Integer.BYTES + " bytes");

          System.out.println("\nUseful Double Constants:");
              System.out.println("  Double.MAX_VALUE       = " + Double.MAX_VALUE);
              System.out.println("  Double.MIN_VALUE       = " + Double.MIN_VALUE);
              System.out.println("  Double.POSITIVE_INFINITY = " + Double.POSITIVE_INFINITY);
              System.out.println("  Double.NEGATIVE_INFINITY = " + Double.NEGATIVE_INFINITY);
              System.out.println("  Double.NaN             = " + Double.NaN);

          System.out.println("==================================================");
    }
}
