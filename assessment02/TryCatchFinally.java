public class TryCatchFinally {


    public static void main(String[] args) {
        try{
            int i = 10/0; // risky code that might throw an unchecked exception
            System.out.println ("This will never print since the above statement always throws an exception");
        } catch (RuntimeException e) {
            System.err.println (e); // exception occurred in the try block so this statement executes
        } finally {
            System.out.println ("This executes even when the exception is thrown"); // this statement executes irrespective of the occurrence of the exception
        }

        try{
            int i = 10;
        } catch (RuntimeException e) {
            System.err.println (e);
        } finally {
            System.out.println ("This executes even when the exception is not thrown");
        }
    }
}
