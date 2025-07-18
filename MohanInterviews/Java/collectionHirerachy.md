

```markdown
# 📚 Java Collections Framework – Full Hierarchy & Detailed Descriptions

## 🧠 Overview

The Java Collections Framework is a set of classes and interfaces that implement commonly reusable data structures. It provides:
- **Interfaces** for abstract data types (List, Set, Map, Queue)
- **Concrete classes** for implementations (ArrayList, HashMap, etc.)
- **Algorithms** for sorting, searching, and manipulating collections

---

## 🏛️ Collections Hierarchy Diagram

```
java.lang.Iterable (interface)
    └── java.util.Collection (interface)
        ├── List (interface)
        │   ├── ArrayList (class)
        │   ├── LinkedList (class)
        │   ├── Vector (class)
        │   └── Stack (class)
        ├── Set (interface)
        │   ├── HashSet (class)
        │   ├── LinkedHashSet (class)
        │   └── TreeSet (class)
        └── Queue (interface)
            ├── PriorityQueue (class)
            ├── ArrayDeque (class)
            └── LinkedList (class)
java.util.Map (interface)
    ├── HashMap (class)
    ├── LinkedHashMap (class)
    ├── TreeMap (class)
    ├── Hashtable (class)
    └── WeakHashMap / IdentityHashMap / EnumMap (classes)
```

---

## 🔧 Interface Descriptions

### 1️⃣ `Iterable<E>` (interface)
- **Purpose**: Root interface for all collections that can be iterated.
- **Key Method**: `iterator()` returns an `Iterator<E>` to traverse elements.
- **Use Case**: Enables enhanced for-loop (`for-each`) syntax.

---

### 2️⃣ `Collection<E>` (interface)
- **Purpose**: Base interface for all collection types except maps.
- **Structure**: Defines basic operations like add, remove, size, etc.
- **Key Methods**:
  - `add(E e)`: Adds an element.
  - `remove(Object o)`: Removes a specific element.
  - `contains(Object o)`: Checks if an element exists.
  - `size()`, `isEmpty()`: Size and emptiness checks.
  - `clear()`: Removes all elements.
  - `toArray()`: Converts to array.
  - `stream()`, `parallelStream()`: Creates stream pipelines.

---

## 📋 List Interface & Classes

### 🔹 `List<E>` (interface)
- **Purpose**: Ordered collection that allows duplicates.
- **Structure**: Elements are indexed.
- **Key Methods**:
  - `get(int index)`: Retrieves element at index.
  - `set(int index, E element)`: Replaces element.
  - `add(int index, E element)`: Inserts at index.
  - `remove(int index)`: Removes by index.
  - `indexOf(Object o)`, `lastIndexOf(Object o)`: Search operations.

---

### 🔸 `ArrayList<E>` (class)
- **Purpose**: Resizable array implementation of List.
- **Internal Structure**: Backed by a dynamic array.
- **Performance**:
  - Fast random access (`O(1)` for `get`)
  - Slow insert/remove in middle (`O(n)`)
- **Use Case**: Best for frequent reads and appends.

---

### 🔸 `LinkedList<E>` (class)
- **Purpose**: Doubly-linked list implementation.
- **Structure**: Each node points to previous and next.
- **Performance**:
  - Fast insert/remove at ends (`O(1)`)
  - Slow random access (`O(n)`)
- **Use Case**: Best for frequent insertions/deletions.

---

### 🔸 `Vector<E>` (class)
- **Purpose**: Legacy synchronized dynamic array.
- **Structure**: Similar to ArrayList but thread-safe.
- **Use Case**: Rarely used; replaced by `Collections.synchronizedList()`.

---

### 🔸 `Stack<E>` (class)
- **Purpose**: LIFO stack implementation.
- **Structure**: Extends Vector.
- **Key Methods**:
  - `push(E item)`, `pop()`, `peek()`
- **Use Case**: Simple stack operations.

---

## 🔐 Set Interface & Classes

### 🔹 `Set<E>` (interface)
- **Purpose**: Collection with no duplicate elements.
- **Structure**: Unordered or ordered depending on implementation.
- **Key Methods**: Inherited from `Collection`.

---

### 🔸 `HashSet<E>` (class)
- **Purpose**: Unordered set backed by a hash table.
- **Structure**: Uses hashing for fast lookup.
- **Performance**: `O(1)` for add/remove/contains.
- **Use Case**: Fast membership checks.

---

### 🔸 `LinkedHashSet<E>` (class)
- **Purpose**: Maintains insertion order.
- **Structure**: Hash table + linked list.
- **Use Case**: Ordered iteration with set semantics.

---

### 🔸 `TreeSet<E>` (class)
- **Purpose**: Sorted set using natural or custom comparator.
- **Structure**: Backed by a Red-Black tree.
- **Performance**: `O(log n)` for operations.
- **Use Case**: Sorted unique elements.

---

## 📦 Queue Interface & Classes

### 🔹 `Queue<E>` (interface)
- **Purpose**: FIFO structure for processing elements.
- **Key Methods**:
  - `offer(E e)`: Adds element.
  - `poll()`: Retrieves and removes head.
  - `peek()`: Retrieves head without removing.

---

### 🔸 `PriorityQueue<E>` (class)
- **Purpose**: Elements ordered by priority.
- **Structure**: Min-heap.
- **Use Case**: Scheduling tasks or sorting on-the-fly.

---

### 🔸 `ArrayDeque<E>` (class)
- **Purpose**: Double-ended queue.
- **Structure**: Resizable array.
- **Use Case**: Stack or queue replacement.

---

### 🔸 `LinkedList<E>` (class)
- **Purpose**: Implements both List and Queue.
- **Use Case**: Versatile for both indexed and FIFO operations.

---

## 🗺️ Map Interface & Classes

### 🔹 `Map<K, V>` (interface)
- **Purpose**: Key-value pair storage.
- **Structure**: No duplicate keys.
- **Key Methods**:
  - `put(K key, V value)`, `get(K key)`
  - `remove(K key)`, `containsKey(K key)`
  - `keySet()`, `values()`, `entrySet()`

---

### 🔸 `HashMap<K, V>` (class)
- **Purpose**: Unordered map with fast access.
- **Structure**: Hash table.
- **Performance**: `O(1)` average for get/put.
- **Use Case**: General-purpose mapping.

---

### 🔸 `LinkedHashMap<K, V>` (class)
- **Purpose**: Maintains insertion order.
- **Structure**: Hash table + linked list.
- **Use Case**: Ordered iteration.

---

### 🔸 `TreeMap<K, V>` (class)
- **Purpose**: Sorted map by keys.
- **Structure**: Red-Black tree.
- **Performance**: `O(log n)`
- **Use Case**: Sorted key-value pairs.

---

### 🔸 `Hashtable<K, V>` (class)
- **Purpose**: Legacy synchronized map.
- **Use Case**: Replaced by `ConcurrentHashMap`.

---

### 🔸 Specialized Maps
- `WeakHashMap`: Keys eligible for GC.
- `IdentityHashMap`: Uses `==` instead of `.equals()`.
- `EnumMap`: Optimized for enum keys.

---

## 🧭 Summary Table

| Type | Interface | Common Classes | Key Traits |
|------|-----------|----------------|------------|
| List | `List` | `ArrayList`, `LinkedList`, `Vector`, `Stack` | Ordered, duplicates allowed |
| Set | `Set` | `HashSet`, `LinkedHashSet`, `TreeSet` | Unique elements |
| Queue | `Queue` | `PriorityQueue`, `ArrayDeque`, `LinkedList` | FIFO |
| Map | `Map` | `HashMap`, `TreeMap`, `LinkedHashMap`, `Hashtable` | Key-value pairs |

