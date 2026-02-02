import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

    public static void main(String[] args) {

        File file = new File ("assessment02\\example01.txt");


        try (FileWriter fw = new FileWriter (file)) {

            file.createNewFile ();
            String str = """
                        public static void main(String[] args) {
                            try(FileWriter fw = new FileWriter (new File ("assessment02"))){
                    
                                fw.write ();
                            } catch (IOException e) {
                                System.err.println (e);
                            }
                        }
                    """;

            fw.write (str);
        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
