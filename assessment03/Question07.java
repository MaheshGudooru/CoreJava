import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question07 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,8,9,43,765,345,235,36,8,79,56,25,235,457,78,9,7,346,245,765,75,899,67,435,235,1,547,568,679,90);
        Optional<Integer> minRes = nums.stream().min((o1, o2) -> o1 - o2);
        Optional<Integer> maxRes = nums.stream().max((o1, o2) -> o1 - o2);

        // I don't about Optional yet but the IDE corrected me when I was using Interger instead

        System.out.println(minRes);
        System.out.println(maxRes);
    }
}
