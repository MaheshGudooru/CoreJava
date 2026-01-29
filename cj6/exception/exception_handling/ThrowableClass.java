package exception.exception_handling;


public class ThrowableClass {


    public static void main(String[] args) {


        try {
            int a = 10 / 0; // here we are immediately handling the exception

        } catch (Throwable e) {
            System.err.println(e);
        }


    }
}
