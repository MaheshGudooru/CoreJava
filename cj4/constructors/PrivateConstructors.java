package constructors;

// used to restrict the creation of multiple instances for a class
// used in utilities only if the class contains static methods and members

public class PrivateConstructors {

    private PrivateConstructors() {
        System.out.println("This is private and if you try to create an object I will throw an error");
    }
}

class Test {
    public static void main(String[] args) {
//        PrivateConstructors obj = new PrivateConstructors(); // this line will throw the error
    }
}
