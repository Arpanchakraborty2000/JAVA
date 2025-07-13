# 📦 Wrapper Class in Java

## ✅ What is a Wrapper Class?

A **Wrapper class** in Java wraps a **primitive data type** into an **object**. Each primitive type has a corresponding wrapper class in the `java.lang` package.

---

## 🔹 Why Use Wrapper Classes?

- Collections (e.g., `ArrayList`) only store **objects**, not primitives.
- Wrapper classes provide **utility methods** like `parseInt()`, `compare()`, etc.
- Supports **autoboxing** and **unboxing**:
  - Autoboxing: Primitive → Object
  - Unboxing: Object → Primitive

---

## 🔸 Primitive vs Wrapper Class Mapping

| Primitive | Wrapper Class |
|-----------|----------------|
| `byte`    | `Byte`         |
| `short`   | `Short`        |
| `int`     | `Integer`      |
| `long`    | `Long`         |
| `float`   | `Float`        |
| `double`  | `Double`       |
| `char`    | `Character`    |
| `boolean` | `Boolean`      |

---

## 🔹 Example 1: Manual Boxing and Unboxing

```java
int a = 10;
Integer obj = Integer.valueOf(a);  // Boxing
int b = obj.intValue();            // Unboxing
System.out.println(b);             // Output: 10
```

---

## 🔹 Example 2: Autoboxing and Unboxing

```java
int x = 5;
Integer y = x;   // Autoboxing
int z = y;       // Unboxing
System.out.println(z);  // Output: 5
```

---

## 🔹 Example 3: Real Use Case with ArrayList

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  // Autoboxes int to Integer
        list.add(20);

        System.out.println(list);  // Output: [10, 20]
    }
}
```

---

## 📚 Conclusion

- Use wrapper classes when you need **objects instead of primitives**.
- Collections, streams, and generics rely on wrapper classes.
- Java handles most conversions automatically through **autoboxing/unboxing**.
