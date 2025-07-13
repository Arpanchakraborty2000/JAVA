# 👤 Anonymous Inner Class in Java

An **anonymous inner class** is a **class without a name**, defined and instantiated all at once, usually used to **override methods** of a class or interface **on the spot**.

---

## ✅ Syntax & Example

```java
// Interface
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {

        // Anonymous Inner Class implementing Greeting
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        g.sayHello(); // Output: Hello from Anonymous Inner Class!
    }
}

```

## 🔍 Key Points

    Declared and instantiated in a single expression.

    Cannot have constructors (no class name).

    Mostly used with interfaces or abstract classes.