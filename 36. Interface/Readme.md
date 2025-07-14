
# 🔌 Interface in Java

An **interface** in Java is a **blueprint for a class**. It is a reference type that **can contain only constants, method signatures (abstract methods), default methods, static methods, and nested types**. Interfaces **cannot have instance fields or constructors**.

✅ **Purpose**: Interfaces are used to **achieve abstraction** and **multiple inheritance** in Java.

---

## ✅ Key Points:
- Interfaces **cannot be instantiated**.
- A class **implements** an interface using the `implements` keyword.
- All methods in an interface are **implicitly public and abstract** (except static and default).
- Java allows **multiple interfaces to be implemented by a single class**.

---

## 📦 Syntax:

```java
interface Animal {
    void sound();  // abstract method
}
```

```java
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();  // Output: Dog barks
    }
}
```

---

## ⚙️ Why Use Interfaces?

| Reason | Description |
|--------|-------------|
| 🔄 Multiple Inheritance | Java does not support multiple inheritance via classes, but interfaces allow it. |
| 🧪 Abstraction | You can define behavior without implementation. |
| 🔐 Loose Coupling | Interfaces provide a layer of abstraction between implementation and usage. |
