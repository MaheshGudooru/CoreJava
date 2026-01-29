package exception.throwexceptions;

public class ThrowsException {

    public void mightThrowException() throws IndexOutOfBoundsException { // here we are throwing the exception without handling it. we are just telling that this method might throw an exception.
        // we are throwing the exception to the caller
        // so that caller method can handle it by itself

        int arr[] = new int[1];
        System.out.println (arr[1]);

    }

    public static void main(String[] args) {
        ThrowsException obj = new ThrowsException ();

        try {
            obj.mightThrowException (); // throws an exception here towards the caller method (i.e., the main method) which is handling the exception using try-catch
        } catch (IndexOutOfBoundsException e) {
            System.err.println (e);
        }
    }

}
