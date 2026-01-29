package exception.exception_handling;

// checked exception are compile time exception that the compiler forces us to handle. if these exceptions are not handle the program won't compile
// unchecked exception are runtime exceptions that occur during the program execution. they can be caught but not a necessity. when these exceptions occur the program execution is stopped

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            new FileWriter("xyz.txt"); // this will give "unreported exception java.io.IOException; must be caught or declared to be thrown" without try-catch(checked)
        } catch (IOException e) {
            System.err.println(e);
        }

        int a = 10 / 0; // This will compile correct but exception occurs during runtime when program is executing(unchecked)
    }
}
