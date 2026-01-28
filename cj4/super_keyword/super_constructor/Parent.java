package super_keyword.super_constructor;


public class Parent {

    String name;
    int children;

    Parent(String name, int children) {

        this.name = name;
        this.children = children;

        System.out.println("I am " + this.name + " and I have " + this.children + " children");
    }

    public void callMe() {
        System.out.println("I am parent");
    }

}
