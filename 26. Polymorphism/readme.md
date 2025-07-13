# 🔄 Polymorphism in Java

**Polymorphism** means one method behaves differently based on the object or context.  
It allows **one interface** to be used for different data types or classes.

---

## ✅ Types of Polymorphism

### 1. Compile-Time Polymorphism (Method Overloading)

- Resolved at **compile time**
- Same method name, different parameters

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));        // 5
        System.out.println(c.add(2.5, 3.5));    // 6.0
    }
}

---

### 🔁 2. Run-Time Polymorphism (Method Overriding)

- Resolved at **runtime**
- Subclass overrides the parent class method

### ✅ Java Example:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Output: Dog barks
    }
}
