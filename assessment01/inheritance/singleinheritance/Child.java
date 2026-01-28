package inheritance.singleinheritance;

public class Child extends Parent{

    public void doSomethingChild() {
        System.out.println("child is doing something....");
    }

    public void doSomething() {
        System.out.println("child overridden this method");
        super.doSomething();
    }


    static void main() {
        new Child().doSomethingChild();
        new Child().doSomething(); // child class has access to this method

    }

}
