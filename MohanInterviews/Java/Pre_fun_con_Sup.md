
# 📘 Java Predicate – Complete Guide for Developers

## 🔍 What is a Predicate?

A **Predicate** is a functional interface in Java that represents a **boolean-valued function** of one argument. It’s part of the `java.util.function` package and is commonly used for filtering data, validating inputs, and applying conditional logic.

```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```

---

## 🧠 Key Concepts

- **Functional Interface**: Only one abstract method (`test`)
- **Lambda-friendly**: Ideal for use with lambda expressions
- **Stream API Integration**: Used with `.filter()` for collections
- **Composable**: Can be chained using `and()`, `or()`, and `negate()`

---

## 🧪 Predicate Methods Explained

| Method | Description | Example |
|--------|-------------|---------|
| `test(T t)` | Evaluates the predicate | `p.test("Java")` returns `true` if condition matches |
| `and(Predicate other)` | Combines two predicates with logical AND | `p1.and(p2)` |
| `or(Predicate other)` | Combines two predicates with logical OR | `p1.or(p2)` |
| `negate()` | Returns logical NOT of predicate | `p.negate()` |
| `isEqual(Object targetRef)` | Static method to check equality | `Predicate.isEqual("Java").test("Java")` → `true` |

---

## 🔧 Basic Examples

### ✅ Simple Predicate
```java
Predicate<Integer> isAdult = age -> age >= 18;
System.out.println(isAdult.test(20)); // true
```

### ✅ Using with Streams
```java
List<String> names = List.of("Mohan", "Ravi", "Raj");
Predicate<String> startsWithR = name -> name.startsWith("R");
names.stream().filter(startsWithR).forEach(System.out::println);
// Output: Ravi, Raj
```

---

## 🔗 Predicate Chaining

### 🔄 `and()` Example
```java
Predicate<String> notEmpty = s -> !s.isEmpty();
Predicate<String> longEnough = s -> s.length() > 5;
Predicate<String> valid = notEmpty.and(longEnough);
System.out.println(valid.test("HelloWorld")); // true
```

### 🔄 `or()` Example
```java
Predicate<String> isEmpty = String::isEmpty;
Predicate<String> hasLength5 = s -> s.length() == 5;
Predicate<String> either = isEmpty.or(hasLength5);
System.out.println(either.test("Hello")); // true
```

### 🔄 `negate()` Example
```java
Predicate<String> isEmpty = String::isEmpty;
Predicate<String> isNotEmpty = isEmpty.negate();
System.out.println(isNotEmpty.test("Java")); // true
```

---

## 🧩 Advanced Use Cases

### 🎯 Filtering Custom Objects
```java
class User {
    String name;
    String role;
    User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}

List<User> users = List.of(
    new User("Mohan", "admin"),
    new User("Ravi", "user")
);

Predicate<User> isAdmin = u -> u.role.equals("admin");
List<User> admins = users.stream().filter(isAdmin).collect(Collectors.toList());
```

### 🧠 Using `isEqual()`
```java
Predicate<String> isJava = Predicate.isEqual("Java");
System.out.println(isJava.test("Java")); // true
System.out.println(isJava.test("Python")); // false
```

---

## 🧼 Best Practices

- ✅ Use descriptive names: `isAdult`, `startsWithA`
- ✅ Chain predicates for complex logic
- ✅ Avoid nulls or handle them explicitly
- ✅ Use method references where possible: `Objects::nonNull`
- ✅ Centralize reusable predicates in utility classes

---

## 🧭 Summary

The `Predicate<T>` interface is a powerful tool for writing clean, expressive, and functional-style Java code. It’s especially useful in stream operations, filtering, and validation logic.

Mastering predicates will help you:
- Write concise and readable code
- Apply functional programming principles
- Build reusable and testable logic

Happy coding, Mohan! 🚀

## 📘 1. Function<T, R>

### 🔍 Definition
Represents a function that takes one input and returns a result.

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
```

---

### 🧪 Methods

| Method | Description | Example |
|--------|-------------|---------|
| `apply(T t)` | Applies the function to input | `f.apply("Java")` |
| `andThen(Function after)` | Chains another function after | `f.andThen(g)` |
| `compose(Function before)` | Chains another function before | `f.compose(g)` |
| `identity()` | Returns input unchanged | `Function.identity()` |

---

### 🔧 Examples

#### ✅ Basic Transformation
```java
Function<String, Integer> length = s -> s.length();
System.out.println(length.apply("Mohan")); // 5
```

#### 🔗 Chaining with `andThen`
```java
Function<String, String> toUpper = s -> s.toUpperCase();
Function<String, Integer> length = s -> s.length();
Function<String, Integer> result = toUpper.andThen(length);
System.out.println(result.apply("java")); // 4
```

#### 🔗 Chaining with `compose`
```java
Function<String, String> trim = s -> s.trim();
Function<String, String> toUpper = s -> s.toUpperCase();
Function<String, String> composed = toUpper.compose(trim);
System.out.println(composed.apply("  hello  ")); // HELLO
```

#### 🧠 Real-World Mapping
```java
class UserDTO {
    String name;
    int age;
    UserDTO(String name, int age) { this.name = name; this.age = age; }
}
class User {
    String fullName;
    int age;
    User(String fullName, int age) { this.fullName = fullName; this.age = age; }
}

Function<UserDTO, User> mapper = dto -> new User(dto.name, dto.age);
User user = mapper.apply(new UserDTO("Mohan", 28));
System.out.println(user.fullName); // Mohan
```

---

## 📘 2. Consumer<T>

### 🔍 Definition
Represents an operation that takes a single input and returns no result.

```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

---

### 🧪 Methods

| Method | Description | Example |
|--------|-------------|---------|
| `accept(T t)` | Performs action on input | `c.accept("Hello")` |
| `andThen(Consumer after)` | Chains another consumer | `c1.andThen(c2)` |

---

### 🔧 Examples

#### ✅ Basic Printing
```java
Consumer<String> printer = s -> System.out.println(s);
printer.accept("Hello, Mohan!");
```

#### 🔗 Chaining with `andThen`
```java
Consumer<String> print = s -> System.out.println("Print: " + s);
Consumer<String> upper = s -> System.out.println("Upper: " + s.toUpperCase());
print.andThen(upper).accept("java");
// Print: java
// Upper: JAVA
```

#### 🧠 List Processing
```java
List<String> names = List.of("Mohan", "Ravi", "Raj");
Consumer<String> process = name -> System.out.println("Processing: " + name);
names.forEach(process);
```

#### 🧩 Object Modification
```java
class User {
    String name;
    boolean active = false;
    void activate() { active = true; }
}

User u = new User();
Consumer<User> activateUser = user -> user.activate();
activateUser.accept(u);
```

---

## 📘 3. BiPredicate<T, U>

### 🔍 Definition
Represents a predicate (boolean-valued function) with two arguments.

```java
@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
```

---

### 🧪 Methods

| Method | Description | Example |
|--------|-------------|---------|
| `test(T t, U u)` | Evaluates condition | `bp.test("Mohan", "Mohan")` |
| `and(BiPredicate other)` | Combines with AND | `bp1.and(bp2)` |
| `or(BiPredicate other)` | Combines with OR | `bp1.or(bp2)` |
| `negate()` | Negates condition | `bp.negate()` |

---

### 🔧 Examples

#### ✅ Equality Check
```java
BiPredicate<String, String> areEqual = (a, b) -> a.equals(b);
System.out.println(areEqual.test("Java", "Java")); // true
```

#### 🔗 Chaining with `and()`
```java
BiPredicate<Integer, Integer> isPositive = (a, b) -> a > 0 && b > 0;
BiPredicate<Integer, Integer> isEven = (a, b) -> a % 2 == 0 && b % 2 == 0;
System.out.println(isPositive.and(isEven).test(4, 6)); // true
```

#### 🔗 Chaining with `or()`
```java
BiPredicate<String, String> contains = (a, b) -> a.contains(b);
BiPredicate<String, String> startsWith = (a, b) -> a.startsWith(b);
System.out.println(contains.or(startsWith).test("Mohan", "Mo")); // true
```

#### 🔄 Negate
```java
BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);
System.out.println(isEqual.negate().test(5, 6)); // true
```

#### 🧠 Real-World: Credential Check
```java
BiPredicate<String, String> validate = (u, p) -> u.equals("admin") && p.equals("1234");
System.out.println(validate.test("admin", "1234")); // true
```

---

## 🧭 Summary

| Interface | Input | Output | Use Case |
|-----------|-------|--------|----------|
| `Function<T, R>` | 1 input | 1 output | Transformations |
| `Consumer<T>` | 1 input | No output | Side-effects |
| `BiPredicate<T, U>` | 2 inputs | Boolean | Conditional checks |

Mastering these interfaces will elevate your Java skills and make your code more modular, expressive, and functional.

```