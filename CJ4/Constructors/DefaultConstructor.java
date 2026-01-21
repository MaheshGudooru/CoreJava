package Constructors;


//a default constructor doesn't take any parameters and doesn't even have to be initialized because JVM will takecare of it

// by default constructors are public

public class DefaultConstructor {
    DefaultConstructor() {
        System.out.println("Default constructor");
    }

    static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
    }
}
