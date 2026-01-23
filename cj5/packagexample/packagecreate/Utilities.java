package packagexample.packagecreate;

// Packages enable us to write reusable code, avoid naming conflicts and make code more readable and maintainable


public class Utilities {
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public String concatenate(String s1, String s2) {
        return s1 + s2;
    }

    public int asciiAddition(String s) {
        char[] ch = s.toCharArray();
        int res = 0;
        if(s.isBlank()) {
            return -1;
        }

        for(char c : ch) {
            res += (int) c;
        }

        return res;
    }

}
