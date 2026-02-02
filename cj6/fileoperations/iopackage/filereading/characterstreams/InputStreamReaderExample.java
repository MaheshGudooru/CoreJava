package fileoperations.iopackage.filereading.characterstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamWriterExample {

    public static void main(String[] args) {

        try(InputStreamReader isr = new InputStreamReader (new FileInputStream ("cj6\\fileoperations\\examplefolder\\example.txt"))) {

            int b;
            while((b = isr.read ()) != -1) {
                System.out.print ((char)b);
            }

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
