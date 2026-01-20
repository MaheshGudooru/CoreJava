package Switch;

import java.util.Scanner;

public class AdvancedSwitch {
    static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            boolean runLoop = true;
            while (runLoop) {
                System.out.print("Enter the command: ");
                String cmd = s.nextLine();
                switch (cmd.toLowerCase()) {
                    case "clear" -> System.out.println("Date is cleared");
                    case "exit" -> {
                        System.out.println("Program terminated!");
                        runLoop = false;
                    }
                    case "update" -> System.out.println("program is updated");
                    default -> System.out.println("Does not match any known command");
                }
            }

        } catch (RuntimeException e) {
            System.err.println(e);
        }
    }
}
