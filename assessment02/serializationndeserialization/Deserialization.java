package serializationndeserialization;

import fileoperations.iopackage.filewriting.bytestreams.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization { // retrieving object from the bytes

    static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream ("assessment02/serializationndeserialization/file.txt"))) {

            while (true) {
                Person person = (Person) ois.readObject ();
                System.out.println (person.name);
                System.out.println (person.age);

                System.out.println ();
            }

        } catch (IOException e) {
            System.err.println (e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException (e);
        }
    }

}
