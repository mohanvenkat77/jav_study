Great question, Mohan — this is a classic interview topic that tests both your API knowledge and your understanding of exception handling.

### 📋 Queue Interface Methods in Java

The `Queue` interface provides **two variants** for each core operation:  
- One that **throws an exception** on failure  
- One that **returns a special value** (like `null` or `false`)  

Here’s a breakdown:

| **Operation** | **Method**       | **Throws Exception** | **Returns Special Value** |
|---------------|------------------|-----------------------|----------------------------|
| Insert        | `add(E e)`       | ✅ `IllegalStateException` if capacity is full | ❌ |
| Insert        | `offer(E e)`     | ❌                    | ✅ `false` if unable to insert |
| Remove        | `remove()`       | ✅ `NoSuchElementException` if queue is empty | ❌ |
| Remove        | `poll()`         | ❌                    | ✅ `null` if queue is empty |
| Examine       | `element()`      | ✅ `NoSuchElementException` if queue is empty | ❌ |
| Examine       | `peek()`         | ❌                    | ✅ `null` if queue is empty |

### 🧪 Example to Illustrate

```java
Queue<String> queue = new LinkedList<>();

System.out.println(queue.poll());     // ✅ null
System.out.println(queue.peek());     // ✅ null

// System.out.println(queue.remove()); // ❌ Throws NoSuchElementException
// System.out.println(queue.element()); // ❌ Throws NoSuchElementException

queue.offer("Java");
queue.add("Python");

System.out.println(queue.remove());   // ✅ Removes "Java"
System.out.println(queue.element());  // ✅ Returns "Python"
```
