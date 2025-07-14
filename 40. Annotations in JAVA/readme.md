# 📌 Annotations in Java

## ✅ What is an Annotation?

**Annotations** in Java are metadata (data about data) that provide information to the compiler and runtime.  
They **do not affect** the program logic but are used to give additional instructions.

---

## 🔹 Why Use Annotations?

- Provide **metadata** to classes, methods, variables, etc.
- Used for **compiler checks**, **code generation**, or **runtime processing** (e.g., in frameworks like Spring).
- Common in libraries and frameworks like Spring, Hibernate, JUnit.

---

## 🔹 Built-in Java Annotations

| Annotation         | Purpose                                              |
|--------------------|------------------------------------------------------|
| `@Override`         | Indicates a method overrides a superclass method    |
| `@Deprecated`       | Marks method/class as outdated                      |
| `@SuppressWarnings` | Tells compiler to ignore specified warnings         |

---

## ✅ Example: Using Built-in Annotations

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();        // Dog barks
        dog.oldMethod();    // Deprecated warning
    }
}
```

---

## 🔹 Creating a Custom Annotation

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}
```

### ✅ Using the Custom Annotation

```java
public class Test {

    @MyAnnotation(value = "Hello")
    public void sayHi() {
        System.out.println("Hi from annotated method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.sayHi();
    }
}
```

---

## ✅ Summary

- Annotations add metadata, not behavior.
- Common annotations: `@Override`, `@Deprecated`, `@SuppressWarnings`
- Custom annotations allow you to create domain-specific markers.

