package fileoperations.filecreation;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    static void main(String[] args) {


        try{

            if(new File("cj6\\fileoperations\\examplefolder").mkdir ()) { // mkdir() creates a directory
                System.out.println ("folder created successfully");
            } else {
                System.out.println ("folder was not created may be the folder already exists");
            }


            if(new File ("cj6\\fileoperations\\examplefolder\\example01").mkdirs ()){ // mkdirs() creates nested directories, returns true only if the necessary parent folders were created
                System.out.println ("nested folders created successfully..");
            } else {
                System.out.println ("folders may already be existing or there was an error!!");
            }


            if(new File ("cj6\\fileoperations\\examplefolder\\example01\\example.txt").createNewFile ()) { // creates a file in the specified file path
                System.out.println ("file created!!");
            } else {
                System.out.println ("file already exists..");
            }



        } catch(IOException e) {

            System.err.println (e);

        }


    }
}
