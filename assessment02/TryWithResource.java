import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new FileReader ("assessment02/example01.txt"))) { // try-with-resource
            // automatically releases the resources once the execution is complete

            String s;
            while((s = br.readLine ()) != null) {
                System.out.println (s);
            }

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
