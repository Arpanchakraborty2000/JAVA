
# ✅ `final` Keyword in Java

The `final` keyword is used to restrict modification. It can be applied to **variables**, **methods**, and **classes**.

---

## 🔹 Usage Summary

| Element       | Restriction                                  | Example                            |
|---------------|-----------------------------------------------|-------------------------------------|
| **Variable**  | Value can't be changed after assignment       | `final int x = 10;`                |
| **Method**    | Can't be overridden in a subclass             | `final void show() {}`            |
| **Class**     | Can't be extended/inherited                   | `final class Animal {}`           |

---

## 🔹 Code Examples

### ✅ Final Variable

```java
final int x = 10;
x = 20; // ❌ Compilation Error
```

### ✅ Final Method

```java
class A {
    final void show() {
        System.out.println("Hello");
    }
}

class B extends A {
    void show() { // ❌ Compilation Error
        System.out.println("Hi");
    }
}
```

### ✅ Final Class

```java
final class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal { // ❌ Compilation Error
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

## ✅ Common Uses

- Define constants: `public static final double PI = 3.14;`
- Prevent method overriding
- Prevent inheritance
- Ensure immutability and thread safety
