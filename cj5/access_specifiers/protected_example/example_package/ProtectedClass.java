package access_specifiers.protected_example.example_package;

// protected methods are accessible inside the same package and can be accessed outside
// of the package through a subclass that extends the class of the protected method
// note: can only be accessed through child class object no through plain parent class object inside the child class

public class ProtectedClass {

    protected void doSomething() {
        System.out.println("doing something since I am a protected method!!");
    }
    
    public void printSomething() {
        System.out.println("printing this statement");
    }
    
}
