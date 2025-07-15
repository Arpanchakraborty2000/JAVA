
# 📘 What is `BufferedReader` in Java?

`BufferedReader` is a class in Java used to read text from input streams (like keyboard input or files), efficiently and line-by-line.  
It buffers the input for faster performance and is part of the `java.io` package.

---

## ✅ Why Use `BufferedReader`?

- Faster than `Scanner` for large inputs  
- Reads input line-by-line  
- Can read from files, sockets, or console  

---

## 🔧 Syntax

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
```

---

## 🧪 Example: Reading Input from Console

```java
import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();  // Reads one line of text

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());  // Converts string to int

        System.out.println("Hello " + name + ", age: " + age);
    }
}
```

---

## 🧠 Output

```
Enter your name: Arpan
Enter your age: 24
Hello Arpan, age: 24
```

---

## 🎯 Key Methods in `BufferedReader`

| Method       | Description                  |
|--------------|------------------------------|
| `readLine()` | Reads a full line as a string|
| `close()`    | Closes the reader            |

---

## 🚫 Things to Remember

- It throws `IOException` → must be handled or declared with `throws`
- It reads everything as `String`, so use `Integer.parseInt()` etc. to convert types
