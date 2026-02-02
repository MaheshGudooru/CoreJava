import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    public static void main(String[] args) {

        Path path01 = Paths.get ("assessment02/example01.txt");
        Path path02 = Paths.get ("assessment02/example02.txt");

        try {
            Files.createFile (path02);
            Files.copy (path01, path02, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
