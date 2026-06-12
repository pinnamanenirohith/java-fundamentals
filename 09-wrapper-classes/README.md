# 09 - Wrapper Classes

## Overview

This section covers **Wrapper Classes** in Java — classes that encapsulate (wrap) primitive data types into objects. They bridge the gap between primitive types and the Java Collections Framework which requires objects.

---

## Topics Covered

| # | Topic | Description |
|---|-------|-------------|
| 1 | Wrapper Classes | Integer, Double, Float, Long, Char, Boolean wrappers |
| 2 | Autoboxing | Automatic conversion of primitive to wrapper object |
| 3 | Unboxing | Automatic conversion of wrapper object to primitive |
| 4 | Character Class Methods | isDigit(), isLetter(), isUpperCase(), toUpperCase() |

---

## Key Concepts

**Primitive to Wrapper Mapping:**

| Primitive | Wrapper Class |
|-----------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

**Autoboxing and Unboxing:**

```java
// Autoboxing (primitive -> object)
int num = 42;
Integer obj = num;          // Autoboxing
Integer obj2 = Integer.valueOf(42); // Manual boxing

// Unboxing (object -> primitive)
Integer obj = 100;
int val = obj;              // Unboxing
int val2 = obj.intValue();  // Manual unboxing
```

**Useful Wrapper Methods:**

```java
Integer.parseInt("123")      // Convert String to int
Integer.MAX_VALUE            // Maximum int value
Integer.MIN_VALUE            // Minimum int value
Integer.toBinaryString(10)   // Convert to binary string
Character.isDigit('5')       // true
Character.isLetter('A')      // true
Character.toUpperCase('a')   // 'A'
```

---

## Learning Objectives

After completing this module, you will be able to:
- Identify the wrapper class for each primitive type
- Use autoboxing and unboxing in Java programs
- Apply useful methods from Integer, Double, and Character classes
- Use wrapper classes with Java Collections

---

[Back to Main](../README.md)
