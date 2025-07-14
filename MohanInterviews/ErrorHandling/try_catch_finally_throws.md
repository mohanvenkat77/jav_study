

```markdown
# ⚠️ Java Exception Handling - Notes

## 🔹 Try Block
- Used to wrap code that might cause an exception.
- Syntax:
  ```java
  try {
      // risky code
  }
  ```
- Must be followed by either a `catch` block or a `finally` block (or both).
- You can’t write a `try` block alone—it needs one of them directly after.

---

## 🔹 Catch Block
- Used to catch and handle exceptions that occur inside the `try` block.
- Syntax:
  ```java
  catch (ExceptionType e) {
      // handle error
  }
  ```
- Multiple catch blocks are allowed, but they must go from specific to general:
  ```java
  catch (FileNotFoundException e) { ... }
  catch (IOException e) { ... }       // Parent of FileNotFoundException
  catch (Exception e) { ... }         // Most general
  ```
- Only one exception is caught at a time—whichever is thrown first.

---

## 🔹 Finally Block
- Contains code that should run no matter what (whether an exception occurs or not).
- Often used for cleanup tasks like closing files, releasing resources, or database connections.
- Syntax:
  ```java
  finally {
      // always executed
  }
  ```
- The `finally` block executes:
  - Even if a `return` statement is hit inside `try` or `catch`
  - Even if no exception occurred
- It does **not execute** if:
  - The JVM exits using `System.exit()`
  - The thread dies abruptly due to a fatal error

---

## 🔹 Throw Keyword
- Used to **manually raise an exception**.
- Often used for custom exceptions or specific logic failures.
- Syntax:
  ```java
  throw new IllegalArgumentException("Invalid input");
  ```
- Can throw both checked and unchecked exceptions.
- Must be followed by an object of type `Throwable` or its subclass.

---

## 🔹 Throws Keyword
- Used in method declaration to indicate that the method might throw an exception.
- Lets the caller know they need to handle (or propagate) the exception.
- Syntax:
  ```java
  public void readFile() throws IOException {
      // code that might throw IOException
  }
  ```
- Useful when:
  - You're not handling exceptions inside the method
  - You want the calling method to decide how to deal with it

---

## 🔹 Sample Code Putting It All Together

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int num = 5 / 0; // Will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This runs regardless of the exception.");
        }

        checkAge(15); // Custom throw
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }
}
```
