import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        String name;
        try(Scanner sc = new Scanner(System.in)) { // This automatically release the memory after execution so no "sc.close();"

            System.out.println("Enter your name: ");
            name = sc.nextLine();

            if("Mahesh".equals(name)) {
                System.out.println("Your are the new intern named mahesh!");
            } else {
                System.out.println("Your are the new intern named mahesh!");
            }

        } catch(Exception e) {

            System.err.println("Ooops! something went wrong");

        }

        System.out.println("But how did you found TechOuts?");
    }
}