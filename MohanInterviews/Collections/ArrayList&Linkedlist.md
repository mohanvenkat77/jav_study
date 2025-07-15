
```markdown
# 📘 Java Interview Guide: ArrayList vs LinkedList

## 📌 Overview: ArrayList vs LinkedList

| Feature               | ArrayList                              | LinkedList                              |
|-----------------------|-----------------------------------------|------------------------------------------|
| Structure             | Dynamic array                          | Doubly linked list                       |
| Access (get/set)      | O(1)                                   | O(n)                                     |
| Insert/Delete (middle)| O(n)                                   | O(n)                                     |
| Insert/Delete (ends)  | O(n)                                   | O(1)                                     |
| Memory Overhead       | Less                                   | More (extra pointers)                   |
| Iterator Performance  | Faster                                 | Slower                                   |
| Use Cases             | Frequent access                        | Frequent insert/delete                  |

---

## 🧑‍🎓 Beginner-Level Questions

### 1. What is an ArrayList?
**Answer:**  
ArrayList is a resizable array implementation in Java that allows dynamic memory allocation. It is part of `java.util` package and implements `List` interface.

```java
List<String> list = new ArrayList<>();
list.add("Java");
System.out.println(list.get(0));
```

---

### 2. What is a LinkedList?
**Answer:**  
LinkedList is a doubly-linked list implementation that supports efficient insertions and deletions. It implements both `List` and `Deque`.

```java
LinkedList<String> list = new LinkedList<>();
list.add("Java");
list.addFirst("Hello");
```

---

### 3. Can ArrayList contain null values and duplicates?
**Answer:**  
Yes, ArrayList can contain `null` values and duplicates.

---

### 4. How does LinkedList store elements?
**Answer:**  
Each element is wrapped inside a `Node` object that holds data, a pointer to the previous node, and a pointer to the next node.

---

## ⚙️ Intermediate-Level Questions

### 1. Which is faster for random access: ArrayList or LinkedList?
**Answer:**  
ArrayList is faster for random access (`O(1)`), while LinkedList requires traversal (`O(n)`).

---

### 2. When should you use LinkedList over ArrayList?
**Answer:**  
Use LinkedList when:
- Frequent insertions/deletions at ends
- Memory overhead is acceptable
- No need for fast random access

---

### 3. How does ArrayList resize internally?
**Answer:**  
ArrayList starts with default capacity (usually 10) and resizes by 50% each time the array becomes full.

---

### 4. How do you convert an ArrayList to LinkedList?
```java
ArrayList<String> arrayList = new ArrayList<>();
LinkedList<String> linkedList = new LinkedList<>(arrayList);
```

---

## 🧠 Advanced-Level Questions

### 1. What is fail-fast behavior in ArrayList?
**Answer:**  
If the list is modified while iterating, `ConcurrentModificationException` is thrown. This is because the internal `modCount` detects unexpected changes.

---

### 2. How does cache locality affect ArrayList vs LinkedList?
**Answer:**  
ArrayList benefits from contiguous memory which improves cache performance. LinkedList has scattered nodes which leads to poor locality.

---

### 3. How do you reverse a LinkedList?
**Answer:**  
Use `Collections.reverse()` or iterate manually using pointers.

```java
Collections.reverse(linkedList);
```

---

### 4. How do you implement a stack using LinkedList?
```java
LinkedList<String> stack = new LinkedList<>();
stack.push("First");
stack.push("Second");
System.out.println(stack.pop()); // "Second"
```

---

### 5. How do you merge two LinkedLists alternatively?
```java
public LinkedList<Integer> mergeAlternately(LinkedList<Integer> a, LinkedList<Integer> b) {
    LinkedList<Integer> result = new LinkedList<>();
    Iterator<Integer> it1 = a.iterator();
    Iterator<Integer> it2 = b.iterator();
    while (it1.hasNext() || it2.hasNext()) {
        if (it1.hasNext()) result.add(it1.next());
        if (it2.hasNext()) result.add(it2.next());
    }
    return result;
}
```

---

## 🧩 Tricky Questions for Interviews

- How do you find the middle element of a LinkedList in one pass?
- Why would LinkedList performance degrade in a priority queue implementation?
- What are edge cases while using `subList()` on ArrayList?
- How do you rotate a LinkedList by K elements?
- How would you remove duplicates from an ArrayList efficiently?

---

## ✨ Summary Notes

- ✅ Use ArrayList for read-heavy applications.
- 🔄 Prefer LinkedList for frequent insert/delete operations.
- 🔥 Be ready to explain time/space trade-offs and internal mechanics.


# 📚 Java Collections: ArrayList vs LinkedList Methods

## 📌 Common Interface: `List<E>`
Both `ArrayList` and `LinkedList` implement the `List` interface, so they share many methods like:
- `add(E e)`
- `remove(Object o)`
- `get(int index)`
- `set(int index, E element)`
- `size()`
- `isEmpty()`
- `contains(Object o)`
- `indexOf(Object o)`
- `lastIndexOf(Object o)`
- `clear()`
- `toArray()`
- `subList(int fromIndex, int toIndex)`
- `iterator()`
- `listIterator()`

---

## 🔧 ArrayList Specific Methods

| Method                          | Description |
|----------------------------------|-------------|
| `add(int index, E element)`      | Inserts element at specified index |
| `addAll(Collection<? extends E> c)` | Adds all elements from another collection |
| `addAll(int index, Collection<? extends E> c)` | Inserts all elements at specified index |
| `clone()`                        | Returns a shallow copy |
| `ensureCapacity(int minCapacity)`| Increases internal capacity |
| `trimToSize()`                   | Trims capacity to current size |
| `remove(int index)`              | Removes element at index |
| `remove(Object o)`               | Removes first occurrence of object |
| `removeAll(Collection<?> c)`     | Removes all matching elements |
| `retainAll(Collection<?> c)`     | Retains only matching elements |
| `replaceAll(UnaryOperator<E> op)`| Replaces each element using operator |
| `sort(Comparator<? super E> c)`  | Sorts list using comparator |
| `spliterator()`                  | Returns a Spliterator for parallel processing |
| `forEach(Consumer<? super E> action)` | Applies action to each element |

---

## 🔧 LinkedList Specific Methods

| Method                          | Description |
|----------------------------------|-------------|
| `addFirst(E e)`                  | Adds element at beginning |
| `addLast(E e)`                   | Adds element at end |
| `getFirst()`                     | Retrieves first element |
| `getLast()`                      | Retrieves last element |
| `removeFirst()`                  | Removes first element |
| `removeLast()`                   | Removes last element |
| `offer(E e)`                     | Adds element to end (queue-style) |
| `offerFirst(E e)`                | Adds element to front |
| `offerLast(E e)`                 | Adds element to end |
| `peek()`                         | Retrieves head without removing |
| `peekFirst()`                    | Retrieves first element |
| `peekLast()`                     | Retrieves last element |
| `poll()`                         | Retrieves and removes head |
| `pollFirst()`                    | Retrieves and removes first element |
| `pollLast()`                     | Retrieves and removes last element |
| `pop()`                          | Pops element from stack (head) |
| `push(E e)`                      | Pushes element onto stack (head) |
| `descendingIterator()`           | Iterator in reverse order |
| `removeFirstOccurrence(Object o)`| Removes first matching element |
| `removeLastOccurrence(Object o)` | Removes last matching element |

---

## 🧠 Interview Tip

- `ArrayList` is better for **random access** and **read-heavy** operations.
- `LinkedList` excels in **frequent insertions/deletions**, especially at ends.
- Know how internal structures affect **time complexity** and **memory usage**.

---

```