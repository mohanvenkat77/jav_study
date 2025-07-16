
```markdown
# Functional Interfaces in Java – Beginner to Pro Guide

## 🧠 What is a Functional Interface?

A **Functional Interface** is an interface that contains **exactly one abstract method**. It can have any number of default or static methods. These interfaces are the foundation for **lambda expressions** and **method references** introduced in Java 8.

### 🔍 Key Characteristics
- **Single Abstract Method (SAM)**: Only one abstract method allowed.
- **Can have default/static methods**: These do not affect its functional nature.
- **Can extend other interfaces**: As long as it doesn’t inherit multiple abstract methods.
- **Can override Object class methods**: These don’t count as abstract methods.

### ✅ Annotation
```java
@FunctionalInterface
public interface MyInterface {
    void execute(); // Only one abstract method
}
```

Using `@FunctionalInterface` is optional but recommended. It helps catch errors at compile time.

---

## 📜 Rules of Functional Interfaces

| Rule | Description |
|------|-------------|
| 1️⃣ | Must have exactly one abstract method |
| 2️⃣ | Can have multiple default or static methods |
| 3️⃣ | Can override methods from `Object` class |
| 4️⃣ | Can extend another functional interface if no extra abstract methods are added |
| 5️⃣ | Use `@FunctionalInterface` to enforce the contract |

---

## 🔧 Built-in Functional Interfaces (Java 8+)

Java provides many predefined functional interfaces in `java.util.function` package:

| Interface | Abstract Method | Description |
|-----------|------------------|-------------|
| `Predicate<T>` | `boolean test(T t)` | Tests a condition |
| `Function<T, R>` | `R apply(T t)` | Transforms input to output |
| `Consumer<T>` | `void accept(T t)` | Performs an action |
| `Supplier<T>` | `T get()` | Supplies a value |
| `UnaryOperator<T>` | `T apply(T t)` | Operates on a single value |
| `BinaryOperator<T>` | `T apply(T t1, T t2)` | Operates on two values |

---

## 💡 Custom Functional Interface Example

```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operate(5, 3)); // Output: Sum: 8
    }
}
```

---

## 🔁 Lambda Expression with Built-in Interfaces

### Predicate Example
```java
Predicate<String> startsWithG = s -> s.startsWith("G");
System.out.println(startsWithG.test("Geeks")); // true
```

### Function Example
```java
Function<Integer, String> intToString = i -> "Number: " + i;
System.out.println(intToString.apply(10)); // Number: 10
```

### Consumer Example
```java
Consumer<String> greet = name -> System.out.println("Hello, " + name);
greet.accept("Mohan"); // Hello, Mohan
```

### Supplier Example
```java
Supplier<Double> randomValue = () -> Math.random();
System.out.println(randomValue.get()); // Random double
```

---

## 🧪 Advanced Functional Interfaces

### BiFunction Example
```java
BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
System.out.println(multiply.apply(4, 5)); // 20
```

### UnaryOperator Example
```java
UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(6)); // 36
```

### BinaryOperator Example
```java
BinaryOperator<String> concat = (a, b) -> a + b;
System.out.println(concat.apply("Hello ", "World")); // Hello World
```

---

## 🧭 Best Practices

- ✅ Always use `@FunctionalInterface` for clarity.
- ✅ Prefer built-in interfaces when possible.
- ✅ Use lambda expressions for concise code.
- ✅ Avoid adding more than one abstract method.
- ✅ Use method references for cleaner syntax.

