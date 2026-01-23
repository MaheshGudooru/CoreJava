package final_keyword;

// final class cannot be extended
public final class FinalClass {
    // final variable - once assigned the value cannot be changed (becomes immutable)
    public final double PI = 3.14;

    public final void doSomething() { // final methods cannot be overridden but can be overloaded as below
        System.out.println("doing something......");
    }

    public void doSomething(String s) {
        System.out.println("the string is " + s);
    }

    static void main() {

        FinalClass obj = new FinalClass();

        System.out.println(obj.PI);

//        obj.PI = 69; // this will work since PI is a final member of the class so essentially it is immutable

        obj.doSomething();
        obj.doSomething("String");
    }

}

//class Test extends FinalClass { // This will not work since class is final
//
//    public void doSomething() { // This will not work since doSomething is final so it cannot be overridden
//        System.out.println("doing new things....");
//    }
//}
