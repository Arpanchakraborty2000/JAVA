
# 🔹 Lambda Expression in Java

Lambda Expression in Java is a **short-cut way to write anonymous methods (functions)**. It allows you to **pass behavior as an argument** and provides a **clear and concise way to represent functional interfaces**.

Lambda expressions were introduced in **Java 8** and are mainly used to implement methods of **functional interfaces** (interfaces with only one abstract method).

---

## ✅ Syntax of Lambda Expression:

```java
(parameters) -> expression
```
or

```java
(parameters) -> { statements; }
```

---

## 🔸 Example Without Lambda:

```java
interface Drawable {
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing without Lambda");
            }
        };
        d.draw();
    }
}
```

---

## 🔸 Example With Lambda:

```java
interface Drawable {
    void draw();
}

public class LambdaExample {
    public static void main(String[] args) {
        Drawable d = () -> {
            System.out.println("Drawing with Lambda");
        };
        d.draw();
    }
}
```

---

## 🔸 Lambda with Parameters:

```java
interface Addable {
    int add(int a, int b);
}

public class LambdaAdd {
    public static void main(String[] args) {
        Addable add = (a, b) -> a + b;
        System.out.println("Sum: " + add.add(10, 20));
    }
}
```

---

## ✅ Key Points:

- Lambda expressions can only be used with **functional interfaces**.
- Makes code **more readable and concise**.
- Useful in **collections**, **streams**, and **event handling**.
