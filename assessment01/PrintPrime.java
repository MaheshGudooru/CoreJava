public class PrintPrime {

    static void main() {

        for(int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break ;

                }
            }
            if(!isPrime) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
