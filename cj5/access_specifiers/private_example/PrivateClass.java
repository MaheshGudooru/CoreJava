package access_specifiers.private_example;

// private are accessible only within the class that declared them
// class-level scope

public class PrivateClass {
    
    private String name;
    private int ID;
    
    private PrivateClass(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    
    private void printSomething() {
        System.out.println("printing something...");
    }

    static void main() {
        PrivateClass obj = new PrivateClass("abcdef", 246801);
        obj.printSomething();

    }
}
