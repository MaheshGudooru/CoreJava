package JumpStatements;

public class AdvancedJump {
    static void main(String[] args) {

        System.out.println("Start");
        OUTERLOOP:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 2 && j == 2){
                    System.out.println("Break!");
                    break OUTERLOOP;
                }

                if(i == 1 && j == 0) {
                    System.out.println("Skipped!");
                    continue OUTERLOOP;
                }

                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
