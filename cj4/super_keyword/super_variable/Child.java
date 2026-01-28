package super_keyword.super_variable;

// The main purpose of super keyword is to resolve ambiguity issues between child and parent class
// sometimes you might want to access parent class members or methods that has been overridden by the child class; In such scenarios we use super keyword

public class Child extends Parent{

    String name = "Mahesh";

    Child() {
        System.out.println("Child constructor running!!");
        super(); // this will tell JVM to execute the parent constructor after the execution of the above statement.
        // by default JVM creates a default constructor and automatically places a super() statement as the first statement in the child class constructor
        // this was a strict practice before java 25
    }

    public void callMe() {
        System.out.println("I am " + name);
    }

    public void callMyParent() {
        System.out.println("My parent is " + super.name); // since we have two members named "name" in both parent and child to avoid ambiguity we use super to refer to the parent member
    }

    static void main() {
        Child mahesh = new Child();
        mahesh.callMe();
        mahesh.callMyParent();
    }

}
