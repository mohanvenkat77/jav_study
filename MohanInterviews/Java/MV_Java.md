1. What is Java
    * Java is High level programing laungage & it is platform independent
    * wth this we can develope large scale applications
    * it is based on OPPS principles

2. why java is platform independent
    * Java was designed in a way that once you compile the code it converts the code into a machine readable byte
    * that byte code can run on any server or machine seamlessly but the only condition is it should have JRE
3. What  is JVM JRE JDK
    * JDK>JRE>JVM
    *JVM - > * JVM runs the java byte code and it is platform independent
             * Handles memory management and garbage collection
    *JRE - > * JRE provides environment to run the java program
             * Do not have development tools
             * it only ablses to run the java program but doest proform compile And debug.
    *JDK - > * JDK is full package of java development kit
             * with this we can run compile and debug the code.
             * Essential for developes to build a large scale applications.
4. why is java is not a pure object oriented programming language
    * Java includes primitive data types to treat numbers and chars which are not objects
    * even though we use Wrapper classes instead of Primitive dtypes that is a workaround
    * static methods are also one of the reason. as they can be called with classname instead of creating a object.
5. what are the java8 features
    * Default and static methods can be added to the existing interface without breaking the old code and can be implemented in interfaces.
    * use of lamda expressions,streams,Functional interface,Method refernces,Optional classes,ForEach loop in iterable,Base64 encoding and decoding,parallel Streams, File handling and Datetime claasses
6. what are difference between primitive dtypes and objects
    * primitive dtypes stores actual value where objects stores the reverence
    * pdtypes consumes less memory and objects consumes more memory.
    * we have limited pdtypes (int,chars,float,double,long,byte,short,boolean) and we can create unlimited objects.
    * pdtypes are easy and fast to access then the objects.
7. what is opps?
    *opps is based objects and classes rather then functions and stored procedures.
    * object is a instance of a class and it has properties & functioning where class is a representation of a object describing its details and functinality
    * opps main aim is to implement real world entities which are likely to have inheritance,polymorphism,abstraction and encapsulation.

8. why do we need opps?
    * opps makes the development and maintaince of project easier
    * opps provides the feature of data hiding which helps in security/
    * code can be reduced through inheritance thereby reduced redendancy.
    * with the help of encapsulation data and code can be bundled together with increasing security.
    * the concept of polymorphism allows the object have multiple forms.
9. what are the features of opps?
    * inheritance is a conpt in which one class inhertis the properties of another class
    * Encapsulation it bundles the data and code in one unit and work together securely.
    * polymorphism it leads the object to have multiple forms, it leads the user to perform single task in variuos ways.
    * Abstarction it hides the implementation part to users and only shows necessary information.

10. what are the limitations of opps?
    * it is not suitable for small problems
    * the programer should think of solving problems in terms of objects
    * requires intensive testing.
11. what are difference between opps and structural programing
    * opps are based on objects and classses rather then functions and stored procedures whereas structural programing is divided into functions and logical structure to a  program
    * opps is more secure then sprograming as it contains data hiding.
12. what is a class in java
    * A class is a representation(blue print) of an object, it defines the detils(structure) and functionaliy(Actions) of th object of same type.
    * classes consists of Fileds(varibles) and mrthods(functions) varibles are the attributs of the object and functions are the detils of the object.

```
class Main {
    fields;
    methods;
}

public class Dog{
    (Fields);
    private int age;
    private String name;
    (methods)
    private void speak();
    //constructor
    public Dog(age,name){
        this.age=age
        this.name=name
    }
}
```
13. What is an object
    * An object is a instane of a class created by the blueprinnt provided by the class.
    *you can crete multiple objects and each object have its their own data and functionality
```
Dog d=new Dog(2,"Lucky")
```

14. what is Data Abstarction
    * Abstraction menas hiding the unnecessary implemantion part to the user and showing only the  necessary data.
    * ex. a car engine works with escalator user dont need to know the whole implementation he only needs to know how to use the escaltor in the same way abstarction helps to end users to know only the necessary information needed.
```
// Example of Abstraction using a car
abstract class Car {
    abstract void drive(); // abstract method (no implementation)
    
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Sedan extends Car {
    @Override
    void drive() {
        System.out.println("Driving the sedan...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Sedan();
        myCar.startEngine();
        myCar.drive(); // User interacts without knowing internal mechanics
    }
}
```
15. how do you achive Abstarction in java
    * we can achive abstraction in java by extending Abstract on class or by implementing interface on class
    * Abstact class contains both abstract methods and normal methods but the interface contains only abstarct methods( statcic and default methods also introduced in java8)
    * interface supports multiple inheritance.
```
// Using abstract class
abstract class Animal {
    abstract void sound();

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Barks");
    }
}

// Using interface
interface Vehicle {
    void accelerate(); // implicitly abstract
}

class Bike implements Vehicle {
    public void accelerate() {
        System.out.println("Bike accelerates...");
    }
}
```
16. what is abstract method 
    * a method which is defined but not implemented within the abstact class is called abstact method
    * if a class is using abstarct method the class must be declared as abstarct class
```
abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
```
17. what is encapsulation in java
    * Encapsulation means binding the data and code in one unit which helps in security, maintability and modularity
    * class = varibles + Methods
    * it has a disadvantage as the code becoms larger and complex with getter and setters method so it consumes more memory and access is also slow
```
// Example of Encapsulation
public class Employee {
    // Private variables — data is hidden from outside access
    private String name;
    private int age;

    // Public getters and setters — controlled access to private data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Additional validation or logic can be added here
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be over 18.");
        }
    }
}

// Using the encapsulated class
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Mohan");
        emp.setAge(25);

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}
```
18. what is difference between abstarction and encapsulation
* Abstraction is used to hide the unnecessary information to the user whereas encapsulation is used to hide the data and functionality from the outsider
* we achive abstarction by the abstact class or interface class . we achive encapsulation by making the data as private and providing getters and setters for them.

19. what is inheritence in java
    * inheritance means all the methods and varibles in parent class can be used or accesed by the child class
    * by using extend keyword we can implemnt the inheritance.
    there are 5 types of inheritance 
    1. single child class extends sinple parent class
    2. Multi-level Inheritance: Single child class extend another child class which extends a parent class
    3. Hierarchical Inheritance: Multiple child class extends single parent.
    4. Multiple Inheritance: Single child class extends multiple parent class. This is not supported by Java because if two class contains two methods with the same name, then when the child class extends both parent class following multiple in-inheritance an ambiguity arises which class method to pick. Hence, Java doesn’t support multiple inheritances and hybrid inheritance in class. This problem is also called as diamond access problem. However, in the case of interface, multiple inheritance is supported in java because in the case of inheritance each class just contains the declaration and the corresponding implemented class only implements the method, hence there is no chance of ambiguity.

    * Advantages : the main advantage is code reusability, always write the common methods of all child classes in parent class and only specific methods of child are writen in child class
    * limitation: the child and parent class is linked tightly so if there is any change in program we need to change the child or parent class.

```
single inheritance

class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited from Animal
        d.bark();
    }
}
```

```
multilevel inheritance

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Human speaks");
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.walk();
        h.speak();
    }
}

```

```
hirarchical inheritance
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.bark();

        Cat c = new Cat();
        c.makeSound();
        c.meow();
    }
}

```

```
multiple inheritance

// This code would cause a compile-time error

class A {
    void msg() { System.out.println("Hello from A"); }
}

class B {
    void msg() { System.out.println("Hello from B"); }
}

// ❌ Not allowed in Java:
// class C extends A, B {} // Compile-time error


interface A {
    void msg();
}

interface B {
    void msg();
}

class C implements A, B {
    public void msg() {
        System.out.println("Hello from multiple interfaces");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.msg();
    }
}

```

20. what is polymorphism
    * polymorphism is one of the key features of opps it means a single entity having multiple forms or one function is used to perform multiple taks
    1. Static or compile time polymorphism 
    2. dynamic or runtime polymorphism
    * compile time polymorphism :
    static polymorphism is achived at compile time by _method overloading_:
        1. the parameter number must be different from parameters and type of parameter should be different
    * dynamic polymorphism: dynamic polymorhism is achived at the time of run time while execution of program by _method overriding_
        1. when a derived class has the same function as the child class, then the child class method is oveeriden.
21. what is Method overloading
    * Method overloading is a concept where two or more methods can have the same name but differ in parameters. this is called copile time polymorphism, it is achived in three ways
        1. change in number of parameters
        2. change in data types of parameters
        3. changeing the sequence of data types in parameters
```
// A class to demonstrate Method Overloading (Compile-Time Polymorphism)
public class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println("add(int, int): " + calc.add(10, 20));                   // 30
        System.out.println("add(int, int, int): " + calc.add(5, 15, 25));           // 45
        System.out.println("add(double, double): " + calc.add(10.5, 4.3));          // 14.8
        System.out.println("add(String, String): " + calc.add("Hello, ", "Mohan")); // Hello, Mohan
    }
}
```
22. what is method overriding
    * Method Overriding is a concept of OOPs. It means if a subclass and superclass have the same method with parameters, then the method of the subclass overrides the method of the superclass. Method Overriding is related to Run-Time Polymorphism. The method overriding can be done when

    1. The arguments of both parent and child are the same.
    2. private, static, and final methods cant be overridden.
    3. The abstract method of superclass should always be overridden.

```
// Parent class
class Vehicle {
    // Method to be overridden
    void start() {
        System.out.println("Vehicle starts with a generic key");
    }
}

// Child class overriding the start() method
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a push button");
    }
}

// Another child class
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism using parent class reference and child class objects
        Vehicle v1 = new Car();    // Vehicle reference → Car object
        Vehicle v2 = new Bike();   // Vehicle reference → Bike object

        // Dynamic method dispatch: decides at runtime which 'start' method to invoke
        v1.start(); // Output: Car starts with a push button
        v2.start(); // Output: Bike starts with a kick
    }
}
```


23. Can We Override Static Methods in Java?
    * overridining is based on run time polymmorphism where the method call is resolved at runtime based on the object.
    * static methods are resolved at compile time using the reference type not the object type
    * so even if a sub class defines static method with the same signature, its method hiding not oveeriding.
```
class Parent {
    static void show() {
        System.out.println("Static method from Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Static method from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Output: Static method from Parent
    }
}
```

24. why cant we overide static methods
    * static methods belongs to class and instance methods belongs to object
    * static method stores in class area and instance method stores in heap area.
25. can we override the main method in java?
    * main is a static method and above discussed static methods cannot be overidden
    * if a sub class has main method and parent class has main method then sub class hides the parent main method but it is method hiding

```
class Parent {
    public static void main(String[] args) {
        System.out.println("Parent main()");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        System.out.println("Child main()");
    }
}

```

26. different types of varibles?
    * It is a location in memory where the data can be stored
    * local varible is defined inside a method , constructor or block and executes only when during the method execution
    * instance varibles is defined inside a class but oustside the methods, it belongs to a object created by it and destroyed with it.
    * static varibles inside a class it is declared with static keyword,belongs to the class, shared across all instances.

```
public class Example {

    // Static variable
    static int staticCount = 0;

    // Instance variable
    int instanceCount = 0;

    public void showCounts() {
        // Local variable
        int localCount = 10;

        System.out.println("Local: " + localCount);
        System.out.println("Instance: " + instanceCount);
        System.out.println("Static: " + staticCount);
    }
}
```
27. what is stack and heap memory?
    * stack and heap are the memories allocated by the JVM. stack is aplace where local varibles and object references are stored. and Heap is a palce where objects,methods and its instance varibles and static fields are stored.
    * local varibles does nott have default valeus when undefined and class varibles have default values when undefined.
    * static fields are stored in heap and local varibles are stored in stack
    * only method invocation and its partial results are stored in stack but method stored in heap.
    * Memory is allocated for stack in last in first out manner
    * Memory is managed by garbage collector in Heap


28. what is virtual method?
    * a virtual method is defined in a base class can be overideen in child class
    * it supports runtime polymorphism
    * in java all non static methods are virtual by default.
```
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Parent reference, child object
        a.speak();             // Output: Dog barks (runtime decision)
    }
}
```

29. what is constructor?
    * a constructor is a special method in java which has the same name as the class and no return type and used to initialize the object.
    * constructor is invoked at the time of object creation.
    * default constructor set the deault values to the object.
    * constructor will return the current class instance = The new keyword returns the object reference
    So when you do:
Car c=newCar()
The new Car() expression:
Allocates memory in the heap
Calls the constructor
Returns a reference to the new object
That reference is stored in variable c
So the constructor does not return the object in the code, but the object creation process does.


```
// A simple class demonstrating the concept of constructors
public class Student {

    // Instance variables
    String name;
    int age;

    // 🟢 Default constructor (no parameters)
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called.");
    }

    // 🔵 Parameterized constructor (custom initialization)
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display object data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // 🔁 Returning current instance (illustrative purpose)
    Student getInstance() {
        return this; // returns current class instance
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Student s1 = new Student();
        s1.display();

        // Creating object using parameterized constructor
        Student s2 = new Student("Mohan", 25);
        s2.display();

        // Demonstrate instance return
        Student s3 = s2.getInstance();
        s3.display(); // prints same as s2
    }
}
```
30. what is this keyword?
    * This is a refernce varible used to refer the current class 
    * it - Resolves ambiguity between instance variables and method parameters.

    * This.varible for varible, this.method() for method, this for constructor
    * Call to this() must be the first statement in constructor. And this used to return current class instance
```
class Student {
    String name;

    Student(String name) {
        this.name = name; // 'this' refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}


class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        this("Mohan", 25); // Calls the parameterized constructor below 👇
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }
}

Student s = new Student();
//output
Parameterized constructor called
Default constructor called
```
31. what is super keyword?
    * super is use to refer the immediate parent class
    * it access parent class varibles and methods and calls it constructor
    * super() is added in each class constructor automatically by compiler if there is no super() or this()
```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls Animal's sound()
        System.out.println("Dog barks");
    }
}

class Animal {
    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Mammal"); // Calls Animal's constructor
        System.out.println("Dog constructor called");
    }
}
```

32.  what is aggregation?
    * Aggregation is a type of association that represents a HAS- A relationship between two classes.
    * - It’s a one-way relationship: One class has another class.
```
// Part class
class Address {
    String city, state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void showAddress() {
        System.out.println(city + ", " + state);
    }
}

// Whole class
class Student {
    String name;
    Address address; // Aggregation — Student HAS-A Address

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.print("Student: " + name + ", Address: ");
        address.showAddress();
    }
}

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("Hyderabad", "Telangana");
        Student s = new Student("Mohan", addr);
        s.display();
    }
}
```
33. what is coviant return type?
    * A covariant return type allows an overriding method in a subclass to return a more specific (subclass) type than the method it overrides in the parent class
```
class Animal {
    Animal getAnimal() {
        System.out.println("Returning Animal");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() { // Covariant return type: Dog is a subclass of Animal
        System.out.println("Returning Dog");
        return new Dog();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.getAnimal(); // Output: Returning Dog
    }
}

As you can see in the above example, the return type of the get() method of A class is A but the return type of the get() method of B class is B. Both methods have different return type but it is method overriding. This is known as covariant return type.

```
34. what  is IIB?
    * instance initialization block or IIB are used to initialize the instance varibles. IIBs are executed before constructors. They run each time when object of the class is created.
    * These are used if we want to set some of the values even before creating the objects.
    * initialization block are executed whenever the class is initialized and before the constructors are invoked
    * they are typically placed above the constructor within braces
    * IIB runs every time a new instance is created
    * IIB run in the order they appear in the program

```
public class Student {

    String name;
    int age;

    // 🟦 Instance Initialization Block (IIB)
    {
        System.out.println("IIB: Setting default values");
        name = "Default Name";
        age = 18;
    }

    // 🔵 Constructor 1 (default)
    Student() {
        System.out.println("Constructor: No-arg constructor");
    }

    // 🔵 Constructor 2 (parameterized)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor: Parameterized constructor");
    }

    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Creating s1...");
        Student s1 = new Student(); // IIB runs first, then default constructor
        s1.display();

        System.out.println("\nCreating s2...");
        Student s2 = new Student("Mohan", 25); // IIB runs first, then parameterized constructor
        s2.display();
    }
}


Creating s1...
IIB: Setting default values
Constructor: No-arg constructor
Student Name: Default Name, Age: 18

Creating s2...
IIB: Setting default values
Constructor: Parameterized constructor
Student Name: Mohan, Age: 25


```

35. what is final keyword?
    * Final is mainly used to restrict
    * if we have any value that shouldnt be changed further that we can declare as Final
    * ex: PAN card number of person,PI value,
    * Final varibles : a varible that value cannot be changed in future
    * Final Method : a method whose implementation i final we cannot oveeride the final method.
    * Final class : FInal class cannot be extended
    * Constructors are never inherited, so there's nothing to override.
```
singleton example
public class MySingleton {

    // Step 1: Create a private static object of the class
    private static MySingleton instance;

    // Step 2: Private constructor to restrict new object creation
    private MySingleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Public method to get the single instance
    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton(); // Only one object created
        }
        return instance;
    }

    // Sample method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        MySingleton obj1 = MySingleton.getInstance(); // Creates object
        obj1.showMessage();

        MySingleton obj2 = MySingleton.getInstance(); // Returns same object
        obj2.showMessage();
    }
}
```
36. what is binding?
    * binding means linking a method call to method body.
    * static binding: Binding is done during compile time itself, jvm will come to know which method/variable should to bind at compile time. As the binding is happening at compile time, even before runtime so called as early binding.
    * dynamic binding: Here binding will happen at run time as the jvm will not know which method/ variable should bind, hence at run time the respective one will be invoked. Called as Late binding as at run time the binding is taking place.
    * - Overloading → Compile Time → Static Binding
- Overriding → Runtime → Dynamic Binding
37. what are access modifiers?
    * access modifiers in java define who can access classes,methods,varibles and constructors. this helps in enforcing encapsulation,Security.
    * private : only within the same class
    * default : within the same package
    * protected : within the same package and sub classes in other packages
    * public : accesble from anywhere
```
class BankAccount {
    private double balance = 1000;

    public double getBalance() {
        return balance;
    }
}

class Logger { // default access
    void log(String msg) {
        System.out.println("Log: " + msg);
    }
}

class Animal {
    protected void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        makeSound(); // allowed due to protected access
    }
}

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

```
37. what is Wrapper classes in java
    * In Java, wrapper classes are used to convert primitive data types (like int, char, boolean) into objects. This is essential when working with frameworks like Collections, which only work with objects — not primitives.
    * To enable null values (primitives can’t be null, but wrapper objects can)
    * To use utility methods (e.g., Integer.parseInt(), Character.isDigit())
    * - For autoboxing/unboxing (automatic conversion between primitives and objects)
```
Int to INTEGER

boolean Boolean

char Character

byte Byte

short Short

int Integer

long Long

float Float

double Double

int a=20;

Integer i=Integer.valueOf(a);//converting int into Integer

Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

Integer a=new Integer(3);

int i=a.intValue();//converting Integer to int

int j=a;//unboxing, now compiler will write a.intValue() internally

```

37. what is Strictfp?
    * Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable. The precision may differ from platform to platform that is why java programming language have provided the strictfp keyword, so that you get same result on evey platform. So, now you have better control over the floating-point arithmetic.
    * The strictfp keyword can be applied on methods, classes and interfaces.
    * The strictfp keyword cannot be applied on abstract methods, variables or constructors.

38. what is static?
    * The Static Keyword in java is used for memory management mainly. we can apply java static keyword with varibles methods,blocks and nested blocks. The static keyword belongs to the class then instance of the class.
    * The static method cannot use non static data memeber or non static method directly
    * this and super cannot be used in static context
```
class Demo {
    int x = 10;

    static void printX() {
        // System.out.println(x); ❌ Error: Cannot access non-static variable
    }
}
Because x belongs to an object, and printX() belongs to the class — no object context exists


class Demo {
    int x = 5;

    static void show() {
        // System.out.println(this.x); ❌ Error: Cannot use 'this' in static context
    }
}
this and super refer to objects — but static methods don’t have an object context.
* a static block runs only once during the entire lifecycle of the class, and that’s when the class is first loaded into memory by the JVM.

📌 Key Facts About Static Blocks:
- Runs only once — when the class is loaded.
- Executes before the main method or any static methods.
- Used to initialize static variables or run configuration logic.
- Runs even if no object of the class is created — as long as the class is accessed.
- If the class is never used, the static block is never executed.

🧪 Example to Illustrate:
class Demo {
    static {
        System.out.println("🔧 Static block executed!");
    }

    public static void main(String[] args) {
        System.out.println("🚀 Main method executed!");
    }
}


🔍 Output:
🔧 Static block executed!
🚀 Main method executed!


The static block runs once, right before main() — and only once, even if you call the class again later.

```

39. what are String in java?
    * String is nothing but a sequence of chars. in java Strings are objects
    * The java platform provides the string class to create and manipulate strings.
```
 String s =”name” String s1= new String(“abc”)
 
 If we try to create same string using string literal, then the jvm initially search the string pool to check whether the string is already created or not, if created then the newly created reference points to old string, if not created earlier then creates the new string
    
    String s1= “india”; String s2=”india”;
Here s1 & s2 points to same string, it will not create new string as india is already available

S1==s2 true compares the references

S1.equals(s2) true

String s3= new String(“India”);

Now new string is created and new reference s3 points to New value

S1==s3 // false compares the references

S1.equals(s3)// true compares the content

Strings are immutable

An object whose state cannot be changed after it is created is known as an Immutable object. String, Integer, Byte, Short, Float, Double and all other wrapper classes objects are immutable.

String str1 = “abc”;

Str1 = “xyz”;

Syso(str1)// xyx as the reference is changed

Str1.concat(“ind”);

Syso(str1)// xyz as strings are immutable

String str2 =str1.concat(“ind”);

Syso(str2)// xyzind here new string is created

```
40. Concat will create new string object and append will not create new object , it will append the value to old string
41. what is stringbuffer and String builder?
    * String buffer is mutable and ThreadSafe and used in multi threading environemnt
    *  Java StringBuilder class is used to create mutable (modifiable) string. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.
```
public class Demo {
    public static void main(String[] args) {
        // StringBuffer example
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Rocks");
        System.out.println("StringBuffer: " + sbf);

        // StringBuilder example
        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Rules");
        System.out.println("StringBuilder: " + sbd);
    }
}

```
41. how to create immutable class?
    * The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
    * The class is final so we cannot create the subclass.
    * There is no setter methods i.e. we have no option to change the value of the instance variable.

42. Why is String immutable?
    * Strings are mainly used for sensitive data like credentials,api's,data,filepaths etc.
    to prevent tempering of these critical data 
    * java maints a string pool to reuse string literls. shared string must be immutable to prevent accidental changes
    * immutable threds are safe to use across multiple threads without synchronization.
    * class names are passed as String to JVm. if it is mutable it may behave differ at loading
    * - String caches its hashCode() for fast access in hash-based collections like HashMap.
43. what is serialization
    * converting an object into a byte stream
    * reconstructing the object from byte stream
    * serialization is implemented with the marker interface.
    * with Transient keyword you can skip serialization
    * static Fields and constructs are not serialized
    * - Constructors aren’t called during deserialization.
    * - Use serialVersionUID to avoid version mismatch issues:
44. can we call a static method from a non static method and from non static method to static method?
    * You can freely call a static method from a non-static method — because static members belong to the class itself, they’re always available.
    * Because non-static methods belong to an object, you need to create an object first to access them from a static context.
```
class Demo {

    static void greet() {
        System.out.println("Hello from static method");
    }

    void sayHi() {
        greet(); // ✅ Allowed — calling static method from non-static method
    }
}

class Demo {

    void show() {
        System.out.println("Hello from non-static method");
    }

    static void callShow() {
        // show(); ❌ Error — non-static method called from static context

        Demo d = new Demo(); // ✅ Create object
        d.show();            // ✅ Now it's allowed
    }
}

```

45. Can You Override a Static Method in Java?
    * no you cannot overide a stitic method
    * Instead, what happens is called method hiding — not overriding.
    *  Static methods belong to the class, not to instances.
    * Overriding works through runtime polymorphism, which depends on objects.
    * Since static methods are resolved at compile time, they don’t participate in polymorphism.
```
class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet(); // Output: Hello from Parent
    }
}

```

47. can we overload a static method?
    * overloading is allowed for static methods
    * you can have multiple static methods with same name but differ in parameters
    * its resolved at compile time just like overloading with instance methods.
```
class Calculator {
    static void add(int a, int b) {
        System.out.println("Sum of 2 ints: " + (a + b));
    }

    static void add(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("Sum of 3 ints: " + (a + b + c));
    }

    public static void main(String[] args) {
        Calculator.add(2, 3);          // Sum of 2 ints
        Calculator.add(2.5, 3.5);      // Sum of 2 doubles
        Calculator.add(1, 2, 3);       // Sum of 3 ints
    }
```

48. how do i call a constructor defined in a abstract class?
    * - In the subclass constructor, use super() to explicitly call the abstract class constructor.
    * - If you don’t call super(), Java will implicitly call the no-arg constructor (if available).
```
abstract class Animal {
    String type;

    // Constructor in abstract class
    Animal(String type) {
        this.type = type;
        System.out.println("Animal constructor called");
    }

    abstract void sound();
}

class Dog extends Animal {
    Dog() {
        super("Dog"); // ✅ Calls abstract class constructor
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Triggers constructor chain
        a.sound();
    }
}

Animal constructor called
Dog constructor called
Dog barks

```


49. What is constructor chaining?
    * Constructor chaining in Java is the process of calling one constructor from another — either within the same class or from a parent class — to streamline object initialization and reduce code duplication.
    1. within the same class using this Keyword()
```
class Student {
    Student() {
        this("Mohan", 101); // calls the parameterized constructor
        System.out.println("Default constructor");
    }

    Student(String name, int id) {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        new Student();
    }
}

Name: Mohan, ID: 101
Default constructor

```
    * You call the superclass constructor from the subclass using super(...).
```
class Animal {
    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog"); // calls Animal's constructor
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {
        new Dog();
    }
}
Animal type: Dog
Dog constructor
```
50. Can a method in abstract class be both abstract and static? Can it be both abstract and final? Can it be both static and final?
    * abstact + static = no bcoz static methods cannot be overriden
    * abstact + final = no boz final methods cannot be overriden
    * static + final = yes bcoz as static and final cannot be overriden we can use both static and fina both for a method

51. Which is better between abstract class and interface and why?
    * - Use abstract classes for shared structure and partial implementation.
    * - Use interfaces for flexible contracts and multiple capabilities
    * In modern Java (especially post-Java 8), interfaces have become more powerful with default and static methods — but abstract classes still shine when you need constructors, protected members, or shared logic.
52. Access modifiers rules in overiding?
| Superclass Modifier | Allowed in Subclass | Not Allowed in Subclass | 
| private | ❌ Not inherited | — | 
| default | default, protected, public | private | 
| protected | protected, public | default, private | 
| public | public | protected, default, private | 


🔑 Rule: You can make the method more accessible, but not less accessible.

