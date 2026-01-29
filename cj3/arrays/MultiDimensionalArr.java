package arrays;

public class MultiDimensionalArr {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 6},
                {3, 5, 7, 2},
                {9, 6, 5, 34}
        };

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


}
