
```markdown
# 📌 Exception Propagation in Java

## 🔥 What is Exception Propagation?
Exception propagation refers to the mechanism where an exception moves up the method call stack until it is caught or reaches the JVM. If not handled in the current method, the exception is passed to the calling method, and so on.

---

## ⚠️ Checked vs Unchecked Exceptions

| Type               | Propagation Behavior                      | Requires Handling | Examples               |
|--------------------|-------------------------------------------|-------------------|------------------------|
| Checked Exception  | **Not propagated automatically**          | ✅ Yes            | `IOException`, `SQLException` |
| Unchecked Exception| **Propagated by default**                 | ❌ No             | `NullPointerException`, `ArithmeticException` |

---

## ✅ Example: Unchecked Exception Propagation

```java
public class UncheckedDemo {
    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        int result = 10 / 0; // Throws ArithmeticException
    }

    public static void main(String[] args) {
        methodA(); // Exception propagates here
    }
}
```

🧠 **Explanation**:
- `ArithmeticException` is an unchecked exception.
- It’s thrown in `methodC()` but not caught there.
- It propagates to `methodB()`, then `methodA()`, and finally `main()`.

---

## 🚫 Example: Checked Exception (Compile-Time Error without Handling)

```java
import java.io.*;

public class CheckedDemo {
    public static void methodA() throws IOException {
        methodB();
    }

    public static void methodB() throws IOException {
        methodC();
    }

    public static void methodC() throws IOException {
        FileReader file = new FileReader("nonexistent.txt"); // May throw IOException
    }

    public static void main(String[] args) {
        methodA(); // Compile-time error if not handled or declared
    }
}
```

🧠 **Explanation**:
- `IOException` is a checked exception.
- You **must** declare `throws` in the method signature **or** use `try-catch` to handle it.
- Otherwise, you'll get a **compile-time error**.

---

## 🔁 Alternative: Handling Exceptions

```java
public static void main(String[] args) {
    try {
        methodA();
    } catch (IOException e) {
        System.out.println("Caught IOException in main");
    }
}
```
