class myException extends Exception {

    myException(String msg) {
        super(msg);
    }

    myException() {
        super("This exception is not defined by the user!!");
    }
}


public class CustomException {

    public static void main(String[] args) throws myException {
        int i = 10;
        try{
            if(i == 10) {
                throw new myException ();
            }
        } catch (myException e) {
            System.err.println (e);
        }

    }

}
