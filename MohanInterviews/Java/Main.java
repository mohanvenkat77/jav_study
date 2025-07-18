import java.util.List;

class Parent {
    public static void main(String[] args) {


        List<Integer> nums = List.of(1, 2, 3, 4);
int sum = nums.stream().reduce(0, Integer::sum); // BinaryOperator
System.out.println(sum);
// class Customer {
//     public Customer(String string, List<String> of) {
//         this.name=string;
//         this.phoneNumbers=of;
//     }
//     String name;
//     List<String> phoneNumbers;
//     // constructor, getters
//     public Collection<String> getPhoneNumbers() {
//         // TODO Auto-generated method stub
//         return  phoneNumbers;
//     }
// }

// List<Customer> customers = List.of(
//     new Customer("Alice", List.of("123", "456")),
//     new Customer("Bob", List.of("789"))
// );

// List<String> allNumbers = customers.stream()
//     .flatMap(c -> c.getPhoneNumbers().stream())
//     .collect(Collectors.toList());

// System.out.println(allNumbers); // [123, 456, 789]


// Stream<String> stream = List.of("apple", "banana", "cherry").stream()
//     .filter(s -> {
//         System.out.println("Filtering: " + s);
//         return s.startsWith("b");
//     }); // Nothing printed yet!

// stream.forEach(System.out::println); // Now filtering happens!

// Stream.of("apple", "banana", "cherry")
//     .filter(s -> {
//         System.out.println("Checking: " + s);
//         return s.startsWith("b");
//     })
//     .findFirst(); // Only "apple" and "banana" are checked


    }
}

// class Child extends Parent {
//     public static void main(String[] args) {
//         System.out.println("Child main()");
//     }
// }
