package methodoverloadingnriding.overridding;

public class Child extends Parent{

    public void doSomething() {
        System.out.println("child overridden this method");
        super.doSomething(); // called the actual method in the parent class
    }

    static void main() {
        Child c01 = new Child();
        c01.doSomething();
    }
}
