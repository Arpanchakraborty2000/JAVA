# 🔄 Method Overloading in Java

**Method Overloading** in Java means defining multiple methods with the same name in the same class but with **different parameters** (type, number, or order).  
It's a type of **compile-time polymorphism**.

---

## ✅ Key Points

- Method name must be the **same**.
- Parameter list must be **different** (type, number, or order).
- Return type can be same or different, but **cannot distinguish overloads by return type alone**.

---

## ✅ Example

```java
public class OverloadExample {

    // Method with 1 int parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Method with 2 int parameters
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }

    // Method with 1 String parameter
    public void display(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(5);
        obj.display(10, 20);
        obj.display("Hello");
    }
}



#🧾 Output

Argument: 5
Arguments: 10, 20
Message: Hello