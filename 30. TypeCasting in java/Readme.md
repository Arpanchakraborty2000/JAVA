# 🔄 Type Casting in Java

## 📌 What is Type Casting?
**Type casting** means converting a variable from one data type to another. It can be done for:
- **Primitive types** (e.g., `int` to `double`)
- **Reference types** (i.e., classes using inheritance)

---

## 🔹 1. Primitive Type Casting

### ✅ Implicit Casting (Widening Conversion)
Automatically done by Java when converting **smaller to larger** types.

```java
int a = 10;
double b = a;  // int to double (implicit)
```

---

### ✅ Explicit Casting (Narrowing Conversion)
Manually done when converting **larger to smaller** types.

```java
double a = 10.5;
int b = (int) a;  // double to int (explicit)
```

---

## 🔹 2. Reference Type Casting (Object Casting - Inheritance)

Used when dealing with **parent and child classes** in an inheritance hierarchy.

---

### 🔸 Upcasting (Child → Parent)
- ✅ **Safe and automatic**
- A parent class reference can hold a child class object
- Only **parent class methods** are accessible

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // ✅ Upcasting
        a.sound();             // Allowed
        // a.bark();           // ❌ Not allowed
    }
}
```

---

### 🔸 Downcasting (Parent → Child)
- ❌ **Not safe by default**, must be explicitly cast
- Can cause `ClassCastException` if cast is invalid

```java
Animal a = new Dog();      // Upcasting
Dog d = (Dog) a;           // ✅ Downcasting
d.bark();                  // Accessible
```

#### ❌ Unsafe Downcasting Example

```java
Animal a = new Animal();
Dog d = (Dog) a;  // ❌ Runtime error: ClassCastException
```

#### ✅ Safe Way Using `instanceof`

```java
if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.bark();
}
```

---

## ✅ Summary Table

| Type        | Direction         | Automatic? | Safe? | Cast Required? |
|-------------|-------------------|------------|--------|----------------|
| Upcasting   | Child → Parent    | Yes        | Yes    | No             |
| Downcasting | Parent → Child    | No         | No*    | Yes            |

> ⚠️ **Note:** Downcasting is only safe if the actual object is of the child type.

---

## 📚 Conclusion

- Use **upcasting** for flexibility (e.g., polymorphism).
- Use **downcasting** carefully and always check with `instanceof` to avoid runtime errors.
