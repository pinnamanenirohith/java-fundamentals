# 08 - Methods

## Overview

This section covers **Methods** in Java — reusable blocks of code that perform specific tasks. Methods promote code reusability, modularity, and cleaner program structure.

---

## Topics Covered

| # | Topic | Description |
|---|-------|-------------|
| 1 | User Defined Methods | Creating custom methods for specific tasks |
| 2 | Method Parameters | Passing data to methods through arguments |
| 3 | Return Types | Methods returning values of various data types |
| 4 | Method Overloading | Multiple methods with same name, different parameters |
| 5 | Static Methods | Methods that belong to the class, not instances |

---

## Key Concepts

**Method Syntax:**

```java
// Method with no parameters and no return
void greet() {
    System.out.println("Hello!");
    }

    // Method with parameters and return type
    int add(int a, int b) {
        return a + b;
        }

        // Static method
        static void display(String message) {
            System.out.println(message);
            }
            ```

            **Method Overloading:**

            ```java
            // Same method name, different parameters
            int multiply(int a, int b) { return a * b; }
            double multiply(double a, double b) { return a * b; }
            int multiply(int a, int b, int c) { return a * b * c; }
            ```

            **Types of Methods:**
            - **No parameter, no return** — void methods with no arguments
            - **With parameter, no return** — void methods that accept arguments
            - **No parameter, with return** — methods that return values
            - **With parameter, with return** — full methods with input and output

            ---

            ## Learning Objectives

            After completing this module, you will be able to:
            - Define and call user-defined methods in Java
            - Pass arguments and return values from methods
            - Apply method overloading for flexible method definitions
            - Use static methods appropriately

            ---

            [Back to Main](../README.md)
