# 🔢 What is `enum` in Java?

In Java, `enum` (short for **enumeration**) is a special data type that enables a variable to be a set of **predefined constants**. It’s commonly used when a variable (like days, colors, status, etc.) can only take one out of a **limited set of values**.

---

## ✅ Key Features of `enum`:

- Enums are **type-safe**.
- Enums can have **fields, constructors, and methods**.
- Enums **extend** `java.lang.Enum` and **cannot extend** other classes (but can implement interfaces).

---

## 🧪 Example: Enum for Days of the Week

```java
// File: EnumExample.java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
        }
    }
}
```

---

### 📌 Output:

```
It's weekend!
```

---

## 🧠 Bonus: Enum with Fields and Constructor

```java
enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int priority;

    Level(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println("Level: " + level);
        System.out.println("Priority: " + level.getPriority());
    }
}
```
