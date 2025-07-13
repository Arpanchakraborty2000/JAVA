
# Object Class: `equals()`, `toString()`, and `hashCode()` in Java

In Java, the `Object` class provides several important methods that can be overridden to customize the behavior of your classes. The most commonly used and overridden ones are:

---

## 🔹 `equals()` Method

Used to compare two objects for **logical equality**.

### ✅ Default Implementation (from `Object`)
```java
public boolean equals(Object obj) {
    return (this == obj);
}
```

This checks **reference equality**, i.e., whether both references point to the same object.

### ✅ Custom Override Example
```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person person = (Person) obj;
    return age == person.age && name.equals(person.name);
}
```

---

## 🔹 `toString()` Method

Returns a string representation of the object.

### ✅ Default Implementation
```java
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

**Example output:**
```
Person@1a2b3c
```

### ✅ Custom Override Example
```java
@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}
```

---

## 🔹 `hashCode()` Method

Returns an integer hash code value for the object. It's essential for hash-based collections like `HashMap` and `HashSet`.

### ✅ Default Behavior

By default, it's typically derived from the memory address of the object.

### ✅ Custom Override Example (must align with `equals()`)
```java
@Override
public int hashCode() {
    return Objects.hash(name, age);
}
```

---

## 🔁 Contract Between `equals()` and `hashCode()`

- If two objects are equal (`equals()` returns `true`), they **must** have the same `hashCode()`.
- If two objects have the same `hashCode()`, they **might not** be equal.

---

## 🔸 Full Example

```java
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
```

---

✅ These methods are crucial when working with Java collections and ensuring correct object comparison and behavior. Always override `equals()` and `hashCode()` together.
