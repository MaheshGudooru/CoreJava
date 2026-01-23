package interfaces.interface_example;


// A Company must have a branch, website and employee (i.e., implementation)

// can only have abstract methods (by default every method is public abstract)
// cannot have constructors or fields but can have constant (public static final)
// cannot have initialization block
// cannot create be instantiated
// can have public, private(Java 9+), default(Java 8+), static(Java 8+) and abstract methods


public interface Company {

    String NAME = "company";// This is "public static final" by default inside interfaces so NAME is not an instance variable

    private String returnCompany() {
        return NAME;
    }  // we use private methods in interfaces for internal utilization like in the printName() method

    default void printName() {
        System.out.println(returnCompany());
    }

    static void helper() {
        System.out.println("Static method inside interface is Running.....");
    }

    abstract void branch();  // This is implicitly "public abstract" so adding abstract keyword does not change anything

    void website();
    void employee();

}
