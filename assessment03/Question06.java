import java.util.Arrays;
import java.util.List;

public class Question06 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        List<Integer> squareNums = nums.stream().map((e) -> e * e).toList();
        System.out.println(squareNums);

//        output:
//                [1, 4, 9, 16, 25, 36, 49, 64, 81, 0]

    }
}
