
# 🚀 Use of `throw` Keyword in Java

The `throw` keyword in Java is used to **manually throw an exception** (either built-in or custom).  
It is typically used to indicate that something has gone wrong in your program logic.

---

## ✅ Syntax:

```java
throw new ExceptionType("Error Message");
```

> 💡 Only objects of classes that extend `Throwable` can be thrown (e.g., `Exception`, `Error`, or their subclasses).

---

## 🧪 Example: Throwing a Built-in Exception

```java
public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
```

### 🔹 Output:

```
Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
```

---

## 🎯 When to Use `throw`?

- Validation checks (e.g., input data)  
- Custom business logic failures  
- Custom exceptions  

---

## 🛠️ Example: Using `throw` with a Custom Exception

```java
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomThrowExample {
    public static void main(String[] args) throws MyCustomException {
        String data = null;

        if (data == null) {
            throw new MyCustomException("Data cannot be null!");
        }
    }
}
```

---

## ✅ Summary:

| Concept     | Details                                 |
|-------------|-----------------------------------------|
| Purpose     | To throw an exception explicitly        |
| Used With   | Objects of `Throwable` subclasses       |
| Common Use  | Input validation, custom exception throwing |
| Syntax      | `throw new ExceptionType("message");`   |
