package exception.customexceptions;

public class CheckPhoneNumber {


    public void isValid(String phno) {

        if (phno.replace (" ", "").length () != 10) {
            throw new IllegalPhoneNumber ();
        }

        System.out.println (phno + " is a valid phone number!!");
    }

    public static void main(String[] args) {

        CheckPhoneNumber obj = new CheckPhoneNumber ();

        try {

            obj.isValid ("555 555 5555");
            obj.isValid ("5555555555");
            obj.isValid ("555");

        } catch (IllegalPhoneNumber e) {
            System.err.println (e);
        }

    }

}
