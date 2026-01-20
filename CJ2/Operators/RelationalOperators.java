import java.util.Scanner;

public class RelationalOperators {

    public static void main() {
        int a, b;

        try (Scanner s = new Scanner(System.in)) {

            System.out.println("Enter the value of A: ");
            a = s.nextInt();
            System.out.println("Enter the value of B: ");
            b = s.nextInt();
            System.out.println("a > b is " + (a > b));
            System.out.println("a < b is " + (a < b));
            System.out.println("a >= b is " + (a >= b));
            System.out.println("a <= b is " + (a <= b));
            System.out.println("a == b is " + (a == b));
            System.out.println("a != b is " + (a != b));

        } catch (RuntimeException e) {
            System.err.println(e);
        }


    }
}
