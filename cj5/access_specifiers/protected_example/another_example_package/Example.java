package access_specifiers.protected_example.another_example_package;

import access_specifiers.protected_example.example_package.ProtectedClass;

public class Example {

    public void userMethod() {

//        new ProtectedClass().doSomething(); // This won't work since we are inside a different package and we are not the subclass of the "ProtectedClass"
    }

}

