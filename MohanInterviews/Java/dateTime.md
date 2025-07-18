

# 📆 Java 8 Date and Time API – Full Guide

Java 8 introduced a modern, immutable, and thread-safe Date and Time API under the `java.time` package. It replaces the flawed `java.util.Date` and `java.util.Calendar` classes.

---

## 🧩 8 Core Classes Introduced

| Class | Description |
|-------|-------------|
| `LocalDate` | Represents a date without time or timezone |
| `LocalTime` | Represents a time without date or timezone |
| `LocalDateTime` | Combines date and time without timezone |
| `ZonedDateTime` | Date and time with timezone |
| `Instant` | Timestamp representing a point on the timeline |
| `Period` | Date-based amount of time (years, months, days) |
| `Duration` | Time-based amount of time (hours, minutes, seconds) |
| `ZoneId` | Represents a timezone identifier |

---

## 1️⃣ `LocalDate`

### 📘 Description
Represents a date in ISO format (yyyy-MM-dd) without time or timezone. Ideal for birthdays, anniversaries, etc.

### 🔧 Key Methods
- `now()`: Current date
- `of(year, month, day)`: Specific date
- `plusDays()`, `minusMonths()`: Date arithmetic
- `getDayOfWeek()`, `isLeapYear()`: Date info
- `with(TemporalAdjuster)`: Adjust date

### 🧪 Example
```java
LocalDate date = LocalDate.of(2025, 10, 5);
System.out.println("Date: " + date);
System.out.println("Day of Week: " + date.getDayOfWeek());
System.out.println("Leap Year? " + date.isLeapYear());
```

---

## 2️⃣ `LocalTime`

### 📘 Description
Represents time in ISO format (HH:mm:ss) without date or timezone. Useful for schedules, alarms, etc.

### 🔧 Key Methods
- `now()`: Current time
- `of(hour, minute, second)`: Specific time
- `plusHours()`, `minusMinutes()`: Time arithmetic
- `getHour()`, `getSecond()`: Time info

### 🧪 Example
```java
LocalTime time = LocalTime.of(10, 30, 45);
System.out.println("Time: " + time);
System.out.println("Hour: " + time.getHour());
```

---

## 3️⃣ `LocalDateTime`

### 📘 Description
Combines `LocalDate` and `LocalTime`. No timezone. Ideal for timestamps without zone context.

### 🔧 Key Methods
- `now()`, `of(...)`: Create instance
- `plusDays()`, `minusHours()`: Arithmetic
- `getMonth()`, `getDayOfMonth()`: Info
- `toLocalDate()`, `toLocalTime()`: Split

### 🧪 Example
```java
LocalDateTime dt = LocalDateTime.of(2025, 10, 5, 10, 30);
System.out.println("DateTime: " + dt);
System.out.println("Month: " + dt.getMonth());
```

---

## 4️⃣ `ZonedDateTime`

### 📘 Description
Represents date and time with timezone. Ideal for global apps.

### 🔧 Key Methods
- `now(ZoneId)`: Current zoned time
- `of(...)`: Create instance
- `withZoneSameInstant()`: Convert zone
- `getZone()`: Get zone info

### 🧪 Example
```java
ZoneId zone = ZoneId.of("Asia/Kolkata");
ZonedDateTime zdt = ZonedDateTime.now(zone);
System.out.println("Zoned DateTime: " + zdt);
System.out.println("Zone: " + zdt.getZone());
```

---

## 5️⃣ `Instant`

### 📘 Description
Represents a timestamp (machine time) since the epoch (1970-01-01T00:00Z). Ideal for logging and performance tracking.

### 🔧 Key Methods
- `now()`: Current timestamp
- `plusSeconds()`, `minusMillis()`: Arithmetic
- `isBefore()`, `isAfter()`: Comparison

### 🧪 Example
```java
Instant now = Instant.now();
System.out.println("Instant: " + now);
```

---

## 6️⃣ `Period`

### 📘 Description
Represents a date-based amount of time (years, months, days). Used for age, subscription periods, etc.

### 🔧 Key Methods
- `between(start, end)`: Difference
- `ofYears()`, `ofMonths()`: Create period
- `getYears()`, `getDays()`: Info

### 🧪 Example
```java
LocalDate start = LocalDate.of(2020, 1, 1);
LocalDate end = LocalDate.now();
Period period = Period.between(start, end);
System.out.println("Period: " + period);
```

---

## 7️⃣ `Duration`

### 📘 Description
Represents a time-based amount (hours, minutes, seconds). Ideal for stopwatch, timeout, etc.

### 🔧 Key Methods
- `between(start, end)`: Difference
- `ofHours()`, `ofMinutes()`: Create duration
- `toMinutes()`, `toMillis()`: Convert

### 🧪 Example
```java
LocalTime t1 = LocalTime.now();
LocalTime t2 = t1.plusHours(2);
Duration d = Duration.between(t1, t2);
System.out.println("Duration: " + d);
```

---

## 8️⃣ `ZoneId`

### 📘 Description
Represents a timezone identifier (e.g., "Asia/Kolkata"). Used with `ZonedDateTime`.

### 🔧 Key Methods
- `of(String)`: Create zone
- `getAvailableZoneIds()`: List zones

### 🧪 Example
```java
ZoneId zone = ZoneId.of("Europe/London");
System.out.println("Zone ID: " + zone);
```

---

## 🧠 Summary Table

| Class | Purpose | Timezone Support |
|-------|---------|------------------|
| `LocalDate` | Date only | ❌ |
| `LocalTime` | Time only | ❌ |
| `LocalDateTime` | Date + Time | ❌ |
| `ZonedDateTime` | Date + Time + Zone | ✅ |
| `Instant` | Timestamp | ✅ |
| `Period` | Date-based duration | ❌ |
| `Duration` | Time-based duration | ❌ |
| `ZoneId` | Timezone ID | ✅ |

---

## 🧪 Debug Output Sample

```java
LocalDateTime dt = LocalDateTime.now();
System.out.println("[DEBUG] Current LocalDateTime: " + dt);

ZonedDateTime zdt = dt.atZone(ZoneId.of("Asia/Kolkata"));
System.out.println("[DEBUG] ZonedDateTime: " + zdt);

Instant instant = Instant.now();
System.out.println("[DEBUG] Instant timestamp: " + instant);
```
