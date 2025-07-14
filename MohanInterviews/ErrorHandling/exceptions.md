
```markdown
# 🚨 Exception Declaration and Method Overriding Rules in Java

## 🎯 Which Exceptions Should Be Declared?

In Java, only **checked exceptions** need to be declared using the `throws` clause.

### ✅ Checked Exception
- Must be handled or declared.
- Represents recoverable situations (e.g., `IOException`, `SQLException`).

### ❌ Unchecked Exception
- Under your control — fix your code!
- Don’t need to be declared.
- Includes `NullPointerException`, `ArithmeticException`.

### 💣 Errors
- Beyond your control (e.g., `VirtualMachineError`, `StackOverflowError`).
- Should not be caught or declared.

---

## 🧭 Advantages of `throws` Keyword

- ✔ Allows **propagation** of checked exceptions up the call stack.
- ✔ Provides information to the caller about potential exceptions.
- ✔ Enables cleaner code by deferring exception handling responsibility.

### 🔍 Example
```java
public void readFile() throws IOException {
    FileReader fr = new FileReader("data.txt");
    // May throw IOException
}
```

---

## 🔁 Method Overriding and Exception Rules

### 📌 Case 1: Superclass Method Does NOT Declare Exception

- Subclass **cannot** declare checked exceptions.
- Subclass **can** declare unchecked exceptions.

#### Example
```java
class SuperClass {
    void show() {
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {
    // Valid: unchecked exception
    void show() throws ArithmeticException {
        System.out.println("SubClass");
    }
    
    // Invalid: checked exception like IOException
    // void show() throws IOException { } // ❌ Compile-time error
}
```

---

### 📌 Case 2: Superclass Method Declares Exception

- Subclass can:
  - Declare **same exception**
  - Declare **subclass of exception**
  - Declare **no exception**
- Subclass **cannot** declare parent or broader exception.

#### Example
```java
class SuperClass {
    void display() throws IOException {
        System.out.println("SuperClass");
    }
}

class SubClass extends SuperClass {
    // Valid: same exception
    void display() throws IOException {
        System.out.println("SubClass");
    }

    // Valid: subclass exception
    void display() throws FileNotFoundException {
        System.out.println("SubClass");
    }

    // Valid: no exception
    void display() {
        System.out.println("SubClass");
    }

    // Invalid: parent exception
    // void display() throws Exception { } // ❌ Compile-time error
}
```

---

## ✨ Pro Tips

- Always favor **specific exception types** to aid debugging and clarity.
- Use `throws` for **library methods** or when exception handling logic doesn’t belong inside the method.
- Avoid throwing `Error` unless you have a very unusual reason — they signal system-level problems.

---

```
