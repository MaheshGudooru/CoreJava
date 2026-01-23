package binding;

// Dynamic binding can be achieved by implementing Overriding(method call is resolved during runtime)

public class Child extends Parent {

    @Override
    public void doSomething() {
        System.out.println("Child class is doing something!!");
    }

    static void main() {

        Parent b = new Child();
// (Reference type)    (Object type)
        b.doSomething(); // This is dynamic binding since the method call is resolved during run-time because the reference type and object type are different

    }

}
