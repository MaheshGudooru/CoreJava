import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CntNumberofLines {

    public static void main(String[] args) {

        int cntWords = 0;
        int cntLines = 0;

        try(BufferedReader br = new BufferedReader (new FileReader ("assessment02/example01.txt"))) {

            String s;
            while((s = br.readLine ()) != null) {
                cntWords += s.split (" ").length;
                cntLines++;
            }

            System.out.println ("Number of words: " + cntWords);
            System.out.println ("Number of lines: " + cntLines);

        } catch (IOException e) {
            System.err.println (e);
        }

    }
}
