import java.util.*;

public class Question08 {
    public static void main(String[] args) {

        List<List<String>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for (List<String> l : list) {
            l.add("mahesh");
            l.add("mahesh");
            l.add("rakesh");
            l.add("ganesh");
            l.add("shivaram");
        }

        System.out.println(list);

//        output: [[mahesh, mahesh, rakesh, ganesh, shivaram],
//                  [mahesh, mahesh, rakesh, ganesh, shivaram],
//                  [mahesh, mahesh, rakesh, ganesh, shivaram],
//                  [mahesh, mahesh, rakesh, ganesh, shivaram]
//                ]




        Set<String> set = new HashSet<>();

        list.stream().flatMap(listItem -> listItem.stream()).filter((e) -> {

            if (set.contains(e)) {
                return false;
            }
            set.add(e);
            return true;

        }).forEach(e -> System.out.println(e));

//        output:
//              mahesh
//              rakesh
//              ganesh
//              shivaram



    }
}
