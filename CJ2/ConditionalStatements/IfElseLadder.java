package ConditionalStatements;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {

        String name;
        try(Scanner sc = new Scanner(System.in)) { // This automatically release the memory after execution so no "sc.close();"

            System.out.println("Enter your name: ");
            name = sc.nextLine().toLowerCase();

            if("mahesh".equals(name)) {

                System.out.println("Your are the new intern named mahesh!");

            } else {

                if("shivaram".equals(name))
                    System.out.println("Your are the new intern named shivaram!");
                else 
                    if("rakesh".equals(name))
                        System.out.println("Your are not the new intern but we recognize you");
                    else 
                        System.out.println("we don't have your details!");    
            
            }

        } catch(Exception e) {

            System.err.println("Ooops! something went wrong");

        }

        System.out.println("But how did you found TechOuts?");
    }
}