
# 🧵 Runnable in Java

## What is `Runnable`?

- `Runnable` is a functional interface in Java (has only one abstract method: `run()`).
- It's used to define the code that a thread will execute.
- You implement `Runnable` when you want to run code in parallel but still inherit from another class.

---

## ✅ Syntax and Basic Example

```java
class MyTask implements Runnable {
    public void run() {
        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        thread.start();
    }
}
```

### Output:
```
Task is running in thread: Thread-0
```

---

## 📌 Why Use Runnable?

- Java allows only single inheritance, so if your class already extends another class, you can’t extend `Thread`.
- `Runnable` allows for better design by using **composition** instead of inheritance.

---

## 🚀 Real-World Example: Email Notification

```java
class EmailSender implements Runnable {
    private String email;

    public EmailSender(String email) {
        this.email = email;
    }

    public void run() {
        System.out.println("Sending email to: " + email);
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Email sent to: " + email);
    }
}

public class NotificationService {
    public static void main(String[] args) {
        Thread emailThread = new Thread(new EmailSender("user@example.com"));
        emailThread.start();

        System.out.println("Main thread continues working...");
    }
}
```

### Output:
```
Sending email to: user@example.com
Main thread continues working...
Email sent to: user@example.com
```

---

## 🧠 Key Points

- `Runnable` promotes clean design by separating the task (logic) from the thread (execution).
- Reusable: You can use the same `Runnable` object in multiple threads.
- Lightweight and memory-efficient compared to extending `Thread`.

---

## ✅ Best Practice

> Prefer `Runnable` over extending `Thread` when creating multithreaded applications in Java.
