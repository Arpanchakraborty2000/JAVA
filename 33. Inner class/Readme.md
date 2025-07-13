
# 📘 Inner Class in Java

## 🔹 What is an Inner Class?

An **Inner Class** in Java is a class declared **inside another class**.  
It helps logically group classes that are **only used in one place**, and can access the **members (even private)** of the outer class.

---

## ✅ Example: Simple Inner Class

```java
class Outer {
    int outerVar = 10;

    class Inner {
        void display() {
            System.out.println("Outer variable is: " + outerVar);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();  // Output: Outer variable is: 10
    }
}
```

---

## 🧠 Key Points:

- Inner class has access to all fields of the outer class.
- Helps improve encapsulation and code readability.
- There are different types of inner classes:
  - **Non-static inner class**
  - **Static nested class**
  - **Local inner class** (inside methods)
  - **Anonymous inner class**
