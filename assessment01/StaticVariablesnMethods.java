public class StaticVariablesnMethods {

    public static final double PI = 3.14;

    public static void doSomething() {
        System.out.println("doing something inside static method...");
    }

    static void main() {
        System.out.println(StaticVariablesnMethods.PI);
        StaticVariablesnMethods.doSomething(); // no obj creation is necessary
    }

}
