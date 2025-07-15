
# ⚠️ Java Exception Hierarchy

## 📊 Java Exception Hierarchy Table

| Level | Class Name                          | Description                          | Type         |
|-------|-------------------------------------|--------------------------------------|--------------|
| 0     | `Throwable`                         | Root class for all errors/exceptions| Base Class   |
| 1     | ├── `Error`                         | Serious problems (JVM-related)       | Unchecked    |
| 1     | └── `Exception`                     | Application-related exceptions       | Checked      |
| 2     |     ├── `IOException`               | Input/output operations failure      | Checked      |
| 2     |     ├── `SQLException`              | DB operations failure                | Checked      |
| 2     |     ├── `ClassNotFoundException`    | Class not found at runtime           | Checked      |
| 2     |     └── `RuntimeException`          | Programming bugs, logic errors       | Unchecked    |
| 3     |         ├── `NullPointerException`          | Accessing null object         | Unchecked    |
| 3     |         ├── `ArithmeticException`           | Divide by zero                | Unchecked    |
| 3     |         ├── `ArrayIndexOutOfBoundsException`| Array limit exceeded          | Unchecked    |
| 3     |         ├── `IllegalArgumentException`      | Invalid method argument       | Unchecked    |
| 3     |         └── `NumberFormatException`         | Invalid number conversion     | Unchecked    |

---

## 🧭 Java Exception Hierarchy Diagram (Text View)

```
java.lang
  └── Throwable
       ├── Error (unchecked)
       │    ├── OutOfMemoryError
       │    └── StackOverflowError
       └── Exception (checked)
            ├── IOException
            │    └── FileNotFoundException
            ├── SQLException
            ├── ClassNotFoundException
            └── RuntimeException (unchecked)
                 ├── NullPointerException
                 ├── ArithmeticException
                 ├── ArrayIndexOutOfBoundsException
                 ├── IllegalArgumentException
                 └── NumberFormatException
```

---

## ✅ Notes

- **Checked Exceptions** (must be declared or handled): `IOException`, `SQLException`, etc.
- **Unchecked Exceptions** (Runtime): `NullPointerException`, `ArithmeticException`, etc.
- **Errors** are usually not meant to be caught (JVM related issues).
