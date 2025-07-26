# 🔁 `break` and `continue` in Java

In Java, `break` and `continue` are **loop control statements** that change the flow of loops like `for`, `while`, and `do-while`.

---

## 🔴 `break` Statement

- **Usage**: Exits the loop **immediately**, skipping the rest of the loop.
- Often used when a condition is met and no further iteration is needed.

### ✅ Example:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;  // loop stops when i is 3
    }
    System.out.println(i);
}
```

### 🧾 Output:
```
1
2
```

---

## 🟡 `continue` Statement

- **Usage**: Skips the **current iteration** and jumps to the next one.
- Useful when you want to **ignore certain values** but keep looping.

### ✅ Example:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // skip the current iteration when i is 3
    }
    System.out.println(i);
}
```

### 🧾 Output:
```
1
2
4
5
```
