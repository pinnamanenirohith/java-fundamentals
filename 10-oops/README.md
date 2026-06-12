# 10 - OOP Concepts

## Overview

This section covers **Object-Oriented Programming (OOP)** in Java — the core programming paradigm that organizes software design around data (objects) rather than functions and logic. OOP makes code modular, reusable, and easier to maintain.

---

## Topics Covered

| # | Topic | Description |
|---|-------|-------------|
| 1 | Class and Object | Blueprint and instance of a class |
| 2 | Constructor | Special method to initialize objects |
| 3 | Encapsulation | Bundling data and methods, access control |
| 4 | Inheritance | Deriving new class from existing class |
| 5 | Polymorphism | One interface, multiple implementations |
| 6 | Abstraction | Hiding implementation details |
| 7 | Interface | Contract for class behavior |

---

## Key Concepts

**The 4 Pillars of OOP:**

| Pillar | Description | Java Keyword |
|--------|-------------|---------------|
| Encapsulation | Data hiding using access modifiers | private, public, protected |
| Inheritance | Code reuse through parent-child relationship | extends |
| Polymorphism | Same method behaves differently | @Override, method overloading |
| Abstraction | Show only essential features | abstract, interface |

**Class and Object Example:**

```java
// Class definition
class Student {
    // Fields (attributes)
        private String name;
            private int age;

                // Constructor
                    public Student(String name, int age) {
                            this.name = name;
                                    this.age = age;
                                        }

                                            // Method
                                                public void display() {
                                                        System.out.println(name + " : " + age);
                                                            }
                                                            }

                                                            // Object creation
                                                            Student s = new Student("Rohith", 21);
                                                            s.display();
                                                            ```

                                                            **Inheritance:**

                                                            ```java
                                                            class Animal {
                                                                void speak() { System.out.println("Animal speaks"); }
                                                                }

                                                                class Dog extends Animal {
                                                                    @Override
                                                                        void speak() { System.out.println("Dog barks"); }
                                                                        }
                                                                        ```

                                                                        **Interface:**

                                                                        ```java
                                                                        interface Shape {
                                                                            double area();       // Abstract method
                                                                                double perimeter();  // Abstract method
                                                                                }

                                                                                class Circle implements Shape {
                                                                                    double radius;
                                                                                        public double area() { return Math.PI * radius * radius; }
                                                                                            public double perimeter() { return 2 * Math.PI * radius; }
                                                                                            }
                                                                                            ```

                                                                                            ---

                                                                                            ## Learning Objectives

                                                                                            After completing this module, you will be able to:
                                                                                            - Design and implement classes and objects in Java
                                                                                            - Apply encapsulation using access modifiers and getters/setters
                                                                                            - Use inheritance to create class hierarchies
                                                                                            - Implement polymorphism through method overriding
                                                                                            - Create abstract classes and interfaces

                                                                                            ---

                                                                                            [Back to Main](../README.md)
