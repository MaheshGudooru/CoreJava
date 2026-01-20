package JumpStatements;

public class BreakStatement {
    static void main(String[] args) {

        System.out.println("below numbers are less than 10");

        for(int i = 0; i <= 100; i++) {
            if(i >= 10) break;
            System.out.print(i + (i < 9 ? ", " : "")); // the ternary condition is used to handling the last ending comma
        }
    }
}
