package static_keyword;

public class StaticVar {

    public static final double PI = 3.14; // used final so that PI value becomes immutable

    public void displayPI() {
        System.out.println("PI value is " + PI);
    }

    public static void main(String[] args) {

        StaticVar obj01 = new StaticVar();               //   PI
        obj01.displayPI();                              //    /\
                                                       //    /  \
        StaticVar obj02 = new StaticVar();            // obj01  obj02
        obj02.displayPI();

        //      OR simply use the class name instead

        System.out.println(StaticVar.PI);
    }
}
