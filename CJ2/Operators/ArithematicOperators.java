package Operators;

import java.util.Scanner;

public class ArithematicOperators {
    public static void main(String[] args) {
        int a, b;

        try(Scanner s = new Scanner(System.in)) {

            System.out.println("Enter the value of a: ");
            a = s.nextInt();

            System.out.println("Enter the value of b: ");
            b = s.nextInt();

            System.out.printf("(Addition)A + B = %d\n", a + b);
            System.out.printf("(Subtraction)A - B = %d\n", a - b);
            System.out.printf("(Multiplication)A * B = %d\n", a * b);
            try{
                System.out.printf("(Division)A / B = %d\n", a / b);
            } catch(Exception e) {
                System.err.println(e);
            }
            System.out.printf("(Remainder after division)A MOD B = %d\n", a % b);
        } catch(Exception e) {
            System.err.println("Error => " + e);
        }

    }
}