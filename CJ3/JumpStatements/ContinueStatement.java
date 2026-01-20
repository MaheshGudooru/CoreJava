package JumpStatements;

public class ContinueStatement {
    static void main(String[] args) {
        System.out.println("even numbers upto 20");

        for (int i = 0; i <= 20; i++) {
            if((i & 1) == 1) {  // i.e., odd since LSB is set bit
                continue;
            }

            System.out.print(i + (i != 20 ? ", " : ""));
        }
    }
}
