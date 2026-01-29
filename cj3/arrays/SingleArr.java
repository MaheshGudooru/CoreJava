package arrays;

public class SingleArr {
    public static void main(String[] args) {
        int[] squares  = new int[10];
        for(int i = 0; i < squares.length; i++) {
            squares[i] = Math.powExact(i + 1, 2);
        }

        for(int i : squares) {
            System.out.print(i + " ");
        }
    }
}
