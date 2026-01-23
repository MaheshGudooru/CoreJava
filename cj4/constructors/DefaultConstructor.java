package constructors;


//a default constructor doesn't take any parameters and doesn't even have to be initialized because JVM will takecare of it

// by default constructors are public and there is no return type for a constructor

public class DefaultConstructor {
    DefaultConstructor() {
        System.out.println("Default constructor");
    }

    static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
    }
}
