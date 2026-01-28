package methodoverloadingnriding;

public class Overloading {

    public void doSomething() {
        System.out.println("doing something...");
    }

    public void doSomething(String s) {
        System.out.println("print string \"" + s + "\"");
    }

    public void doSomething(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    static void main() {
        Overloading obj = new Overloading();

        obj.doSomething();
        obj.doSomething("TechOuts");
        obj.doSomething(3,6);
    }

}
