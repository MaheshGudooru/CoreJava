package binding;

// Binding refers to the process of connecting method call to the appropriate method body (implementation)



public class Parent {

    public void doSomething() {
        System.out.println("parent class is doing something!!");
    }


    public void doSomething(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void doSomething(String str1, String str2) {
        System.out.println(str1 + " " + str2);
    }


    static void main() {

        Parent p = new Parent();
// (Reference type)    (Object type)
        p.doSomething(); // This is static binding since the method call is resolved during compile-time because the reference type and object type are same
        p.doSomething("Intern", "Mahesh");
        p.doSomething(45, 65);
    }


}
