public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try{
            int k = 0 / 0;
        } catch (ArithmeticException e) {
            System.err.println (e);
        } catch (RuntimeException e) {
            System.err.println (e);
        } catch (Exception e) {
            System.out.println (e);
        }
    }

    // we always get "java.lang.ArithmeticException: / by zero" exception since it is the first catch block after the try block, and it fits the exception type
}
