# 📚 Array in Java

In Java, an **array** is a collection of elements (all of the same type) stored in **contiguous memory locations**.  
It allows you to store multiple values in a single variable, instead of declaring separate variables for each value.

---

## ✅ Key Features

- Fixed size (defined when the array is created)
- Zero-based indexing (`arr[0]` is the first element)
- Can hold **primitive types** (e.g., `int`, `char`) or **objects**

---

## ✅ Example: Integer Array

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
```

---

## 🧾 Output

```
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
```
