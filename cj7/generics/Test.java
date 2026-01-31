package generics;

public class Test {

    public static void main(String[] args) {

        GenericClass<String, String> g = new GenericClass<> ("mahesh", "intern");
        g.printDetails ();

    }
}
