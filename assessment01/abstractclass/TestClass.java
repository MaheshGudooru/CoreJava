package abstractclass;

public class TestClass extends AbstractClass{
    TestClass(String name) {
        super(name);
    }

    @Override
    void isAlive() {
        System.out.println("dead...");
    }

    static void main() {
        TestClass obj = new TestClass("Gandhi");
        obj.isGreat();
        obj.isAlive();
    }
}
