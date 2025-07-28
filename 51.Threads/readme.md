
# 🧵 Threads in Java

## ✅ What is a Thread?
In **Java**, a **thread** is a lightweight subprocess — it's the **smallest unit of execution**. Threads allow Java programs to perform **multiple tasks concurrently**, improving efficiency especially in programs that involve **I/O operations**, **networking**, or **long computations**.

---

## 🔧 Key Concepts

- **Multithreading**: Running two or more threads concurrently.
- **Main thread**: When a Java program starts, one thread runs by default — this is the **main thread**.
- **Thread Lifecycle**:
  - New
  - Runnable
  - Running
  - Waiting
  - Terminated

---

## ✅ Why Use Threads?

- Perform background tasks (e.g., file downloading, animations).
- Improve performance and responsiveness.
- Utilize multi-core CPUs efficiently.

---

## ✨ Ways to Create Threads

### ✅ 1. Extending the Thread class
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread
    }
}
```

### ✅ 2. Implementing the Runnable interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();
    }
}
```

### ✅ 3. Using Lambda (Java 8+)
```java
public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread using lambda is running...");
        });
        t.start();
    }
}
```

---

## ⏳ Common Thread Methods

| Method           | Description                         |
|------------------|-------------------------------------|
| `start()`        | Starts the thread                   |
| `run()`          | Code that runs in the thread        |
| `sleep(ms)`      | Pauses thread for given time        |
| `join()`         | Waits for a thread to die           |
| `isAlive()`      | Checks if thread is still running   |
| `setPriority()`  | Sets priority (1 to 10)             |

---

## 🔄 Example: Running Two Threads

```java
class Task1 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Task1 - Count: " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Task2 - Count: " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        t1.start();
        t2.start();
    }
}
```

---

## 🧠 Summary

- Threads = concurrent execution of code.
- Java supports threads via `Thread` class and `Runnable` interface.
- Use `start()` to begin a thread (never call `run()` directly).
- Helps improve responsiveness and performance in applications.
