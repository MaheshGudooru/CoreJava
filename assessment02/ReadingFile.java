import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new FileReader ("assessment02/example01.txt"))) {

            String s;
            while((s = br.readLine ()) != null) {
                System.out.println (s);
            }

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
