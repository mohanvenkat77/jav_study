Absolutely, Mohan! Here's a complete `.md` guide on **`CompletableFuture` in Java 8**, covering its purpose, core methods, chaining, exception handling, combining futures, and debug-driven examples — all tailored for interview prep and deep understanding.

---

```md
# 🚀 Java 8 `CompletableFuture` – Full Guide with Examples & Debug Output

---

## 🔍 What Is `CompletableFuture`?

`CompletableFuture<T>` is a class in `java.util.concurrent` that represents a **future result of an asynchronous computation**. It:
- Implements both `Future<T>` and `CompletionStage<T>`
- Supports **non-blocking**, **event-driven**, and **composable** async programming
- Enables chaining, combining, and exception handling of async tasks

---

## 📦 Key Interfaces

| Interface         | Purpose                                      |
|-------------------|----------------------------------------------|
| `Future<T>`       | Represents a pending result                  |
| `CompletionStage<T>` | Allows chaining and combining async stages |

---

## 🧱 Creating a `CompletableFuture`

### ✅ Using `supplyAsync()` – Returns a value
```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Running async task"); // DEBUG
    return "Hello";
});
System.out.println("Result: " + future.get()); // DEBUG: Hello
```

### ✅ Using `runAsync()` – No return value
```java
CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
    System.out.println("Running async task"); // DEBUG
});
future.get(); // Waits for completion
```

---

## 🔗 Chaining Methods

### 🔧 `thenApply()` – Transform result
```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Java")
    .thenApply(s -> s + " Rocks");
System.out.println(future.get()); // DEBUG: Java Rocks
```

### 🔧 `thenAccept()` – Consume result
```java
CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Java")
    .thenAccept(s -> System.out.println("Received: " + s)); // DEBUG
future.get();
```

### 🔧 `thenRun()` – Run task after completion
```java
CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Java")
    .thenRun(() -> System.out.println("Task finished")); // DEBUG
future.get();
```

---

## 🔁 Combining Futures

### 🔧 `thenCombine()` – Combine two results
```java
CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "World");

CompletableFuture<String> combined = f1.thenCombine(f2, (a, b) -> a + " " + b);
System.out.println(combined.get()); // DEBUG: Hello World
```

### 🔧 `thenCompose()` – Flatten nested futures
```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Java")
    .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " 8"));
System.out.println(future.get()); // DEBUG: Java 8
```

---

## 🧠 Handling Multiple Futures

### 🔧 `allOf()` – Wait for all
```java
CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "A");
CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "B");

CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2);
all.join(); // Waits for both

System.out.println("f1: " + f1.get()); // DEBUG: A
System.out.println("f2: " + f2.get()); // DEBUG: B
```

### 🔧 `anyOf()` – Wait for first
```java
CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "A");
CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "B");

CompletableFuture<Object> any = CompletableFuture.anyOf(f1, f2);
System.out.println("First completed: " + any.get()); // DEBUG: A or B
```

---

## ⚠️ Exception Handling

### 🔧 `exceptionally()` – Provide fallback
```java
CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10 / 0)
    .exceptionally(ex -> {
        System.out.println("Exception: " + ex); // DEBUG
        return 0;
    });
System.out.println("Result: " + future.get()); // DEBUG: 0
```

### 🔧 `handle()` – Handle success or failure
```java
CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10 / 0)
    .handle((res, ex) -> {
        if (ex != null) {
            System.out.println("Handled exception: " + ex); // DEBUG
            return -1;
        }
        return res;
    });
System.out.println("Handled result: " + future.get()); // DEBUG: -1
```

---

## 🛑 Canceling a Future

```java
CompletableFuture<String> future = new CompletableFuture<>();
future.cancel(true);
System.out.println("Is cancelled? " + future.isCancelled()); // DEBUG: true
```

---

## 🧪 Debugging Tips

- Use `Thread.currentThread().getName()` to trace execution threads
- Use `join()` for unchecked exceptions (throws `CompletionException`)
- Use `get()` for checked exceptions (`ExecutionException`, `InterruptedException`)

---

## 📘 Method Summary Table

| Method             | Purpose                                      |
|--------------------|----------------------------------------------|
| `supplyAsync()`    | Async task with return                       |
| `runAsync()`       | Async task without return                    |
| `thenApply()`      | Transform result                             |
| `thenAccept()`     | Consume result                               |
| `thenRun()`        | Run task after completion                    |
| `thenCombine()`    | Combine two futures                          |
| `thenCompose()`    | Flatten nested futures                       |
| `allOf()` / `anyOf()` | Wait for all / any futures               |
| `exceptionally()`  | Handle exceptions with fallback              |
| `handle()`         | Handle result or exception                   |
| `cancel()`         | Cancel future                                |

---

## 🎯 Interview Highlights

- `CompletableFuture` enables **non-blocking**, **composable**, and **exception-aware** async programming.
- Prefer `thenCompose()` over `thenApply()` when chaining futures.
- Use `allOf()` for parallel execution and aggregation.
- Exception handling is built-in via `exceptionally()` and `handle()`.
- Avoid blocking with `get()` unless necessary — prefer `join()` for unchecked flow.

---

Would you like me to extend this with a real-world use case like async API chaining or a diagram showing future chaining flow?
```