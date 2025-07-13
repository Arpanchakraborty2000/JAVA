# 🔄 Dynamic Method Dispatch in Java

**Dynamic Method Dispatch** (also known as **runtime polymorphism**) is a mechanism in Java by which a **call to an overridden method is resolved at runtime**, not at compile time.

---

## ✅ Key Concepts

- Happens when a **superclass reference** refers to a **subclass object**.
- Method that gets executed is determined by **actual object type**, not the reference type.
- Based on **method overriding**, not overloading.

---

## 🧠 Why It's Useful

- Enables **polymorphic behavior**.
- Promotes **code flexibility** and **extensibility**.

---

## 🧪 Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a;         // Reference of superclass

        a = new Dog();    // Dog object
        a.sound();        // Output: Dog barks

        a = new Cat();    // Cat object
        a.sound();        // Output: Cat meows
    }
}
