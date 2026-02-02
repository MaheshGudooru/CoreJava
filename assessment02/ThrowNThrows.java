public class ThrowNThrows {

    public void thisThrowException() throws ArithmeticException{ // throws is used at method signature and does not handle the exception but informs that this method might throw this type of exception
        int i = 10 / 0;
    }

    public static void main(String[] args) {

        String s = "";
        try{
            if(s.isEmpty ()) {
                throw new Exception ("empty string exception"); // throw is used when you want to throw the actual exception
            }
        } catch (Exception e) {
            System.err.println (e);
        }

        try{
            new ThrowNThrows ().thisThrowException (); // the caller method must handle the exception
        } catch (ArithmeticException e) {
            System.err.println (e);
        }

    }

}
