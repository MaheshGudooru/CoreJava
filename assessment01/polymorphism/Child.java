package polymorphism;

public class Child extends Parent {

    public void doSomethingChild() {
        System.out.println("child is doing something....");
    }

    public void doSomething() {
        System.out.println("child overridden this method");
    }


    static void main() {

        Parent p = new Child();
        p.doSomething(); // this is run-time polymorphism since the method call is resolved during run-time

        Child c = new Child();
        c.doSomething(); // this is compiled time polymorphism since the method call is resolved during compilation

    }

}
