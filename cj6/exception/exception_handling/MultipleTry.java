package exception.exception_handling;

import java.io.File;

public class MultipleTry {

    public static void main(String[] args) {

        try{
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }

        try{
            System.out.println(new int[]{3, 6, 8, 9, 6}[8]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }

        try{
            int[] a = null;
            System.out.println(a[2]);
        } catch (NullPointerException e) {
            System.err.println(e);
        }

        System.out.println("program completed...");
    }
}
