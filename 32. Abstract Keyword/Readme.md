
# 🔷 Abstract Class and Methods in Java

## 🧠 What is `abstract` in Java?

- `abstract` keyword is used to:
  - Declare an **abstract class** (cannot be instantiated)
  - Declare an **abstract method** (no body, must be implemented by subclass)

---

## 📌 Example 1: Animal Example

```java
abstract class Animal {
    abstract void sound();  // Abstract method

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Output: Dog barks
        myDog.eat();    // Output: Eating...
    }
}
```

---

## 📌 Example 2: Shape

```java
abstract class Shape {
    abstract void draw();

    void print() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();   // Output: Drawing Circle
        s.print();  // Output: This is a shape.
    }
}
```

---

## 📌 Example 3: Vehicle

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();  // Car starts with key
        v2.start();  // Bike starts with kick
    }
}
```

---

## 📌 Example 4: Bank Interest

```java
abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI ROI: " + b1.getRateOfInterest());   // SBI ROI: 7
        System.out.println("HDFC ROI: " + b2.getRateOfInterest());  // HDFC ROI: 8
    }
}
```

---

## ✅ Summary:
- `abstract class` → Can't create objects from it.
- `abstract method` → Must be implemented by subclass.
- Helps in **polymorphism** and **code architecture**.
