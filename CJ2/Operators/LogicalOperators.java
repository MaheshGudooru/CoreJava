package Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 10;
        String b = "mahesh";

        System.out.println(a == 10 && "mahesh".equals(b)); // both has to be true
        System.out.println(a == 10 || "mahesh".equals(b)); // if a==10 is true then the second condition is not checked
        System.out.println(!(a == 10 && "mahesh".equals(b))); // not of true is false

    }
}
