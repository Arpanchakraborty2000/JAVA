# 🤖 Anonymous Object in Java

## 📌 What is an Anonymous Object?

In Java, an **anonymous object** is an object that is created without being assigned to a reference variable. You use it **once** and **cannot reuse** it because it doesn’t have a name (reference).

---

## ✅ Why use Anonymous Objects?

- When you **don’t need to reuse** the object.
- Used often when **calling a method immediately** on the object.
- **Saves memory** and makes the code **concise**.

---

## 📌 Syntax Example

```java
new ClassName().methodName();

```

---

## ✅ Example Code

```java
class Calculator {
    void showSquare(int num) {
        System.out.println("Square is: " + (num * num));
    }
}

public class AnonymousObjectExample {
    public static void main(String[] args) {
        // Anonymous object of Calculator class
        new Calculator().showSquare(5);
        
        // You can't reuse it again like this:
        // new Calculator().showSquare(10); // This creates a new object again
    }
}
```
---

## 🧠 Behind the Scenes

```java
// Normal object with reference
Calculator obj = new Calculator();
obj.showSquare(5); // Reusable

// Anonymous object, used only once
new Calculator().showSquare(5);

```
---

## 🚫 Limitations
Cannot reuse the object.
Not suitable when object is needed multiple times.
---
## ✅ When to Use
One-time operations.
Passing objects as parameters to methods.
Event handling in GUI (e.g., with anonymous inner classes).
---