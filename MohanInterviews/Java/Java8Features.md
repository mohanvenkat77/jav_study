Sure, Mohan! Here's a detailed `.md` file that covers **all major Java 8 features**, complete with descriptions, examples, and interview-ready insights:

---

```markdown
# 🚀 Java 8 Features: Complete Guide

Java 8 was released on **March 18, 2014**, and introduced powerful enhancements to the language, libraries, and runtime. It marked a shift toward **functional programming** and **stream-based data processing**.

---

## 🔹 1. Lambda Expressions

### 📌 Description
Lambda expressions provide a concise way to represent anonymous functions. They enable functional-style programming and simplify code for interfaces with a single abstract method.

### ✅ Syntax
```java
(parameter) -> expression
(x, y) -> x + y
```

### 🧠 Example
```java
List<String> names = Arrays.asList("Mohan", "Raj", "Kiran");
names.forEach(name -> System.out.println(name));
```

---

## 🔹 2. Functional Interfaces

### 📌 Description
An interface with a **single abstract method** is called a functional interface. Java 8 introduced several built-in ones in `java.util.function`.

### ✅ Examples
- `Runnable`
- `Predicate<T>`
- `Function<T, R>`
- `Consumer<T>`
- `Supplier<T>`

### 🧠 Custom Example
```java
@FunctionalInterface
interface MyFunc {
    void execute();
}
```

---

## 🔹 3. Method References

### 📌 Description
Method references are shorthand for calling methods via lambda expressions.

### ✅ Syntax
- `ClassName::staticMethod`
- `object::instanceMethod`
- `ClassName::instanceMethod`
- `ClassName::new` (constructor reference)

### 🧠 Example
```java
names.forEach(System.out::println);
```

---

## 🔹 4. Stream API

### 📌 Description
Stream API enables functional-style operations on collections, such as filtering, mapping, and reducing.

### ✅ Example
```java
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
```

### 🧠 Key Methods
- `filter()`
- `map()`
- `reduce()`
- `collect()`
- `sorted()`
- `distinct()`
- `limit()`

---

## 🔹 5. Default and Static Methods in Interfaces

### 📌 Description
Interfaces can now have **default** and **static** methods with implementations.

### ✅ Example
```java
interface Vehicle {
    default void start() {
        System.out.println("Starting...");
    }

    static void info() {
        System.out.println("Vehicle interface");
    }
}
```

---

## 🔹 6. Optional Class

### 📌 Description
`Optional<T>` is a container object to avoid `NullPointerException`.

### ✅ Example
```java
Optional<String> name = Optional.ofNullable(null);
System.out.println(name.orElse("Default"));
```

---

## 🔹 7. New Date and Time API

### 📌 Description
Java 8 introduced a modern, immutable, and thread-safe date/time API in `java.time`.

### ✅ Key Classes
- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `ZonedDateTime`
- `Period`, `Duration`
- `DateTimeFormatter`

### 🧠 Example
```java
LocalDate today = LocalDate.now();
LocalDate future = today.plusDays(5);
```

---

## 🔹 8. Nashorn JavaScript Engine

### 📌 Description
Java 8 introduced **Nashorn**, a lightweight JavaScript engine for executing JS code on the JVM.

### ✅ Example
```java
ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
engine.eval("print('Hello from JS')");
```

---

## 🔹 9. Base64 Encoding and Decoding

### 📌 Description
Java 8 added built-in support for Base64 encoding/decoding in `java.util.Base64`.

### ✅ Example
```java
String encoded = Base64.getEncoder().encodeToString("Mohan".getBytes());
```

---

## 🔹 10. Type and Repeating Annotations

### 📌 Description
Java 8 allows annotations on types and supports repeating annotations.

### ✅ Example
```java
@Schedule(day = "Monday")
@Schedule(day = "Tuesday")
public class Meeting {}
```

---

## 🔹 11. Parallel Array Sorting

### 📌 Description
Java 8 introduced `Arrays.parallelSort()` for faster sorting using multiple threads.

### ✅ Example
```java
int[] arr = {5, 3, 8, 1};
Arrays.parallelSort(arr);
```

---

## 🔹 12. Concurrency Enhancements

### 📌 Description
New classes like `CompletableFuture` simplify asynchronous programming.

### ✅ Example
```java
CompletableFuture.supplyAsync(() -> "Hello")
                 .thenApply(str -> str + " World")
                 .thenAccept(System.out::println);
```

---

## 🔹 13. Collection API Improvements

### 📌 Description
New methods added to collections:
- `removeIf()`
- `forEach()`
- `replaceAll()`
- `stream()`
- `parallelStream()`

---

## 🧠 Interview Tips

- Be ready to explain **functional programming** concepts.
- Know how **streams** differ from traditional loops.
- Understand **Optional** and how it avoids null checks.
- Practice writing **lambda expressions** and using **method references**.

Absolutely, Mohan! Here's a comprehensive `.md` file that dives deep into **Java Lambda Expressions**, complete with syntax, examples, use cases, limitations, and success/failure scenarios — perfect for interview prep and practical mastery:

---

# 🔥 Java Lambda Expressions: In-Depth Notes

## 📌 What Are Lambda Expressions?

Lambda expressions are **anonymous functions** introduced in **Java 8**. They allow you to treat functionality as a method argument or pass behavior as data — enabling **functional programming** in Java.

### ✅ Syntax
```java
(parameters) -> expression
(parameters) -> { statements }
```

---

## 🧠 Key Components

- **Parameter List**: Inputs to the lambda
- **Arrow Token (`->`)**: Separates parameters from body
- **Body**: Logic to execute (single expression or block)

---

## 🧪 Code Examples

### 🔹 No Parameter
```java
Runnable r = () -> System.out.println("Running...");
```

### 🔹 Single Parameter
```java
Consumer<String> printer = s -> System.out.println(s);
```

### 🔹 Multiple Parameters
```java
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
```

### 🔹 Block Body with Return
```java
BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
    int result = a * b;
    return result;
};
```

---

## 🧩 Functional Interfaces

Lambda expressions work only with **functional interfaces** — interfaces with **one abstract method**.

### 🔹 Common Built-in Interfaces
| Interface     | Purpose                          |
|---------------|----------------------------------|
| `Runnable`    | No input, no output              |
| `Consumer<T>` | Takes input, returns nothing     |
| `Supplier<T>` | No input, returns output         |
| `Function<T,R>`| Input → Output transformation   |
| `Predicate<T>`| Returns boolean                  |

---

## ✅ Success Scenarios: Where Lambdas Shine

### 1. **Collection Processing**
```java
List<String> names = Arrays.asList("Mohan", "Raj", "Kiran");
names.stream().filter(n -> n.startsWith("M")).forEach(System.out::println);
```

### 2. **Event Handling**
```java
button.addActionListener(e -> System.out.println("Clicked!"));
```

### 3. **Thread Creation**
```java
new Thread(() -> System.out.println("Thread running")).start();
```

### 4. **Sorting with Comparator**
```java
list.sort((a, b) -> a.compareToIgnoreCase(b));
```

---

## ❌ Failure Scenarios: Where Lambdas Fall Short

### 1. **Multiple Abstract Methods**
```java
interface NotFunctional {
    void method1();
    void method2();
}
// ❌ Cannot use lambda — not a functional interface
```

### 2. **Need for State or Fields**
```java
// Lambdas can't have instance variables
// Use anonymous class instead if state is needed
```

### 3. **Checked Exceptions**
```java
Function<String, String> readFile = path -> {
    // ❌ Can't throw checked exceptions directly
    // Must handle or wrap them
};
```

### 4. **Complex Logic**
```java
// Avoid lambdas with too many lines — hurts readability
```

---

## ⚠️ Common Pitfalls

- **Modifying captured variables**: Only final or effectively final variables can be used.
- **Overusing lambdas**: Use them for concise logic, not complex workflows.
- **Misunderstanding scope**: `this` refers to enclosing class, not lambda itself.

---

## 🧠 Interview Tips

- Explain **functional interface** requirement.
- Show how lambdas improve **readability and conciseness**.
- Discuss **type inference** and **target typing**.
- Compare lambdas vs **anonymous classes**.
- Know how lambdas integrate with **Stream API**.

---

## 🧪 Practice Challenge

Implement a calculator using lambdas:
```java
@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

Operation add = (a, b) -> a + b;
Operation subtract = (a, b) -> a - b;
Operation multiply = (a, b) -> a * b;
Operation divide = (a, b) -> b != 0 ? a / b : 0;

System.out.println(add.apply(5, 3)); // 8
```

---

```

Would you like me to follow this up with a `.md` file on **method references**, **stream pipelines**, or **real-world lambda design patterns**? You're building a Java arsenal that’s interview-proof and production-ready! 💪📘