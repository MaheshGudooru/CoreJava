package fileoperations.filecreation;

// File class just represents the file or directory or a path to a file, not for reading or writing content to it.
// reading and writing have separate classes that uses File class to access the file

import java.io.File;
import java.io.IOException;

public class FileClass {

    static void main(String[] args) throws IOException {

        File file = new File ("cj6\\fileoperations\\example.txt");

        try {
            if (file.createNewFile ()) {
                System.out.println ("file created"); // returns true if file is created or false if file already exists
            } else {
                System.out.println ("file already exists");
            }
        } catch (IOException e) {
            System.err.println (e);
        }

        if (file.exists ()) {

            System.out.println ("can read the file => " + file.canRead ()); // returns the file read access
            System.out.println ("can write to the file => " + file.canWrite ()); // returns the file write access true if it can be written otherwise false
            System.out.println (file.getName ()); // returns the name of the file
            System.out.println (file.getAbsolutePath ()); // returns the absolute path to the file
            System.out.println (file.getPath ()); // returns the relative path to the file with respect to the project folder
            System.out.println (file.getFreeSpace ()); // returns the number of unallocated bytes not guaranteed to be accurate
            System.out.println ("file deleted => " + file.delete ()); // returns true if file is deleted successfully otherwise false
            System.out.println ("file type => " + file.getCanonicalFile ().getCanonicalPath ());
            System.out.println ("file directly set to readonly" + file.setReadOnly ());
            System.out.println ("file set to readonly => " + file.setReadable (true)); // sets the read permission for the file
            System.out.println ("given write permissions to file => " + file.setWritable (true)); // sets the write permissions for the file

        }

    }
}
