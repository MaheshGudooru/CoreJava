

public class CheckZeroPositveNegative {

    static void main() {

        int a = 0;

        if(a > 0) {
            System.out.println("Number is positive");
        } else {
            if(a == 0) {
                System.out.println("Number is zero");
            } else {
                System.out.println("Number is negative");
            }
        }

    }
}
