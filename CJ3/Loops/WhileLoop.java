package Loops;

import java.util.Scanner;

public class WhileLoop {
    static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int i = 100;
            while (true) {
                System.out.print("Enter a random number: ");
                i = s.nextInt();

                if (i < 10) {
                    System.out.println("your have entered a number that is less than 10");
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

