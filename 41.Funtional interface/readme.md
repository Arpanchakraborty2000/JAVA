
# ✅ Functional Interface in Java

## 📌 What is a Functional Interface?
A **Functional Interface** in Java is an interface that has **only one abstract method**. These interfaces are designed to support **lambda expressions** and **method references** (introduced in Java 8).

---

## 🔑 Key Characteristics

- Contains exactly **one abstract method**
- Can have **default** and **static** methods (but still only one abstract method)
- Use `@FunctionalInterface` annotation to indicate intent (optional but recommended)

---

## 🔧 Syntax Example

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething(); // Single abstract method
}
```

---

## ✅ Example with Lambda Expression

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}

public class Main {
    public static void main(String[] args) {
        // Lambda Expression implementing the interface
        MyFunctionalInterface task = () -> System.out.println("Doing something...");
        task.doSomething();
    }
}
```

---

## 🚀 Common Built-in Functional Interfaces

Java provides several built-in functional interfaces in the `java.util.function` package:

| Interface       | Abstract Method    | Description                          |
|----------------|--------------------|--------------------------------------|
| `Function<T,R>`| `R apply(T t)`     | Takes input `T` and returns `R`      |
| `Predicate<T>` | `boolean test(T t)`| Tests a condition on `T`, returns boolean |
| `Consumer<T>`  | `void accept(T t)` | Performs an operation on `T`         |
| `Supplier<T>`  | `T get()`          | Supplies a result of type `T`        |

---

## 🎯 Why Use Functional Interfaces?

- Enables concise and readable **lambda expressions**
- Core part of Java's **functional programming** support
- Extensively used in **Streams API** and **method references**

---

> ✅ Tip: Use `@FunctionalInterface` to let the compiler ensure the interface remains functional.
