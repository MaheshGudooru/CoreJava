package access_specifiers.protected_example.another_example_package;

import access_specifiers.protected_example.example_package.ProtectedClass;

public class AnotherExample extends ProtectedClass{

    public void userMethod() {
        ProtectedClass obj = new ProtectedClass(); // this too won't work since you cannot call the protected method
        // directly with plain obj of the parent class
//        obj.doSomething();
        obj.printSomething();

        ProtectedClass obj01 = new AnotherExample();
//        obj01.doSomething(); // this will also won't work
        this.doSomething(); // this will work since protected methods can only be called as self methods of the subclass
    }

    static void main() {
        new AnotherExample().doSomething(); // this will work
        AnotherExample obj = new AnotherExample();
        obj.doSomething(); // this will also work
    }

}
