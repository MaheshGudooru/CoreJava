package abstractclass;

public abstract class AbstractClass {

    String name;

    AbstractClass(String name) {
        this.name = name;
    }

    public void isGreat() {
        System.out.println("yes great!!");
    }


    abstract void isAlive();
}
