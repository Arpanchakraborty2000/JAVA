
# 🔐 What is `finally` in Java?

The `finally` block in Java is used to **execute important code** such as closing resources,  
regardless of whether an exception occurs or not. It **always runs** after the `try` and `catch` blocks,  
even if an exception is thrown or a `return` statement is hit.

---

## ✅ Syntax:

```java
try {
    // Code that may throw exception
} catch (ExceptionType e) {
    // Exception handling code
} finally {
    // Code that always runs
}
```

---

## 🧪 Example 1: Using `finally` with Exception

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("This block always runs (finally).");
        }
    }
}
```

### 🔹 Output:

```
Caught an exception: java.lang.ArithmeticException: / by zero
This block always runs (finally).
```

---

## 🧪 Example 2: No Exception Thrown

```java
public class FinallyExample2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```

### 🔹 Output:

```
Result: 5
Finally block executed.
```

---

## 🧠 Why Use `finally`?

- To close resources like files, DB connections, sockets  
- To guarantee cleanup code runs no matter what  
- Ensures reliability in programs  

---

## ⚠️ Notes:

- If the JVM shuts down forcefully (`System.exit(0)`), `finally` **won’t execute**  
- `finally` executes even if `return` is used in `try` or `catch`
