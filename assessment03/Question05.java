import java.util.Arrays;
import java.util.List;

public class Question05 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,8,9,43,765,345,235,36,8,79,56,25,235,457,78,9,7,346,245,765,75,899,67,435,235,1,547,568,679,90);

        // condition is even or odd

        int cnt = (int) list.stream().filter((e) -> {
            return (e & 1) == 0;
        }).count();

        System.out.println("Number of even numbers: " + cnt);

    }
}
