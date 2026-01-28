package super_keyword.super_method;

public class Child extends Parent{

    @Override
    public void callMe() {

        System.out.println("I am the child class");

    }

    public void callParent() {
        super.callMe();
    }


    static void main() {
        Child childObj = new Child();

        childObj.callMe();
        childObj.callParent();
    }

}
