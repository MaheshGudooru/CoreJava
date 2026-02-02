package serializationndeserialization;

import java.io.*;

public class Serialization { // converting object to bytes

    public static void main(String[] args) {


        try (ObjectOutputStream ois = new ObjectOutputStream (new FileOutputStream ("assessment02/serializationndeserialization/file.txt"))) {

            ois.writeObject (new Person ("Mahesh", 21));

        } catch (IOException e) {
            System.err.println (e);
        }

    }
}
