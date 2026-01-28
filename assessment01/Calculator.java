import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public void calc(int a, int b, String operation) {

        switch (operation) {
            case "add" -> {
                System.out.println(a + "+" + b + " = " + (a + b));
            }
            case "sub" -> {
                System.out.println(a + "-" + b + " = " + (a - b));
            }
            case "multi" -> {
                System.out.println(a + "*" + b + " = " + (a * b));
            }
            case "div" -> {
                System.out.println(a + "/" + b + " = " + (a / b));
            }
            default -> System.err.println("cannot recognize the command!!");
        }
    }

    static void main() {

        Calculator obj = new Calculator();
        int a, b;
        String operation;
        try(Scanner s = new Scanner(System.in)) {

            System.out.println("Commands");
            System.out.println("addition - add");
            System.out.println("subtraction - sub");
            System.out.println("multiplication - mul");
            System.out.println("division - div");
            System.out.println();

            System.out.print("Enter the value for a: ");
            a = s.nextInt();
            System.out.print("Enter the value for b: ");
            b = s.nextInt();
            System.out.print("Enter the operation: ");
            operation = s.next();
            obj.calc(a, b, operation);

        } catch (Exception e) {
            System.err.println(e);
        }


    }
}
