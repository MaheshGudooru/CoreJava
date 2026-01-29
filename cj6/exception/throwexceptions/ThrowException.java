package exception.throwexceptions;

public class ThrowException {

    public void exceptionThrowMethod(int[] arr, int idx) throws Exception { // this is only necessary if it is a compile time exception not for runtime exceptions

        if (!(idx >= 0 && idx < arr.length)) {
            throw new Exception ("The given index exceeds the array length..");
        }

        System.out.println (arr[idx]);
    }

    public static void main(String[] args) {
        try {
            new ThrowException ().exceptionThrowMethod (new int[]{1, 2, 3}, 5);
        } catch (Exception e) {
            System.err.println (e);
        }
    }

}
