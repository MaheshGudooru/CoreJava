package loops;

public class forLoop {
    public static void main(String[] args) {

        System.out.print("using for-each loop: ");
        for(int i : new int[]{1,2,3,4,5,6,7,8,9,0}) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("using for loop: ");
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
