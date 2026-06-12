# 07 - Strings

## Overview

This section covers **Strings** in Java — sequences of characters used to represent text. Strings are one of the most commonly used data types in Java and come with a rich set of built-in methods.

---

## Topics Covered

| # | Topic | Description |
|---|-------|-------------|
| 1 | String Methods | Built-in methods: length(), charAt(), indexOf(), etc. |
| 2 | String Comparison | equals(), equalsIgnoreCase(), compareTo() |
| 3 | String Manipulation | concat(), substring(), replace(), trim(), toUpperCase() |
| 4 | StringBuilder | Mutable string for efficient concatenation |
| 5 | StringBuffer | Thread-safe mutable string class |

---

## Key Concepts

**String vs StringBuilder vs StringBuffer:**

| Feature | String | StringBuilder | StringBuffer |
|---------|--------|---------------|--------------|
| Mutability | Immutable | Mutable | Mutable |
| Thread-Safe | Yes | No | Yes |
| Performance | Slow (concatenation) | Fastest | Slower than StringBuilder |
| Usage | Fixed strings | Single-threaded | Multi-threaded |

**Common String Methods:**

```java
String s = "Hello, Java!";
s.length()           // 12
s.charAt(0)          // 'H'
s.indexOf("Java")    // 7
s.substring(7)       // "Java!"
s.toUpperCase()      // "HELLO, JAVA!"
s.toLowerCase()      // "hello, java!"
s.trim()             // removes leading/trailing spaces
s.replace('l','r')   // "Herro, Java!"
s.contains("Java")   // true
s.equals("Hello")   // false
```

---

## Learning Objectives

After completing this module, you will be able to:
- Use common String methods for text manipulation
- Compare strings correctly using equals() instead of ==
- Use StringBuilder for efficient string building
- Understand the difference between String, StringBuilder, and StringBuffer

---

[Back to Main](../README.md)
