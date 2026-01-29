package exception.exception_handling;

public class MultiCatch {

    public static void main(String[] args) {
        try{
            int a = 1 / 0; // the try block execution stops here at the very first statement that caused the exception. the execution moves to catch block then onto finally block
            System.out.println(new int[]{}[0]);
            String str = null;
        } catch(ArithmeticException | IndexOutOfBoundsException | NullPointerException e) { // from Java 7+
            System.err.println(e);
        }
    }

}
