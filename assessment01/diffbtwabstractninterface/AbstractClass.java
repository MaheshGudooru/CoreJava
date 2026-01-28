package diffbtwabstractninterface;

public abstract class AbstractClass {

    // can have constructors
    // can have instance variables and can have final variables
    // can have concrete methods along with abstract methods

    String name;

    AbstractClass(String name) {
        this.name = name;
    }

    public void isGreat() {
        System.out.println("yes great!!");
    }


    abstract void isAlive();
}
