import java.util.PriorityQueue;

public class Question01 {



    public static void main(String[] args) {

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        q.add(new int[]{9,4});
        q.add(new int[]{8,5});
        q.add(new int[]{7,6});
        q.add(new int[]{6,7});
        q.add(new int[]{5,8});
        q.add(new int[]{4,9});


        q.forEach((ele) -> System.out.println("[" + ele[0] + " " + ele[1] + "]"));


//        output:
//            [4 9]
//            [6 7]
//            [5 8]
//            [9 4]
//            [7 6]
//            [8 5]

    }
}
