public class ReverseOfAString {

    static void main() {
        String str = "techouts";
        char ch[] = str.toCharArray();
        String res = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            res += ch[i];
        }

        System.out.println(res);

    }
}
