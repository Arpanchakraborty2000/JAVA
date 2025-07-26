# 🔄 Switch Statement in Java

## ✅ What is a `switch` Statement?

In Java, the `switch` statement is used to execute one block of code among many options based on the value of an expression. It is often used as a cleaner alternative to multiple `if-else-if` statements.

---

### ✅ Syntax

```java
switch (expression) {
    case value1:
        // Code to execute if expression == value1
        break;
    case value2:
        // Code to execute if expression == value2
        break;
    // ... more cases ...
    default:
        // Code to execute if no case matches
}

```

---

### ⚠️ Key Points
* The break statement exits the switch block. If omitted, execution continues to the next case (fall-through).

* The default block is optional but recommended.

---
```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day: " + dayName);
    }
}
```
---
## 🖨️ Output:
```java
Day: Wednesday

```