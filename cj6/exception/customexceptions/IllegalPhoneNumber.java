package exception.customexceptions;

public class IllegalPhoneNumber extends RuntimeException{

    IllegalPhoneNumber(String exceptionMsg) {
        super(exceptionMsg);
    }

    IllegalPhoneNumber() {
        super("The entered phone is invalid...");
    }
}
