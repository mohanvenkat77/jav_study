
In Java, **exceptions** are events that disrupt the normal flow of a program during its execution. They're objects created when an error occurs, allowing developers to handle errors gracefully instead of letting the program crash.

### 🔧 What Is an Exception?
- It’s an object representing an abnormal condition.
- Part of Java’s **Throwable** hierarchy.
- Two main categories: **Checked Exceptions** and **Unchecked Exceptions**.
- Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.
---

## 🧩 Difference Between Checked and Unchecked Exceptions

| Feature                      | Checked Exception                     | Unchecked Exception                   |
|-----------------------------|----------------------------------------|----------------------------------------|
| Compile-Time Requirement     | Must be either caught or declared     | No need to catch or declare           |
| Checked By Compiler          | ✅ Yes                                 | ❌ No                                  |
| Common Examples              | `IOException`, `SQLException`         | `NullPointerException`, `ArithmeticException` |
| Location in Hierarchy        | Subclass of `Exception`               | Subclass of `RuntimeException`        |
| When to Use                 | For recoverable conditions             | For programming errors                 |

---

## 📦 Code Examples

### ✅ Checked Exception Example

```java
import java.io.*;

public class CheckedDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }
    }
}
```

> 💡 `IOException` is a checked exception, so it must be handled with a `try-catch` or declared with `throws`.

---

### ⚠️ Unchecked Exception Example

```java
public class UncheckedDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
    }
}
```