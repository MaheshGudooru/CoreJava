package super_keyword_usage;

public class Child extends Parent{

    Child(String name, int age) {
        super(name, age); // calling Parent constructor
    }

    static void main() {
        Child c01 = new Child("acb", 5);
        System.out.println(c01.name);
        System.out.println(c01.age);
    }
}
