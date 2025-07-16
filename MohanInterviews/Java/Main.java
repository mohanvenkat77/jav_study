
import java.util.function.Predicate;

class Parent {
    public static void main(String[] args) {
        System.out.println("Parent main()");
        Predicate.isEqual("Mohan");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        System.out.println("Child main()");
    }
}
