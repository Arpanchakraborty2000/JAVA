
# 🧵 Thread Priority and 😴 Sleep in Java

## Thread Priority in Java

In Java, every thread has a priority. The priority ranges between:
- `Thread.MIN_PRIORITY` = 1
- `Thread.NORM_PRIORITY` = 5 (Default)
- `Thread.MAX_PRIORITY` = 10

Thread priority helps the thread scheduler decide the order of execution, but **it is not guaranteed**. It's up to the JVM and OS thread scheduler.

### Syntax:
```java
Thread t1 = new Thread();
t1.setPriority(Thread.MAX_PRIORITY);  // 10
```

---

## `sleep()` Method in Java

The `sleep()` method pauses the execution of the **currently executing thread** for a specified time in milliseconds.

### Syntax:
```java
Thread.sleep(1000); // sleeps for 1 second
```

> It throws `InterruptedException`, so it must be enclosed in a try-catch block.

---

## Example: Thread Priority and Sleep

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(this.getName() + " - Priority: " + this.getPriority() + " - Count: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.setName("LowPriorityThread");
        t2.setName("MediumPriorityThread");
        t3.setName("HighPriorityThread");

        t1.start();
        t2.start();
        t3.start();
    }
}
```

### Output Explanation:

- Each thread prints a line 5 times.
- It sleeps for 500ms between each line.
- You might notice `HighPriorityThread` runs more frequently, but it's not guaranteed due to JVM thread scheduling.

---

## Summary

- Use `setPriority()` to suggest execution importance.
- Use `sleep()` to pause thread execution.
- Thread scheduling is OS/JVM dependent — do **not rely solely** on priority for timing or synchronization.
