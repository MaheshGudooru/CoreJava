package exception.trywithresources;

public class Example implements AutoCloseable {

    public void doSomething() {
        System.out.println("doing something....");
    }


    @Override
    public void close() throws Exception {
        System.out.println("implicitly called code that releases the resources...");
    }
}

class Test {
    public static void main(String[] args) {

        try (Example ex = new Example()) {

            ex.doSomething();
            int i = 0 / 0;
            System.out.println("this won't print since the above statement will give an exception");

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
