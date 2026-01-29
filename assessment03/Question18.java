import java.util.Arrays;
import java.util.List;

public class Question18 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,4,8,9,43,765,345,235,36,8,79,56,25,235,457,78,9,7,346,245,765,75,899,67,435,235,1,547,568,679,90);

        System.out.println("Are all elements in the list are even numbers: " + nums.stream().allMatch((e) -> (e & 1) == 0));


    }
}
