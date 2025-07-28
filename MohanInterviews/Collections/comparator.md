

# 📊 Comparable vs Comparator in Java

Java provides two key interfaces for sorting objects: `Comparable` and `Comparator`. Understanding their differences is essential for mastering custom sorting logic.

---

## 🧩 Comparable Interface

### ✅ Definition
`Comparable<T>` is an interface in `java.lang` that defines a **natural ordering** for objects of a class.

### 🔧 Method
```java
int compareTo(T other);
```
- Returns:
  - Negative if `this < other`
  - Zero if `this == other`
  - Positive if `this > other`

### 📦 Example
```java
class Movie implements Comparable<Movie> {
    String name;
    int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie other) {
        return this.year - other.year;
    }
}
```

### 🐞 Debug Output
```java
List<Movie> movies = Arrays.asList(
    new Movie("A", 2020),
    new Movie("B", 2018),
    new Movie("C", 2022)
);

Collections.sort(movies);

for (Movie m : movies) {
    System.out.println("Sorted: " + m.name + " (" + m.year + ")");
}
```
**Output:**
```
Sorted: B (2018)
Sorted: A (2020)
Sorted: C (2022)
```

---

## 🧩 Comparator Interface

### ✅ Definition
`Comparator<T>` is an interface in `java.util` that defines **custom ordering** logic externally.

### 🔧 Method
```java
int compare(T o1, T o2);
```

# Student Sorting Example Using Comparator, Lambdas, Functional Interfaces, and Method References

This example demonstrates sorting a list of `Student` objects based on GPA, and then by name if GPA is the same.

## 💻 Java Code

```java
import java.util.*;
import java.util.function.Function;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Amit", 3.6),
            new Student("Bhavna", 3.8),
            new Student("Chirag", 3.6),
            new Student("Deepa", 3.9),
            new Student("Esha", 3.8)
        );

        // Functional interface usage: Function<Student, Double> for GPA
        Function<Student, Double> byGpa = Student::getGpa;
        Function<Student, String> byName = Student::getName;

        // Comparator using method reference and thenComparing
        Comparator<Student> studentComparator = Comparator.comparing(byGpa)
                                                           .thenComparing(byName);

        students.sort(studentComparator);

        students.forEach(System.out::println);
    }
}
```

## 🧠 Features Used
- **Lambda Expression**: Implicitly in `Comparator.comparing`
- **Method Reference**: `Student::getGpa`, `Student::getName`, `System.out::println`
- **Functional Interface**: `Function<T,R>` from `java.util.function`

## 🔎 Output
```
Amit (3.6)
Chirag (3.6)
Bhavna (3.8)
Esha (3.8)
Deepa (3.9)
```

## ✅ Sorting Logic
1. Primary sort by **GPA** (ascending)
2. Secondary sort by **Name** (alphabetical) if GPA is the same
```
