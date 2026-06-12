/**
 * BinaryConversion.java
   * Topic: Data Types
      *
      * Description:
    * Demonstrates conversion between decimal and binary numbers.
      *
      * Number Systems:
    *   Decimal  - Base 10 (digits 0-9) - used by humans
      *   Binary   - Base 2  (digits 0-1) - used by computers
      *   Octal    - Base 8  (digits 0-7)
      *   Hex      - Base 16 (digits 0-9, A-F)
      *
      * Decimal to Binary:
    *   Keep dividing by 2 and collect remainders in reverse.
      *   Example: 10 / 2 = 5 R0, 5/2=2 R1, 2/2=1 R0, 1/2=0 R1 --> 1010
      *
      * Author: Pinnamaneni Rohith Venkata Sai
      * Course: Wipro TalentNext (WTN) - Java Fundamentals
      */
public class BinaryConversion {

    public static void main(String[] args) {

          System.out.println("============================================");
              System.out.println("       Binary Conversion Demo               ");
              System.out.println("============================================");

          // --- Method 1: Using Integer.toBinaryString() ---
          System.out.println("\n--- Using Integer.toBinaryString() ---");

          int[] numbers = {0, 1, 5, 10, 15, 25, 42, 100, 255};

          System.out.printf("%-10s  %-20s  %-10s  %-10s%n",
                                                      "Decimal", "Binary", "Octal", "Hex");
              System.out.println("--------------------------------------------------");

          for (int num : numbers) {
                        System.out.printf("%-10d  %-20s  %-10s  %-10s%n",
                                                          num,
                                                          Integer.toBinaryString(num),   // decimal to binary
                                                          Integer.toOctalString(num),    // decimal to octal
                                                          Integer.toHexString(num).toUpperCase());  // decimal to hex
          }

          // --- Method 2: Manual Decimal to Binary Conversion ---
          System.out.println("\n--- Manual Conversion Example (Decimal 42 to Binary) ---");
              System.out.println("Divide by 2 repeatedly, collect remainders in reverse:");

          int n = 42;
              String binary = "";
              int original = n;

          while (n > 0) {
                        int remainder = n % 2;
                        binary = remainder + binary;   // prepend remainder
                  System.out.println("  " + n + " / 2 = " + (n / 2) + "  remainder: " + remainder);
                        n = n / 2;
          }
              System.out.println("  Binary of " + original + " = " + binary);

          // --- Method 3: Binary String to Integer ---
          System.out.println("\n--- Binary to Decimal ---");
              String binaryStr = "101010";
              int decimalVal = Integer.parseInt(binaryStr, 2);
              System.out.println("  Binary  " + binaryStr + " = Decimal " + decimalVal);

          // --- Integer bit operations info ---
          System.out.println("\n--- Integer Bit Representation ---");
              int val = 42;
              System.out.println("  Decimal  : " + val);
              System.out.println("  Binary   : " + Integer.toBinaryString(val));
              System.out.println("  Bit Count: " + Integer.bitCount(val) + " (number of 1s)");

          System.out.println("============================================");
    }
}
