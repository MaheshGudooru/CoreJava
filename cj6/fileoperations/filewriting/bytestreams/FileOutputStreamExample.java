package fileoperations.filewriting.bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// used for raw data writing to files
//

public class FileOutputStreamExample {

    static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt")) {

            // writing byte by byte
            fos.write ((byte)'m');
            fos.write ((byte)'a');
            fos.write ((byte)'h');
            fos.write ((byte)'e');      // using explicit type conversion
            fos.write ((byte)'s');
            fos.write ((byte)'h');


        } catch(IOException e) {
            System.err.println (e);
        }

        try(BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt"))) { // internally uses FileOutputStream

            bos.write (new byte[] {(byte)'m', (byte)'a', (byte)'h', (byte)'e', (byte)'s', (byte)'h'}); // write data at once, so less IO calls

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
