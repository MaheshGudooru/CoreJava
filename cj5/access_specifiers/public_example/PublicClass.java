package access_specifiers.public_example;

public class PublicClass {

    public void doSomething() {
        System.out.println("doing something inside the public class!!");
    }

    static void main() {
        new PublicClass().doSomething(); // this method can be accessible through the Core Java project anywhere
    }

}
