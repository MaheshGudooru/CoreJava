package super_keyword.super_constructor;

public class Child extends Parent{

    Child() {

        super("Parent", 3); // parameterized super keyword passes the parameters to the parameterized parent constructor

        System.out.println("Child constructor is running!!");


    }

    static void main() {
        Child mahesh = new Child();

    }
}
