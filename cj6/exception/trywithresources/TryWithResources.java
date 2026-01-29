package exception.trywithresources;

// try-with-resources is a java 7+ feature which automatically calls close() on the classes resources that implement AutoCloseable interface
// ex Scanner, InputStream, OutputStream etc....

import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) { // this will automatically call sc.close() irrespective of the exception occurrence. releases resources held by objects like memory, files access etc...
            System.out.println("Enter anything: ");
            String str = sc.next();

            System.out.println(str);

        } catch (Exception e) {
            System.err.println(e);
        } finally{
            System.out.println("completed execution!!!");
        }
    }
}
