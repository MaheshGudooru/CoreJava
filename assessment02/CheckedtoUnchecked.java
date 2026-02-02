import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedtoUnchecked {

    public void throwMethodException() throws Exception { // checked exception
        FileWriter fw = new FileWriter (new File (""));

    }


    public static void main(String[] args) {

        CheckedtoUnchecked obj = new CheckedtoUnchecked ();

        try{
            obj.throwMethodException ();
        } catch (Exception e) {
//            throw new IOException ();
            throw new RuntimeException (); // unchecked exception
        }

    }
}
